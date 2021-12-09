package Task2;

import lombok.Getter;
import lombok.Setter;

public class Deputy {
    private @Getter
    @Setter
    String year = "", politicalCompatibility = "", rankPoliticalCompatibility = "",
            economicCompatibility = "", rankEconomicCompatibility = "";

    public Deputy() {
    }

    public Deputy(String year, String politicalCompatibility, String rankPoliticalCompatibility,
                  String economicCompatibility, String rankEconomicCompatibility) {
        this.year = year;
        this.politicalCompatibility = politicalCompatibility;
        this.rankPoliticalCompatibility = rankPoliticalCompatibility;
        this.economicCompatibility = economicCompatibility;
        this.rankEconomicCompatibility = rankEconomicCompatibility;
    }

    public void fromStringParser(StringParser inpListParser) throws IndexOutOfBoundsException {
        this.year = inpListParser.next();
        this.politicalCompatibility = inpListParser.next();
        this.rankPoliticalCompatibility = inpListParser.next();
        this.economicCompatibility = inpListParser.next();
        this.rankEconomicCompatibility = inpListParser.next();
    }
}
