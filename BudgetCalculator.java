public class BudgetCalculator{
    public static void main(String args[]){
        final double SALARY = 3000.0;
        final double SAVINGS_PERCENT = .20;
        final double RENT_PERCENT = .30;
        final double GROCERIES_PERCENT = .15;
        final double ENTERTAINMENT_PERCENT = .10;

        double monthlySalary = SALARY;
        double savedAmount = monthlySalary * SAVINGS_PERCENT;
        double rentAmount = monthlySalary * RENT_PERCENT;
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        double remainingBalance = monthlySalary - totalExpenses;

        System.out.println("Monthly salary: " + monthlySalary);
        System.out.println("Amount saved: " + savedAmount);
        System.out.println("Amount spent on rent:" + rentAmount);
        System.out.println("Amount spent on groceries: " + groceriesAmount);
        System.out.println("Amount spent on entertainment: " + entertainmentAmount);
        System.out.println("Total expenses: " + totalExpenses);
        System.out.println("Remaining balance: " + remainingBalance);
    }
}