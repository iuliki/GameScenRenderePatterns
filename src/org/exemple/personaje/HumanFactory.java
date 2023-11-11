package org.exemple.personaje;

public class HumanFactory implements PersonajFactory {
    @Override
    public Personaj createPersonaj(int age, int[] position, int[] size, String abilities) {
        return new Human(age, position, size, abilities);
    }
}


