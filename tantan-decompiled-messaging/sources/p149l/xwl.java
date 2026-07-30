package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public abstract class xwl<T> {

    /* JADX INFO: renamed from: a */
    public HashMap<String, xod0<T>> f194743a = new HashMap<>();

    /* JADX INFO: renamed from: l.xwl$a */
    public class C21249a extends xod0<T> {
        public C21249a(String str, grl grlVar, long j, long j2, int i) {
            super(str, grlVar, j, j2, i);
        }

        @Override // p149l.xod0
        /* JADX INFO: renamed from: i */
        public T mo210412i() {
            return (T) xwl.this.mo81139f();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo81135b(String str) {
        xod0<T> xod0VarRemove;
        if (mo135923g() && (xod0VarRemove = this.f194743a.remove(str)) != null) {
            xod0VarRemove.m210416m();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo81136c();

    /* JADX INFO: renamed from: d */
    public abstract int mo81137d();

    /* JADX INFO: renamed from: e */
    public abstract long mo81138e();

    /* JADX INFO: renamed from: f */
    public abstract T mo81139f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo135923g();

    /* JADX INFO: renamed from: h */
    public void mo81140h(String str, grl<T> grlVar) {
        if (mo135923g() && this.f194743a.get(str) == null) {
            C21249a c21249a = new C21249a(str, grlVar, mo81138e(), mo81136c(), mo81137d());
            this.f194743a.put(str, c21249a);
            c21249a.m210415l();
        }
    }
}
