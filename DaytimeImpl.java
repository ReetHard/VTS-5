import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalTime;

public class DaytimeImpl extends UnicastRemoteObject implements Daytime {

    public DaytimeImpl()throws  RemoteException{
        super();
    }

    @Override
    public String echo(String input) throws RemoteException {
        return "Servertime: "+ LocalTime.now();
    }
}
