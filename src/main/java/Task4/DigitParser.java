package Task4;

import lombok.Getter;

import java.util.*;

public class DigitParser {
    private static class DigitMap {
        private final Map<String, Integer> digitMap;
        private final Locale locale;

        public DigitMap(Locale locale, String ...digits) {
            digitMap = new HashMap<>();
            this.locale = locale;
            int i = 0;
            for (String digit : digits) {
                digitMap.put(digit, i++);
            }
        }

        public int get(String string) {
            Integer result = digitMap.get(string.toLowerCase(locale));
            if (result == null) {
                return -1;
            }
            return result;
        }
    }

    private static final List<DigitMap> digitMapConstructorList = Arrays.asList(
            new DigitMap(Locale.ENGLISH, "0", "1", "2", "3"),
            new DigitMap(Locale.ENGLISH, "zero", "one", "two", "three"),
            new DigitMap(Locale.JAPANESE,"零", "一", "二", "三"),
            new DigitMap(Locale.CHINESE, "零", "일", "이", "삼")
    );

    /**
     * Tries to parse a digit (1..3) from a string
     * @param string String containing a digit.
     * @return the obtained digit, or -1 if procedure failed
     */
    public static int parse(String string) {
        for (DigitMap digitMap : digitMapConstructorList) {
            int digit = digitMap.get(string);
            if (digit != -1) {
                return digit;
            }
        }
        return -1;
    }
}
