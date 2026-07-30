package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class tyw0 {

    /* JADX INFO: renamed from: a */
    public Integer f176717a = null;

    /* JADX INFO: renamed from: b */
    public Integer f176718b = null;

    /* JADX INFO: renamed from: c */
    public Integer f176719c = null;

    /* JADX INFO: renamed from: d */
    public Integer f176720d = null;

    /* JADX INFO: renamed from: e */
    public uyw0 f176721e = null;

    /* JADX INFO: renamed from: f */
    public vyw0 f176722f = vyw0.f186430d;

    public /* synthetic */ tyw0(syw0 syw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final tyw0 m193624a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f176717a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final tyw0 m193625b(uyw0 uyw0Var) {
        this.f176721e = uyw0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final tyw0 m193626c(int i) throws GeneralSecurityException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f176718b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final tyw0 m193627d(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f176719c = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final tyw0 m193628e(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f176720d = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final tyw0 m193629f(vyw0 vyw0Var) {
        this.f176722f = vyw0Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final xyw0 m193630g() throws GeneralSecurityException {
        if (this.f176717a == null) {
            phw0.m172339a("AES key size is not set");
            return null;
        }
        if (this.f176718b == null) {
            phw0.m172339a("HMAC key size is not set");
            return null;
        }
        if (this.f176719c == null) {
            phw0.m172339a("iv size is not set");
            return null;
        }
        Integer num = this.f176720d;
        if (num == null) {
            phw0.m172339a("tag size is not set");
            return null;
        }
        if (this.f176721e == null) {
            phw0.m172339a("hash type is not set");
            return null;
        }
        if (this.f176722f == null) {
            phw0.m172339a("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        uyw0 uyw0Var = this.f176721e;
        if (uyw0Var == uyw0.f181676b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (uyw0Var == uyw0.f181677c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (uyw0Var == uyw0.f181678d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (uyw0Var == uyw0.f181679e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (uyw0Var != uyw0.f181680f) {
                phw0.m172339a("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new xyw0(this.f176717a.intValue(), this.f176718b.intValue(), this.f176719c.intValue(), this.f176720d.intValue(), this.f176722f, this.f176721e, null);
    }
}
