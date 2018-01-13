package ELP01;

import java.util.ArrayList;
import java.util.List;

public class FibonacciN {
    public int fibonacci(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        for (int i = 1; i < n; i++) {
            sequence.add(sequence.get(i)+sequence.get(i-1));
        }
        return sequence.get(n);
    }
}
