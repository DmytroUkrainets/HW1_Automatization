import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/**
 * Util that hashes data using MessageDigest class.
 */
public class MessageDigestUtil {

    /**
     * Calculates the hash of the specified string using the specified algorithm.
     * <p>
     * This method accepts as input a string and the name of the hash algorithm, calculates the hash
     * using this algorithm and returns it as a hexadecimal string.
     *
     * @param input the string to calculate the hash for.
     * @param algorithm the name of the hashing algorithm (eg "MD5", "SHA-1", "SHA-256").
     * @return a hexadecimal string representing the hash of the input string.
     * @throws NoSuchAlgorithmException if the specified hashing algorithm is not available.
     */
    public static String hashWithAlgorithm(String input, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] hashBytes = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
        return byteArrayToHex(hashBytes);
    }

    /**
     * Calculates the hash for the given byte array using the specified algorithm.
     * <p>
     * This method takes as input a byte array and the name of the hash algorithm, calculates the hash
     * using this algorithm and returns it as a hexadecimal string.
     *
     * @param input the byte array to calculate the hash for.
     * @param algorithm the name of the hashing algorithm (eg "MD5", "SHA-1", "SHA-256").
     * @return a hexadecimal string representing the hash of the input byte array.
     * @throws NoSuchAlgorithmException if the specified hashing algorithm is not available.
     */
    public static String hashWithAlgorithm(byte[] input, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] hashBytes = messageDigest.digest(input);
        return MessageDigestUtil.byteArrayToHex(hashBytes);
    }

    /**
     * Converts a byte array to a hexadecimal string.
     * <p>
     * This method takes an input array of bytes and converts each byte to a corresponding byte
     * hexadecimal representation. The resulting string contains the sequence
     * hexadecimal numbers that represent each byte in the input array.
     *
     * @param bytes an array of bytes to convert to a hex string.
     * @return a hexadecimal string representing the bytes of the input array.
     */
    public static String byteArrayToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }
}