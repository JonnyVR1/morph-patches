package p149l;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class tew implements h01 {

    /* JADX INFO: renamed from: a */
    private final xnk<C20162a, Object> f169919a;

    /* JADX INFO: renamed from: b */
    private final C20163b f169920b;

    /* JADX INFO: renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f169921c;

    /* JADX INFO: renamed from: d */
    private final Map<Class<?>, uz0<?>> f169922d;

    /* JADX INFO: renamed from: e */
    private final int f169923e;

    /* JADX INFO: renamed from: f */
    private int f169924f;

    /* JADX INFO: renamed from: l.tew$a */
    public static final class C20162a implements xa80 {

        /* JADX INFO: renamed from: a */
        private final C20163b f169925a;

        /* JADX INFO: renamed from: b */
        int f169926b;

        /* JADX INFO: renamed from: c */
        private Class<?> f169927c;

        public C20162a(C20163b c20163b) {
            this.f169925a = c20163b;
        }

        @Override // p149l.xa80
        /* JADX INFO: renamed from: a */
        public void mo188636a() {
            this.f169925a.m137122c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m188637b(int i, Class<?> cls) {
            this.f169926b = i;
            this.f169927c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C20162a) {
                C20162a c20162a = (C20162a) obj;
                if (this.f169926b == c20162a.f169926b && this.f169927c == c20162a.f169927c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f169926b * 31;
            Class<?> cls = this.f169927c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f169926b + "array=" + this.f169927c + '}';
        }
    }

    /* JADX INFO: renamed from: l.tew$b */
    public static final class C20163b extends in2<C20162a> {
        @Override // p149l.in2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C20162a mo137120a() {
            return new C20162a(this);
        }

        /* JADX INFO: renamed from: e */
        public C20162a m188639e(int i, Class<?> cls) {
            C20162a c20162aM137121b = m137121b();
            c20162aM137121b.m188637b(i, cls);
            return c20162aM137121b;
        }
    }

    @VisibleForTesting
    public tew() {
        this.f169919a = new xnk<>();
        this.f169920b = new C20163b();
        this.f169921c = new HashMap();
        this.f169922d = new HashMap();
        this.f169923e = 4194304;
    }

    /* JADX INFO: renamed from: e */
    private void m188625e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM188632l = m188632l(cls);
        Integer num = navigableMapM188632l.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM188632l.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM188632l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: f */
    private void m188626f() {
        m188627g(this.f169923e);
    }

    /* JADX INFO: renamed from: g */
    private void m188627g(int i) {
        while (this.f169924f > i) {
            Object objM210179f = this.f169919a.m210179f();
            qf80.m174276d(objM210179f);
            uz0 uz0VarM188628h = m188628h(objM210179f);
            this.f169924f -= uz0VarM188628h.mo166421a(objM210179f) * uz0VarM188628h.mo166422b();
            m188625e(uz0VarM188628h.mo166421a(objM210179f), objM210179f.getClass());
            if (Log.isLoggable(uz0VarM188628h.getTag(), 2)) {
                uz0VarM188628h.getTag();
                uz0VarM188628h.mo166421a(objM210179f);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private <T> uz0<T> m188628h(T t) {
        return m188629i(t.getClass());
    }

    /* JADX INFO: renamed from: i */
    private <T> uz0<T> m188629i(Class<T> cls) {
        uz0<T> tp3Var;
        uz0<T> uz0Var = (uz0) this.f169922d.get(cls);
        if (uz0Var != null) {
            return uz0Var;
        }
        if (cls.equals(int[].class)) {
            tp3Var = new owm();
        } else {
            if (!cls.equals(byte[].class)) {
                ig3.m135964a("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            tp3Var = new tp3();
        }
        this.f169922d.put(cls, tp3Var);
        return tp3Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    private <T> T m188630j(C20162a c20162a) {
        return (T) this.f169919a.m210177a(c20162a);
    }

    /* JADX INFO: renamed from: k */
    private <T> T m188631k(C20162a c20162a, Class<T> cls) {
        uz0<T> uz0VarM188629i = m188629i(cls);
        T t = (T) m188630j(c20162a);
        if (t != null) {
            this.f169924f -= uz0VarM188629i.mo166421a(t) * uz0VarM188629i.mo166422b();
            m188625e(uz0VarM188629i.mo166421a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(uz0VarM188629i.getTag(), 2)) {
            uz0VarM188629i.getTag();
            int i = c20162a.f169926b;
        }
        return uz0VarM188629i.newArray(c20162a.f169926b);
    }

    /* JADX INFO: renamed from: l */
    private NavigableMap<Integer, Integer> m188632l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f169921c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f169921c.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    private boolean m188633m() {
        int i = this.f169924f;
        return i == 0 || this.f169923e / i >= 2;
    }

    /* JADX INFO: renamed from: n */
    private boolean m188634n(int i) {
        return i <= this.f169923e / 2;
    }

    /* JADX INFO: renamed from: o */
    private boolean m188635o(int i, Integer num) {
        if (num != null) {
            return m188633m() || num.intValue() <= i * 8;
        }
        return false;
    }

    @Override // p149l.h01
    /* JADX INFO: renamed from: a */
    public synchronized void mo128940a(int i) {
        try {
            if (i >= 40) {
                mo128941b();
            } else if (i >= 20 || i == 15) {
                m188627g(this.f169923e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.h01
    /* JADX INFO: renamed from: b */
    public synchronized void mo128941b() {
        m188627g(0);
    }

    @Override // p149l.h01
    /* JADX INFO: renamed from: c */
    public synchronized <T> T mo128942c(int i, Class<T> cls) {
        Integer numCeilingKey;
        boolean zM188635o;
        C20163b c20163b;
        try {
            numCeilingKey = m188632l(cls).ceilingKey(Integer.valueOf(i));
            zM188635o = m188635o(i, numCeilingKey);
            c20163b = this.f169920b;
        } catch (Throwable th) {
            throw th;
        }
        return (T) m188631k(zM188635o ? c20163b.m188639e(numCeilingKey.intValue(), cls) : c20163b.m188639e(i, cls), cls);
    }

    @Override // p149l.h01
    /* JADX INFO: renamed from: d */
    public synchronized <T> T mo128943d(int i, Class<T> cls) {
        return (T) m188631k(this.f169920b.m188639e(i, cls), cls);
    }

    @Override // p149l.h01
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        uz0<T> uz0VarM188629i = m188629i(cls);
        int iMo166421a = uz0VarM188629i.mo166421a(t);
        int iMo166422b = uz0VarM188629i.mo166422b() * iMo166421a;
        if (m188634n(iMo166422b)) {
            C20162a c20162aM188639e = this.f169920b.m188639e(iMo166421a, cls);
            this.f169919a.m210178d(c20162aM188639e, t);
            NavigableMap<Integer, Integer> navigableMapM188632l = m188632l(cls);
            Integer num = navigableMapM188632l.get(Integer.valueOf(c20162aM188639e.f169926b));
            Integer numValueOf = Integer.valueOf(c20162aM188639e.f169926b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM188632l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f169924f += iMo166422b;
            m188626f();
        }
    }

    public tew(int i) {
        this.f169919a = new xnk<>();
        this.f169920b = new C20163b();
        this.f169921c = new HashMap();
        this.f169922d = new HashMap();
        this.f169923e = i;
    }
}
