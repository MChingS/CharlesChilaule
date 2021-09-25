import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import util.databaseConnection.DatabaseCoonection;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.sql.*;
import java.util.Scanner;


public class MainClass {



    Statement stmt;

    // class to add student to the database
    public class AddData
    {
        Statement stmt;
        public AddData()
        {
            stmt = DatabaseCoonection.connectAndGetStatement();
        }
        public boolean addStudent(String studentIDNumber,String studentFirstName,String studentLastName,
                                  String studentEmailAddress,String studentPhysicaAddress)
        {
            try {

                int INSERT=stmt.executeUpdate("INSERT INTO student (`studentFirstName`,`studentLastName`," +
                                "`studentEmailAddress`,`studentPhysicaAddress`,`studentIDNumber`) VALUES ('"
                                +studentFirstName+"','"+ studentLastName+"','"+ studentEmailAddress+"','"
                                +studentPhysicaAddress+"','"+studentIDNumber+"')");
//                ResultSet set = stmt.executeQuery("SELECT * FROM `student`");
//                set.next();
//                set.moveToInsertRow();
//                set.updateString("studentFirstName",studentFirstName);
//                set.updateString("studentLastName",studentLastName);
//                set.updateString("studentEmailAddress",studentEmailAddress);
//                set.updateString("studentPhysicaAddress",studentPhysicaAddress);
//                set.updateString("studentIDNumber",studentIDNumber);
//
//                set.insertRow();
//                set.moveToCurrentRow();
                return true;
            }catch(SQLException e) {
                System.out.println("Student adding was not successful "+e);
                return false;
            }
        }
    }
    //class to search for student
    public class Searcher
    {
        private Statement stmt ;

        public Searcher()
        {
            stmt = DatabaseCoonection.connectAndGetStatement();
        }

        public  boolean search(String studentIDNumber)
        {
            try {
                ResultSet set = stmt.executeQuery("SELECT * FROM `student` WHERE studentIDNumber = '" + studentIDNumber + "'");
                if(set.next())
                {
                    System.out.println("studentIDNumber : "+set.getString("studentIDNumber")+ " and your email is : "
                            +set.getString("studentEmailAddress"));

                    return true;
                }else
                {

                    return false;
                }

            }catch
            (SQLException e)
            {
                System.out.println("Something happened while searching "+ e);
                return false;
            }
        }
    }
    //Class to update student information to database
    public class UpdateInformation
    {
        public UpdateInformation()
        {
   stmt = DatabaseCoonection.connectAndGetStatement();
        }

        public boolean updateInfo(String studentIDNumber) {
            try {
                ResultSet set = stmt.executeQuery("SELECT * FROM `student` WHERE studentIDNumber = '" + studentIDNumber + "'");
                set.next();
                System.out.println("Insert ID to update with");
                Scanner input = new Scanner(System.in);
                set.updateString("studentIDNumber",input.nextLine());
               set.updateRow();
                System.out.println("Student ID was updated successful");
                return true;
            }catch (SQLException e)
            {
                System.out.println("Updating information failed ");
                return false;
            }
        }
    }

    //class to delete student information
    public class Deleteinformation
    {
            private  Statement stmt;
        public Deleteinformation()
        {
                stmt = DatabaseCoonection.connectAndGetStatement();
        }



        public boolean deletenow(String studentIDNumber)
        {
            try {

//                ResultSet set = stmt.executeQuery("SELECT * FROM `student` WHERE studentIDNumber = '" + studentIDNumber + "'");
//                set.next();
//                set.deleteRow();
//                MainClass.RetrieveData myRetriever = new MainClass().new RetrieveData();

                int result=stmt.executeUpdate("DELETE FROM student WHERE studentIDNumber ='"+studentIDNumber+"'");
                System.out.println(studentIDNumber + " was deleted successful");

                return true;

            }catch(SQLException e)
            {
                System.out.println("Something happened while deleting");
                return false;
            }
        }
    }


    //create class to retrieve value to the database
    public class RetrieveData
    {
        private Statement stmt;
        public RetrieveData()
        {
                stmt = DatabaseCoonection.connectAndGetStatement();
        }

        public boolean retrieveAll()
        {

            try {
                ResultSet set = stmt.executeQuery("SELECT * FROM `student`");


                while (set.next()) {
                    System.out.println(set.getString("studentIDNumber")
                            +" "+set.getString("studentEmailAddress")+" "+
                            set.getString("studentPhysicaAddress"));
                }
                return true;
            }catch (SQLException e)
            {
                System.out.println("Mission failed while retrieving all information");
                return false;
            }
        }
    }



    public static void main(String [] argv)
    {
        //main class to call methods
        Scanner input = new Scanner (System.in);
        System.out.println("Please the student ID number to choose function");
        String studentID = input.nextLine();
        System.out.println();

        System.out.println("PLease choose your option");
        System.out.println("1 to insert student");
        System.out.println("2 to delete student");
        System.out.println("3 update student");
        System.out.println("4 to retrieve all student");
        System.out.println("5 to find student by name");

            int i = input.nextInt();
System.out.println();

                boolean bool = false ;

                //Switch statements for selecting functions
        switch (i) {
            case 1:

                String studentFirstName,studentLastName,studentEmailAddress,studentPhysicaAddress;
                Scanner scan = new Scanner (System.in);
                System.out.println("Please the student student first name");
                studentFirstName = scan.nextLine();
                System.out.println("Please the student student last name");
                studentLastName = scan.nextLine();
                System.out.println("Please the student studentemail address");
                studentEmailAddress = scan.nextLine();
                System.out.println("Please the student student address");
                studentPhysicaAddress = scan.nextLine();
                bool = new MainClass().new AddData().addStudent(studentID,
                        studentFirstName,studentLastName,studentEmailAddress,studentPhysicaAddress);

                if (bool) {
                    System.out.println("Student number " + studentID + " is insert");
                }
                break;
            case 2:

                bool = new MainClass().new Deleteinformation().deletenow(studentID);
                if (bool) {
                    System.out.println("Student number " + studentID + " is deleted");
                }
                break;
            case 3:
                bool = new MainClass().new UpdateInformation().updateInfo(studentID);
                if (bool) {
                    System.out.println("Student number " + studentID+" information is updated");
                }
                break;
            case 4:

                bool = new MainClass().new RetrieveData().retrieveAll();
                if (bool) {
                    System.out.println("Hello all student has been shown");
                }
                break;

            case 5:
                bool = new MainClass().new Searcher().search(studentID);
                if (bool) {
                    System.out.println("Student is found");
                } else
                {
                    System.out.println("Student not found");
                }
                break;
            default: System.out.println("Option inserted is invalid");
    break;

        }
    }
}
