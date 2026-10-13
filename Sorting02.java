
//Bubble Sort -> Bubble Sort logic: Compare adjacent elements and swap them if they are in the wrong order;
// after each pass, the largest unsorted element moves to the end.

//for n terms n-1 terms required
//O(n2)

//public class Sorting02 {
//    public static void bubbleSort(int[]arr){
//        for(int turn=0;turn<arr.length-1;turn++){
//            int swaps = 0;
//            for(int j=0;j<arr.length-1-turn;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                swaps++;
//                }
//            }
//            if(swaps==0){
//                return;
//            }
//        }
//    }
//    public static void printArr(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        bubbleSort(arr);
//        printArr(arr);
//
//    }
//}



//Selection Sort -Selection Sort logic: Find the smallest element in the unsorted part
// and swap it with the first element of that part.

//public class Sorting02 {
//    public static void selectionSort(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            int minPos = i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[minPos] > arr[j]){
//                    minPos = j;
//                }
//            }
//            int temp = arr[minPos];
//            arr[minPos] = arr[i];
//            arr[i] = temp;
//        }
//    }
//
//    public static void printArr(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {5,3,4,1,2};
//        selectionSort(arr);
//        printArr(arr);
//    }
//}



//Insertion Sort -> Insertion Sort logic: Take each element and insert it into its correct position
// in the already-sorted left part of the array.


//public class Sorting02 {
//    public static void insertionSort(int[] arr){
//        for(int i=1;i<arr.length;i++){
//            int curr = arr[i];
//            int prev = i-1;
//            while(prev>=0 && arr[prev]>curr){
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = curr;
//        }
//    }
//
//    public static void printArr(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {4,3,5,1,2};
//        insertionSort(arr);
//        printArr(arr);
//
//    }
//}



//Inbuilt Sorting

//Arrays.sort(arr);
//O(nlogn)

//Arrays.sort(arr,si,ei) -> starting index , ending index


//public class Sorting02 {
//    public static void main(String[] args) {
//        int[] arr = {3,5,6,2,1};
//
//        Arrays.sort(arr,0,3);
//
//        for(int x : arr){
//            System.out.print(x + " ");
//        }
//    }
//}

//Works for objects
//Integer not Int
//Arrays.sort(arr,Collections.reverseOrder())
//Arrays.sort(arr,si,ei,Collections.reverseOrder())


//Counting Sort
//O(n+range)

//public class Sorting02 {
//    public static void countingSort(int[] arr){
//        int largest = Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++){
//            largest = Math.max(largest,arr[i]);
//        }
//
//        int[] count = new int[largest+1];
//
//        for(int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//
//        int j = 0;
//        for(int i=0;i<count.length;i++){
//            while(count[i]>0){
//                arr[j] = i;
//                j++;
//                count[i]--;
//            }
//        }
//    }
//
//    public static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int[] arr = {1,4,1,3,2,4,3,7};
//        countingSort(arr);
//        printArr(arr);
//    }
//}