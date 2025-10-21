package myfirstpackage;

public class MySecondClass {
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