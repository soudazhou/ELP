import ELP01.BitOrder;
import ELP01.HighestTempSeason;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

//    public static boolean solution(int[] A) {
//
//        int[] originalA = A.clone();
//        Arrays.sort(A);
//        int count = 0;
//        for(int i = 0; i < A.length; i++) {
//            if(A[i] != originalA[i]) {
//                count++;
//            }
//
//            if (count > 2){
//                return false;
//            }
//        }
//        return true;
//    }



    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        FibonacciN fibonacciN = new FibonacciN();
//        System.out.println(fibonacciN.fibonacci(0));
        BitOrder bt = new BitOrder();
        System.out.println(bt.solution(new int[]{1, 0, 1}));


    }
}
