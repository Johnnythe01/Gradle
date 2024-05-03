package gradle;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> plats;

    public Menu() {
        this.plats = new ArrayList<>();
    }

    public void afegir_plat(String nomPlat, double preu) {
        String plat = nomPlat + " - " + preu;
        plats.add(plat);
    }

    public void eliminar_plat(String plat) {
            
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i) == "kebab") {
                plats.remove(i);
                i--;
            }
        }
    }

    public String llistar_menu() {
        String llista = "";
        for (String plat : plats) {
            llista += plat +  "\n";
        }
        return llista;
    }
}