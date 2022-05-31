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
        int inning = 0;
        while(true){
            ++inning;
            final Score score = Score.calculate(answer, input.next());
            if(score.isGameSet())
                return GameRecord.report(inning, answer);
        }
    }
}
