import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        StringBuilder E2 = new StringBuilder(E1);
        E2.reverse();

        String rever=E2.toString();
        if(E1.equals(rever)){
            System.out.println("Palindrome");
        }else{
            System.out.println("No");
        }
    }
}
