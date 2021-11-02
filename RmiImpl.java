//import java.rmi.*;
//import java.rmi.server.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
//import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;



public class RmiImpl extends UnicastRemoteObject 
                          implements RmiInterface
{
   public RmiImpl () throws RemoteException
   {
	//super(0);
   }

   public double add (double d1, double d2) throws Exception
   {
   return d1+d2;
   }

  public double ADD(int[] v) throws Exception 
  {
   double suma=0;
   for(int i:v)suma+=i;
   return suma;
  }

 public static void main (String args [])throws Exception {

//System.setProperty("java.rmi.server.hostname", "193.231.17.125");

 System.out.println("RMI server started");

 try { //special exception handler for registry creation
    LocateRegistry.createRegistry(1099);
    System.out.println("java RMI registry created.");
 } catch (RemoteException e) {
    //do nothing, error means registry already exists
    System.out.println("java RMI registry already exists.");
 }


// Create an object of the HelloWorldServer class.
RmiImpl obj = new RmiImpl();

// Bind this object instance to the name "HelloServer".
Naming.rebind("AdunaNumere", obj);
System.out.println("AdunaNumere bound in registry");
}

}


