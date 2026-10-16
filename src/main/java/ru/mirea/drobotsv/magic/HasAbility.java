package ru.mirea.drobotsv.magic;

import java.util.List;

/**
 * @author wessoonya
 */
public interface HasAbility {
    List<Ability> getAbilities();

    void addAbility(Ability ability);
}
