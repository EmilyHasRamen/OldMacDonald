class Cow implements Animal 
{     
     //your code here
     private String myType;     
     private String mySound;      
     public Cow(String type, String sound)     {         
//System.out.println("I'm in Cow(String type, String sound)");
         myType = type;         
         mySound = sound;     
     }     

     public Cow()     {         
//System.out.println("I'm in Cow()");
         myType = "unknown";         
         mySound = "unknown";     
//System.out.println("myType="+myType+", mySound="+mySound);
     }      

     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
