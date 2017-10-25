import java.util.*;

public class KWICMain
{
    private static ArrayList<LinkedList> textFile = new ArrayList<>();

    public static void main(String[] args)
    {
        input();
        circularShift();
        sort();
        output();
    }

    private static void input()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter a file name (poem OR long)");
        String fileName = console.nextLine();

        Input file = new Input(fileName);
    }

    private static void circularShift()
    {

    }

    private static void sort()
    {

    }

    private static void output()
    {

    }
}