
import org.exemple.casa.Casa;
import org.exemple.personaje.Personaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Tabla {
    private int width;
    private int length;
    private List<Casa> houses; // List to hold houses
    private List<Personaj> characters; // List to hold characters
    private static Tabla instance; // Instanță Singleton

    private Tabla(int width, int length) {
        this.width = width;
        this.length = length;
        this.houses = new ArrayList<>();
        this.characters = new ArrayList<>();
    }

    public static Tabla getInstance(int width, int length) {
        if (instance == null) {
            instance = new Tabla(width, length);
        }
        return instance;
    }

    public void render() {
        System.out.println("Tabla de joc:");

        // Afișarea caselelor
        System.out.println("Case:");
        for (Casa casa : houses) {
            System.out.println("Material: " + casa.getMaterial());
            System.out.println("Poziție: (" + casa.getPosition()[0] + ", " + casa.getPosition()[1] + ")");
            System.out.println("Dimensiuni: " + casa.getSize()[0] + " x " + casa.getSize()[1]);
            System.out.println("---");
        }

        // Afișarea personajelor
        System.out.println("Personaje:");
        for (Personaj personaj : characters) {
            System.out.println("Vârstă: " + personaj.getAge());
            System.out.println("Poziție: (" + personaj.getPosition()[0] + ", " + personaj.getPosition()[1] + ")");
            System.out.println("Dimensiuni: " + personaj.getSize()[0] + " x " + personaj.getSize()[1]);
            System.out.println("Abilități: " + personaj.getAbilities());
            System.out.println("---");
        }

    }

    public void addCharacter(Personaj character) {
        int[] position = character.getPosition();
        if (!isPositionOccupied(position[0], position[1])) {
            characters.add(character);
        } else {
            System.out.println("Pozitia este deja ocupata!");
        }
    }

    public void addHouse(Casa house) {
        int[] position = house.getPosition();
        if (!isPositionOccupied(position[0], position[1])) {
            houses.add(house);
        } else {
            System.out.println("Pozitia este deja ocupata!");
        }
    }

    public void moveCharacter(Personaj character, int x, int y) {
        // Verificăm dacă noua poziție este validă pe tablă
        if (x >= 0 && x < width && y >= 0 && y < length) {
            // Verificăm dacă noua poziție este liberă
            boolean positionOccupied = characters.stream().anyMatch(ch -> ch != character && Arrays.equals(ch.getPosition(), new int[]{x, y}));

            if (!positionOccupied) {
                character.moveTo(x, y); // Mutăm personajul la noua poziție
                System.out.println("Character moved to position (" + x + ", " + y + ")");
            } else {
                System.out.println("Position (" + x + ", " + y + ") is occupied. Can't move.");
            }
        } else {
            System.out.println("Invalid position. Can't move the character.");
        }
    }
    public boolean isPositionOccupied(int x, int y) {
        boolean positionOccupied = characters.stream().anyMatch(ch -> Arrays.equals(ch.getPosition(), new int[]{x, y}));
        positionOccupied = positionOccupied || houses.stream().anyMatch(h -> Arrays.equals(h.getPosition(), new int[]{x, y}));
        return positionOccupied;
    }
}
