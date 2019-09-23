package de.mainiero.immutable.lenses;

public class LensesExample1 {

    public static void main(String[] args) {
        Lens<Employee, String> employeeNameLens = Lens.of(e -> e.name, Employee::withName);
        Lens<Employee, String> changeEmployeeName     = employeeNameLens;
        
        final Employee employee = new Employee("John Doe", 42, new Company("Unknown Inc.", new Address(new Street("Nowhere Street"), 42)));
        System.out.println(employee);
        final Employee employeeIsNowFemale = changeEmployeeName.set(employee, "Jane Doe");
        System.out.println(employeeIsNowFemale);
    }

    public static void second(){
        Lens<Street, String> streetNameLens = Lens.of(s -> s.name, Street::withName);

        Lens<Address, Street> addressStreetLens = Lens.of(a -> a.street, Address::withStreet);

        Lens<Company, Address> companyAddressLens = Lens.of(c -> c.address, Company::withAddress);

        Lens<Employee, Company> employeeCompanyLens = Lens.of(e -> e.company, Employee::withCompany);
        Lens<Employee, String> employeeNameLens = Lens.of(e -> e.name, Employee::withName);

        Lens<Employee, String> changeEmployeeName     = employeeNameLens;

        Lens<Employee, String> changeStreetName       = employeeCompanyLens
                                                        .compose(companyAddressLens)
                                                        .compose(addressStreetLens)
                                                        .compose(streetNameLens);

        final Employee employee = new Employee("John Doe", 42, new Company("Unknown Inc.", new Address(new Street("Nowhere Street"), 42)));

        // Mutations through lenses
        final Employee employeeWithUpperCaseStreet = changeStreetName.modify(String::toUpperCase).apply(employee);
        System.out.println("Street of original employee: " + changeStreetName.get(employee));
        System.out.println("Street from changed employee: " + changeStreetName.get(employeeWithUpperCaseStreet));

        final Employee movedEmployee = changeStreetName.set(employee, "Baker Street");
        System.out.println("Street from changed moved: " + changeStreetName.get(movedEmployee));

        final Employee employeeIsNowFemale = changeEmployeeName.set(employee, "Jane Doe");
        System.out.println(employeeIsNowFemale);

        System.out.println(changeStreetName.set(employee, "test"));
    }
}