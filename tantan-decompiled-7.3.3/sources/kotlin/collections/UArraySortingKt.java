package kotlin.collections;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m88121d2 = {"partition", "", "array", "Lkotlin/UByteArray;", BLiveGiftBubblePopupTitlePosition.left, "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m225176partitionnroSd4(long[] jArr, int i, int i2) {
        long jM88188l = ULongArray.m88188l(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m88188l(jArr, i) ^ Long.MIN_VALUE, jM88188l ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m88188l(jArr, i2) ^ Long.MIN_VALUE, jM88188l ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM88188l2 = ULongArray.m88188l(jArr, i);
                ULongArray.m88193w(jArr, i, ULongArray.m88188l(jArr, i2));
                ULongArray.m88193w(jArr, i2, jM88188l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m225177partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM88142l = UByteArray.m88142l(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM88142l & 255;
                if (Intrinsics.m88378e(UByteArray.m88142l(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.m88378e(UByteArray.m88142l(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM88142l2 = UByteArray.m88142l(bArr, i);
                UByteArray.m88147w(bArr, i, UByteArray.m88142l(bArr, i2));
                UByteArray.m88147w(bArr, i2, bM88142l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m225178partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM88211l = UShortArray.m88211l(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = sM88211l & 65535;
                if (Intrinsics.m88378e(UShortArray.m88211l(sArr, i) & 65535, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.m88378e(UShortArray.m88211l(sArr, i2) & 65535, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM88211l2 = UShortArray.m88211l(sArr, i);
                UShortArray.m88216w(sArr, i, UShortArray.m88211l(sArr, i2));
                UShortArray.m88216w(sArr, i2, sM88211l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m225179partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM88165l = UIntArray.m88165l(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m88165l(iArr, i) ^ Integer.MIN_VALUE, iM88165l ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m88165l(iArr, i2) ^ Integer.MIN_VALUE, iM88165l ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM88165l2 = UIntArray.m88165l(iArr, i);
                UIntArray.m88170w(iArr, i, UIntArray.m88165l(iArr, i2));
                UIntArray.m88170w(iArr, i2, iM88165l2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m225180quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM225176partitionnroSd4 = m225176partitionnroSd4(jArr, i, i2);
        int i3 = iM225176partitionnroSd4 - 1;
        if (i < i3) {
            m225180quickSortnroSd4(jArr, i, i3);
        }
        if (iM225176partitionnroSd4 < i2) {
            m225180quickSortnroSd4(jArr, iM225176partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m225181quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM225177partition4UcCI2c = m225177partition4UcCI2c(bArr, i, i2);
        int i3 = iM225177partition4UcCI2c - 1;
        if (i < i3) {
            m225181quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM225177partition4UcCI2c < i2) {
            m225181quickSort4UcCI2c(bArr, iM225177partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m225182quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM225178partitionAa5vz7o = m225178partitionAa5vz7o(sArr, i, i2);
        int i3 = iM225178partitionAa5vz7o - 1;
        if (i < i3) {
            m225182quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM225178partitionAa5vz7o < i2) {
            m225182quickSortAa5vz7o(sArr, iM225178partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m225183quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM225179partitionoBK06Vg = m225179partitionoBK06Vg(iArr, i, i2);
        int i3 = iM225179partitionoBK06Vg - 1;
        if (i < i3) {
            m225183quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM225179partitionoBK06Vg < i2) {
            m225183quickSortoBK06Vg(iArr, iM225179partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m225184sortArraynroSd4(@NotNull long[] jArr, int i, int i2) {
        jArr.getClass();
        m225180quickSortnroSd4(jArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m225185sortArray4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        m225181quickSort4UcCI2c(bArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m225186sortArrayAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        sArr.getClass();
        m225182quickSortAa5vz7o(sArr, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m225187sortArrayoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        iArr.getClass();
        m225183quickSortoBK06Vg(iArr, i, i2 - 1);
    }
}
