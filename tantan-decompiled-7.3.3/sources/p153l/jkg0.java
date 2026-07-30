package p153l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class jkg0 {
    /* JADX INFO: renamed from: a */
    public static String m145845a(String str, String str2) {
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
        return gxg0.m132864c(bArrDoFinal, false);
    }
}
