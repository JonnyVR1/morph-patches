package p149l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d8x0 {

    /* JADX INFO: renamed from: b */
    public static volatile d8x0 f84913b;

    /* JADX INFO: renamed from: c */
    public static final d8x0 f84914c = new d8x0(true);

    /* JADX INFO: renamed from: a */
    public final Map f84915a;

    public d8x0() {
        this.f84915a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static d8x0 m110397a() {
        return f84914c;
    }

    /* JADX INFO: renamed from: b */
    public static d8x0 m110398b() {
        d8x0 d8x0Var = f84913b;
        if (d8x0Var != null) {
            return d8x0Var;
        }
        synchronized (d8x0.class) {
            try {
                d8x0 d8x0Var2 = f84913b;
                if (d8x0Var2 != null) {
                    return d8x0Var2;
                }
                d8x0 d8x0VarM144980b = k8x0.m144980b(d8x0.class);
                f84913b = d8x0VarM144980b;
                return d8x0VarM144980b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final p8x0 m110399c(zax0 zax0Var, int i) {
        return (p8x0) this.f84915a.get(new c8x0(zax0Var, i));
    }

    public d8x0(boolean z) {
        this.f84915a = Collections.EMPTY_MAP;
    }
}
