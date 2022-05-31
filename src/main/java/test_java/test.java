package test_java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("测试使用！！！！");
//        int sum = 0;
//        for(int i=1;i<=100;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum ==5050 ? "测试通过" : "测试失败");
//        int[] ns = new int[5];
//        ns[0] = 68;
//        ns[1] = 79;
//        ns[2] = 91;
//        ns[3] = 85;
//        ns[4] = 62;
//        for(int j=0;j<ns.length;j++){
//            System.out.println("第"+(j+1)+"同学成绩："+ns[j] );
//
//        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入上次考试成绩：");
        BigDecimal score01 = scanner.nextBigDecimal();
        System.out.println("请输入这次考试成绩：");
        BigDecimal score02 = scanner.nextBigDecimal();
        BigDecimal a = BigDecimal.valueOf(100);
        int val = score02.compareTo(score01);
        BigDecimal score_imcrease = (((score02.subtract(score01)).divide(score01, 4,RoundingMode.HALF_UP)).multiply(a)).abs();
        System.out.println(score_imcrease);
//        String last_chek = score_imcrease.toString().substring(0,5);
        String last_chek = String.format("%.2f",score_imcrease);
        System.out.println(last_chek);

        if(val>0){
            System.out.println("上次成绩:"+score01+"\n"+"本次成绩："+score02);
            System.out.println("您本次成绩提升："+last_chek+"%");
        }else if(val==0){
            System.out.println("上次成绩:"+score01+"\n"+"本次成绩："+score02);
            System.out.println("您本次成绩提升："+last_chek+"%");
        }else{
            System.out.println("上次成绩:"+score01+"\n"+"本次成绩："+score02);
            System.out.println("您本次成绩下降："+last_chek+"%");
        }

    }
}
