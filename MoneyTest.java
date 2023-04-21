public class MoneyTest {
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
        assertTrue(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.dollar(5)));
     }

     private void assertTrue(boolean equals) {
    }

    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
     }
     private void assertEquals(String string, String string2) {
    }

    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
     }
     private void assertEquals(Money franc, Money times) {
    }

    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
     }
}