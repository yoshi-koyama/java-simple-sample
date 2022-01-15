import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExceptionSample {

    public static void main(String[] args) throws UserNotFoundException {
        String input = "Yusuke";

        String lastName = findUser(input);
        if (lastName == null) {
            throw new UserNotFoundException("User: " + input);
        }
        System.out.println("================");
        System.out.printf("User: %s\n", lastName);
        System.out.println("================");
    }

    static String findUser(String username) {
        return userSource.get(username);
    }

    static Map<String, String> userSource = Stream.of(new String[][]{
            {"Yoshihito", "Koyama"},
            {"Misaki", "Tanaka"},
    }).collect(Collectors.collectingAndThen(
            Collectors.toMap(data -> data[0], data -> data[1]),
            Collections::<String, String>unmodifiableMap));
}
