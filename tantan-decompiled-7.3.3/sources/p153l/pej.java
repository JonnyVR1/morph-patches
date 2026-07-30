package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pej {

    /* JADX INFO: renamed from: d */
    private int f152092d;

    /* JADX INFO: renamed from: e */
    private int f152093e;

    /* JADX INFO: renamed from: a */
    private boolean f152089a = false;

    /* JADX INFO: renamed from: c */
    private List<wej> f152091c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<wej> f152090b = new ArrayList();

    /* JADX INFO: renamed from: g */
    private synchronized boolean m172017g() {
        return this.f152089a;
    }

    /* JADX INFO: renamed from: a */
    public void m172018a(wej wejVar) {
        synchronized (this.f152091c) {
            this.f152091c.add(wejVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m172019b(wej wejVar) {
        this.f152090b.add(wejVar);
    }

    /* JADX INFO: renamed from: c */
    public void m172020c(int i, int i2) {
        this.f152092d = i;
        this.f152093e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m172021d() {
        Iterator<wej> it = this.f152090b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f152090b.clear();
        Iterator<wej> it2 = this.f152091c.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.f152091c.clear();
    }

    /* JADX INFO: renamed from: e */
    public int m172022e() {
        return this.f152093e;
    }

    /* JADX INFO: renamed from: f */
    public int m172023f() {
        return this.f152092d;
    }

    /* JADX INFO: renamed from: h */
    public void m172024h() {
        wej wejVar;
        if (m172017g()) {
            for (int i = 0; i < this.f152090b.size(); i++) {
                synchronized (this) {
                    wejVar = this.f152090b.get(i);
                }
                wejVar.onDrawFrame();
            }
        }
        synchronized (this.f152091c) {
            try {
                Iterator<wej> it = this.f152091c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f152091c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m172025i() {
        this.f152089a = false;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m172026j(wej wejVar) {
        this.f152090b.remove(wejVar);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m172027k() {
        if (this.f152090b.size() != 0) {
            this.f152089a = true;
        }
    }
}
