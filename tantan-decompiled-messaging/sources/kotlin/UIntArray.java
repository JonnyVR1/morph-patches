package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p149l.kgj0;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, m87232d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "", "size", "c", "(I)[I", "", PlaceTypes.STORAGE, "f", "([I)[I", FirebaseAnalytics.Param.INDEX, BLiveStormDanmakuGiftResourceType.f44444l, "([II)I", "value", "", "w", "([III)V", "", ResourceDirection.f38808v, "([I)Ljava/util/Iterator;", "element", "", "h", "([II)Z", "elements", RXScreenCaptureService.KEY_INDEX, "([ILjava/util/Collection;)Z", BLiveStormDanmakuGiftResourceType.f44446s, "([I)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[I", "getStorage$annotations", "()V", "p", "([I)I", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
public final class UIntArray implements Collection<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final int[] storage;

    /* JADX INFO: renamed from: kotlin.UIntArray$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Lkotlin/UIntArray$a;", "", "Lkotlin/UInt;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "a", "()I", "[I", "", "b", "I", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15109a implements Iterator<UInt>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final int[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public C15109a(@NotNull int[] iArr) {
            iArr.getClass();
            this.array = iArr;
        }

        /* JADX INFO: renamed from: a */
        public int m87286a() {
            int i = this.index;
            int[] iArr = this.array;
            if (i < iArr.length) {
                this.index = i + 1;
                return UInt.m87265b(iArr[i]);
            }
            kgj0.m145892a(String.valueOf(i));
            return 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.m87264a(m87286a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UIntArray(int[] iArr) {
        this.storage = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UIntArray m87270a(int[] iArr) {
        return new UIntArray(iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static int[] m87271c(int i) {
        return m87272f(new int[i]);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: f */
    public static int[] m87272f(@NotNull int[] iArr) {
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m87273h(int[] iArr, int i) {
        return ArraysKt.contains(iArr, i);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m87274i(int[] iArr, @NotNull Collection<UInt> collection) {
        collection.getClass();
        Collection<UInt> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof UInt) || !ArraysKt.contains(iArr, ((UInt) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m87275j(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.m87488d(iArr, ((UIntArray) obj).getStorage());
    }

    /* JADX INFO: renamed from: l */
    public static final int m87276l(int[] iArr, int i) {
        return UInt.m87265b(iArr[i]);
    }

    /* JADX INFO: renamed from: p */
    public static int m87277p(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: r */
    public static int m87278r(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m87279s(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static Iterator<UInt> m87280v(int[] iArr) {
        return new C15109a(iArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m87281w(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: x */
    public static String m87282x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m87283g(((UInt) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return m87274i(this.storage, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m87275j(this.storage, other);
    }

    /* JADX INFO: renamed from: g */
    public boolean m87283g(int i) {
        return m87273h(this.storage, i);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m87278r(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m87279s(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UInt> iterator() {
        return m87280v(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m87277p(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) CollectionToArray.m87478b(this, tArr);
    }

    public String toString() {
        return m87282x(this.storage);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ int[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m87477a(this);
    }
}
