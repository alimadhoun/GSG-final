import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainObject {

    public static MainObject mainObject = new MainObject();

    private MainObject() {
        PageFactory.initElements(Setup.driver, this);
    }

    @FindBy(xpath = "//*[@class='modal-wmfin']")
    public WebElement askForSignUpPopUp;

    @FindBy(xpath = "//*[@id='cpwm-additionaldisclaimer3']")
    public WebElement askForSignUpPopUpCloseBytton;

    @FindBy(xpath = "//*[@class = 'ml-header-global-cart-text  ml-wm-empty-cart-icon']")
    public WebElement cartButton;
}
