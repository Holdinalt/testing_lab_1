package lab1;

public class FirstTask {
    public static double arcsin(double x){
        if (Math.abs(x) > 1)
            return Double.NaN;

        double answer = x;
        double sum = 1;
        double n = 2;
        double a = 1;
        double b = 2;

        while (Math.abs(sum) > 0.0001)
        {
            sum = ((double)a / b) * (Math.pow(x, 2 * n - 1) / (2 * n - 1));
            a *= 2L * n - 1;
            b *= 2L * n;
            n += 1L;
            answer += sum;
        }

        return answer;
    }
}
