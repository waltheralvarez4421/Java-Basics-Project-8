	/**
     * Walther Alvarez
     * Assignment #8
     * CISC 500
     * This program contains the classes that correspond to a program that
     * Prompts the user for the radius and height
     * Then proceeds to calculate the volume and surface area of a sphere, cylinder and cone
     * With the corresponding radius and height (where applicable)
     */
public class Geometry 
   {
	     
	    public static double sphereVolume(double r)
       {
	        double sphereVol = (4.0 / 3.0) * Math.PI * (Math.pow(r, 3));
	        return sphereVol;
	    }
	    public static double sphereSurface(double r)
       {
	        double sphereSurfaceArea = 4.0 * Math.PI * (Math.pow(r, 2));
	        return sphereSurfaceArea;      
	    }
	    public static double cylinderVolume(double r, double h)
       {
	        double cylinderVol = Math.PI * (Math.pow(r, 2)) * h;
	        return cylinderVol;
	    }
	    public static double cylinderSurface(double r, double h)
       {
	        double cylSurfaceArea = 2 * (Math.PI * (Math.pow(r, 2))) + (2 * Math.PI * r)* h;
	        return cylSurfaceArea;
	    }
	    public static double coneVolume(double r, double h)
       {
	        double coneVol = 1.0 / 3.0 * Math.PI * (Math.pow(r, 2)) * h;
	        return coneVol;
	    }
	    public static double coneSurface(double r, double h)
       {
	        double coneSurfaceArea = Math.PI * r * Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2))+ Math.PI * Math.pow(r, 2);
	        return coneSurfaceArea;
	    }
	}
	 
	