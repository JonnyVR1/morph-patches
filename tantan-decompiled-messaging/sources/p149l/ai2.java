package p149l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ai2 extends vul {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<uul> f69950a = new CopyOnWriteArrayList<>();

    @Override // p149l.vul
    /* JADX INFO: renamed from: a */
    public void mo96775a(final Throwable th) {
        opw.m165383a(new Runnable() { // from class: l.xh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f192853a.m96781k(th);
            }
        });
    }

    @Override // p149l.vul
    /* JADX INFO: renamed from: b */
    public void mo96776b(final int i, final int i2, final tul tulVar) {
        opw.m165383a(new Runnable() { // from class: l.zh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f203123a.m96782l(i, i2, tulVar);
            }
        });
    }

    @Override // p149l.vul
    /* JADX INFO: renamed from: c */
    public void mo96777c(final int i, final String str) {
        opw.m165383a(new Runnable() { // from class: l.yh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f198265a.m96783m(i, str);
            }
        });
    }

    @Override // p149l.vul
    /* JADX INFO: renamed from: d */
    public void mo96778d(final boolean z) {
        opw.m165383a(new Runnable() { // from class: l.wh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f186354a.m96784n(z);
            }
        });
    }

    @Override // p149l.vul
    /* JADX INFO: renamed from: e */
    public void mo96779e() {
        this.f69950a.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m96780j(uul uulVar) {
        this.f69950a.add(uulVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m96781k(Throwable th) {
        Iterator<uul> it = this.f69950a.iterator();
        while (it.hasNext()) {
            it.next().mo195379c(th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m96782l(int i, int i2, tul tulVar) {
        Iterator<uul> it = this.f69950a.iterator();
        while (it.hasNext()) {
            it.next().mo195380d(i, i2, tulVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m96783m(int i, String str) {
        Iterator<uul> it = this.f69950a.iterator();
        while (it.hasNext()) {
            it.next().mo195377a(i, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m96784n(boolean z) {
        Iterator<uul> it = this.f69950a.iterator();
        while (it.hasNext()) {
            it.next().mo195378b(z);
        }
    }
}
