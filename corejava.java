package corejava;

public class coreprime {
	


   public static void main (String[] args)
   {		
       int i,n;
      
       for (i = 1; i <= 20; i++)         
       { 		  	 
    	   int c=0;
          	  
          for(n =1; n<=i; n++)
	  {
             if(i%n==0)
	         c = c + 1;
	   }
	  if (c==2)
	  {
	   
		 System.out.println(i);
	  }	
      }
      
  }
}

