package hu.helixlab.homework.homework06;

public class Triangle extends AbstractShape {
    private float a;
    private float b;
    private float c;
    private float beta;

    public float getA(){
        return a;
    }
    public void setA(float a){
        this.a = a;
    }
    public float getB(){
        return b;
    }
    public void setB(float b){
        this.b = b;
    }
    public float getC(){
        return c;
    }
    public void setC(float c){
        this.c = c;
    }
    public float getBeta(){
        return beta;
    }
    public void setBeta(float beta){
        this.beta = beta;
    }
    public float getPerimeter(){

        float perimeter = a + b + c;
        return perimeter;
    }
    public float getArea(){

        float betaInRadian = (float) Math.toRadians(beta);
        float area = (float) ((Math.sin(betaInRadian) * a * c) / 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
