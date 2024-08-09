package File_NIO_Level_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteToFileExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt";
        List<String> linesToWrite = Arrays.asList("Hello There !" , "This is Example file" ,"Feel free to contact");

        try{

            Files.write(Paths.get(filePath) , linesToWrite , StandardOpenOption.CREATE , StandardOpenOption.APPEND);

            System.out.println("Done !!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
