package p149l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class bcg0 {
    /* JADX INFO: renamed from: a */
    public static String m101061a(String str, String str2) {
        byte[] bArrDoFinal;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            Charset charset = StandardCharsets.UTF_8;
            mac.init(new SecretKeySpec(str.getBytes(charset), "HmacSHA1"));
            bArrDoFinal = mac.doFinal(str2.getBytes(charset));
        } catch (Exception e) {
            e.printStackTrace();
            bArrDoFinal = null;
        }
        return yog0.m215500c(bArrDoFinal, false);
    }
}
