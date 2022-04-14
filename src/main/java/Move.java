/* List of potential moves the player can take */
public enum Move {
    Rock (),          // move option for throwing rock
    Paper (1),         // move option for throwing paper
    Scissors (2);      // move option for throwing scissors

    private final Move losingMove;

    Move(Move losingMove) {this.losingMove = losingMove;}

    public Move getLosingMove() {return losingMove;}
}
