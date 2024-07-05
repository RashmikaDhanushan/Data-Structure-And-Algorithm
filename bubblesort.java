package sorting;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int length = arr.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array in ascending order:");
        for (int k = 0; k < length; k++) {
            System.out.println(arr[k]);
        }
    }
}
