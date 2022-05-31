package test_java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class test_height_weight {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入您的身高（单位：m）：");
        BigDecimal score01 = scanner.nextBigDecimal();
        System.out.println("请输入你的体重（单位：kg）：");
        BigDecimal score02 = scanner.nextBigDecimal();
        BigDecimal BMI = score02.divide(score01,2, RoundingMode.HALF_UP);
        BigDecimal lv1= BigDecimal.valueOf(18.5);
        BigDecimal lv2= BigDecimal.valueOf(25);
        BigDecimal lv3= BigDecimal.valueOf(28);
        BigDecimal lv4= BigDecimal.valueOf(32);
        if(BMI.compareTo(lv1)==-1){
            System.out.println("过轻！！！");
        }else if (BMI.compareTo(lv1) >=-1 && BMI.compareTo(lv2) ==-1){
            System.out.println("正常！！！");
        }else if (BMI.compareTo(lv2)>-1 &&BMI.compareTo(lv3) ==-1){
            System.out.println("过重！！！");
        }else if (BMI.compareTo(lv3)> -1 &&BMI.compareTo(lv4) ==-1){
            System.out.println("肥胖！！！");
        }else if (BMI.compareTo(lv4) ==1){
            System.out.println("严重肥胖！！！");
        }

    }
}
