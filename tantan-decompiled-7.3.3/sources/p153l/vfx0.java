package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class vfx0 implements jww0 {

    /* JADX INFO: renamed from: a */
    public final j4x0 f183986a;

    /* JADX INFO: renamed from: b */
    public final byte[] f183987b;

    public vfx0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f183986a = new j4x0(bArr);
        this.f183987b = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m201196b(i3x0 i3x0Var) throws GeneralSecurityException {
        return new vfx0(i3x0Var.m138350d().m210864d(www0.m208321a()), i3x0Var.m138349c().m206172c());
    }

    /* JADX INFO: renamed from: c */
    private final byte[] m201197c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        return this.f183986a.m133597b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f183987b;
        if (bArr3.length == 0) {
            return m201197c(bArr, bArr2);
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f183987b;
        return m201197c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
