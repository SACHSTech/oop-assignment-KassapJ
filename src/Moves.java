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

    public String getMoveName(){
        return this.strMoveName;
    }
    public void setMoveName(String x){
        this.strMoveName = x;
    }
    
    public int getMoveType(){
        return this.intMoveType;
    }

    public void setMoveType(int x){
        this.intMoveType = x;
    }
    
    public boolean getIsSpecial(){
        return this.isSpecial;
    }

    public void setIsSpecial(boolean x){
        this.isSpecial = x;
    }
    
    public int getMovePower(){
        return this.intMovePower;
    }

    public void setMovePower(int x){
        this.intMovePower = x;
    }
    
    public int getMoveAccuracy(){
        return this.intMoveAccuracy;
    }

    public void setMoveAccuracy(int x){
        this.intMoveAccuracy = x;
    }
}
