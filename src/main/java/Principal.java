public class Principal {
    
    public static void main(String[] args) {
        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");
        
        EmployeeComposite managerSales = new EmployeeComposite("Joao", "Head Sales");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Head Marketing");
        CEO.add(managerSales);
        CEO.add(managerMarketing);
        
        EmployeeLeaf emp1 = new EmployeeLeat("Jose", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeat("Pedro", "Sales");
        managerSales.add(emp1);
        managerSales.add(emp2);
        
        EmployeeLeaf emp3 = new EmployeeLeat("Huguinho", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeat("Zezinho", "Marketing");
        managerMarketing.add(emp3);
        managerMarketing.add(emp4);

        CEO.showDetails();:
        System.out.println("Count subordinates:" + CEO.getSubordinatesCount());
        System.out.println("Count employees:" + CEO.getEmployeeCount());
    }
}
