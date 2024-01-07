import java.util.Scanner;
class Main {
    static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while (temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
            }
        return (rev == n);
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("input a number and check whether it is palindrome or not: ");
      int n = sc.nextInt();
      System.out.print(isPalindrome(n));
    }
}
