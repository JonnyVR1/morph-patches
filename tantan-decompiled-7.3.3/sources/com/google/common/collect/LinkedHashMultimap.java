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
import p153l.bzk;
import p153l.ju10;
import p153l.k950;
import p153l.mor;
import p153l.nof0;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient ValueEntry<K, V> multimapHeaderEntry;
    transient int valueSetCapacity;

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements InterfaceC2845c<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        ValueEntry<K, V> predecessorInMultimap;
        InterfaceC2845c<K, V> predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry<K, V> successorInMultimap;
        InterfaceC2845c<K, V> successorInValueSet;

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

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public InterfaceC2845c<K, V> getPredecessorInValueSet() {
            InterfaceC2845c<K, V> interfaceC2845c = this.predecessorInValueSet;
            Objects.requireNonNull(interfaceC2845c);
            return interfaceC2845c;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public InterfaceC2845c<K, V> getSuccessorInValueSet() {
            InterfaceC2845c<K, V> interfaceC2845c = this.successorInValueSet;
            Objects.requireNonNull(interfaceC2845c);
            return interfaceC2845c;
        }

        public boolean matchesValue(Object obj, int i) {
            return this.smearedValueHash == i && k950.m148863a(getValue(), obj);
        }

        public void setPredecessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public void setPredecessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c) {
            this.predecessorInValueSet = interfaceC2845c;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public void setSuccessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c) {
            this.successorInValueSet = interfaceC2845c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$a */
    public class C2843a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public ValueEntry<K, V> f10994a;

        /* JADX INFO: renamed from: b */
        public ValueEntry<K, V> f10995b;

        public C2843a() {
            this.f10994a = LinkedHashMultimap.this.multimapHeaderEntry.getSuccessorInMultimap();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            ValueEntry<K, V> valueEntry = this.f10994a;
            this.f10995b = valueEntry;
            this.f10994a = valueEntry.getSuccessorInMultimap();
            return valueEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10994a != LinkedHashMultimap.this.multimapHeaderEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212118w(this.f10995b != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f10995b.getKey(), this.f10995b.getValue());
            this.f10995b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$b */
    public final class C2844b extends Sets.AbstractC2941e<V> implements InterfaceC2845c<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10997a;

        /* JADX INFO: renamed from: b */
        public ValueEntry<K, V>[] f10998b;

        /* JADX INFO: renamed from: c */
        public int f10999c = 0;

        /* JADX INFO: renamed from: d */
        public int f11000d = 0;

        /* JADX INFO: renamed from: e */
        public InterfaceC2845c<K, V> f11001e = this;

        /* JADX INFO: renamed from: f */
        public InterfaceC2845c<K, V> f11002f = this;

        /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$b$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2845c<K, V> f11004a;

            /* JADX INFO: renamed from: b */
            public ValueEntry<K, V> f11005b;

            /* JADX INFO: renamed from: c */
            public int f11006c;

            public a() {
                this.f11004a = C2844b.this.f11001e;
                this.f11006c = C2844b.this.f11000d;
            }

            /* JADX INFO: renamed from: a */
            public final void m15959a() {
                if (C2844b.this.f11000d == this.f11006c) {
                    return;
                }
                nof0.m164126a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15959a();
                return this.f11004a != C2844b.this;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!hasNext()) {
                    mor.m159308a();
                    return null;
                }
                ValueEntry<K, V> valueEntry = (ValueEntry) this.f11004a;
                V value = valueEntry.getValue();
                this.f11005b = valueEntry;
                this.f11004a = valueEntry.getSuccessorInValueSet();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15959a();
                xn80.m212118w(this.f11005b != null, "no calls to next() since the last call to remove()");
                C2844b.this.remove(this.f11005b.getValue());
                this.f11006c = C2844b.this.f11000d;
                this.f11005b = null;
            }
        }

        public C2844b(K k, int i) {
            this.f10997a = k;
            this.f10998b = new ValueEntry[bzk.m107163a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(V v2) {
            int iM107166d = bzk.m107166d(v2);
            int iM15957f = m15957f() & iM107166d;
            ValueEntry<K, V> valueEntry = this.f10998b[iM15957f];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(v2, iM107166d)) {
                    return false;
                }
            }
            ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.f10997a, v2, iM107166d, valueEntry);
            LinkedHashMultimap.succeedsInValueSet(this.f11002f, valueEntry3);
            LinkedHashMultimap.succeedsInValueSet(valueEntry3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.getPredecessorInMultimap(), valueEntry3);
            LinkedHashMultimap.succeedsInMultimap(valueEntry3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f10998b[iM15957f] = valueEntry3;
            this.f10999c++;
            this.f11000d++;
            m15958g();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f10998b, (Object) null);
            this.f10999c = 0;
            for (InterfaceC2845c<K, V> successorInValueSet = this.f11001e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                LinkedHashMultimap.deleteFromMultimap((ValueEntry) successorInValueSet);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f11000d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int iM107166d = bzk.m107166d(obj);
            for (ValueEntry<K, V> valueEntry = this.f10998b[m15957f() & iM107166d]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, iM107166d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final int m15957f() {
            return this.f10998b.length - 1;
        }

        /* JADX INFO: renamed from: g */
        public final void m15958g() {
            if (bzk.m107164b(this.f10999c, this.f10998b.length, 1.0d)) {
                int length = this.f10998b.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f10998b = valueEntryArr;
                int i = length - 1;
                for (InterfaceC2845c<K, V> successorInValueSet = this.f11001e; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) successorInValueSet;
                    int i2 = valueEntry.smearedValueHash & i;
                    valueEntry.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public InterfaceC2845c<K, V> getPredecessorInValueSet() {
            return this.f11002f;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public InterfaceC2845c<K, V> getSuccessorInValueSet() {
            return this.f11001e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM107166d = bzk.m107166d(obj);
            int iM15957f = m15957f() & iM107166d;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f10998b[iM15957f]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, iM107166d)) {
                    if (valueEntry == null) {
                        this.f10998b[iM15957f] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.deleteFromValueSet(valueEntry2);
                    LinkedHashMultimap.deleteFromMultimap(valueEntry2);
                    this.f10999c--;
                    this.f11000d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public void setPredecessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c) {
            this.f11002f = interfaceC2845c;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC2845c
        public void setSuccessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c) {
            this.f11001e = interfaceC2845c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10999c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$c */
    public interface InterfaceC2845c<K, V> {
        InterfaceC2845c<K, V> getPredecessorInValueSet();

        InterfaceC2845c<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c);

        void setSuccessorInValueSet(InterfaceC2845c<K, V> interfaceC2845c);
    }

    private LinkedHashMultimap(int i, int i2) {
        super(C2997m.m16353e(i));
        this.valueSetCapacity = 2;
        se5.m185516b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        ValueEntry<K, V> valueEntryNewHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = valueEntryNewHeader;
        succeedsInMultimap(valueEntryNewHeader, valueEntryNewHeader);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(ju10<? extends K, ? extends V> ju10Var) {
        LinkedHashMultimap<K, V> linkedHashMultimapCreate = create(ju10Var.keySet().size(), 2);
        linkedHashMultimapCreate.putAll(ju10Var);
        return linkedHashMultimapCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(ValueEntry<K, V> valueEntry) {
        succeedsInMultimap(valueEntry.getPredecessorInMultimap(), valueEntry.getSuccessorInMultimap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(InterfaceC2845c<K, V> interfaceC2845c) {
        succeedsInValueSet(interfaceC2845c.getPredecessorInValueSet(), interfaceC2845c.getSuccessorInValueSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> valueEntryNewHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = valueEntryNewHeader;
        succeedsInMultimap(valueEntryNewHeader, valueEntryNewHeader);
        this.valueSetCapacity = 2;
        int i = objectInputStream.readInt();
        Map mapM16353e = C2997m.m16353e(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            mapM16353e.put(object, createCollection(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapM16353e.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        setMap(mapM16353e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(InterfaceC2845c<K, V> interfaceC2845c, InterfaceC2845c<K, V> interfaceC2845c2) {
        interfaceC2845c.setSuccessorInValueSet(interfaceC2845c2);
        interfaceC2845c2.setPredecessorInValueSet(interfaceC2845c);
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

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        succeedsInMultimap(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        return new C2844b(k, this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C2843a();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ InterfaceC2995k keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
    public Iterator<V> valueIterator() {
        return Maps.m16077L(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(ju10 ju10Var) {
        return super.putAll(ju10Var);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return C2997m.m16354f(this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.m16084e(i), Maps.m16084e(i2));
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }
}
