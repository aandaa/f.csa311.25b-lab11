package game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new TicTacToeServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
