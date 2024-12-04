package org.example;

public class Owner {
    private final String name;
    private final String lastName;
    private final int age;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getOwnerId() {
        return ownerId;
    }

    private final int ownerId;

    public Owner(String name, String lastName, int age, int ownerId) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ownerId = ownerId;
    }
}