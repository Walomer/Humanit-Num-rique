public class Unit {
    protected String categorie;
    protected int debut;
    protected int fin;
    protected String idAnnotation;

    public Unit(String categorie, int debut, int fin, String idAnnotation) {
        this.categorie = categorie;
        this.debut = debut;
        this.fin = fin;
        this.idAnnotation = idAnnotation;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public String getIdAnnotation() {
        return idAnnotation;
    }

    public void setIdAnnotation(String idAnnotation) {
        this.idAnnotation = idAnnotation;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "categorie='" + categorie + '\'' +
                ", debut=" + debut +
                ", fin=" + fin +
                ", idAnnotation='" + idAnnotation + '\'' +
                '}';
    }
}
