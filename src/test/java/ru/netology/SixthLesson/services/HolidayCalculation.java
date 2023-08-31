package ru.netology.SixthLesson.services;
public class HolidayCalculation {
    public int calculate(int income, int expenses, int threshold, int unexpected) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - (expenses + unexpected); //вычет запланированных и незапланированных трат
            } else {
                money = money + (income - expenses); //приход средств за вычетом расходов

            }
        }
        return count;
    }
}