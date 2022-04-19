package other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App1 {

    public static void main(String[] args)
    {
        String filePath = "/home/64943127304/Downloads/broadfactor.txt";

        System.out.println( readAllBytesJava7( filePath ) );
    }

    //Read file content into string with - Files.readAllBytes(Path path)

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }
}
