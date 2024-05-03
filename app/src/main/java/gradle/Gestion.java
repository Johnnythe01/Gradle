package gradle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Gestion {

    Map<Integer, List<String>> comanda;

    // public Gestion(){ 
    // this.comanda = new HashMap<>();
    // }

    public int crear_comanda() {
        Random random = new Random();
        int idComanda = random.nextInt(100);
        // comanda.get(idComanda);
        return idComanda;
    }

    public void afegir_plat_comanda(int  idComanda, String nomPlat) {
        // comanda.get(idComanda).add(nomPlat);
    }

	public void mostrar_comanda(int idComanda) {
        // for (String nomPlat : comanda.get(idComanda)){
        //  System.out.println(comanda);
        // }
	}

    public double calcular_total_comanda(int idComanda) {
        double total = 0.0;
        total = total + precioPorPlato("Kebab"); 
        total = total + precioPorPlato("Durum");
        total = total + precioPorPlato("Pizza");

        return total;
    }
    private double precioPorPlato(String precios){
        if (precios.equals("Kebab")) {
            return 5.99;
        } else if (precios.equals("Durum")){
            return 6.99;
        } else if (precios.equals("Pizza")){
            return 9.99;
        } else {
            return 0;
        }
    }
}
