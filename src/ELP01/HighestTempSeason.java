package ELP01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestTempSeason {

    public String solution(int[] T) {
        int seasonSize = T.length / 4;

        List<List<Integer>> temp = new ArrayList<>();
        temp.add(new ArrayList<>());
        temp.add(new ArrayList<>());
        temp.add(new ArrayList<>());
        temp.add(new ArrayList<>());
        List<Integer> ampl = new ArrayList<>();
        int tempCount = 0;
        for (int i = 0; i < T.length; i = i + seasonSize) {
            for (int j = 0; j < seasonSize; j++) {
                temp.get(tempCount).add(T[i + j]);
            }
            tempCount++;
        }

        for (int i = 0; i < temp.size(); i++) {
            ampl.add(highestAmpl(temp.get(i)));
        }

        int maxIndex = 0;
        for(int i = 1; i < ampl.size(); i++) {
            if(ampl.get(i) > ampl.get(i-1)) {
                maxIndex = i;
            }
        }

        if(maxIndex == 0) {
            return "WINTER";
        } else if (maxIndex == 1) {
            return "SPRING";
        } else if (maxIndex == 2) {
            return "SUMMER";
        } else if (maxIndex == 3) {
            return "AUTUMN";
        }
        return "WINTER";
    }


    private int highestAmpl(List<Integer> a) {
        int max = Collections.max(a);
        int min = Collections.min(a);
        return max - min;
    }
}
