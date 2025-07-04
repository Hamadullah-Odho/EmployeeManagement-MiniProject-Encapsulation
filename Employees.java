public class Employees {

    private String name;
    private int id;
    private int age;
    private double salary;
    private String position;
    private String department;

    public Employees(){
    }
    public Employees(String name,int id,int age,double salary,String position,String department){

        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    // setters for initializing name,age,id,salary
    public void setName(String name){ this.name = name;}
    public void setId(int id){ this.id = id;}
    public void setSalary(double salary){
        if(salary >= 20000) {
            this.salary = salary;
        }
        else{
            System.out.println("Salary Cannot be  < 20000 PKR > 100000 ");
        }
    }

    public void setDepartment(String department){this.department = department;}
    public void setPosition(String position){this.position = position;}
    public void setAge(int age) {
        if (age >= 18 && age <= 55) {
            this.age = age;
        }
        else{
            System.out.println("age requirement is 18 - 55 ");
        }
    }
    //getters for getting name,age,id,salary

    public String getName(){return name;}
    public int getId(){return id;}
    public double getSalary(){return salary;}
    public int getAge(){return age;}
    public String getDepartment(){return department;}
    public String getPosition(){return position;}
    public double getAnnualsalary(){return  salary * 12;}

}
