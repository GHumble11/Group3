public class Game
{
    private String gameOutcome = "";
    String[][] resultsArray = new String[3][3];

    public Game(int p1, int p2)
    {
        resultsArray [0][0] = "No Winner"; //Draw
        resultsArray [0][1] = "Player Two Wins"; //PLAYER 2 WINS
        resultsArray [0][2] = "Player One Wins"; //PLAYER 1 WINS
        resultsArray [1][0] = "Player One Wins";
        resultsArray [1][1] = "No Winner";
        resultsArray [1][2] = "Player Two Wins";
        resultsArray [2][0] = "Player Two Wins";
        resultsArray [2][1] = "Player One Wins";
        resultsArray [2][2] = "No Winner";

        this.gameOutcome = resultsArray[p1][p2];
    }

    public String getGame()
    {
        return this.gameOutcome;
    }
}
