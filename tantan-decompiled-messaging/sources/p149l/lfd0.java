package p149l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lfd0 {

    /* JADX INFO: renamed from: a */
    public final Set<kfd0> f127866a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public synchronized void m149673a(kfd0 kfd0Var) {
        this.f127866a.remove(kfd0Var);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m149674b(kfd0 kfd0Var) {
        this.f127866a.add(kfd0Var);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m149675c(kfd0 kfd0Var) {
        return this.f127866a.contains(kfd0Var);
    }
}
