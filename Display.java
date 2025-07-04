public class Display{

    public static void display(Employees e){
        System.out.println("Employee Name :" + e.getName());
        System.out.println("> Age :" + e.getAge());
        System.out.println("> Id :" + e.getId());
        System.out.println("> Position :" + e.getPosition());
        System.out.println("> Department :" + e.getDepartment());
        System.out.println("> Salary :" + e.getSalary());
        System.out.println("> Salary :" + e.getAnnualsalary());
        System.out.println();
    }
}
