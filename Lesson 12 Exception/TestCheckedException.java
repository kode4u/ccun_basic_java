import java.io.File;

public class TestCheckedException {
    public static void main(String[] args) {
        try {
            File f = new File("index.html");
            f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
