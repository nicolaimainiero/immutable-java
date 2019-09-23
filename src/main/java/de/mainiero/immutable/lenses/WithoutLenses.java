package de.mainiero.immutable.lenses;

public class WithoutLenses {

    public static void main(final String[] args) {
        final Employee employee = new Employee("John Doe", 42,
                new Company("Unknown Inc.", new Address(new Street("Nowhere Street"), 42)));

        final Employee changedWorkEmployee = new Employee(employee.name, employee.age, new Company(
                employee.company.name, new Address(new Street("Baker Street"), employee.company.address.number)));

        System.out.println(employee);
        System.out.println(changedWorkEmployee);
    }
}