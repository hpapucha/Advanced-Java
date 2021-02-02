//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019


/* I was getting errors with the receipts.ser file when I tried to use package the Coal/Iron/Transaction/
TransactionManager files, so I am not putting them in a package. I could put everything in a package but the test files
aren't suppose to be in one
 */


import java.io.Serializable;

@SuppressWarnings("serial")
public class Transaction implements Serializable {
    // defining private variables in the Transaction class
    private int id;
    private String buyer;
    private String seller;
    private double amount;
    private String memo;
    private String timestamp;

    public Transaction(int id, String buyer, String seller, double amount, String memo, String timestamp) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.amount = amount;
        this.memo = memo;
        this.timestamp = timestamp;
    }
    // Initializing the variables
    public Transaction() {

        id = 0;
        buyer = "";
        seller = "";
        amount = 0.0;
        memo = "";
        timestamp = "";
    }
    // Method returns
    public int getId() {
        return id;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getSeller() {
        return seller;
    }

    public double getAmount() {
        return amount;
    }

    public String getMemo() {
        return memo;
    }

    public String getTimestamp() {
        return timestamp;
    }
    // toString constructor
    @Override
    public String toString() {
        return "ID: " + this.getId() + ", " +
                "Buyer: " + this.getBuyer() + ", " +
                "Seller: " + this.getSeller() + ", " +
                "Amount: $" + this.getAmount() + ", " +
                "Memo: " + this.getMemo() + ", " +
                "Timestamp: " + this.getTimestamp();
    }


    public int compareTo (Transaction other) {
        if (this.id > other.id) {
            return 1;
        }
        else if (this.id == other.id) {
            return 0;
        }
        else { return -1;
        }
    }
}