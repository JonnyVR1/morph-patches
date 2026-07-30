package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class krw0 {

    /* JADX INFO: renamed from: a */
    public vrw0 f124401a = null;

    /* JADX INFO: renamed from: b */
    public r6x0 f124402b = null;

    /* JADX INFO: renamed from: c */
    public Integer f124403c = null;

    public /* synthetic */ krw0(jrw0 jrw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final krw0 m147028a(Integer num) {
        this.f124403c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final krw0 m147029b(r6x0 r6x0Var) {
        this.f124402b = r6x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final krw0 m147030c(vrw0 vrw0Var) {
        this.f124401a = vrw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final mrw0 m147031d() throws GeneralSecurityException {
        r6x0 r6x0Var;
        q6x0 q6x0VarM173179b;
        vrw0 vrw0Var = this.f124401a;
        if (vrw0Var == null || (r6x0Var = this.f124402b) == null) {
            j8w0.m140474a("Cannot build without parameters and/or key material");
            return null;
        }
        if (vrw0Var.m199754b() != r6x0Var.m178104a()) {
            j8w0.m140474a("Key size mismatch");
            return null;
        }
        if (vrw0Var.mo104696a() && this.f124403c == null) {
            j8w0.m140474a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f124401a.mo104696a() && this.f124403c != null) {
            j8w0.m140474a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f124401a.m199755c() == trw0.f171877d) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (this.f124401a.m199755c() == trw0.f171876c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f124403c.intValue()).array());
        } else {
            if (this.f124401a.m199755c() != trw0.f171875b) {
                qkq0.m175383a("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f124401a.m199755c())));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f124403c.intValue()).array());
        }
        return new mrw0(this.f124401a, this.f124402b, q6x0VarM173179b, this.f124403c, null);
    }
}
