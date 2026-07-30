package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: renamed from: e */
    public final MessageLite f66345e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$b */
    public static class C15397b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, LazyField> f66346a;

        public C15397b(Map.Entry<K, LazyField> entry) {
            this.f66346a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f66346a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f66346a.getValue();
            if (value == null) {
                return null;
            }
            return value.m92240e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f66346a.getValue().m92245d((MessageLite) obj);
            }
            wg3.m206174a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$c */
    public static class C15398c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f66347a;

        public C15398c(Iterator<Map.Entry<K, Object>> it) {
            this.f66347a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f66347a.next();
            return next.getValue() instanceof LazyField ? new C15397b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66347a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f66347a.remove();
        }
    }

    /* JADX INFO: renamed from: e */
    public MessageLite m92240e() {
        return m92244c(this.f66345e);
    }

    public boolean equals(Object obj) {
        return m92240e().equals(obj);
    }

    public int hashCode() {
        return m92240e().hashCode();
    }

    public String toString() {
        return m92240e().toString();
    }
}
