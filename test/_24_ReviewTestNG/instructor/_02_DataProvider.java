package _24_ReviewTestNG.instructor;

import org.testng.annotations.DataProvider;

public class _02_DataProvider {

    @DataProvider(name = "formData")
    public Object[][] dataP() {
        Object[][] formData = new Object[2][6];

        formData[0][0] = "John";
        formData[0][1] = "Doe";
        formData[0][2] = "John@example.com";
        formData[0][3] = "30";
        formData[0][4] = "100000";
        formData[0][5] = "Analyst";

        formData[1][0] = "Sally";
        formData[1][1] = "white";
        formData[1][2] = "Sally@example.com";
        formData[1][3] = "30";
        formData[1][4] = "100000";
        formData[1][5] = "Analyst";

        return formData;
    }
}
