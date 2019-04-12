import java.util.Scanner;
public class GeometryTester 
{ 
    /**
     * Walther Alvarez
     * Assignment #8
     * CISC 500
     * This program prompts the user for the radius and height
     * Then proceeds to calculate the volume and surface area of a sphere, cylinder and cone
     * With the corresponding radius and height (where applicable)
     */
    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        Geometry geo = new Geometry();
        double r = in.nextDouble();
        in.nextLine();

        System.out.print("Height: ");

        double h = in.nextDouble();
        System.out.println("Volume of the Sphere: " + geo.sphereVolume(r));
        System.out.println("Surface Area of the Sphere: " + geo.sphereSurface(r));
        System.out.println("Volume of the Cylinder: " + geo.cylinderVolume(r,h));
        System.out.println("Surface Area of the Cylinder:  " + geo.cylinderSurface(r,h));          
        System.out.println("Volume of the Cone:  " + geo.coneVolume(r,h));
        System.out.println("Surface Area of the Cone:  " + geo.coneSurface(r,h));
   
    }
}