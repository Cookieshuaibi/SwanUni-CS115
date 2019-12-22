package Lectures.Inheritance;

/**
 * StreamReader
 */
public class StreamReader extends Stream {
    @Override
    public void Method() {
        super.Method();
        System.out.println("StreamReader.Method();");
        System.out.println("> " + ++super.value);
        System.out.println("> " + ++this.value);

        this.Method2();
    }

    public void Method2() {
        System.out.println("StreamReader.Method2();");
    }
}