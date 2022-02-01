/* 
    Write a java program to implement abstract class and abstract method with following
    details:
    Create a abstract Base Class Temperature
    Data members:
        double temp;
    Method members:
        void setTempData(double)
        abstact void changeTemp()
    Sub Class Fahrenheit (subclass of Temperature)
    Data members:
        double ctemp;
    method member:
        Override abstract method changeTemp() to convert Fahrenheit temperature into degree
        Celsius by using formula C=5/9*(F-32) and display converted temperature
    Sub Class Celsius (subclass of Temperature)
    Data member:
        double ftemp;
    Method member:
        Override abstract method changeTemp() to convert degree Celsius into Fahrenheit
        temperature by using formula F=9/5*c+32 and display converted temperature
*/

abstract class Temperature{
    double temp;
    public void setTempData(double a){
        temp = a;
    }
    public abstract void changeTemp();
}

class Fahrenheit extends Temperature{
    double ctemp;
    public void changeTemp(){
        ctemp = (5.0/9) * (temp-32);
        System.out.println(temp + "F = " + ctemp + "oC");
    }
}
class Celsius extends Temperature{
    double ftemp;
    public void changeTemp(){
        ftemp = (9/5) * temp + 32;
        System.out.println(temp + "oC = " + ftemp + " F");
    }
}

class five{
    public static void main(String[] args) {
        Fahrenheit f = new Fahrenheit();
        f.setTempData(100);
        f.changeTemp();

        Celsius c = new Celsius();
        c.setTempData(123);
        c.changeTemp();
    }
}