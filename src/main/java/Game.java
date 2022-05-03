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
    /**a flowchart table for all the rock paper scissors
     * match-ups,returns game result based on the two moves
     * 1 for player 1 win
     * 2 for player 2 win
     * 3 for tie
     * 4-7 for errors on each step
     * @param Move1
     * @param Move2
     * @return gameResult
     */
    /*
    public int Game(Move Move1, Move Move2)
    {
        int gameResult;
        if(Move1.equals(Move.Rock))
        {
            if(Move2.equals(Move.Rock)) { gameResult = 3; }
            else if(Move2.equals(Move.Paper)) { gameResult = 2; }
            else if(Move2.equals(Move.Scissors)) { gameResult = 1; }
            else { gameResult = 4; }
        }
        else if(Move1.equals(Move.Paper))
        {
            if(Move2.equals(Move.Rock)) { gameResult = 1; }
            else if(Move2.equals(Move.Paper)) { gameResult = 3; }
            else if(Move2.equals(Move.Scissors)) { gameResult = 2; }
            else { gameResult = 5; }
        }
        else if(Move1.equals(Move.Scissors))
        {
            if(Move2.equals(Move.Rock)) { gameResult = 2; }
            else if(Move2.equals(Move.Paper)) { gameResult = 1; }
            else if(Move2.equals(Move.Scissors)) { gameResult = 3; }
            else { gameResult = 6; }
        }
        else { gameResult = 7; }
        return gameResult;
    }

     */
}
