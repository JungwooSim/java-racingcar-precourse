import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarTest {

    @Test
    void move() {
        // given
        Car car = new Car("pobi");

        // when
        car.move();

        // then
        assertThat(car.getMoveCount()).isEqualTo(1);
    }

    @Test
    void carNameSizeValidation_fail() {
        assertThrows(IllegalArgumentException.class, () -> new Car("abcdef"));
    }

    @Test
    void carNameSizeValidation_success() {
        // given
        String carName = "abcde";

        // when
        Car car = new Car(carName);

        // then
        assertThat(car.getName()).isEqualTo(carName);
    }

    @Test
    void printSituation() {
        // given
        Car car = new Car("pobi");
        car.move();
        car.move();

        // when
        car.printSituation();
    }
}
