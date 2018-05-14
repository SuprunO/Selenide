import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EndToEndSite1 {
    User userData;
    Site0 site1Locators;

    @BeforeTest
    public void StartUp() {
        userData = new User();
        site1Locators = new Site0();
    }


    @Test
    public void EndToEndGuest() throws Exception {
        open("http://weddingdev.com");
        $(site1Locators.product1).click();
        $(site1Locators.color).selectOption("white");
        $(site1Locators.size).selectOption("US2");
        $(site1Locators.AddToCartButton).click();
        $(site1Locators.CartLink).click();

        $(site1Locators.MinicartViewCartButton).click();
        $(site1Locators.CartCheckoutButton).click();
        $(site1Locators.GuestLoginContinueButton).click();

        //Shipping
        $(site1Locators.FirstName).setValue(userData.FIRSTNAME);
        $(site1Locators.Lastname).setValue(userData.LASTNAME);
        $(site1Locators.EMail).setValue(userData.EMAIL);
        $(site1Locators.Address).setValue(userData.ADDRESS);
        $(site1Locators.Telephone).setValue(userData.TELEPHONE);
        $(site1Locators.City).setValue(userData.CITY);
        $(site1Locators.Country).selectOption(userData.COUNTRY);
        $(site1Locators.State).selectOption(userData.STATE);
        $(site1Locators.Password).setValue(userData.PASSWORD);
        $(site1Locators.PasswordConfirm).setValue(userData.PASSWORD);

        $(site1Locators.ContinueToDeliveryButton).click();
        $(site1Locators.ContinueToDeliveryMethodButton).click();
        $(site1Locators.ContinueToPaymentMethodButton).click();
        $(site1Locators.ContinueToConfirmOrderButton).click();
        $(site1Locators.ConfirmOrderButton).click();

        //PayGate
        $(site1Locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site1Locators.LastnameP).setValue(userData.LASTNAME);
        $(site1Locators.AddressP).setValue(userData.ADDRESS);
        $(site1Locators.CityP).setValue(userData.CITY);
        $(site1Locators.CountryP).selectOption(userData.COUNTRY);
        $(site1Locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site1Locators.EMailP).setValue(userData.EMAIL);


        $(site1Locators.IssuingBank).setValue(userData.BANK);
        $(site1Locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site1Locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site1Locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site1Locators.CVV2).setValue(userData.CVV2);
        $(site1Locators.SubmitTrnsactionButton).click();
    }
}
