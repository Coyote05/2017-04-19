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

        float halfPerimeter = (a + b + c) / 2;
        float area = (float) Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
