package net.prodigylabs.restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

    public static String getFirstName()
    {
        String generateString = RandomStringUtils.randomAlphabetic(1);
        return("John"+generateString);
    }

    public static String getLastName()
    {
        String generateString = RandomStringUtils.randomAlphabetic(1);
        return("Doe"+generateString);
    }

    public static String getUserName()
    {
        String generateString = RandomStringUtils.randomAlphabetic(3);
        return("John"+generateString);
    }

    public static String getPassword()
    {
        String generateString = RandomStringUtils.randomAlphabetic(3);
        return("John"+generateString);
    }

    public static String getEmail()
    {
        String generateString = RandomStringUtils.randomAlphabetic(3);
        return(generateString+"@gmail.com");
    }

    public static String empName()
    {
        String generateString = RandomStringUtils.randomAlphabetic(1);
        return("John"+generateString);
    }

    public static String empSal()
    {
        String generateString = RandomStringUtils.randomNumeric(5);
        return(generateString);
    }

    public static String empAge()
    {
        String generateString = RandomStringUtils.randomNumeric(2);
        return(generateString);
    }


}
