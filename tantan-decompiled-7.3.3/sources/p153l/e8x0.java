package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class e8x0 {

    /* JADX INFO: renamed from: a */
    public Integer f92577a = null;

    /* JADX INFO: renamed from: b */
    public Integer f92578b = null;

    /* JADX INFO: renamed from: c */
    public f8x0 f92579c = f8x0.f97787e;

    public /* synthetic */ e8x0(d8x0 d8x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final e8x0 m119840a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f92577a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final e8x0 m119841b(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.f92578b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    /* JADX INFO: renamed from: c */
    public final e8x0 m119842c(f8x0 f8x0Var) {
        this.f92579c = f8x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final h8x0 m119843d() throws GeneralSecurityException {
        Integer num = this.f92577a;
        if (num == null) {
            phw0.m172339a("key size not set");
            return null;
        }
        if (this.f92578b == null) {
            phw0.m172339a("tag size not set");
            return null;
        }
        if (this.f92579c != null) {
            return new h8x0(num.intValue(), this.f92578b.intValue(), this.f92579c, null);
        }
        phw0.m172339a("variant not set");
        return null;
    }
}
