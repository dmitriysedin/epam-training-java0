package practicaltasks.task2.exercise5;

/**
 * Created by Dmitriy Sedin on 24.10.2018.
 *
 * Заданы три целых числа, которые задают некоторую дату по Грегорианскому
 календарю (https://ru.wikipedia.org/wiki/Григорианский_календарь). Опреде-
 лить дату следующего дня. Запрещается использовать типы стандартной биб-
 лиотеки языка для работы с датой и временем. Также необходимо учесть то,
 что по григорианскому календарю (используется в настоящим момент) висо-
 косный год определяется следующим образом:

 - годы, кратные 4 – високосные (например, 2008, 2012, 2016);
 - годы, кратные 4 и 100 – невисокосные (например, 1700, 1800, 1900);
 - годы, кратные 4, 100 и 400 – високосные (например, 1600, 2000, 2400).
 */
public class NextDay {

    public static String nextDayDefine(int day, int month, int year){

        String result = "Invalid date";

        boolean a = day > 0 && year > 0 && month > 0 && month < 13 && (day < 28 ||
                day == 28 && month != 2 || day == 29 && month != 2);//если год > 0, месяц 1..12, и день = 1..28 в любом месяце или 28 и 29 день во всех месяцах кроме 2го
        boolean b = year > 0 && day == 30 &&
                    (month == 4 || month == 6 || month == 9 || month == 11);//если год > 0, день = 30 в месяцах где количество дней 30
        boolean c = year > 0 && day == 31 &&
                    (month == 1 || month == 3 || month == 5 || month == 7||
                        month == 8 || month == 10);//если год > 0, день = 31 в месяцах где количество дней 31
        boolean d = year > 0 && day == 31 && month == 12;// если 31 декабря
        boolean e = year > 0 && day > 0 && month > 0 && month < 13 && year%4 == 0;//високосный год
        boolean f = year > 0 && day > 0 && month > 0 && month < 13 && year%4 == 0 && year%100 == 0;//невисокосный год
        boolean g = year > 0 && day > 0 && month > 0 && month < 13 && year%4 == 0 && year%100 == 0 && year%400 == 0;//високосный год


        if(a) {

            result =(day + 1) + "." + month + "." + year;
        }
        if (b || c){

            result = 1 + "." + (month + 1) + "." + year;
        }
        if(d){

            result = 1 + "." + 1 + "." + (year + 1);
        }
        if(day == 28 && month == 2 && ((e && !f) || g)){

            result =(day + 1) + "." + month + "." + year;//если високосный
        }

        if(day == 29 && month == 2 && ((e && !f) || g)){

            result = 1 + "." + (month + 1) + "." + year; //если високосный
        }

        if(day == 28 && month == 2 && (f || !g || !e)){

            result = 1 + "." + (month + 1) + "." + year; //если невисокосный
        }

        return result;
    }
}
