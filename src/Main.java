import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//a) Используйте цикл
//        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//        c)  Затем программа должна отобразить этот список
//        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
//        После также отображает его в консоли
//        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//        f)  После объединения отобразить в консоли список С
//        g)   В конце отсортировать элементы списка С по длине слова,
//        сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.
public class Main {
    public static void main(String[] args) {





        ArrayList<String> NamesA = new ArrayList<>();
        ArrayList<String> NamesB = new ArrayList<>();
        ArrayList<String> NamesC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)NamesA.add(scanner.next());
        System.out.println("Список А: " + NamesA);
        for (int i = 0; i < 5; i++) NamesB.add(scanner.next());
        System.out.println("Список Б: " + NamesB);

        NamesC.addAll(NamesA);
        NamesC.addAll(NamesB);
        System.out.println("Список проверки слияния: " + NamesC);
       NamesC.set(0, NamesA.get(0));
        NamesC.set(1, NamesB.get(4));
        NamesC.set(2, NamesA.get(1));
        NamesC.set(3, NamesB.get(3));
        NamesC.set(4, NamesA.get(2));
        NamesC.set(5, NamesB.get(2));
        NamesC.set(6, NamesA.get(3));
        NamesC.set(7, NamesB.get(1));
        NamesC.set(8, NamesA.get(4));
        NamesC.set(9, NamesB.get(0));
        System.out.println(NamesC);

        NamesC.sort(Comparator.comparing(String::length));
        System.out.println(NamesC);
    }
}