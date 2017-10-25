import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input
{
    private static Scanner input;

    public Input(String fileName)
    {
        try
        {
            input = new Scanner(new FileInputStream(fileName + ".txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        finally
        {
           input.close();
        }
    }
}
