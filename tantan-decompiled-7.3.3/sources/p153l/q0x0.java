package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class q0x0 {

    /* JADX INFO: renamed from: a */
    public b1x0 f155120a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f155121b = null;

    /* JADX INFO: renamed from: c */
    public Integer f155122c = null;

    public /* synthetic */ q0x0(p0x0 p0x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final q0x0 m174793a(Integer num) {
        this.f155122c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final q0x0 m174794b(xfx0 xfx0Var) {
        this.f155121b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final q0x0 m174795c(b1x0 b1x0Var) {
        this.f155120a = b1x0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final s0x0 m174796d() throws GeneralSecurityException {
        xfx0 xfx0Var;
        wfx0 wfx0VarM206170b;
        b1x0 b1x0Var = this.f155120a;
        if (b1x0Var == null || (xfx0Var = this.f155121b) == null) {
            phw0.m172339a("Cannot build without parameters and/or key material");
            return null;
        }
        if (b1x0Var.m101511b() != xfx0Var.m210863a()) {
            phw0.m172339a("Key size mismatch");
            return null;
        }
        if (b1x0Var.mo101510a() && this.f155122c == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f155120a.mo101510a() && this.f155122c != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f155120a.m101512c() == z0x0.f202437d) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f155120a.m101512c() == z0x0.f202436c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f155122c.intValue()).array());
        } else {
            if (this.f155120a.m101512c() != z0x0.f202435b) {
                wtq0.m207906a("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f155120a.m101512c())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f155122c.intValue()).array());
        }
        return new s0x0(this.f155120a, this.f155121b, wfx0VarM206170b, this.f155122c, null);
    }
}
