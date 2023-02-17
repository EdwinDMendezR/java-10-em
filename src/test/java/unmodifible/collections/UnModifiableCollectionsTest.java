package unmodifible.collections;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnModifiableCollectionsTest {

    @Test
    public void listOfTest() {
        List<String> lista = List.of("Hola", "Mundo", "Java");
        //lista.add("A"); // debe generar error
    }

    @Test
    public void setOfTest() {
        Set<Integer> conjunto = Set.of(1, 2, 3, 4);
        //conjunto.add(2); // debe generar error
    }

    @Test
    public void methodTest() {
        Map<String, Integer> mapa = Map.of("Uno", 1, "Dos", 2, "Tres", 3);
        //mapa.put("A", 11); // debe generar error
    }


}
