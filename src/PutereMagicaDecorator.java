import org.exemple.personaje.AbilitateDecorata;
import org.exemple.personaje.Personaj;

public class PutereMagicaDecorator implements AbilitateDecorata {
    private Personaj personaj;

    public PutereMagicaDecorator(Personaj personaj) {
        this.personaj = personaj;
    }

    @Override
    public String getAbilitate() {
        return personaj.getAbilitate() + " cu putere magica";
    }


    public int getAge() {
        return personaj.getAge();
    }


    public int[] getPosition() {
        return personaj.getPosition();
    }


}
