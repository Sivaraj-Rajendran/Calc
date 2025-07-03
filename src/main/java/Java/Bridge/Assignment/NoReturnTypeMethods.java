package Java.Bridge.Assignment;

public class NoReturnTypeMethods {

	private int lastResult;

    public void add(int a, int b) {
        lastResult = a + b;
    }

    public int getLastResult() {
        return lastResult;
    }
    
    public static void addAndPrint(int a, int b) {
        System.out.println("Result: " + (a + b));
}
}
