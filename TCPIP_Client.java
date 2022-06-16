import java.io.*;
import java.net.*;

public class TCPIP_Client {
    public static void main(String args[]) {
        String host;
        int port;
        if (args.length > 2) {
            host = args[0];
            port = Integer.parseInt(args[1]);
        } else {
            host = "localhost";
            port = 6666;
        }
        try {
            Socket socket = new Socket(host, port);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String time = reader.readLine();
            System.out.println(time);
        } catch(Exception e) {System.out.println(e);}
    }
}
