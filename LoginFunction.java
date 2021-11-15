import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LoginFunction {
    public static void main(String[] args) throws IOException {
        Scanner in =  new Scanner(System.in);

        String pins = "src/pins.txt";
        Path pinStore = Paths.get(pins);
        List<String> pinData = Files.readAllLines(pinStore);

        String accounts = "src/accounts.txt";
        Path accountStore = Paths.get(accounts);
        List<String> accountData = Files.readAllLines(accountStore);
        System.out.println("Enter Account number : ");
        String AccountNum = in.nextLine();
        int accountId = -1;

        for(int i=0; i<accountData.toArray().length; i++)
        {
            if(Objects.equals(AccountNum, accountData.get(i)))
            {
                accountId = i;
                break;
            }
        }
        if (accountId == -1)
        {
            System.out.println("Account Does not Exist !");
        }
        else
        {
            System.out.println("Enter Password : ");
            String Pin = in.nextLine();
            if(Objects.equals(Pin, pinData.get(accountId)))
            {
                System.out.println("Welcome to CAKA Bank , login successful ! ");
            }
            else
            {
                System.out.println("incorrect pin , transaction failed");
            }
        }
    }
}
