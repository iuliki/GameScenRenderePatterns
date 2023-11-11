import org.exemple.casa.Casa;
import org.exemple.personaje.*;

public class Main {


    public static void main(String[] args) {
        PersonajFactory elfFactory = new ElfFactory();
        Personaj elf = elfFactory.createPersonaj(100, new int[]{0, 0}, new int[]{2, 3}, "Magie puternică");
        elf.displayInfo();

        PersonajFactory humanFactory = new HumanFactory();
        Personaj human = humanFactory.createPersonaj(30, new int[]{3, 2}, new int[]{3, 4}, "Forță fizică");
        human.displayInfo();


        Tabla tabla = Tabla.getInstance(10, 10); // Crearea sau obținerea instanței unice a clasei Tabla

        int age = 25;
        int[] position = {2, 3}; // Poziția (x, y) pe tablă
        int[] size = {1, 1}; // Dimensiunile personajului
        String abilities = "Viteză mare, putere ridicată";

        Personaj personaj = new Personaj(age, position, size, abilities);

        Personaj personaj1 = new Personaj(100, new int[]{3, 3}, new int[]{4, 4}, "Magie puternică"); // Inițializarea personajului
        Casa casa = new Casa("ciment", new int[]{0, 0}, new int[]{2, 3}); // Inițializarea casei

        tabla.addCharacter(personaj); //
        tabla.addHouse(casa); //
        personaj1.displayInfo();
        casa.getDescription();



    System.out.println("\n Aici e tabla a doua");
        Tabla tabla2 = Tabla.getInstance(10, 10); // Inițializare tabla de joc
        Personaj personaj2 = new Personaj(25, new int[]{2, 3}, new int[]{1, 1}, "Viteză mare, putere ridicată");

        tabla2.addCharacter(personaj2); // Adăugare personaj pe tablă
        tabla2.moveCharacter(personaj2, 5, 5); // Mutare personaj la coordonatele (5, 5)

        Personaj personaj5 = new Personaj(25, new int[]{2, 3}, new int[]{1, 1}, "Viteză mare, putere ridicată");


        Casa casa3 = new Casa("Lemn", new int[]{2, 3}, new int[]{2, 3}); // Inițializare casa

        Personaj personaj3 = new Personaj(25, new int[]{4, 4}, new int[]{1, 1}, "Viteză mare, putere ridicată"); // Inițializare personaj

        tabla2.addHouse(casa3); // Adăugare casa pe tablă
        tabla2.addCharacter(personaj3); // Adăugare personaj pe tablă

        tabla2.render(); // Afișare starea curentă a tablei de joc


    }
}
