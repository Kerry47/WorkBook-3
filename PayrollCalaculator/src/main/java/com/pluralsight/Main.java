package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));

        String input = bufferedReader.readLine();

        while ((input=bufferedReader.readLine()) != null){


           String[] batman = input.split("\\|");
           int employeeID = Integer.parseInt(batman[0]);
           String employeeName = batman[1];
           double employeeHours = Double.parseDouble(batman[2]);
           double employeePayRate = Double.parseDouble(batman[3]);

           Employee employee = new Employee(employeeID, employeeName, employeeHours, employeePayRate);

            System.out.printf("Id %d, Name %s, GrossPay %f  ", employee.getEmployeeId(), employee.getName(),
                    employee.getGrossPay());
        }
        }catch (IOException e){
            System.out.println("Silly goose I couldn't read the file" );
            e.printStackTrace();

        }

    }


    }


