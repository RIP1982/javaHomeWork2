/* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
import org.json.simple.JSONObject;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        JSONObject data = new JSONObject();
        data.put("name", "Ivanov");
        data.put("country", "Russia");
        data.put("city", "Moscow");
        data.put("age", "null");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input request(name, country, city or age): ");
        String where = iScanner.nextLine();
        if (data.get(where) != "null") {
            System.out.println("select * from students where " + where + " " +
                    data.get(getRequest(where).toString()));
        } else { System.out.println("Request denied!"); }
    }

    static StringBuilder getRequest(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}