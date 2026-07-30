package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.xa80;

/* JADX INFO: loaded from: classes.dex */
class xnk<K extends xa80, V> {

    /* JADX INFO: renamed from: a */
    private final C21182a<K, V> f193700a = new C21182a<>();

    /* JADX INFO: renamed from: b */
    private final Map<K, C21182a<K, V>> f193701b = new HashMap();

    /* JADX INFO: renamed from: b */
    private void m210173b(C21182a<K, V> c21182a) {
        m210175e(c21182a);
        C21182a<K, V> c21182a2 = this.f193700a;
        c21182a.f193705d = c21182a2;
        c21182a.f193704c = c21182a2.f193704c;
        m210176g(c21182a);
    }

    /* JADX INFO: renamed from: c */
    private void m210174c(C21182a<K, V> c21182a) {
        m210175e(c21182a);
        C21182a<K, V> c21182a2 = this.f193700a;
        c21182a.f193705d = c21182a2.f193705d;
        c21182a.f193704c = c21182a2;
        m210176g(c21182a);
    }

    /* JADX INFO: renamed from: e */
    private static <K, V> void m210175e(C21182a<K, V> c21182a) {
        C21182a<K, V> c21182a2 = c21182a.f193705d;
        c21182a2.f193704c = c21182a.f193704c;
        c21182a.f193704c.f193705d = c21182a2;
    }

    /* JADX INFO: renamed from: g */
    private static <K, V> void m210176g(C21182a<K, V> c21182a) {
        c21182a.f193704c.f193705d = c21182a;
        c21182a.f193705d.f193704c = c21182a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V m210177a(K k) {
        C21182a<K, V> c21182a = this.f193701b.get(k);
        if (c21182a == null) {
            c21182a = new C21182a<>(k);
            this.f193701b.put(k, c21182a);
        } else {
            k.mo188636a();
        }
        m210173b(c21182a);
        return c21182a.m210181b();
    }

    /* JADX INFO: renamed from: d */
    public void m210178d(K k, V v2) {
        C21182a<K, V> c21182a = this.f193701b.get(k);
        if (c21182a == null) {
            c21182a = new C21182a<>(k);
            m210174c(c21182a);
            this.f193701b.put(k, c21182a);
        } else {
            k.mo188636a();
        }
        c21182a.m210180a(v2);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public V m210179f() {
        for (C21182a c21182a = this.f193700a.f193705d; !c21182a.equals(this.f193700a); c21182a = c21182a.f193705d) {
            V v2 = (V) c21182a.m210181b();
            if (v2 != null) {
                return v2;
            }
            m210175e(c21182a);
            this.f193701b.remove(c21182a.f193702a);
            ((xa80) c21182a.f193702a).mo188636a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C21182a c21182a = this.f193700a.f193704c;
        boolean z = false;
        while (!c21182a.equals(this.f193700a)) {
            sb.append('{');
            sb.append(c21182a.f193702a);
            sb.append(':');
            sb.append(c21182a.m210182c());
            sb.append("}, ");
            c21182a = c21182a.f193704c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.xnk$a */
    public static class C21182a<K, V> {

        /* JADX INFO: renamed from: a */
        final K f193702a;

        /* JADX INFO: renamed from: b */
        private List<V> f193703b;

        /* JADX INFO: renamed from: c */
        C21182a<K, V> f193704c;

        /* JADX INFO: renamed from: d */
        C21182a<K, V> f193705d;

        public C21182a(K k) {
            this.f193705d = this;
            this.f193704c = this;
            this.f193702a = k;
        }

        /* JADX INFO: renamed from: a */
        public void m210180a(V v2) {
            if (this.f193703b == null) {
                this.f193703b = new ArrayList();
            }
            this.f193703b.add(v2);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public V m210181b() {
            int iM210182c = m210182c();
            if (iM210182c > 0) {
                return this.f193703b.remove(iM210182c - 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public int m210182c() {
            List<V> list = this.f193703b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C21182a() {
            this(null);
        }
    }
}
