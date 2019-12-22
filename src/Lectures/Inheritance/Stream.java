package Lectures.Inheritance;

/**
 * Stream
 */
public class Stream {
    protected int value = 0;

    public void Method() {
        System.out.println("Stream.Method();");
        System.out.println("> " + ++this.value);
    }
}