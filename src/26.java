/*  
    Write a java program to create an interface that consists of a method to display 
    volume () as an abstract method and redefine this method in the derived classes 
    to suit their requirements.
    Create classes called Cone, Hemisphere and Cylinder that implements the interface. 
    Using these three classes, design a program that will accept dimensions of a cone, 
    cylinder and hemisphere interactively and display the volumes.
    Volume of cone = (1/3)pi r2h
    Volume of hemisphere = (2/3)pi r3
    Volume of cylinder = pi r2h
*/

import java.util.Scanner;

interface solids {
    public void volume();
}

class Cone implements solids {
    double h;
    double r;
    double v;

    Cone(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public void volume() {
        v = (1.0 / 3) * Math.PI * r * r * h;
        System.out.println("Voulme = " + v);
    }
}

class Hemisphere implements solids {
    double r;
    double v;

    Hemisphere(double r) {
        this.r = r;
    }

    public void volume() {
        v = (2.0 / 3) * Math.PI * r * r * r;
        System.out.println("Volume = " + v);
    }
}

class Cylinder implements solids {
    double h;
    double r;
    double v;

    Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public void volume() {
        v = Math.PI * r * r * h;
        System.out.println("Volume = " + v);
    }
}

class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Cone \n2.Hemisphere \n3.Cylinder");
        int c = sc.nextInt();
        switch (c) {
        case 1: {
            System.out.println("Enter radius and height of cone:: ");
            double r, h;
            r = sc.nextDouble();
            h = sc.nextDouble();
            Cone cone = new Cone(h, r);
            cone.volume();
            break;
        }
        case 2: {
            System.out.println("Enter the raduis of hemisphere:: ");
            double r;
            r = sc.nextInt();
            Hemisphere hh = new Hemisphere(r);
            hh.volume();
            break;
        }
        case 3: {
            System.out.println("Enter radius and height of cylinder:: ");
            double h, r;
            r = sc.nextDouble();
            h = sc.nextDouble();
            Cylinder ccc = new Cylinder(h, r);
            ccc.volume();
            break;
        }
        default:
            System.err.println("Wrong Choice");
        }
        sc.close();
    }
}