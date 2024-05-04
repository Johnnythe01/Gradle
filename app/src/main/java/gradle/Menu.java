package gradle;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> plats;
    private List<Double> preus;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.afegir_plat("Kebab", 5.99);
        String llista = menu.llistar_menu();
        System.out.println(llista);
    }

    public Menu() {
        this.plats = new ArrayList<>();
        this.preus = new ArrayList<>();
    }

    public void afegir_plat(String nomPlat, double preu) {
        plats.add(nomPlat);
        preus.add(preu);
    }

    public void eliminar_plat(String nomPlat) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).equals(nomPlat)) {
                plats.remove(i);
                preus.remove(i);
                i--;
            }
        }
    }

    public String llistar_menu() {
        String llista = "";
        for (int i = 0; i < plats.size(); i++) {
            llista += plats.get(i) + " - " + preus.get(i) + "\n";
        }
        return llista;
    }

    public double getPrecioPlato(String nomPlat) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).equals(nomPlat)) {
                return preus.get(i);
            }
        }
        return 0;
    }
}