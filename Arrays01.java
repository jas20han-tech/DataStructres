import java.util.*;

//Why started index from 0 it is because 0 based indexing java or c++
//List of elements of the same type placed in contiguous memory location




//Pairs in an Array

//public class Arrays01 {
//    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10};
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                System.out.print("(" + arr[i]+" "+arr[j] + ")");
//            }
//        System.out.println();
//        }
//    }
//}

//pair - (n)(n-1)/2


//Print Subarrays - (n)(n+1)/2
//Continuous part of Array

//public class Arrays01 {
//    public static void printSubarrays(int[] arr){
//        int ts = 0;
//        for(int i=0;i<arr.length;i++){
//            int start = i;
//            for(int j=i;j<arr.length;j++){
//                int end = j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                ts++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println(ts);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10};
//        printSubarrays(arr);
//    }
//}
//




//Sum of SubArrays

//public class Arrays01 {
//    public static void printSubarrays(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                int sum = 0;
//                for(int k=i;k<=j;k++){
//
//                    System.out.print(arr[k]+" ");
//                    sum += arr[k];
//                }
//                System.out.println("-> sum is " + sum);
//                max = Math.max(max,sum);
//            }
//        }
//            System.out.println("Maximum is " + max);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10};
//        printSubarrays(arr);
//    }
//}


//Max Sum from Prefix Sum

//public class Arrays01 {
//    public static void maxSubarray(int[] numbers){
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        int[] prefix = new int[numbers.length+1];
//        prefix[0] = 0;
//
//        for(int i=0;i< numbers.length;i++){
//            prefix[i+1] = prefix[i] + numbers[i];
//        }
//
//        for(int i=1;i<prefix.length;i++){
//            for(int j=i;j< prefix.length;j++){
//                sum = prefix[j]-prefix[i-1];
//
//                max = Math.max(sum,max);
//            }
//        }
//        System.out.println(max);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,-2,6,-1,3};
//        maxSubarray(arr);
//    }
//}


//Max subarray sum from kaden's algorithm

//public class Arrays01 {
//    public static void maxKadens(int[] numbers){
//        int maxSum = Integer.MIN_VALUE;
//        int currentSum = 0;
//
//        for(int i=0;i<numbers.length;i++){
//            currentSum += numbers[i];
//
//            if(currentSum<0){
//                currentSum = 0;
//            }
//            else{
//                maxSum = Math.max(currentSum,maxSum);
//            }
//        }
//        System.out.println(maxSum);
//    }
//    public static void main(String[] args) {
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//        maxKadens(arr);
//    }
//}




//public class Arrays01 {
//    public static void maxKadens(int[] numbers){
//        int maxSum = Integer.MIN_VALUE;
//        int maxNum = Integer.MIN_VALUE;
//        int currentSum = 0;
//
//        for(int i=0;i<numbers.length;i++){
//            if(numbers[i]<0){
//                maxNum = Math.max(maxNum,numbers[i]);
//            }
//        }
//
//        for(int i=0;i<numbers.length;i++){
//            currentSum += numbers[i];
//            if(currentSum<0){
//                currentSum = 0;
//            }
//            else{
//                maxSum = Math.max(currentSum,maxSum);
//            }
//        }
//        if(maxSum==Integer.MIN_VALUE){
//            maxSum = maxNum;
//        }
//        System.out.println(maxSum);
//    }
//    public static void main(String[] args) {
//        int[] arr = {-2,-3,-1,-2,-3};
//        maxKadens(arr);
//    }
//}




//Sheet Q5


//public class Arrays01 {
//    public static void main(String[] args) {
//        List<List<Integer>> result = new ArrayList<>();
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
//                        Collections.sort(triplet);
//
//                        if(!result.contains(triplet)){
//                            result.add(triplet);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}



