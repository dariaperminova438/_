import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Создание хэш-таблицы для хранения стран и их столиц
        HashMap<String, String> countryCapital = new HashMap<>();
        
        // Добавление элементов в хэш-таблицу
        countryCapital.put("Russia", "Moscow");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");
        countryCapital.put("Japan", "Tokyo");
        
        // Вывод всех элементов хэш-таблицы
        System.out.println("Countries and their capitals:");
        for (var entry : countryCapital.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
