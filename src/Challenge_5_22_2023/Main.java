package Challenge_5_22_2023;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1) highest of a set of three
        Scanner scan = new Scanner(System.in);
        System.out.println("Highest of a set of three\n");
        System.out.print("How many sets of three numbers?: ");
        int N = scan.nextInt();
        int[][] sets = new int[N][3];

        for(int i = 0; i < N; i++){
            System.out.print("Input three space-separated integers: ");
            int[] temp = new int[3];
            temp[0] = scan.nextInt();
            temp[1] = scan.nextInt();
            temp[2] = scan.nextInt();
            Arrays.sort(temp);
            sets[i] = temp;
            scan.nextLine();
        }

        for(int i = 0; i < N; i++){
            System.out.println("The second highest number of " + Arrays.toString(sets[i]) + " is: " + sets[i][1]);
        }
        System.out.println("\n");


        //2)sum of numbers in an alphanumerical string
        System.out.println("Sum of the numbers in an alphanumerical string\n");
        System.out.print("How many alphanumerical strings?: ");
        int A = scan.nextInt();
        String[] alphanumerical = new String[A];

        for(int i = 0; i < A; i++){
            System.out.print("Input an alphanumerical string: ");
            alphanumerical[i] = scan.next();
        }

        for(int i = 0; i < A; i++){
            System.out.print("The sum of the numbers in " + alphanumerical[i] + " is: ");
            int sum = 0;
            for(int j = 0; j < alphanumerical[i].length(); j++){
                int ascii = (int) alphanumerical[i].charAt(j);
                if(ascii >= 49 && ascii <= 57){
                    sum += Character.getNumericValue(alphanumerical[i].charAt(j));
                }
            }
            System.out.println(sum);
        }



    }
}
