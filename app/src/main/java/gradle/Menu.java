package gradle;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> plats;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.afegir_plat("Kebab", 5.99);
        String llista = menu.llistar_menu();
        System.out.println(llista);
    }

    public Menu() {
        this.plats = new ArrayList<>();
    }

    public void afegir_plat(String nomPlat, double preu) {
        Plat plat = new Plat(nomPlat, preu);
        plats.add(plat);
    }

    public void eliminar_plat(String nomPlat) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i) == "Kebab") {
                plats.remove(i);
                i--;
            }
        }
    }

    public String llistar_menu() {
        String llista = "";
        for (String plat : plats) {
            llista += plat + "\n";
        }
        return llista;
    }
}