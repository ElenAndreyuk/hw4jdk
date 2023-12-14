package ru.gb;

import java.util.ArrayList;

public class EmployeeDirectory {
    ArrayList<Employee> directory;


    public EmployeeDirectory() {
        this.directory = new ArrayList<>();
    }

    public void add(Employee employee){
        directory.add(employee);
    }

    public void delete(Employee employee){
        directory.remove(employee);
    }

    public ArrayList<Employee> getAll(){
        return directory;
    }
    public ArrayList<Employee> searchForExperience(int exp){
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: directory) {
            if(employee.getExperience() == exp){
                result.add(employee);
            }
        }
        return result;
    }

    public long getPhoneByName(String name){
        long result = -1;
        for (Employee employee: directory){
            if(employee.getName().equals(name)){
                result =  employee.getPhoneNumber();
            }
        }
        return result;
    }
    public Employee searchByTabNumber(int tabNumber){
        for (Employee employee: directory) {
            if(employee.getTabNumber() == tabNumber){
                return employee;
            }
        }
        return null;
    }





}
