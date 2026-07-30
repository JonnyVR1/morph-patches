package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class hzw0 {

    /* JADX INFO: renamed from: a */
    public rzw0 f112309a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f112310b = null;

    /* JADX INFO: renamed from: c */
    public Integer f112311c = null;

    public /* synthetic */ hzw0(gzw0 gzw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final hzw0 m137941a(Integer num) {
        this.f112311c = num;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final hzw0 m137942b(xfx0 xfx0Var) {
        this.f112310b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final hzw0 m137943c(rzw0 rzw0Var) {
        this.f112309a = rzw0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final jzw0 m137944d() throws GeneralSecurityException {
        xfx0 xfx0Var;
        wfx0 wfx0VarM206170b;
        rzw0 rzw0Var = this.f112309a;
        if (rzw0Var == null || (xfx0Var = this.f112310b) == null) {
            phw0.m172339a("Cannot build without parameters and/or key material");
            return null;
        }
        if (rzw0Var.m183863c() != xfx0Var.m210863a()) {
            phw0.m172339a("Key size mismatch");
            return null;
        }
        if (rzw0Var.mo101510a() && this.f112311c == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f112309a.mo101510a() && this.f112311c != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f112309a.m183864d() == pzw0.f154986d) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f112309a.m183864d() == pzw0.f154985c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f112311c.intValue()).array());
        } else {
            if (this.f112309a.m183864d() != pzw0.f154984b) {
                wtq0.m207906a("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f112309a.m183864d())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f112311c.intValue()).array());
        }
        return new jzw0(this.f112309a, this.f112310b, wfx0VarM206170b, this.f112311c, null);
    }
}
