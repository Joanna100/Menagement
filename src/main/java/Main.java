import entity.Boots;
import entity.Cloth;
import entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1l, "admin", "admin");
        Cloth cloth = new Cloth(1l, "T-shirt", 35.9f, 0.3f, "Black", 10,"XL", "Cotton");
        Boots boots = new Boots(1l, "High heels", 99.9f, .5f, "Red", 12, 35, true);

        System.out.println(user.toString());
        System.out.println(cloth.toString());
        System.out.println(boots.toString());
    }
}
