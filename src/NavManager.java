public class NavManager {
    public static NavManager shared = new NavManager();

    private NavManager() {
    }

    public void startProgram() {
        System.out.println("test");
    }
}
