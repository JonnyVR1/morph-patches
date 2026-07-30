package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class yzw0 {

    /* JADX INFO: renamed from: a */
    public o0x0 f202266a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f202267b = null;

    /* JADX INFO: renamed from: c */
    public Integer f202268c = null;

    public /* synthetic */ yzw0(xzw0 xzw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final yzw0 m218087a(Integer num) {
        this.f202268c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final yzw0 m218088b(xfx0 xfx0Var) {
        this.f202267b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final yzw0 m218089c(o0x0 o0x0Var) {
        this.f202266a = o0x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final a0x0 m218090d() throws GeneralSecurityException {
        xfx0 xfx0Var;
        wfx0 wfx0VarM206170b;
        o0x0 o0x0Var = this.f202266a;
        if (o0x0Var == null || (xfx0Var = this.f202267b) == null) {
            phw0.m172339a("Cannot build without parameters and/or key material");
            return null;
        }
        if (o0x0Var.m165553b() != xfx0Var.m210863a()) {
            phw0.m172339a("Key size mismatch");
            return null;
        }
        if (o0x0Var.mo101510a() && this.f202268c == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f202266a.mo101510a() && this.f202268c != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f202266a.m165554d() == m0x0.f134369d) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f202266a.m165554d() == m0x0.f134368c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f202268c.intValue()).array());
        } else {
            if (this.f202266a.m165554d() != m0x0.f134367b) {
                wtq0.m207906a("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f202266a.m165554d())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f202268c.intValue()).array());
        }
        return new a0x0(this.f202266a, this.f202267b, wfx0VarM206170b, this.f202268c, null);
    }
}
