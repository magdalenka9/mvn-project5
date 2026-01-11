package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauseTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaKakiashvili\\Desktop\\mvn-project5\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // დაისტარტოს მთლიან ეკრანზე
        driver.get("https://saucedemo.com");   // გადავცეთ საიტი რომელიც უნდა გაიხსნას


        String userName = "standard_user";    //მეთოდისთვის გადავცემთ ცვლადებს
        String password = "secret_souce";


        //login

        login(driver, userName, password);// loginiს მეთოდს გამოვიძახებთ მეინში და დავრანავთ
        checkIfSuccessLogin(driver);


    }


    public static void login(WebDriver driver, String username, String password) {
        WebElement user = driver.findElement(By.id("user-name"));   //gadabecit id inspectidan
        user.sendKeys(username);   // gadavecit cvladi

        WebElement pass = driver.findElement(By.id("password"));
        user.sendKeys(password);


        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        // find element (username, password,enter)
        // enter data
        // click to enter button


    }

    public static void checkIfSuccessLogin(WebDriver driver) {
        System.out.println("enter website");
        driver.navigate().refresh();
        System.out.println("refresh page");


        String url = driver.getCurrentUrl();
        if (url.contains("inventory"))
        {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }

        WebElement productTitle = driver.findElement(By.xpath("//span[@class='title']"));
        System.out.println(productTitle);

    }


}

