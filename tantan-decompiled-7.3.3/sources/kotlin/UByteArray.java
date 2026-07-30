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
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, m88121d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "", "size", "c", "(I)[B", "", PlaceTypes.STORAGE, "f", "([B)[B", FirebaseAnalytics.Param.INDEX, BLiveStormDanmakuGiftResourceType.f45292l, "([BI)B", "value", "", "w", "([BIB)V", "", ResourceDirection.f39656v, "([B)Ljava/util/Iterator;", "element", "", "h", "([BB)Z", "elements", RXScreenCaptureService.KEY_INDEX, "([BLjava/util/Collection;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "([B)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getStorage$annotations", "()V", "p", "([B)I", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
public final class UByteArray implements Collection<UByte>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byte[] storage;

    /* JADX INFO: renamed from: kotlin.UByteArray$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lkotlin/UByteArray$a;", "", "Lkotlin/UByte;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "a", "()B", "[B", "", "b", "I", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15215a implements Iterator<UByte>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final byte[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public C15215a(@NotNull byte[] bArr) {
            bArr.getClass();
            this.array = bArr;
        }

        /* JADX INFO: renamed from: a */
        public byte m88152a() {
            int i = this.index;
            byte[] bArr = this.array;
            if (i < bArr.length) {
                this.index = i + 1;
                return UByte.m88131b(bArr[i]);
            }
            npj0.m164229a(String.valueOf(i));
            return (byte) 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.m88130a(m88152a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UByteArray m88136a(byte[] bArr) {
        return new UByteArray(bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static byte[] m88137c(int i) {
        return m88138f(new byte[i]);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: f */
    public static byte[] m88138f(@NotNull byte[] bArr) {
        bArr.getClass();
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88139h(byte[] bArr, byte b) {
        return ArraysKt.contains(bArr, b);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m88140i(byte[] bArr, @NotNull Collection<UByte> collection) {
        collection.getClass();
        Collection<UByte> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof UByte) || !ArraysKt.contains(bArr, ((UByte) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m88141j(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.m88377d(bArr, ((UByteArray) obj).getStorage());
    }

    /* JADX INFO: renamed from: l */
    public static final byte m88142l(byte[] bArr, int i) {
        return UByte.m88131b(bArr[i]);
    }

    /* JADX INFO: renamed from: p */
    public static int m88143p(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: renamed from: r */
    public static int m88144r(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m88145s(byte[] bArr) {
        return bArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static Iterator<UByte> m88146v(byte[] bArr) {
        return new C15215a(bArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m88147w(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: x */
    public static String m88148x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m88149g(((UByte) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return m88140i(this.storage, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m88141j(this.storage, other);
    }

    /* JADX INFO: renamed from: g */
    public boolean m88149g(byte b) {
        return m88139h(this.storage, b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m88144r(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m88145s(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UByte> iterator() {
        return m88146v(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m88143p(this.storage);
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
        return m88148x(this.storage);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ byte[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m88366a(this);
    }
}
