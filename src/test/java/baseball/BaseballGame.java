package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private final InputCommand input;
    private final List<Integer> answer;

    public BaseballGame(InputCommand input) {
        this.input = input;
        this.answer = new ArrayList(this.input.next());
    }

    public GameRecord play() {
        return GameRecord.report(1, answer);
    }
}
