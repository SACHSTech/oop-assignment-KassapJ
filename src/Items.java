public class Items {
    /**
    * A class that holds the information of items a trainer may have
    * @author John Matthew Kassapian
    */

    private String strItemName;
    private int intItemAmount;

    public Items(String name, int amount){
        this.strItemName = name;
        this.intItemAmount = amount;
    }

    /**
    * this method returns the name of this item
    *
    * @param N/A
    * @return String strItemName;
    */
    public String getItemName(){
        return this.strItemName;
    }

    /**
    * this method sets the name of this item
    *
    * @param String x, which is the name to give this item
    * @return N/A
    */
    public void setItemName(String x){
        this.strItemName = x;
    }

    /**
    * this method returns the amount of this item that exists
    *
    * @param N/A
    * @return int intItemAmount;
    */
    public int getItemAmount(){
        return this.intItemAmount;
    }

    /**
    * this method sets the amount of this item
    *
    * @param int x, which is the amount of this item to exist
    * @return N/A
    */
    public void setItemAmount(int x){
        this.intItemAmount = x;
    }

        
}

