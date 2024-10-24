package q1;

public class Tester {
    public static void main(String[] args) {
        Worker worker = new Worker("asek",3455);

        System.out.println(worker);
        Supervisor supervisor = new Supervisor("Rana", 1000.45, "Rajshahi");
        System.out.println(supervisor);

        Director director = new Director("Juhan", 12000.001, "jessore");
        System.out.println(director);
    }
}
