package p153l;

import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class x5c extends hoh0 {
    public x5c() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // p153l.hoh0
    /* JADX INFO: renamed from: b */
    public int mo136422b(int i) {
        return i <= 8 ? CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 : CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
    }

    @Override // p153l.hoh0
    /* JADX INFO: renamed from: f */
    public int mo136426f() {
        return 10;
    }
}
