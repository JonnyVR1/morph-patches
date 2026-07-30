package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1838d0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z6j0 {

    /* JADX INFO: renamed from: a */
    public final int f201928a;

    /* JADX INFO: renamed from: b */
    public final erc0[] f201929b;

    /* JADX INFO: renamed from: c */
    public final o8f[] f201930c;

    /* JADX INFO: renamed from: d */
    public final C1838d0 f201931d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Object f201932e;

    public z6j0(erc0[] erc0VarArr, o8f[] o8fVarArr, C1838d0 c1838d0, @Nullable Object obj) {
        this.f201929b = erc0VarArr;
        this.f201930c = (o8f[]) o8fVarArr.clone();
        this.f201931d = c1838d0;
        this.f201932e = obj;
        this.f201928a = erc0VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public boolean m217395a(@Nullable z6j0 z6j0Var) {
        if (z6j0Var == null || z6j0Var.f201930c.length != this.f201930c.length) {
            return false;
        }
        for (int i = 0; i < this.f201930c.length; i++) {
            if (!m217396b(z6j0Var, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m217396b(@Nullable z6j0 z6j0Var, int i) {
        return z6j0Var != null && vck0.m197845c(this.f201929b[i], z6j0Var.f201929b[i]) && vck0.m197845c(this.f201930c[i], z6j0Var.f201930c[i]);
    }

    /* JADX INFO: renamed from: c */
    public boolean m217397c(int i) {
        return this.f201929b[i] != null;
    }
}
