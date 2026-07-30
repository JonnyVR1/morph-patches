package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p153l.wg3;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes7.dex */
public class C3438m extends C3439n {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3442q f11648f;

    /* JADX INFO: renamed from: com.google.protobuf.m$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, C3438m> f11649a;

        public b(Map.Entry<K, C3438m> entry) {
            this.f11649a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11649a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C3438m value = this.f11649a.getValue();
            if (value == null) {
                return null;
            }
            return value.m17268f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC3442q) {
                return this.f11649a.getValue().m17273d((InterfaceC3442q) obj);
            }
            wg3.m206174a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.m$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f11650a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f11650a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f11650a.next();
            return next.getValue() instanceof C3438m ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11650a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11650a.remove();
        }
    }

    @Override // com.google.protobuf.C3439n
    public boolean equals(Object obj) {
        return m17268f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC3442q m17268f() {
        return m17272c(this.f11648f);
    }

    @Override // com.google.protobuf.C3439n
    public int hashCode() {
        return m17268f().hashCode();
    }

    public String toString() {
        return m17268f().toString();
    }
}
