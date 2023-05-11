package ru.netology.services;

public class VacationCalcService {

    public int calculate(int income, int expenses, int threshold){
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // текущее состояние кошелька
        for (int month = 1; month <= 12; month++){
            if (money >= threshold) { // если накопил больше заданного порога, можно и отдохнуть
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }

}
