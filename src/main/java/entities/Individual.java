package entities;

public class Individual extends TaxPayer{

    private Double healthE;

    public Individual() {
        super();
    }

    public Individual(String name, Double income, Double healthE) {
        super(name, income);
        this.healthE = healthE;
    }

    public Double getHealthE() {
        return healthE;
    }

    public void setHealthE(Double healthE) {
        this.healthE = healthE;
    }

    @Override
    public double tax() {
        return (income * 0.25) - (healthE * 0.5);
    }
}
