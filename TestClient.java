import java.rmi.*;

public class TestClient {
   public static void main (String args []) {
    String n1 = "123";
    String n2 = "456";
    
    int[] v = {1,2,3,4,5};
    
    
    try {
     System.out.println ("\n The first no is " + n1);
     System.out.println ("\n The second no is "+ n2);
     double d1, d2;
     d1=Double.valueOf(n1).doubleValue();
     d2=Double.valueOf(n2).doubleValue();
     System.out.println ("\nSuma celor 2 numere: " + rmiinter.add (d1, d2));
     System.out.println ("\nSuma elementelor vectorului: " + rmiinter.ADD(v));  
    }
    catch (Exception e) {
        System.out.println ("An error occurred.");  
    }
   }  
}

