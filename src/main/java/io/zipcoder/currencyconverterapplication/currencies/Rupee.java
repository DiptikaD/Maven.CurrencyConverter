package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    double value = 136.64;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/value;
    }
}
