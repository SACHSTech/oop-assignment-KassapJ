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

    public String getItemName(){
        return this.strItemName;
    }

    public void setItemName(String x){
        this.strItemName = x;
    }

    public int getItemAmount(){
        return this.intItemAmount;
    }

    public void setItemAmount(int x){
        this.intItemAmount = x;
    }

        
}

