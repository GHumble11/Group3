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
    public int play(Move Move1, Move Move2)
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

    /** takes a number of rounds and runs
     * that many rounds, calling play
     * every round and taking note of the total
     * tally for both players
     * does NOT advance the round counter if a tie
     * is detected
     * @param rounds
     * @return
     */
    public String gameManager(int rounds)
    {
        //placeholder move values until inputting moves with UI is fully implemented
        Move p1 = Move.Paper;
        Move p2 = Move.Rock;

        /**values for our game score
         *
         */
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < rounds;)
        {
            switch (play(p1, p2))
            {
                case 1:
                    System.out.println("Player 1 wins this round");
                    s1++;
                    i++;
                    break;
                case 2:
                    System.out.println("Player 2 wins this round");
                    s2++;
                    i++;
                    break;
                case 3:
                    System.out.println("Tie, please play again for this rounds score");
                    break;
                default:
                    System.out.println("Error occurred in play, please retry");
                    break;
            }
        }

        if (s1 > s2)
        {
            return("Player 1 wins this game with a score of" + s1 + "-" + s2);
        }
        else if (s2 > s1)
        {
            return("Player 2 wins this game with a score of" + s1 + "-" + s2);
        }
        else
            return("Game results not reached correctly, please try again");
    }
}
