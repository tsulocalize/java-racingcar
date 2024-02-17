# java-racingcar

자동차 경주 미션 저장소

## 기능 구현 목록
- [X] 자동차 이름 입력 받는다.
  - 사용자 입력을 받기 전, 입력 메세지를 출력한다.
  - 이름의 길이는 1자 이상, 5자 이하이다.
  - 쉼표를 기준으로 구분한다.
  - 공백이 포함된 입력은 허용하지 않는다.
  - 중복된 이름을 입력할 수 없다.
  - 잘못된 입력 시 재입력을 받는다.
- [x] 시도할 회수를 입력 받는다.
  - 사용자 입력을 받기 전, 입력 메세지를 출력한다.
  - 자연수만 입력할 수 있다.
  - 잘못된 입력 시 재입력을 받는다.
- [x] 조건에 따라 자동차를 움직인다.
  - 0-9 사이의 random 값을 구한 후 4 이상일 경우 전진하고 3이하의 값이면 멈춘다.
  - 자동차의 이동거리는 음수가 될 수 없다. 
- [x] 자동차의 이름과 이동거리를 각 실행 결과로 출력한다.
- [x] 게임 완료 후 누가 우승했는지를 출력한다.
  - 우승자는 한 명 이상일 수 있다.
  