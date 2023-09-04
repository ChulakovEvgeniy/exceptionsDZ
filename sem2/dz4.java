package sem2;

import java.util.Scanner;

public class dz4 {
    //    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        exceptions();
    }

    public static void exceptions(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("")){
                throw new RuntimeException("Пустая строка брат");
            }
        }
    }
}
