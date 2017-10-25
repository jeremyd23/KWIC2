import java.util.*;

public class KWICMain
{
    private static ArrayList<LinkedList> fileText;

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        input(console);
        circularShift();
        sort();
        output();
    }

    private static void input(Scanner console)
    {
        System.out.println("Please enter a file name (poem OR long)");
        String fileName = console.nextLine();

        Input file = new Input(fileName);
        fileText = file.addFileText();
    }

    private static void circularShift()
    {
        fileText = new Shifter().circularShift(fileText);
    }

    private static void sort()
    {
        fileText = new Sorter().sort(fileText);
    }

    private static void output()
    {
        new Output(fileText);
    }
}