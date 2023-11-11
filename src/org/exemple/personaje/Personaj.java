package org.exemple.personaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Personaj implements AbilitateDecorata {
    private int age;
    private int[] position;
    private int[] size;
    private String abilities;

    private int length;
    private int width;
    private List<Personaj> characters; // Listă de personaje

    public Personaj() {

        this.characters = new ArrayList<>(); // Inițializează lista de personaje
    }

    public Personaj(int age, int[] position, int[] size, String abilities) {
        this.age = age;
        this.position = position;
        this.size = size;
        this.abilities = abilities;
    }
    public String getAbilitate() {
        return abilities;
    }


    public int getAge() {
        return age;
    }


    public int[] getPosition() {
        return position;
    }

    public void moveTo(int x, int y) {
        // Verificăm dacă noua poziție este validă pe tablă
        if (x >= 0 && x < this.width && y >= 0 && y < this.length) {
            // Verificăm dacă noua poziție este liberă
            boolean positionOccupied = characters.stream().anyMatch(ch ->
                    ch != this && Arrays.equals(ch.getPosition(), new int[]{x, y}));


            if (!positionOccupied) {
                this.position[0] = x;
                this.position[1] = y;
                System.out.println("Character moved to position (" + x + ", " + y + ")");
            } else {
                System.out.println("Position (" + x + ", " + y + ") is occupied. Can't move.");
            }
        } else {
            System.out.println("Invalid position. Can't move the character.");
        }
    }

  
    public void displayInfo() {

            System.out.println("Age: " + age);
            System.out.println("Position: (" + position[0] + ", " + position[1] + ")");
            System.out.println("Size: (" + size[0] + ", " + size[1] + ")");
            System.out.println("Abilities: " + abilities);


    }


    public int[] getSize() {
        return size;
    }

    public String getAbilities() {
        return abilities;
    }
}
