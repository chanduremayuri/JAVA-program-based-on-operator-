//write a java program to find the area of circle whose radius is 2.5 cm .
  

 class Circle 
  {
     public static void main (String [] args)
     { 
       double  radius = 2.5;
       final double  pi = 3.14;
       double  area  = pi*(radius*radius);
       double perimeter = 2 * 3.14 * radius ;  
       System.out.println("Area of circle is - "+ area + "cm^2 whose radius is 2.5");
       System.out.println("Perimeter of circle is - "+ perimeter + "cm^2 whose radius is 2.5");


     } 
}
    