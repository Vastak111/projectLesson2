package robots;

public class Robot2 extends DancingRobot{

    private final String roboDancing1 = "Ballet";
    private final String RoboDancing2 = "Folk Dance";
    @Override
    public String getDanceType1() {
        return this.roboDancing1;
    }

    @Override
    public String getDanceType2() {
        return this.RoboDancing2;
    }
}
