public class String_margesort {
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid); // left part
        mergesort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (check(arr[i], arr[j])) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i <= mid) {
            temp[k++] = arr[i++];
        }
        if (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static boolean check(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        mergesort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
