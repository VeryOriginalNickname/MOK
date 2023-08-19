public class FilmManager {

    String[] films = {"1", "2", "3", "4"
    };

    public void newFilm(String name) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = name;
        films = tmp;
    }

    public String[] returnFilms() {
        return films;
    }
}