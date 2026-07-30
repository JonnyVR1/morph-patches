package p002l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.opw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ai2 extends vul {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<uul> f7640a = new CopyOnWriteArrayList<>();

    @Override // p002l.vul
    /* JADX INFO: renamed from: a */
    public void mo9786a(final Throwable th) {
        opw.a(new Runnable() { // from class: l.xh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f22281a.m9792k(th);
            }
        });
    }

    @Override // p002l.vul
    /* JADX INFO: renamed from: b */
    public void mo9787b(final int i, final int i2, final tul tulVar) {
        opw.a(new Runnable() { // from class: l.zh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f23420a.m9793l(i, i2, tulVar);
            }
        });
    }

    @Override // p002l.vul
    /* JADX INFO: renamed from: c */
    public void mo9788c(final int i, final String str) {
        opw.a(new Runnable() { // from class: l.yh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f22883a.m9794m(i, str);
            }
        });
    }

    @Override // p002l.vul
    /* JADX INFO: renamed from: d */
    public void mo9789d(final boolean z) {
        opw.a(new Runnable() { // from class: l.wh2
            @Override // java.lang.Runnable
            public final void run() {
                this.f21764a.m9795n(z);
            }
        });
    }

    @Override // p002l.vul
    /* JADX INFO: renamed from: e */
    public void mo9790e() {
        this.f7640a.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m9791j(uul uulVar) {
        this.f7640a.add(uulVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9792k(Throwable th) {
        Iterator<uul> it = this.f7640a.iterator();
        while (it.hasNext()) {
            it.next().mo23641c(th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9793l(int i, int i2, tul tulVar) {
        Iterator<uul> it = this.f7640a.iterator();
        while (it.hasNext()) {
            it.next().mo23642d(i, i2, tulVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9794m(int i, String str) {
        Iterator<uul> it = this.f7640a.iterator();
        while (it.hasNext()) {
            it.next().mo23639a(i, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9795n(boolean z) {
        Iterator<uul> it = this.f7640a.iterator();
        while (it.hasNext()) {
            it.next().mo23640b(z);
        }
    }
}
