public class AcademyInfo {
  private String nomi, asoschisi, tashkilEtilganYili, oquvchilarSoni, filiallarSoni, talimYonalishi;

    public AcademyInfo() {
    }

    public AcademyInfo(String nomi, String asoschisi, String tashkilEtilganYili, String oquvchilarSoni, String filiallarSoni, String talimYonalishi) {
        this.nomi = nomi;
        this.asoschisi = asoschisi;
        this.tashkilEtilganYili = tashkilEtilganYili;
        this.oquvchilarSoni = oquvchilarSoni;
        this.filiallarSoni = filiallarSoni;
        this.talimYonalishi = talimYonalishi;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public String getAsoschisi() {
        return asoschisi;
    }

    public void setAsoschisi(String asoschisi) {
        this.asoschisi = asoschisi;
    }

    public String getTashkilEtilganYili() {
        return tashkilEtilganYili;
    }

    public void setTashkilEtilganYili(String tashkilEtilganYili) {
        this.tashkilEtilganYili = tashkilEtilganYili;
    }

    public String getOquvchilarSoni() {
        return oquvchilarSoni;
    }

    public void setOquvchilarSoni(String oquvchilarSoni) {
        this.oquvchilarSoni = oquvchilarSoni;
    }

    public String getFiliallarSoni() {
        return filiallarSoni;
    }

    public void setFiliallarSoni(String filiallarSoni) {
        this.filiallarSoni = filiallarSoni;
    }

    public String getTalimYonalishi() {
        return talimYonalishi;
    }

    public void setTalimYonalishi(String talimYonalishi) {
        this.talimYonalishi = talimYonalishi;
    }
}
