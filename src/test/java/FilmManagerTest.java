import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void Test1() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Чужой");

    }

    @Test
    public void Test2() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Чужой");
        filmManager.returnFilms();
        String[] expected = {"Гадкий я", "Тачки", "Интерстеллар", "Марсианин", "Чужой"};
        String[] actual = filmManager.films;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test3() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("Свой");
        String[] expected = {"Свой", "Марсианин", "Интерстеллар", "Тачки", "Гадкий я"};
        String[] actual = filmManager.reverseReturnFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
