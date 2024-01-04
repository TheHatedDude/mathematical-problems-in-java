import java.util.Scanner;
class NoOfDigits{
    public static void main(String args[]){
        System.out.print("Enter a numeric value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println("No of digits in give number is: " + count);
    }
}
