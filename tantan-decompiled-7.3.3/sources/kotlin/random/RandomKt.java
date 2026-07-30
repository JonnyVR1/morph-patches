package kotlin.random;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"", "seed", "Lkotlin/random/Random;", "a", "(J)Lkotlin/random/Random;", "Lkotlin/ranges/IntRange;", "range", "", "g", "(Lkotlin/random/Random;Lkotlin/ranges/IntRange;)I", "value", "f", "(I)I", "bitCount", "h", "(II)I", "from", "until", "", Constants.INAPP_DATA_TAG, "(II)V", "e", "(JJ)V", "", "c", "(DD)V", "", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RandomKt {
    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Random m88457a(long j) {
        return new XorWowRandom((int) j, (int) (j >> 32));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m88458b(@NotNull Object obj, @NotNull Object obj2) {
        obj.getClass();
        obj2.getClass();
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* JADX INFO: renamed from: c */
    public static final void m88459c(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(m88458b(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m88460d(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(m88458b(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88461e(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(m88458b(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m88462f(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: g */
    public static final int m88463g(@NotNull Random random, @NotNull IntRange intRange) {
        random.getClass();
        intRange.getClass();
        if (intRange.isEmpty()) {
            ypg0.m217021a("Cannot get random in empty range: ", intRange);
            return 0;
        }
        if (intRange.getLast() < Integer.MAX_VALUE) {
            return random.nextInt(intRange.getFirst(), intRange.getLast() + 1);
        }
        return intRange.getFirst() > Integer.MIN_VALUE ? random.nextInt(intRange.getFirst() - 1, intRange.getLast()) + 1 : random.nextInt();
    }

    /* JADX INFO: renamed from: h */
    public static final int m88464h(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
