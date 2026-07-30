package p153l;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class tic0 {
    /* JADX INFO: renamed from: a */
    public static boolean m191325a(String str, String str2, String str3, String str4) throws Exception {
        if (str4 == null) {
            str4 = "utf-8";
        }
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(qe2.m176218a(str3.getBytes())));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(str.getBytes(str4));
            return signature.verify(qe2.m176218a(str2.getBytes()));
        } catch (Exception e) {
            throw new SignatureException("RSAcontent = " + str + "; charset = " + str4, e);
        }
    }
}
