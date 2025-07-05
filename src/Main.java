import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Employees[] employees = new Employees[15];
        int hiring = 1;
        employees[0] = new Employees("Hamadullah",1454,23,125000,"CEO","Owner");
        boolean run = true;

        while(run){
            System.out.println("1. Add Employee \n2. Show Employees \n3. Show Particular Employee \n4. exit");
            System.out.print("Enter Choice :");
            String choice = scan.nextLine();

            switch (choice){
                case "1":
                    employees[hiring] = new Employees();
                    System.out.print("Enter Name :");
                    String name = scan.nextLine();
                    try {
                        System.out.print("Enter Age :");
                        int age = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter Id :");
                        int id = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter Salary :");
                        double salary = Double.parseDouble(scan.nextLine());
                        System.out.print("Enter Position :");
                        String position = scan.nextLine();
                        System.out.print("Enter Department :");
                        String department = scan.nextLine();

                        employees[hiring].setName(name);
                        employees[hiring].setAge(age);
                        employees[hiring].setId(id);
                        employees[hiring].setSalary(salary);
                        employees[hiring].setDepartment(department);
                        employees[hiring].setPosition(position);
                        if(salary >= 20000 && salary <= 100000 && age >= 18 && age <= 55){
                            System.out.println("Employee Added Successfully");
                        }
                        else{
                            employees[hiring] = null;
                        }
                    }
                    catch (NumberFormatException e){
                        System.out.println("Age cannot be non numeric");
                        employees[hiring] = null;
                    }
                    break;
                case "2":
                    System.out.println("Employees List");
                    int emp = 1;
                    for(Employees e : employees){

                        if(e != null) {
                            System.out.println("Employee " + emp);
                            Display.display(e);
                            emp++;
                        }
                    }
                    break;
                case "3":
                    System.out.print("Enter Employee Name :");
                    String search = scan.nextLine().strip();
                    int find = 0;
                    for(Employees e : employees){

                        if(e == null){
                            find++;
                            continue;
                        }
                        if(e.getName().equalsIgnoreCase(search)){
                            System.out.println("Employee Found");
                            Display.display(e);
                            break;

                        }
                        find++;
                    }
                    if(find == employees.length){
                        System.out.println("Employee not found");
                    }
                    break;
                case "4":  run = false; break;
                default:
                    System.out.println("No Selection Found");
            }
        }
    }
}
