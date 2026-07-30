package p153l;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class rex0 implements jww0 {

    /* JADX INFO: renamed from: a */
    public final d4x0 f162749a;

    /* JADX INFO: renamed from: b */
    public final byte[] f162750b;

    public rex0(byte[] bArr, wfx0 wfx0Var) throws GeneralSecurityException {
        if (!s4x0.m184598a(2)) {
            phw0.m172339a("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f162749a = new d4x0(bArr, true);
        this.f162750b = wfx0Var.m206172c();
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m181159b(a0x0 a0x0Var) throws GeneralSecurityException {
        a0x0Var.m95435b();
        a0x0Var.m95435b();
        return new rex0(a0x0Var.m95437d().m210864d(www0.m208321a()), a0x0Var.m95436c());
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f162750b;
        if (bArr3.length == 0) {
            return this.f162749a.m114247a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f162750b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
        return this.f162749a.m114247a(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
    }
}
