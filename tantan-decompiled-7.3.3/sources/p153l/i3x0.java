package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class i3x0 extends fyw0 {

    /* JADX INFO: renamed from: a */
    public final o3x0 f112792a;

    /* JADX INFO: renamed from: b */
    public final xfx0 f112793b;

    /* JADX INFO: renamed from: c */
    public final wfx0 f112794c;

    /* JADX INFO: renamed from: d */
    public final Integer f112795d;

    public i3x0(o3x0 o3x0Var, xfx0 xfx0Var, wfx0 wfx0Var, Integer num) {
        this.f112792a = o3x0Var;
        this.f112793b = xfx0Var;
        this.f112794c = wfx0Var;
        this.f112795d = num;
    }

    /* JADX INFO: renamed from: a */
    public static i3x0 m138347a(n3x0 n3x0Var, xfx0 xfx0Var, Integer num) throws GeneralSecurityException {
        wfx0 wfx0VarM206170b;
        n3x0 n3x0Var2 = n3x0.f140044d;
        if (n3x0Var != n3x0Var2 && num == null) {
            l1x0.m152514a(n3x0Var, "For given Variant ", " the value of idRequirement must be non-null");
            return null;
        }
        if (n3x0Var == n3x0Var2 && num != null) {
            phw0.m172339a("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (xfx0Var.m210863a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + xfx0Var.m210863a());
        }
        o3x0 o3x0VarM165892c = o3x0.m165892c(n3x0Var);
        if (o3x0VarM165892c.m165893b() == n3x0Var2) {
            wfx0VarM206170b = wfx0.m206170b(new byte[0]);
        } else if (o3x0VarM165892c.m165893b() == n3x0.f140043c) {
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (o3x0VarM165892c.m165893b() != n3x0.f140042b) {
                wtq0.m207906a("Unknown Variant: ".concat(o3x0VarM165892c.m165893b().toString()));
                return null;
            }
            wfx0VarM206170b = wfx0.m206170b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new i3x0(o3x0VarM165892c, xfx0Var, wfx0VarM206170b, num);
    }

    /* JADX INFO: renamed from: b */
    public final o3x0 m138348b() {
        return this.f112792a;
    }

    /* JADX INFO: renamed from: c */
    public final wfx0 m138349c() {
        return this.f112794c;
    }

    /* JADX INFO: renamed from: d */
    public final xfx0 m138350d() {
        return this.f112793b;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m138351e() {
        return this.f112795d;
    }
}
