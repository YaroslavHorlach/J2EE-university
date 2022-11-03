package org.example;

import java.util.TreeMap;

public interface DataElementsVisitor {
    public TreeMap visit (Character ch);
    public TreeMap visit (CharacterClass cl);
    public TreeMap visit(CharacterRace cr);
    public TreeMap visit (Stats st);
}
