import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AutoTest {

    @Test
    @Order(1)
    public void testSignUp() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/header/div[1]/div/div/div[3]/div/div/div/a"
        ).click();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[2]/label/input").setValue("89123456783");
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[3]/label/input").setValue("daa@da.com");
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[4]/label/input").setValue("Володя");
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[5]/label/input[1]").setValue("GFHJKM4br!");
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[6]/button").click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(2)
    public void testLogOut() {
        $x("/html/body/div[8]/header/div[1]/div/div/div[3]/div/div[1]/a[2]").click();
    }

    @Test
    @Order(3)
    public void testAuthentication() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/header/div[1]/div/div/div[3]/div/div/form/div[1]/label[1]/input"
        ).setValue("89002000303");
        $x("/html/body/div[8]/header/div[1]/div/div/div[3]/div/div/form/div[1]/label[2]/input"
        ).setValue("GFHJKM4br!").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(4)
    public void testAddAddress() {
        $x("/html/body/div[8]/nav/div/div/ul/li[7]/a/span").hover();
        $x("/html/body/div[8]/nav/div/div/ul/li[7]/ul/li[2]/a").click();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[2]/section/section/div/a").click();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[2]/section/div[3]/section/div/div/div/div[2]/div/div[1]/div/label/input").setValue("Г Самара, Ленина, д 1").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[2]/section/div[3]/section/div/div/div/div[2]/div/div[3]/div/div[5]/div/label/input").setValue("1").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(5)
    public void testAddItem() {
        $x("/html/body/div[8]/nav/div/div/ul/li[2]/a").pressEnter();
        $x("//*[@id=\"bx_1596223520_46\"]/section/a").pressEnter();
        $x("//*[@id=\"bx_1596223520_1387\"]/section/form/div[2]/div[2]/div[2]/button").pressEnter();
        $x("//*[@id=\"address-session-window\"]/div/div/div[1]/div[1]/button").pressEnter();
        $x("//*[@id=\"address-session-window\"]/div/div/form/div[4]/div/button[1]").pressEnter();
        $x("//*[@id=\"bx_1596223520_1387\"]/section/form/div[2]/div[2]/div[2]/button").click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(6)
    public void testDeleteItem() {
        $x("//*[@id=\"sum_bask\"]/a").click();
        $x("//*[@id=\"basket_form\"]/div[3]/table/tbody/tr/td[1]/button").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(7)
    public void testMakeOrder() {
        $x("/html/body/div[8]/nav/div/div/ul/li[2]/a").click();
        $x("//*[@id=\"bx_1596223520_45\"]/section/a").click();
        $x("//*[@id=\"bx_1596223520_1379\"]/section/form/div[2]/div[2]/div[2]/button").pressEnter();
        $x("//*[@id=\"sum_bask\"]/a").pressEnter();
        $x("//*[@id=\"form_link_phone\"]").setValue("9002000303");
        $x("//*[@id=\"order_form\"]/div/div/div[3]/div[1]/button").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(8)
    public void testCheckCoupon() {
        $x("/html/body/div[8]/nav/div/div/ul/li[7]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[2]/section/div/div/div[8]/div[1]/div/label/input"
        ).setValue("1337322").pressEnter();
        $x("//*[@id=\"fancybox-container-1\"]/div[2]/div[4]/div/div/div[2]/a").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(9)
    public void testChangePersonalInfo() {
        $x("/html/body/div[8]/nav/div/div/ul/li[7]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[2]/section/div/div/div[5]/div[2]/div/label/input"
        ).setValue("Petrov").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[2]/div/button").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(10)
    public void testCheckOrders() {
        $x("/html/body/div[8]/header/div[1]/div/div/div[3]/div/div[1]/a[1]").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[1]/nav/div/ul/li[3]/a"
        ).pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(11)
    public void testCheckRecepies() {
        $x("/html/body/div[8]/nav/div/div/ul/li[7]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/form/div[1]/div[1]/nav/div/ul/li[4]/a"
        ).pressEnter();
        $x("//*[@id=\"bx_3218110189_1455\"]/div/div[3]/a").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(12)
    public void testCheckRestaurantSales() {
        $x("/html/body/div[8]/nav/div/div/ul/li[3]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/div/div[1]/a"
        ).click();
        $x("/html/body/div[8]/section/div/div/div[2]/div/div/div[2]/div/div[2]/a").click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(13)
    public void testCheckDeliverySales() {
        $x("/html/body/div[8]/nav/div/div/ul/li[3]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/div/div[2]/a"
        ).pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/div[1]/div[2]/div/div[2]/a").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(14)
    public void testBookRestaurant() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[4]/a").pressEnter();
        $x("/html/body/div/section[4]/div/div[2]/div/div[4]/div/div/a"
        ).click();
        $x("//*[@id=\"form-field-name\"]").setValue("Иван");
        $x("//*[@id=\"form-field-field_68762cc\"]").setValue("81234567890");
        $x("//*[@id=\"form-field-email\"]").setValue("25.12.23");
        $x("//*[@id=\"form-field-field_1d2beb8\"]").setValue("30");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(15)
    public void testComputeBanquetCost() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[4]/a").pressEnter();
        $x("/html/body/div[1]/section[7]/div/div/div/div[1]/div/div/a"
        ).click();
        $x("//*[@id=\"form-field-name\"]").setValue("Иван");
        $x("//*[@id=\"form-field-field_68762cc\"]").setValue("81234567890");
        $x("//*[@id=\"form-field-email\"]").setValue("23.12.23");
        $x("//*[@id=\"form-field-field_1d2beb8\"]").setValue("30");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(16)
    public void testBooking() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[4]/a").pressEnter();
        $x("/html/body/div[1]/section[10]/div[2]/div/div/div[4]/div/div/a"
        ).click();
        $x("//*[@id=\"form-field-name\"]").setValue("Иван");
        $x("//*[@id=\"form-field-field_68762cc\"]").setValue("81234567890");
        $x("//*[@id=\"form-field-email\"]").setValue("23.12.23");
        $x("//*[@id=\"form-field-field_1d2beb8\"]").setValue("30");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(17)
    public void testCallback() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/header/div[2]/div/div/div[2]/div[2]/div/div[2]/button").click();
        $x("//*[@id=\"callback-window\"]/div/form/div[1]/label/input").setValue("Иванов Иван Иванович");
        $x("//*[@id=\"callback-window\"]/div/form/div[2]/label/input").setValue("89123456789");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(18)
    public void testVacancies() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/a").hover();
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/ul/li[3]/a").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(19)
    public void testRestaurantInfo() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/a").hover();
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/ul/li[2]/a").pressEnter();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(20)
    public void testRestaurantMap() {
        open("https://mushmula.ru/");
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/a").hover();
        $x("/html/body/div[8]/nav/div/div/ul/li[6]/ul/li[1]/a").pressEnter();
        $x("/html/body/div[8]/section/div/div/div[2]/div/div/div[2]/div/div[2]/a").click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
