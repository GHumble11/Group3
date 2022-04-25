public class Game
{
    /**a flowchart table for all the rock paper scissors
     * matchups,returns game result based on the two moves
     * 0 for an error or insufficient data
     * 1 for player 1 win
     * 2 for player 2 win
     * 3 for tie
     * @param Move1
     * @param Move2
     * @return
     */
    public int play(Move Move1, Move Move2)
    {
        int gameResult;
        switch (Move1)
        {
            case Rock:
                switch (Move2)
                {
                    case Rock:
                        gameResult = 3;
                        break;
                    case Paper:
                        gameResult = 2;
                        break;
                    case Scissors:
                        gameResult = 1;
                        break;
                    default:
                        gameResult = 0;
                        break;
                }
            case Paper:
                switch (Move2)
                {
                    case Rock:
                        gameResult = 1;
                        break;
                    case Paper:
                        gameResult = 3;
                        break;
                    case Scissors:
                        gameResult = 2;
                        break;
                    default:
                        gameResult = 0;
                        break;
                }
            case Scissors:
                switch (Move2)
                {
                    case Rock:
                        gameResult = 2;
                        break;
                    case Paper:
                        gameResult = 1;
                        break;
                    case Scissors:
                        gameResult = 3;
                        break;
                    default:
                        gameResult = 0;
                        break;
                }
            default:
                gameResult = 0;
                break;
        }
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
