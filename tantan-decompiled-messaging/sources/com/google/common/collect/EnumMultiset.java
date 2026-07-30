package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p149l.aiq;
import p149l.lmr;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractC2963b<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    /* JADX INFO: renamed from: com.google.common.collect.EnumMultiset$a */
    public class C2764a extends EnumMultiset<E>.AbstractC2766c<E> {
        public C2764a() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.AbstractC2766c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E mo15637a(int i) {
            return (E) EnumMultiset.this.enumConstants[i];
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.EnumMultiset$b */
    public class C2765b extends EnumMultiset<E>.AbstractC2766c<InterfaceC2972k.a<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.EnumMultiset$b$a */
        public class a extends Multisets.AbstractC2897b<E> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10860a;

            public a(int i) {
                this.f10860a = i;
            }

            @Override // com.google.common.collect.InterfaceC2972k.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public E getElement() {
                return (E) EnumMultiset.this.enumConstants[this.f10860a];
            }

            @Override // com.google.common.collect.InterfaceC2972k.a
            public int getCount() {
                return EnumMultiset.this.counts[this.f10860a];
            }
        }

        public C2765b() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.AbstractC2766c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> mo15637a(int i) {
            return new a(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.EnumMultiset$c */
    public abstract class AbstractC2766c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10862a = 0;

        /* JADX INFO: renamed from: b */
        public int f10863b = -1;

        public AbstractC2766c() {
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo15637a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f10862a < EnumMultiset.this.enumConstants.length) {
                int[] iArr = EnumMultiset.this.counts;
                int i = this.f10862a;
                if (iArr[i] > 0) {
                    return true;
                }
                this.f10862a = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            T tMo15637a = mo15637a(this.f10862a);
            int i = this.f10862a;
            this.f10863b = i;
            this.f10862a = i + 1;
            return tMo15637a;
        }

        @Override // java.util.Iterator
        public void remove() {
            sd5.m183447e(this.f10863b >= 0);
            if (EnumMultiset.this.counts[this.f10863b] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.f10863b]);
                EnumMultiset.this.counts[this.f10863b] = 0;
            }
            this.f10863b = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        sf80.m183882d(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i - 1;
        return i;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.size - j;
        enumMultiset.size = j2;
        return j2;
    }

    private void checkIsE(Object obj) {
        sf80.m183894p(obj);
        if (isActuallyE(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.type);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb.append("Expected an ");
        sb.append(strValueOf);
        sb.append(" but got ");
        sb.append(strValueOf2);
        throw new ClassCastException(sb.toString());
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        sf80.m183883e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        aiq.m96875a(enumMultiset, iterable);
        return enumMultiset;
    }

    private boolean isActuallyE(Object obj) {
        if (obj instanceof Enum) {
            Enum r4 = (Enum) obj;
            int iOrdinal = r4.ordinal();
            E[] eArr = this.enumConstants;
            if (iOrdinal < eArr.length && eArr[iOrdinal] == r4) {
                return true;
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        C2976o.m16309f(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        C2976o.m16314k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int add(E e, int i) {
        checkIsE(e);
        sd5.m183444b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int iOrdinal = e.ordinal();
        int i2 = this.counts[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        sf80.m183886h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.counts[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i2;
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.InterfaceC2972k
    public int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractC2963b
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<E> elementIterator() {
        return new C2764a();
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<InterfaceC2972k.a<E>> entryIterator() {
        return new C2765b();
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2972k
    public Iterator<E> iterator() {
        return Multisets.m16098i(this);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int remove(Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        sd5.m183444b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 > i) {
            iArr[iOrdinal] = i2 - i;
            this.size -= (long) i;
            return i2;
        }
        iArr[iOrdinal] = 0;
        this.distinctElements--;
        this.size -= (long) i2;
        return i2;
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int setCount(E e, int i) {
        checkIsE(e);
        sd5.m183444b(i, "count");
        int iOrdinal = e.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[iOrdinal];
        iArr[iOrdinal] = i;
        this.size += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.distinctElements++;
            return i2;
        }
        if (i2 > 0 && i == 0) {
            this.distinctElements--;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public int size() {
        return Ints.m16468m(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        aiq.m96875a(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ boolean setCount(Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }
}
