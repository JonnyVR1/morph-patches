package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class y0x0 {

    /* JADX INFO: renamed from: a */
    public Integer f197060a = null;

    /* JADX INFO: renamed from: b */
    public z0x0 f197061b = z0x0.f202437d;

    public /* synthetic */ y0x0(x0x0 x0x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final y0x0 m213907a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f197060a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final y0x0 m213908b(z0x0 z0x0Var) {
        this.f197061b = z0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final b1x0 m213909c() throws GeneralSecurityException {
        Integer num = this.f197060a;
        if (num == null) {
            phw0.m172339a("Key size is not set");
            return null;
        }
        if (this.f197061b != null) {
            return new b1x0(num.intValue(), this.f197061b, null);
        }
        phw0.m172339a("Variant is not set");
        return null;
    }
}
