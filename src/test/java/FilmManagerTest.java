import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void Test() {
        FilmManager filmManager = new FilmManager();
        filmManager.newFilm("BoB");

        filmManager.returnFilms();
    }

}
