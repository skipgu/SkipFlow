import java.util.ArrayList;
import java.util.List;

public class Repository {
    private String name;
    private List<Commit> commits;
  
    /**
     * Constructor for a Repository object.
     * 
     * @param {String} name - the name of the repository.
     * @return {Repository} a Repository object.
     * @see Commit.java
     */
    public Repository(String name) {
        this.name = name;
        this.commits = new ArrayList<>();
    }

    /**
     * Method to add a commit to the repository.
     * 
     * @param {Commit} commit - the commit to be added.
     */
    public void addCommit(Commit commit) {
        // TODO: implement this method (this comment can be removed afterwards)
        throw new UnsupportedOperationException("Repository.java#addCommit: Not implemented yet");
    }
  
    /**
     * Method to display the commit history (i.e., the list of commits).
     * Note: the Commit class must implement a method to display the
     * commit information (i.e., the String representation of a Commit object).
     * 
     * @see Commit.java
     */
    public void displayCommitHistory() {
        // TODO: implement this method (this comment can be removed afterwards)
        throw new UnsupportedOperationException("Repository.java#addCommit: Not implemented yet");
    }

    // TODO: add getters and setters (if applicable) for the fields
    // (this comment can be removed afterwards)
    // Here goes your implementation...
}
