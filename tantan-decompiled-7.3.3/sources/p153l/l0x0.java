package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class l0x0 {

    /* JADX INFO: renamed from: a */
    public Integer f129622a = null;

    /* JADX INFO: renamed from: b */
    public Integer f129623b = null;

    /* JADX INFO: renamed from: c */
    public Integer f129624c = null;

    /* JADX INFO: renamed from: d */
    public m0x0 f129625d = m0x0.f134369d;

    public /* synthetic */ l0x0(k0x0 k0x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final l0x0 m152401a(int i) throws GeneralSecurityException {
        this.f129623b = 12;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final l0x0 m152402b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f129622a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final l0x0 m152403c(int i) throws GeneralSecurityException {
        this.f129624c = 16;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final l0x0 m152404d(m0x0 m0x0Var) {
        this.f129625d = m0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final o0x0 m152405e() throws GeneralSecurityException {
        Integer num = this.f129622a;
        if (num == null) {
            phw0.m172339a("Key size is not set");
            return null;
        }
        if (this.f129625d == null) {
            phw0.m172339a("Variant is not set");
            return null;
        }
        if (this.f129623b == null) {
            phw0.m172339a("IV size is not set");
            return null;
        }
        if (this.f129624c == null) {
            phw0.m172339a("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        this.f129623b.getClass();
        this.f129624c.getClass();
        return new o0x0(iIntValue, 12, 16, this.f129625d, null);
    }
}
