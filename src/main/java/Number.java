public class Number {

    private final int number;

    Number(int number) {
        this.number = number;
    }

    public int computeFactorial() {
        if(this.number < 0) return -1;
        if(this.number == 0 || this.number == 1) return 1;
        int result = 1;
        for (int i = this.number; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
