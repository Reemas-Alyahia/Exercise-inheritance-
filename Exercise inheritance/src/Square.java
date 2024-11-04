public class Square extends Rectangle{


    Square(double width,double length){
        super(width,length);
    }
    Square(double side){
        super(side);
    }
    Square(double side,String color,boolean filled){
        super(side,"green",true);
    }

    public void setSide( double side){
super.setWidth(side);
    }
    public double getside(){
return super.getWidth();
    }

    @Override
    public double getPerimeter() {
      return (super.getWidth())*4;
    }

    @Override
    public double getArea() {
        return super.getWidth()*super.getWidth();
    }

    public String toString() {
       return " A Square with side=  "+super.getWidth() ;

    }

}
