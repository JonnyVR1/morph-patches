package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class tex0 implements jww0 {

    /* JADX INFO: renamed from: a */
    public final g4x0 f173909a;

    /* JADX INFO: renamed from: b */
    public final byte[] f173910b;

    public tex0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f173909a = new g4x0(bArr);
        this.f173910b = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m190903b(m1x0 m1x0Var) throws GeneralSecurityException {
        return new tex0(m1x0Var.m156726d().m210864d(www0.m208321a()), m1x0Var.m156725c().m206172c());
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f173910b;
        if (bArr3.length == 0) {
            return m190904c(bArr, bArr2);
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f173910b;
        return m190904c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m190904c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        return this.f173909a.m133597b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }
}
