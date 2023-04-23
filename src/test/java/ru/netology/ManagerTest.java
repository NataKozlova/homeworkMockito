package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    /*manager.add("Вперед");
    manager.add("Отель Белград");
    manager.add("Джентльмены");
    manager.add("Человек-невидимка");
    manager.add("Тролли.Мировой тур");*/
    @Test
    void testAddMovie() {
        Manager manager = new Manager();
        manager.add("Бладшот");

        Assertions.assertEquals("Бладшот", manager.findAll()[0]);
    }

    @Test
    void testFindAll() {
        Manager manager = new Manager();
        manager.add("Бладшот");
        manager.add("Вперед");

        Assertions.assertEquals("Бладшот", manager.findAll()[0]);
        Assertions.assertEquals("Вперед", manager.findAll()[1]);
    }

    @Test
    void testFindLast() {
        Manager manager = new Manager();
        manager.add("Бладшот");
        manager.add("Вперед");

        Assertions.assertEquals("Вперед", manager.findLast()[0]);
        Assertions.assertEquals("Бладшот", manager.findLast()[1]);
    }
}
