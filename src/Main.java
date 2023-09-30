public class Main {
  // The main entry point of the program. Test your code here!
  public static void main(String[] args) {
    Repository codeCoffee = new Repository("SKIP - SkipFlow");
    Commit commit1 = new Commit("Add README.md", "Michal Spano", "26/09/2023");
    Commit commit2 = new Commit("Add Main.java", "Erik Harring", "27/09/2023", HashType.ADVANCED);

    System.out.println(commit1);

    codeCoffee.addCommit(commit1);
    codeCoffee.addCommit(commit2);

    codeCoffee.displayCommitHistory();

    // Add more tests here...
  }
}
