import java.io.IOException;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.time.LocalTime;

public class DaytimeClient {
    public static void main(String[] args) throws IOException, NotBoundException {
        Daytime daytime = (Daytime) Naming.lookup("rmi://localhost:4099/Daytime");
        System.out.println("Client asks server for time: "+LocalTime.now());
        System.out.println(daytime.echo(""));
        System.out.println("Client time after request: "+LocalTime.now());
    }
}
