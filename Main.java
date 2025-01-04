import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Banking System");
        float Current_Balance= 1000.0f;
        int Secrete_pin = 2345;
        System.out.println("Choose Your Banking Mode");
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Any Offers\n5.Exit");
        System.out.println("Enter Your Choice");
        int Choice=scanner.nextInt();
        switch(Choice){
            case 1:
                System.out.println("Enter Your Secrete Pin Number");
                int Customer_Pin=scanner.nextInt();
                if (Customer_Pin==Secrete_pin){
                    System.out.print("Please Enter Your Deposit Amount: ");
                    int Deposit_Amount=scanner.nextInt();
                    Current_Balance += Deposit_Amount;
                    System.out.println("Your Amount Deposit Successfully, Thank you");
                    System.out.println("If You Want To Continue Your Transaction Enter '1' Otherwise Enter '0'");
                int Option =scanner.nextInt();
                if (Option==1){
                        System.out.println("Choose Your Banking Mode");
                        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Any Offers\n5.Exit");
                        System.out.println("Enter Your Choice");
                        int Choice1=scanner.nextInt();
                        switch(Choice1){
                            case 1:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin1=scanner.nextInt();
                                if (Customer_Pin1==Secrete_pin){
                                    System.out.print("Please Enter Your Deposit Amount: ");
                                    int Deposit_Amount1=scanner.nextInt();
                                    Current_Balance += Deposit_Amount1;
                                    System.out.println("Your Amount Deposit Successfully, Thank you");
                                
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                System.out.println("If You Want To Continue Your Transaction Enter 'YES' Otherwise Enter 'NO'");
                                String Option1 =scanner.nextLine();
                                if (Option1=="YES"){
                                    
                                }
                                break;
                            case 2:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin2= scanner.nextInt();
                                if (Customer_Pin2==Secrete_pin){
                                    System.out.print("Please Enter Your Withdraw Amount: ");
                                    int Withdraw_Amount=scanner.nextInt();
                                    Current_Balance -= Withdraw_Amount;
                                    System.out.println("Your Amount Withdraw Successfully, Thank you");
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 3:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin3=scanner.nextInt();
                                if (Customer_Pin3==Secrete_pin){
                                    System.out.print("Your Account Current Balance is: "+ Current_Balance);
                                    
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 4:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin4=scanner.nextInt();
                                if (Customer_Pin4==Secrete_pin){
                                    System.out.print("Offers For You: ");
                                    System.out.println("1.Home Loan\n2.Education Loan\n");
                                    System.out.println("Enter Your Choice");
                                    int choice=scanner.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("Thank You For Your Home Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                        case 2:
                                            System.out.println("Thank You For Your Education Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                    }
                                    
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 5 :
                                System.out.println("Thank You For Access Our Bnak");
                                break;
                        }

                        
                                }
                else{
                    System.out.println("Thank You For Access Our Bnak");
                }
                
                }
                else{
                   System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                
                }
                
                break;
            case 2:
                System.out.println("Enter Your Secrete Pin Number");
                int Customer_Pin1= scanner.nextInt();
                if (Customer_Pin1==Secrete_pin){
                    System.out.print("Please Enter Your Withdraw Amount: ");
                    int Withdraw_Amount=scanner.nextInt();
                    Current_Balance -= Withdraw_Amount;
                    System.out.println("Your Amount Withdraw Successfully, Thank you");
                    System.out.println("If You Want To Continue Your Transaction Enter '1' Otherwise Enter '0'");
                int Option1 =scanner.nextInt();
                if (Option1==1){
                                    System.out.println("Choose Your Banking Mode");
                                    System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Any Offers\n5.Exit");
                                    System.out.println("Enter Your Choice");
                                    int Choice1=scanner.nextInt();
                                    switch(Choice1){
                                        case 1:
                                            System.out.println("Enter Your Secrete Pin Number");
                                            int Customer_Pin5=scanner.nextInt();
                                            if (Customer_Pin5==Secrete_pin){
                                                System.out.print("Please Enter Your Deposit Amount: ");
                                                int Deposit_Amount=scanner.nextInt();
                                                Current_Balance += Deposit_Amount;
                                                System.out.println("Your Amount Deposit Successfully, Thank you");
                                            
                                            }
                                            else{
                                            System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                            
                                            }
                                            
                                        case 2:
                                            System.out.println("Enter Your Secrete Pin Number");
                                            int Customer_Pin6= scanner.nextInt();
                                            if (Customer_Pin6==Secrete_pin){
                                                System.out.print("Please Enter Your Withdraw Amount: ");
                                                int Withdraw_Amount1=scanner.nextInt();
                                                Current_Balance -= Withdraw_Amount1;
                                                System.out.println("Your Amount Withdraw Successfully, Thank you");
                                            }
                                            else{
                                            System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                            
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Enter Your Secrete Pin Number");
                                            int Customer_Pin2=scanner.nextInt();
                                            if (Customer_Pin2==Secrete_pin){
                                                System.out.print("Your Account Current Balance is: "+ Current_Balance);
                                                
                                            }
                                            else{
                                            System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                            
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Enter Your Secrete Pin Number");
                                            int Customer_Pin3=scanner.nextInt();
                                            if (Customer_Pin3==Secrete_pin){
                                                System.out.print("Offers For You: ");
                                                System.out.println("1.Home Loan\n2.Education Loan\n");
                                                System.out.println("Enter Your Choice");
                                                int choice=scanner.nextInt();
                                                switch(choice){
                                                    case 1:
                                                        System.out.println("Thank You For Your Home Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                                    case 2:
                                                        System.out.println("Thank You For Your Education Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                                }
                                                
                                            }
                                            else{
                                            System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                            
                                            }
                                            break;
                                        case 5 :
                                            System.out.println("Thank You For Access Our Bnak");
                                            break;
                                    }

                                    
                                            }
                else{
                    System.out.println("Thank You For Access Our Bnak");
                }
                }
                else{
                   System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                
                }
                
                break;
            case 3:
                System.out.println("Enter Your Secrete Pin Number");
                int Customer_Pin2=scanner.nextInt();
                if (Customer_Pin2==Secrete_pin){
                    System.out.print("Your Account Current Balance is: "+ Current_Balance);

                    System.out.println("If You Want To Continue Your Transaction Enter '1' Otherwise Enter '0'");
                int Option3 =scanner.nextInt();
                if (Option3==1){
                        System.out.println("Choose Your Banking Mode");
                        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Any Offers\n5.Exit");
                        System.out.println("Enter Your Choice");
                        int Choice1=scanner.nextInt();
                        switch(Choice1){
                            case 1:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin7=scanner.nextInt();
                                if (Customer_Pin7==Secrete_pin){
                                    System.out.print("Please Enter Your Deposit Amount: ");
                                    int Deposit_Amount=scanner.nextInt();
                                    Current_Balance += Deposit_Amount;
                                    System.out.println("Your Amount Deposit Successfully, Thank you");
                                
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                System.out.println("If You Want To Continue Your Transaction Enter 'YES' Otherwise Enter 'NO'");
                                String Option4 =scanner.nextLine();
                                if (Option4=="YES"){
                                    
                                }
                                break;
                            case 2:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin8= scanner.nextInt();
                                if (Customer_Pin8==Secrete_pin){
                                    System.out.print("Please Enter Your Withdraw Amount: ");
                                    int Withdraw_Amount=scanner.nextInt();
                                    Current_Balance -= Withdraw_Amount;
                                    System.out.println("Your Amount Withdraw Successfully, Thank you");
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 3:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin9=scanner.nextInt();
                                if (Customer_Pin9==Secrete_pin){
                                    System.out.print("Your Account Current Balance is: "+ Current_Balance);
                                    
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 4:
                                System.out.println("Enter Your Secrete Pin Number");
                                int Customer_Pin3=scanner.nextInt();
                                if (Customer_Pin3==Secrete_pin){
                                    System.out.print("Offers For You: ");
                                    System.out.println("1.Home Loan\n2.Education Loan\n");
                                    System.out.println("Enter Your Choice");
                                    int choice=scanner.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("Thank You For Your Home Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                        case 2:
                                            System.out.println("Thank You For Your Education Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                    }
                                    
                                }
                                else{
                                System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                
                                }
                                break;
                            case 5 :
                                System.out.println("Thank You For Access Our Bnak");
                                break;
                        }

                        
                                }
                else{
                    System.out.println("Thank You For Access Our Bnak");
                }
                    
                }
                else{
                   System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                  
                }
                
                break;
            case 4:
                System.out.println("Enter Your Secrete Pin Number");
                int Customer_Pin3=scanner.nextInt();
                if (Customer_Pin3==Secrete_pin){
                    System.out.print("Offers For You: ");
                    System.out.println("1.Home Loan\n2.Education Loan\n");
                    System.out.println("Enter Your Choice");
                    int choice=scanner.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Thank You For Your Home Loan Booking, Another Details are Discussed By our Banking Manager With You");
                        case 2:
                            System.out.println("Thank You For Your Education Loan Booking, Another Details are Discussed By our Banking Manager With You");
                    }
                    System.out.println("If You Want To Continue Your Transaction Enter 'YES' Otherwise Enter 'NO'");
                int Option5 =scanner.nextInt();
                if (Option5==1){
                            System.out.println("Choose Your Banking Mode");
                            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Any Offers\n5.Exit");
                            System.out.println("Enter Your Choice");
                            int Choice4=scanner.nextInt();
                            switch(Choice4){
                                case 1:
                                    System.out.println("Enter Your Secrete Pin Number");
                                    int Customer_Pin9=scanner.nextInt();
                                    if (Customer_Pin9==Secrete_pin){
                                        System.out.print("Please Enter Your Deposit Amount: ");
                                        int Deposit_Amount=scanner.nextInt();
                                        Current_Balance += Deposit_Amount;
                                        System.out.println("Your Amount Deposit Successfully, Thank you");
                                    
                                    }
                                    else{
                                    System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                    
                                    }
                                    
                                case 2:
                                    System.out.println("Enter Your Secrete Pin Number");
                                    int Customer_Pin4= scanner.nextInt();
                                    if (Customer_Pin4==Secrete_pin){
                                        System.out.print("Please Enter Your Withdraw Amount: ");
                                        int Withdraw_Amount=scanner.nextInt();
                                        Current_Balance -= Withdraw_Amount;
                                        System.out.println("Your Amount Withdraw Successfully, Thank you");
                                    }
                                    else{
                                    System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                    
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter Your Secrete Pin Number");
                                    int Customer_Pin5=scanner.nextInt();
                                    if (Customer_Pin5==Secrete_pin){
                                        System.out.print("Your Account Current Balance is: "+ Current_Balance);
                                        
                                    }
                                    else{
                                    System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                    
                                    }
                                    break;
                                case 4:
                                    System.out.println("Enter Your Secrete Pin Number");
                                    int Customer_Pin6=scanner.nextInt();
                                    if (Customer_Pin6==Secrete_pin){
                                        System.out.print("Offers For You: ");
                                        System.out.println("1.Home Loan\n2.Education Loan\n");
                                        System.out.println("Enter Your Choice");
                                        int choice1=scanner.nextInt();
                                        switch(choice1){
                                            case 1:
                                                System.out.println("Thank You For Your Home Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                            case 2:
                                                System.out.println("Thank You For Your Education Loan Booking, Another Details are Discussed By our Banking Manager With You");
                                        }
                                        
                                    }
                                    else{
                                    System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                                    
                                    }
                                    break;
                                case 5 :
                                    System.out.println("Thank You For Access Our Bnak");
                                    break;
                            }

                            
                                    }
                else{
                    System.out.println("Thank You For Access Our Bnak");
                }
                    
                }
                else{
                   System.out.println("Your Secrete Pin Number is Wrong , Please Try Again");
                
                }
                
                break;
            case 5 :
                System.out.println("Thank You For Access Our Bnak");
                break;
        }

        
    scanner.close();

    }
}