import java.util.HashMap;
import java.util.Map;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/19
 */

public class Main {
    public static void main(String[] args) {
//        "".substring(1);
        System.out.println(new String("abc".toCharArray(), 0, 1));
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.get("a");
    }
}
