package ELP01;

import java.util.ArrayList;
import java.util.List;

public class BitOrder {

    public int[] solution(int[] A) {
        int returnValue = 0;
        for (int i = 0; i < A.length; i++) {
            returnValue += A[i]*Math.pow(-2, i);
        }
        returnValue += 1;

        return ToNegabinary(returnValue);
    }


    private int[] ToNegabinary(int value)
    {
        List<Integer> result = new ArrayList<>();

        while (value != 0)
        {
            int remainder = value % -2;
            value = value / -2;

            if (remainder < 0)
            {
                remainder += 2;
                value += 1;
            }

            result.add(remainder);
        }

        int[] resultArray = new int[result.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }


}
