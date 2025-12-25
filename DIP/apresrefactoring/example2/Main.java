public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        OrderProcessor p1 = new OrderProcessor(mysql);
        p1.processOrder("Commande MySQL");

        Database mongo = new MongoDBDatabase();
        OrderProcessor p2 = new OrderProcessor(mongo);
        p2.processOrder("Commande Mongo");
    }
}