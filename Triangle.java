public class Triangle extends GemotricObjects implements icolorable{
    private double side1,side2,side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double side1,double side2,double side3,String Color,boolean filled){
        super(Color,filled);
        this.side1 =side1;
        this.side2 =side2;
        this.side3 =side3;
    }

    public double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return super.toString() + "\n Sides: " + side1 +","+side2+","+side3 +"\n Area: "+this.getArea()+"\n Perimeter: "+this.getPerimeter();
    }

    public void howToColor(){
        System.out.println("Color all three sides");
    }

}
