package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalParamCreator {
    private final BufferedReader reader;

    public AnimalParamCreator() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    public String getName(String type) throws IOException {
        System.out.printf("Введите %s имя.\n", type);
        return reader.readLine();
    }

    public String getBirthday(String type) throws IOException {
        System.out.printf("Введите дату рождения %s.\n", type);
        return reader.readLine();
    }
}