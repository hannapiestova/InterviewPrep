import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {


    public static void main(String[] args) throws IOException {
        List<String> l = new ArrayList<>();
        l=Files.readAllLines(Paths.get("1.txt"));
        System.out.println(l);

        Files.writeString(Paths.get("1.txt"), "SAFDASDFASD");
    }
}
