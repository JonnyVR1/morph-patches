package com.cmic.sso.sdk.p022e;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import p149l.whq0;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.i */
/* JADX INFO: loaded from: classes.dex */
public class C1369i {

    /* JADX INFO: renamed from: a */
    private static final String f5706a = "i";

    /* JADX INFO: renamed from: d */
    private static C1369i f5707d;

    /* JADX INFO: renamed from: b */
    private PublicKey f5708b = null;

    /* JADX INFO: renamed from: c */
    private PublicKey f5709c = null;

    private C1369i() {
        try {
            m7259b();
            if (this.f5709c == null) {
                m7260c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7260c() throws Exception {
        try {
            this.f5709c = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuyqBGJVxu+5Z2ZwItIhl\noxI53CVpYUR3OWAQyAQNcMhDDf3nGsxLLHP8kGWqrpLn1uAIgI+EIAl0sM+i1leD\nFD+sYU2rkUVZgpwO7ly+THBFw/YcZNwS094NBdhzxmCCFbCKHVNzDLirlV9T2q4k\nJhjaEmyCOtSU6+mdjcHhbcbF6lKYx8tfQlpPmyM5suFY138qtEoB4b+q/j8q22MI\naUotg1Av257RuMh97hAwoi5D7HS5LH0piLIN/au/X08rxbXnWNdgQtFtUeCNy3vw\nkO0ykg5qH942X8poQ+a9GgBUeDBpY4GSIv6/qq+zJxiJxpoL0SGKAP3FlcuLr07f\nxwIDAQAB", 0)));
        } catch (NullPointerException unused) {
            whq0.m203241a("公钥输入流为空");
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7261a(byte[] bArr) {
        if (this.f5708b == null) {
            C1363c.m7232a(f5706a, "mServerPublicKey == null");
            return "";
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            cipher.init(1, this.f5708b);
            return C1377q.m7303a(cipher.doFinal(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7262b(byte[] bArr) {
        if (this.f5708b == null) {
            C1363c.m7232a(f5706a, "mServerPublicKey == null");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            cipher.init(1, this.f5709c);
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1369i m7258a() {
        if (f5707d == null) {
            f5707d = new C1369i();
        }
        return f5707d;
    }

    /* JADX INFO: renamed from: b */
    private void m7259b() throws Exception {
        try {
            this.f5708b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDNFGdEpQ1d8cPqekvvEDQyBGnI\nKwvjX9o3OmnnqWMGbIiFYIpc21QeG7aqizuWdXlgS5M9rstDfHQfG/AaPElJ7Yix\nBCau4hdVwFpRmb9NIuqavDeHKP9BKPZ01Ra5/666NGKBqmkRRer3lBCe6EKNUc2U\n/DZg6U/Q3CTPiORt/wIDAQAB", 0)));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
