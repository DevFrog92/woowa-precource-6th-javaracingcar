package racingcar.util;

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

class RaceProgressLoggerTest {
        @Test
        @DisplayName("성공: 자동차들의 이름과 이동거리를 출력")
        void call_printLog_will_print_car_distance() {
                //given
                List<Car> carList = Arrays.asList(
                        new RacingCar("carA", null),
                        new RacingCar("carB", null),
                        new RacingCar("carC", null)
                );

                OutputStream out = new ByteArrayOutputStream();
                System.setOut(new PrintStream(out));

                //when
                RaceProgressLogger.printLog(carList);

                //then
                assertThat(out.toString().substring(0, out.toString().length() - 1))
                        .isEqualTo("carA : \ncarB : \ncarC : ");
        }
}
