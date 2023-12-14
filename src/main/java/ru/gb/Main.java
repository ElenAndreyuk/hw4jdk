package ru.gb;
/*
Задание 1. Создать справочник сотрудников
● Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников
 Каждый сотрудник должен иметь следующие атрибуты:
○ Табельный номер
○ Номер телефона
○ Имя
○ Стаж
● Добавить метод, который ищет сотрудника по стажу (может быть список)
● Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
● Добавить метод, который ищет сотрудника по табельному номеру
● Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.add(new Employee(
                1001, 375297888888L,
                "Сидорова Светлана Валерьевна", 6));
        employeeDirectory.add(new Employee(
                1002, 375299999888L,
                "Сидоров Анатолий Васильевич", 6));
        employeeDirectory.add(new Employee(
                1003, 987697888888L,
                "Таранко Игорь Степанович", 15));
        employeeDirectory.add(new Employee(
                1004, 123456543217L,
                "Бородин Борис Борисович", 26));
        employeeDirectory.add(new Employee(
                1005, 764345678990L,
                "Дивная Алеся Михайловна", 40));


        employeeDirectory.getAll().stream().forEach(System.out::println);
        System.out.println();
        employeeDirectory.searchForExperience(40).stream().forEach(System.out::println);
        System.out.println();
        System.out.println(employeeDirectory.getPhoneByName("Дивная Алеся Михайловна"));
        System.out.println();
        System.out.println(employeeDirectory.searchByTabNumber(1004));



    }
}