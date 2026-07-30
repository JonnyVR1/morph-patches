package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p149l.bm10;
import p149l.ggf0;
import p149l.lmr;
import p149l.lwk;
import p149l.sd5;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient ValueEntry<K, V> multimapHeaderEntry;
    transient int valueSetCapacity;

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements InterfaceC2822c<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        ValueEntry<K, V> predecessorInMultimap;
        InterfaceC2822c<K, V> predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry<K, V> successorInMultimap;
        InterfaceC2822c<K, V> successorInValueSet;

        public ValueEntry(K k, V v2, int i, ValueEntry<K, V> valueEntry) {
            super(k, v2);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        public static <K, V> ValueEntry<K, V> newHeader() {
            return new ValueEntry<>(null, null, 0, null);
        }

        public ValueEntry<K, V> getPredecessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.predecessorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public InterfaceC2822c<K, V> getPredecessorInValueSet() {
            InterfaceC2822c<K, V> interfaceC2822c = this.predecessorInValueSet;
            Objects.requireNonNull(interfaceC2822c);
            return interfaceC2822c;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public InterfaceC2822c<K, V> getSuccessorInValueSet() {
            InterfaceC2822c<K, V> interfaceC2822c = this.successorInValueSet;
            Objects.requireNonNull(interfaceC2822c);
            return interfaceC2822c;
        }

        public boolean matchesValue(Object obj, int i) {
            return this.smearedValueHash == i && v050.m196470a(getValue(), obj);
        }

        public void setPredecessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public void setPredecessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c) {
            this.predecessorInValueSet = interfaceC2822c;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public void setSuccessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c) {
            this.successorInValueSet = interfaceC2822c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$a */
    public class C2820a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public ValueEntry<K, V> f10957a;

        /* JADX INFO: renamed from: b */
        public ValueEntry<K, V> f10958b;

        public C2820a() {
            this.f10957a = LinkedHashMultimap.this.multimapHeaderEntry.getSuccessorInMultimap();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            ValueEntry<K, V> valueEntry = this.f10957a;
            this.f10958b = valueEntry;
            this.f10957a = valueEntry.getSuccessorInMultimap();
            return valueEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10957a != LinkedHashMultimap.this.multimapHeaderEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183901w(this.f10958b != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f10958b.getKey(), this.f10958b.getValue());
            this.f10958b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$b */
    public final class C2821b extends Sets.AbstractC2918e<V> implements InterfaceC2822c<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10960a;

        /* JADX INFO: renamed from: b */
        public ValueEntry<K, V>[] f10961b;

        /* JADX INFO: renamed from: c */
        public int f10962c = 0;

        /* JADX INFO: renamed from: d */
        public int f10963d = 0;

        /* JADX INFO: renamed from: e */
        public InterfaceC2822c<K, V> f10964e = this;

        /* JADX INFO: renamed from: f */
        public InterfaceC2822c<K, V> f10965f = this;

        /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$b$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2822c<K, V> f10967a;

            /* JADX INFO: renamed from: b */
            public ValueEntry<K, V> f10968b;

            /* JADX INFO: renamed from: c */
            public int f10969c;

            public a() {
                this.f10967a = C2821b.this.f10964e;
                this.f10969c = C2821b.this.f10963d;
            }

            /* JADX INFO: renamed from: a */
            public final void m15905a() {
                if (C2821b.this.f10963d == this.f10969c) {
                    return;
                }
                ggf0.m125962a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15905a();
                return this.f10967a != C2821b.this;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!hasNext()) {
                    lmr.m150601a();
                    return null;
                }
                ValueEntry<K, V> valueEntry = (ValueEntry) this.f10967a;
                V value = valueEntry.getValue();
                this.f10968b = valueEntry;
                this.f10967a = valueEntry.getSuccessorInValueSet();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15905a();
                sf80.m183901w(this.f10968b != null, "no calls to next() since the last call to remove()");
                C2821b.this.remove(this.f10968b.getValue());
                this.f10969c = C2821b.this.f10963d;
                this.f10968b = null;
            }
        }

        public C2821b(K k, int i) {
            this.f10960a = k;
            this.f10961b = new ValueEntry[lwk.m151971a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(V v2) {
            int iM151974d = lwk.m151974d(v2);
            int iM15903f = m15903f() & iM151974d;
            ValueEntry<K, V> valueEntry = this.f10961b[iM15903f];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(v2, iM151974d)) {
                    return false;
                }
            }
            ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.f10960a, v2, iM151974d, valueEntry);
            LinkedHashMultimap.succeedsInValueSet(this.f10965f, valueEntry3);
            LinkedHashMultimap.succeedsInValueSet(valueEntry3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.getPredecessorInMultimap(), valueEntry3);
            LinkedHashMultimap.succeedsInMultimap(valueEntry3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f10961b[iM15903f] = valueEntry3;
            this.f10962c++;
            this.f10963d++;
            m15904g();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f10961b, (Object) null);
            this.f10962c = 0;
            for (InterfaceC2822c<K, V> successorInValueSet = this.f10964e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                LinkedHashMultimap.deleteFromMultimap((ValueEntry) successorInValueSet);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f10963d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int iM151974d = lwk.m151974d(obj);
            for (ValueEntry<K, V> valueEntry = this.f10961b[m15903f() & iM151974d]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, iM151974d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final int m15903f() {
            return this.f10961b.length - 1;
        }

        /* JADX INFO: renamed from: g */
        public final void m15904g() {
            if (lwk.m151972b(this.f10962c, this.f10961b.length, 1.0d)) {
                int length = this.f10961b.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f10961b = valueEntryArr;
                int i = length - 1;
                for (InterfaceC2822c<K, V> successorInValueSet = this.f10964e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) successorInValueSet;
                    int i2 = valueEntry.smearedValueHash & i;
                    valueEntry.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public InterfaceC2822c<K, V> getPredecessorInValueSet() {
            return this.f10965f;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public InterfaceC2822c<K, V> getSuccessorInValueSet() {
            return this.f10964e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM151974d = lwk.m151974d(obj);
            int iM15903f = m15903f() & iM151974d;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f10961b[iM15903f]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, iM151974d)) {
                    if (valueEntry == null) {
                        this.f10961b[iM15903f] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.deleteFromValueSet(valueEntry2);
                    LinkedHashMultimap.deleteFromMultimap(valueEntry2);
                    this.f10962c--;
                    this.f10963d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public void setPredecessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c) {
            this.f10965f = interfaceC2822c;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2822c
        public void setSuccessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c) {
            this.f10964e = interfaceC2822c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10962c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$c */
    public interface InterfaceC2822c<K, V> {
        InterfaceC2822c<K, V> getPredecessorInValueSet();

        InterfaceC2822c<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c);

        void setSuccessorInValueSet(InterfaceC2822c<K, V> interfaceC2822c);
    }

    private LinkedHashMultimap(int i, int i2) {
        super(C2974m.m16299e(i));
        this.valueSetCapacity = 2;
        sd5.m183444b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        ValueEntry<K, V> valueEntryNewHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = valueEntryNewHeader;
        succeedsInMultimap(valueEntryNewHeader, valueEntryNewHeader);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(bm10<? extends K, ? extends V> bm10Var) {
        LinkedHashMultimap<K, V> linkedHashMultimapCreate = create(bm10Var.keySet().size(), 2);
        linkedHashMultimapCreate.putAll(bm10Var);
        return linkedHashMultimapCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(ValueEntry<K, V> valueEntry) {
        succeedsInMultimap(valueEntry.getPredecessorInMultimap(), valueEntry.getSuccessorInMultimap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(InterfaceC2822c<K, V> interfaceC2822c) {
        succeedsInValueSet(interfaceC2822c.getPredecessorInValueSet(), interfaceC2822c.getSuccessorInValueSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> valueEntryNewHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = valueEntryNewHeader;
        succeedsInMultimap(valueEntryNewHeader, valueEntryNewHeader);
        this.valueSetCapacity = 2;
        int i = objectInputStream.readInt();
        Map mapM16299e = C2974m.m16299e(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            mapM16299e.put(object, createCollection(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapM16299e.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        setMap(mapM16299e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(InterfaceC2822c<K, V> interfaceC2822c, InterfaceC2822c<K, V> interfaceC2822c2) {
        interfaceC2822c.setSuccessorInValueSet(interfaceC2822c2);
        interfaceC2822c2.setPredecessorInValueSet(interfaceC2822c);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        succeedsInMultimap(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        return new C2821b(k, this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C2820a();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ InterfaceC2972k keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
    public Iterator<V> valueIterator() {
        return Maps.m16023L(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(bm10 bm10Var) {
        return super.putAll(bm10Var);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return C2974m.m16300f(this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.m16030e(i), Maps.m16030e(i2));
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }
}
