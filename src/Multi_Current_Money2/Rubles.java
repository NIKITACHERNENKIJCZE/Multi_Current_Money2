package Multi_Current_Money2;

public class Rubles extends Money {

    private String currency;

    public Rubles (int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency () {
        return currency;
    }

    public Money times (int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }
}