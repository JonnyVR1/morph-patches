package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class lyw0 {

    /* JADX INFO: renamed from: a */
    public xyw0 f134142a = null;

    /* JADX INFO: renamed from: b */
    public xfx0 f134143b = null;

    /* JADX INFO: renamed from: c */
    public xfx0 f134144c = null;

    /* JADX INFO: renamed from: d */
    public Integer f134145d = null;

    public /* synthetic */ lyw0(kyw0 kyw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final lyw0 m156393a(xfx0 xfx0Var) {
        this.f134143b = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final lyw0 m156394b(xfx0 xfx0Var) {
        this.f134144c = xfx0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final lyw0 m156395c(Integer num) {
        this.f134145d = num;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final lyw0 m156396d(xyw0 xyw0Var) {
        this.f134142a = xyw0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final nyw0 m156397e() throws GeneralSecurityException {
        wfx0 wfx0VarM206170b;
        xyw0 xyw0Var = this.f134142a;
        if (xyw0Var == null) {
            phw0.m172339a("Cannot build without parameters");
            return null;
        }
        xfx0 xfx0Var = this.f134143b;
        if (xfx0Var == null || this.f134144c == null) {
            phw0.m172339a("Cannot build without key material");
            return null;
        }
        if (xyw0Var.m213652b() != xfx0Var.m210863a()) {
            phw0.m172339a("AES key size mismatch");
            return null;
        }
        if (xyw0Var.m213653c() != this.f134144c.m210863a()) {
            phw0.m172339a("HMAC key size mismatch");
            return null;
        }
        if (this.f134142a.mo101510a() && this.f134145d == null) {
            phw0.m172339a("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.f134142a.mo101510a() && this.f134145d != null) {
            phw0.m172339a("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.f134142a.m213657g() == vyw0.f186430d) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (this.f134142a.m213657g() == vyw0.f186429c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f134145d.intValue()).array());
        } else {
            if (this.f134142a.m213657g() != vyw0.f186428b) {
                wtq0.m207906a("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f134142a.m213657g())));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f134145d.intValue()).array());
        }
        return new nyw0(this.f134142a, this.f134143b, this.f134144c, wfx0VarM206170b, this.f134145d, null);
    }
}
