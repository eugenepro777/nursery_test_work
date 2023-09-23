package userInterface;

import model.Pets;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View<Pets> {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }
    @Override
    public String getName() {
        System.out.printf("Кличка: ");
        return in.nextLine();
    }

    @Override
    public String getBirthday() {
        System.out.printf("Введите дату рождения в формате 'dd.mm.yyyy': ");
        return in.nextLine();
    }

    @Override
    public <T> void printAll(List<T> list, Class<T> clazz) {

        System.out.print("\033[H\033[J");
        if (list.isEmpty())
            System.out.println("список пуст");
        else {
            if (clazz == Pets.class)
                System.out.println("\n       Домашние животные:");
            for (T item : list) {
                System.out.println(item);
            }
        }

    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);

    }
}
