package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class w7x0 {

    /* JADX INFO: renamed from: a */
    public h8x0 f187816a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f187817b = null;

    /* JADX INFO: renamed from: c */
    public Integer f187818c = null;

    public /* synthetic */ w7x0(v7x0 v7x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final w7x0 m205392a(xfx0 xfx0Var) throws GeneralSecurityException {
        this.f187817b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final w7x0 m205393b(Integer num) {
        this.f187818c = num;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final w7x0 m205394c(h8x0 h8x0Var) {
        this.f187816a = h8x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final y7x0 m205395d() throws GeneralSecurityException {
        xfx0 xfx0Var;
        wfx0 wfx0VarM206170b;
        h8x0 h8x0Var = this.f187816a;
        if (h8x0Var == null || (xfx0Var = this.f187817b) == null) {
            phw0.m172339a("Cannot build without parameters and/or key material");
            return null;
        }
        if (h8x0Var.m133993c() != xfx0Var.m210863a()) {
            phw0.m172339a("Key size mismatch");
            return null;
        }
        if (h8x0Var.mo101510a() && this.f187818c == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f187816a.mo101510a() && this.f187818c != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f187816a.m133995e() == f8x0.f97787e) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f187816a.m133995e() == f8x0.f97786d || this.f187816a.m133995e() == f8x0.f97785c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f187818c.intValue()).array());
        } else {
            if (this.f187816a.m133995e() != f8x0.f97784b) {
                wtq0.m207906a("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f187816a.m133995e())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f187818c.intValue()).array());
        }
        return new y7x0(this.f187816a, this.f187817b, wfx0VarM206170b, this.f187818c, null);
    }
}
