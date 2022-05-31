package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculateScoreTest {
    @Test
    @DisplayName("아웃")
    void out(){
        // given
        final List<Integer> answer = Arrays.asList(1, 2, 3);
        final List<Integer> query = Arrays.asList(5, 8, 9);

        // when
        final Score score = Score.calculate(answer, query);

        // then
        Assertions.assertThat(score.strike()).isEqualTo(0);
        Assertions.assertThat(score.ball()).isEqualTo(0);
        Assertions.assertThat(score.isOut()).isEqualTo(true);
    }
}
