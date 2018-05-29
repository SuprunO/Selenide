import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ReportPortalTestNGListener.class})
public class EndToEndSite1 {
    User userData;
    Site0 site1Locators;

    @BeforeTest
    public void StartUp() {
        LoggerHolder.LOGGER.info("sosi pisos1");
        userData = new User();
        site1Locators = new Site0();
    }


    @Test
    public void EndToEndGuest() throws Exception {
        LoggerHolder.LOGGER.info("open site");
        open("http://weddingdev.com");
        LoggerHolder.LOGGER.info("Pass PDP amd add product to Cart");
        $(site1Locators.product1).click();
        $(site1Locators.color).selectOption("white");
        $(site1Locators.size).selectOption("US2");
        $(site1Locators.AddToCartButton).click();
        $(site1Locators.CartLink).click();

        $(site1Locators.MinicartViewCartButton).click();
        LoggerHolder.LOGGER.info("Proceed to checkout");
        $(site1Locators.CartCheckoutButton).click();
        $(site1Locators.GuestLoginContinueButton).click();

        LoggerHolder.LOGGER.info("Pass Shipping Step");
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
        LoggerHolder.LOGGER.info("Pass Delivery Step");
        $(site1Locators.ContinueToDeliveryButton).click();
        LoggerHolder.LOGGER.info("Pass Delivery Method Step");
        $(site1Locators.ContinueToDeliveryMethodButton).click();
        LoggerHolder.LOGGER.info("Pass Payment Method Step");
        $(site1Locators.ContinueToPaymentMethodButton).click();
        LoggerHolder.LOGGER.info("Pass Confirm Order Step");
        $(site1Locators.ContinueToConfirmOrderButton).click();
        LoggerHolder.LOGGER.info("Click on Confirm order button`");
        $(site1Locators.ConfirmOrderButton).click();

        LoggerHolder.LOGGER.info("Paygate Shipping");
        $(site1Locators.FirstNameP).setValue(userData.FIRSTNAME);
        $(site1Locators.LastnameP).setValue(userData.LASTNAME);
        $(site1Locators.AddressP).setValue(userData.ADDRESS);
        $(site1Locators.CityP).setValue(userData.CITY);
        $(site1Locators.CountryP).selectOption(userData.COUNTRY);
        $(site1Locators.TelephoneP).setValue(userData.TELEPHONE);
        $(site1Locators.EMailP).setValue(userData.EMAIL);

        LoggerHolder.LOGGER.info("Paygate Billing");
        $(site1Locators.IssuingBank).setValue(userData.BANK);
        $(site1Locators.CardNumber).setValue(userData.CARDNUMBER);
        $(site1Locators.ExpirationMonth).selectOption(userData.EXPMONTH);
        $(site1Locators.ExpirationYear).selectOption(userData.EXPYEAR);
        $(site1Locators.CVV2).setValue(userData.CVV2);
        $(site1Locators.SubmitTrnsactionButton).click();
    }
}
