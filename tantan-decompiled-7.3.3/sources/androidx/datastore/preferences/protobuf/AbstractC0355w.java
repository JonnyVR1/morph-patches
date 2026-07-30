package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.hyj0;
import p153l.lyj0;
import p153l.ru80;
import p153l.wbr;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0355w {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0355w f1753a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0355w f1754b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static final class b extends AbstractC0355w {

        /* JADX INFO: renamed from: c */
        public static final Class<?> f1755c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> List<E> m2372f(Object obj, long j) {
            return (List) lyj0.m156299E(obj, j);
        }

        /* JADX INFO: renamed from: g */
        public static <L> List<L> m2373g(Object obj, long j, int i) {
            List<L> listMo2015d;
            List<L> listM2372f = m2372f(obj, j);
            if (listM2372f.isEmpty()) {
                if (listM2372f instanceof wbr) {
                    listMo2015d = new C0354v(i);
                } else {
                    listMo2015d = ((listM2372f instanceof ru80) && (listM2372f instanceof C0351s.i)) ? ((C0351s.i) listM2372f).mo2015d(i) : new ArrayList<>(i);
                }
                lyj0.m156314T(obj, j, listMo2015d);
                return listMo2015d;
            }
            if (f1755c.isAssignableFrom(listM2372f.getClass())) {
                ArrayList arrayList = new ArrayList(listM2372f.size() + i);
                arrayList.addAll(listM2372f);
                lyj0.m156314T(obj, j, arrayList);
                return arrayList;
            }
            if (listM2372f instanceof hyj0) {
                C0354v c0354v = new C0354v(listM2372f.size() + i);
                c0354v.addAll((hyj0) listM2372f);
                lyj0.m156314T(obj, j, c0354v);
                return c0354v;
            }
            if ((listM2372f instanceof ru80) && (listM2372f instanceof C0351s.i)) {
                C0351s.i iVar = (C0351s.i) listM2372f;
                if (!iVar.mo1821q()) {
                    C0351s.i iVarMo2015d = iVar.mo2015d(listM2372f.size() + i);
                    lyj0.m156314T(obj, j, iVarMo2015d);
                    return iVarMo2015d;
                }
            }
            return listM2372f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: c */
        public void mo2369c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) lyj0.m156299E(obj, j);
            if (list instanceof wbr) {
                objUnmodifiableList = ((wbr) list).mo2365m();
            } else {
                if (f1755c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof ru80) && (list instanceof C0351s.i)) {
                    C0351s.i iVar = (C0351s.i) list;
                    if (iVar.mo1821q()) {
                        iVar.mo1820n();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            lyj0.m156314T(obj, j, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: d */
        public <E> void mo2370d(Object obj, Object obj2, long j) {
            List listM2372f = m2372f(obj2, j);
            List listM2373g = m2373g(obj, j, listM2372f.size());
            int size = listM2373g.size();
            int size2 = listM2372f.size();
            if (size > 0 && size2 > 0) {
                listM2373g.addAll(listM2372f);
            }
            if (size > 0) {
                listM2372f = listM2373g;
            }
            lyj0.m156314T(obj, j, listM2372f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo2371e(Object obj, long j) {
            return m2373g(obj, j, 10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static final class c extends AbstractC0355w {
        public c() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> C0351s.i<E> m2374f(Object obj, long j) {
            return (C0351s.i) lyj0.m156299E(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: c */
        public void mo2369c(Object obj, long j) {
            m2374f(obj, j).mo1820n();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: d */
        public <E> void mo2370d(Object obj, Object obj2, long j) {
            C0351s.i iVarM2374f = m2374f(obj, j);
            C0351s.i iVarM2374f2 = m2374f(obj2, j);
            int size = iVarM2374f.size();
            int size2 = iVarM2374f2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarM2374f.mo1821q()) {
                    iVarM2374f = iVarM2374f.mo2015d(size2 + size);
                }
                iVarM2374f.addAll(iVarM2374f2);
            }
            if (size > 0) {
                iVarM2374f2 = iVarM2374f;
            }
            lyj0.m156314T(obj, j, iVarM2374f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0355w
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo2371e(Object obj, long j) {
            C0351s.i iVarM2374f = m2374f(obj, j);
            if (iVarM2374f.mo1821q()) {
                return iVarM2374f;
            }
            int size = iVarM2374f.size();
            C0351s.i iVarMo2015d = iVarM2374f.mo2015d(size == 0 ? 10 : size * 2);
            lyj0.m156314T(obj, j, iVarMo2015d);
            return iVarMo2015d;
        }
    }

    static {
        f1753a = new b();
        f1754b = new c();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0355w m2367a() {
        return f1753a;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0355w m2368b() {
        return f1754b;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2369c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract <L> void mo2370d(Object obj, Object obj2, long j);

    /* JADX INFO: renamed from: e */
    public abstract <L> List<L> mo2371e(Object obj, long j);

    public AbstractC0355w() {
    }
}
