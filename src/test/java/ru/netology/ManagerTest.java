package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    void testAddMovie() {
        String[] expected = new String[] { "Бладшот" };
        Manager manager = new Manager();
        manager.add("Бладшот");

        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void testFindAll() {
        String[] expected = new String[] { "Бладшот", "Вперед", "Отель Белград", "Джентльмены", "Человек-нивидимка" };
        Manager manager = new Manager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");

        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void testFindLastWhenTryAddMovieLessLimit() {
        String[] expected = new String[] { "Вперед", "Бладшот" };
        Manager manager = new Manager();
        manager.add("Бладшот");
        manager.add("Вперед");

        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void testFindLastWhenTryAddMovieEqualsLimit() {
        String[] expected = new String[] { "Человек-нивидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот" };
        Manager manager = new Manager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");

        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void testFindLastWhenTryAddMovieMoreLimit() {
        String[] expected = new String[] { "Человек-нивидимка", "Джентльмены" };
        Manager manager = new Manager(2);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-нивидимка");

        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
