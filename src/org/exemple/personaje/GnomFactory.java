package org.exemple.personaje;

public class GnomFactory implements PersonajFactory {
    @Override
    public Personaj createPersonaj(int age, int[] position, int[] size, String abilities) {
        return new Gnom(age, position, size, abilities);
    }
}