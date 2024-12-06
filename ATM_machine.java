import java.util.Scanner;

    class user_bank_account // User Class Create
    {
        float user_balance;
        int PIN= 5503;
        String Name="CodSoft";

        public void Checkpin()

        {
            System.out.print("Enter your Pin Number: ");
            Scanner in=new Scanner(System.in);   
            int enterpin=in.nextInt(); 
        
            if (PIN==enterpin)
            {
                AccType();
            }
            
            else
            {
                System.out.println(Name + "Enter the Valid Pin.");
                AccType();
            }
            
            // in.close();
        }
        
        public void AccType()
        {
            
            System.out.println("Enter the Progress you Want to Perform: ");
            System.out.println("1.Check A/C Balance");
            System.out.println("2.Withdraw Money");
            System.out.println("3.DepositMoney");
            System.out.println("4.Exit");
            
            Scanner in=new Scanner(System.in);
            int option=in.nextInt();

            // in.close();

            if (option==1)
            {
                CheckBalance();
            }

            else if (option ==2)
            {
                WithDrawMoney(user_balance);
            }

            else if (option==3)
            {
                DepositMoney(user_balance);
            }

            else if (option ==4)
            {
                return;
            }

            else 
            {
                System.out.println("Enter Valid Option: ");
            }
            
        }

        public void CheckBalance()  //Check Balance Method
        {
            System.out.println("Balance " + user_balance);
            AccType();
        }

        public void WithDrawMoney(float amount) // With Draw Method
        {
            System.out.println("Enter a WithDraw Money: ");
            Scanner in=new Scanner(System.in);
            amount=in.nextFloat();

            if (amount >= user_balance)
            {
                System.out.println("Insufficient  Balance");
            }

            else
            {
                user_balance -=amount; // user_balance= user_balance - amount
                System.out.println("WithDraw Money Succesfully Completed");
            }

            AccType();
            in.close();
        }

        public void DepositMoney(float amount)
        {
                System.out.println("Enter the Deposit Money: ");
                Scanner in=new Scanner(System.in);
                amount=in.nextFloat();
                user_balance +=amount;  // user_balance =user_balance + amount;
                System.out.println("Your Amount Successfully Deposit");
                System.out.println("Thank You "+ Name);

                AccType(); // calling the acc type method to continue progress
                in.close();
            }
        
    }
    
    public class ATM_machine  // Task-3
    {
    public static void main(String[] args)

    
    {

        user_bank_account ubc= new user_bank_account();
        ubc.Checkpin();
        // ubc.CheckBalance();
    
        
    }    

}

