package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            
            list.add(new Employee(id, name, salary));
        }   
        
        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        //Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        Integer pos = positionId(list, idsalary);
        
        if(pos == -1) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    // verifica se o id já existe
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    // verifica a posição do id 

    public static Integer positionId(List<Employee> list, int id) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }

        return -1;

    }
}