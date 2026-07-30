package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: renamed from: l.p7 */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC19310p7<T> {

    /* JADX INFO: renamed from: a */
    public int f150890a;

    /* JADX INFO: renamed from: b */
    public T f150891b;

    /* JADX INFO: renamed from: c */
    public boolean f150892c;

    /* JADX INFO: renamed from: d */
    public List<j3m<T>> f150893d = new ArrayList();

    /* JADX INFO: renamed from: c */
    public void mo167402c() {
        this.f150890a = 0;
        this.f150891b = null;
    }

    /* JADX INFO: renamed from: d */
    public void m171088d() {
        this.f150892c = true;
        mo167402c();
        this.f150893d.clear();
    }

    /* JADX INFO: renamed from: e */
    public T m171089e() {
        return this.f150891b;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo167403f() {
        return this.f150891b != null;
    }

    /* JADX INFO: renamed from: h */
    public abstract C22421c<T> mo167404h();

    /* JADX INFO: renamed from: i */
    public void m171091i(j3m<T> j3mVar) {
        this.f150893d.add(j3mVar);
        if (mo167403f()) {
            j3mVar.mo143360a(m171089e());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m171092j() {
        mo167404h().subscribe(psd0.m173597H(new y20() { // from class: l.n7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140566a.m171090g(obj);
            }
        }, new y20() { // from class: l.o7
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m171090g(T t) {
        if (this.f150892c) {
            return;
        }
        this.f150890a++;
        this.f150891b = t;
        if (this.f150893d.isEmpty()) {
            return;
        }
        Iterator<j3m<T>> it = this.f150893d.iterator();
        while (it.hasNext()) {
            it.next().mo143360a(this.f150891b);
        }
    }
}
