import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite21 {
    User userData;
    Site21 site21locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site21locators = new Site21();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site21);
        $(site21locators.product1).click();
        $(site21locators.ColorField).click();
        $(site21locators.ColorOption).click();
        $(site21locators.AddToCartButton).click();

        $(site21locators.MinicartViewCartButton).click();
        $(site21locators.CartCheckoutButton).click();
        $(site21locators.GuestLoginContinueButton).click();

        //Shipping
        $(site21locators.FirstName).setValue(userData.FIRSTNAME);
        $(site21locators.Lastname).setValue(userData.LASTNAME);
        $(site21locators.EMail).setValue(userData.EMAIL);
        $(site21locators.Address).setValue(userData.ADDRESS);
        $(site21locators.Telephone).setValue(userData.TELEPHONE);
        $(site21locators.City).setValue(userData.CITY);
        $(site21locators.Country).selectOption(userData.COUNTRY);
        $(site21locators.State).selectOption(userData.STATE);
        $(site21locators.Password).setValue(userData.PASSWORD);
        $(site21locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site21locators.ContinueToDeliveryButton).click();
        $(site21locators.ContinueToDeliveryMethodButton).click();
        $(site21locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site21locators.TermsConditionsRadioButton).click();
        $(site21locators.DeliveryInformationRadioButton).click();
        $(site21locators.PrivacyPolicyRadioButton).click();


        $(site21locators.ContinueToConfirmOrderButton).click();
        $(site21locators.ConfirmOrderButton).click();

        //PayGate
        $(site21locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site21locators.LastnameP).setValue(userData.LASTNAME);
        $(site21locators.AddressP).setValue(userData.ADDRESS);
        $(site21locators.CityP).setValue(userData.CITY);
        $(site21locators.CountryP).selectOption(userData.COUNTRY);
        $(site21locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site21locators.EMailP).setValue(userData.EMAIL);

        $(site21locators.IssuingBank).setValue(userData.BANK);
        $(site21locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site21locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site21locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site21locators.CVV2).setValue(userData.CVV2);
        $(site21locators.SubmitTrnsactionButton).click();
    }
}
