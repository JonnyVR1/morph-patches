package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class bqw0 {

    /* JADX INFO: renamed from: a */
    public lqw0 f76821a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f76822b = null;

    /* JADX INFO: renamed from: c */
    public Integer f76823c = null;

    public /* synthetic */ bqw0(aqw0 aqw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final bqw0 m103424a(Integer num) {
        this.f76823c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bqw0 m103425b(r6x0 r6x0Var) {
        this.f76822b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final bqw0 m103426c(lqw0 lqw0Var) {
        this.f76821a = lqw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final dqw0 m103427d() throws GeneralSecurityException {
        r6x0 r6x0Var;
        q6x0 q6x0VarM173179b;
        lqw0 lqw0Var = this.f76821a;
        if (lqw0Var == null || (r6x0Var = this.f76822b) == null) {
            j8w0.m140474a("Cannot build without parameters and/or key material");
            return null;
        }
        if (lqw0Var.m151106c() != r6x0Var.m178104a()) {
            j8w0.m140474a("Key size mismatch");
            return null;
        }
        if (lqw0Var.mo104696a() && this.f76823c == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f76821a.mo104696a() && this.f76823c != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f76821a.m151107d() == jqw0.f119331d) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f76821a.m151107d() == jqw0.f119330c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f76823c.intValue()).array());
        } else {
            if (this.f76821a.m151107d() != jqw0.f119329b) {
                qkq0.m175383a("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f76821a.m151107d())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f76823c.intValue()).array());
        }
        return new dqw0(this.f76821a, this.f76822b, q6x0VarM173179b, this.f76823c, null);
    }
}
