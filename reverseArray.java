class reverseArray {
    static void reverseArraY(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArraY(arr, start + 1, end - 1);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printArray(arr, 4);
        reverseArraY(arr, 0, 3);
        printArray(arr, 4);
    }
}