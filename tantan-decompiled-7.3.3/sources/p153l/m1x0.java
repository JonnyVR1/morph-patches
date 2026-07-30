package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class m1x0 extends fyw0 {

    /* JADX INFO: renamed from: a */
    public final r1x0 f134480a;

    /* JADX INFO: renamed from: b */
    public final xfx0 f134481b;

    /* JADX INFO: renamed from: c */
    public final wfx0 f134482c;

    /* JADX INFO: renamed from: d */
    public final Integer f134483d;

    public m1x0(r1x0 r1x0Var, xfx0 xfx0Var, wfx0 wfx0Var, Integer num) {
        this.f134480a = r1x0Var;
        this.f134481b = xfx0Var;
        this.f134482c = wfx0Var;
        this.f134483d = num;
    }

    /* JADX INFO: renamed from: a */
    public static m1x0 m156723a(q1x0 q1x0Var, xfx0 xfx0Var, Integer num) throws GeneralSecurityException {
        wfx0 wfx0VarM206170b;
        q1x0 q1x0Var2 = q1x0.f155229d;
        if (q1x0Var != q1x0Var2 && num == null) {
            l1x0.m152514a(q1x0Var, "For given Variant ", " the value of idRequirement must be non-null");
            return null;
        }
        if (q1x0Var == q1x0Var2 && num != null) {
            phw0.m172339a("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (xfx0Var.m210863a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + xfx0Var.m210863a());
        }
        r1x0 r1x0VarM179456c = r1x0.m179456c(q1x0Var);
        if (r1x0VarM179456c.m179457b() == q1x0Var2) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (r1x0VarM179456c.m179457b() == q1x0.f155228c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (r1x0VarM179456c.m179457b() != q1x0.f155227b) {
                wtq0.m207906a("Unknown Variant: ".concat(r1x0VarM179456c.m179457b().toString()));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new m1x0(r1x0VarM179456c, xfx0Var, wfx0VarM206170b, num);
    }

    /* JADX INFO: renamed from: b */
    public final r1x0 m156724b() {
        return this.f134480a;
    }

    /* JADX INFO: renamed from: c */
    public final wfx0 m156725c() {
        return this.f134482c;
    }

    /* JADX INFO: renamed from: d */
    public final xfx0 m156726d() {
        return this.f134481b;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m156727e() {
        return this.f134483d;
    }
}
