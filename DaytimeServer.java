import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalTime;

public class DaytimeServer {
    public static void main(String[] args) throws IOException {
        Registry registry= LocateRegistry.createRegistry(4099);
        registry.rebind("Daytime", new DaytimeImpl());
    }
}
