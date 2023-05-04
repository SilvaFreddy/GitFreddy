package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/test/newtours/reservation.php")
public class flightPageObject extends PageObject {

    By TYPE = By.xpath("//input[@value='roundtrip']");
    By PASSENGERS = By.xpath("//select[@name='passCount']");
    @FindBy(name = "fromPort")
    WebElementFacade LISTDEPARTING;
    @FindBy(name = "fromMonth")
    WebElementFacade LISTDATEMONTH;
    @FindBy(name = "fromDay")
    WebElementFacade LISTDAYON;
    @FindBy(name = "toPort")
    WebElementFacade LISTDAARRIVING;
    @FindBy(name = "toMonth")
    WebElementFacade LISTDDATEMONTHTO;
    @FindBy(name = "toDay")
    WebElementFacade LISTDAYTO;
    By SERVICE = By.xpath("//input[@value='Business']");
    By AIRLINE = By.xpath("//select[@name='airline']");
    By CONTINUE = By.xpath("//input[@name='findFlights']");

    public By getTYPE() {
        return TYPE;
    }

    public void setTYPE(By TYPE) {
        this.TYPE = TYPE;
    }

    public By getPASSENGERS() {
        return PASSENGERS;
    }

    public void setPASSENGERS(By PASSENGERS) {
        this.PASSENGERS = PASSENGERS;
    }

    public WebElementFacade getLISTDEPARTING() {
        return LISTDEPARTING;
    }

    public void setLISTDEPARTING(WebElementFacade LISTDEPARTING) {
        this.LISTDEPARTING = LISTDEPARTING;
    }

    public WebElementFacade getLISTDATEMONTH() {
        return LISTDATEMONTH;
    }

    public void setLISTDATEMONTH(WebElementFacade LISTDATEMONTH) {
        this.LISTDATEMONTH = LISTDATEMONTH;
    }

    public WebElementFacade getLISTDAYON() {
        return LISTDAYON;
    }

    public void setLISTDAYON(WebElementFacade LISTDAYON) {
        this.LISTDAYON = LISTDAYON;
    }

    public WebElementFacade getLISTDAARRIVING() {
        return LISTDAARRIVING;
    }

    public void setLISTDAARRIVING(WebElementFacade LISTDAARRIVING) {
        this.LISTDAARRIVING = LISTDAARRIVING;
    }

    public WebElementFacade getLISTDDATEMONTHTO() {
        return LISTDDATEMONTHTO;
    }

    public void setLISTDDATEMONTHTO(WebElementFacade LISTDDATEMONTHTO) {
        this.LISTDDATEMONTHTO = LISTDDATEMONTHTO;
    }

    public WebElementFacade getLISTDAYTO() {
        return LISTDAYTO;
    }

    public void setLISTDAYTO(WebElementFacade LISTDAYTO) {
        this.LISTDAYTO = LISTDAYTO;
    }

    public By getSERVICE() {
        return SERVICE;
    }

    public void setSERVICE(By SERVICE) {
        this.SERVICE = SERVICE;
    }

    public By getAIRLINE() {
        return AIRLINE;
    }

    public void setAIRLINE(By AIRLINE) {
        this.AIRLINE = AIRLINE;
    }

    public By getCONTINUE() {
        return CONTINUE;
    }

    public void setCONTINUE(By CONTINUE) {
        this.CONTINUE = CONTINUE;
    }
}
