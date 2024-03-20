class Population 
  {
     public static void main (String [] args)
     { 
      long secondYear= 365*24*60*60; 
      long  birthYear = secondYear/7;
      long  deathYear = secondYear;
      long  immigrant = secondYear/45;
      long  cp = 312032486;
      long  newPopu = cp + ((birthYear- deathYear + immigrant)*5);
       System.out.println("Current population is "+cp);
       System.out.println("Total population after 5 year is "+newPopu);

     } 
}
    