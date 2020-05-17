public class Action {

    private OperationCalc operationCalc = new OperationCalc();

    public double calculation(String operation, double num1, double num2) {
        double num3;
        switch (operation) {
            case ("plus"):
                num3 = operationCalc.plus(num1, num2);
                break;
            case ("minus"):
                num3 = operationCalc.minus(num1, num2);
                break;
            case ("div"):
                num3 = operationCalc.div(num1, num2);
                break;
            case ("times"):
                num3 = operationCalc.times(num1, num2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return num3;
    }
}


