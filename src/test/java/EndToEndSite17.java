import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite17 {
    User userData;
    Site17 site17locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site17locators = new Site17();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site17);
        $(site17locators.product1).click();
        $(site17locators.ColorField).click();
        $(site17locators.ColorOption).click();
        $(site17locators.AddToCartButton).click();

        $(site17locators.MinicartViewCartButton).click();
        $(site17locators.CartCheckoutButton).click();
        $(site17locators.GuestLoginContinueButton).click();

        //Shipping
        $(site17locators.FirstName).setValue(userData.FIRSTNAME);
        $(site17locators.Lastname).setValue(userData.LASTNAME);
        $(site17locators.EMail).setValue(userData.EMAIL);
        $(site17locators.Address).setValue(userData.ADDRESS);
        $(site17locators.Telephone).setValue(userData.TELEPHONE);
        $(site17locators.City).setValue(userData.CITY);
        $(site17locators.Country).selectOption(userData.COUNTRY);
        $(site17locators.State).selectOption(userData.STATE);
        $(site17locators.Password).setValue(userData.PASSWORD);
        $(site17locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site17locators.ContinueToDeliveryButton).click();
        $(site17locators.ContinueToDeliveryMethodButton).click();
        $(site17locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site17locators.TermsConditionsRadioButton).click();
        $(site17locators.DeliveryInformationRadioButton).click();
        $(site17locators.PrivacyPolicyRadioButton).click();


        $(site17locators.ContinueToConfirmOrderButton).click();
        $(site17locators.ConfirmOrderButton).click();

        //PayGate
        $(site17locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site17locators.LastnameP).setValue(userData.LASTNAME);
        $(site17locators.AddressP).setValue(userData.ADDRESS);
        $(site17locators.CityP).setValue(userData.CITY);
        $(site17locators.CountryP).selectOption(userData.COUNTRY);
        $(site17locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site17locators.EMailP).setValue(userData.EMAIL);

        $(site17locators.IssuingBank).setValue(userData.BANK);
        $(site17locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site17locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site17locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site17locators.CVV2).setValue(userData.CVV2);
        $(site17locators.SubmitTrnsactionButton).click();
    }
}
