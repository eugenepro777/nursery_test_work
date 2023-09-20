# Итоговая контрольная работа

## Информация о проекте

**Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.**

## Задание

1. **Используя команду cat в терминале операционной системы Linux, создать два файла: Домашние животные, заполнив файл собаками, кошками, хомяками и Вьючные животные, заполнив файл Лошадьми, верблюдами и
ослами, а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).**
![Вариант решения](pictures/task1.PNG "Пункт 1")
2. **Создать директорию, переместить файл туда.**

   ![Вариант решения](pictures/task2.PNG "Пункт 2")
3. **Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.**

   **Для установки пакета из дополнительного репозитория мы воспользуемся способом описанным в документации разработчиков MySQL - <https://dev.mysql.com/doc/mysql-apt-repo-quick-guide/en/#repo-qg-apt-replace-direct>.**

   **Дополнительный репозиторий находится по адресу <https://dev.mysql.com/downloads/repo/apt/>.**
   **Оттуда мы и скачаем deb-пакет и с помощью утилиты dpkg его установим.**

   ![Вариант решения](pictures/download_install_mysql.PNG "Пункт 3_1")

   **Установим MySQL и проведем его настройку, в том числе позаботимся о безопасности.**

   ![Вариант решения](pictures/settings_mysql.PNG "Пункт 3_2")

    **Проверим возможность подключения и статус MySQL.**

    ![Вариант решения](pictures/status_mysql.PNG "Пункт 3_3")

4. **Установить и удалить deb-пакет с помощью dpkg.**

   **После установки deb-пакет с MySQL нам больше не нужен и мы можем его удалить. Так как после удаления остались зависимости, то их мы тоже удалим.**

   ![Вариант решения](pictures/remove_dev_package.PNG "Пункт 4")

5. **Выложить историю команд в терминале ubuntu.**
   **Воспользуемся командой history.**

   ![Вариант решения](pictures/history2.PNG "Пункт 5")

6. **Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: лошади, верблюды и ослы.**

   ![Вариант решения](pictures/BD_animals.drawio.png "Пункт 6")

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

