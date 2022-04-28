public class Game
{
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
}
