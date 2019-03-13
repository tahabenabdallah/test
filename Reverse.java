
/**
 * A guess the password program.
 *
 * @author Taha Ben Abdallah
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "theshindig";
    public static String obfuscate(String input)
    {
        return input.replace('s', 'b');
    }
    
    public static void main(String [] args) 
    {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
            return;
        }
        if (args[0].equals(SECRET_PASSWORD))
        {
            System.out.println("You win! Congratulations!");
        }
        else
        {
            System.out.println("That ain't it chief");
        }
    }
}
