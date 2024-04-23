package gradle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestion {
    private Map<Integer, List<String>> comandas;

    public Gestion() {
        this.comandas = new HashMap<>();
    }

    public int crear_comanda() {
        int nuevoIdComanda = generarNuevoIdComanda();
        comandas.put(nuevoIdComanda, new ArrayList<>());
        return nuevoIdComanda;
    }

    public void afegir_plat_comanda(int idComanda) {
        if (comandas.containsKey(idComanda)) {
            List<String> platos = comandas.get(idComanda);
            platos.add(nomPlat);
            comandas.put(idComanda, platos);
        }
    }

    public void mostrar_comanda(int idComanda) {
        if (comandas.containsKey(idComanda)) {
            System.out.println("Platos de la comanda " + idComanda + ":");
            List<String> platos = comandas.get(idComanda);
            for (String plat : platos) {
                System.out.println(plat);
            }
        }
    }

    public double calcular_total_comanda(int idComanda) {
        if (comandas.containsKey(idComanda)) {
            List<String> platos = comandas.get(idComanda);
            double total = 0;
            for (String plat : platos) {
                double precio = Menu.getPrecioPlato(plat);
                total += precio;
            }
            return total;
        }
    }
}