import java.util.Scanner;

class Employee {
    Scanner sn = new Scanner(System.in);
    int e_num;
    String e_name;
    int salary;
	

    Employee(){
	
    }

    void setDetails() {
        System.out.print("\nEnter employee number: ");
        e_num = sn.nextInt();
        System.out.print("Enter employee name: ");
        e_name = sn.next();
        System.out.print("Enter employee salary: ");
        salary = sn.nextInt();
    }

    void display() {
        System.out.print("\nEmployee no: " + e_num + "\nEmployee name: " + e_name + "\nSalary: " + salary + "\n");

    }
}

class empDetails {
    public static void main(String args[]) {
        int search;
        int flag = 0;
        Scanner sn = new Scanner(System.in);
	System.out.println("Enter the number of employees:");
	int n=sn.nextInt();
        Employee arr_obj[] = new Employee[n];

        for (int i = 0; i < arr_obj.length; i++) {
            System.out.println("\nEmployee " + (i + 1) + "\n");

            arr_obj[i] = new Employee();
            arr_obj[i].setDetails();
        }
        for (int i = 0; i < arr_obj.length; i++) {
            System.out.println("\nEmployee " + (i + 1) + "\n");
            arr_obj[i].display();

        }
        System.out.print("\nEnter employee number to search: ");
        search = sn.nextInt();
        for (int i = 0; i < arr_obj.length; i++) {
            if (arr_obj[i].e_num == search) {
                arr_obj[i].display();
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("Invalid employee number!!!!");
        }
    }
}
