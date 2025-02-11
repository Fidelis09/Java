import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("voce digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("voce digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("voce digitou: " + z);

        char w;
        w = sc.next().charAt(0);
        System.out.println("voce digitou: " + w);

        String e;
        int r;
        double t;
        e = sc.next();
        r = sc.nextInt();
        t = sc.nextDouble();
        System.out.println("voce digitou: ");
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("voce digitou: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        
        sc.close();
    }
}