package ru.netology.stats;

public class StatsService {
    public int sumOfSales(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int middleSum(int[] monthlySales) {
        return sumOfSales(monthlySales) / monthlySales.length;
    }

    public int monthOfMaxSales(int[] monthlySales) {
        int monthMax = 0;
        int month = 0;
        for (int maxSales : monthlySales) {
            if (maxSales >= monthlySales[monthMax]) {
                monthMax = month;
            }
            month = month + 1;
        }
        return monthMax + 1;
    }

    public int monthOfMinSales(int[] monthlySales) {
        int monthMin = 0;
        int month = 0;
        for (int minSales : monthlySales) {
            if (minSales <= monthlySales[monthMin]) {
                monthMin = month;
            }
            month = month + 1;
        }
        return monthMin + 1;
    }

    public int calcMonthUnderMiddle(int[] monthlySales) {
        int monthUnderMiddle = 0;
        int middleSales = middleSum(monthlySales);
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] < middleSales) {
                monthUnderMiddle++;
            }
        }
        return monthUnderMiddle;

    }

    public int calcMonthOverMiddle(int[] monthlySales) {
        int monthOverMiddle = 0;
        int middleSales = middleSum(monthlySales);
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > middleSales) {
                monthOverMiddle++;
            }
        }
        return monthOverMiddle;
    }

}
