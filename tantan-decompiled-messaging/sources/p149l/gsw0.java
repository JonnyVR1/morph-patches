package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class gsw0 extends zow0 {

    /* JADX INFO: renamed from: a */
    public final lsw0 f104223a;

    /* JADX INFO: renamed from: b */
    public final r6x0 f104224b;

    /* JADX INFO: renamed from: c */
    public final q6x0 f104225c;

    /* JADX INFO: renamed from: d */
    public final Integer f104226d;

    public gsw0(lsw0 lsw0Var, r6x0 r6x0Var, q6x0 q6x0Var, Integer num) {
        this.f104223a = lsw0Var;
        this.f104224b = r6x0Var;
        this.f104225c = q6x0Var;
        this.f104226d = num;
    }

    /* JADX INFO: renamed from: a */
    public static gsw0 m127853a(ksw0 ksw0Var, r6x0 r6x0Var, Integer num) throws GeneralSecurityException {
        q6x0 q6x0VarM173179b;
        ksw0 ksw0Var2 = ksw0.f124513d;
        if (ksw0Var != ksw0Var2 && num == null) {
            fsw0.m122984a(ksw0Var, "For given Variant ", " the value of idRequirement must be non-null");
            return null;
        }
        if (ksw0Var == ksw0Var2 && num != null) {
            j8w0.m140474a("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (r6x0Var.m178104a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + r6x0Var.m178104a());
        }
        lsw0 lsw0VarM151649c = lsw0.m151649c(ksw0Var);
        if (lsw0VarM151649c.m151650b() == ksw0Var2) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (lsw0VarM151649c.m151650b() == ksw0.f124512c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (lsw0VarM151649c.m151650b() != ksw0.f124511b) {
                qkq0.m175383a("Unknown Variant: ".concat(lsw0VarM151649c.m151650b().toString()));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new gsw0(lsw0VarM151649c, r6x0Var, q6x0VarM173179b, num);
    }

    /* JADX INFO: renamed from: b */
    public final lsw0 m127854b() {
        return this.f104223a;
    }

    /* JADX INFO: renamed from: c */
    public final q6x0 m127855c() {
        return this.f104225c;
    }

    /* JADX INFO: renamed from: d */
    public final r6x0 m127856d() {
        return this.f104224b;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m127857e() {
        return this.f104226d;
    }
}
