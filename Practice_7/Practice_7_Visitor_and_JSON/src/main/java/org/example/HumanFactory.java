package org.example;

import java.util.HashMap;

public class HumanFactory implements RaceAbstractFactory {
    HashMap<String,Stats> humenTypes = new HashMap<>();

    public Human create(String type) {
        if (humenTypes.isEmpty()) {
            humenTypes.put("Human", new Stats(1,1,1,1,1,1));
        }

        return new Human(type, humenTypes.get(type));
    }
}
