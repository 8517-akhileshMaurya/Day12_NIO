package File_NIO_Level_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt";
        try{

//            long wordCount = Files.lines(Paths.get(filePath))
//                    .flatMap(line -> Stream.of(line.split("\\s"))).count();

            long wordCount = Files.lines(Paths.get(filePath))
                            .flatMap(line -> Stream.of(line.split("\\s"))).count();
            System.out.println(wordCount);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
