package c.fill;

import java.util.Random;

/**
 * Created by Сергей on 06.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Random r=new Random();/*
        int i=r.nextInt(84)-42;
        System.out.println(i);*/
        int[] ar = new int[20];
        int max= ar[0];
        int min=ar[0];
        for (int i=0;i<ar.length;i++) {
            ar[i] = (r.nextInt(84) - 42);
            System.out.println(ar[i]);
            if(ar[i]>max)
                max=ar[i];
            if(ar[i]<min)
                min=ar[i];
        }
        System.out.println("Max is "+max+" Min is "+min);
    }
}

