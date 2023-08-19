public class FilmManager {

    String newName;
    String[] films = {
            "1",
            "2",
            "3",
            "4"
    };

    public static String setName(String name) {
        String newName = name;
        return newName;
    }

    public void newFilm() {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newName;
        films = tmp;
    }

    public String[] returnFilms() {
        return films;
    }
}