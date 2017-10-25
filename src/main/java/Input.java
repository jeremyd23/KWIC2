import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Input
{
    private static Scanner input;

    public Input(String fileName)
    {
        try
        {
            this.input = new Scanner(new FileInputStream(fileName + ".txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }

    public ArrayList<LinkedList> addFileText()
    {
        ArrayList<LinkedList> textFile = new ArrayList<>();

        while(input.hasNextLine())
        {
            String line = input.nextLine();
            String delims = "[ ]+";

            LinkedList<String> lineWords =  new LinkedList(Arrays.asList(line.replace(",", "").split(delims)));
            textFile.add(lineWords);
        }

        return textFile;
    }
}
