package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class npw0 {

    /* JADX INFO: renamed from: a */
    public Integer f140009a = null;

    /* JADX INFO: renamed from: b */
    public Integer f140010b = null;

    /* JADX INFO: renamed from: c */
    public Integer f140011c = null;

    /* JADX INFO: renamed from: d */
    public Integer f140012d = null;

    /* JADX INFO: renamed from: e */
    public opw0 f140013e = null;

    /* JADX INFO: renamed from: f */
    public ppw0 f140014f = ppw0.f150728d;

    public /* synthetic */ npw0(mpw0 mpw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final npw0 m160543a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f140009a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final npw0 m160544b(opw0 opw0Var) {
        this.f140013e = opw0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final npw0 m160545c(int i) throws GeneralSecurityException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f140010b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final npw0 m160546d(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f140011c = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final npw0 m160547e(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f140012d = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final npw0 m160548f(ppw0 ppw0Var) {
        this.f140014f = ppw0Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final rpw0 m160549g() throws GeneralSecurityException {
        if (this.f140009a == null) {
            j8w0.m140474a("AES key size is not set");
            return null;
        }
        if (this.f140010b == null) {
            j8w0.m140474a("HMAC key size is not set");
            return null;
        }
        if (this.f140011c == null) {
            j8w0.m140474a("iv size is not set");
            return null;
        }
        Integer num = this.f140012d;
        if (num == null) {
            j8w0.m140474a("tag size is not set");
            return null;
        }
        if (this.f140013e == null) {
            j8w0.m140474a("hash type is not set");
            return null;
        }
        if (this.f140014f == null) {
            j8w0.m140474a("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        opw0 opw0Var = this.f140013e;
        if (opw0Var == opw0.f145053b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (opw0Var == opw0.f145054c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (opw0Var == opw0.f145055d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (opw0Var == opw0.f145056e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (opw0Var != opw0.f145057f) {
                j8w0.m140474a("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new rpw0(this.f140009a.intValue(), this.f140010b.intValue(), this.f140011c.intValue(), this.f140012d.intValue(), this.f140014f, this.f140013e, null);
    }
}
