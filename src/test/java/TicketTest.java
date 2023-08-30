import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {
    Ticket ticket1 = new Ticket("Москва", "Самара", 5500, 12_00, 15_00);
    Ticket ticket2 = new Ticket("Саратов", "Бузулук", 1500, 15_00, 17_30);
    Ticket ticket3 = new Ticket("Пенза", "Рязань", 2200, 11_10, 14_20);
    Ticket ticket4 = new Ticket("Пенза", "Рязань", 3200, 13_10, 15_20);
    Ticket ticket5 = new Ticket("Пенза", "Рязань", 1200, 17_10, 20_20);
    Ticket ticket6 = new Ticket("Казань", "Москва", 2200, 11_10, 14_20);


    @Test
    // Цена на билет меньше
    public void priceLess() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket1);
        manager.add(ticket2);
        int expected = 1;
        int actual = ticket1.compareTo(ticket2);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    // Если цена на билет больше
    public void priceMore() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket1);
        manager.add(ticket2);
        int expected = -1;
        int actual = ticket2.compareTo(ticket1);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    // Цены на билеты равны
    public void priceEqual() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket3);
        manager.add(ticket6);
        int expected = 0;
        int actual = ticket3.compareTo(ticket6);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void sortingTicket() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        Ticket[] expected = {ticket5, ticket3, ticket4};
        Ticket[] actual = manager.search("Пенза", "Рязань");
        Assertions.assertArrayEquals(expected, actual);
    }

}
