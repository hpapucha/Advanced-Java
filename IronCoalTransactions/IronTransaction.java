//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019

public class IronTransaction extends Transaction {
    //Defining private variables for Iron, quality and IronWeight
    public int quality;
    public double IronWeight;


    public IronTransaction(int id, String buyer, String seller, double amount, String memo, String timestamp, int quality, double IronWeight) {
        super(id, buyer, seller, amount, memo, timestamp);
        this.quality = quality;
        this.IronWeight = IronWeight;
    }
    // Return values for moisture and weight
    public int getQuality() {
        return quality;
    }

    public double getIronWeight() {
        return IronWeight;
    }
    // toString Constructor
    @Override
    public String toString() {
        return "ID: " + this.getId() + ", " +
                "Buyer: " + this.getBuyer() + ", " +
                "Seller: " + this.getSeller() + ", " +
                "Amount: $" + this.getAmount() + ", " +
                "Memo: " + this.getMemo() + ", " +
                "Carats: " + this.getQuality() + ", " +
                "Weight: " + this.getIronWeight() + ", " +
                "Timestamp: " + this.getTimestamp();
    }
}
