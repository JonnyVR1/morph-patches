package p149l;

import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class pul<T> {

    /* JADX INFO: renamed from: b */
    public C22393b<T> f151315b;

    /* JADX INFO: renamed from: c */
    public w9j<T, Boolean> f151316c;

    /* JADX INFO: renamed from: a */
    public List<T> f151314a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<T> f151317d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m171439a(w9j<T, Boolean> w9jVar) {
        this.f151316c = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public List<T> m171440b() {
        if (this.f151317d != null) {
            ArrayList arrayList = new ArrayList(this.f151317d);
            this.f151317d.clear();
            this.f151317d = null;
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.f151314a);
        this.f151314a.clear();
        arrayList2.size();
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public void m171441c(T t) {
        List<T> list = this.f151317d;
        if (list != null && list.size() == 0) {
            this.f151317d.add(t);
            return;
        }
        w9j<T, Boolean> w9jVar = this.f151316c;
        if (w9jVar == null || w9jVar.call(t).booleanValue()) {
            this.f151314a.add(t);
        }
        C22393b<T> c22393b = this.f151315b;
        if (c22393b != null) {
            c22393b.onNext(t);
        }
    }

    /* JADX INFO: renamed from: d */
    public C22306c<T> m171442d() {
        if (this.f151315b == null) {
            this.f151315b = C22393b.m221521b();
        }
        return this.f151315b;
    }

    /* JADX INFO: renamed from: e */
    public void m171443e() {
        this.f151316c = null;
    }
}
