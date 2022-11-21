import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Иванов", "Иван"), "89992134876");
        phoneBook.addPhone(new FullName("Сергеев", "Сергей"), "89605689231");
        phoneBook.addPhone(new FullName("Моисеева", "Валентина"), "89028734810");
        phoneBook.addPhone(new FullName("Ракина", "Екатерина"), "89825193671");
        phoneBook.addPhone(new FullName("Андреев", "Анатолий"), "89082647820");
        phoneBook.addPhone(new FullName("Андреев", "Олег"), "89523281869");
        phoneBook.addPhone(new FullName("Осокин", "Алексей"), "89082453243");
        phoneBook.addPhone(new FullName("Андров", "Дмитрий"), "89082721160");
        phoneBook.addPhone(new FullName("Вотинова", "Елена"), "89523293769");
        phoneBook.addPhone(new FullName("Габов", "Альберт"), "89922041820");
        phoneBook.addPhone(new FullName("Гладикова", "Тамара"), "89922390893");
        phoneBook.addPhone(new FullName("Дикидзина", "Евгения"), "+79194841616");
        phoneBook.addPhone(new FullName("Лебедева", "Анастасия"), "89026320534");
        phoneBook.addPhone(new FullName("Лягаева", "Алена"), "89526402026");
        phoneBook.addPhone(new FullName("Мазеин", "Сергей"), "+79922117928");
        phoneBook.addPhone(new FullName("Нешатаев", "Владимир"), "89028070577");
        phoneBook.addPhone(new FullName("Нешатаева", "Людмила"), "89024775531");
        phoneBook.addPhone(new FullName("Рагозин", "Сергей"), "89504551901");
        phoneBook.addPhone(new FullName("Сальникова", "Надежда"), "890263222709");
        phoneBook.addPhone(new FullName("Зубарев", "Александр"), "9824806782");

        System.out.println("Телефонный справочник:");
        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }


    }
}