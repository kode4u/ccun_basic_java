import java.io.File;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) {
        try {
            createFile("nubb.html");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            // this code will always run whether it's error or not
            System.out.println("Program finished.");
        }
    }

    public static void createFile(String filename) throws IOException {
        File f = new File(filename);
        f.createNewFile();
    }
}
