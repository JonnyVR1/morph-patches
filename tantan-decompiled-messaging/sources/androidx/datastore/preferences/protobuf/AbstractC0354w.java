package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.epj0;
import p149l.ipj0;
import p149l.nm80;
import p149l.u9r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354w {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0354w f1753a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0354w f1754b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static final class b extends AbstractC0354w {

        /* JADX INFO: renamed from: c */
        public static final Class<?> f1755c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> List<E> m2371f(Object obj, long j) {
            return (List) ipj0.m137494E(obj, j);
        }

        /* JADX INFO: renamed from: g */
        public static <L> List<L> m2372g(Object obj, long j, int i) {
            List<L> listMo2014d;
            List<L> listM2371f = m2371f(obj, j);
            if (listM2371f.isEmpty()) {
                if (listM2371f instanceof u9r) {
                    listMo2014d = new C0353v(i);
                } else {
                    listMo2014d = ((listM2371f instanceof nm80) && (listM2371f instanceof C0350s.i)) ? ((C0350s.i) listM2371f).mo2014d(i) : new ArrayList<>(i);
                }
                ipj0.m137509T(obj, j, listMo2014d);
                return listMo2014d;
            }
            if (f1755c.isAssignableFrom(listM2371f.getClass())) {
                ArrayList arrayList = new ArrayList(listM2371f.size() + i);
                arrayList.addAll(listM2371f);
                ipj0.m137509T(obj, j, arrayList);
                return arrayList;
            }
            if (listM2371f instanceof epj0) {
                C0353v c0353v = new C0353v(listM2371f.size() + i);
                c0353v.addAll((epj0) listM2371f);
                ipj0.m137509T(obj, j, c0353v);
                return c0353v;
            }
            if ((listM2371f instanceof nm80) && (listM2371f instanceof C0350s.i)) {
                C0350s.i iVar = (C0350s.i) listM2371f;
                if (!iVar.mo1820q()) {
                    C0350s.i iVarMo2014d = iVar.mo2014d(listM2371f.size() + i);
                    ipj0.m137509T(obj, j, iVarMo2014d);
                    return iVarMo2014d;
                }
            }
            return listM2371f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: c */
        public void mo2368c(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) ipj0.m137494E(obj, j);
            if (list instanceof u9r) {
                objUnmodifiableList = ((u9r) list).mo2364m();
            } else {
                if (f1755c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof nm80) && (list instanceof C0350s.i)) {
                    C0350s.i iVar = (C0350s.i) list;
                    if (iVar.mo1820q()) {
                        iVar.mo1819n();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            ipj0.m137509T(obj, j, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: d */
        public <E> void mo2369d(Object obj, Object obj2, long j) {
            List listM2371f = m2371f(obj2, j);
            List listM2372g = m2372g(obj, j, listM2371f.size());
            int size = listM2372g.size();
            int size2 = listM2371f.size();
            if (size > 0 && size2 > 0) {
                listM2372g.addAll(listM2371f);
            }
            if (size > 0) {
                listM2371f = listM2372g;
            }
            ipj0.m137509T(obj, j, listM2371f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo2370e(Object obj, long j) {
            return m2372g(obj, j, 10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static final class c extends AbstractC0354w {
        public c() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> C0350s.i<E> m2373f(Object obj, long j) {
            return (C0350s.i) ipj0.m137494E(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: c */
        public void mo2368c(Object obj, long j) {
            m2373f(obj, j).mo1819n();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: d */
        public <E> void mo2369d(Object obj, Object obj2, long j) {
            C0350s.i iVarM2373f = m2373f(obj, j);
            C0350s.i iVarM2373f2 = m2373f(obj2, j);
            int size = iVarM2373f.size();
            int size2 = iVarM2373f2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarM2373f.mo1820q()) {
                    iVarM2373f = iVarM2373f.mo2014d(size2 + size);
                }
                iVarM2373f.addAll(iVarM2373f2);
            }
            if (size > 0) {
                iVarM2373f2 = iVarM2373f;
            }
            ipj0.m137509T(obj, j, iVarM2373f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0354w
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo2370e(Object obj, long j) {
            C0350s.i iVarM2373f = m2373f(obj, j);
            if (iVarM2373f.mo1820q()) {
                return iVarM2373f;
            }
            int size = iVarM2373f.size();
            C0350s.i iVarMo2014d = iVarM2373f.mo2014d(size == 0 ? 10 : size * 2);
            ipj0.m137509T(obj, j, iVarMo2014d);
            return iVarMo2014d;
        }
    }

    static {
        f1753a = new b();
        f1754b = new c();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0354w m2366a() {
        return f1753a;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0354w m2367b() {
        return f1754b;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2368c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract <L> void mo2369d(Object obj, Object obj2, long j);

    /* JADX INFO: renamed from: e */
    public abstract <L> List<L> mo2370e(Object obj, long j);

    public AbstractC0354w() {
    }
}
