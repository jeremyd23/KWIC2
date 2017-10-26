import java.util.ArrayList;
import java.util.LinkedList;

public class Shifter
{
    public ArrayList<LinkedList> circularShift(ArrayList<LinkedList> fileText)
    {
        for(int i = 0; i < fileText.size(); i++)
        {
            Object first = fileText.get(i).getFirst();
            fileText.get(i).removeFirst();
            fileText.get(i).add(first);
        }

        return fileText;
    }
}
