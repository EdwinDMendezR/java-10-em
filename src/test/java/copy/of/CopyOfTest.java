package copy.of;

import org.junit.Test;

import java.util.Arrays;

public class CopyOfTest {

    @Test
    public void methodTest() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] copiaNumeros = Arrays.copyOf(numeros, 3);
    }

}
