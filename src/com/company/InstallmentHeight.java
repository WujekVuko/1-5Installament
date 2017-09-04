package com.company;

/**
 * Created by michal on 2017-06-27.
 */
class InstallmentHeight {
    private double price;
    private int installmentCount;
    private double rate;
    private double q;
    private double power;

    InstallmentHeight(double p, int i) {
        price = p;
        installmentCount = i;

    }

    void setRate() {
        if (installmentCount <= 12) {
            q = 0x1.008882f0e0a85p0;
            power = Math.pow(q, installmentCount);
            rate = (price * power * (q - 1)) / (power - 1);

        } else if (installmentCount <= 24) {

            q = 0x1.0113404ea4a8cp0;
            power = Math.pow(q, installmentCount);
            rate = (price * power * (q - 1)) / (power - 1);
        } else {
            q = 0x1.021ff2e48e8a7p0;
            power = Math.pow(q, installmentCount);
            rate = (price * power * (q - 1)) / (power - 1);
        }

    }

    double getRate() {
        return rate;
    }

    double getQ() {
        return q;
    }

    double getPower() {
        return power;
    }
}
