package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual income: ");
            double income = sc.nextDouble();
            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double healthE = sc.nextDouble();
                list.add(new Individual(name, income, healthE));
            }
            if (ch == 'c') {
                System.out.println("Number of employees: ");
                int numberF = sc.nextInt();
                list.add(new Company(name, income, numberF));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (TaxPayer t : list) {
            System.out.println(t.getName() + ":" + " $ " + String.format("%.2f",t.tax()));
        }

        double sum = 0;

        for (TaxPayer t : list) {
            sum += t.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES:"+" $ "+String.format("%.2f",sum));

        sc.close();
    }
}
