package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //Store data in ArrayList
    static ArrayList<Students> StudentArray = new ArrayList<>();
    static ArrayList<Workers> WorkerArray = new ArrayList<>();
    static ArrayList<Instructors> InstructorArray = new ArrayList<>();
    static ArrayList<Administrators> AdministratorArray = new ArrayList<>();
    static ArrayList<Technicians> TechnicianArray = new ArrayList<>();

    //Inputs(Add)
    static Scanner sc = new Scanner(System.in);

    //Method of program
    public static void PrintMenu()
    {
        System.out.println("   Main Menu :- ");
        System.out.println(" 1- Add data of Student");
        System.out.println(" 2- Edit data of Student");
        System.out.println(" 3- Delete data of Student");
        System.out.println(" 4- Show data of Student");
        System.out.println(" 5- Search for data of Student");
        System.out.println("-------------------------");
        System.out.println(" 6- Add data of Worker");
        System.out.println(" 7- Edit data of Worker");
        System.out.println(" 8- Delete data of Worker");
        System.out.println(" 9- Show data of Worker");
        System.out.println(" 10- Search for data of Worker");
        System.out.println("-------------------------");
        System.out.println(" 11- Add data of Instructor");
        System.out.println(" 12- Edit data of Instructor");
        System.out.println(" 13- Delete data of Instructor");
        System.out.println(" 14- Show data of Instructor");
        System.out.println(" 15- Search for data of Instructor");
        System.out.println("-------------------------");
        System.out.println(" 16- Add data of Administrator");
        System.out.println(" 17- Edit data of Administrator");
        System.out.println(" 18- Delete data of Administrator");
        System.out.println(" 19- Show data of Administrator");
        System.out.println(" 20- Search for data of Administrator");
        System.out.println("-------------------------");
        System.out.println(" 21- Add data of Technician");
        System.out.println(" 22- Edit data of Technician");
        System.out.println(" 23- Delete data of Technician");
        System.out.println(" 24- Show data of Technician");
        System.out.println(" 25- Search for data of Technician");
        System.out.println("-------------------------");
        System.out.println(" 26- Exit.. ");
        System.out.println("-------------------------");
        System.out.println("Please, Enter a number :  ");
    }

    // Add Data Methods
    public static void AddStudent()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Adding data of student has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For adding data of Student
            Students sn = new Students();

            //Add ID
            System.out.println("Please, Enter the ID of the student: ");
            int iD = sc.nextInt();
            sn.setId(iD);

            //Add Name
            System.out.println("Please, Enter the Name of the student: ");
            String name = sc.next();
            sn.setName(name);

            //Add Age
            System.out.println("Please, Enter the Age of the student: ");
            int age = sc.nextInt();
            sn.setAge(age);

            //Add Mobile Phone
            System.out.println("Please, Enter the Mobile phone of the student: ");
            String MobilePhone = sc.next();
            sn.setMobilePhone(MobilePhone);

            //Add StreetName
            System.out.println("Please, Enter the Street name of the student: ");
            String Street = sc.next();

            //Add City
            System.out.println("Please, Enter the City name of the student: ");
            String City = sc.next();
            sn.ObjectA = new Address(City,Street);

            //Add Level
            System.out.println("Please, Enter the Level of the student: ");
            int level = sc.nextInt();
            sn.setLevelOfStudents(level);

            //Add Department
            System.out.println("Please, Enter the Department of the student:  ");
            String dp = sc.next();
            sn.setDepartmentOfStudents(dp);

            //Add GPA
            System.out.println("Please, Enter the GPA of the student: ");
            String gpa = sc.next();
            sn.setGpaOfStudents(gpa);

            System.out.println("---------------------------------------------");
            System.out.println("- Student's data has been added and stored...");
            System.out.println("---------------------------------------------");

            StudentArray.add(sn); //To add(store) data of student in ArrayList

        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void AddWorker()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Adding data of worker has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For adding data of Worker
            Workers wn = new Workers();

            //Add ID
            System.out.println("Please, Enter the ID of the worker : ");
            int iD = sc.nextInt();
            wn.setId(iD);

            //Add Name
            System.out.println("Please, Enter the Name of the worker : ");
            String name = sc.next();
            wn.setName(name);

            //Add Age
            System.out.println("Please, Enter the Age of the worker : ");
            int age = sc.nextInt();
            wn.setAge(age);

            //Add Mobile phone
            System.out.println("Please, Enter the Mobile phone of the worker : ");
            String MobilePhone = sc.next();
            wn.setMobilePhone(MobilePhone);

            //Add Street Name
            System.out.println("Please, Enter the Street name of the worker: ");
            String Street = sc.next();

            //Add City name
            System.out.println("Please, Enter the City name of the worker: ");
            String City = sc.next();
            wn.ObjectA = new Address(City,Street);

            //Add Working hours
            System.out.println("Please, Enter Working Hours of the worker : ");
            double workingH = sc.nextDouble();
            wn.setWorkingHourOfWorkers(workingH);

            //Add Salary
            System.out.println("Please, Enter the Salary of the worker : ");
            double salary = sc.nextDouble();
            wn.setSalaryOfWorkers(salary);

            System.out.println("---------------------------------------------");
            System.out.println("- Worker's data has been added and stored...");
            System.out.println("---------------------------------------------");

            WorkerArray.add(wn);//To add(store) data of worker in ArrayList
        }
        catch (Exception e) {

            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void AddAdministrators()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Adding data of administrator has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For adding data of administrator
            Administrators an = new Administrators();

            //Add ID
            System.out.println("Please, Enter the ID of the administrator: ");
            int iD = sc.nextInt();
            an.setId(iD);

            //Add Name
            System.out.println("Please, Enter the Name of the administrator: ");
            String name = sc.next();
            an.setName(name);

            //Add Age
            System.out.println("Please, Enter the Age of the administrator: ");
            int age = sc.nextInt();
            an.setAge(age);

            //Add Mobile Phone
            System.out.println("Please, Enter the Mobile phone of the administrator: ");
            String MobilePhone = sc.next();
            an.setMobilePhone(MobilePhone);

            //Add Street Name
            System.out.println("Please,Enter the Street name of the administrator: ");
            String Street = sc.next();

            //Add City name
            System.out.println("Please, Enter the City name of the administrator: ");
            String City = sc.next();
            an.ObjectA = new Address(City,Street);

            //Add Department
            System.out.println("Please, Enter the Department of the administrator:  ");
            String dp = sc.next();
            an.setDepartmentOfAdministrators(dp);

            //Add Salary
            System.out.println("Please, Enter the Salary of the administrator:  ");
            double salary = sc.nextDouble();
            an.setSalaryOfAdministrators(salary);

            System.out.println("-------------------------------------------------");
            System.out.println("- Administrator's data has been added and stored...");
            System.out.println("-------------------------------------------------");

            AdministratorArray.add(an);//To add(store) data of administrator in ArrayList

        } catch (Exception e)
        {
            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void AddTechnicians()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Adding data of technician has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For adding data of technician
            Technicians tn = new Technicians();

            //Add ID
            System.out.println("Please, Enter the ID of the technician: ");
            int iD = sc.nextInt();
            tn.setId(iD);

            //Add Name
            System.out.println("Please, Enter the Name of the technician: ");
            String name = sc.next();
            tn.setName(name);

            //Add Age
            System.out.println("Please, Enter the Age of the technician: ");
            int age = sc.nextInt();
            tn.setAge(age);

            //Add Mobile Phone
            System.out.println("Please, Enter the Mobile phone of the technician: ");
            String MobilePhone = sc.next();
            tn.setMobilePhone(MobilePhone);

            //Add Street Name
            System.out.println("Please, Enter the Street name of the technician: ");
            String Street = sc.next();

            //Add City name
            System.out.println("Please, Enter the City name of the technician: ");
            String City = sc.next();
            tn.ObjectA = new Address(City,Street);

            //Add Salary
            System.out.println("Please, Enter the Salary of the technician:  ");
            double salary = sc.nextDouble();
            tn.setSalaryOfTechnicians(salary);

            System.out.println("-------------------------------------------------");
            System.out.println("- Technician's data has been added and stored...");
            System.out.println("-------------------------------------------------");

            TechnicianArray.add(tn);//To add(store) data of technician in ArrayList

        }
        catch (Exception e)
        {

            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void AddInstructors()
    {
        try {

            System.out.println("-----------------------------------------");
            System.out.println("Adding data of instructor has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For adding data of instructor
            Instructors in = new Instructors();

            //Add Id
            System.out.println("Please, Enter the ID of the instructor: ");
            int iD = sc.nextInt();
            in.setId(iD);

            //Add Name
            System.out.println("Please, Enter the Name of the instructor: ");
            String name = sc.next();
            in.setName(name);

            //Add Age
            System.out.println("Please, Enter the Age of the instructor: ");
            int age = sc.nextInt();
            in.setAge(age);

            //Add Mobile Phone
            System.out.println("Please, Enter the Mobile phone of the instructor: ");
            String MobilePhone = sc.next();
            in.setMobilePhone(MobilePhone);

            //Add Street Name
            System.out.println("Please, Enter the Street name of the instructor: ");
            String Street = sc.next();

            //Add City name
            System.out.println("Please, Enter the City name of the instructor: ");
            String City = sc.next();
            in.ObjectA = new Address(City,Street);

            //Add Department
            System.out.println("Please, Enter the Department of the instructor:  ");
            String dp = sc.next();
            in.setDepartmentOfInstructors(dp);

            //Add Salary
            System.out.println("Please, Enter the Salary of the instructor:  ");
            double salary = sc.nextDouble();
            in.setSalaryOfInstructors(salary);

            System.out.println("-------------------------------------------------");
            System.out.println("- Instructor's data has been added and stored...");
            System.out.println("-------------------------------------------------");

            InstructorArray.add(in);//To add(store) data of instructor in ArrayList

        }
        catch (Exception e) {

            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    //Edit Methods
    public static void EditStudent()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Editing data of student has been chosen.. ");
            System.out.println("-----------------------------------------");

            System.out.println("What do you need to update in data of student?..");
            System.out.println("1- Update name of student");
            System.out.println("2- Update age of student");
            System.out.println("3- Update mobile phone of student");
            System.out.println("4- Update GPA of student");
            System.out.println("5- Update level of student");
            System.out.println("6- Update Department of student");
            System.out.println("7- Update street name of student");
            System.out.println("Please, Enter a number between 1:7 :  ");

            int num = sc.nextInt();

            //For searching about student
            System.out.println("Please, Enter the ID of the student: ");
            int id = sc.nextInt();

            //Edit name
            if (num == 1)
            {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the name of Student: ");
                    String EditName = sc.next();

                    Students EditN = StudentArray.get(i);

                    if (EditN.getId() == id)
                    {
                        EditN.setName(EditName);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditN.PrintDetails();

                        break;
                    }
                }
            }

            //Edit age
            if (num == 2) {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the age of Student: ");
                    int EditAge = sc.nextInt();

                    Students EditA = StudentArray.get(i);

                    if (EditA.getId() == id)
                    {
                        EditA.setAge(EditAge);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's age has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditA.PrintDetails();
                        break;
                    }
                }
            }

            //Edit mobile phone
            if (num == 3)
            {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the Mobile Phone of Student: ");
                    String EditPhone = sc.next();

                    Students EditM = StudentArray.get(i);

                    if (EditM.getId() == id)
                    {
                        EditM.setMobilePhone(EditPhone);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's mobile phone has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditM.PrintDetails();


                        break;
                    }
                }
            }

            //Edit GPa
            if (num == 4) {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the GPA of Student: ");
                    String EditGpa = sc.next();

                    Students EditG = StudentArray.get(i);

                    if (EditG.getId() == id)
                    {
                        EditG.setGpaOfStudents(EditGpa);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's GPA has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditG.PrintDetails();

                        break;
                    }
                }
            }

            //Edit Level
            if (num == 5)
            {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the Level of Student: ");
                    int EditLevel = sc.nextInt();

                    Students EditL = StudentArray.get(i);

                    if (EditL.getId() == id)
                    {
                        EditL.setLevelOfStudents(EditLevel);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's Level has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditL.PrintDetails();

                        break;
                    }
                }
            }

            //Edit department
            if (num == 6)
            {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the Department of Student: ");
                    String EditDepartment = sc.next();

                    Students EditD = StudentArray.get(i);

                    if (EditD.getId() == id)
                    {
                        EditD.setDepartmentOfStudents(EditDepartment);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's department has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditD.PrintDetails();

                        break;
                    }
                }
            }

            //Edit street name
            if (num == 7)
            {
                for (int i = 0; i < StudentArray.size(); i++)
                {
                    System.out.println("Please, Enter the Street name of Student: ");
                    String EditStreet = sc.next();

                    Students EditAd = StudentArray.get(i);

                    if (EditAd.getId() == id)
                    {
                        EditAd.setAddress(EditStreet);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Student's street name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of student After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditAd.PrintDetails();

                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void EditWorker()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Editing data of worker has been chosen.. ");
            System.out.println("-----------------------------------------");

            System.out.println("What do you need to update in data of worker?..");
            System.out.println("1- Update name of worker");
            System.out.println("2- Update age of worker");
            System.out.println("3- Update Mobile phone of worker");
            System.out.println("4- Update Salary of worker");
            System.out.println("5- Update working hours of worker");
            System.out.println("6- Update street name of worker");
            System.out.println("Please, Enter a number between 1:6 :  ");

            int num = sc.nextInt();

            //For searching about worker
            System.out.println("Please, Enter the ID of the worker: ");
            int id = sc.nextInt();

            //Edit name
            if (num == 1)
            {
            for (int i = 0; i < WorkerArray.size(); i++)
            {
                System.out.println("Please, Enter the name of the Worker: ");
                String EditName = sc.next();

                Workers EditN = WorkerArray.get(i);

                if (EditN.getId() == id)
                {
                    EditN.setName(EditName);
                    System.out.println("-------------------------------------------------");
                    System.out.println("- Worker's name has been updated and stored...");
                    System.out.println("-------------------------------------------------");

                    System.out.println("- Data of worker After updating: ");
                    System.out.println("-------------------------------------------------");
                    EditN.PrintDetails();
                    break;
                }
            }
        }

            //Edit age
            if (num == 2)
            {
                for (int i = 0; i < WorkerArray.size(); i++)
                {
                    System.out.println("Please, Enter the age of the Worker: ");
                    int EditAge = sc.nextInt();


                    Workers EditA = WorkerArray.get(i);
                    if (EditA.getId() == id)
                    {
                        EditA.setAge(EditAge);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Worker's age has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of worker After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditA.PrintDetails();
                        break;
                    }
                }
            }

            //Edit mobile phone
            if (num == 3)
            {
                for (int i = 0; i < WorkerArray.size(); i++)
                {
                    System.out.println("Please, Enter the mobile phone of the Worker: ");
                    String EditPhone = sc.next();

                    Workers EditP = WorkerArray.get(i);

                    if (EditP.getId() == id)
                    {
                        EditP.setMobilePhone(EditPhone);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Worker's mobile phone has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of worker After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditP.PrintDetails();

                        break;
                    }
                }
            }

            //Edit Salary
            if (num == 4)
            {
                for (int i = 0; i < WorkerArray.size(); i++)
                {
                    System.out.println("Please, Enter the salary of the Worker: ");
                    double EditSalary = sc.nextDouble();

                    Workers EditS = WorkerArray.get(i);

                    if (EditS.getId() == id)
                    {
                        EditS.setSalaryOfWorkers(EditSalary);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Worker's salary has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of worker After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditS.PrintDetails();

                        break;
                    }
                }
            }

            //Edit working hours
            if (num == 5)
            {
                for (int i = 0; i < WorkerArray.size(); i++)
                {
                    System.out.println("Please, Enter the working hours of the Worker: ");
                    double EditHours = sc.nextDouble();
                    Workers EditH = WorkerArray.get(i);
                    if (EditH.getId() == id)
                    {
                        EditH.setWorkingHourOfWorkers(EditHours);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Worker's working hours has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of worker After updating:.... ");
                        System.out.println("-------------------------------------------------");
                        EditH.PrintDetails();
                        break;
                    }
                }
            }

            //Edit Street name
            if (num == 6){
                for (int i = 0; i < WorkerArray.size(); i++)
                {
                    System.out.println("Please, Enter the street name of the Worker: ");
                    String EditStreet = sc.next();

                    Workers EditSt = WorkerArray.get(i);

                    if (EditSt.getId() == id)
                    {
                        EditSt.setAddress(EditStreet);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Worker's Street name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of worker After updating:.... ");
                        System.out.println("-------------------------------------------------");
                        EditSt.PrintDetails();
                        break;
                    }
                }
            }
        }
        catch (Exception e) {

            System.out.println("Sorry, Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void EditAdministrators()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Editing data of Administrator has been chosen.. ");
            System.out.println("-----------------------------------------");

            System.out.println("What do you need to update in data of Administrators?..");
            System.out.println("1- Update name of administrator");
            System.out.println("2- Update age of administrator");
            System.out.println("3- Update Mobile phone of administrator");
            System.out.println("4- Update Salary of administrator");
            System.out.println("5- Update department of administrator");
            System.out.println("6- Update street of administrator");
            System.out.println("Please, Enter a number between 1:6 :  ");

            int num = sc.nextInt();

            //For searching about administrator
            System.out.println("Please, Enter the ID of the Administrator: ");
            int id = sc.nextInt();

            //Edit name
            if (num == 1)
            {
            for (int i = 0; i < AdministratorArray.size(); i++)
            {
                System.out.println("Please, Enter your name of administrator: ");
                String EditName = sc.next();

                Administrators EditN = AdministratorArray.get(i);

                if (EditN.getId() == id)
                {
                    EditN.setName(EditName);
                    System.out.println("-------------------------------------------------");
                    System.out.println("- Administrator's name has been updated and stored...");
                    System.out.println("-------------------------------------------------");

                    System.out.println("- Data of administrator After updating:  ");
                    System.out.println("-------------------------------------------------");
                    EditN.PrintDetails();
                    break;
                }
            }
            }

            //Edit age
            if (num == 2)
            {
                for (int i = 0; i < AdministratorArray.size(); i++)
                {
                    System.out.println("Please ,Enter the age of administrator: ");
                    int EditAge = sc.nextInt();

                    Administrators EditA = AdministratorArray.get(i);

                    if (EditA.getId() == id)
                    {
                        EditA.setAge(EditAge);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Administrator's age has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of administrator After updating:  ");
                        System.out.println("-------------------------------------------------");
                        EditA.PrintDetails();
                        break;
                    }
                }
            }

            //Edit Mobile phone
            if (num == 3)
            {
                for (int i = 0; i < AdministratorArray.size(); i++)
                {
                    System.out.println("Please ,Enter the mobile phone of administrator: ");
                    String EditPhone = sc.next();

                    Administrators EditP = AdministratorArray.get(i);

                    if (EditP.getId() == id)
                    {
                        EditP.setMobilePhone(EditPhone);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Administrator's mobile phone has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of administrator After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditP.PrintDetails();
                        break;
                    }
                }
            }

            //Edit salary
            if (num == 4)
            {
                for (int i = 0; i < AdministratorArray.size(); i++)
                {
                    System.out.println("Please, Enter the salary of administrator: ");
                    double EditSalary = sc.nextDouble();

                    Administrators EditS = AdministratorArray.get(i);

                    if (EditS.getId() == id)
                    {
                        EditS.setSalaryOfAdministrators(EditSalary);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Administrator's salary has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of administrator After updating:.... ");
                        System.out.println("-------------------------------------------------");
                        EditS.PrintDetails();
                        break;
                    }
                }
            }

            //Edit department
            if (num == 5)
            {
                for (int i = 0; i < AdministratorArray.size(); i++)
                {
                    System.out.println("Please, Enter the department of administrator: ");
                    String EditDep = sc.next();

                    Administrators EditD = AdministratorArray.get(i);

                    if (EditD.getId() == id)
                    {
                        EditD.setDepartmentOfAdministrators(EditDep);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Administrator's department has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of administrator After updating:.... ");
                        System.out.println("-------------------------------------------------");
                        EditD.PrintDetails();
                        break;
                    }
                }
            }

            //Edit Street name
            if (num == 6)
            {
                for (int i = 0; i < AdministratorArray.size(); i++)
                {
                    System.out.println("Please, Enter the street name of administrator: ");
                    String EditStreet = sc.next();

                    Administrators EditSt = AdministratorArray.get(i);

                    if (EditSt.getId() == id)
                    {
                        EditSt.setAddress(EditStreet);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Administrator's street name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of administrator After updating:.... ");
                        System.out.println("-------------------------------------------------");
                        EditSt.PrintDetails();
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void EditTechnicians()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Editing data of Technician has been chosen.. ");
            System.out.println("-----------------------------------------");

            System.out.println("What do you need to update in data of Technician?..");
            System.out.println("1- Update name of Technician");
            System.out.println("2- Update age of Technician");
            System.out.println("3- Update Mobile phone of Technician");
            System.out.println("4- Update salary of Technician");
            System.out.println("5- Update street name of Technician");
            System.out.println("Please, Enter a number between 1:5 :  ");

            int num = sc.nextInt();

            //For searching about Technician
            System.out.println("Please, Enter the ID of the technician: ");
            int id = sc.nextInt();

            //Edit name
            if (num == 1)
            {
                for (int i = 0; i < TechnicianArray.size(); i++)
                {
                    System.out.println("Please, Enter the name of Technician: ");
                    String EditName = sc.next();

                    Technicians EditN = TechnicianArray.get(i);

                    if (EditN.getId() == id)
                    {
                        EditN.setName(EditName);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Technician's name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of Technician After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditN.PrintDetails();
                        break;
                    }
                }
            }

            //Edit age
            if (num == 2)
            {
                for (int i = 0; i < TechnicianArray.size(); i++)
                {
                    System.out.println("Please, Enter the age of Technician: ");
                    int EditAge = sc.nextInt();

                    Technicians EditA = TechnicianArray.get(i);

                    if (EditA.getId() == id)
                    {
                        EditA.setAge(EditAge);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Technician's age has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of Technician After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditA.PrintDetails();
                        break;
                    }
                }
            }

            //Edit mobile phone
            if (num == 3)
            {
                for (int i = 0; i < TechnicianArray.size(); i++)
                {
                    System.out.println("Please, Enter the mobile phone of Technician: ");
                    String EditPhone = sc.next();

                    Technicians EditP = TechnicianArray.get(i);

                    if (EditP.getId() == id)
                    {
                        EditP.setMobilePhone(EditPhone);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Technician's mobile phone has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of Technician After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditP.PrintDetails();
                        break;
                    }
                }
            }

            //Edit Salary
            if (num == 4)
            {
                for (int i = 0; i < TechnicianArray.size(); i++)
                {
                    System.out.println("Please, Enter the salary of Technician: ");
                    double EditSalary = sc.nextDouble();

                    Technicians EditS = TechnicianArray.get(i);

                    if (EditS.getId() == id)
                    {
                        EditS.setSalaryOfTechnicians(EditSalary);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Technician's salary has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of Technician After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditS.PrintDetails();
                        break;
                    }
                }
            }

            //Edit street name
            if (num == 5)
            {
                for (int i = 0; i < TechnicianArray.size(); i++)
                {
                    System.out.println("Please, Enter the street name of Technician: ");
                    String EditStreet = sc.next();

                    Technicians EditSt = TechnicianArray.get(i);

                    if (EditSt.getId() == id)
                    {
                        EditSt.setAddress(EditStreet);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Technician's street name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of Technician After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditSt.PrintDetails();
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    public static void EditInstructors()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Editing data of Instructor has been chosen.. ");
            System.out.println("-----------------------------------------");

            System.out.println("What do you need to update in data of Instructor?..");
            System.out.println("1- Update the name of instructor");
            System.out.println("2- Update the age of instructor");
            System.out.println("3- Update the mobile phone of instructor");
            System.out.println("4- Update the Salary of instructor");
            System.out.println("5- Update the department of instructor");
            System.out.println("6- Update the street name of instructor");
            System.out.println("Please , Enter a number between 1:6 : ");
            int num = sc.nextInt();

            //For searching about instructor
            System.out.println("Please, Enter the ID of the instructor: ");
            int id = sc.nextInt();

            //Edit name
            if (num == 1)
            {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the name of instructor: ");
                    String EditName = sc.next();

                    Instructors EditN = InstructorArray.get(i);

                    if (EditN.getId() == id)
                    {
                        EditN.setName(EditName);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditN.PrintDetails();
                        break;
                    }
                }
            }

            //Edit age
            if (num == 2)
            {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the age of instructor: ");
                    int EditAge = sc.nextInt();

                    Instructors EditA = InstructorArray.get(i);

                    if (EditA.getId() == id)
                    {
                        EditA.setAge(EditAge);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's age has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditA.PrintDetails();
                        break;
                    }
                }
            }

            //Edit mobile phone
            if (num == 3)
            {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the mobile phone of instructor: ");
                    String EditPhone = sc.next();

                    Instructors EditP = InstructorArray.get(i);

                    if (EditP.getId() == id)
                    {
                        EditP.setMobilePhone(EditPhone);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's mobile phone has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditP.PrintDetails();
                        break;
                    }
                }
            }

            //Edit salary
            if (num == 4)
            {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the salary of instructor: ");
                    double EditSalary = sc.nextDouble();

                    Instructors EditS = InstructorArray.get(i);

                    if (EditS.getId() == id)
                    {
                        EditS.setSalaryOfInstructors(EditSalary);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's salary has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditS.PrintDetails();
                        break;
                    }
                }
            }

            //Edit department
            if (num == 5)
            {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the department of instructor: ");
                    String EditDep = sc.next();

                    Instructors EditD = InstructorArray.get(i);
                    if (EditD.getId() == id)
                    {
                        EditD.setDepartmentOfInstructors(EditDep);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's department has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditD.PrintDetails();
                        break;
                    }
                }
            }

            //Edit street name
            if (num == 6) {
                for (int i = 0; i < InstructorArray.size(); i++)
                {
                    System.out.println("Please, Enter the street name of instructor: ");
                    String EditStreet = sc.next();

                    Instructors EditSt = InstructorArray.get(i);

                    if (EditSt.getId() == id)
                    {
                        EditSt.setAddress(EditStreet);
                        System.out.println("-------------------------------------------------");
                        System.out.println("- Instructor's street name has been updated and stored...");
                        System.out.println("-------------------------------------------------");

                        System.out.println("- Data of instructor After updating: ");
                        System.out.println("-------------------------------------------------");
                        EditSt.PrintDetails();
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid input..");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
            sc.next();
        }
    }

    //Delete Methods
    public static void DeleteStudent()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Deleting data of student has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For Searching about student
            System.out.println("Please, Enter the ID of the student: ");
            int id = sc.nextInt();

            for (int i = 0; i < StudentArray.size(); i++)
            {
                Students RemoveS = StudentArray.get(i);

                if (RemoveS.getId() == id)
                {
                    StudentArray.remove(RemoveS);
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid Input.. ");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void DeleteWorker()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Deleting data of worker has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For searching about worker
            System.out.println("Please, Enter the ID of the Worker: ");
            int y = sc.nextInt();

            for (int i = 0; i < WorkerArray.size(); i++)
            {
                Workers RemoveW = WorkerArray.get(i);

                if (RemoveW.getId() == y)
                {
                    WorkerArray.remove(RemoveW);
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid Input.. ");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void DeleteAdministrator()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Deleting data of administrator has been chosen.. ");
            System.out.println("-----------------------------------------");

            //for searching about administrator
            System.out.println("Please, Enter the ID of the Administrator: ");
            int y = sc.nextInt();

            for (int i = 0; i < AdministratorArray.size(); i++)
            {
                Administrators RemoveA = AdministratorArray.get(i);

                if (RemoveA.getId() == y)
                {
                    AdministratorArray.remove(RemoveA);
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid Input.. ");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void DeleteTechnician()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Deleting data of technician has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For searching about technician
            System.out.println("Please, enter the ID of the Technician: ");

            int y = sc.nextInt();
            for (int i = 0; i < TechnicianArray.size(); i++)
            {
                Technicians RemoveT = TechnicianArray.get(i);

                if (RemoveT.getId() == y)
                {
                    TechnicianArray.remove(RemoveT);
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid Input.. ");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void DeleteInstructor()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Deleting data of instructor has been chosen.. ");
            System.out.println("-----------------------------------------");

            //For searching about instructor
            System.out.println("enter the ID of the Instructor: ");

            int y = sc.nextInt();
            for (int i = 0; i < InstructorArray.size(); i++)
            {
                Instructors RemoveI = InstructorArray.get(i);
                if (RemoveI.getId() == y)
                {
                    InstructorArray.remove(RemoveI);
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Sorry, Invalid Input.. ");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    //Show Methods
    public static void ShowDetailsStudents()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Showing data of student has been chosen.. ");
            System.out.println("-----------------------------------------");

            for (int i = 0; i < StudentArray.size(); i++)
            {
                StudentArray.get(i).PrintDetails();
                System.out.println("-----------------------------------------");

            }

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid Input");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void ShowDetailsWorkers()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Showing data of worker has been chosen.. ");
            System.out.println("-----------------------------------------");

            for (int i = 0; i < WorkerArray.size(); i++)
            {
                WorkerArray.get(i).PrintDetails();
                System.out.println("-----------------------------------------");
            }

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid Input");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void ShowDetailsAdministrator()
    {
        try {System.out.println("-----------------------------------------");
            System.out.println("Showing data of administrator has been chosen.. ");
            System.out.println("-----------------------------------------");
            for (int i = 0; i < AdministratorArray.size(); i++)
            {
                AdministratorArray.get(i).PrintDetails();
                System.out.println("-----------------------------------------");
            }

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid Input");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void ShowDetailsTechnician()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Showing data of technician has been chosen.. ");
            System.out.println("-----------------------------------------");

            for (int i = 0; i < TechnicianArray.size(); i++)
            {
                TechnicianArray.get(i).PrintDetails();
                System.out.println("-----------------------------------------");
            }

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid Input");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    public static void ShowDetailsInstructor()
    {
        try {
            System.out.println("-----------------------------------------");
            System.out.println("Showing data of instructor has been chosen.. ");
            System.out.println("-----------------------------------------");

            for (int i = 0; i < InstructorArray.size(); i++)
            {
                InstructorArray.get(i).PrintDetails();
                System.out.println("-----------------------------------------");
            }

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid Input");
            System.out.println("The message Of your error : "+ e.getMessage());
            System.out.println("---------------------------------------");
        }
    }

    //Search Methods
    public static void SearchStudent()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Searching data of student has been chosen.. ");
        System.out.println("-----------------------------------------");

        //Searching by ID
        System.out.println("Please, enter the ID of a student for searching : ");
        int id = sc.nextInt();

        for (int i = 0; i < StudentArray.size(); i++)
        {
            Students SearchS = StudentArray.get(i);
            if (SearchS.getId() == id)
            {
                System.out.println("Data of Student who was searched: ");
                System.out.println("-----------------------------------------");
                SearchS.PrintDetails();
            }
        }
    }

    public static void SearchWorker()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Searching data of worker has been chosen.. ");
        System.out.println("-----------------------------------------");

        //Searching by ID
        System.out.println("Please, enter the ID of a worker for searching : ");
        int id = sc.nextInt();

        for (int i = 0; i < WorkerArray.size(); i++)
        {
            Workers SearchW = WorkerArray.get(i);
            if (SearchW.getId() == id)
            {
                System.out.println("Data of worker who was searched: ");
                System.out.println("-----------------------------------------");
                SearchW.PrintDetails();
            }
        }
    }

    public static void SearchInstructor()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Searching data of instructor has been chosen.. ");
        System.out.println("-----------------------------------------");

        //Searching by ID
        System.out.println("Please, enter the ID of a instructor for searching : ");
        int id = sc.nextInt();

        for (int i = 0; i < InstructorArray.size(); i++)
        {
            Instructors SearchI = InstructorArray.get(i);
            if (SearchI.getId() == id)
            {
                System.out.println("Data of instructor who was searched: ");
                System.out.println("-----------------------------------------");
                SearchI.PrintDetails();
            }
        }
    }

    public static void SearchAdministrator()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Searching data of administrator has been chosen.. ");
        System.out.println("-----------------------------------------");

        //Searching by ID
        System.out.println("Please, enter the ID of a administrator for searching : ");
        int id = sc.nextInt();

        for (int i = 0; i < AdministratorArray.size(); i++)
        {
            Administrators SearchA = AdministratorArray.get(i);
            if (SearchA.getId() == id)
            {
                System.out.println("Data of administrator who was searched: ");
                System.out.println("-----------------------------------------");
                SearchA.PrintDetails();
            }
        }
    }

    public static void SearchTechnician()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Searching data of technician has been chosen.. ");
        System.out.println("-----------------------------------------");

        //Searching by ID
        System.out.println("Please, enter the ID of a technician for searching : ");
        int id = sc.nextInt();

        for (int i = 0; i < TechnicianArray.size(); i++)
        {
            Technicians SearchA = TechnicianArray.get(i);
            if (SearchA.getId() == id)
            {
                System.out.println("Data of technician who was searched: ");
                System.out.println("-----------------------------------------");
                SearchA.PrintDetails();
            }
        }
    }

    public static void main(String[] args) {

        int Num ;

        do {

            PrintMenu();

            Num = sc.nextInt();

            switch (Num)
            {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    EditStudent();
                    break;
                case 3:
                    DeleteStudent();
                    break;
                case 4:
                    ShowDetailsStudents();
                    break;
                case 5:
                    SearchStudent();
                    break;
                case 6:
                    AddWorker();
                    break;
                case 7:
                    EditWorker();
                    break;
                case 8:
                    DeleteWorker();
                    break;
                case 9:
                    ShowDetailsWorkers();
                    break;
                case 10:
                    SearchWorker();
                    break;
                case 11:
                    AddInstructors();
                    break;
                case 12:
                    EditInstructors();
                    break;
                case 13:
                    DeleteInstructor();
                    break;
                case 14:
                    ShowDetailsInstructor();
                    break;
                case 15:
                    SearchInstructor();
                    break;
                case 16:
                    AddAdministrators();
                    break;
                case 17:
                    EditAdministrators();
                    break;
                case 18:
                    DeleteAdministrator();
                    break;
                case 19:
                    ShowDetailsAdministrator();
                    break;
                case 20:
                    SearchAdministrator();
                    break;
                case 21:
                    AddTechnicians();
                    break;
                case 22:
                    EditTechnicians();
                    break;
                case 23:
                    DeleteTechnician();
                    break;
                case 24:
                    ShowDetailsTechnician();
                    break;
                case 25:
                    SearchTechnician();
            }
        }
        while (Num != 26);

    }
}

