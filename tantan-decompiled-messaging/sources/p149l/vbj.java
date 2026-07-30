package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class vbj {

    /* JADX INFO: renamed from: d */
    private int f180853d;

    /* JADX INFO: renamed from: e */
    private int f180854e;

    /* JADX INFO: renamed from: a */
    private boolean f180850a = false;

    /* JADX INFO: renamed from: c */
    private List<ccj> f180852c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<ccj> f180851b = new ArrayList();

    /* JADX INFO: renamed from: g */
    private synchronized boolean m197711g() {
        return this.f180850a;
    }

    /* JADX INFO: renamed from: a */
    public void m197712a(ccj ccjVar) {
        synchronized (this.f180852c) {
            this.f180852c.add(ccjVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m197713b(ccj ccjVar) {
        this.f180851b.add(ccjVar);
    }

    /* JADX INFO: renamed from: c */
    public void m197714c(int i, int i2) {
        this.f180853d = i;
        this.f180854e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m197715d() {
        Iterator<ccj> it = this.f180851b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f180851b.clear();
        Iterator<ccj> it2 = this.f180852c.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.f180852c.clear();
    }

    /* JADX INFO: renamed from: e */
    public int m197716e() {
        return this.f180854e;
    }

    /* JADX INFO: renamed from: f */
    public int m197717f() {
        return this.f180853d;
    }

    /* JADX INFO: renamed from: h */
    public void m197718h() {
        ccj ccjVar;
        if (m197711g()) {
            for (int i = 0; i < this.f180851b.size(); i++) {
                synchronized (this) {
                    ccjVar = this.f180851b.get(i);
                }
                ccjVar.onDrawFrame();
            }
        }
        synchronized (this.f180852c) {
            try {
                Iterator<ccj> it = this.f180852c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f180852c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m197719i() {
        this.f180850a = false;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m197720j(ccj ccjVar) {
        this.f180851b.remove(ccjVar);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m197721k() {
        if (this.f180851b.size() != 0) {
            this.f180850a = true;
        }
    }
}
