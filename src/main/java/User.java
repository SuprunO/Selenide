import java.util.Random;

public class User {
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }


    public String FIRSTNAME = "Rob";
    public String LASTNAME = "Kawalski";
    public String DOB = "05/21/1970";
    public String EMAIL =   getSaltString()+"@gmail.com";
    public String TELEPHONE = "+44567-56-65";
    public String ADDRESS = "Brookyn st, 45";
    public String CITY = "New york";
    public String POSTCODE = "03125";
    public String PASSWORD = "156423";

    //Credentials for paypage
    public String COUNTRY = "United States";
    public String STATE = "Illinois";
    public String BANK = "CityBank";
    public String CARDNUMBER = "4444333322221111";
    public String EXPMONTH = "02";
    public String EXPYEAR = "2020";
    public String CVV2 = "987";



}
