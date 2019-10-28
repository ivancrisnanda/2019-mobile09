package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String konten;

    public SuperHero(String heroName) {
        this.konten = heroName;
    }

    public String getHeroName() {
        return konten;
    }

    public void setHeroName(String heroName) {
        this.konten = heroName;
    }
}