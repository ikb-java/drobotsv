package ru.mirea.drobotsv.magic;

import java.util.List;
import java.util.Map;

/**
 * @author wessoonya
 */
public class MagicApplication {

    public static void main(String[] args) {
        String name = "Goblin Engineer";
        String setTitle = "TSR";
        String oracleText = "When Goblin Engineer enters the battlefield, you may search your library "
                + "for an artifact card, put it into your graveyard, then shuffle. "
                + "{R}, {T}, Sacrifice an artifact: Return target artifact card with mana value 3 or less "
                + "from your graveyard to the battlefield.";
        int power = 1;
        int toughness = 2;

        Ability searchArtifact = new SearchArtifactAbility();
        Ability returnArtifact = new ReturnArtifactAbility();

        CardType cardType = new CardType(SuperType.NONE, "Creature", "Goblin Artificer");
        ManaCost manaCost = new ManaCost(1, Map.of(ManaType.RED, 1));

        CreatureCard card = new CreatureCard(name, manaCost, cardType, setTitle, oracleText,
                power, toughness, List.of(searchArtifact, returnArtifact));

        Student student = new Student("Дробот", "София", "БСБО-53-25", card);

        System.out.println("Студент: " + student.getLastName() + " " + student.getFirstName()
                + ", группа " + student.getGroup());

        CreatureCard studentCard = (CreatureCard) student.getCard();
        System.out.println("Имя существа: " + studentCard.getName());
        System.out.println("Мана-стоимость: " + formatManaCost(studentCard.getManaCost()));

        CardType type = studentCard.getCardType();
        System.out.println("Супертип: " + type.getSuperType());
        System.out.println("Тип: " + type.getType());
        System.out.println("Подтип: " + type.getSubType());

        System.out.print("Способности:");
        for (Ability ability : studentCard.getAbilities()) {
            System.out.print(" " + ability.getClass().getSimpleName() + ";");
        }
        System.out.println();
    }

    private static String formatManaCost(ManaCost manaCost) {
        StringBuilder result = new StringBuilder();
        if (manaCost.getGenericMana() > 0) {
            result.append("{").append(manaCost.getGenericMana()).append("}");
        }
        for (ManaType manaType : ManaType.values()) {
            int count = manaCost.getColoredMana().getOrDefault(manaType, 0);
            for (int i = 0; i < count; i++) {
                result.append("{").append(manaType.getSymbol()).append("}");
            }
        }
        return result.toString();
    }
}
