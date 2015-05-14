package hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samantha on 5/13/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        List<String> stringList = new ArrayList<>();
    }
}
