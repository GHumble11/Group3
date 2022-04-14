/* List of potential moves the player can take */
public enum Move {
    Rock (0, 2),          // move option for throwing rock
    Paper (1, 0),         // move option for throwing paper
    Scissors (2, 1);      // move option for throwing scissors

    private final int thisMove;
    private final int losingMove;


    Move(int thisMove, int losingMove) {
        this.thisMove = thisMove;
        this.losingMove = losingMove;
    }

    public int getThisMove() {return this.thisMove;}
    public int getLosingMove() {return this.losingMove;}
}
