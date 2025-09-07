import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter you Income in Lakhs : ");
        float income = sc.nextFloat();
        float tax = 0;

        if(income <= 2.5)//if income less than 2.5 you have no tax to pay
        {
            tax = tax + 0;
        }
        else if(income > 2.5 && income <= 5f)//if income more than 2.5 and less tha 5 you have to pay 5% tax
        {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5f && income <= 10f)//if income more than 5 and less than 10 you have to pay 20%tax as well as 5%
        {
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.05f * (5f - 2.5f);
        }
        else//if your income more than 10 then you have to pay 30% as well as 20% or 5% as i mentioned
        {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income -10f);
        }

        System.out.println("The Total Tax Paid by the Employee is : " + tax);

        sc.close();
    }
}