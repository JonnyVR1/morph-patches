package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class iqw0 {

    /* JADX INFO: renamed from: a */
    public Integer f114559a = null;

    /* JADX INFO: renamed from: b */
    public Integer f114560b = null;

    /* JADX INFO: renamed from: c */
    public Integer f114561c = null;

    /* JADX INFO: renamed from: d */
    public jqw0 f114562d = jqw0.f119331d;

    public /* synthetic */ iqw0(hqw0 hqw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final iqw0 m137805a(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f114560b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final iqw0 m137806b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f114559a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final iqw0 m137807c(int i) throws GeneralSecurityException {
        this.f114561c = 16;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final iqw0 m137808d(jqw0 jqw0Var) {
        this.f114562d = jqw0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final lqw0 m137809e() throws GeneralSecurityException {
        Integer num = this.f114559a;
        if (num == null) {
            j8w0.m140474a("Key size is not set");
            return null;
        }
        if (this.f114560b == null) {
            j8w0.m140474a("IV size is not set");
            return null;
        }
        if (this.f114562d == null) {
            j8w0.m140474a("Variant is not set");
            return null;
        }
        if (this.f114561c == null) {
            j8w0.m140474a("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f114560b.intValue();
        this.f114561c.getClass();
        return new lqw0(iIntValue, iIntValue2, 16, this.f114562d, null);
    }
}
