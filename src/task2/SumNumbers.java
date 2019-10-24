package task2;

public class SumNumbers {

    int Sum(int num){
        int sumOfResiduals = 0;
        do{
            sumOfResiduals += num%10;
            num = num/10;
        } while (num != 0 && num != 0);
        return sumOfResiduals;
    }
}
