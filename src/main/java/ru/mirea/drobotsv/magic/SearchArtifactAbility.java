package ru.mirea.drobotsv.magic;

/**
 * @author wessoonya
 */
public class SearchArtifactAbility implements Ability {
    private final String name = "Search Artifact";

    public SearchArtifactAbility() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void activate() {
    }

    @Override
    public String toString() {
        return "SearchArtifactAbility{" +
                "name='" + name + '\'' +
                '}';
    }
}
