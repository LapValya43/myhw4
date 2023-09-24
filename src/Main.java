public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87; // рост
        int weightInKg = 98; // вес
        int bmi = service.calculate(weightInKg, heightInMeters); // индекс

        System.out.println("Индекс массы тела: " + bmi);
    }
}