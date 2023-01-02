import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class new_test {
    @Test
    void successfulSearchTest() {
        System.out.println("Hello QA GURU!");
        open("https://habr.com");
    }
}
