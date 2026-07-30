package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes7.dex */
public class C3415m extends C3416n {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3419q f11611f;

    /* JADX INFO: renamed from: com.google.protobuf.m$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, C3415m> f11612a;

        public b(Map.Entry<K, C3415m> entry) {
            this.f11612a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11612a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C3415m value = this.f11612a.getValue();
            if (value == null) {
                return null;
            }
            return value.m17213f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC3419q) {
                return this.f11612a.getValue().m17218d((InterfaceC3419q) obj);
            }
            ig3.m135964a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.m$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f11613a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f11613a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f11613a.next();
            return next.getValue() instanceof C3415m ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11613a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11613a.remove();
        }
    }

    @Override // com.google.protobuf.C3416n
    public boolean equals(Object obj) {
        return m17213f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC3419q m17213f() {
        return m17217c(this.f11611f);
    }

    @Override // com.google.protobuf.C3416n
    public int hashCode() {
        return m17213f().hashCode();
    }

    public String toString() {
        return m17213f().toString();
    }
}
