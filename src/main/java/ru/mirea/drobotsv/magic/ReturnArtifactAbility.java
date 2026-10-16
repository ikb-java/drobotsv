package ru.mirea.drobotsv.magic;

/**
 * @author wessoonya
 */
public class ReturnArtifactAbility implements Ability {
    private final String name = "Return Artifact";

    public ReturnArtifactAbility() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void activate() {
    }

    @Override
    public String toString() {
        return "ReturnArtifactAbility{" +
                "name='" + name + '\'' +
                '}';
    }
}
