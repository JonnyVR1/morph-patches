package p149l;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class l5x0 implements dnw0 {

    /* JADX INFO: renamed from: a */
    public final xuw0 f126213a;

    /* JADX INFO: renamed from: b */
    public final byte[] f126214b;

    public l5x0(byte[] bArr, q6x0 q6x0Var) throws GeneralSecurityException {
        if (!mvw0.m156606a(2)) {
            j8w0.m140474a("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f126213a = new xuw0(bArr, true);
        this.f126214b = q6x0Var.m173181c();
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m148680b(uqw0 uqw0Var) throws GeneralSecurityException {
        uqw0Var.m195022b();
        uqw0Var.m195022b();
        return new l5x0(uqw0Var.m195024d().m178105d(qnw0.m175705a()), uqw0Var.m195023c());
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f126214b;
        if (bArr3.length == 0) {
            return this.f126213a.m211223a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f126214b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
        return this.f126213a.m211223a(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
    }
}
