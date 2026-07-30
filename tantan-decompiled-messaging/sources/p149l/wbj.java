package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class wbj {

    /* JADX INFO: renamed from: d */
    private int f185582d;

    /* JADX INFO: renamed from: e */
    private int f185583e;

    /* JADX INFO: renamed from: a */
    private boolean f185579a = false;

    /* JADX INFO: renamed from: c */
    private List<dcj> f185581c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<dcj> f185580b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private synchronized boolean m202536e() {
        return this.f185579a;
    }

    /* JADX INFO: renamed from: a */
    public void m202537a(dcj dcjVar) {
        synchronized (this.f185581c) {
            this.f185581c.add(dcjVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m202538b(dcj dcjVar) {
        this.f185580b.add(dcjVar);
    }

    /* JADX INFO: renamed from: c */
    public void m202539c(int i, int i2) {
        this.f185582d = i;
        this.f185583e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m202540d() {
        Iterator<dcj> it = this.f185580b.iterator();
        while (it.hasNext()) {
            it.next().mo102038f();
        }
        this.f185580b.clear();
        Iterator<dcj> it2 = this.f185581c.iterator();
        while (it2.hasNext()) {
            it2.next().mo102038f();
        }
        this.f185581c.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m202541f() {
        dcj dcjVar;
        if (m202536e()) {
            for (int i = 0; i < this.f185580b.size(); i++) {
                synchronized (this) {
                    dcjVar = this.f185580b.get(i);
                }
                dcjVar.mo110709v();
            }
        }
        synchronized (this.f185581c) {
            try {
                Iterator<dcj> it = this.f185581c.iterator();
                while (it.hasNext()) {
                    it.next().mo102038f();
                }
                this.f185581c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m202542g(dcj dcjVar) {
        this.f185580b.remove(dcjVar);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m202543h() {
        if (this.f185580b.size() != 0) {
            this.f185579a = true;
        }
    }
}
