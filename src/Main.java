public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float m = 60; // масса тела в килограммах
        float h = (float) 1.65;// рост в метрах
        float BMI = service.calculate(m, h);
        System.out.println("Ваш индекс массы тела равен " + BMI + " кг/м²");

        System.out.println();
        m = 96; // масса тела в кг
        h = (float) 1.85; // рост в см
        BMI = service.calculate(m, h);
        System.out.println("Ваш индекс массы тела равен " + BMI + " кг/м²");

        System.out.println();

        System.out.println("Интерпретация полученных результатов:\n" +
                "16 и менее - выраженный дефицит массы тела\n" +
                "16 — 18,5 - недостаточная (дефицит) масса тела\n" +
                "18,5 — 25 - норма\n" +
                "25 — 30 - избыточная масса тела(предожирение)\n" +
                "30 — 35 - ожирение 1 степени\n" +
                "35 — 40 - ожирение 2 степени\n" +
                "40 и более - ожирение 3 степени\n");

        System.out.println();
        System.out.println("Индекс массы тела следует применять с осторожностью, " +
                "исключительно для ориентировочной оценки!");
    }
}