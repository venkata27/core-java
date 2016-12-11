package corejava;

public class panlindrome {

	public static void main(String[] args) {
              int i,j=0,c;    
			  int n=112;
			  c=n;    
			  while(n>0){    
			   i=n%10; 
			   j=(j*10)+i;    
			   n=n/10;    
			  }    
			  if(c==j)    
			   System.out.println("palindrome ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			}