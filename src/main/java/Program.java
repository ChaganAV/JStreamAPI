import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Digital digital = new Digital();
        List<Integer> listDigit = digital.getList();
//        for (Integer item: listDigit) {
//            System.out.println(item);
//        }
//        listDigit.stream().filter(item -> item%2==0).forEach(System.out::println);
        listDigit.stream().filter(item -> item%2 == 0).forEach(n -> System.out.print(String.valueOf(n)+", "));
        AtomicInteger sum = new AtomicInteger();
        AtomicInteger count = new AtomicInteger();
        listDigit.stream().filter(n -> n%2 == 0)
                .forEach(n -> {
                    sum.addAndGet(n);
                    count.getAndIncrement();
                });
        System.out.println();
        System.out.println(String.valueOf(sum.get()/count.get()));
        System.out.println();
        //IntStream.range(1,150).filter(item -> item%2 == 0).forEach(System.out::println);
        IntStream.range(1,150).filter(item -> item%2 == 0).average().ifPresent(System.out::println);
    }
}
