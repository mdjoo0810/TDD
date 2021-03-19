package kr.jmd.tdd;

public class tdd_001 {

    public static void main(String[] args) {
        String[] tmp = {"1", "2", "3", "4", "5", "6"};

        variant(tmp);
    }

    public static void variant(String[] args) {
        // 추가 부분 1 ==============================
        if(args.length == 0) {
            System.out.println("데이터가 입력되지 않았습니다.");
            return;
        }
        // ========================================

        // 추가 부분 2 ==============================
        else if (args.length == 1) {
            System.out.println("2개 이상의 데이터를 입력해주세요.");
            return;
        }
        // ========================================

        double[] s = new double[args.length];

        for (int i = 0; i < args.length; i++) {
            s[i] = Double.parseDouble(args[i]);
        }

        double sum = 0.0;
        for (double v : s) {
            sum += v;
        }

        double mean = sum / s.length;

        double sumOfSquares = 0.0;

        for (double v : s) {
            sumOfSquares += (v - mean) * (v - mean);
        }

        double variance = sumOfSquares / (s.length - 1);

        System.out.printf("분산 : %2f%n", variance);
    }

}
