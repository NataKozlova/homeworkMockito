package ru.netology;

public class Manager {
    private String[] repository;
    private int size = 0;
    private int limit = 5;
    private static final int DEFAULT_COUNT_ELEMENTS = 10;


    public Manager() {
        repository = new String[DEFAULT_COUNT_ELEMENTS];
    }

    public Manager(int limit) {
        repository = new String[DEFAULT_COUNT_ELEMENTS];
        this.limit = limit;
    }

    public void add(String movie) {
        if (size >= repository.length) {
            int newCountElements = repository.length * 2;
            String[] newRepository = new String[newCountElements];
            for(int i = 0; i < size; i++) {
                newRepository[i] = repository[i];
            }
            repository = newRepository;
        }
        repository[size] = movie;
        size++;
    }

    public String[] findAll() {
        String[] allMovies = new String[size];
        for (int i = 0; i < size; i++) {
            allMovies[i] = repository[i];
        }
        return allMovies;
    }

    public String[] findLast() {
        int countElementsArray = size > limit ? limit : size;
        String[] subArray = new String[countElementsArray];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (j < limit) {
                subArray[j] = repository[i];
                j++;
            }
        }
        return subArray;
    }

}

