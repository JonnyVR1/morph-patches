package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jhx0 {

    /* JADX INFO: renamed from: b */
    public static volatile jhx0 f121020b;

    /* JADX INFO: renamed from: c */
    public static final jhx0 f121021c = new jhx0(true);

    /* JADX INFO: renamed from: a */
    public final Map f121022a;

    public jhx0() {
        this.f121022a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static jhx0 m144944a() {
        return f121021c;
    }

    /* JADX INFO: renamed from: b */
    public static jhx0 m144945b() {
        jhx0 jhx0Var = f121020b;
        if (jhx0Var != null) {
            return jhx0Var;
        }
        synchronized (jhx0.class) {
            try {
                jhx0 jhx0Var2 = f121020b;
                if (jhx0Var2 != null) {
                    return jhx0Var2;
                }
                jhx0 jhx0VarM176622b = qhx0.m176622b(jhx0.class);
                f121020b = jhx0VarM176622b;
                return jhx0VarM176622b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final vhx0 m144946c(fkx0 fkx0Var, int i) {
        return (vhx0) this.f121022a.get(new ihx0(fkx0Var, i));
    }

    public jhx0(boolean z) {
        this.f121022a = Collections.EMPTY_MAP;
    }
}
