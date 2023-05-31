package utils;

import exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

// static payment data to use in our service class.
public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc#01", 12000.0);
        paymentMap.put("acc#02", 10000.0);
        paymentMap.put("acc#03", 5000.0);
        paymentMap.put("acc#04", 8000.0);
    }


    public static boolean validateCreditLimit(String accNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accNo)) {
            throw new InsufficientAmountException("insufficient fund..!");
        } else {
            return true;
        }
    }
}
