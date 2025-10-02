#include <iostream>
#include <unordered_map>
#include <string>

int main() {
    // Создание хэш-таблицы для хранения стран и их столиц
    std::unordered_map<std::string, std::string> countryCapital;
    
    // Добавление элементов в хэш-таблицу
    countryCapital["Russia"] = "Moscow";
    countryCapital["Germany"] = "Berlin";
    countryCapital["France"] = "Paris";
    countryCapital["Japan"] = "Tokyo";
    
    // Вывод всех элементов хэш-таблицы
    std::cout << "Countries and their capitals:" << std::endl;
    for (const auto& [country, capital] : countryCapital) {
        std::cout << country << " - " << capital << std::endl;
    }
    
    return 0;
}

