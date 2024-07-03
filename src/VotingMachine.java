public class VotingMachine {
    private int candidateA;
    private int candidateB;
    private boolean isVotingOpen;

    public VotingMachine() {
        candidateA = 0;
        candidateB = 0;
        isVotingOpen = true;
    }

    public void vote(String candidate) {
        if (isVotingOpen) {
            if (candidate.equalsIgnoreCase("A")) {
                candidateA++;
                System.out.println("Vote for Candidate A recorded.");
            } else if (candidate.equalsIgnoreCase("B")) {
                candidateB++;
                System.out.println("Vote for Candidate B recorded.");
            } else {
                System.out.println("Invalid candidate. Please vote for A or B.");
            }
        } else {
            System.out.println("Voting is closed.");
        }
    }

    public void runVoting() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        while (isVotingOpen) {
            System.out.println("Enter 'A' to vote for Candidate A, 'B' to vote for Candidate B, or 'Q' to quit:");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("Q")) {
                isVotingOpen = false;
            } else {
                vote(input);
            }
        }
        
        System.out.println("Voting is closed. Final results:");
        System.out.println("Candidate A: " + candidateA + " votes");
        System.out.println("Candidate B: " + candidateB + " votes");
        System.out.println("Candidate B: " + candidateB + " votes");
        System.out.println("My name is Hemanth");
        
        scanner.close();
    }
}