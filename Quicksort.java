public class Quicksort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx-1); // left
        sort(arr, pIdx+1, ei); // right
    }

    public static int partition(int[]arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    // put the pivot in the correct position
    i++;

    // swap
    int temp = pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
    }

    public static void main(String[] args) {
        int[]arr={6,3,9,8,2,5};
        sort(arr,0,arr.length-1);
        printArray(arr);
    }
}
