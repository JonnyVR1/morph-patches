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
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, m88121d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "", "size", "c", "(I)[S", "", PlaceTypes.STORAGE, "f", "([S)[S", FirebaseAnalytics.Param.INDEX, BLiveStormDanmakuGiftResourceType.f45292l, "([SI)S", "value", "", "w", "([SIS)V", "", ResourceDirection.f39656v, "([S)Ljava/util/Iterator;", "element", "", "h", "([SS)Z", "elements", RXScreenCaptureService.KEY_INDEX, "([SLjava/util/Collection;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "([S)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[S", "getStorage$annotations", "()V", "p", "([S)I", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
public final class UShortArray implements Collection<UShort>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final short[] storage;

    /* JADX INFO: renamed from: kotlin.UShortArray$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lkotlin/UShortArray$a;", "", "Lkotlin/UShort;", "", "array", "<init>", "([S)V", "", "hasNext", "()Z", "a", "()S", "[S", "", "b", "I", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15218a implements Iterator<UShort>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final short[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public C15218a(@NotNull short[] sArr) {
            sArr.getClass();
            this.array = sArr;
        }

        /* JADX INFO: renamed from: a */
        public short m88221a() {
            int i = this.index;
            short[] sArr = this.array;
            if (i < sArr.length) {
                this.index = i + 1;
                return UShort.m88200b(sArr[i]);
            }
            npj0.m164229a(String.valueOf(i));
            return (short) 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m88199a(m88221a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UShortArray m88205a(short[] sArr) {
        return new UShortArray(sArr);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static short[] m88206c(int i) {
        return m88207f(new short[i]);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: f */
    public static short[] m88207f(@NotNull short[] sArr) {
        sArr.getClass();
        return sArr;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88208h(short[] sArr, short s) {
        return ArraysKt.contains(sArr, s);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m88209i(short[] sArr, @NotNull Collection<UShort> collection) {
        collection.getClass();
        Collection<UShort> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof UShort) || !ArraysKt.contains(sArr, ((UShort) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m88210j(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.m88377d(sArr, ((UShortArray) obj).getStorage());
    }

    /* JADX INFO: renamed from: l */
    public static final short m88211l(short[] sArr, int i) {
        return UShort.m88200b(sArr[i]);
    }

    /* JADX INFO: renamed from: p */
    public static int m88212p(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: r */
    public static int m88213r(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m88214s(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static Iterator<UShort> m88215v(short[] sArr) {
        return new C15218a(sArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m88216w(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: x */
    public static String m88217x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m88218g(((UShort) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return m88209i(this.storage, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m88210j(this.storage, other);
    }

    /* JADX INFO: renamed from: g */
    public boolean m88218g(short s) {
        return m88208h(this.storage, s);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m88213r(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m88214s(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UShort> iterator() {
        return m88215v(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m88212p(this.storage);
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
        return m88217x(this.storage);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ short[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m88366a(this);
    }
}
