package task3;

import java.util.Scanner;

/**
 * Created by student on 06.06.2017.
 */
//multiple tab
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set num ");
        int n=sc.nextInt();
        System.out.print("  ");
        for(int i=1;i<=n;i++){
            System.out.printf("%6d",i);
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.printf("%2d",i);
            for(int j=1;j<=n;j++)
                System.out.printf("%6d",i*j);
            System.out.println();
        }

    }
}
