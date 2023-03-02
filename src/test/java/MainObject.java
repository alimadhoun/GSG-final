import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainObject {

    public static MainObject mainObject = new MainObject();

    private MainObject() {
        PageFactory.initElements(Setup.driver, this);
    }
}
