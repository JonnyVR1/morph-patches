package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class g9x0 {

    /* JADX INFO: renamed from: a */
    public Integer f102928a = null;

    /* JADX INFO: renamed from: b */
    public Integer f102929b = null;

    /* JADX INFO: renamed from: c */
    public h9x0 f102930c = null;

    /* JADX INFO: renamed from: d */
    public i9x0 f102931d = i9x0.f113527e;

    public /* synthetic */ g9x0(f9x0 f9x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final g9x0 m129675a(h9x0 h9x0Var) {
        this.f102930c = h9x0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final g9x0 m129676b(int i) throws GeneralSecurityException {
        this.f102928a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final g9x0 m129677c(int i) throws GeneralSecurityException {
        this.f102929b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final g9x0 m129678d(i9x0 i9x0Var) {
        this.f102931d = i9x0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final k9x0 m129679e() throws GeneralSecurityException {
        Integer num = this.f102928a;
        if (num == null) {
            phw0.m172339a("key size is not set");
            return null;
        }
        if (this.f102929b == null) {
            phw0.m172339a("tag size is not set");
            return null;
        }
        if (this.f102930c == null) {
            phw0.m172339a("hash type is not set");
            return null;
        }
        if (this.f102931d == null) {
            phw0.m172339a("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f102928a));
        }
        Integer num2 = this.f102929b;
        int iIntValue = num2.intValue();
        h9x0 h9x0Var = this.f102930c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (h9x0Var == h9x0.f108437b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (h9x0Var == h9x0.f108438c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (h9x0Var == h9x0.f108439d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (h9x0Var == h9x0.f108440e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (h9x0Var != h9x0.f108441f) {
                phw0.m172339a("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new k9x0(this.f102928a.intValue(), this.f102929b.intValue(), this.f102931d, this.f102930c, null);
    }
}
