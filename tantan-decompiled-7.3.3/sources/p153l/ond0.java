package p153l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ond0 {

    /* JADX INFO: renamed from: a */
    public final Set<nnd0> f148080a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public synchronized void m168330a(nnd0 nnd0Var) {
        this.f148080a.remove(nnd0Var);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m168331b(nnd0 nnd0Var) {
        this.f148080a.add(nnd0Var);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m168332c(nnd0 nnd0Var) {
        return this.f148080a.contains(nnd0Var);
    }
}
