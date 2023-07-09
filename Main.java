import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sunday, monday, tuesday, wednesday, thursday, friday, satday;
        int bonus, bonussum, sum1=0, sum2=0, sum3=0, sum4=0, sum5=0, sum6=0, sum7=0, sum8 = 0;
        int edays=0, totaldays=0, salary=0;
        sunday=scanner.nextInt();
        monday=scanner.nextInt();
        tuesday=scanner.nextInt();
        wednesday=scanner.nextInt();
        thursday=scanner.nextInt();
        friday=scanner.nextInt();
        satday=scanner.nextInt();
        sum1 = sunday * 150;
        sum7=satday*125;
        if(monday <= 8)
        {
            sum2 = monday * 100;
        }
        else if(monday > 8)
        {
            bonus = monday - 8;
            bonussum = bonus * 115;
            sum2 = bonussum + 800;
        }
        if(tuesday <= 8)
        {
            sum3 = tuesday * 100;
        }
        else if(tuesday > 8)
        {
            bonus = tuesday - 8;
            bonussum = bonus * 115;
            sum3 = bonussum + 800;
        }
        if(wednesday <= 8)
        {
            sum4 = wednesday * 100;
        }
        else if(wednesday > 8)
        {
            bonus = wednesday - 8;
            bonussum = bonus * 115;
            sum4 = bonussum + 800;
        }
        if(thursday <= 8)
        {
            sum5 = thursday * 100;
        }
        else if(thursday > 8)
        {
            bonus = thursday - 8;
            bonussum = bonus * 115;
            sum5 = bonussum + 800;
        }
        if(friday <= 8)
        {
            sum6 = friday * 100;
        }
        else if(friday > 8)
        {
            bonus = friday - 8;
            bonussum = bonus * 115;
            sum6 = bonussum + 800;
        }


        totaldays = monday + tuesday + wednesday + thursday + friday;
        if(totaldays > 40)
        {
            edays = totaldays - 40;
            sum8 = edays * 25;
        }
        salary = sum1 + sum2 + sum3 + sum4 + sum5 + sum6 + sum7 + sum8;
            System.out.println(salary);
    }
}