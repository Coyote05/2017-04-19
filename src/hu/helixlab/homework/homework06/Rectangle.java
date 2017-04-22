package hu.helixlab.homework.homework06;

public class Rectangle extends AbstractShape {
    private float a;
    private float b;

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
    public float getPerimeter(){

        float perimeter = 2 * (a + b);
        return perimeter;
    }
    public float getArea(){

        float area = a * b;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
