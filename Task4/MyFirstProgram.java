class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.methodOne(i);
                o.methodTwo(j);
                System.out.print(o.actionOnNumbers());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int oneNum;
    private int twoNum;
	//конструктор иниц. объект и значения;
    public MySecondClass(int oneNum, int twoNum ) {
        this.oneNum = oneNum;
        this.twoNum = twoNum;
    }
//метод для изменения значения числа 1
    public void methodOne(int oneNum) {
        this.oneNum = oneNum;
    }
//метод для изменения значения числа 2
    public void methodTwo(int twoNum) {
        this.twoNum = twoNum;
    }
//метод, выполняющий умножение
    public int actionOnNumbers() {
        return oneNum * twoNum;
    }
}