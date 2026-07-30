package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class kwd0<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public C18284c<K, V> f129049a;

    /* JADX INFO: renamed from: b */
    public C18284c<K, V> f129050b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<AbstractC18287f<K, V>, Boolean> f129051c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f129052d = 0;

    /* JADX INFO: renamed from: l.kwd0$a */
    public static class C18282a<K, V> extends AbstractC18286e<K, V> {
        public C18282a(C18284c<K, V> c18284c, C18284c<K, V> c18284c2) {
            super(c18284c, c18284c2);
        }

        @Override // p153l.kwd0.AbstractC18286e
        /* JADX INFO: renamed from: b */
        public C18284c<K, V> mo151694b(C18284c<K, V> c18284c) {
            return c18284c.f129056d;
        }

        @Override // p153l.kwd0.AbstractC18286e
        /* JADX INFO: renamed from: c */
        public C18284c<K, V> mo151695c(C18284c<K, V> c18284c) {
            return c18284c.f129055c;
        }
    }

    /* JADX INFO: renamed from: l.kwd0$b */
    public static class C18283b<K, V> extends AbstractC18286e<K, V> {
        public C18283b(C18284c<K, V> c18284c, C18284c<K, V> c18284c2) {
            super(c18284c, c18284c2);
        }

        @Override // p153l.kwd0.AbstractC18286e
        /* JADX INFO: renamed from: b */
        public C18284c<K, V> mo151694b(C18284c<K, V> c18284c) {
            return c18284c.f129055c;
        }

        @Override // p153l.kwd0.AbstractC18286e
        /* JADX INFO: renamed from: c */
        public C18284c<K, V> mo151695c(C18284c<K, V> c18284c) {
            return c18284c.f129056d;
        }
    }

    /* JADX INFO: renamed from: l.kwd0$c */
    public static class C18284c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final K f129053a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final V f129054b;

        /* JADX INFO: renamed from: c */
        public C18284c<K, V> f129055c;

        /* JADX INFO: renamed from: d */
        public C18284c<K, V> f129056d;

        public C18284c(@NonNull K k, @NonNull V v2) {
            this.f129053a = k;
            this.f129054b = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18284c)) {
                return false;
            }
            C18284c c18284c = (C18284c) obj;
            return this.f129053a.equals(c18284c.f129053a) && this.f129054b.equals(c18284c.f129054b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f129053a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f129054b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f129054b.hashCode() ^ this.f129053a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f129053a + "=" + this.f129054b;
        }
    }

    /* JADX INFO: renamed from: l.kwd0$d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class C18285d extends AbstractC18287f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C18284c<K, V> f129057a;

        /* JADX INFO: renamed from: b */
        public boolean f129058b = true;

        public C18285d() {
        }

        @Override // p153l.kwd0.AbstractC18287f
        /* JADX INFO: renamed from: a */
        public void mo151696a(@NonNull C18284c<K, V> c18284c) {
            C18284c<K, V> c18284c2 = this.f129057a;
            if (c18284c == c18284c2) {
                C18284c<K, V> c18284c3 = c18284c2.f129056d;
                this.f129057a = c18284c3;
                this.f129058b = c18284c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f129058b) {
                this.f129058b = false;
                this.f129057a = kwd0.this.f129049a;
            } else {
                C18284c<K, V> c18284c = this.f129057a;
                this.f129057a = c18284c != null ? c18284c.f129055c : null;
            }
            return this.f129057a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f129058b) {
                return kwd0.this.f129049a != null;
            }
            C18284c<K, V> c18284c = this.f129057a;
            return (c18284c == null || c18284c.f129055c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.kwd0$e */
    public static abstract class AbstractC18286e<K, V> extends AbstractC18287f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C18284c<K, V> f129060a;

        /* JADX INFO: renamed from: b */
        public C18284c<K, V> f129061b;

        public AbstractC18286e(C18284c<K, V> c18284c, C18284c<K, V> c18284c2) {
            this.f129060a = c18284c2;
            this.f129061b = c18284c;
        }

        @Override // p153l.kwd0.AbstractC18287f
        /* JADX INFO: renamed from: a */
        public void mo151696a(@NonNull C18284c<K, V> c18284c) {
            if (this.f129060a == c18284c && c18284c == this.f129061b) {
                this.f129061b = null;
                this.f129060a = null;
            }
            C18284c<K, V> c18284c2 = this.f129060a;
            if (c18284c2 == c18284c) {
                this.f129060a = mo151694b(c18284c2);
            }
            if (this.f129061b == c18284c) {
                this.f129061b = m151699e();
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract C18284c<K, V> mo151694b(C18284c<K, V> c18284c);

        /* JADX INFO: renamed from: c */
        public abstract C18284c<K, V> mo151695c(C18284c<K, V> c18284c);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            C18284c<K, V> c18284c = this.f129061b;
            this.f129061b = m151699e();
            return c18284c;
        }

        /* JADX INFO: renamed from: e */
        public final C18284c<K, V> m151699e() {
            C18284c<K, V> c18284c = this.f129061b;
            C18284c<K, V> c18284c2 = this.f129060a;
            if (c18284c == c18284c2 || c18284c2 == null) {
                return null;
            }
            return mo151695c(c18284c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f129061b != null;
        }
    }

    /* JADX INFO: renamed from: l.kwd0$f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class AbstractC18287f<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo151696a(@NonNull C18284c<K, V> c18284c);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Map.Entry<K, V> m151690a() {
        return this.f129049a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public C18284c<K, V> mo110333c(K k) {
        C18284c<K, V> c18284c = this.f129049a;
        while (c18284c != null && !c18284c.f129053a.equals(k)) {
            c18284c = c18284c.f129055c;
        }
        return c18284c;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C18283b c18283b = new C18283b(this.f129050b, this.f129049a);
        this.f129051c.put(c18283b, Boolean.FALSE);
        return c18283b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kwd0)) {
            return false;
        }
        kwd0 kwd0Var = (kwd0) obj;
        if (size() != kwd0Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = kwd0Var.iterator();
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
    public kwd0<K, V>.C18285d m151691f() {
        kwd0<K, V>.C18285d c18285d = new C18285d();
        this.f129051c.put(c18285d, Boolean.FALSE);
        return c18285d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Map.Entry<K, V> m151692g() {
        return this.f129050b;
    }

    /* JADX INFO: renamed from: h */
    public C18284c<K, V> m151693h(@NonNull K k, @NonNull V v2) {
        C18284c<K, V> c18284c = new C18284c<>(k, v2);
        this.f129052d++;
        C18284c<K, V> c18284c2 = this.f129050b;
        if (c18284c2 == null) {
            this.f129049a = c18284c;
            this.f129050b = c18284c;
            return c18284c;
        }
        c18284c2.f129055c = c18284c;
        c18284c.f129056d = c18284c2;
        this.f129050b = c18284c;
        return c18284c;
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
    public V mo110334i(@NonNull K k, @NonNull V v2) {
        C18284c<K, V> c18284cMo110333c = mo110333c(k);
        if (c18284cMo110333c != null) {
            return c18284cMo110333c.f129054b;
        }
        m151693h(k, v2);
        return null;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        C18282a c18282a = new C18282a(this.f129049a, this.f129050b);
        this.f129051c.put(c18282a, Boolean.FALSE);
        return c18282a;
    }

    /* JADX INFO: renamed from: j */
    public V mo110335j(@NonNull K k) {
        C18284c<K, V> c18284cMo110333c = mo110333c(k);
        if (c18284cMo110333c == null) {
            return null;
        }
        this.f129052d--;
        if (!this.f129051c.isEmpty()) {
            Iterator<AbstractC18287f<K, V>> it = this.f129051c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo151696a(c18284cMo110333c);
            }
        }
        C18284c<K, V> c18284c = c18284cMo110333c.f129056d;
        C18284c<K, V> c18284c2 = c18284cMo110333c.f129055c;
        if (c18284c != null) {
            c18284c.f129055c = c18284c2;
        } else {
            this.f129049a = c18284c2;
        }
        C18284c<K, V> c18284c3 = c18284cMo110333c.f129055c;
        if (c18284c3 != null) {
            c18284c3.f129056d = c18284c;
        } else {
            this.f129050b = c18284c;
        }
        c18284cMo110333c.f129055c = null;
        c18284cMo110333c.f129056d = null;
        return c18284cMo110333c.f129054b;
    }

    public int size() {
        return this.f129052d;
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
