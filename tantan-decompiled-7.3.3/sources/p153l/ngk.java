package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ngk extends it2 {

    /* JADX INFO: renamed from: H */
    private Object f141835H = new Object();

    /* JADX INFO: renamed from: E */
    private List<it2> f141832E = new ArrayList();

    /* JADX INFO: renamed from: G */
    private List<it2> f141834G = new ArrayList();

    /* JADX INFO: renamed from: F */
    private List<it2> f141833F = new ArrayList();

    @Override // p153l.vej
    /* JADX INFO: renamed from: E */
    public void mo162984E(int i, int i2) {
        Iterator<it2> it = this.f141833F.iterator();
        while (it.hasNext()) {
            it.next().mo162984E(i, i2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m162985Q(it2 it2Var) {
        if (!this.f141833F.contains(it2Var)) {
            this.f141833F.add(it2Var);
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m162986R(it2 it2Var) {
        synchronized (this.f141835H) {
            this.f141832E.add(it2Var);
            m162985Q(it2Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m162987S(it2 it2Var) {
        this.f141834G.add(it2Var);
        m162985Q(it2Var);
    }

    /* JADX INFO: renamed from: T */
    public synchronized void m162988T(it2 it2Var) {
        this.f141834G.remove(it2Var);
        this.f141833F.remove(it2Var);
    }

    @Override // p153l.it2, p153l.cfj
    /* JADX INFO: renamed from: b */
    public void mo109544b(int i, ffj ffjVar, boolean z) {
        if (this.f141834G.contains(ffjVar)) {
            m201057G(ffjVar.m201064s());
            m201055D(ffjVar.m201063q());
            synchronized (m125377K()) {
                try {
                    Iterator<cfj> it = m125378L().iterator();
                    while (it.hasNext()) {
                        it.next().mo109544b(i, this, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (m125377K()) {
            synchronized (this.f141835H) {
                try {
                    Iterator<it2> it2 = this.f141832E.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo109544b(i, ffjVar, z);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public synchronized void mo97355i() {
        super.mo97355i();
        Iterator<it2> it = this.f141833F.iterator();
        while (it.hasNext()) {
            it.next().mo97355i();
        }
    }
}
