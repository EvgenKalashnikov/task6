import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Counter {

    public static void main(String[] args) {
        Integer[] integers ={4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<Integer> integerList = Arrays.asList(integers);
        integerList.stream()
                .distinct()
                .peek(x -> out.print(x+": "))
                .map(k -> integerList.stream().filter(v -> k == v).count()).forEach(out::println);
    }
}
