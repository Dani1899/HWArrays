package ru.netology.stats;

public class StatsService {

    public int allSum(long[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa += sales[i];
        }
        return summa;
    }

    public int averageSum(long[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa += sales[i];
        }
        int average = summa / sales.length;
        return average;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverage(long[] sales) {
        int average = averageSum(sales);


        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                month = month + 1; // или month++

            }


        }
        return month;
    }


    public int AboveAverage(long[] sales) {
        int average = averageSum(sales);


        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month++;

            }


        }
        return month;
    }


}
