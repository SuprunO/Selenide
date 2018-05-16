import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite17a {
    User userData;
    Site17a site17alocators;
    Batch batch;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site17alocators = new Site17a();
        batch = new Batch();
    }

    @Test
    public void EndToEndGuest() throws Exception {
        open(batch.Site17a);
        $(site17alocators.product1).click();
        $(site17alocators.ColorField).click();
        $(site17alocators.ColorOption).click();
        $(site17alocators.AddToCartButton).click();

        $(site17alocators.MinicartViewCartButton).click();
        $(site17alocators.CartCheckoutButton).click();
        $(site17alocators.GuestLoginContinueButton).click();

        //Shipping
        $(site17alocators.FirstName).setValue(userData.FIRSTNAME);
        $(site17alocators.Lastname).setValue(userData.LASTNAME);
        $(site17alocators.EMail).setValue(userData.EMAIL);
        $(site17alocators.Address).setValue(userData.ADDRESS);
        $(site17alocators.Telephone).setValue(userData.TELEPHONE);
        $(site17alocators.City).setValue(userData.CITY);
        $(site17alocators.Country).selectOption(userData.COUNTRY);
        $(site17alocators.State).selectOption(userData.STATE);
        $(site17alocators.Password).setValue(userData.PASSWORD);
        $(site17alocators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site17alocators.ContinueToDeliveryButton).click();
        $(site17alocators.ContinueToDeliveryMethodButton).click();
        $(site17alocators.ContinueToPaymentMethodButton).click();

        //Radiobuttons
        $(site17alocators.TermsConditionsRadioButton).click();
        $(site17alocators.DeliveryInformationRadioButton).click();
        $(site17alocators.PrivacyPolicyRadioButton).click();


        $(site17alocators.ContinueToConfirmOrderButton).click();
        $(site17alocators.ConfirmOrderButton).click();

        //PayGate
        $(site17alocators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site17alocators.LastnameP).setValue(userData.LASTNAME);
        $(site17alocators.AddressP).setValue(userData.ADDRESS);
        $(site17alocators.CityP).setValue(userData.CITY);
        $(site17alocators.CountryP).selectOption(userData.COUNTRY);
        $(site17alocators.TelephoneP).setValue(userData.TELEPHONE);
        $(site17alocators.EMailP).setValue(userData.EMAIL);

        $(site17alocators.IssuingBank).setValue(userData.BANK);
        $(site17alocators.CardNumber).setValue(userData.CARDNUMBER);
        $(site17alocators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site17alocators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site17alocators.CVV2).setValue(userData.CVV2);
        $(site17alocators.SubmitTrnsactionButton).click();
    }
}
