# 자동차 경주 게임

### 기능 목록
- 자동차 객체 생성 (Car)
  - 자동차 이름과 앞으로 나간 횟수를 기록하는 속성을 갖고 전진과 멈춤, 자동차의 상황을 출력하는 기능을 가지고 있다.
- 게임 정책을 갖는 객체 생성 (CarRaceGamePolicy)
  - 랜던값의 범위 (자동차 경주 게임에서는 0~9)와 자동차의 이동 여부를 판단하는 기능을 가지고 있다.
  - n 대의 자동차를 갖는 객체 생성
- 자동차 게임을 주도하는 객체 생성 (CarRaceGame)
  - 위의 객체들과 협력하는 역할과 자동차 게임 결과를 출력하는 기능을 가지고 있다.
- 게임에 참여하는 자동차들을 갖는 객체 생성 (CarCollection)

<img src="https://github.com/JungwooSim/java-racingcar-precourse/blob/master/img/CarRaceGame-UML.png" width="500px;" />
