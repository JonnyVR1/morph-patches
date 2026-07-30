package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class rzw0 {

    /* JADX INFO: renamed from: a */
    public e0x0 f161706a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f161707b = null;

    /* JADX INFO: renamed from: c */
    public Integer f161708c = null;

    public /* synthetic */ rzw0(qzw0 qzw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final rzw0 m181801a(Integer num) {
        this.f161708c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final rzw0 m181802b(r6x0 r6x0Var) {
        this.f161707b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final rzw0 m181803c(e0x0 e0x0Var) {
        this.f161706a = e0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final tzw0 m181804d() throws GeneralSecurityException {
        r6x0 r6x0Var;
        q6x0 q6x0VarM173179b;
        e0x0 e0x0Var = this.f161706a;
        if (e0x0Var == null || (r6x0Var = this.f161707b) == null) {
            j8w0.m140474a("Cannot build without parameters and/or key material");
            return null;
        }
        if (e0x0Var.m114353c() != r6x0Var.m178104a()) {
            j8w0.m140474a("Key size mismatch");
            return null;
        }
        if (e0x0Var.mo104696a() && this.f161708c == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f161706a.mo104696a() && this.f161708c != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f161706a.m114356g() == c0x0.f78187e) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f161706a.m114356g() == c0x0.f78186d || this.f161706a.m114356g() == c0x0.f78185c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f161708c.intValue()).array());
        } else {
            if (this.f161706a.m114356g() != c0x0.f78184b) {
                qkq0.m175383a("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f161706a.m114356g())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f161708c.intValue()).array());
        }
        return new tzw0(this.f161706a, this.f161707b, q6x0VarM173179b, this.f161708c, null);
    }
}
