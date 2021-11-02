import java.rmi.*;

public interface RmiInterface extends Remote
{
   double add (double d1, double d2) throws Exception;
   double ADD (int[] v) throws Exception;
} 

