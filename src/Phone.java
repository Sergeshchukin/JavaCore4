import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phone {


    HashMap<String, ArrayList<String>> NamePhone = new HashMap<>();
    public void add(String name, String number){

        if (!NamePhone.containsKey(name)) {
            ArrayList<String> list= new ArrayList<>();
            list.add(number);
            NamePhone.put(name, list);
        } else {
            ArrayList<String> list2 = NamePhone.get(name);
            list2.add(number);
        }

    }

    public ArrayList<String> get(String name){
        if (!NamePhone.containsKey(name))
            System.out.println("Dont have information");
        return NamePhone.get(name);

    }

    public void init () {

        add("Ivanov", "+79991111111");
        add("Petrov", "+79992222222");
        add("Sidorov", "+79993333333");
        add("Matveev", "+79994444444");
        add("Kosarev", "+79995555555");
        add("Litvinov", "+79996666666");


        for (
                Map.Entry<String, ArrayList<String>> element: NamePhone.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }


    }

}
