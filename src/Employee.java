import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    // フィールド -> 情報
    // メソッド -> 振る舞い
    //　情報

    // publicなフィールドはNG Level1
    // カプセル化　オブジェクト指向の言葉 Level2
    // オブジェクト指向 カプセル化　多態性（ポリモーフィズム）　継承 Level3
    private int id;

    private String name;

    private LocalDate enteredDate;

    private LocalDate retiredDate;

    private int salary;

    // publicなフィールドはNG
    private int age;

    // ctrol + enter
    // constructor
    public Employee(int id, String name, LocalDate enteredDate, LocalDate retiredDate, int salary) {
        this.id = id;
        this.name = name;
        this.enteredDate = enteredDate;
        this.retiredDate = retiredDate;
        this.salary = salary;
    }

    public Employee() {

    }

    // メソッド
    public int getId() {
        return this.id;
    }

    // getterというメソッド
    public int getSalary() {
        return this.salary;
    }

    //    intellij ctrol + alt + h
    // method reference shortcut
    // ctrol + h....? eclipse
    // setSalary
    public void setSalary(int amoutToRaise) {
        this.salary = salary;
    }

    // 退職金の計算
    public int calculateRetirementBonus() {
        return 2000 * Math.toIntExact(ChronoUnit.YEARS.between(this.enteredDate, this.retiredDate));
    }
}
