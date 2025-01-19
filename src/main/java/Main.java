import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Чтение файла
        Path path = Paths.get("src/main/resources/1.txt");

        List<String> content = null;

        //Но readAllLines использовать для малых
        // обьемах файлах так как займет много оперативки
        //обычно считывать с методами по строкам
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Тут ошибка ввода вывода, поэтому исключение в блок
        System.out.println(content);
    }

}