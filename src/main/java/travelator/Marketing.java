public class Marketing {
    public static boolean isHotmaillAddress(EmailAddress address) {
        return address.getDomain().equalsIgnoreCase("hotmail.com");
    }
}