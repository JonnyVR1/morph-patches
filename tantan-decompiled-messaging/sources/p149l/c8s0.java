package p149l;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c8s0 {

    /* JADX INFO: renamed from: a */
    public final Map f79811a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final e8s0 f79812b;

    public c8s0(e8s0 e8s0Var) {
        this.f79812b = e8s0Var;
    }

    /* JADX INFO: renamed from: a */
    public final e8s0 m105818a() {
        return this.f79812b;
    }

    /* JADX INFO: renamed from: b */
    public final void m105819b(String str, @Nullable b8s0 b8s0Var) {
        this.f79811a.put(str, b8s0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m105820c(String str, String str2, long j) {
        b8s0 b8s0Var = (b8s0) this.f79811a.get(str2);
        String[] strArr = {str};
        if (b8s0Var != null) {
            this.f79812b.m115283e(b8s0Var, j, strArr);
        }
        this.f79811a.put(str, new b8s0(j, null, null));
    }
}
