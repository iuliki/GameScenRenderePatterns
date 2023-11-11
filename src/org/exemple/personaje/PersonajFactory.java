package org.exemple.personaje;

public interface PersonajFactory {
    Personaj createPersonaj(int age, int[] position, int[] size, String abilities);
}
