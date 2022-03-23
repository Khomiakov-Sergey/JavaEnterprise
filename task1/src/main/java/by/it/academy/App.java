package by.it.academy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * task1
 * Реализовать приложение (можно и на основе вашего с Core), в котором доступ к DB
 * осуществляется через разные профили. Т.е. на профили dev одни логин/пароль, на профиле
 * Prod - иные. Упаковать в артифакт. Запустить посредством командной строки. Запушать
 * в свой репозиторий и отправить мне на проверку. В Redmi файле указать строку запуска.
 */

public class App {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (InputStream resourceAsStream = new App().getResourceAsStream()) {
            properties.load(resourceAsStream);
            for (Map.Entry<Object, Object> prop : properties.entrySet()) {
                System.out.println(prop);
            }
        } catch (IOException e) {
            System.err.println("Unable to load properties file");
        }
    }

    private InputStream getResourceAsStream() {
        return this.getClass().getClassLoader().getResourceAsStream("db.properties");
    }
}
