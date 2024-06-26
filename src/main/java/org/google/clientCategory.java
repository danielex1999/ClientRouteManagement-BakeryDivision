package org.google;

import org.openqa.selenium.WebDriver;

import java.io.InputStream;
import java.util.Properties;

public class clientCategory {

    private static final String PROPERTIES_FILE = "config.properties";
    private static final Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = loginToSite.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toSalesCenter(WebDriver driver) throws InterruptedException {
        Thread.sleep(4000);
        driver.get(properties.getProperty("url-centroVentas-mc1"));
    }
}
