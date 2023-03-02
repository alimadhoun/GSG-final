import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class MainScreenTest {

    @Test(priority = 1)
    public void verifyAskForSignUpPopUpIsVisible() {
        Setup.wait.until(ExpectedConditions.visibilityOf(MainObject.mainObject.askForSignUpPopUp));
        assert MainObject.mainObject.askForSignUpPopUp.isDisplayed();
    }

    @Test(priority = 2)
    public void verifyAskForSignUpPopUpCloseButtonIsVisible() {
        Setup.wait.until(ExpectedConditions.visibilityOf(MainObject.mainObject.askForSignUpPopUpCloseBytton));
        assert MainObject.mainObject.askForSignUpPopUpCloseBytton.isDisplayed();
    }

    @Test(priority = 3)
    public void verifyAskForSignUpPopUpCloseButtonIsClickable() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(MainObject.mainObject.askForSignUpPopUpCloseBytton));
        assert MainObject.mainObject.askForSignUpPopUpCloseBytton.isEnabled();
    }

    @Test(priority = 4)
    public void verfiyCartButtonIsVisibale() {
        Setup.wait.until(ExpectedConditions.visibilityOf(MainObject.mainObject.cartButton));
        assert MainObject.mainObject.cartButton.isDisplayed();
    }
}
