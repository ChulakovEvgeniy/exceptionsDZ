package sem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


//текст для быстрой проверки: бомж егор егоревич 05.11.1999 8909 м
public class InputText {
    Scanner scanner = new Scanner(System.in);
    ListHuman listHuman = new ListHuman();
    SaveAndRead saveAndRead = new SaveAndRead();
    public void start(){
        boolean flag = true;
        while (flag){
            System.out.println("Выберите пункт меню:\n" +
                    "1. добавить человека\n" +
                    "2. сохранить в файл\n" +
                    "3. прочитать файл\n" +
                    "4. посмотреть всех людей в списке\n" +
                    "5. выход");
            String numMenu = scanner.nextLine();
            switch (numMenu){
                case "1":
                    createdHuman();
                    break;
                case "2":
                    try {
                        String file = listHuman.getHuman(listHuman.size()-1).getLastName()+ ".txt";
                        saveAndRead.save(listHuman,file);
                        System.out.println("Успешно сохранено");
                    }catch (Exception e){
                        System.out.println("В сохранение произошла ошибка");
                    }
                    break;
                case "3":
                    System.out.println("Введите какой файл хотите прочитать?");
                    String filePath = scanner.nextLine();
                    filePath +=".txt";
                    try {
                        System.out.println(saveAndRead.read(filePath));
                    }catch (Exception e){
                        System.out.println("не найден файл");
                    }
                    break;
                case "4":
                    System.out.println(listHuman.toString());
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("такого пункта меню нет");
                    break;

            }
        }
    }
    public void createdHuman(){
        System.out.println("Введите: Фамилия Имя Отчество датарождения номер телефона пол");
        String str = scanner.nextLine();
        List myList = List.of(str.split(" "));
        System.out.println(myList);
        if (myList.size()!=6){
            System.out.println("Вы указали меньше либо больше значений, попробуйте еще раз");
        }else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(myList.get(3).toString(), formatter);
            String firstName = (String) myList.get(1);
            String lastName = (String) myList.get(0);
            String nameFather = (String) myList.get(2);
            Integer telephone = Integer.parseInt((String) myList.get(4));
            String gender = (String) myList.get(5);
            Human human = new Human(firstName, lastName,nameFather, date, telephone,gender);
            listHuman.addHuman(human);
        }
    }
}
