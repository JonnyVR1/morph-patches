package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class x8x0 {

    /* JADX INFO: renamed from: a */
    public k9x0 f192886a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f192887b = null;

    /* JADX INFO: renamed from: c */
    public Integer f192888c = null;

    public /* synthetic */ x8x0(w8x0 w8x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final x8x0 m209756a(Integer num) {
        this.f192888c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final x8x0 m209757b(xfx0 xfx0Var) {
        this.f192887b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final x8x0 m209758c(k9x0 k9x0Var) {
        this.f192886a = k9x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final z8x0 m209759d() throws GeneralSecurityException {
        xfx0 xfx0Var;
        wfx0 wfx0VarM206170b;
        k9x0 k9x0Var = this.f192886a;
        if (k9x0Var == null || (xfx0Var = this.f192887b) == null) {
            phw0.m172339a("Cannot build without parameters and/or key material");
            return null;
        }
        if (k9x0Var.m148902c() != xfx0Var.m210863a()) {
            phw0.m172339a("Key size mismatch");
            return null;
        }
        if (k9x0Var.mo101510a() && this.f192888c == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f192886a.mo101510a() && this.f192888c != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f192886a.m148905g() == i9x0.f113527e) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f192886a.m148905g() == i9x0.f113526d || this.f192886a.m148905g() == i9x0.f113525c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f192888c.intValue()).array());
        } else {
            if (this.f192886a.m148905g() != i9x0.f113524b) {
                wtq0.m207906a("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f192886a.m148905g())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f192888c.intValue()).array());
        }
        return new z8x0(this.f192886a, this.f192887b, wfx0VarM206170b, this.f192888c, null);
    }
}
