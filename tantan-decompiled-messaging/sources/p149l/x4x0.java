package p149l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class x4x0 {

    /* JADX INFO: renamed from: b */
    public static volatile x4x0 f191065b;

    /* JADX INFO: renamed from: c */
    public static final x4x0 f191066c = new x4x0(true);

    /* JADX INFO: renamed from: a */
    public final Map f191067a;

    public x4x0() {
        this.f191067a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static x4x0 m207040a() {
        x4x0 x4x0Var = f191065b;
        if (x4x0Var != null) {
            return x4x0Var;
        }
        synchronized (x4x0.class) {
            try {
                x4x0 x4x0Var2 = f191065b;
                if (x4x0Var2 != null) {
                    return x4x0Var2;
                }
                aox0 aox0Var = aox0.f70954c;
                x4x0 x4x0VarM179019b = rdx0.m179019b(x4x0.class);
                f191065b = x4x0VarM179019b;
                return x4x0VarM179019b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ohx0 m207041b(smx0 smx0Var, int i) {
        return (ohx0) this.f191067a.get(new c4x0(smx0Var, i));
    }

    public x4x0(boolean z) {
        this.f191067a = Collections.EMPTY_MAP;
    }
}
