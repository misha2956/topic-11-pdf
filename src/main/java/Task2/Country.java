package Task2;

import lombok.Getter;
import lombok.Setter;

public class Country {
    private @Getter @Setter
    String name = "", code = "", alpha2 = "", abbreviation = "";

    public Country() {
    }

    public Country(String name, String code, String alpha2, String abbreviation) {
        this.name = name;
        this.code = code;
        this.alpha2 = alpha2;
        this.abbreviation = abbreviation;
    }

    public void fromStringParser(StringParser inpListParser) throws IndexOutOfBoundsException {
        this.name = inpListParser.next();
        this.code = inpListParser.next();
        this.alpha2 = inpListParser.next();
        this.abbreviation = inpListParser.next();
    }
}
