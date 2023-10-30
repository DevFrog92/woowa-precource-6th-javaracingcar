package racingcar.domain.judgement;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.RacingCar;

class RacingJudgementTest {
        @Test
        @DisplayName("성공: 우승자를 콘솔에 촐력")
        void call_announcementWinner_will_print_winners() {
                //given
                Judgement judgement = new RacingJudgement();
                List<Car> carList = Arrays.asList(
                        new RacingCar("carA", null),
                        new RacingCar("carB", null),
                        new RacingCar("carC", null)
                );

                OutputStream out = new ByteArrayOutputStream();
                System.setOut(new PrintStream(out));

                //when
                judgement.announcementWinner(carList);

                //then
                assertThat(out.toString().strip()).isEqualTo("최종 우승자 : carA,carB,carC");
        }
}
