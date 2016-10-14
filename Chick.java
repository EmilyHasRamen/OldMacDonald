class Chick implements Animal 
{     
     //your code here
	 private String myType;     
     private String mySound1;
     private String mySound2;      
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound1 = sound1;
         mySound2 = sound2;

     }     
     public Chick(String type, String sound1)     {         
         myType = type;         
         mySound1 = sound1;
         mySound2 = mySound1;
     }      
     public String getSound()
     {
        if ( (int)(Math.random()*2) == 1){
            return mySound1;
        }
        return mySound2;
        
     }     
     public String getType(){return myType;} 
}
