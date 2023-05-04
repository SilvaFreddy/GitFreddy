package Steps;

import PageObjects.flightPageObject;
import net.thucydides.core.annotations.Step;
import java.awt.*;
import java.awt.event.KeyEvent;

public class flightStep {

    flightPageObject objflight = new flightPageObject();

    @Step
    public void open() {
        objflight.open();
    }

    @Step
    public void clickType() {
        objflight.getDriver().findElement(objflight.getTYPE()).click();
    }

    @Step
    public void robotPassengers() {
        objflight.getDriver().findElement(objflight.getPASSENGERS()).click();

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listDeparting() {
        objflight.getLISTDEPARTING().selectByValue("Portland");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listDateMonthOn() {
        objflight.getLISTDATEMONTH().selectByIndex(11);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listDateDayOn() {
        objflight.getLISTDAYON().selectByIndex(7);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listArriving() {
        objflight.getLISTDAARRIVING().selectByValue("Zurich");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listDateMonthTo() {
        objflight.getLISTDDATEMONTHTO().selectByIndex(5);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listDateDayTo() {
        objflight.getLISTDAYTO().selectByIndex(5);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickService() {
        objflight.getDriver().findElement(objflight.getSERVICE()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void robotAirline() {
        objflight.getDriver().findElement(objflight.getAIRLINE()).click();

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickContinue(){
        objflight.getDriver().findElement(objflight.getCONTINUE()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
