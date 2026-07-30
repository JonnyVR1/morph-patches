package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: renamed from: e */
    public final MessageLite f65671e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$b */
    public static class C15290b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, LazyField> f65672a;

        public C15290b(Map.Entry<K, LazyField> entry) {
            this.f65672a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f65672a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f65672a.getValue();
            if (value == null) {
                return null;
            }
            return value.m91349e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f65672a.getValue().m91354d((MessageLite) obj);
            }
            ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$c */
    public static class C15291c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f65673a;

        public C15291c(Iterator<Map.Entry<K, Object>> it) {
            this.f65673a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f65673a.next();
            return next.getValue() instanceof LazyField ? new C15290b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65673a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f65673a.remove();
        }
    }

    /* JADX INFO: renamed from: e */
    public MessageLite m91349e() {
        return m91353c(this.f65671e);
    }

    public boolean equals(Object obj) {
        return m91349e().equals(obj);
    }

    public int hashCode() {
        return m91349e().hashCode();
    }

    public String toString() {
        return m91349e().toString();
    }
}
