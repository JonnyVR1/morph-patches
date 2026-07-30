package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p153l.bzk;
import p153l.k950;
import p153l.mor;
import p153l.nof0;
import p153l.se5;
import p153l.un5;
import p153l.vn5;
import p153l.xn80;
import p153l.y850;

/* JADX INFO: loaded from: classes7.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    transient Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashSet$a */
    public class C2776a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public int f10879a;

        /* JADX INFO: renamed from: b */
        public int f10880b;

        /* JADX INFO: renamed from: c */
        public int f10881c = -1;

        public C2776a() {
            this.f10879a = CompactHashSet.this.metadata;
            this.f10880b = CompactHashSet.this.firstEntryIndex();
        }

        /* JADX INFO: renamed from: a */
        public final void m15682a() {
            if (CompactHashSet.this.metadata == this.f10879a) {
                return;
            }
            nof0.m164126a();
        }

        /* JADX INFO: renamed from: b */
        public void m15683b() {
            this.f10879a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10880b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            m15682a();
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            int i = this.f10880b;
            this.f10881c = i;
            E e = (E) CompactHashSet.this.element(i);
            this.f10880b = CompactHashSet.this.getSuccessor(this.f10880b);
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15682a();
            se5.m185519e(this.f10881c >= 0);
            m15683b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.element(this.f10881c));
            this.f10880b = CompactHashSet.this.adjustAfterRemove(this.f10880b, this.f10881c);
            this.f10881c = -1;
        }
    }

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    private Set<E> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
        return new CompactHashSet<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i) {
        return (E) requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            un5.m196828a(25, "Invalid size: ", i);
            return;
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int i) {
        int iMin;
        int length = requireEntries().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object objM201915a = vn5.m201915a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            vn5.m201923i(objM201915a, i3 & i5, i4 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM201922h = vn5.m201922h(objRequireTable, i6);
            while (iM201922h != 0) {
                int i7 = iM201922h - 1;
                int i8 = iArrRequireEntries[i7];
                int iM201916b = vn5.m201916b(i8, i) | i6;
                int i9 = iM201916b & i5;
                int iM201922h2 = vn5.m201922h(objM201915a, i9);
                vn5.m201923i(objM201915a, i9, iM201922h);
                iArrRequireEntries[i7] = vn5.m201918d(iM201916b, iM201922h2, i5);
                iM201922h = vn5.m201917c(i8, i);
            }
        }
        this.table = objM201915a;
        setHashTableMask(i5);
        return i5;
    }

    private void setElement(int i, E e) {
        requireElements()[i] = e;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = vn5.m201918d(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i = this.size;
        int i2 = i + 1;
        int iM107166d = bzk.m107166d(e);
        int iHashTableMask = hashTableMask();
        int i3 = iM107166d & iHashTableMask;
        int iM201922h = vn5.m201922h(requireTable(), i3);
        if (iM201922h != 0) {
            int iM201916b = vn5.m201916b(iM107166d, iHashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = iM201922h - 1;
                int i6 = iArrRequireEntries[i5];
                if (vn5.m201916b(i6, iHashTableMask) == iM201916b && k950.m148863a(e, objArrRequireElements[i5])) {
                    return false;
                }
                int iM201917c = vn5.m201917c(i6, iHashTableMask);
                i4++;
                if (iM201917c != 0) {
                    iM201922h = iM201917c;
                } else {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e);
                    }
                    if (i2 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, vn5.m201919e(iHashTableMask), iM107166d, i);
                    } else {
                        iArrRequireEntries[i5] = vn5.m201918d(i6, i2, iHashTableMask);
                    }
                }
            }
        } else if (i2 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, vn5.m201919e(iHashTableMask), iM107166d, i);
        } else {
            vn5.m201923i(requireTable(), i3, i2);
        }
        resizeMeMaybe(i2);
        insertEntry(i, e, iM107166d, iHashTableMask);
        this.size = i2;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int allocArrays() {
        xn80.m212118w(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int iM201924j = vn5.m201924j(i);
        this.table = vn5.m201915a(iM201924j);
        setHashTableMask(iM201924j - 1);
        this.entries = new int[i];
        this.elements = new Object[i];
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.metadata = Ints.m16516f(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        vn5.m201921g(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iM107166d = bzk.m107166d(obj);
        int iHashTableMask = hashTableMask();
        int iM201922h = vn5.m201922h(requireTable(), iM107166d & iHashTableMask);
        if (iM201922h == 0) {
            return false;
        }
        int iM201916b = vn5.m201916b(iM107166d, iHashTableMask);
        do {
            int i = iM201922h - 1;
            int iEntry = entry(i);
            if (vn5.m201916b(iEntry, iHashTableMask) == iM201916b && k950.m148863a(obj, element(i))) {
                return true;
            }
            iM201922h = vn5.m201917c(iEntry, iHashTableMask);
        } while (iM201922h != 0);
        return false;
    }

    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = setCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return setCreateHashFloodingResistantDelegate;
    }

    public Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        xn80.m212100e(i >= 0, "Expected size must be >= 0");
        this.metadata = Ints.m16516f(i, 1, 1073741823);
    }

    public void insertEntry(int i, E e, int i2, int i3) {
        setEntry(i, vn5.m201918d(i2, 0, i3));
        setElement(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new C2776a();
    }

    public void moveLastEntry(int i, int i2) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrRequireElements[i] = null;
            iArrRequireEntries[i] = 0;
            return;
        }
        Object obj = objArrRequireElements[i3];
        objArrRequireElements[i] = obj;
        objArrRequireElements[i3] = null;
        iArrRequireEntries[i] = iArrRequireEntries[i3];
        iArrRequireEntries[i3] = 0;
        int iM107166d = bzk.m107166d(obj) & i2;
        int iM201922h = vn5.m201922h(objRequireTable, iM107166d);
        if (iM201922h == size) {
            vn5.m201923i(objRequireTable, iM107166d, i + 1);
            return;
        }
        while (true) {
            int i4 = iM201922h - 1;
            int i5 = iArrRequireEntries[i4];
            int iM201917c = vn5.m201917c(i5, i2);
            if (iM201917c == size) {
                iArrRequireEntries[i4] = vn5.m201918d(i5, i + 1, i2);
                return;
            }
            iM201922h = iM201917c;
        }
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iHashTableMask = hashTableMask();
        int iM201920f = vn5.m201920f(obj, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iM201920f == -1) {
            return false;
        }
        moveLastEntry(iM201920f, iHashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.elements = Arrays.copyOf(requireElements(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (!needsAllocArrays()) {
            Set<E> setDelegateOrNull = delegateOrNull();
            return setDelegateOrNull != null ? (T[]) setDelegateOrNull.toArray(tArr) : (T[]) y850.m214729h(requireElements(), 0, this.size, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            setCreateHashFloodingResistantDelegate.addAll(setDelegateOrNull);
            this.table = setCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int iM201924j = vn5.m201924j(i);
        int iHashTableMask = hashTableMask();
        if (iM201924j < iHashTableMask) {
            resizeTable(iHashTableMask, iM201924j, 0, 0);
        }
    }

    public CompactHashSet(int i) {
        init(i);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }
}
