# Создание словаря для хранения стран и их столиц
country_capital = {}

# Добавление элементов в словарь
country_capital["Russia"] = "Moscow"
country_capital["Germany"] = "Berlin"
country_capital["France"] = "Paris"
country_capital["Japan"] = "Tokyo"

# Вывод всех элементов словаря
print("Countries and their capitals:")
for country, capital in country_capital.items():
    print(f"{country} - {capital}")
