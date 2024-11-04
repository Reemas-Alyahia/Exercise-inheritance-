public class Circle extends Shape {
    private double radious;
    Circle(String color,boolean filled,double radious){
        super(color,filled);
        this.radious=radious;
    }
    Circle(){

    }
    Circle(double radious){
        this.radious=1.0;
    }


    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }
    public double getArea(){
 return 3.14*radious*radious;
    }
    public double getPerimeter(){

   return 2*3.14*radious*radious; }

  public String toString() {
        return "The Radious is : "+ getRadious()+ "  The Area is:  "+ getArea()+"  The perimeter is  "+ getPerimeter();
    }


}
