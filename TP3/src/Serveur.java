import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Serveur {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1234);
        Socket c = s.accept();
        InputStream is = c.getInputStream();

        while(true) {
            BufferedReader text = new BufferedReader(new InputStreamReader(is));

            String y = text.readLine();
            if(y == null){
                c.close();
                s.close();
                break;
            }
            System.out.println(y);
        }

    }
}
