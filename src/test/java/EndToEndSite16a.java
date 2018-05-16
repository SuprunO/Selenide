import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite16a {
    User userData;
    Site16a site16alocators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site16alocators = new Site16a();
        batch = new Batch();

    }


    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site16a);
        $(site16alocators.product1).click();
        $(site16alocators.ColorField).click();
        $(site16alocators.ColorOption).click();
        $(site16alocators.AddToCartButton).click();
        $(site16alocators.CartLink).click();

        $(site16alocators.MinicartViewCartButton).click();
        $(site16alocators.CartCheckoutButton).click();
        $(site16alocators.GuestLoginContinueButton).click();

        //Shipping
        $(site16alocators.FirstName).setValue(userData.FIRSTNAME);
        $(site16alocators.Lastname).setValue(userData.LASTNAME);
        $(site16alocators.EMail).setValue(userData.EMAIL);
        $(site16alocators.Address).setValue(userData.ADDRESS);
        $(site16alocators.Telephone).setValue(userData.TELEPHONE);
        $(site16alocators.City).setValue(userData.CITY);
        $(site16alocators.Country).selectOption(userData.COUNTRY);
        $(site16alocators.State).selectOption(userData.STATE);
        $(site16alocators.Password).setValue(userData.PASSWORD);
        $(site16alocators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site16alocators.ContinueToDeliveryButton).click();
        $(site16alocators.ContinueToDeliveryMethodButton).click();
        $(site16alocators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site16alocators.TermsConditionsRadioButton).click();
        $(site16alocators.DeliveryInformationRadioButton).click();
        $(site16alocators.PrivacyPolicyRadioButton).click();


        $(site16alocators.ContinueToConfirmOrderButton).click();
        $(site16alocators.ConfirmOrderButton).click();

        //PayGate
        $(site16alocators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site16alocators.LastnameP).setValue(userData.LASTNAME);
        $(site16alocators.AddressP).setValue(userData.ADDRESS);
        $(site16alocators.CityP).setValue(userData.CITY);
        $(site16alocators.CountryP).selectOption(userData.COUNTRY);
        $(site16alocators.TelephoneP).setValue(userData.TELEPHONE);
        $(site16alocators.EMailP).setValue(userData.EMAIL);


        $(site16alocators.IssuingBank).setValue(userData.BANK);
        $(site16alocators.CardNumber).setValue(userData.CARDNUMBER);
        $(site16alocators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site16alocators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site16alocators.CVV2).setValue(userData.CVV2);
        $(site16alocators.SubmitTrnsactionButton).click();
    }
}
