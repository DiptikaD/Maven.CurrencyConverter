package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    double value = 2.70;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/value;
    }
}
