package sem2;

import java.util.Scanner;

public class dz1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.
//
//    Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//    // Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


    public static void main(String[] args) {
        inputFloat();
    }

    public static void inputFloat(){
        while (true){
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if(isNum(str)){
                float fl = Float.parseFloat(str);
                System.out.println(fl);
            }

        }
    }

    public static boolean isNum(String str){
        try {
            Float.parseFloat(str);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Некорректно введены данные");
            return false;
        }
    }
}
