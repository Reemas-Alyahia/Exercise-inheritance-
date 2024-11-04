//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Shape s1=new Shape("Blue",true);
        System.out.println("The color is  "+ s1.getColor());
        System.out.println(" is Filled?  "+ s1.isFilled());
        System.out.println("----------");
Circle c1=new Circle("Red",true,2.0);
        System.out.println(" The color of Circle is : "+ c1.getColor());
        System.out.println(" The Area of Circle of is : "+ c1.getArea());
        System.out.println(" The Perimeter of Circle of is : "+ c1.getPerimeter());
        System.out.println("----------");
Rectangle r1=new Rectangle("green",true,1.0,1.0);
        System.out.println(" The color of Rectangle is : "+ r1.getColor());
        System.out.println(" The Area of  Rectangle is : "+ r1.getArea());
        System.out.println(" The Perimeter of Rectangle  is : "+ r1.getPerimeter());
        System.out.println("----------");
        Square sq=new Square(4.3,"Orange",true);
        System.out.println(" The Area of  Square is : "+ sq.getArea());
        System.out.println(" The Perimeter of Square  is : "+ sq.getPerimeter());

        System.out.println("----------" +
                "-------------------------");

        System.out.println("Shape info : "+s1);
        System.out.println("----------");
        System.out.println("Circle info: "+c1);
        System.out.println("----------");
        System.out.println(r1);
        System.out.println("----------");
        System.out.println(sq);

    }
}