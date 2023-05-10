package Challenge_5_8_2023;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1) Median of Two Sorted Arrays
        int[] nums1 = {1,3};
        int[] nums2 = {2};


        Scanner scan = new Scanner(System.in);

        //uncomment for user input
//        System.out.print("Input first array of numbers separated by commas: ");
//        String[] stringnums = scan.nextLine().split(",");
//        int[] nums1 = new int[stringnums.length];
//
//        for(int i = 0; i < stringnums.length; i++){
//            nums1[i] = Integer.parseInt(stringnums[i]);
//        }
//
//        System.out.print("Input second array of numbers separated by commas: ");
//        stringnums = scan.nextLine().split(",");
//        int[] nums2 = new int[stringnums.length];
//
//        for(int i = 0; i < stringnums.length; i++){
//            nums2[i] = Integer.parseInt(stringnums[i]);
//        }
//
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);

        //output for 1)
        System.out.println("1) Median of Two Sorted Arrays");
        System.out.print("The median of the two arrays is: ");
        System.out.println(MedianOfTwoArrays(nums1,nums2)+ "\n");

        //2) Merge Sorted Lists
        //comment this for user input
        LinkedList<Integer> linked1 = new LinkedList<Integer>(Arrays.asList(1,4,5));
        LinkedList<Integer> linked2 = new LinkedList<Integer>(Arrays.asList(1,3,4));
        LinkedList<Integer> linked3 = new LinkedList<Integer>(Arrays.asList(2,6));

        LinkedList[] listarr = {linked1,linked2,linked3};

        //uncomment for user input
//        System.out.print("How many lists will be inserted?: ");
//        int size = scan.nextInt();
//        LinkedList[] listarr = new LinkedList[size];
//        scan.nextLine();
//
//
//        for(int i = 0; i < size; i++) {
//            System.out.print("Input a list of numbers separated by commas: ");
//            String[] stringnums = scan.nextLine().split(",");
//            Integer[] n = new Integer[stringnums.length];
//
//            for(int x = 0; x < stringnums.length; x++){
//                n[x] = Integer.parseInt(stringnums[x]);
//            }
//
//            listarr[i] = new LinkedList<Integer>(Arrays.asList(n));
//
//        }

        //output for 2)
        System.out.println("2) Merge Sorted Lists");
        System.out.print("The merged linked list is: ");
        System.out.println(MergeLinkedLists(listarr) + "\n");

        System.out.println("This program supports user input, uncomment/comment the indicated code to try it out!");

    }


    public static double MedianOfTwoArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lenM = len1 + len2;

        int[] merged = new int[lenM];

        System.arraycopy(nums1, 0, merged, 0, len1);
        System.arraycopy(nums2,0, merged, len1, len2);
        Arrays.sort(merged);

        if(lenM % 2 != 0) {
            double median = merged[(int) Math.ceil(lenM/2.0) - 1];
            return median;
        }
        else {
            double first = merged[lenM/2 - 1];
            double second = merged[lenM/2];

            return (first + second)/2;
        }
    }

    public static LinkedList<Integer> MergeLinkedLists(LinkedList[] listoflists) {
        LinkedList<Integer> result = new LinkedList<>();

        for(int i = 0; i < listoflists.length; i++) {
            for(int j = 0; j < listoflists[i].size(); j++) {
                result.add((Integer)listoflists[i].get(j));
            }
        }

        Collections.sort(result);
        return result;
    }

}
