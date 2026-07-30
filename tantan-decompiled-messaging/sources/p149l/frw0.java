package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class frw0 {

    /* JADX INFO: renamed from: a */
    public Integer f99012a = null;

    /* JADX INFO: renamed from: b */
    public Integer f99013b = null;

    /* JADX INFO: renamed from: c */
    public Integer f99014c = null;

    /* JADX INFO: renamed from: d */
    public grw0 f99015d = grw0.f104123d;

    public /* synthetic */ frw0(erw0 erw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final frw0 m122901a(int i) throws GeneralSecurityException {
        this.f99013b = 12;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final frw0 m122902b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f99012a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final frw0 m122903c(int i) throws GeneralSecurityException {
        this.f99014c = 16;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final frw0 m122904d(grw0 grw0Var) {
        this.f99015d = grw0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final irw0 m122905e() throws GeneralSecurityException {
        Integer num = this.f99012a;
        if (num == null) {
            j8w0.m140474a("Key size is not set");
            return null;
        }
        if (this.f99015d == null) {
            j8w0.m140474a("Variant is not set");
            return null;
        }
        if (this.f99013b == null) {
            j8w0.m140474a("IV size is not set");
            return null;
        }
        if (this.f99014c == null) {
            j8w0.m140474a("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        this.f99013b.getClass();
        this.f99014c.getClass();
        return new irw0(iIntValue, 12, 16, this.f99015d, null);
    }
}
