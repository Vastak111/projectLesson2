package robots;

public class Robot1 extends DancingRobot {
    private final String roboDancing1 = "Hip-Hop";
    private final String RoboDancing2 = "Cha-Cha-Cha";
    @Override
    public String getDanceType1() {
        return this.roboDancing1;
    }

    @Override
    public String getDanceType2() {
        return this.RoboDancing2;
    }
}
