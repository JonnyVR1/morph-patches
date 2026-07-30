package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h7t0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final List f106336a = new ArrayList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final g7t0 m129792a(v5t0 v5t0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            g7t0 g7t0Var = (g7t0) it.next();
            if (g7t0Var.f101432c == v5t0Var) {
                return g7t0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m129793c(g7t0 g7t0Var) {
        this.f106336a.add(g7t0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m129794f(g7t0 g7t0Var) {
        this.f106336a.remove(g7t0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m129795g(v5t0 v5t0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            g7t0 g7t0Var = (g7t0) it.next();
            if (g7t0Var.f101432c == v5t0Var) {
                arrayList.add(g7t0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((g7t0) it2.next()).f101433d.mo105821g();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f106336a.iterator();
    }
}
