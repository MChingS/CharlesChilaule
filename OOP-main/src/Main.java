public class Main {


    public static void main(String[] args) {

        //creating objects for student class (main)
        Student studentObj = new Student();
        // method in student class

        studentObj.learn();
        studentObj.monitorClass();
        studentObj.playSport();
        System.out.println("___________________");

        //creating objects for class leader class (sub-class)
        ClassLeader leader = new ClassLeader();
        // method in class-leader class
        leader.learn();
        leader.monitorClass();
        System.out.println("___________________");

        //creating objects for Sport-Person method
        SportPerson sport = new SportPerson();
        // method in sport person class
        sport.learn();
        sport.playSport();
        System.out.println("_________TheEnd__________");
    }
}
