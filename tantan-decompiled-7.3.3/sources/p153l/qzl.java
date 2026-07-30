package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qzl<T> {

    /* JADX INFO: renamed from: a */
    public HashMap<String, zwd0<T>> f160272a = new HashMap<>();

    /* JADX INFO: renamed from: l.qzl$a */
    public class C19697a extends zwd0<T> {
        public C19697a(String str, utl utlVar, long j, long j2, int i) {
            super(str, utlVar, j, j2, i);
        }

        @Override // p153l.zwd0
        /* JADX INFO: renamed from: i */
        public T mo178808i() {
            return (T) qzl.this.mo82322f();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo82318b(String str) {
        zwd0<T> zwd0VarRemove;
        if (mo141313g() && (zwd0VarRemove = this.f160272a.remove(str)) != null) {
            zwd0VarRemove.m221873m();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo82319c();

    /* JADX INFO: renamed from: d */
    public abstract int mo82320d();

    /* JADX INFO: renamed from: e */
    public abstract long mo82321e();

    /* JADX INFO: renamed from: f */
    public abstract T mo82322f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo141313g();

    /* JADX INFO: renamed from: h */
    public void mo82323h(String str, utl<T> utlVar) {
        if (mo141313g() && this.f160272a.get(str) == null) {
            C19697a c19697a = new C19697a(str, utlVar, mo82321e(), mo82319c(), mo82320d());
            this.f160272a.put(str, c19697a);
            c19697a.m221872l();
        }
    }
}
