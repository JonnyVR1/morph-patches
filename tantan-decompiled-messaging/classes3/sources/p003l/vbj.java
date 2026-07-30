package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vbj {

    /* JADX INFO: renamed from: d */
    private int f8275d;

    /* JADX INFO: renamed from: e */
    private int f8276e;

    /* JADX INFO: renamed from: a */
    private boolean f8272a = false;

    /* JADX INFO: renamed from: c */
    private List<ccj> f8274c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<ccj> f8273b = new ArrayList();

    /* JADX INFO: renamed from: g */
    private synchronized boolean m8350g() {
        return this.f8272a;
    }

    /* JADX INFO: renamed from: a */
    public void m8351a(ccj ccjVar) {
        synchronized (this.f8274c) {
            this.f8274c.add(ccjVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m8352b(ccj ccjVar) {
        this.f8273b.add(ccjVar);
    }

    /* JADX INFO: renamed from: c */
    public void m8353c(int i, int i2) {
        this.f8275d = i;
        this.f8276e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m8354d() {
        Iterator<ccj> it = this.f8273b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f8273b.clear();
        Iterator<ccj> it2 = this.f8274c.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.f8274c.clear();
    }

    /* JADX INFO: renamed from: e */
    public int m8355e() {
        return this.f8276e;
    }

    /* JADX INFO: renamed from: f */
    public int m8356f() {
        return this.f8275d;
    }

    /* JADX INFO: renamed from: h */
    public void m8357h() {
        ccj ccjVar;
        if (m8350g()) {
            for (int i = 0; i < this.f8273b.size(); i++) {
                synchronized (this) {
                    ccjVar = this.f8273b.get(i);
                }
                ccjVar.onDrawFrame();
            }
        }
        synchronized (this.f8274c) {
            try {
                Iterator<ccj> it = this.f8274c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f8274c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m8358i() {
        this.f8272a = false;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m8359j(ccj ccjVar) {
        this.f8273b.remove(ccjVar);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m8360k() {
        if (this.f8273b.size() != 0) {
            this.f8272a = true;
        }
    }
}
