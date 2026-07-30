package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class a0x0 {

    /* JADX INFO: renamed from: a */
    public Integer f67079a = null;

    /* JADX INFO: renamed from: b */
    public Integer f67080b = null;

    /* JADX INFO: renamed from: c */
    public b0x0 f67081c = null;

    /* JADX INFO: renamed from: d */
    public c0x0 f67082d = c0x0.f78187e;

    public /* synthetic */ a0x0(zzw0 zzw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final a0x0 m94495a(b0x0 b0x0Var) {
        this.f67081c = b0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final a0x0 m94496b(int i) throws GeneralSecurityException {
        this.f67079a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final a0x0 m94497c(int i) throws GeneralSecurityException {
        this.f67080b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final a0x0 m94498d(c0x0 c0x0Var) {
        this.f67082d = c0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final e0x0 m94499e() throws GeneralSecurityException {
        Integer num = this.f67079a;
        if (num == null) {
            j8w0.m140474a("key size is not set");
            return null;
        }
        if (this.f67080b == null) {
            j8w0.m140474a("tag size is not set");
            return null;
        }
        if (this.f67081c == null) {
            j8w0.m140474a("hash type is not set");
            return null;
        }
        if (this.f67082d == null) {
            j8w0.m140474a("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f67079a));
        }
        Integer num2 = this.f67080b;
        int iIntValue = num2.intValue();
        b0x0 b0x0Var = this.f67081c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (b0x0Var == b0x0.f72467b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (b0x0Var == b0x0.f72468c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (b0x0Var == b0x0.f72469d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (b0x0Var == b0x0.f72470e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (b0x0Var != b0x0.f72471f) {
                j8w0.m140474a("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new e0x0(this.f67079a.intValue(), this.f67080b.intValue(), this.f67082d, this.f67081c, null);
    }
}
