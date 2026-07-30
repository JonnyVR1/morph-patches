package p153l;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class rgw implements o01 {

    /* JADX INFO: renamed from: a */
    private final nqk<C19844a, Object> f163052a;

    /* JADX INFO: renamed from: b */
    private final C19845b f163053b;

    /* JADX INFO: renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f163054c;

    /* JADX INFO: renamed from: d */
    private final Map<Class<?>, b01<?>> f163055d;

    /* JADX INFO: renamed from: e */
    private final int f163056e;

    /* JADX INFO: renamed from: f */
    private int f163057f;

    /* JADX INFO: renamed from: l.rgw$a */
    public static final class C19844a implements dj80 {

        /* JADX INFO: renamed from: a */
        private final C19845b f163058a;

        /* JADX INFO: renamed from: b */
        int f163059b;

        /* JADX INFO: renamed from: c */
        private Class<?> f163060c;

        public C19844a(C19845b c19845b) {
            this.f163058a = c19845b;
        }

        @Override // p153l.dj80
        /* JADX INFO: renamed from: a */
        public void mo116071a() {
            this.f163058a.m173001c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m181504b(int i, Class<?> cls) {
            this.f163059b = i;
            this.f163060c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C19844a) {
                C19844a c19844a = (C19844a) obj;
                if (this.f163059b == c19844a.f163059b && this.f163060c == c19844a.f163060c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f163059b * 31;
            Class<?> cls = this.f163060c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f163059b + "array=" + this.f163060c + '}';
        }
    }

    /* JADX INFO: renamed from: l.rgw$b */
    public static final class C19845b extends pn2<C19844a> {
        @Override // p153l.pn2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C19844a mo131794a() {
            return new C19844a(this);
        }

        /* JADX INFO: renamed from: e */
        public C19844a m181506e(int i, Class<?> cls) {
            C19844a c19844aM173000b = m173000b();
            c19844aM173000b.m181504b(i, cls);
            return c19844aM173000b;
        }
    }

    @VisibleForTesting
    public rgw() {
        this.f163052a = new nqk<>();
        this.f163053b = new C19845b();
        this.f163054c = new HashMap();
        this.f163055d = new HashMap();
        this.f163056e = 4194304;
    }

    /* JADX INFO: renamed from: e */
    private void m181493e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM181500l = m181500l(cls);
        Integer num = navigableMapM181500l.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM181500l.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM181500l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: f */
    private void m181494f() {
        m181495g(this.f163056e);
    }

    /* JADX INFO: renamed from: g */
    private void m181495g(int i) {
        while (this.f163057f > i) {
            Object objM164329f = this.f163052a.m164329f();
            vn80.m201944d(objM164329f);
            b01 b01VarM181496h = m181496h(objM164329f);
            this.f163057f -= b01VarM181496h.mo101238a(objM164329f) * b01VarM181496h.mo101239b();
            m181493e(b01VarM181496h.mo101238a(objM164329f), objM164329f.getClass());
            if (Log.isLoggable(b01VarM181496h.getTag(), 2)) {
                b01VarM181496h.getTag();
                b01VarM181496h.mo101238a(objM164329f);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private <T> b01<T> m181496h(T t) {
        return m181497i(t.getClass());
    }

    /* JADX INFO: renamed from: i */
    private <T> b01<T> m181497i(Class<T> cls) {
        b01<T> tq3Var;
        b01<T> b01Var = (b01) this.f163055d.get(cls);
        if (b01Var != null) {
            return b01Var;
        }
        if (cls.equals(int[].class)) {
            tq3Var = new pym();
        } else {
            if (!cls.equals(byte[].class)) {
                wg3.m206174a("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            tq3Var = new tq3();
        }
        this.f163055d.put(cls, tq3Var);
        return tq3Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    private <T> T m181498j(C19844a c19844a) {
        return (T) this.f163052a.m164327a(c19844a);
    }

    /* JADX INFO: renamed from: k */
    private <T> T m181499k(C19844a c19844a, Class<T> cls) {
        b01<T> b01VarM181497i = m181497i(cls);
        T t = (T) m181498j(c19844a);
        if (t != null) {
            this.f163057f -= b01VarM181497i.mo101238a(t) * b01VarM181497i.mo101239b();
            m181493e(b01VarM181497i.mo101238a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(b01VarM181497i.getTag(), 2)) {
            b01VarM181497i.getTag();
            int i = c19844a.f163059b;
        }
        return b01VarM181497i.newArray(c19844a.f163059b);
    }

    /* JADX INFO: renamed from: l */
    private NavigableMap<Integer, Integer> m181500l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f163054c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f163054c.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    private boolean m181501m() {
        int i = this.f163057f;
        return i == 0 || this.f163056e / i >= 2;
    }

    /* JADX INFO: renamed from: n */
    private boolean m181502n(int i) {
        return i <= this.f163056e / 2;
    }

    /* JADX INFO: renamed from: o */
    private boolean m181503o(int i, Integer num) {
        if (num != null) {
            return m181501m() || num.intValue() <= i * 8;
        }
        return false;
    }

    @Override // p153l.o01
    /* JADX INFO: renamed from: a */
    public synchronized void mo165409a(int i) {
        try {
            if (i >= 40) {
                mo165410b();
            } else if (i >= 20 || i == 15) {
                m181495g(this.f163056e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.o01
    /* JADX INFO: renamed from: b */
    public synchronized void mo165410b() {
        m181495g(0);
    }

    @Override // p153l.o01
    /* JADX INFO: renamed from: c */
    public synchronized <T> T mo165411c(int i, Class<T> cls) {
        Integer numCeilingKey;
        boolean zM181503o;
        C19845b c19845b;
        try {
            numCeilingKey = m181500l(cls).ceilingKey(Integer.valueOf(i));
            zM181503o = m181503o(i, numCeilingKey);
            c19845b = this.f163053b;
        } catch (Throwable th) {
            throw th;
        }
        return (T) m181499k(zM181503o ? c19845b.m181506e(numCeilingKey.intValue(), cls) : c19845b.m181506e(i, cls), cls);
    }

    @Override // p153l.o01
    /* JADX INFO: renamed from: d */
    public synchronized <T> T mo165412d(int i, Class<T> cls) {
        return (T) m181499k(this.f163053b.m181506e(i, cls), cls);
    }

    @Override // p153l.o01
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        b01<T> b01VarM181497i = m181497i(cls);
        int iMo101238a = b01VarM181497i.mo101238a(t);
        int iMo101239b = b01VarM181497i.mo101239b() * iMo101238a;
        if (m181502n(iMo101239b)) {
            C19844a c19844aM181506e = this.f163053b.m181506e(iMo101238a, cls);
            this.f163052a.m164328d(c19844aM181506e, t);
            NavigableMap<Integer, Integer> navigableMapM181500l = m181500l(cls);
            Integer num = navigableMapM181500l.get(Integer.valueOf(c19844aM181506e.f163059b));
            Integer numValueOf = Integer.valueOf(c19844aM181506e.f163059b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM181500l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f163057f += iMo101239b;
            m181494f();
        }
    }

    public rgw(int i) {
        this.f163052a = new nqk<>();
        this.f163053b = new C19845b();
        this.f163054c = new HashMap();
        this.f163055d = new HashMap();
        this.f163056e = i;
    }
}
