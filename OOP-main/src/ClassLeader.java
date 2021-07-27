public class ClassLeader extends Student{ //IS A relationship

    //abstraction showing only information necessary for the class
    @Override
    public void monitorClass() {
        System.out.println("Monitor method in class-leader class");
    }
    @Override //polymorphism
    public void learn() {
        System.out.println("Common method in class-leader which is Learning method");

    }

}
