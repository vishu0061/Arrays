import java.util.Scanner;

public class SwapWithoutTemp {
    static void swap(int a, int b){
        System.out.println("before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        System.out.println("enter b:");
        int b= sc.nextInt();
        swap(a,b);

    }
}
