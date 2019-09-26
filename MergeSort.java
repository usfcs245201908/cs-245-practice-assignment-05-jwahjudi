import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        int length = a.length;
        if (length <= 1)
            return;
        int[] first = Arrays.copyOfRange(a, 0, length/2);
        int[] second = Arrays.copyOfRange(a, length/2, length);
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    public static void merge(int[] first, int[] second, int[] a)
    {
        int iFirst = 0;  // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0;       // Next open position in a
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst] < second[iSecond])
            {
                a[j] = first[iFirst];
                iFirst++;
            }
            else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // Copy any remaining entries of the second half
        while (iFirst < first.length)
        {
            a[j] = first[iFirst];
            iFirst++; j++;
        }
        while (iSecond < second.length)
        {
            a[j] = second[iSecond];
            iSecond++; j++;
        }
    }
}
