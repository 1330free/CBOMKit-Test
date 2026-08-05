package demo;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.MessageDigest;

public class CryptoTest {

    public static void main(String[] args) throws Exception {

        // AES 加密
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(256);

        SecretKey key = kg.generateKey();

        Cipher cipher = Cipher.getInstance("AES");

        cipher.init(
            Cipher.ENCRYPT_MODE,
            key
        );


        // SHA-256 雜湊
        MessageDigest md =
            MessageDigest.getInstance("SHA-256");

        md.digest(
            "CBOM Test".getBytes()
        );


        System.out.println("Crypto Test Finished");
    }
}
