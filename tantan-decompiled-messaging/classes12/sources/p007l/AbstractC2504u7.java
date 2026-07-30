package p007l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.mkd0;
import rx.c;

/* JADX INFO: renamed from: l.u7 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class AbstractC2504u7<T> {

    /* JADX INFO: renamed from: a */
    public int f13569a;

    /* JADX INFO: renamed from: b */
    public T f13570b;

    /* JADX INFO: renamed from: c */
    public boolean f13571c;

    /* JADX INFO: renamed from: d */
    public List<p0m<T>> f13572d = new ArrayList();

    /* JADX INFO: renamed from: c */
    public void mo8473c() {
        this.f13569a = 0;
        this.f13570b = null;
    }

    /* JADX INFO: renamed from: d */
    public void m14777d() {
        this.f13571c = true;
        mo8473c();
        this.f13572d.clear();
    }

    /* JADX INFO: renamed from: e */
    public T m14778e() {
        return this.f13570b;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo8474f() {
        return this.f13570b != null;
    }

    /* JADX INFO: renamed from: h */
    public abstract c<T> mo8475h();

    /* JADX INFO: renamed from: i */
    public void m14780i(p0m<T> p0mVar) {
        this.f13572d.add(p0mVar);
        if (mo8474f()) {
            p0mVar.mo11399a(m14778e());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m14781j() {
        mo8475h().subscribe(mkd0.H(new e30() { // from class: l.s7
            public final void call(Object obj) {
                this.f12812a.m14779g(obj);
            }
        }, new e30() { // from class: l.t7
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m14779g(T t) {
        if (this.f13571c) {
            return;
        }
        this.f13569a++;
        this.f13570b = t;
        if (this.f13572d.isEmpty()) {
            return;
        }
        Iterator<p0m<T>> it = this.f13572d.iterator();
        while (it.hasNext()) {
            it.next().mo11399a(this.f13570b);
        }
    }
}
