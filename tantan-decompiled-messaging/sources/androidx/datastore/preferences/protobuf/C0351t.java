package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public class C0351t extends C0352u {

    /* JADX INFO: renamed from: f */
    public final InterfaceC0321b0 f1742f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, C0351t> f1743a;

        public b(Map.Entry<K, C0351t> entry) {
            this.f1743a = entry;
        }

        /* JADX INFO: renamed from: a */
        public C0351t m2350a() {
            return this.f1743a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1743a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C0351t value = this.f1743a.getValue();
            if (value == null) {
                return null;
            }
            return value.m2349f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC0321b0) {
                return this.f1743a.getValue().m2355d((InterfaceC0321b0) obj);
            }
            ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f1744a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f1744a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f1744a.next();
            return next.getValue() instanceof C0351t ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1744a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f1744a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C0352u
    public boolean equals(Object obj) {
        return m2349f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0321b0 m2349f() {
        return m2354c(this.f1742f);
    }

    @Override // androidx.datastore.preferences.protobuf.C0352u
    public int hashCode() {
        return m2349f().hashCode();
    }

    public String toString() {
        return m2349f().toString();
    }
}
