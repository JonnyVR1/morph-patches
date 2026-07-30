package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.dj80;

/* JADX INFO: loaded from: classes.dex */
class nqk<K extends dj80, V> {

    /* JADX INFO: renamed from: a */
    private final C18927a<K, V> f143237a = new C18927a<>();

    /* JADX INFO: renamed from: b */
    private final Map<K, C18927a<K, V>> f143238b = new HashMap();

    /* JADX INFO: renamed from: b */
    private void m164323b(C18927a<K, V> c18927a) {
        m164325e(c18927a);
        C18927a<K, V> c18927a2 = this.f143237a;
        c18927a.f143242d = c18927a2;
        c18927a.f143241c = c18927a2.f143241c;
        m164326g(c18927a);
    }

    /* JADX INFO: renamed from: c */
    private void m164324c(C18927a<K, V> c18927a) {
        m164325e(c18927a);
        C18927a<K, V> c18927a2 = this.f143237a;
        c18927a.f143242d = c18927a2.f143242d;
        c18927a.f143241c = c18927a2;
        m164326g(c18927a);
    }

    /* JADX INFO: renamed from: e */
    private static <K, V> void m164325e(C18927a<K, V> c18927a) {
        C18927a<K, V> c18927a2 = c18927a.f143242d;
        c18927a2.f143241c = c18927a.f143241c;
        c18927a.f143241c.f143242d = c18927a2;
    }

    /* JADX INFO: renamed from: g */
    private static <K, V> void m164326g(C18927a<K, V> c18927a) {
        c18927a.f143241c.f143242d = c18927a;
        c18927a.f143242d.f143241c = c18927a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V m164327a(K k) {
        C18927a<K, V> c18927a = this.f143238b.get(k);
        if (c18927a == null) {
            c18927a = new C18927a<>(k);
            this.f143238b.put(k, c18927a);
        } else {
            k.mo116071a();
        }
        m164323b(c18927a);
        return c18927a.m164331b();
    }

    /* JADX INFO: renamed from: d */
    public void m164328d(K k, V v2) {
        C18927a<K, V> c18927a = this.f143238b.get(k);
        if (c18927a == null) {
            c18927a = new C18927a<>(k);
            m164324c(c18927a);
            this.f143238b.put(k, c18927a);
        } else {
            k.mo116071a();
        }
        c18927a.m164330a(v2);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public V m164329f() {
        for (C18927a c18927a = this.f143237a.f143242d; !c18927a.equals(this.f143237a); c18927a = c18927a.f143242d) {
            V v2 = (V) c18927a.m164331b();
            if (v2 != null) {
                return v2;
            }
            m164325e(c18927a);
            this.f143238b.remove(c18927a.f143239a);
            ((dj80) c18927a.f143239a).mo116071a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C18927a c18927a = this.f143237a.f143241c;
        boolean z = false;
        while (!c18927a.equals(this.f143237a)) {
            sb.append('{');
            sb.append(c18927a.f143239a);
            sb.append(':');
            sb.append(c18927a.m164332c());
            sb.append("}, ");
            c18927a = c18927a.f143241c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.nqk$a */
    public static class C18927a<K, V> {

        /* JADX INFO: renamed from: a */
        final K f143239a;

        /* JADX INFO: renamed from: b */
        private List<V> f143240b;

        /* JADX INFO: renamed from: c */
        C18927a<K, V> f143241c;

        /* JADX INFO: renamed from: d */
        C18927a<K, V> f143242d;

        public C18927a(K k) {
            this.f143242d = this;
            this.f143241c = this;
            this.f143239a = k;
        }

        /* JADX INFO: renamed from: a */
        public void m164330a(V v2) {
            if (this.f143240b == null) {
                this.f143240b = new ArrayList();
            }
            this.f143240b.add(v2);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public V m164331b() {
            int iM164332c = m164332c();
            if (iM164332c > 0) {
                return this.f143240b.remove(iM164332c - 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public int m164332c() {
            List<V> list = this.f143240b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C18927a() {
            this(null);
        }
    }
}
