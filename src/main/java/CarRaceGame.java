import java.util.ArrayList;
import java.util.List;

public class CarRaceGame {
    CarCollection carCollection;
    CarRaceGamePolicy carRaceGamePolicy;
    int maxMoveCount = 0;

    public CarRaceGame(CarCollection carCollection, CarRaceGamePolicy carRaceGamePolicy) {
        this.carCollection = carCollection;
        this.carRaceGamePolicy = carRaceGamePolicy;
    }

    public void carsTryMove() {
        for (Car car : carCollection.getCarCollection()) {
            if (carRaceGamePolicy.isMove()) {
                car.move();

                changeMaxMoveCount(car);
            }
            car.printSituation();
        }
    }

    public void printCarGameResult() {
        StringBuilder resultText = new StringBuilder();
        List<String> winCars = new ArrayList<>();
        for (Car car : carCollection.getCarCollection()) {
            if (maxMoveCount <= car.getMoveCount()) {
                winCars.add(car.getName());
            }
        }
        resultText.append(String.join(",", winCars));
        resultText.append("가 최종우승했습니다.");

        System.out.println(resultText.toString());
    }

    private void changeMaxMoveCount(Car car) {
        if (maxMoveCount < car.getMoveCount()) {
            maxMoveCount = car.getMoveCount();
        }
    }
}
