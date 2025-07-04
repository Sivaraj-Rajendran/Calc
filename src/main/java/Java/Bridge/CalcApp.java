package Java.Bridge;

import Java.Bridge.Assignment.NoReturnTypeMethods;

/**
 * Hello world!
 *
 */
public class CalcApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        NoReturnTypeMethods nr= new NoReturnTypeMethods();
        nr.add(2, 5);
        System.out.println("Result ==="+nr.getLastResult());
    }
}
