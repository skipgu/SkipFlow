public class Commit {
    private String message;
    private String author;
    private String date;
    final private String hash;
    final private HashType hashType;
  
    /**
     * Constructor for a Commit object (if the hash type is not given)
     * The default hash type is DEFAULT.
     * 
     * @return {Commit} a Commit object.
     */
    public Commit(String message, String author, String date) {
        this.message = message;
        this.author = author;
        this.date = date;
        this.hashType = HashType.DEFAULT;
        this.hash = HashGenerator.generateRandomHash(this.hashType);
    }

    /**
     * Overloaded Constructor for a Commit object.
     * 
     * @param {String} message - the commit message.
     * @param {String} author - the author of the commit.
     * @param {String} date - the date of the commit.
     * @param {HashType} hashType - the type of hash to be generated.
     * @return {Commit} a Commit object.
     */
    public Commit(String message, String author, String date, HashType hashType) {
        this.message = message;
        this.author = author;
        this.date = date;
        this.hashType = hashType;
        this.hash = HashGenerator.generateRandomHash(this.hashType);
    }

    // TODO: add getters and setters (if applicable) for the fields
    // (this comment can be removed afterwards)
    // Here goes your implementation...

    /**
     * A method to display the String representation of a Commit object.
     * TODO: implement this method (this comment can be removed afterwards)
     * The String representation of a Commit object is:
     * Commit Hash: <HASH>
     * Author: <AUTHOR>
     * Message: <MESSAGE>
     * 
     * @return {String} the String representation of a Commit object.
     */
    @Override
    public String toString() {
      throw new UnsupportedOperationException("Commit.java#toString: Not implemented yet");
    }
}
