import java.util.ArrayList;


public class Sort
{
    private static int count1=0;
    private static int count2=0;
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                count1++;
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;

                }

            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Iterations: "+count1);
    }

    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count2++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Iterations: "+count2);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        /* TO BE IMPLEMENTED IN PART C */
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        /* TO BE IMPLEMENTED IN PART C */
    }
}