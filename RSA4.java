/**
 * @(#)RSA4.java
 *
 * RSA4 application
 *
 * @author 
 * @version 1.00 2021/5/25
 */
import java.math.*;
public class RSA4 {
    
    public static void main(String[] args) {
    	
    	BigInteger d, e, C;
      
      // create a BigInteger exponent
      BigInteger exponent = new BigInteger("2");
      d = new BigInteger("2");
      e = new BigInteger("6");
      
      // perform modPow operation on bi1 using bi2 and exp
      C = d.modPow(exponent, e);
      String str = d + " * " +exponent+ " mod " + e + " is " +C;
      
      // print bi3 value
      System.out.print(str);
    	
    
    }
}
