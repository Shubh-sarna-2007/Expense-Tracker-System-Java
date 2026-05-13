import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("Welcome to our \nExpense Tracker Management System");
        System.out.println();
        ArrayList<Expense> expenses =  new ArrayList<>();
        while(true){
            System.out.println();
            System.out.println("Take a look at our choices : ");
            System.out.println("1. Add Expense : ");
            System.out.println("2. View Expense : ");
            System.out.println("3. Delete Expense : ");
            System.out.println("4. Search Expense : ");
            System.out.println("5. Total Expense : ");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.println("Enter the amount : ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the category : ");
                    String category = scanner.nextLine();
                    System.out.println("Enter the description : ");
                    String description = scanner.nextLine();
                    System.out.println("Enter the date : ");
                    String date = scanner.nextLine();

                    Expense e = new Expense(amount,category,description,date);
                    expenses.add(e);

                    System.out.println("Expenses added Successfully ");
                }
                case 2-> {
                    for(int i=0;i<expenses.size();i++){
                        Expense e = expenses.get(i);
                        System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                    }
                }
                case 3 ->{
                    boolean Deleterunning = true;

                    while(Deleterunning){
                        System.out.println("1. Delete by category");
                        System.out.println("2. Delete by description");
                        System.out.println("3. Delete by date");
                        System.out.println("4. Delete by amount");
                        System.out.println("5. Back");

                        int ch = scanner.nextInt();
                        switch (ch){
                            case 1 -> {
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                }
                                System.out.println("Enter the index of the category you want to delete : ");
                                int index = scanner.nextInt();
                                if(index>=0 && index<expenses.size()){
                                    expenses.remove(index);
                                    System.out.println("Deletion Carried Successfully!");
                                }
                                else{
                                    System.out.println("Invalid Index   ");
                                }
                            }
                            case 2 ->{
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                }
                                scanner.nextLine();
                                System.out.println("Enter the description to delete ");
                                String description = scanner.nextLine();
                                expenses.removeIf(e-> e.description.equalsIgnoreCase(description));
                                System.out.println("Deletion Carried Successfully!");
                            }
                            case 3 ->{
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                }
                                scanner.nextLine();
                                System.out.println("Enter the date to delete ");
                                String date = scanner.nextLine();
                                expenses.removeIf(e-> e.date.equalsIgnoreCase(date));
                                System.out.println("Deletion Carried Successfully!");
                            }
                            case 4 ->{
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                }
                                System.out.println("Enter the amount to delete ");
                                double amount = scanner.nextDouble();
                                expenses.removeIf(e-> e.amount == amount);
                                System.out.println("Deletion Carried Successfully!");
                            }
                            case 5 ->{
                                Deleterunning = false;
                            }
                        }
                    }
                }
                case 4 -> {
                    boolean Searchrunning = true;

                    while(Searchrunning){
                        System.out.println("1. Search by category");
                        System.out.println("2. Search by description");
                        System.out.println("3. Search by date");
                        System.out.println("4. Search by amount");
                        System.out.println("5. Back");

                        int ch =  scanner.nextInt();
                        switch (ch){
                            case 1 -> {
                                System.out.println("Enter category : ");
                                scanner.nextLine();
                                String category = scanner.nextLine();
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    if(e.category.equalsIgnoreCase(category)){
                                        System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("Enter description : ");
                                scanner.nextLine();
                                String description = scanner.nextLine();
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    if(e.description.equalsIgnoreCase(description)){
                                        System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("Enter date : ");
                                scanner.nextLine();
                                String date = scanner.nextLine();
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    if(e.date.equalsIgnoreCase(date)){
                                        System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                    }
                                }
                            }
                            case 4->{
                                System.out.println("Enter amount to search : ");
                                double amount = scanner.nextDouble();
                                for(int i=0;i<expenses.size();i++){
                                    Expense e = expenses.get(i);
                                    if(e.amount == amount){
                                        System.out.println(i + " -> " + e.category + " -> " + e.amount + " -> " + e.description + " -> " + e.date);
                                    }
                                }
                            }
                            case 5 ->{
                                Searchrunning = false;
                            }
                        }
                    }
                }
                case 5 -> {
                    double total = 0;
                    for(int i=0;i<expenses.size();i++){
                        Expense e = expenses.get(i);

                        total+=e.amount;
                    }
                    System.out.println("Total Expense : " +  total);
                }
                case 6 ->{
                    System.out.println("Exiting the Program !");
                    System.out.println("Thanks for using Expense Tracker !");
                    System.exit(0);
                }
            }
        }
    }
}
