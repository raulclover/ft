package d.numbers;

import java.util.Scanner;

/**
 * Created by Сергей on 07.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();
        System.out.println("To know a factorial press 'f', делители press 'd', простое число - 's', сумма цифр в числе - 'sum' ");
        String v=scanner.next();
        if(v.equals("f")){
            int b=1;
            for (int i=1;i<=n;i++){
                b=b*i;
            }
            System.out.println(n+"!="+b);
        }
        if(v.equals("d")){
            int c=0;
            System.out.println("Делители: ");
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
                if(n%i==0)
                    System.out.print(i+" , ");
            }
            System.out.println("Кол-во делителей: "+c);
        }
        if(v.equals("s")){
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
            if(c>2)
                System.out.println("Not simple");
            else
                System.out.println("Simple");
        }
        if(v.equals("sum")){
            int sum=0;
            while(n != 0){
                //Суммирование цифр числа
                sum = sum + (n % 10);
                n/=10;
            }
            System.out.println(sum + " ");
        }


    }
}
