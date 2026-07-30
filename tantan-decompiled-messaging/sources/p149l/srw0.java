package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class srw0 {

    /* JADX INFO: renamed from: a */
    public Integer f166142a = null;

    /* JADX INFO: renamed from: b */
    public trw0 f166143b = trw0.f171877d;

    public /* synthetic */ srw0(rrw0 rrw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final srw0 m185706a(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f166142a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final srw0 m185707b(trw0 trw0Var) {
        this.f166143b = trw0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final vrw0 m185708c() throws GeneralSecurityException {
        Integer num = this.f166142a;
        if (num == null) {
            j8w0.m140474a("Key size is not set");
            return null;
        }
        if (this.f166143b != null) {
            return new vrw0(num.intValue(), this.f166143b, null);
        }
        j8w0.m140474a("Variant is not set");
        return null;
    }
}
