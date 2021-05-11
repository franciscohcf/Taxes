package entities;

public class Company extends TaxPayer{

    private Integer numberF;

    public Company() {
        super();
    }

    public Company(String name, Double income, Integer numberF) {
        super(name, income);
        this.numberF = numberF;
    }

    public Integer getNumberF() {
        return numberF;
    }

    public void setNumberF(Integer numberF) {
        this.numberF = numberF;
    }

    @Override
    public double tax() {
        if (numberF > 10) {
            return (income * 0.14);
        } else {
            return (income * 0.16);
        }
    }
}
