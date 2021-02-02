//Hristo Papucharov
//IT 313
//Project 4b
//Submission date 11/6/2019


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2  {
    Transaction t1;
    CoalTransaction t2;
    IronTransaction t3;
    Transaction t4;
    private final double DELTA = 0.000000001;
    //Testing the constructor methods
    @BeforeEach
    void setUp() {
        t1 = new Transaction(1, "TradingCO", "John Miller", 3500.2, "Memo1", "2019/2/3");
        t2 = new CoalTransaction(2, "CoalCompany", "MiningCoal", 250.55, "Memo2","2019/2/1", 2, 1500);
        t3 = new IronTransaction(3, "IronCompany", "MiningIron", 600.25, "Memo3", "2019/1/1", 65, 6500);
        t4 = new Transaction(4, "TED CO", "Johnny Peterson", 24.5, "Memo4", "2019/7/2");    }
    //Testing getId method
    @Test
    void getId() {
        assertEquals(1, t1.getId());
        assertEquals(2, t2.getId());
        assertEquals(3, t3.getId());
        assertEquals(4, t4.getId());
    }
    //Testing getBuyer method
    @Test
    void getBuyer() {
        assertEquals("TradingCO", t1.getBuyer());
        assertEquals("CoalCompany", t2.getBuyer());
        assertEquals("IronCompany", t3.getBuyer());
        assertEquals("TED CO", t4.getBuyer());
    }
    //Testing getSeller method
    @Test
    void getSeller() {
        assertEquals("John Miller", t1.getSeller());
        assertEquals("MiningCoal", t2.getSeller());
        assertEquals("MiningIron", t3.getSeller());
        assertEquals("Johnny Peterson", t4.getSeller());
    }

    //Testing getAmount method
    @Test
    void getAmount() {
        assertEquals(3500.2, t1.getAmount(), DELTA);
        assertEquals(250.55, t2.getAmount(), DELTA);
        assertEquals(600.25, t3.getAmount(), DELTA);
        assertEquals(24.5, t4.getAmount(), DELTA);
    }
    //Testing getMemo method
    @Test
    void getMemo() {
        assertEquals("Memo1", t1.getMemo());
        assertEquals("Memo2", t2.getMemo());
        assertEquals("Memo3", t3.getMemo());
        assertEquals("Memo4", t4.getMemo());

    }
    //Testing getTimestamp method
    @Test
    void getTimestamp() {
        assertEquals("2019/2/3", t1.getTimestamp( ));
        assertEquals("2019/2/1", t2.getTimestamp( ));
        assertEquals("2019/1/1", t3.getTimestamp( ));
        assertEquals("2019/7/2", t4.getTimestamp( ));


    }
    //Testing getMoisture method
    @Test
    void getMoisture() {
        assertEquals(2, t2.getMoisture());

    }
    //Testing getWeight method
    @Test
    void getWeight() {
        assertEquals(1500, t2.getWeight());
    }
    //Testing GetQuality method
    @Test
    void getQuality() {
        assertEquals(65, t3.getQuality());
    }

    @Test
    void getIron() {
        assertEquals(6500, t3.getIronWeight());
    }

    //Testing toString method
    @Test
    void gettoString() {
        assertEquals("ID: 1, Buyer: TradingCO, Seller: John Miller, Amount: $3500.2, Memo: Memo1, Timestamp: 2019/2/3" , t1.toString());
        assertEquals("ID: 2, Buyer: CoalCompany, Seller: MiningCoal, Amount: $250.55, Memo: Memo2, Moisture: 2, Weight: 1500.0, Timestamp: 2019/2/1" , t2.toString());
        assertEquals("ID: 3, Buyer: IronCompany, Seller: MiningIron, Amount: $600.25, Memo: Memo3, Carats: 65, Weight: 6500.0, Timestamp: 2019/1/1" , t3.toString());
        assertEquals("ID: 4, Buyer: TED CO, Seller: Johnny Peterson, Amount: $24.5, Memo: Memo4, Timestamp: 2019/7/2" , t4.toString());

    }

    //Testing CompareTo method
    @Test
    void compareTo() {
        assertEquals(true, t1.compareTo(t3) < 0);
        assertEquals(true, t1.compareTo(t2) <1);
    }
}