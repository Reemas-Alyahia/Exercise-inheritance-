public class Shape {
    private String color; private boolean filled;

    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    Shape(){
       this.color="green";
       this.filled=true;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public String toString(){
        return "The color is:   "+  getColor()+" is Filled?   "+isFilled();
    }
}
