package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class sqw0 {

    /* JADX INFO: renamed from: a */
    public irw0 f166027a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f166028b = null;

    /* JADX INFO: renamed from: c */
    public Integer f166029c = null;

    public /* synthetic */ sqw0(rqw0 rqw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final sqw0 m185612a(Integer num) {
        this.f166029c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final sqw0 m185613b(r6x0 r6x0Var) {
        this.f166028b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final sqw0 m185614c(irw0 irw0Var) {
        this.f166027a = irw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final uqw0 m185615d() throws GeneralSecurityException {
        r6x0 r6x0Var;
        q6x0 q6x0VarM173179b;
        irw0 irw0Var = this.f166027a;
        if (irw0Var == null || (r6x0Var = this.f166028b) == null) {
            j8w0.m140474a("Cannot build without parameters and/or key material");
            return null;
        }
        if (irw0Var.m137919b() != r6x0Var.m178104a()) {
            j8w0.m140474a("Key size mismatch");
            return null;
        }
        if (irw0Var.mo104696a() && this.f166029c == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f166027a.mo104696a() && this.f166029c != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f166027a.m137920d() == grw0.f104123d) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f166027a.m137920d() == grw0.f104122c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f166029c.intValue()).array());
        } else {
            if (this.f166027a.m137920d() != grw0.f104121b) {
                qkq0.m175383a("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f166027a.m137920d())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f166029c.intValue()).array());
        }
        return new uqw0(this.f166027a, this.f166028b, q6x0VarM173179b, this.f166029c, null);
    }
}
