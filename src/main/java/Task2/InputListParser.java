package Task2;

import java.util.List;

public class InputListParser implements StringParser {
    private final List<String> inputList;
    private int index = 0;

    public InputListParser(List<String> inputList) {
        this.inputList = inputList;
    }

    public String next() throws IndexOutOfBoundsException {
        try {
            return inputList.get(index++);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("inputList is to small for next()!");
        }
    }
}
