public class QuickSort implements SortingAlgorithm {
    public void sort(int a[])
    {
        int low, high;
        low = 0;
        high = a.length-1;
        quickSort(a, low, high);
    }

    public void quickSort(int a[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(a, low, high);

            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);

        }
    }
    public int partition(int a[], int low, int high)
    {
        int pivot = a[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if(a[j] < pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }
}
