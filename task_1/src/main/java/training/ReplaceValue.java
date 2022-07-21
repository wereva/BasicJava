package training;

/**
 * We have three variables x,y,z. x & z variable initialized with value 10 and 15.
 * You need to replace the values for these variables using y variable like buffer.
 * After that printed result condition should be true.
 * You should not use implicit set value, like z = 10 and x = 15 or something like that.
 * Any interactions with numbers(digits)
 */
public class ReplaceValue {

    public static void main(String[] args) {
        //given
        int x = 10;
        int z = 15;
        int y;

        //Todo put there you code;
        y = x;
        x = z;
        z = y;

        System.out.println(x == 15 && z == 10);
    }
}
