package TDD;

public class StrangeCalculator {

    public int calculate(int input) {
        //大于0的逻辑
        if (input > 0) {
            return doGivenGreaterThan0(input);
        } else if (input < 0) {
            return doGivenLessThan0(input);
        } else {
            return doGivenEquals0(input);
        }
    }

    private int doGivenEquals0(int input) {
        return 0;
    }

    private int doGivenLessThan0(int input) {
        return input + 1;
    }

    private int doGivenGreaterThan0(int input) {
        return input - 1;
    }
}