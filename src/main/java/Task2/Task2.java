package Task2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Task2 {
    private @Getter @Setter
    Country country;
    private @Getter @Setter
    Deputy deputy;

    public Task2() {
        country = new Country();
        deputy = new Deputy();
    }

    public void parseInpList(List<String> inputList) throws IndexOutOfBoundsException {
        InputListParser inputListParser = new InputListParser(inputList);
        this.country.fromStringParser(inputListParser);
        this.deputy.fromStringParser(inputListParser);
    }
}
