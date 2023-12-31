# 자동차 경주 게임

자동차 경주 게임은 주어진 laps 동안 n 대의 자동차가 경주를 하는 게임이다. 
게임의 규칙은 다음과 같다.

### 자동차 경주 규칙
- laps 동안 자동차는 전진 또는 멈출 수 있다. 
- 자동차는 각 laps 에 임의의 값을 선택한다.
  - 만약, 선택한 값이 4 이상이면 1의 거리만큼 전진한다.
  - 만약, 선택한 값이 4 미만일 경우 자동차는 전진하지 못하고 멈춘다.

## 기능 요구 사항

### 자동차 게임
- 게임을 시작한다.
- 게임에 참여할 자동차를 준비한다.
  - 자동차의 이름은 플레이어의 입력에 기반한다.
- 게임을 종료한다.
  - 모든 laps 를 수행했다면 게임을 종료한다.
  - 게임을 종료할 때, 우승자를 콘솔에 출력한다.
    - 만약 우승자가 한명이 아닐 경우, 쉼표(,)를 이용하여 구분한다.
    ```shell
      $ mario,luffy,zeeg 
    ```

### 플레이어
- 자동차 경주의 laps 를 입력할 수 있다.
- 자동차 경주에 참여할 자동차 이름을 입력할 수 있다.
  - 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
  - 만약 다음과 같은 상황에서는 예외가 발생한다.
    - 5자를 초과하면 `IllegalArgumentException` 예외가 발생한다.
    - 음수를 입력하면 `IllegalArgumentException` 예외가 발생한다.
    - BigInteger 의 범위를 넘어가는 수를 입력하면 `NumberFormatException` 예외가 발생한다.

### 자동차
- 0에서 9사이에서 임의의 숫자를 무작위로 선택할 수 있다.
- 전진할 수 있다.
  - 무작위 값이 4 이상일 경우이다.

### 자동차 경주 로거
- 자동차 경주의 중간 진행사항을 콘솔에 출력할 수 있다.


## 입출력 요구 사항

#### 입력

- 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)

```
pobi,woni,jun
```

- 시도할 회수

```
5
```

#### 출력

- 각 차수별 실행 결과

```
pobi : --
woni : ----
jun : ---
```

- 단독 우승자 안내 문구

```
최종 우승자 : pobi
```

- 공동 우승자 안내 문구

```
최종 우승자 : pobi, jun
```

#### 실행 결과 예시

```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자 : pobi, jun
```
