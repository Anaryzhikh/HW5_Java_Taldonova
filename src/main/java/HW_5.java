// Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
//Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
//*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
//**Сравнить время прямого и случайного перебора тысячи элементов словарей.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW_5 {
    public class MyKey {
        public MyKey(Integer index, String color, String pantone) {
        }
    }
    public static void main(String[] args) {
        Map<MyKey, String> colorMap = new HashMap<>();
        colorMap.put(new MyKey(1, "red", "#C92A39"), "красный");
        colorMap.put(2, "blue", "#3E58Ea0", "синий");
        colorMap.put(3, "green", "#078B04", "зеленый");
        System.out.println(colorMap.entrySet());

        colorMap.compute(new MyKey((1, "red", "#C92A39")), ((MyKey, s) -> s = s + "!")));
        }
    }
}
