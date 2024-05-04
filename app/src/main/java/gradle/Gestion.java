package gradle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestion {
    private Map<Integer, List<String>> comandas;
    private Menu menu;

    public Gestion() {
        this.comandas = new HashMap<>();
        this.menu = new Menu();
    }

    public int generarNuevoIdComanda() {
        return comandas.size() + 1;
    }

    public int crear_comanda() {
        int nuevoIdComanda = generarNuevoIdComanda();
        comandas.put(nuevoIdComanda, new ArrayList<>());
        return nuevoIdComanda;
    }

    public void afegir_plat_comanda(int idComanda, String nomPlat) {
        if (comandas.containsKey(idComanda)) {
            List<String> platos = comandas.get(idComanda);
            platos.add(nomPlat);
            comandas.put(idComanda, platos);
        }
    }

    public List<String> mostrar_comanda(int idComanda) {
        if (comandas.containsKey(idComanda)) {
            List<String> platos = comandas.get(idComanda);
            return platos;
        }
        return new ArrayList<>();
    }

    public double calcular_total_comanda(int idComanda) {
            List<String> comanda = comandas.get(idComanda);
            double total = 0;
            for (String plat : comanda) {
                total += menu.getPrecioPlato(plat);
            }
            return total;
    }
}