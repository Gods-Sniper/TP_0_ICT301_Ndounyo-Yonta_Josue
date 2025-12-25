public class MainISP {
    public static void main(String[] args) {
        HumanWorker h = new HumanWorker();
        h.work(); h.eat();
        RobotWorker r = new RobotWorker();
        r.work();
    }
}