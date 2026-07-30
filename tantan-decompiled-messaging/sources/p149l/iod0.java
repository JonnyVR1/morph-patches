package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class iod0<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public C17585c<K, V> f114138a;

    /* JADX INFO: renamed from: b */
    public C17585c<K, V> f114139b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<AbstractC17588f<K, V>, Boolean> f114140c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f114141d = 0;

    /* JADX INFO: renamed from: l.iod0$a */
    public static class C17583a<K, V> extends AbstractC17587e<K, V> {
        public C17583a(C17585c<K, V> c17585c, C17585c<K, V> c17585c2) {
            super(c17585c, c17585c2);
        }

        @Override // p149l.iod0.AbstractC17587e
        /* JADX INFO: renamed from: b */
        public C17585c<K, V> mo137326b(C17585c<K, V> c17585c) {
            return c17585c.f114145d;
        }

        @Override // p149l.iod0.AbstractC17587e
        /* JADX INFO: renamed from: c */
        public C17585c<K, V> mo137327c(C17585c<K, V> c17585c) {
            return c17585c.f114144c;
        }
    }

    /* JADX INFO: renamed from: l.iod0$b */
    public static class C17584b<K, V> extends AbstractC17587e<K, V> {
        public C17584b(C17585c<K, V> c17585c, C17585c<K, V> c17585c2) {
            super(c17585c, c17585c2);
        }

        @Override // p149l.iod0.AbstractC17587e
        /* JADX INFO: renamed from: b */
        public C17585c<K, V> mo137326b(C17585c<K, V> c17585c) {
            return c17585c.f114144c;
        }

        @Override // p149l.iod0.AbstractC17587e
        /* JADX INFO: renamed from: c */
        public C17585c<K, V> mo137327c(C17585c<K, V> c17585c) {
            return c17585c.f114145d;
        }
    }

    /* JADX INFO: renamed from: l.iod0$c */
    public static class C17585c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final K f114142a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final V f114143b;

        /* JADX INFO: renamed from: c */
        public C17585c<K, V> f114144c;

        /* JADX INFO: renamed from: d */
        public C17585c<K, V> f114145d;

        public C17585c(@NonNull K k, @NonNull V v2) {
            this.f114142a = k;
            this.f114143b = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C17585c)) {
                return false;
            }
            C17585c c17585c = (C17585c) obj;
            return this.f114142a.equals(c17585c.f114142a) && this.f114143b.equals(c17585c.f114143b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f114142a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f114143b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f114143b.hashCode() ^ this.f114142a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f114142a + "=" + this.f114143b;
        }
    }

    /* JADX INFO: renamed from: l.iod0$d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class C17586d extends AbstractC17588f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C17585c<K, V> f114146a;

        /* JADX INFO: renamed from: b */
        public boolean f114147b = true;

        public C17586d() {
        }

        @Override // p149l.iod0.AbstractC17588f
        /* JADX INFO: renamed from: a */
        public void mo137328a(@NonNull C17585c<K, V> c17585c) {
            C17585c<K, V> c17585c2 = this.f114146a;
            if (c17585c == c17585c2) {
                C17585c<K, V> c17585c3 = c17585c2.f114145d;
                this.f114146a = c17585c3;
                this.f114147b = c17585c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f114147b) {
                this.f114147b = false;
                this.f114146a = iod0.this.f114138a;
            } else {
                C17585c<K, V> c17585c = this.f114146a;
                this.f114146a = c17585c != null ? c17585c.f114144c : null;
            }
            return this.f114146a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f114147b) {
                return iod0.this.f114138a != null;
            }
            C17585c<K, V> c17585c = this.f114146a;
            return (c17585c == null || c17585c.f114144c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.iod0$e */
    public static abstract class AbstractC17587e<K, V> extends AbstractC17588f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C17585c<K, V> f114149a;

        /* JADX INFO: renamed from: b */
        public C17585c<K, V> f114150b;

        public AbstractC17587e(C17585c<K, V> c17585c, C17585c<K, V> c17585c2) {
            this.f114149a = c17585c2;
            this.f114150b = c17585c;
        }

        @Override // p149l.iod0.AbstractC17588f
        /* JADX INFO: renamed from: a */
        public void mo137328a(@NonNull C17585c<K, V> c17585c) {
            if (this.f114149a == c17585c && c17585c == this.f114150b) {
                this.f114150b = null;
                this.f114149a = null;
            }
            C17585c<K, V> c17585c2 = this.f114149a;
            if (c17585c2 == c17585c) {
                this.f114149a = mo137326b(c17585c2);
            }
            if (this.f114150b == c17585c) {
                this.f114150b = m137331e();
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract C17585c<K, V> mo137326b(C17585c<K, V> c17585c);

        /* JADX INFO: renamed from: c */
        public abstract C17585c<K, V> mo137327c(C17585c<K, V> c17585c);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            C17585c<K, V> c17585c = this.f114150b;
            this.f114150b = m137331e();
            return c17585c;
        }

        /* JADX INFO: renamed from: e */
        public final C17585c<K, V> m137331e() {
            C17585c<K, V> c17585c = this.f114150b;
            C17585c<K, V> c17585c2 = this.f114149a;
            if (c17585c == c17585c2 || c17585c2 == null) {
                return null;
            }
            return mo137327c(c17585c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f114150b != null;
        }
    }

    /* JADX INFO: renamed from: l.iod0$f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class AbstractC17588f<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo137328a(@NonNull C17585c<K, V> c17585c);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Map.Entry<K, V> m137319a() {
        return this.f114138a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public C17585c<K, V> mo137320c(K k) {
        C17585c<K, V> c17585c = this.f114138a;
        while (c17585c != null && !c17585c.f114142a.equals(k)) {
            c17585c = c17585c.f114144c;
        }
        return c17585c;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C17584b c17584b = new C17584b(this.f114139b, this.f114138a);
        this.f114140c.put(c17584b, Boolean.FALSE);
        return c17584b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iod0)) {
            return false;
        }
        iod0 iod0Var = (iod0) obj;
        if (size() != iod0Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = iod0Var.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public iod0<K, V>.C17586d m137321f() {
        iod0<K, V>.C17586d c17586d = new C17586d();
        this.f114140c.put(c17586d, Boolean.FALSE);
        return c17586d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Map.Entry<K, V> m137322g() {
        return this.f114139b;
    }

    /* JADX INFO: renamed from: h */
    public C17585c<K, V> m137323h(@NonNull K k, @NonNull V v2) {
        C17585c<K, V> c17585c = new C17585c<>(k, v2);
        this.f114141d++;
        C17585c<K, V> c17585c2 = this.f114139b;
        if (c17585c2 == null) {
            this.f114138a = c17585c;
            this.f114139b = c17585c;
            return c17585c;
        }
        c17585c2.f114144c = c17585c;
        c17585c.f114145d = c17585c2;
        this.f114139b = c17585c;
        return c17585c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public V mo137324i(@NonNull K k, @NonNull V v2) {
        C17585c<K, V> c17585cMo137320c = mo137320c(k);
        if (c17585cMo137320c != null) {
            return c17585cMo137320c.f114143b;
        }
        m137323h(k, v2);
        return null;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        C17583a c17583a = new C17583a(this.f114138a, this.f114139b);
        this.f114140c.put(c17583a, Boolean.FALSE);
        return c17583a;
    }

    /* JADX INFO: renamed from: j */
    public V mo137325j(@NonNull K k) {
        C17585c<K, V> c17585cMo137320c = mo137320c(k);
        if (c17585cMo137320c == null) {
            return null;
        }
        this.f114141d--;
        if (!this.f114140c.isEmpty()) {
            Iterator<AbstractC17588f<K, V>> it = this.f114140c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo137328a(c17585cMo137320c);
            }
        }
        C17585c<K, V> c17585c = c17585cMo137320c.f114145d;
        C17585c<K, V> c17585c2 = c17585cMo137320c.f114144c;
        if (c17585c != null) {
            c17585c.f114144c = c17585c2;
        } else {
            this.f114138a = c17585c2;
        }
        C17585c<K, V> c17585c3 = c17585cMo137320c.f114144c;
        if (c17585c3 != null) {
            c17585c3.f114145d = c17585c;
        } else {
            this.f114139b = c17585c;
        }
        c17585cMo137320c.f114144c = null;
        c17585cMo137320c.f114145d = null;
        return c17585cMo137320c.f114143b;
    }

    public int size() {
        return this.f114141d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }
}
