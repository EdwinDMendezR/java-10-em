package optionals;

import org.junit.Test;

import java.util.Optional;

public class OptionalOfNullableTest {

    @Test
    public void antesJava8() {
        Optional<String> optional = Optional.ofNullable(getName());

        String name = optional.orElse("Nombre predeterminado");

        if (name == null) {
            throw new IllegalStateException("El nombre no puede ser nulo");
        }

    }

    private String getName() {
        return null;
    }

    @Test
    public void mejoraJava10() {
        Optional<String> optional = Optional.ofNullable(getName());
        String name = optional.orElseThrow(() -> new IllegalStateException("El nombre no puede ser nulo"));
    }

}
