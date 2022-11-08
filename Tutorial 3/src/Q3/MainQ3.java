package Q3;

public class MainQ3 {
    public static void main(String[] args) {
        VotingMachine vendMachine = new VotingMachine();
        for (int i=1; i <= 1000; i++) {

            double flip = Math.random();
            if (flip <= 0.5)
                vendMachine.voteLabour();
            else
                vendMachine.voteConservatives();
        }
        System.out.println("Election results");
        System.out.println("Labour votes: " + vendMachine.getLabourVotes());
        System.out.println("Conservatives votes : " + vendMachine.getConservativeVotes());
    }
}
