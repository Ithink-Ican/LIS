import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {

    @Test
    public void testGoogle(){

        open("https://www.google.ru/");
        $x("//*[@id=\"APjFqb\"]").setValue("Мартынов Михаил Анатольевич").pressEnter();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
