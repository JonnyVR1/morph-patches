package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes6.dex */
public final class ozw0 {

    /* JADX INFO: renamed from: a */
    public Integer f149968a = null;

    /* JADX INFO: renamed from: b */
    public Integer f149969b = null;

    /* JADX INFO: renamed from: c */
    public Integer f149970c = null;

    /* JADX INFO: renamed from: d */
    public pzw0 f149971d = pzw0.f154986d;

    public /* synthetic */ ozw0(nzw0 nzw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final ozw0 m170001a(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f149969b = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ozw0 m170002b(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f149968a = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ozw0 m170003c(int i) throws GeneralSecurityException {
        this.f149970c = 16;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ozw0 m170004d(pzw0 pzw0Var) {
        this.f149971d = pzw0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final rzw0 m170005e() throws GeneralSecurityException {
        Integer num = this.f149968a;
        if (num == null) {
            phw0.m172339a("Key size is not set");
            return null;
        }
        if (this.f149969b == null) {
            phw0.m172339a("IV size is not set");
            return null;
        }
        if (this.f149971d == null) {
            phw0.m172339a("Variant is not set");
            return null;
        }
        if (this.f149970c == null) {
            phw0.m172339a("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f149969b.intValue();
        this.f149970c.getClass();
        return new rzw0(iIntValue, iIntValue2, 16, this.f149971d, null);
    }
}
