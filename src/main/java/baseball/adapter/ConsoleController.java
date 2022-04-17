package baseball.adapter;

import baseball.domain.BaseballCount;
import baseball.domain.BaseballService;
import baseball.domain.Session;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleController {
    private final BaseballService baseballService = new BaseballService();

    public void execute() {
        Session session = new Session();
        while (!session.isOut()) {
            System.out.print("숫자를 입력해주세요 : ");
            BaseballCount baseballCount = baseballService.play(Console.readLine(), session);
            System.out.println(baseballCount.toString());
            checkCorrectness(baseballCount, session);
        }
        System.out.println("게임 종료");
    }

    private void checkCorrectness(BaseballCount baseballCount, Session session) {
        if (baseballCount.isCorrect()) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            session.setStatus(Console.readLine());
        }
    }
}
