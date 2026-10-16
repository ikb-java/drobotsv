package ru.mirea.drobotsv.magic;

/**
 * @author wessoonya
 */
public enum ManaType {
    WHITE("W"),
    BLUE("U"),
    BLACK("B"),
    RED("R"),
    GREEN("G"),
    COLORLESS("C");

    private final String symbol;

    ManaType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "ManaType{" +
                "symbol='" + symbol + '\'' +
                '}';
    }
}
