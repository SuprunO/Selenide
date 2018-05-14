import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite19 {
    User userData;
    Site19 site19locators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site19locators = new Site19();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site19);
        $(site19locators.product1).click();
        $(site19locators.ColorField).click();
        $(site19locators.ColorOption).click();
        $(site19locators.AddToCartButton).click();

        $(site19locators.MinicartViewCartButton).click();
        $(site19locators.CartCheckoutButton).click();
        $(site19locators.GuestLoginContinueButton).click();

        //Shipping
        $(site19locators.FirstName).setValue(userData.FIRSTNAME);
        $(site19locators.Lastname).setValue(userData.LASTNAME);
        $(site19locators.EMail).setValue(userData.EMAIL);
        $(site19locators.Address).setValue(userData.ADDRESS);
        $(site19locators.Telephone).setValue(userData.TELEPHONE);
        $(site19locators.City).setValue(userData.CITY);
        $(site19locators.Country).selectOption(userData.COUNTRY);
        $(site19locators.State).selectOption(userData.STATE);
        $(site19locators.Password).setValue(userData.PASSWORD);
        $(site19locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site19locators.ContinueToDeliveryButton).click();
        $(site19locators.ContinueToDeliveryMethodButton).click();
        $(site19locators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site19locators.TermsConditionsRadioButton).click();
        $(site19locators.DeliveryInformationRadioButton).click();
        $(site19locators.PrivacyPolicyRadioButton).click();


        $(site19locators.ContinueToConfirmOrderButton).click();
        $(site19locators.ConfirmOrderButton).click();

        //PayGate
        $(site19locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site19locators.LastnameP).setValue(userData.LASTNAME);
        $(site19locators.AddressP).setValue(userData.ADDRESS);
        $(site19locators.CityP).setValue(userData.CITY);
        $(site19locators.CountryP).selectOption(userData.COUNTRY);
        $(site19locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site19locators.EMailP).setValue(userData.EMAIL);

        $(site19locators.IssuingBank).setValue(userData.BANK);
        $(site19locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site19locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site19locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site19locators.CVV2).setValue(userData.CVV2);
        $(site19locators.SubmitTrnsactionButton).click();
    }
}
