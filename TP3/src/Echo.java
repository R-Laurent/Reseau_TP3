import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket c = new Socket();
        c.connect(new InetSocketAddress(1234));
        while (sc.hasNext()){
            String x = sc.nextLine();
            byte[] xbytes = x.getBytes();
            OutputStream os = c.getOutputStream();
            os.write(xbytes);
        }

    }
}
