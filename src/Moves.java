public class Moves {
    /**
    * A class that holds the data of a pokemon's moves.
    * @author John Matthew Kassapian
    */
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

    /**
    * this method returns the name of this move
    *
    * @param N/A
    * @return String strMoveName;
    */
    public String getMoveName(){
        return this.strMoveName;
    }

    /**
    * this method sets the name of this move.
    *
    * @param String x, that is the name we want to give the move
    * @return N/A
    */
    public void setMoveName(String x){
        this.strMoveName = x;
    }
    
    /**
    * this method returns the int value that represents this moves type
    *
    * @param N/A
    * @return String strMoveType;
    */
    public int getMoveType(){
        return this.intMoveType;
    }

    /**
    * this method sets the type of this move
    *
    * @param int x, which is the type this move should have
    * @return N/A
    */
    public void setMoveType(int x){
        this.intMoveType = x;
    }   
    
    /**
    * this method returns the boolean value that represents this moves special property
    *
    * @param N/A
    * @return boolean isSpecial;
    */
    public boolean getIsSpecial(){
        return this.isSpecial;
    }

    /**
    * this method sets special property of this move
    *
    * @param boolean x
    * @return N/A
    */
    public void setIsSpecial(boolean x){
        this.isSpecial = x;
    }
    
    /**
    * this method returns the int value of this move's power stat
    *
    * @param N/A
    * @return int intMovePower;
    */
    public int getMovePower(){
        return this.intMovePower;
    }

    /**
    * this method sets this move's power stat
    *
    * @param int x which is the power stat we want this move to have
    * @return N/A
    */
    public void setMovePower(int x){
        this.intMovePower = x;
    }
    
    /**
    * this method returns the int value of this move's accuracy stat
    *
    * @param N/A
    * @return int intMoveAccuracy;
    */
    public int getMoveAccuracy(){
        return this.intMoveAccuracy;
    }

    /**
    * this method sets this move's accuracy stat
    *
    * @param int x which is the accuracy stat we want this move to have
    * @return N/A
    */
    public void setMoveAccuracy(int x){
        this.intMoveAccuracy = x;
    }
}
