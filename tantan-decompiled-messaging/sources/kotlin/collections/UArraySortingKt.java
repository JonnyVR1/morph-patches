package kotlin.collections;

import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m87232d2 = {"partition", "", "array", "Lkotlin/UByteArray;", BLiveGiftBubblePopupTitlePosition.left, "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m223930partitionnroSd4(long[] jArr, int i, int i2) {
        long jM87299l = ULongArray.m87299l(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m87299l(jArr, i) ^ Long.MIN_VALUE, jM87299l ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m87299l(jArr, i2) ^ Long.MIN_VALUE, jM87299l ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM87299l2 = ULongArray.m87299l(jArr, i);
                ULongArray.m87304w(jArr, i, ULongArray.m87299l(jArr, i2));
                ULongArray.m87304w(jArr, i2, jM87299l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m223931partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM87253l = UByteArray.m87253l(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM87253l & 255;
                if (Intrinsics.m87489e(UByteArray.m87253l(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.m87489e(UByteArray.m87253l(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM87253l2 = UByteArray.m87253l(bArr, i);
                UByteArray.m87258w(bArr, i, UByteArray.m87253l(bArr, i2));
                UByteArray.m87258w(bArr, i2, bM87253l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m223932partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM87322l = UShortArray.m87322l(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = sM87322l & 65535;
                if (Intrinsics.m87489e(UShortArray.m87322l(sArr, i) & 65535, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.m87489e(UShortArray.m87322l(sArr, i2) & 65535, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM87322l2 = UShortArray.m87322l(sArr, i);
                UShortArray.m87327w(sArr, i, UShortArray.m87322l(sArr, i2));
                UShortArray.m87327w(sArr, i2, sM87322l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m223933partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM87276l = UIntArray.m87276l(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m87276l(iArr, i) ^ Integer.MIN_VALUE, iM87276l ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m87276l(iArr, i2) ^ Integer.MIN_VALUE, iM87276l ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM87276l2 = UIntArray.m87276l(iArr, i);
                UIntArray.m87281w(iArr, i, UIntArray.m87276l(iArr, i2));
                UIntArray.m87281w(iArr, i2, iM87276l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m223934quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM223930partitionnroSd4 = m223930partitionnroSd4(jArr, i, i2);
        int i3 = iM223930partitionnroSd4 - 1;
        if (i < i3) {
            m223934quickSortnroSd4(jArr, i, i3);
        }
        if (iM223930partitionnroSd4 < i2) {
            m223934quickSortnroSd4(jArr, iM223930partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m223935quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM223931partition4UcCI2c = m223931partition4UcCI2c(bArr, i, i2);
        int i3 = iM223931partition4UcCI2c - 1;
        if (i < i3) {
            m223935quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM223931partition4UcCI2c < i2) {
            m223935quickSort4UcCI2c(bArr, iM223931partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m223936quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM223932partitionAa5vz7o = m223932partitionAa5vz7o(sArr, i, i2);
        int i3 = iM223932partitionAa5vz7o - 1;
        if (i < i3) {
            m223936quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM223932partitionAa5vz7o < i2) {
            m223936quickSortAa5vz7o(sArr, iM223932partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m223937quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM223933partitionoBK06Vg = m223933partitionoBK06Vg(iArr, i, i2);
        int i3 = iM223933partitionoBK06Vg - 1;
        if (i < i3) {
            m223937quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM223933partitionoBK06Vg < i2) {
            m223937quickSortoBK06Vg(iArr, iM223933partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m223938sortArraynroSd4(@NotNull long[] jArr, int i, int i2) {
        jArr.getClass();
        m223934quickSortnroSd4(jArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m223939sortArray4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        m223935quickSort4UcCI2c(bArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m223940sortArrayAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        sArr.getClass();
        m223936quickSortAa5vz7o(sArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m223941sortArrayoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        iArr.getClass();
        m223937quickSortoBK06Vg(iArr, i, i2 - 1);
    }
}
