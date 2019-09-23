package de.mainiero.immutable.lenses;

public class Employee {
    public final String name;
    public final Integer age;
    public final Company company;

    public Employee(String name, Integer age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public Employee withName(String n) {
        return new Employee(n, age, company);
    }

    public Employee withAge(Integer a) {
        return new Employee(name, a, company);
    }

    public Employee withCompany(Company c) {
        return new Employee(name, age, c);
    }

    @Override
    public String toString() {
        return "Employee@" + Integer.toHexString(hashCode()) + " { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + company +
                " }";
    }
}
