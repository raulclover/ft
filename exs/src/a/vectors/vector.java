package a.vectors;

/**
 * Created by Сергей on 06.06.2017.
 */
class vector {
    private double[] vector;
    private int size;

    public vector(){
        this.vector=null;
    }

    public vector(double[] vector){
        this.vector=vector;
    }
    public vector(int size){
        this.size=size;
    }
    public double[] getVector(){
        return vector;
    }
    public int getSize(){
        return vector.length;
    }

    public vector sumv(vector obj){
        double[]result=new double[this.getSize()+obj.getSize()];
        System.arraycopy(this.getVector(),0,result,0,obj.getSize());
        System.arraycopy(obj.getVector(),0,result,this.getSize(),obj.getSize());
        return new vector(result);

    }


}
