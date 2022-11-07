public class BmiService {
    public float calculate(float m, float h) {
        float BMI = (float) Math.ceil(m / (h * h));
        return BMI;
    }
}
