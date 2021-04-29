public class Car {
    private static final int CAR_NAME_SIZE = 6;
    private String name;
    private int moveCount = 0;

    public Car(String name) {
        carNameValidation(name);
        this.name = name;
    }

    public void move() {
        this.moveCount++;
    }

    private void carNameValidation(String carName) {
        if (carName.length() >= CAR_NAME_SIZE) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하만 가능합니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void printSituation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.name).append(" : ");

        for (int i = 0; i < this.moveCount; i++) {
            stringBuilder.append("-");
        }

        System.out.println(stringBuilder.toString());
    }
}


