package baseball;

import baseball.adapter.ConsoleController;

public class Application {
    public static void main(String[] args) {
        new ConsoleController().execute();
    }
}
