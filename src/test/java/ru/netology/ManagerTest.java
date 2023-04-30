package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    void testAddMovie() {
        Manager manager = new Manager(1);
        manager.add("Бладшот");

        Assertions.assertEquals(manager.findAll().length, 1);
        Assertions.assertEquals("Бладшот", manager.findAll()[0]);
    }

    @Test
    void testFindAll() {
        Manager manager = new Manager(2);
        manager.add("Бладшот");
        manager.add("Вперед");

        Assertions.assertEquals(manager.findAll().length, 2);
        Assertions.assertEquals("Бладшот", manager.findAll()[0]);
        Assertions.assertEquals("Вперед", manager.findAll()[1]);
    }

    @Test
    void testFindLast() {
        Manager manager = new Manager(5);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");

        Assertions.assertEquals(manager.findLast().length, 5);
        Assertions.assertEquals("Человек-нивидимка", manager.findLast()[0]);
        Assertions.assertEquals("Джентльмены", manager.findLast()[1]);
        Assertions.assertEquals("Отель Белград", manager.findLast()[2]);
        Assertions.assertEquals("Вперед", manager.findLast()[3]);
        Assertions.assertEquals("Бладшот", manager.findLast()[4]);
    }

    @Test
    void testFindLastByLimit() {
        Manager manager = new Manager(5, 2);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");

        Assertions.assertEquals(manager.findLast().length, 2);
        Assertions.assertEquals("Человек-нивидимка", manager.findLast()[0]);
        Assertions.assertEquals("Джентльмены", manager.findLast()[1]);
    }
}
