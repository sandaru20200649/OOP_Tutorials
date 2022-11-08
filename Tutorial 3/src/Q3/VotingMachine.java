package Q3;

public class VotingMachine {

    private int labourVotes; // number of votes for Labour party
    private int conservativeVotes; // number of votes for Conservatives party

    public void voteLabour() {
        ++labourVotes;
    }

    public void voteConservatives() {
        ++conservativeVotes;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return conservativeVotes;
    }

    public void clear() {
        labourVotes = 0;
        conservativeVotes = 0;
    }
}
