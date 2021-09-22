package ir.shikdeveloper.masudrhmiaes;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NewAES {

    private String key = "!mysecretkey#9^5usdk39d&dlf)03sL";
    private String iv = "Cfq84/46Qjet3EEQ1HUwSg==";

    public NewAES(String key, String iv) {
        this.key = key;
        this.iv = iv;
    }

    public String decryption(String ciphertext) throws NullPointerException {
        String result = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(android.util.Base64.decode(iv, android.util.Base64.DEFAULT));
            Cipher cipher;
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] decryptedtextByte = cipher.doFinal(android.util.Base64.decode(ciphertext, android.util.Base64.DEFAULT));
            result = new String(decryptedtextByte);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String encryption(String ciphertext) throws NullPointerException {
        String result = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(android.util.Base64.decode(iv, android.util.Base64.DEFAULT));
            Cipher cipher;
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] decryptedtextByte = cipher.doFinal(ciphertext.getBytes());
            result = Base64.encode(decryptedtextByte);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
