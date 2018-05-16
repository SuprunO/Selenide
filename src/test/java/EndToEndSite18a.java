import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite18a {
    User userData;
    Site18a site18alocators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site18alocators = new Site18a();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site18a);
        $(site18alocators.product1).click();
        $(site18alocators.ColorField).click();
        $(site18alocators.ColorOption).click();
        $(site18alocators.AddToCartButton).click();

        $(site18alocators.MinicartViewCartButton).click();
        $(site18alocators.CartCheckoutButton).click();
        $(site18alocators.GuestLoginContinueButton).click();

        //Shipping
        $(site18alocators.FirstName).setValue(userData.FIRSTNAME);
        $(site18alocators.Lastname).setValue(userData.LASTNAME);
        $(site18alocators.EMail).setValue(userData.EMAIL);
        $(site18alocators.Address).setValue(userData.ADDRESS);
        $(site18alocators.Telephone).setValue(userData.TELEPHONE);
        $(site18alocators.City).setValue(userData.CITY);
        $(site18alocators.Country).selectOption(userData.COUNTRY);
        $(site18alocators.State).selectOption(userData.STATE);
        $(site18alocators.Password).setValue(userData.PASSWORD);
        $(site18alocators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site18alocators.ContinueToDeliveryButton).click();
        $(site18alocators.ContinueToDeliveryMethodButton).click();
        $(site18alocators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site18alocators.TermsConditionsRadioButton).click();
        $(site18alocators.DeliveryInformationRadioButton).click();
        $(site18alocators.PrivacyPolicyRadioButton).click();


        $(site18alocators.ContinueToConfirmOrderButton).click();
        $(site18alocators.ConfirmOrderButton).click();

        //PayGate
        $(site18alocators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site18alocators.LastnameP).setValue(userData.LASTNAME);
        $(site18alocators.AddressP).setValue(userData.ADDRESS);
        $(site18alocators.CityP).setValue(userData.CITY);
        $(site18alocators.CountryP).selectOption(userData.COUNTRY);
        $(site18alocators.TelephoneP).setValue(userData.TELEPHONE);
        $(site18alocators.EMailP).setValue(userData.EMAIL);

        $(site18alocators.IssuingBank).setValue(userData.BANK);
        $(site18alocators.CardNumber).setValue(userData.CARDNUMBER);
        $(site18alocators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site18alocators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site18alocators.CVV2).setValue(userData.CVV2);
        $(site18alocators.SubmitTrnsactionButton).click();
    }
}
