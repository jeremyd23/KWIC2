import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Output
{
    private static PrintWriter output = null;

    public Output(ArrayList<LinkedList> fileText)
    {
        try
        {
            output = new PrintWriter(new FileOutputStream("results.txt"));

            for(LinkedList line : fileText)
            {
                //output.println(line);
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
