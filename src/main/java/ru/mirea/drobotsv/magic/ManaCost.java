package ru.mirea.drobotsv.magic;

import java.util.Map;

/**
 * @author wessoonya
 */
public class ManaCost {
    private int genericMana;
    private Map<ManaType, Integer> coloredMana;

    public ManaCost(int genericMana, Map<ManaType, Integer> coloredMana) {
        this.genericMana = genericMana;
        this.coloredMana = coloredMana;
    }

    public ManaCost() {
    }

    public int getGenericMana() {
        return genericMana;
    }

    public Map<ManaType, Integer> getColoredMana() {
        return coloredMana;
    }

    @Override
    public String toString() {
        return "ManaCost{" +
                "genericMana=" + genericMana +
                ", coloredMana=" + coloredMana +
                '}';
    }
}
