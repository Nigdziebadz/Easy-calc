class Calc {

    int a;
    int b;

    public int CalcAplusB(int a, int b) {
        return a + b;
    }

    public int CalcAminusB(int a, int b) {
        return a - b;
    }
}

class Apllication
{
    public static void main(String[] args) {

        Calc run = new Calc();

        int plusResult = run.CalcAplusB(10, 5);
        int minusResult = run.CalcAminusB(10, 5);

        System.out.println("a plus b result: " + plusResult);
        System.out.println("a minus b result: " + minusResult);
    }
}

