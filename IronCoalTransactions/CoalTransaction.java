//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019


public class CoalTransaction extends Transaction {
    //Defining private variables for Coal, moisture and weight
    public int moisture;
    public double weight;
    // Constructor
    public CoalTransaction(int id, String buyer, String seller, double amount, String memo, String timestamp, int moisture, double weight) {
        super(id, buyer, seller, amount, memo, timestamp);
        this.moisture = moisture;
        this.weight = weight;
    }
    // Return values for moisture and weight
    public int getMoisture() {
        return moisture;
    }

    public double getWeight() {
        return weight;
    }

    // toString Constructor
    @Override
    public String toString() {
        return "ID: " + this.getId() + ", " +
                "Buyer: " + this.getBuyer() + ", " +
                "Seller: " + this.getSeller() + ", " +
                "Amount: $" + this.getAmount() + ", " +
                "Memo: " + this.getMemo() + ", " +
                "Moisture: " + this.getMoisture() + ", " +
                "Weight: " + this.getWeight() + ", " +
                "Timestamp: " + this.getTimestamp();
    }
}
