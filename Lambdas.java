import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class onepiece {

    public static void main(String[] args) {

        List<String> b = Arrays.asList("Zoro", "Sanji", "Buggy", "Luffy");

        b.stream() ///converts list to stream
        .filter(n -> !n.equals("Buggy")) ///this is the lambda function that uses predicate interface
        .forEach(n -> System.out.println(n)); // this l function uses consumer
        interface

        // --------------Use of predicate--------------------//

        System.out.println();
        Predicate<String> o = n -> n.equals("Luffy");
        System.out.println(o.test("Luffy")); ///test is the method inside
        System.out.println(o.test("Zoro"));

        // --------------Use of Functional Interface --------------------//

        System.out.println();
        Function<String, Integer> f = n -> n.length();
        Function<Integer, Integer> g = n -> n * n;
        Function<String, Integer> h = f.andThen(g); // combine both the functions
        using andThen method
        System.out.println(h.apply("Luffy")); ///apply is the method inside function
        interface

        --------------Use of supplier in functional interface --------------------//

        System.out.println();
        Supplier<Double> s = () -> Math.random(); ///doesnt take any input and return
        any value
        System.out.println(s.get());

        --------------- Real-Life Use Case – Filter Crew Members with Lambda + Predicate-----------//

        List<String> ab = Arrays.asList("mahi", "kohli", "sachin", "steyn", "riyan");
        Predicate<String> pp = n -> !n.equals("riyan");
        ab.stream()
                .filter(pp)
                .forEach(System.out::println);       // use of both lambda and predicate

        
    }

}
