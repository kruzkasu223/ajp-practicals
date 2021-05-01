import java.io.*;
import java.net.*;

class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        System.out.println("connected..........");
        FileInputStream fin = new FileInputStream("file.txt");
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        int r;
        while ((r = fin.read()) != -1) {
            dout.write(r);
        }
        System.out.println("\nFiletranfer Completed");
        s.close();
        ss.close();
        fin.close();
    }
}