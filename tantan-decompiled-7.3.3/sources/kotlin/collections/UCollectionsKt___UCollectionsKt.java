package kotlin.collections;

import com.p051p1.mobile.putong.data.BannerFrequencyType;
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
@Metadata(m88120d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m88121d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", BannerFrequencyType.sum, "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin
    @JvmName
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        iterable.getClass();
        Iterator<UByte> it = iterable.iterator();
        int iM88154b = 0;
        while (it.hasNext()) {
            iM88154b = UInt.m88154b(iM88154b + UInt.m88154b(it.next().getData() & 255));
        }
        return iM88154b;
    }

    @SinceKotlin
    @JvmName
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        iterable.getClass();
        Iterator<UInt> it = iterable.iterator();
        int iM88154b = 0;
        while (it.hasNext()) {
            iM88154b = UInt.m88154b(iM88154b + it.next().getData());
        }
        return iM88154b;
    }

    @SinceKotlin
    @JvmName
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        iterable.getClass();
        Iterator<ULong> it = iterable.iterator();
        long jM88177b = 0;
        while (it.hasNext()) {
            jM88177b = ULong.m88177b(jM88177b + it.next().getData());
        }
        return jM88177b;
    }

    @SinceKotlin
    @JvmName
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        iterable.getClass();
        Iterator<UShort> it = iterable.iterator();
        int iM88154b = 0;
        while (it.hasNext()) {
            iM88154b = UInt.m88154b(iM88154b + UInt.m88154b(it.next().getData() & 65535));
        }
        return iM88154b;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        collection.getClass();
        byte[] bArrM88137c = UByteArray.m88137c(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UByteArray.m88147w(bArrM88137c, i, it.next().getData());
            i++;
        }
        return bArrM88137c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        collection.getClass();
        int[] iArrM88160c = UIntArray.m88160c(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UIntArray.m88170w(iArrM88160c, i, it.next().getData());
            i++;
        }
        return iArrM88160c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        collection.getClass();
        long[] jArrM88183c = ULongArray.m88183c(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ULongArray.m88193w(jArrM88183c, i, it.next().getData());
            i++;
        }
        return jArrM88183c;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        collection.getClass();
        short[] sArrM88206c = UShortArray.m88206c(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            UShortArray.m88216w(sArrM88206c, i, it.next().getData());
            i++;
        }
        return sArrM88206c;
    }
}
