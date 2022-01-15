import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeSample {

    public static void main(String[] args) {
//        cmd + /
//        ctrl + /
//        String name = 15; // 文字列
//        int sudentNo = "Yoshihi Koyama";
        // 静的型付け

        // 日付型
        // 今日の日付を変数にして、標準出力（System.out.println)したい

//        LocalDate now = LocalDate.now();
//        System.out.println("今日の日付は" + now.plusDays(1) + "です");
        // boolean ブーリアン
        // true / false
//        String name = "Yoshihito Koyama";
//        String name2 = "Yoshihito Koyama";

//        System.out.println(name.equals(name2));

        // koyamaは2022/1/3に退職した
        LocalDate retiredDate = LocalDate.of(2022, 1, 3);
        LocalDate now = LocalDate.now();
//        System.out.println(now.isEqual(retiredDate));

        List<String> nameList = new ArrayList<>();
        nameList.add("Koyama");
        nameList.add("Tanaka");
        nameList.add("Suzuki");
        nameList.add("Owada");
        nameList.add("Kamata");
        nameList.add("Kobayashi");
        nameList.add("Kanemura");

//        for (String name : nameList) {
//            if (name.startsWith("T")) {
//                System.out.println(name);
//            }
//        }

        Map<String, Integer> salaryByEmployees = new HashMap<>();
        salaryByEmployees.put("Koyama", 100000);
        salaryByEmployees.put("Tanaka", 10);
        salaryByEmployees.put("Suzuki", 2000000);
//        integerの桁数
        System.out.println(salaryByEmployees.get("Tanaka"));

    }

}
