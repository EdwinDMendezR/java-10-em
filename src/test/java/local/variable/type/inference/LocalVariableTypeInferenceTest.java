package local.variable.type.inference;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalVariableTypeInferenceTest {

    @Test
    public void methodTest() {
        // Declaración explícita de la variable de tipo String
        String mensaje = "Hola, mundo!";
        System.out.println(mensaje);

        // Declaración de la misma variable utilizando inferencia de tipos mejorada
        var mensaje2 = "Hola, mundo!";
        System.out.println(mensaje2);

        // Ejemplo de uso de inferencia de tipos con una expresión compleja
        var listaNombres = new ArrayList<String>(Arrays.asList("Juan", "Pedro", "Maria"));
        System.out.println(listaNombres);

    }

}
