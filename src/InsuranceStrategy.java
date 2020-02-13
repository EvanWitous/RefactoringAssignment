public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    protected abstract int getConstant();

    protected abstract double getWeight();

    protected abstract int getAdjustment();
}
