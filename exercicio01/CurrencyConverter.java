package exercicio01;

public class CurrencyConverter {
    public static double dollarToReal(double amount, double dollarPrice) {
        double iof = 1.06;
        return amount * dollarPrice * iof;
    }
}
