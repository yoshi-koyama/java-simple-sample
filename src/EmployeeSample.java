import java.time.LocalDate;

public class EmployeeSample {
    public static void main(String[] args) {
        // Employeeという型の変数を4つのEmployeeインスタンスを作りました
        Employee koyama = new Employee(1, "Koyama Yoshihito", LocalDate.of(2021, 1, 3), LocalDate.of(2025, 1, 3), 1000);

        koyama.setSalary(100000000);

        Employee suzuki = new Employee(2, "Suzuki Yuta", LocalDate.now(), null, 500);
        Employee tanaka = new Employee(3, "Tanaka Daiki", LocalDate.of(2021, 1, 1), null, 600000);
        Employee alan = new Employee(4, "Alan Austin", LocalDate.of(2020, 5, 1), null, 2000000);

        Employee yamada = new Employee();

        // cmd + click
        // ctrol + click
        // intellij cmd + [ mac
        // eclipse alt + ←のカーソルキー
        //        Employee owada = new Employee(5, "Owasa Toshihiro", )


    }
}
