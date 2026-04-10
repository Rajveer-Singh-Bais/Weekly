import java.util.Scanner;
public class W7Q1 {
    public void interest(int p,int r, int t){
        double si=p*r*t/100;
        System.out.println("Simple Interest "+ si+"for principal"+p+"Rate of interest"+r+"time"+t);
    }
    public static void main(String arg[]){
        W7Q1 obj = new W7Q1();
        Scanner sc =new Scanner(System.in);
        int P =sc.nextInt();
        int R =sc.nextInt();
        int T =sc.nextInt();
        obj.interest(P, R, T);
        sc.close();
    }
}   
