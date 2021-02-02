//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019



public class Test1 extends Transaction {
    public static void main(String[] args) {
        //Creating sample transactions and testing methods in the regular way from Transaction and Coal/Iron.java
        //Coal and Iron Transactions are derived from CoalTransactions.java and IronTransaction.java
        Transaction t1 = new Transaction(1, "TradingCO", "John Miller", 3500.2, "Memo1", "2019/2/3");
        CoalTransaction t2 = new CoalTransaction(2, "CoalCompany", "MiningCoal", 250.55, "Memo2","2019/2/1", 2, 1500);
        IronTransaction t3 = new IronTransaction(3, "IronCompany", "MiningIron", 600.25, "Memo3", "2019/1/1", 65, 6500);
        Transaction t4 = new Transaction(4, "TED CO", "Johnny Peterson", 24.5, "Memo4", "2019/7/2");
//        Transaction t5 = new Transaction(10, "FedEX", "Terry White", 12.6, "Memo4", "2019/1/3");
//        Transaction t6 = new Transaction(10, "FedEX", "Terry White", 255.51, "Memo5", "2019/1/3");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t1.compareTo(t2));
        System.out.println(t4.compareTo(t1));
        System.out.println(t1.getId());
        System.out.println(t1.getBuyer());
        System.out.println(t1.getSeller());
        System.out.println(t1.getAmount());
        System.out.println(t1.getMemo());
        System.out.println(t1.getTimestamp());
        System.out.println(t2.getMoisture());
        System.out.println(t2.getWeight());
        System.out.println(t3.getQuality());
        System.out.println(t3.getIronWeight());

    }
}