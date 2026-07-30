package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class o5x0 implements dnw0 {

    /* JADX INFO: renamed from: a */
    public final j6x0 f141952a;

    /* JADX INFO: renamed from: b */
    public final eow0 f141953b;

    /* JADX INFO: renamed from: c */
    public final int f141954c;

    /* JADX INFO: renamed from: d */
    public final byte[] f141955d;

    public o5x0(j6x0 j6x0Var, eow0 eow0Var, int i, byte[] bArr) {
        this.f141952a = j6x0Var;
        this.f141953b = eow0Var;
        this.f141954c = i;
        this.f141955d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m162816b(hpw0 hpw0Var) throws GeneralSecurityException {
        h5x0 h5x0Var = new h5x0(hpw0Var.m132388c().m178105d(qnw0.m175705a()), hpw0Var.m132386a().m180404d());
        String strValueOf = String.valueOf(hpw0Var.m132386a().m180406f());
        return new o5x0(h5x0Var, new n6x0(new m6x0("HMAC".concat(strValueOf), new SecretKeySpec(hpw0Var.m132389d().m178105d(qnw0.m175705a()), "HMAC")), hpw0Var.m132386a().m180405e()), hpw0Var.m132386a().m180405e(), hpw0Var.m132387b().m173181c());
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f141955d;
        int i = this.f141954c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            j8w0.m140474a("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f141955d;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length2 - this.f141954c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.f141954c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((n6x0) this.f141953b).m158105c(m5x0.m153181b(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.f141952a.zza(bArrCopyOfRange);
        }
        j8w0.m140474a("invalid MAC");
        return null;
    }
}
