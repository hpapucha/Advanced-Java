//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019

import java.io.IOException;

public class Test3 {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
//Creating the transactions from the constructor in Transaction
        TransactionManager TransactionsList = new TransactionManager();

        Transaction t1 = new Transaction(1, "TradingCO", "John Miller", 3500.2, "Memo1", "2019/2/3");
        Transaction t2 = new Transaction(2, "TED CO", "Johnny Peterson", 24.5, "Memo2", "2019/7/2");
        Transaction t3 = new Transaction(3, "Smith", "JoshINC", 50.2, "Memo3", "2019/6/2");
        Transaction t4 = new Transaction(4, "Cory", "DavidsonCO", 66.55, "Memo4", "2019/5/4");

// adding the transactions to the array
        TransactionsList.add(t1);
        TransactionsList.add(t2);



        TransactionsList.add(t3);
        TransactionsList.add(t4);

//Testing for count
        System.out.println(TransactionsList.getCount());
//Testing for getting all of the array's content
        System.out.println(TransactionsList.getAll());
//Finding the buyer in the specific transaction
        System.out.println(TransactionsList.findBuyer("TradingCO"));
//Finding the seller in the specific transaction
        System.out.println(TransactionsList.findSeller("JoshINC"));
//Finding the the transaction by id
        System.out.println(TransactionsList.findID(2));

//Saving all of the transactions, clearing from the array object, getting the count
//Loading the data again and  getting the count again.
        TransactionsList.save();
        TransactionsList.clear();
        System.out.println(TransactionsList.getCount());
        TransactionsList.load();
        System.out.println(TransactionsList.getCount());
    }
}