package sparsh.abstractComponents;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CommitmentPolicy;
import com.amazonaws.encryptionsdk.CryptoResult;
import com.amazonaws.encryptionsdk.kms.KmsMasterKey;
import com.amazonaws.encryptionsdk.kms.KmsMasterKeyProvider;
import com.amazonaws.util.BinaryUtils;

public class KmsTest {
	final static String keyArn = "arn:aws:kms:ap-south-1:792227409305:key/2c606643-65d7-498a-b21b-28447b255cfc";
//	final static String keyArn = keyArn;
	final static AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
            .build();

 

    public static KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
	
    public static String decrypt1(KmsMasterKeyProvider keyProvider, AwsCrypto crypto, String user) {
        final byte[] ciphertext = BinaryUtils.fromBase64(user);
        final CryptoResult<byte[], KmsMasterKey> decryptResult = crypto.decryptData(keyProvider, ciphertext);
        String data = new String(decryptResult.getResult(), StandardCharsets.UTF_8);
        return data;
    }

    public String encrypt(KmsMasterKeyProvider keyProvider, AwsCrypto crypto, String enc) {
        final CryptoResult<byte[], KmsMasterKey> encryptResult = crypto.encryptData(keyProvider, enc.getBytes(StandardCharsets.UTF_8));
        final byte[] ciphertext = encryptResult.getResult();
//        return ciphertext;
        String data = BinaryUtils.toBase64(ciphertext);
        return data;
    }

//    public  byte[] encrypt(KmsMasterKeyProvider keyProvider, AwsCrypto crypto, String enc) {
//        final CryptoResult<byte[], KmsMasterKey> encryptResult = crypto.encryptData(keyProvider, enc.getBytes(StandardCharsets.UTF_8));
//        final byte[] ciphertext = encryptResult.getResult();
//        return ciphertext;
////        String data = BinaryUtils.toBase64(ciphertext);
////        return data;
//    }

public static void main(String[] args) {
	KmsTest kt = new KmsTest();
	 String encop = kt.encrypt(keyProvider, crypto,"10059");
	System.out.println(encop);
	String decval = kt.decrypt1(keyProvider, crypto, encop);
	System.out.println(decval);
	
}

	
}
