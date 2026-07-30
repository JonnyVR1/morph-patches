package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class uex0 implements jww0 {

    /* JADX INFO: renamed from: a */
    public final pfx0 f178718a;

    /* JADX INFO: renamed from: b */
    public final kxw0 f178719b;

    /* JADX INFO: renamed from: c */
    public final int f178720c;

    /* JADX INFO: renamed from: d */
    public final byte[] f178721d;

    public uex0(pfx0 pfx0Var, kxw0 kxw0Var, int i, byte[] bArr) {
        this.f178718a = pfx0Var;
        this.f178719b = kxw0Var;
        this.f178720c = i;
        this.f178721d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m195819b(nyw0 nyw0Var) throws GeneralSecurityException {
        nex0 nex0Var = new nex0(nyw0Var.m165358c().m210864d(www0.m208321a()), nyw0Var.m165356a().m213654d());
        String strValueOf = String.valueOf(nyw0Var.m165356a().m213656f());
        return new uex0(nex0Var, new tfx0(new sfx0("HMAC".concat(strValueOf), new SecretKeySpec(nyw0Var.m165359d().m210864d(www0.m208321a()), "HMAC")), nyw0Var.m165356a().m213655e()), nyw0Var.m165356a().m213655e(), nyw0Var.m165357b().m206172c());
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f178721d;
        int i = this.f178720c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            phw0.m172339a("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f178721d;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length2 - this.f178720c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.f178720c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((tfx0) this.f178719b).m191004c(sex0.m185577b(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.f178718a.zza(bArrCopyOfRange);
        }
        phw0.m172339a("invalid MAC");
        return null;
    }
}
