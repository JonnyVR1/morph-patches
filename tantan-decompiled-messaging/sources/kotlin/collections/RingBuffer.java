package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import p149l.hck0;
import p149l.j6f;
import p149l.jck0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\u0016\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0001\u0010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0014¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0014¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\tJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\tJ\u0015\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0082\bR\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m87232d2 = {"Lkotlin/collections/RingBuffer;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "buffer", "", "", "filledSize", "", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "[Ljava/lang/Object;", "startIndex", "value", "size", "getSize", "()I", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "toArray", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "expanded", "maxCapacity", "add", "", "element", "(Ljava/lang/Object;)V", "removeFirst", "n", "forward", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    @NotNull
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(@NotNull Object[] objArr, int i) {
        objArr.getClass();
        this.buffer = objArr;
        if (i < 0) {
            jck0.m140980a("ring buffer filled size should not be negative but it is ", i);
            throw null;
        }
        if (i > objArr.length) {
            hck0.m130443a("ring buffer filled size: ", i, " cannot be larger than the buffer size: ", objArr.length);
            throw null;
        }
        this.capacity = objArr.length;
        this.size = i;
    }

    private final int forward(int i, int i2) {
        return (i + i2) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T element) {
        if (isFull()) {
            qkq0.m175383a("ring buffer is full");
        } else {
            this.buffer[(this.startIndex + size()) % this.capacity] = element;
            this.size = size() + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RingBuffer<T> expanded(int maxCapacity) {
        int i = this.capacity;
        int iM87599e = C15167a.m87599e(i + (i >> 1) + 1, maxCapacity);
        return new RingBuffer<>(this.startIndex == 0 ? Arrays.copyOf(this.buffer, iM87599e) : toArray(new Object[iM87599e]), size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (T) this.buffer[(this.startIndex + index) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                this.this$0 = this;
                this.count = this.size();
                this.index = ((RingBuffer) this).startIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                if (this.count == 0) {
                    done();
                    return;
                }
                setNext(((RingBuffer) this.this$0).buffer[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int n) {
        if (n < 0) {
            jck0.m140980a("n shouldn't be negative but it is ", n);
            return;
        }
        if (n > size()) {
            hck0.m130443a("n shouldn't be greater than the buffer size: n = ", n, ", size = ", size());
            return;
        }
        if (n > 0) {
            int i = this.startIndex;
            int i2 = (i + n) % this.capacity;
            Object[] objArr = this.buffer;
            if (i > i2) {
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i, this.capacity);
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i2);
            } else {
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i, i2);
            }
            this.startIndex = i2;
            this.size = size() - n;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        array.getClass();
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            objArr = (T[]) Arrays.copyOf(array, size());
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.startIndex; i2 < size && i3 < this.capacity; i3++) {
            objArr[i2] = this.buffer[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.buffer[i];
            i2++;
            i++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size, objArr);
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
