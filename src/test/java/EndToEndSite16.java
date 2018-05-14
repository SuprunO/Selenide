import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite16 {
    User userData;
    Site16 site16locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site16locators = new Site16();
        batch = new Batch();

    }


    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site16);
        $(site16locators.product1).click();
        $(site16locators.ColorField).click();
        $(site16locators.ColorOption).click();
        $(site16locators.AddToCartButton).click();
        $(site16locators.CartLink).click();

        $(site16locators.MinicartViewCartButton).click();
        $(site16locators.CartCheckoutButton).click();
        $(site16locators.GuestLoginContinueButton).click();

        //Shipping
        $(site16locators.FirstName).setValue(userData.FIRSTNAME);
        $(site16locators.Lastname).setValue(userData.LASTNAME);
        $(site16locators.EMail).setValue(userData.EMAIL);
        $(site16locators.Address).setValue(userData.ADDRESS);
        $(site16locators.Telephone).setValue(userData.TELEPHONE);
        $(site16locators.City).setValue(userData.CITY);
        $(site16locators.Country).selectOption(userData.COUNTRY);
        $(site16locators.State).selectOption(userData.STATE);
        $(site16locators.Password).setValue(userData.PASSWORD);
        $(site16locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site16locators.ContinueToDeliveryButton).click();
        $(site16locators.ContinueToDeliveryMethodButton).click();
        $(site16locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site16locators.TermsConditionsRadioButton).click();
        $(site16locators.DeliveryInformationRadioButton).click();
        $(site16locators.PrivacyPolicyRadioButton).click();


        $(site16locators.ContinueToConfirmOrderButton).click();
        $(site16locators.ConfirmOrderButton).click();

        //PayGate
        $(site16locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site16locators.LastnameP).setValue(userData.LASTNAME);
        $(site16locators.AddressP).setValue(userData.ADDRESS);
        $(site16locators.CityP).setValue(userData.CITY);
        $(site16locators.CountryP).selectOption(userData.COUNTRY);
        $(site16locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site16locators.EMailP).setValue(userData.EMAIL);


        $(site16locators.IssuingBank).setValue(userData.BANK);
        $(site16locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site16locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site16locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site16locators.CVV2).setValue(userData.CVV2);
        $(site16locators.SubmitTrnsactionButton).click();
    }
}
