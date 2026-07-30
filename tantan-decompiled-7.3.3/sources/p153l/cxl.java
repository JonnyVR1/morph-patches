package p153l;

import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class cxl<T> {

    /* JADX INFO: renamed from: b */
    public C22508b<T> f84254b;

    /* JADX INFO: renamed from: c */
    public qcj<T, Boolean> f84255c;

    /* JADX INFO: renamed from: a */
    public List<T> f84253a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<T> f84256d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m113044a(qcj<T, Boolean> qcjVar) {
        this.f84255c = qcjVar;
    }

    /* JADX INFO: renamed from: b */
    public List<T> m113045b() {
        if (this.f84256d != null) {
            ArrayList arrayList = new ArrayList(this.f84256d);
            this.f84256d.clear();
            this.f84256d = null;
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.f84253a);
        this.f84253a.clear();
        arrayList2.size();
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public void m113046c(T t) {
        List<T> list = this.f84256d;
        if (list != null && list.size() == 0) {
            this.f84256d.add(t);
            return;
        }
        qcj<T, Boolean> qcjVar = this.f84255c;
        if (qcjVar == null || qcjVar.call(t).booleanValue()) {
            this.f84253a.add(t);
        }
        C22508b<T> c22508b = this.f84254b;
        if (c22508b != null) {
            c22508b.onNext(t);
        }
    }

    /* JADX INFO: renamed from: d */
    public C22421c<T> m113047d() {
        if (this.f84254b == null) {
            this.f84254b = C22508b.m222767b();
        }
        return this.f84254b;
    }

    /* JADX INFO: renamed from: e */
    public void m113048e() {
        this.f84255c = null;
    }
}
