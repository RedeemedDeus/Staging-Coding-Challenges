package Challenge_5_1_2023;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("nums: ");
//        String[] stringnums = scan.nextLine().split(" ");
//        int[] nums = new int[stringnums.length];
//
//        for(int i = 0; i < stringnums.length; i++){
//            nums[i] = Integer.parseInt(stringnums[i]);
//        }

        System.out.println("Result: " + warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
    }

    public static int warOfNumbers(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evenSum += nums[i];
            }
            else {
                oddSum += nums[i];
            }
        }

        return Math.abs(evenSum - oddSum);
    }
}
