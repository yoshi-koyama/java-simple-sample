import java.util.HashMap;
import java.util.Map;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {
        try {
            Integer salary = getSalary("Tanaka");
            System.out.println(salary);
        } catch (Exception e) {
            System.out.println("Salary was null. Please input a correct name.");
        }

        // step over, step into, resume...

        // salary.xlsx
        // memo.txt 拡張子
        // java-sample-application.jar ビルドした結果のファイル
        // java-sample-application.war ビルドした結果のファイル
        //
    }

    public static Integer getSalary(String name) throws Exception {
        Map<String, Integer> salaryByEmployees = new HashMap<>();
        salaryByEmployees.put("Koyama", 100000);
        salaryByEmployees.put("Tanaka", 10);
        salaryByEmployees.put("Suzuki", 2000000);
        Integer salary = salaryByEmployees.get(name);

        if (salary == null) {
            throw new Exception("Salary was null");
        }
        return salary;
    }
}
