package ru.netology.SixthLesson.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayCalculationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Finans.csv")
//    @CsvSource({
//           "10000,3000,20000",
//           "100000,60000,150000"
//  })


    public void testCalculateHolidays(int income, int expenses, int threshold) {

        HolidayCalculation service = new HolidayCalculation();

        System.out.println("Можно отдыхать " + service.calculate(income, expenses, threshold) + " месяца");


    }
}