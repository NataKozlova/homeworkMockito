package ru.netology;

public class Manager {
    private String[] repository;
    private int indexEmptyElement = 0;
    private int limit = 5;


    public Manager(int countRepository) {
        repository = new String[countRepository];
    }

    public Manager(int countRepository, int limit) {
        repository = new String[countRepository];
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

