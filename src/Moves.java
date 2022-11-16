public class Moves {
    private String strMoveName;
    private int intMoveType;
    private boolean isSpecial;
    private int intMovePower;
    private int intMoveAccuracy;

    public Moves(String moveName, int moveType, boolean specialMove, int movePower, int Accuracy){
        this.strMoveName = moveName;
        this.intMoveType = moveType;
        this.isSpecial = specialMove;
        this.intMovePower = movePower;
        this.intMoveAccuracy = Accuracy;
    }
}
