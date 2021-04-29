import org.junit.jupiter.api.Test;

class GameStartTest {

    @Test
    void main() {
        CarRaceGame carRaceGame = new CarRaceGame(new CarCollection(), new CarRaceGamePolicy());

        String inputCarNameString = "pobi,crong,honux";
        for (String carName : inputCarNameString.split(",")) {
            Car car = new Car(carName);
            carRaceGame.carCollection.getCarCollection().add(car);
        }

        String tryCount = "5";

        System.out.println("실행결과");
        for (int i = 0; i < Integer.parseInt(tryCount); i++) {
            carRaceGame.carsTryMove();
            System.out.println("");
        }

        carRaceGame.printCarGameResult();
    }
}
