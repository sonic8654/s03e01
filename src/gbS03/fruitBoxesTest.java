package gbS03;

import java.util.ArrayList;

public class fruitBoxesTest {
    public static void main(String[] args) {
        //создали коробку для яблок, и положили в неёё три яблока
        Box<Apple> appleBox = new Box<>();
        appleBox.putFruit(new Apple(0.12f));
        appleBox.putFruit(new Apple(0.25f));
        appleBox.putFruit(new Apple(0.26f));
        //проверяем - работает.
        System.out.println(appleBox);
        System.out.println("Вес коробки = " + appleBox.getNettoWeight() + " кг ");
        //создали коробку апельсинов
        Box<Orange> orangeBox = new Box<>();
        orangeBox.putFruit(new Orange(0.33f));
        orangeBox.putFruit(new Orange(0.44f));
        orangeBox.putFruit(new Orange(0.28f));
        //проверяем - работает.
        System.out.println(orangeBox);
        System.out.println("Вес коробки = " + orangeBox.getNettoWeight() + " кг ");

        //создаем коробку апельсинов
        Box<Orange> box2 = new Box<>();
        try {
            boxReload(box2,orangeBox);
            System.out.println("Успешно пересыпано " + box2.size() + " свежих апельсинов");
            System.out.println("Коробка - источник содержит " + orangeBox.size() + " апельсинов");
            System.out.println("Содержимое новой коробки: " + '\n');
            System.out.println(box2);

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        //сравниваем коробки
        int comp = Box.Compare(orangeBox,appleBox);
        switch (comp){
            case 0:
                System.out.println("Коробки одинаковые!");
                break;
            case -1:
                System.out.println("Коробка с апельсинами легче");
                break;
            case 1:
                System.out.println("Корбка с апельсинами тяжелее");
                break;
        }

        Integer[] dest = {1,2,3,4,5,6,7};
        System.out.println("Печатаем исходный массив");
        for(Integer i:dest)
            System.out.print(i);

        System.out.println();
        System.out.println("Теперь обмененный массив");
        if(swapArrElem(dest))
            for(Integer i:dest)
                System.out.print(i);

        System.out.println();
        System.out.println("Теперь строки");
        // тоже своп
        String[] destStr = {"a","b","c","d"};
        for(String i:destStr)
            System.out.print(i);

        System.out.println();
        System.out.println("Теперь обмененный массив");
        if(swapArrElem(destStr))
            for(String i:destStr)
                System.out.print(i);

        //преобразуем массив строк в соттветствующий ArrayList
        System.out.println();
        System.out.println("Теперь проверяем создание ArrayList из массива. Берем массив строк, его не жалко)");
        try {
            ArrayList<String> strList = transformArrayToArrayList(destStr);
            System.out.println("Выводим его как лист");
            for (String s : strList) {
                System.out.print(s);
            }
        }catch(ArrayStoreException e){
            e.printStackTrace();
        }

    }

    private static ArrayList<String> transformArrayToArrayList(String[] destStr) {
    }
}
