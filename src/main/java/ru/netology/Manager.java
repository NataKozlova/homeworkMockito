package ru.netology;

public class Manager {
    private String[] repository;
    private int indexEmptyElement = 0;
    private int limit = 5;


    public Manager() {
        repository = new String[10];
    }

    public Manager(int limit) {
        repository = new String[10];
        this.limit = limit;
    }

    public void add(String movie) {
        repository[indexEmptyElement] = movie;
        indexEmptyElement++;
    }

    public String[] findAll() {
        return repository;
    }

    public String[] findLast() {
        String[] subArray = new String[limit];
        int j = 0;
        for (int i = repository.length - 1; i >= 0; i--) {
            if (repository[i] != null && j < limit) {
                subArray[j] = repository[i];
                j++;
            }
        }
        return subArray;
    }
}

