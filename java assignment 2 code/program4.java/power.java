import java.util.Scanner;
class power extends pow 
{
    public static  void main(String[] args){
        int a,b;
        power pow = new power();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Power of "+a+" raise to "+b+" is "+pow.calc(a,b));
        sc.close();
    }
}