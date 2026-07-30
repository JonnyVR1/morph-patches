package p002l;

import java.util.ArrayList;
import java.util.List;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pul<T> {

    /* JADX INFO: renamed from: b */
    public b<T> f17659b;

    /* JADX INFO: renamed from: c */
    public w9j<T, Boolean> f17660c;

    /* JADX INFO: renamed from: a */
    public List<T> f17658a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<T> f17661d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m20684a(w9j<T, Boolean> w9jVar) {
        this.f17660c = w9jVar;
    }

    /* JADX INFO: renamed from: b */
    public List<T> m20685b() {
        if (this.f17661d != null) {
            ArrayList arrayList = new ArrayList(this.f17661d);
            this.f17661d.clear();
            this.f17661d = null;
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.f17658a);
        this.f17658a.clear();
        arrayList2.size();
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public void m20686c(T t) {
        List<T> list = this.f17661d;
        if (list != null && list.size() == 0) {
            this.f17661d.add(t);
            return;
        }
        w9j<T, Boolean> w9jVar = this.f17660c;
        if (w9jVar == null || ((Boolean) w9jVar.call(t)).booleanValue()) {
            this.f17658a.add(t);
        }
        b<T> bVar = this.f17659b;
        if (bVar != null) {
            bVar.onNext(t);
        }
    }

    /* JADX INFO: renamed from: d */
    public c<T> m20687d() {
        if (this.f17659b == null) {
            this.f17659b = b.b();
        }
        return this.f17659b;
    }

    /* JADX INFO: renamed from: e */
    public void m20688e() {
        this.f17660c = null;
    }
}
