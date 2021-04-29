import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String inputCarNameString = scan.nextLine();

        CarRaceGame carRaceGame = new CarRaceGame(new CarCollection(), new CarRaceGamePolicy());

        for (String carName : inputCarNameString.split(",")) {
            Car car = new Car(carName);
            carRaceGame.carCollection.getCarCollection().add(car);
        }

        System.out.println("시도할 횟수는 몇회인가요?");
        String tryCount = scan.nextLine();

        for (int i = 0; i < Integer.parseInt(tryCount); i++) {
            carRaceGame.carsTryMove();
            System.out.println("");
        }

        carRaceGame.printCarGameResult();
    }
}
