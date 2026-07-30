package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dex0 {

    /* JADX INFO: renamed from: b */
    public static volatile dex0 f88104b;

    /* JADX INFO: renamed from: c */
    public static final dex0 f88105c = new dex0(true);

    /* JADX INFO: renamed from: a */
    public final Map f88106a;

    public dex0() {
        this.f88106a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static dex0 m115486a() {
        dex0 dex0Var = f88104b;
        if (dex0Var != null) {
            return dex0Var;
        }
        synchronized (dex0.class) {
            try {
                dex0 dex0Var2 = f88104b;
                if (dex0Var2 != null) {
                    return dex0Var2;
                }
                gxx0 gxx0Var = gxx0.f107009c;
                dex0 dex0VarM212070b = xmx0.m212070b(dex0.class);
                f88104b = dex0VarM212070b;
                return dex0VarM212070b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final uqx0 m115487b(yvx0 yvx0Var, int i) {
        return (uqx0) this.f88106a.get(new idx0(yvx0Var, i));
    }

    public dex0(boolean z) {
        this.f88106a = Collections.EMPTY_MAP;
    }
}
