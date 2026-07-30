package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zdk extends us2 {

    /* JADX INFO: renamed from: G */
    private Object f202674G = new Object();

    /* JADX INFO: renamed from: D */
    private List<us2> f202671D = new ArrayList();

    /* JADX INFO: renamed from: F */
    private List<us2> f202673F = new ArrayList();

    /* JADX INFO: renamed from: E */
    private List<us2> f202672E = new ArrayList();

    /* JADX INFO: renamed from: O */
    public List<us2> m218165O() {
        return this.f202671D;
    }

    /* JADX INFO: renamed from: P */
    public List<us2> m218166P() {
        return this.f202673F;
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m218167Q(us2 us2Var) {
        if (!this.f202672E.contains(us2Var)) {
            this.f202672E.add(us2Var);
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m218168R(us2 us2Var) {
        synchronized (this.f202674G) {
            this.f202671D.add(us2Var);
            m218167Q(us2Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m218169S(us2 us2Var) {
        this.f202673F.add(us2Var);
        m218167Q(us2Var);
    }

    /* JADX INFO: renamed from: T */
    public synchronized void m218170T(us2 us2Var) {
        this.f202672E.remove(us2Var);
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m218171U(us2 us2Var) {
        synchronized (this.f202674G) {
            this.f202671D.remove(us2Var);
            this.f202672E.remove(us2Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public synchronized void m218172V(us2 us2Var) {
        this.f202673F.remove(us2Var);
        this.f202672E.remove(us2Var);
    }

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        if (this.f202673F.contains(ncjVar)) {
            m110693B(ncjVar.m110705r());
            m110712y(ncjVar.m110701n());
            synchronized (m158947I()) {
                try {
                    Iterator<kcj> it = m158948J().iterator();
                    while (it.hasNext()) {
                        it.next().mo102037c(i, this, z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (m158947I()) {
            synchronized (this.f202674G) {
                try {
                    Iterator<us2> it2 = this.f202671D.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo102037c(i, ncjVar, z);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        super.mo102038f();
        Iterator<us2> it = this.f202672E.iterator();
        while (it.hasNext()) {
            it.next().mo102038f();
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: z */
    public void mo110713z(int i, int i2) {
        Iterator<us2> it = this.f202672E.iterator();
        while (it.hasNext()) {
            it.next().mo110713z(i, i2);
        }
    }
}
