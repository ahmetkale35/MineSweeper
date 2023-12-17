public class PhDStudent extends Masterstudent implements ArticleScoreBehaviour {
    protected int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfConf, int numberOfArticles) {
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float articleScore() {
        return numberOfConf*8;
    }
}