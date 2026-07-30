package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class n5x0 implements dnw0 {

    /* JADX INFO: renamed from: a */
    public final avw0 f137258a;

    /* JADX INFO: renamed from: b */
    public final byte[] f137259b;

    public n5x0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f137258a = new avw0(bArr);
        this.f137259b = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m158020b(gsw0 gsw0Var) throws GeneralSecurityException {
        return new n5x0(gsw0Var.m127856d().m178105d(qnw0.m175705a()), gsw0Var.m127855c().m173181c());
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f137259b;
        if (bArr3.length == 0) {
            return m158021c(bArr, bArr2);
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f137259b;
        return m158021c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m158021c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        return this.f137258a.m104086b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }
}
