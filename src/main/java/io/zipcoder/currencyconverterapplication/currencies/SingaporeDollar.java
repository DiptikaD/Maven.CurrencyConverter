package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    //READ ME IS WRONG???? TEST IS WROONGG????????
    double value = 1.86;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/value;
    }
}
