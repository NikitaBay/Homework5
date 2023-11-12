package house;

import java.util.*;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> namesAndAge = new HashMap<>();
        namesAndAge.put("Старк Тони Говардович", 43);
        namesAndAge.put("Роджерс Стив Америкович", 35);
        namesAndAge.put("Одинсон Тор Громович", 40);
        namesAndAge.put("Квил Питер Лордович", 12);
        namesAndAge.put("Романов Наташа Вдововна", 34);
        namesAndAge.put("Стрэндж Стивен Докторович", 38);
        namesAndAge.put("Паркер Питер Паукович", 15);
        namesAndAge.put("Перчатков Танос Титанович", 61);
        namesAndAge.put("Я Грут Естьевич", 8);
        namesAndAge.put("Беннер Брюс Халкович", 50);

        ArrayList<String> overEighteen = new ArrayList<>();
        for(Map.Entry<String, Integer> age : namesAndAge.entrySet()) {
            if(age.getValue() > 18) {
                overEighteen.add(age.getKey());
            }
        }
        Collections.sort(overEighteen);
        System.out.println(overEighteen);
    }
}
