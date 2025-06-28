// File: NetflixAccount.java
public class NetflixAccount {
    private String username;
    private boolean isPremium;
    private String[] watchHistory = new String[10];
    private int historyIndex = 0;

    public NetflixAccount(String username) {
        this.username = username;
        this.isPremium = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPremiumUser() {
        return isPremium;
    }

    public void upgradeToPremium() {
        if (!isPremium) {
            isPremium = true;
            System.out.println(username + " has upgraded to Premium 🎉");
        }
    }

    public void addToWatchHistory(String movie) {
        if (historyIndex < watchHistory.length) {
            watchHistory[historyIndex++] = movie;
        } else {
            System.out.println("Watch history is full! Upgrade your plan to store more.");
        }
    }

    public void viewWatchHistory() {
        System.out.println("📽️ Watch History for " + username + ":");
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(" - " + watchHistory[i]);
        }
    }
}
