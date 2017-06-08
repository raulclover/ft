package a.vectors;

/**
 * Created by Сергей on 06.06.2017.
 */
public class main {
    public static void main(String[] args) {
        double[] v1=new double[]{4,2,1,5};
        double[] v2=new double[]{2,1,2,4};
        vector result;
        int r;
        double[] m2;
        vector obj1=new vector(v1);
        vector obj2=new vector(v2);

        /*r=obj1.getSize();
        for(double temp:obj2.getVector()){
            System.out.println(temp);
        }*/
        result=obj1.sumv(obj2);
        for(double temp:result.getVector()){
            System.out.println(temp);
        }
    }
}
