package p149l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class pvc0 {

    /* JADX INFO: renamed from: a */
    public HashSet<pvc0> f151443a = new HashSet<>(2);

    /* JADX INFO: renamed from: b */
    public int f151444b = 0;

    /* JADX INFO: renamed from: a */
    public void m171616a(pvc0 pvc0Var) {
        this.f151443a.add(pvc0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m171617b() {
        this.f151444b = 1;
        Iterator<pvc0> it = this.f151443a.iterator();
        while (it.hasNext()) {
            it.next().mo1115f();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m171618c() {
        this.f151444b = 0;
        Iterator<pvc0> it = this.f151443a.iterator();
        while (it.hasNext()) {
            it.next().m171618c();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m171619d() {
        return this.f151444b == 1;
    }

    /* JADX INFO: renamed from: e */
    public void mo1114e() {
        this.f151444b = 0;
        this.f151443a.clear();
    }

    /* JADX INFO: renamed from: f */
    public void mo1115f() {
    }
}
