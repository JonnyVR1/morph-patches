package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class cuw0 extends zow0 {

    /* JADX INFO: renamed from: a */
    public final iuw0 f82601a;

    /* JADX INFO: renamed from: b */
    public final r6x0 f82602b;

    /* JADX INFO: renamed from: c */
    public final q6x0 f82603c;

    /* JADX INFO: renamed from: d */
    public final Integer f82604d;

    public cuw0(iuw0 iuw0Var, r6x0 r6x0Var, q6x0 q6x0Var, Integer num) {
        this.f82601a = iuw0Var;
        this.f82602b = r6x0Var;
        this.f82603c = q6x0Var;
        this.f82604d = num;
    }

    /* JADX INFO: renamed from: a */
    public static cuw0 m108814a(huw0 huw0Var, r6x0 r6x0Var, Integer num) throws GeneralSecurityException {
        q6x0 q6x0VarM173179b;
        huw0 huw0Var2 = huw0.f109595d;
        if (huw0Var != huw0Var2 && num == null) {
            fsw0.m122984a(huw0Var, "For given Variant ", " the value of idRequirement must be non-null");
            return null;
        }
        if (huw0Var == huw0Var2 && num != null) {
            j8w0.m140474a("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (r6x0Var.m178104a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + r6x0Var.m178104a());
        }
        iuw0 iuw0VarM138498c = iuw0.m138498c(huw0Var);
        if (iuw0VarM138498c.m138499b() == huw0Var2) {
            q6x0VarM173179b = q6x0.m173179b(new byte[0]);
        } else if (iuw0VarM138498c.m138499b() == huw0.f109594c) {
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (iuw0VarM138498c.m138499b() != huw0.f109593b) {
                qkq0.m175383a("Unknown Variant: ".concat(iuw0VarM138498c.m138499b().toString()));
                return null;
            }
            q6x0VarM173179b = q6x0.m173179b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new cuw0(iuw0VarM138498c, r6x0Var, q6x0VarM173179b, num);
    }

    /* JADX INFO: renamed from: b */
    public final iuw0 m108815b() {
        return this.f82601a;
    }

    /* JADX INFO: renamed from: c */
    public final q6x0 m108816c() {
        return this.f82603c;
    }

    /* JADX INFO: renamed from: d */
    public final r6x0 m108817d() {
        return this.f82602b;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m108818e() {
        return this.f82604d;
    }
}
