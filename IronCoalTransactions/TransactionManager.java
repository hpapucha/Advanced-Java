//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class TransactionManager extends Transaction implements Serializable {
    //Creating the array list col object
    private ArrayList<Transaction> col;

//Creating methods which return values when searched by the user
    public TransactionManager(){
        this.col = new ArrayList<Transaction>();
    }
    public void add(Transaction obj) {
        col.add(obj);
    }

    public void clear() {
        col.clear();
    }

    public int getCount() {

        return col.size();
    }
//Method which gets all of the array list content
    public ArrayList<Transaction> getAll(){
        ArrayList<Transaction> list = new ArrayList<Transaction>();
        for(Transaction prID: col) {
            list.add(prID);
        }
        return list;
    }


//Adding buyer method
    public ArrayList<Transaction> findBuyer(String buyerName){
        ArrayList<Transaction> bNameList = new ArrayList<Transaction>();
        for(Transaction buyer: col) {
            if(buyer.getBuyer().equals(buyerName)) {
                bNameList.add(buyer);
            }
        }
        return bNameList;
    }

    public ArrayList<Transaction> findSeller(String sellerName){
        ArrayList<Transaction> sNameList = new ArrayList<Transaction>();
        for (Transaction pr: col) {
            if(pr.getSeller().contentEquals(sellerName)) {
                sNameList.add(pr);
            }
        }
        return sNameList;
    }


    public Transaction findID(int ID) {
        for (Transaction pr: col) {
            if(ID==pr.getId()) {
                return pr;
            }
        }
        return null;
    }
//Creating the load method, which writes to a file
    @SuppressWarnings("unchecked")
    public void load() throws IOException,
            ClassNotFoundException {
        ObjectInputStream inStream =
                new ObjectInputStream(new FileInputStream("receipts.ser"));
        col = (ArrayList<Transaction>)
                inStream.readObject( );
        inStream.close( );
    }
//    public void save() throws IOException {


    @SuppressWarnings("unchecked")
//Creating the save method which saves the data to a binary file
    public void save() throws IOException {
        ObjectOutputStream outStream =
                new ObjectOutputStream(new FileOutputStream("TransactionFile"));
        outStream.writeObject(col);
        outStream.close( );
    }

}