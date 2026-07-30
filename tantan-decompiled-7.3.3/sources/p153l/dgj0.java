package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1861d0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dgj0 {

    /* JADX INFO: renamed from: a */
    public final int f88310a;

    /* JADX INFO: renamed from: b */
    public final jzc0[] f88311b;

    /* JADX INFO: renamed from: c */
    public final u9f[] f88312c;

    /* JADX INFO: renamed from: d */
    public final C1861d0 f88313d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Object f88314e;

    public dgj0(jzc0[] jzc0VarArr, u9f[] u9fVarArr, C1861d0 c1861d0, @Nullable Object obj) {
        this.f88311b = jzc0VarArr;
        this.f88312c = (u9f[]) u9fVarArr.clone();
        this.f88313d = c1861d0;
        this.f88314e = obj;
        this.f88310a = jzc0VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public boolean m115652a(@Nullable dgj0 dgj0Var) {
        if (dgj0Var == null || dgj0Var.f88312c.length != this.f88312c.length) {
            return false;
        }
        for (int i = 0; i < this.f88312c.length; i++) {
            if (!m115653b(dgj0Var, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m115653b(@Nullable dgj0 dgj0Var, int i) {
        return dgj0Var != null && bmk0.m105123c(this.f88311b[i], dgj0Var.f88311b[i]) && bmk0.m105123c(this.f88312c[i], dgj0Var.f88312c[i]);
    }

    /* JADX INFO: renamed from: c */
    public boolean m115654c(int i) {
        return this.f88311b[i] != null;
    }
}
