import org.openqa.selenium.By;

public class Site0 {
    public String product1 = "#col-sm-40 > h4 > a";
    public String color = "#input-option299";
    public String size = "#input-option300";
    public String AddToCartButton = "#button-cart";
    public String CartLink = "#cart > button.btn.btn-block.btn-inverse.btn-lg.dropdown-toggle";
    public String MinicartViewCartButton = "#col-sm-16 > div.alert.alert-success > a:nth-child(2)";

    public String CartCheckoutButton = "#col-sm-25 > a.btn.btn-primary";
    public String GuestLoginContinueButton = "#button-account";

    public String FirstName = "#input-payment-firstname";
    public String Lastname = "#input-payment-lastname";
    public String EMail =" #input-payment-email";
    public String Telephone = "#input-payment-telephone";
    public String Address = "#input-payment-address-1";
    public String City = "#input-payment-city";
    public String Country = "#input-payment-country";
    public String State = "#input-payment-zone";
    public String Password = "#input-payment-password";
    public String PasswordConfirm = "#input-payment-confirm";

    public String ContinueToDeliveryButton = "#button-register";
    public String ContinueToDeliveryMethodButton = "#button-shipping-address";
    public String ContinueToPaymentMethodButton = "#button-shipping-method";
    public String ContinueToConfirmOrderButton = "#button-payment-method";
    public String ConfirmOrderButton = "#cardgate-confirm";


    //PayGate
    public By FirstNameP = By.name("first_name");
    public By LastnameP = By.name("last_name");
    public By EMailP = By.name("email");
    public By TelephoneP = By.name("phone_number");
    public By AddressP = By.name("address");
    public By CityP = By.name("city");
    public By CountryP = By.name("country_code");

    public By IssuingBank =  By.name("cc_issuer");
    public By CardNumber =  By.name("cc_number");
    public By ExpirationMonth =  By.name("cc_exp_month");
    public By ExpirationYear =  By.name("cc_exp_year");
    public By CVV2 =  By.name("cc_cvv");

    public String SubmitTrnsactionButton ="#formsubmit";

}
