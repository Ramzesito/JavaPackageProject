package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/main/resources/vacation.csv")
    public void calculate(int income, int expenses, int threshold, int expectedResult) {
        VacationCalcService service = new VacationCalcService();
        int actualResult = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
