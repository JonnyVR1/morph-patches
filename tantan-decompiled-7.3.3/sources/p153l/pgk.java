package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pgk extends kt2 {

    /* JADX INFO: renamed from: G */
    private Object f152305G = new Object();

    /* JADX INFO: renamed from: D */
    private List<kt2> f152302D = new ArrayList();

    /* JADX INFO: renamed from: F */
    private List<kt2> f152304F = new ArrayList();

    /* JADX INFO: renamed from: E */
    private List<kt2> f152303E = new ArrayList();

    /* JADX INFO: renamed from: O */
    public List<kt2> m172253O() {
        return this.f152302D;
    }

    /* JADX INFO: renamed from: P */
    public List<kt2> m172254P() {
        return this.f152304F;
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m172255Q(kt2 kt2Var) {
        if (!this.f152303E.contains(kt2Var)) {
            this.f152303E.add(kt2Var);
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m172256R(kt2 kt2Var) {
        synchronized (this.f152305G) {
            this.f152302D.add(kt2Var);
            m172255Q(kt2Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m172257S(kt2 kt2Var) {
        this.f152304F.add(kt2Var);
        m172255Q(kt2Var);
    }

    /* JADX INFO: renamed from: T */
    public synchronized void m172258T(kt2 kt2Var) {
        this.f152303E.remove(kt2Var);
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m172259U(kt2 kt2Var) {
        synchronized (this.f152305G) {
            this.f152302D.remove(kt2Var);
            this.f152303E.remove(kt2Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public synchronized void m172260V(kt2 kt2Var) {
        this.f152304F.remove(kt2Var);
        this.f152303E.remove(kt2Var);
    }

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        if (this.f152304F.contains(hfjVar)) {
            m210695B(hfjVar.m210702r());
            m210704y(hfjVar.m210701n());
            synchronized (m134800I()) {
                try {
                    Iterator<efj> it = m134801J().iterator();
                    while (it.hasNext()) {
                        it.next().mo96079c(i, this, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (m134800I()) {
            synchronized (this.f152305G) {
                try {
                    Iterator<kt2> it2 = this.f152302D.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo96079c(i, hfjVar, z);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        super.mo96080f();
        Iterator<kt2> it = this.f152303E.iterator();
        while (it.hasNext()) {
            it.next().mo96080f();
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: z */
    public void mo172261z(int i, int i2) {
        Iterator<kt2> it = this.f152303E.iterator();
        while (it.hasNext()) {
            it.next().mo172261z(i, i2);
        }
    }
}
