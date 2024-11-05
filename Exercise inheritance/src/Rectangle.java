public class Rectangle extends Shape{
    //s width (double) and length (double).
    private double width=1.0;  private double length1.0;

    Rectangle(){

    }
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(String color,boolean filled,double width,double length) {
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public Rectangle(double side) {this.width=side;
    }

    public Rectangle(double side, String green, boolean b) {
        super(green,b);
        this.width=side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
       return this.getLength()*this.getWidth();}

    public double getPerimeter(){
        //P = (L + W) × 2
  return (this.getWidth()+this.getLength())*2 ; }

    public String toString() {
        return "A Rectangle with width :  " + getWidth() +"  and length=  "+ getLength();

    }
}
