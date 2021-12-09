package Task4;

import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(parseResults(Collections.singletonList("三")));
    }

    static int parseResults(List<String> results) {
        int number = -1;
        for (String res : results) {
            number = DigitParser.parse(res);
            if (number != -1) {
                break;
            }
        }
        return number;
    }

}
