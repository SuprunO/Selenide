import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite22 {
    User userData;
    Site22 site22locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site22locators = new Site22();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site22);
        $(site22locators.product1).click();
        $(site22locators.ColorField).click();
        $(site22locators.ColorOption).click();
        $(site22locators.AddToCartButton).click();

        $(site22locators.MinicartViewCartButton).click();
        $(site22locators.CartCheckoutButton).click();
        $(site22locators.GuestLoginContinueButton).click();

        //Shipping
        $(site22locators.FirstName).setValue(userData.FIRSTNAME);
        $(site22locators.Lastname).setValue(userData.LASTNAME);
        $(site22locators.EMail).setValue(userData.EMAIL);
        $(site22locators.Address).setValue(userData.ADDRESS);
        $(site22locators.Telephone).setValue(userData.TELEPHONE);
        $(site22locators.City).setValue(userData.CITY);
        $(site22locators.Country).selectOption(userData.COUNTRY);
        $(site22locators.State).selectOption(userData.STATE);
        $(site22locators.Password).setValue(userData.PASSWORD);
        $(site22locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site22locators.ContinueToDeliveryButton).click();
        $(site22locators.ContinueToDeliveryMethodButton).click();
        $(site22locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site22locators.TermsConditionsRadioButton).click();
        $(site22locators.DeliveryInformationRadioButton).click();
        $(site22locators.PrivacyPolicyRadioButton).click();


        $(site22locators.ContinueToConfirmOrderButton).click();
        $(site22locators.ConfirmOrderButton).click();

        //PayGate
        $(site22locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site22locators.LastnameP).setValue(userData.LASTNAME);
        $(site22locators.AddressP).setValue(userData.ADDRESS);
        $(site22locators.CityP).setValue(userData.CITY);
        $(site22locators.CountryP).selectOption(userData.COUNTRY);
        $(site22locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site22locators.EMailP).setValue(userData.EMAIL);

        $(site22locators.IssuingBank).setValue(userData.BANK);
        $(site22locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site22locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site22locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site22locators.CVV2).setValue(userData.CVV2);
        $(site22locators.SubmitTrnsactionButton).click();
    }
}
