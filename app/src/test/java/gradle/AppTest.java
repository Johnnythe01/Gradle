package gradle;

import org.junit.jupiter.api.Test;

import gradle.Menu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

class AppTest {
    private Gestion gestion;
    private int idComanda;
    @Test
    void testafegir_Plat() {
        Menu menu = new Menu();
        menu.afegir_plat("Kebab", 5.99);
        String llista = menu.llistar_menu();
        assertTrue(llista.contains("Kebab - 5.99"));
    }
    @Test 
    void testeliminar_Plat(){
        Menu menu = new Menu();
        menu.afegir_plat("Kebab", 5.99);
        menu.eliminar_plat("Kebab");
        String llista = menu.llistar_menu();
        assertFalse(llista.contains("Kebab - 5.99"));
    }
    @Test 
    void testllistar_Menu(){
        Menu menu = new Menu();
        menu.afegir_plat("Kebab", 5.99);
        menu.afegir_plat("Durum", 6.99);
        menu.afegir_plat("Pizza", 9.99);

        String llista = menu.llistar_menu();
        assertTrue(llista.contains("Kebab - 5.99"));
        assertTrue(llista.contains("Durum - 6.99"));
        assertTrue(llista.contains("Pizza - 9.99"));
    }

    @BeforeEach
    void CrearComandasCrear(){
        gestion = new Gestion();
        idComanda = gestion.crear_comanda();
    }
    @Test
    void testAfegirPlatComanda() {
        gestion.afegir_plat_comanda(idComanda, "Kebab");
        gestion.afegir_plat_comanda(idComanda, "Durum");
        gestion.afegir_plat_comanda(idComanda, "Pizza");
        gestion.mostrar_comanda(idComanda);

        assertEquals(3, gestion.mostrar_comanda(idComanda).size() );
    }
    @Test
    void testCalcularTotalComanda() {
        gestion.afegir_plat_comanda(idComanda, "Kebab");
        gestion.afegir_plat_comanda(idComanda, "Durum");
        gestion.afegir_plat_comanda(idComanda, "Pizza");

        assertEquals(22.97, gestion.calcular_total_comanda(idComanda), 0.01);
    }
    @Test
    void testMostrarComanda() {
        gestion.afegir_plat_comanda(idComanda, "Kebab");
        gestion.afegir_plat_comanda(idComanda, "Durum");
        gestion.afegir_plat_comanda(idComanda, "Pizza");

        gestion.mostrar_comanda(idComanda);
    }
}