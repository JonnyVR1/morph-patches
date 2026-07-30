package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xdk extends ss2 {

    /* JADX INFO: renamed from: H */
    private Object f192398H = new Object();

    /* JADX INFO: renamed from: E */
    private List<ss2> f192395E = new ArrayList();

    /* JADX INFO: renamed from: G */
    private List<ss2> f192397G = new ArrayList();

    /* JADX INFO: renamed from: F */
    private List<ss2> f192396F = new ArrayList();

    @Override // p149l.bcj
    /* JADX INFO: renamed from: E */
    public void mo101075E(int i, int i2) {
        Iterator<ss2> it = this.f192396F.iterator();
        while (it.hasNext()) {
            it.next().mo101075E(i, i2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m208316Q(ss2 ss2Var) {
        if (!this.f192396F.contains(ss2Var)) {
            this.f192396F.add(ss2Var);
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m208317R(ss2 ss2Var) {
        synchronized (this.f192398H) {
            this.f192395E.add(ss2Var);
            m208316Q(ss2Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m208318S(ss2 ss2Var) {
        this.f192397G.add(ss2Var);
        m208316Q(ss2Var);
    }

    /* JADX INFO: renamed from: T */
    public synchronized void m208319T(ss2 ss2Var) {
        this.f192397G.remove(ss2Var);
        this.f192396F.remove(ss2Var);
    }

    @Override // p149l.ss2, p149l.icj
    /* JADX INFO: renamed from: b */
    public void mo95681b(int i, lcj lcjVar, boolean z) {
        if (this.f192397G.contains(lcjVar)) {
            m101077G(lcjVar.m101085s());
            m101074D(lcjVar.m101084q());
            synchronized (m149301K()) {
                try {
                    Iterator<icj> it = m149302L().iterator();
                    while (it.hasNext()) {
                        it.next().mo95681b(i, this, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (m149301K()) {
            synchronized (this.f192398H) {
                try {
                    Iterator<ss2> it2 = this.f192395E.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo95681b(i, lcjVar, z);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public synchronized void mo95685i() {
        super.mo95685i();
        Iterator<ss2> it = this.f192396F.iterator();
        while (it.hasNext()) {
            it.next().mo95685i();
        }
    }
}
