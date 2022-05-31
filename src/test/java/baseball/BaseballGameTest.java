package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {

    @Test
    @DisplayName("1이닝 게임 종료")
    void game_set_first_inning(){
        // given
        FakeInputCommand input = new FakeInputCommand();
        input.add(asList(1,2,3)); // answer
        input.add(asList(1,2,3)); // 첫 번째 이닝

        BaseballGame game = new BaseballGame(input);

        // when
        GameRecord gameRecord = game.play();

        // then
        assertThat(gameRecord.answer()).containsExactlyElementsOf(asList(1,2,3));
        assertThat(gameRecord.lastInning()).isEqualTo(1);
    }
}
