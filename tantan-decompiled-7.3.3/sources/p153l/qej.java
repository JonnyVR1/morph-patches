package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class qej {

    /* JADX INFO: renamed from: d */
    private int f157186d;

    /* JADX INFO: renamed from: e */
    private int f157187e;

    /* JADX INFO: renamed from: a */
    private boolean f157183a = false;

    /* JADX INFO: renamed from: c */
    private List<xej> f157185c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<xej> f157184b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private synchronized boolean m176250e() {
        return this.f157183a;
    }

    /* JADX INFO: renamed from: a */
    public void m176251a(xej xejVar) {
        synchronized (this.f157185c) {
            this.f157185c.add(xejVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m176252b(xej xejVar) {
        this.f157184b.add(xejVar);
    }

    /* JADX INFO: renamed from: c */
    public void m176253c(int i, int i2) {
        this.f157186d = i;
        this.f157187e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m176254d() {
        Iterator<xej> it = this.f157184b.iterator();
        while (it.hasNext()) {
            it.next().mo96080f();
        }
        this.f157184b.clear();
        Iterator<xej> it2 = this.f157185c.iterator();
        while (it2.hasNext()) {
            it2.next().mo96080f();
        }
        this.f157185c.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m176255f() {
        xej xejVar;
        if (m176250e()) {
            for (int i = 0; i < this.f157184b.size(); i++) {
                synchronized (this) {
                    xejVar = this.f157184b.get(i);
                }
                xejVar.mo134345v();
            }
        }
        synchronized (this.f157185c) {
            try {
                Iterator<xej> it = this.f157185c.iterator();
                while (it.hasNext()) {
                    it.next().mo96080f();
                }
                this.f157185c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m176256g(xej xejVar) {
        this.f157184b.remove(xejVar);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m176257h() {
        if (this.f157184b.size() != 0) {
            this.f157183a = true;
        }
    }
}
