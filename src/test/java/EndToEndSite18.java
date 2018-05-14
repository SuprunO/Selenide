import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite18 {
    User userData;
    Site18 site18locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site18locators = new Site18();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site18);
        $(site18locators.product1).click();
        $(site18locators.ColorField).click();
        $(site18locators.ColorOption).click();
        $(site18locators.AddToCartButton).click();

        $(site18locators.MinicartViewCartButton).click();
        $(site18locators.CartCheckoutButton).click();
        $(site18locators.GuestLoginContinueButton).click();

        //Shipping
        $(site18locators.FirstName).setValue(userData.FIRSTNAME);
        $(site18locators.Lastname).setValue(userData.LASTNAME);
        $(site18locators.EMail).setValue(userData.EMAIL);
        $(site18locators.Address).setValue(userData.ADDRESS);
        $(site18locators.Telephone).setValue(userData.TELEPHONE);
        $(site18locators.City).setValue(userData.CITY);
        $(site18locators.Country).selectOption(userData.COUNTRY);
        $(site18locators.State).selectOption(userData.STATE);
        $(site18locators.Password).setValue(userData.PASSWORD);
        $(site18locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site18locators.ContinueToDeliveryButton).click();
        $(site18locators.ContinueToDeliveryMethodButton).click();
        $(site18locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site18locators.TermsConditionsRadioButton).click();
        $(site18locators.DeliveryInformationRadioButton).click();
        $(site18locators.PrivacyPolicyRadioButton).click();


        $(site18locators.ContinueToConfirmOrderButton).click();
        $(site18locators.ConfirmOrderButton).click();

        //PayGate
        $(site18locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site18locators.LastnameP).setValue(userData.LASTNAME);
        $(site18locators.AddressP).setValue(userData.ADDRESS);
        $(site18locators.CityP).setValue(userData.CITY);
        $(site18locators.CountryP).selectOption(userData.COUNTRY);
        $(site18locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site18locators.EMailP).setValue(userData.EMAIL);

        $(site18locators.IssuingBank).setValue(userData.BANK);
        $(site18locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site18locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site18locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site18locators.CVV2).setValue(userData.CVV2);
        $(site18locators.SubmitTrnsactionButton).click();
    }
}
