package copy.of;

import org.junit.Test;

import java.util.Arrays;

public class CopyOfTest {

    @Test
    public void arrayscopyOf() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] copiaNumeros = Arrays.copyOf(numeros, 3);
    }

    @Test
    public void arrayscopyOfModify() {
        int[] numeros = {1, 2, 3, 4, 5, 0};
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        numeros[5]=6;
    }

}

