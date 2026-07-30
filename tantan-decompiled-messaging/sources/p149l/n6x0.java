package p149l;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class n6x0 implements eow0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f137458e = {0};

    /* JADX INFO: renamed from: a */
    public final t1x0 f137459a;

    /* JADX INFO: renamed from: b */
    public final int f137460b;

    /* JADX INFO: renamed from: c */
    public final byte[] f137461c;

    /* JADX INFO: renamed from: d */
    public final byte[] f137462d;

    public n6x0(tzw0 tzw0Var) throws GeneralSecurityException {
        String strValueOf = String.valueOf(tzw0Var.m191227d().m114355f());
        this.f137459a = new m6x0("HMAC".concat(strValueOf), new SecretKeySpec(tzw0Var.m191228e().m178105d(qnw0.m175705a()), "HMAC"));
        this.f137460b = tzw0Var.m191227d().m114352b();
        this.f137461c = tzw0Var.mo124027b().m173181c();
        if (tzw0Var.m191227d().m114356g().equals(c0x0.f78186d)) {
            this.f137462d = Arrays.copyOf(f137458e, 1);
        } else {
            this.f137462d = new byte[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static eow0 m158103a(syw0 syw0Var) throws GeneralSecurityException {
        return new n6x0(syw0Var);
    }

    /* JADX INFO: renamed from: b */
    public static eow0 m158104b(tzw0 tzw0Var) throws GeneralSecurityException {
        return new n6x0(tzw0Var);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m158105c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f137462d;
        int length = bArr2.length;
        byte[] bArr3 = this.f137461c;
        return length > 0 ? m5x0.m153181b(bArr3, this.f137459a.mo144641a(m5x0.m153181b(bArr, bArr2), this.f137460b)) : m5x0.m153181b(bArr3, this.f137459a.mo144641a(bArr, this.f137460b));
    }

    public n6x0(syw0 syw0Var) throws GeneralSecurityException {
        this.f137459a = new k6x0(syw0Var.m186730d().m178105d(qnw0.m175705a()));
        this.f137460b = syw0Var.m186729c().m104697b();
        this.f137461c = syw0Var.mo124027b().m173181c();
        if (syw0Var.m186729c().m104700e().equals(zyw0.f205754d)) {
            this.f137462d = Arrays.copyOf(f137458e, 1);
        } else {
            this.f137462d = new byte[0];
        }
    }

    public n6x0(t1x0 t1x0Var, int i) throws GeneralSecurityException {
        this.f137459a = t1x0Var;
        this.f137460b = i;
        this.f137461c = new byte[0];
        this.f137462d = new byte[0];
        t1x0Var.mo144641a(new byte[0], i);
    }
}
