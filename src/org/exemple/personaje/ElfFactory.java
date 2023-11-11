package org.exemple.personaje;

public class ElfFactory implements PersonajFactory {
    @Override
    public Personaj createPersonaj(int age, int[] position, int[] size, String abilities) {
        return new Elf(age, position, size, abilities);
    }

}