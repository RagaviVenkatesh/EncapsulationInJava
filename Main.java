// File: Main.java
public class Main {
    public static void main(String[] args) {
        NetflixAccount user = new NetflixAccount("Riya");

        System.out.println("User: " + user.getUsername());
        System.out.println("Is Premium? " + user.isPremiumUser());

        user.addToWatchHistory("Stranger Things");
        user.addToWatchHistory("The Crown");

        user.viewWatchHistory();

        user.upgradeToPremium();
        System.out.println("Is Premium? " + user.isPremiumUser());

        // 🔴 Illegal: Direct access not allowed
        // user.isPremium = true; // ❌ Compile-time error

        // The object controls everything — that's encapsulation!
    }
}
