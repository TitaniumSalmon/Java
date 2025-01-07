public class Grading {
    public double score;
    public String evaluateSore(){
        if (this.score >= 80){
            return "Pass";

        } else {
            return "Fail";
        }
    }
}
