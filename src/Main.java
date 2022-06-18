import robots.Robot1;
import robots.Robot2;

public class Main {
    public static void main(String[] args) {

        Robot1 robot1 = new Robot1();
        Class<Robot1> robot1info = Robot1.class;

        Robot2 robot2 = new Robot2();
        Class<Robot2> robot2info = Robot2.class;

        System.out.println("Robot from class " + robot1info.getName()+ " Can dance " + robot1.getDanceType1());
        System.out.println("Robot from class " + robot2info.getName() + " Can dance " + robot2.getDanceType1());
    }
}