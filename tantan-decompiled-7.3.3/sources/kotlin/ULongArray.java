package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.npj0;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, m88121d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "", "size", "c", "(I)[J", "", PlaceTypes.STORAGE, "f", "([J)[J", FirebaseAnalytics.Param.INDEX, BLiveStormDanmakuGiftResourceType.f45292l, "([JI)J", "value", "", "w", "([JIJ)V", "", ResourceDirection.f39656v, "([J)Ljava/util/Iterator;", "element", "", "h", "([JJ)Z", "elements", RXScreenCaptureService.KEY_INDEX, "([JLjava/util/Collection;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "([J)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[J", "getStorage$annotations", "()V", "p", "([J)I", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
public final class ULongArray implements Collection<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final long[] storage;

    /* JADX INFO: renamed from: kotlin.ULongArray$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lkotlin/ULongArray$a;", "", "Lkotlin/ULong;", "", "array", "<init>", "([J)V", "", "hasNext", "()Z", "a", "()J", "[J", "", "b", "I", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15217a implements Iterator<ULong>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final long[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public C15217a(@NotNull long[] jArr) {
            jArr.getClass();
            this.array = jArr;
        }

        /* JADX INFO: renamed from: a */
        public long m88198a() {
            int i = this.index;
            long[] jArr = this.array;
            if (i < jArr.length) {
                this.index = i + 1;
                return ULong.m88177b(jArr[i]);
            }
            npj0.m164229a(String.valueOf(i));
            return 0L;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.m88176a(m88198a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ULongArray m88182a(long[] jArr) {
        return new ULongArray(jArr);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static long[] m88183c(int i) {
        return m88184f(new long[i]);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: f */
    public static long[] m88184f(@NotNull long[] jArr) {
        jArr.getClass();
        return jArr;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88185h(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m88186i(long[] jArr, @NotNull Collection<ULong> collection) {
        collection.getClass();
        Collection<ULong> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof ULong) || !ArraysKt.contains(jArr, ((ULong) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m88187j(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.m88377d(jArr, ((ULongArray) obj).getStorage());
    }

    /* JADX INFO: renamed from: l */
    public static final long m88188l(long[] jArr, int i) {
        return ULong.m88177b(jArr[i]);
    }

    /* JADX INFO: renamed from: p */
    public static int m88189p(long[] jArr) {
        return jArr.length;
    }

    /* JADX INFO: renamed from: r */
    public static int m88190r(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m88191s(long[] jArr) {
        return jArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static Iterator<ULong> m88192v(long[] jArr) {
        return new C15217a(jArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m88193w(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* JADX INFO: renamed from: x */
    public static String m88194x(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m88195g(((ULong) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return m88186i(this.storage, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m88187j(this.storage, other);
    }

    /* JADX INFO: renamed from: g */
    public boolean m88195g(long j) {
        return m88185h(this.storage, j);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m88190r(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m88191s(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<ULong> iterator() {
        return m88192v(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m88189p(this.storage);
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
        return (T[]) CollectionToArray.m88367b(this, tArr);
    }

    public String toString() {
        return m88194x(this.storage);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ long[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m88366a(this);
    }
}
