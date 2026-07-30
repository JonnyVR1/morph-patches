package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: renamed from: l.u7 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC20367u7<T> {

    /* JADX INFO: renamed from: a */
    public int f174900a;

    /* JADX INFO: renamed from: b */
    public T f174901b;

    /* JADX INFO: renamed from: c */
    public boolean f174902c;

    /* JADX INFO: renamed from: d */
    public List<p0m<T>> f174903d = new ArrayList();

    /* JADX INFO: renamed from: c */
    public void mo95544c() {
        this.f174900a = 0;
        this.f174901b = null;
    }

    /* JADX INFO: renamed from: d */
    public void m192033d() {
        this.f174902c = true;
        mo95544c();
        this.f174903d.clear();
    }

    /* JADX INFO: renamed from: e */
    public T m192034e() {
        return this.f174901b;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo95545f() {
        return this.f174901b != null;
    }

    /* JADX INFO: renamed from: h */
    public abstract C22306c<T> mo95546h();

    /* JADX INFO: renamed from: i */
    public void m192036i(p0m<T> p0mVar) {
        this.f174903d.add(p0mVar);
        if (mo95545f()) {
            p0mVar.mo145143a(m192034e());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m192037j() {
        mo95546h().subscribe(mkd0.m154956H(new e30() { // from class: l.s7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162875a.m192035g(obj);
            }
        }, new e30() { // from class: l.t7
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m192035g(T t) {
        if (this.f174902c) {
            return;
        }
        this.f174900a++;
        this.f174901b = t;
        if (this.f174903d.isEmpty()) {
            return;
        }
        Iterator<p0m<T>> it = this.f174903d.iterator();
        while (it.hasNext()) {
            it.next().mo145143a(this.f174901b);
        }
    }
}
