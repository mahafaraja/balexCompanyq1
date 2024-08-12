/**
 * author : faraja maha <mahafaraja@gmail.com>
 *     date 10 august 2024
 *     */
public class  balexCompany{

        public void calculatePay(double basePay, int hoursWorked) {

            final double MINIMUM_WAGE = 8.00;
            final int MAX_HOURS = 60;
            final int REGULAR_HOURS = 40;
            final double OVERTIME_RATE = 1.5;


            if (basePay < MINIMUM_WAGE) {
                System.out.println("Error: Base pay must be at least $" + MINIMUM_WAGE + " per hour.");
                return;
            }

            if (hoursWorked > MAX_HOURS) {
                System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS + " hours per week.");
                return;
            }

            double totalPay;
            if (hoursWorked <= REGULAR_HOURS) {
                totalPay = hoursWorked * basePay;
            } else {
                int overtimeHours = hoursWorked - REGULAR_HOURS;
                totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_RATE);
            }

            System.out.println("Total pay: $" + totalPay);
        }

        public static void main(String[] args) {
            balexCompany company = new balexCompany();
            double[] basePays = {7.50, 8.20, 10.00};
            int[] hoursWorked = {35, 47, 73};

            for (int i = 0; i < basePays.length; i++) {
                System.out.println("Employee " + (i + 1) + ":");
                company.calculatePay(basePays[i], hoursWorked[i]);
                System.out.println();
            }
        }
    }




