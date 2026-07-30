package kotlin.collections;

import com.p046p1.mobile.putong.data.BannerFrequencyType;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m87232d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", BannerFrequencyType.sum, "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin
    @JvmName
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        iterable.getClass();
        Iterator<UByte> it = iterable.iterator();
        int iM87265b = 0;
        while (it.hasNext()) {
            iM87265b = UInt.m87265b(iM87265b + UInt.m87265b(it.next().getData() & 255));
        }
        return iM87265b;
    }

    @SinceKotlin
    @JvmName
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        iterable.getClass();
        Iterator<UInt> it = iterable.iterator();
        int iM87265b = 0;
        while (it.hasNext()) {
            iM87265b = UInt.m87265b(iM87265b + it.next().getData());
        }
        return iM87265b;
    }

    @SinceKotlin
    @JvmName
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        iterable.getClass();
        Iterator<ULong> it = iterable.iterator();
        long jM87288b = 0;
        while (it.hasNext()) {
            jM87288b = ULong.m87288b(jM87288b + it.next().getData());
        }
        return jM87288b;
    }

    @SinceKotlin
    @JvmName
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        iterable.getClass();
        Iterator<UShort> it = iterable.iterator();
        int iM87265b = 0;
        while (it.hasNext()) {
            iM87265b = UInt.m87265b(iM87265b + UInt.m87265b(it.next().getData() & 65535));
        }
        return iM87265b;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        collection.getClass();
        byte[] bArrM87248c = UByteArray.m87248c(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UByteArray.m87258w(bArrM87248c, i, it.next().getData());
            i++;
        }
        return bArrM87248c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        collection.getClass();
        int[] iArrM87271c = UIntArray.m87271c(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UIntArray.m87281w(iArrM87271c, i, it.next().getData());
            i++;
        }
        return iArrM87271c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        collection.getClass();
        long[] jArrM87294c = ULongArray.m87294c(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ULongArray.m87304w(jArrM87294c, i, it.next().getData());
            i++;
        }
        return jArrM87294c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        collection.getClass();
        short[] sArrM87317c = UShortArray.m87317c(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UShortArray.m87327w(sArrM87317c, i, it.next().getData());
            i++;
        }
        return sArrM87317c;
    }
}
