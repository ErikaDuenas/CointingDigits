import java.util.Scanner;

public class CountingIntegers {

    public static void main(String[] args) {

        //Initialize variables
        int num;                                            //To store the user input
        int originalNum;                                    //To store the original value of num
        int lastDigit;                                      //To store the last digit of the number
        int digits = 0;                                     //To store the count of digits

        //To read user input
        Scanner scanner = new Scanner(System.in);           //Import the Scanner class
        System.out.print("Enter a Integer number: ");       //Promp requesting to enter a number
        num = scanner.nextInt();                            //To store the value in the variable num

        originalNum = num;                                  //To store the num value in originalNum
        num = Math.abs(num);                                //to get the absolute value of the number

        //To count the digits of number
        if (num == 0){                                      //Conditional if. If num equals 0
            digits = 1;                                     //then digits equals 1
        }else {                                             //Otherwise
            while (num > 0) {                               //Loop while. While num is greater than Zero
                lastDigit = num % 10;                       //To extract the last digit of number
                digits++;                                   //digits increase its value by 1
                num /= 10;                                  //To remove the last digit of number
            }
        }

        //Print the number of digits of the number
        System.out.println("\nThe number " + originalNum + " have " + digits + " digits.");
    }
}