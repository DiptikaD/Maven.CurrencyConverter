package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    double value = 1.00;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/value;
    }
}
