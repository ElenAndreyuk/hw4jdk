package ru.gb;

public class Employee {
    private int tabNumber;
    private long phoneNumber;
    private String name;
    private int experience;


    public Employee(int tabNumber, long phoneNumber, String name, int experience) {
        this.tabNumber = tabNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return  "Табельный номер: " + tabNumber +
                ", Номер телефона: " + phoneNumber +
                ", Имя: " + name +
                ", Стаж: " + experience;
    }
}
