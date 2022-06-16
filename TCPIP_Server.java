import java.io.*;
import java.net.*;
import java.util.Date;

public class TCPIP_Server {
    public static void main(String args[]) {
        int port;
        if (args.length > 0) port = Integer.parseInt(args[0]);
        else port = 6666;
        try {
            ServerSocket timeServer = new ServerSocket(6666);
            System.out.println("Server is listning on port " + port);
            while(true) {
                Socket socket = timeServer.accept();
                System.out.println("New clint connected | Time:" + new Date());
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                writer.println(new Date().toString());
            }
        } catch(Exception e) {System.out.println(e);}
    }

}

