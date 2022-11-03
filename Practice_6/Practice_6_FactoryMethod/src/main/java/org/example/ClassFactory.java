package org.example;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Bard".equalsIgnoreCase(type)){
            return new Bard();
        } else if ("Barbarian".equalsIgnoreCase(type)) {
            return new Barbarian();
        }
        return null;
    }
}
