package p153l;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes7.dex */
public class xxb {

    /* JADX INFO: renamed from: a */
    private byte[] f196622a;

    /* JADX INFO: renamed from: b */
    private byte[] f196623b;

    /* JADX INFO: renamed from: c */
    private RSAPublicKey f196624c;

    /* JADX INFO: renamed from: d */
    protected boolean f196625d;

    public xxb(String str, boolean z) {
        this.f196625d = true;
        try {
            this.f196624c = uic0.m196152b(str);
            byte[] bArrM213513d = m213513d(16);
            this.f196622a = bArrM213513d;
            this.f196623b = uic0.m196151a(this.f196624c, bArrM213513d);
            this.f196625d = z;
        } catch (Exception unused) {
            wg3.m206174a("fail to init crypto manager");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    private byte[] m213513d(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m213514a(byte[] bArr) {
        return this.f196625d ? C16872f.m123434a(bArr, this.f196622a) : bArr;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m213515b() {
        return this.f196623b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m213516c() {
        return this.f196625d;
    }
}
