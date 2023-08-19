public class FilmManager {

    String[] films = {"Гадкий я", "Тачки", "Интерстеллар", "Марсианин"
    };

    public String[] newFilm(String name) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = name;
        films = tmp;
        return films;
    }

    public String[] returnFilms() {
        return films;
    }

    public String[] reverseReturnFilms() {
        String[] reverse = new String[films.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = films[films.length - 1 - i];
        }
        return reverse;
    }
}