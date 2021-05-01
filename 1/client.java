import java.io.*;
import java.net.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 8080);
        if (s.isConnected()) {
            System.out.println("Connected to server");
        }
        FileOutputStream fout = new FileOutputStream("out/file.txt");
        DataInputStream din = new DataInputStream(s.getInputStream());
        int r;
        while ((r = din.read()) != -1) {
            fout.write((char) r);
        }
        s.close();
        fout.close();
    }
}