import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite20 {
    User userData;
    Site20 site20locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site20locators = new Site20();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site20);
        $(site20locators.product1).click();
        $(site20locators.ColorField).click();
        $(site20locators.ColorOption).click();
        $(site20locators.AddToCartButton).click();

        $(site20locators.MinicartViewCartButton).click();
        $(site20locators.CartCheckoutButton).click();
        $(site20locators.GuestLoginContinueButton).click();

        //Shipping
        $(site20locators.FirstName).setValue(userData.FIRSTNAME);
        $(site20locators.Lastname).setValue(userData.LASTNAME);
        $(site20locators.EMail).setValue(userData.EMAIL);
        $(site20locators.Address).setValue(userData.ADDRESS);
        $(site20locators.Telephone).setValue(userData.TELEPHONE);
        $(site20locators.City).setValue(userData.CITY);
        $(site20locators.Country).selectOption(userData.COUNTRY);
        $(site20locators.State).selectOption(userData.STATE);
        $(site20locators.Password).setValue(userData.PASSWORD);
        $(site20locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site20locators.ContinueToDeliveryButton).click();
        $(site20locators.ContinueToDeliveryMethodButton).click();
        $(site20locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site20locators.TermsConditionsRadioButton).click();
        $(site20locators.DeliveryInformationRadioButton).click();
        $(site20locators.PrivacyPolicyRadioButton).click();


        $(site20locators.ContinueToConfirmOrderButton).click();
        $(site20locators.ConfirmOrderButton).click();

        //PayGate
        $(site20locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site20locators.LastnameP).setValue(userData.LASTNAME);
        $(site20locators.AddressP).setValue(userData.ADDRESS);
        $(site20locators.CityP).setValue(userData.CITY);
        $(site20locators.CountryP).selectOption(userData.COUNTRY);
        $(site20locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site20locators.EMailP).setValue(userData.EMAIL);

        $(site20locators.IssuingBank).setValue(userData.BANK);
        $(site20locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site20locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site20locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site20locators.CVV2).setValue(userData.CVV2);
        $(site20locators.SubmitTrnsactionButton).click();
    }
}
