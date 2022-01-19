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

        String text = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));

        int y = is.read();
        String x = Integer.toString(y);
        //System.out.println(text);
        System.out.println(is);
        c.close();

    }
}
