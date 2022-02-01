/* 
    Write a java program to calculate the area of a rectangle, a square and a circle. 
    Create an abstract class 'Shape' with three abstract methods namely 
    rectangleArea() taking two parameters, 
    squareArea() and circleArea() taking one parameter each.
    Now create another class ‘Area’ containing all the three methods
    rectangleArea(),squareArea() and circleArea() for printing the area of rectangle, square
    and circle respectively. Create an object of class Area and call all the three methods.
    (Use Runtime Polymorphism)
*/

package shape;

abstract class shape {
    public abstract void rectArea();

    public abstract void cicleArea();

    public abstract void squareArea();
}

class area extends shape {
    int a, b, r;

    area(int a, int b, int r){
        this.a = a;
        this.b = b;
        this.r = r;

    }
    public void rectArea() {
        System.out.println("Rectangle area :" + a * b);
    }

    public void cicleArea() {
        System.out.println("Circle area :" + a * a);
    }

    public void squareArea() {
        System.out.println("Square area :" + 3.141 * r * r);
    }

    public static void main(String[] args) {
        area a = new area(1,2,3);
        shape s;
        s = a;
        s.cicleArea();
        s.rectArea();
        s.squareArea();
    }
}
