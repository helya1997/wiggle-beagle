import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            } else
                break;
            haveFun(person);
        }
    }


    public static void haveFun(Object person) {
        if (person instanceof Player) {
            ((Player) person).play();
        }

        if (person instanceof Dancer) {
            Dancer dancer = (Dancer) person;
            dancer.dance();
        }

    }
}