package File_NIO_Level_1;

import java.io.IOException;
import java.nio.file.*;

public class FileCopyExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt");
        Path targetPath = Paths.get("C:\\Users\\Akhilesh.Maurya\\Desktop\\word3_count.txt");

        try {
            Files.copy(sourcePath , targetPath , StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
