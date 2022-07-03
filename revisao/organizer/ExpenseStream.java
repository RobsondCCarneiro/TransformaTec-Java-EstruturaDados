package revisao.organizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.stream.Collectors;

import java.util.Scanner;

import java.util.Comparator;
public class ExpenseStream {
    private static List<Expense> expenseList = new ArrayList<Expense>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Informe a quantidade de boletos: ");
        int qt = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i< qt; i++) {

            int id = i;

            System.out.println("Informe o nome do boleto [" + i + "]:");
            String name = scanner.nextLine();

            System.out.println("Informe o valor do boleto [" + i +"]:");
            Double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Informe a data de vencimento do boleto [" + i +"]:");
            String expireDate = scanner.nextLine();

            System.out.println("Informe a categoria do boleto [" + i +"]:");
            String category = scanner.nextLine();

            expenseList.add(new Expense(id, name, amount, category, expireDate));
        }

        for(Expense expense : expenseList){
            System.out.println(expense.getName());
            System.out.println(expense.getAmount());
            System.out.println(expense.getExpireDate());
            System.out.println(expense.getCategory());
        }
    }
}
