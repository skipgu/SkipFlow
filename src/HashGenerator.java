import java.util.Random;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A static class that generates (pseudo)-"random" hashes.
 *
 * @see HashType for the different types of hashes.
 */
public class HashGenerator {
    /**
     * The visible method to generate a random hash given a hash type.
     * 
     * @param {HashType} hashType - the type of hash to be generated.
     * @return {String} the generated hash.
     */
    public static String generateRandomHash(HashType hashType) {
      String hash;
      switch (hashType) {
        case DEFAULT  -> hash = generateSimpleRandomHash();
        case ADVANCED -> hash = generateAdvancedRandomHash();
        default       -> throw new IllegalArgumentException("Invalid hash type");
      }
      return hash;
    }

    // Simple hash generation (DEFAULT)
    // An abstraction of a simple hash generation algorithm.
    // TODO: provide the implementation of this method (this comment can be removed afterwards)
    // A random hash is a String of length 10 where each character is randomly computed.
    // Hint: use `Utils.genRandomChar()`.
    private static String generateSimpleRandomHash() {
      throw new UnsupportedOperationException("HashGenerator.java#generateSimpleRandomHash: Not implemented yet"); 
    }

    // Advanced hash generation (ADVANCED)
    // You do not need to worry about this code at all! It's just an extra
    // feature for those who are interested in learning more about hashing.
    // Documentation: https://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html
    private static String generateAdvancedRandomHash() {
      try {
        // Create a SHA-256 message digest instance
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        
        // Use the simple hash to be the input to the SHA-256 algorithm
        String toHash = generateSimpleRandomHash();

        // Update the digest with the data (taken as bytes)
        byte[] hashBytes = digest.digest(toHash.getBytes());

        // Convert the byte array to a hexadecimal string
        StringBuilder hash = new StringBuilder();
        for (byte b : hashBytes)
            hash.append(String.format("%02x", b));
      
        // Extract the string representation of the hash
        return hash.toString();
      } catch (NoSuchAlgorithmException e) {
          e.printStackTrace();
          return null;
        }
    }
  
    /**
     * Generates a random character between 'a' and 'z'.
     * 
     * @return a random character between 'a' and 'z'.
     */
    private static char genRandomChar() {
      return (char) (new Random().nextInt(26) + 'a');
    }
}

