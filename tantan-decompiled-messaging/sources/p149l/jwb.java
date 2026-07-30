package p149l;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes7.dex */
public class jwb {

    /* JADX INFO: renamed from: a */
    private byte[] f120069a;

    /* JADX INFO: renamed from: b */
    private byte[] f120070b;

    /* JADX INFO: renamed from: c */
    private RSAPublicKey f120071c;

    /* JADX INFO: renamed from: d */
    protected boolean f120072d;

    public jwb(String str, boolean z) {
        this.f120072d = true;
        try {
            this.f120071c = oac0.m163297b(str);
            byte[] bArrM143652d = m143652d(16);
            this.f120069a = bArrM143652d;
            this.f120070b = oac0.m163296a(this.f120071c, bArrM143652d);
            this.f120072d = z;
        } catch (Exception unused) {
            ig3.m135964a("fail to init crypto manager");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    private byte[] m143652d(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m143653a(byte[] bArr) {
        return this.f120072d ? C16732f.m119028a(bArr, this.f120069a) : bArr;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m143654b() {
        return this.f120070b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m143655c() {
        return this.f120072d;
    }
}
