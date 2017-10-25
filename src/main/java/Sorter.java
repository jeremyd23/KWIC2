import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Sorter
{
    public Sorter()
    {

    }

    public ArrayList<LinkedList> sort(ArrayList<LinkedList> fileText)
    {
        Collections.sort(fileText, new Comparator<LinkedList>()
        {
            @Override
            public int compare(LinkedList first, LinkedList second)
            {
                String list1 = first.getFirst().toString().toLowerCase();
                String list2 = second.getFirst().toString().toLowerCase();
                if(list1.compareTo(list2) == 0)
                {
                    list1 = first.get(1).toString().toLowerCase();
                    list2 = second.get(1).toString().toLowerCase();
                }
                return list1.compareTo(list2);
            }
        });

        return fileText;
    }
}
