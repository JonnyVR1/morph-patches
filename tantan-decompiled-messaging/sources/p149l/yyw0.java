package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class yyw0 {

    /* JADX INFO: renamed from: a */
    public Integer f200832a = null;

    /* JADX INFO: renamed from: b */
    public Integer f200833b = null;

    /* JADX INFO: renamed from: c */
    public zyw0 f200834c = zyw0.f205755e;

    public /* synthetic */ yyw0(xyw0 xyw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final yyw0 m216584a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f200832a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final yyw0 m216585b(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.f200833b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    /* JADX INFO: renamed from: c */
    public final yyw0 m216586c(zyw0 zyw0Var) {
        this.f200834c = zyw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final bzw0 m216587d() throws GeneralSecurityException {
        Integer num = this.f200832a;
        if (num == null) {
            j8w0.m140474a("key size not set");
            return null;
        }
        if (this.f200833b == null) {
            j8w0.m140474a("tag size not set");
            return null;
        }
        if (this.f200834c != null) {
            return new bzw0(num.intValue(), this.f200833b.intValue(), this.f200834c, null);
        }
        j8w0.m140474a("variant not set");
        return null;
    }
}
