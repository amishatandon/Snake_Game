import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
	frame.setSize(boardWidth, boardHeight);//frame dimensions
        frame.setLocationRelativeTo(null);//open the window at the center of the frame.
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program will close on clicking x

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();//place the jpanel inside the frame
        snakeGame.requestFocus();
    }
}
