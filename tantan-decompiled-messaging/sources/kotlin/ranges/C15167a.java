package kotlin.ranges;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import p149l.gcc0;
import p149l.kgj0;

/* JADX INFO: renamed from: kotlin.ranges.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\f\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u000e\u001a\u0019\u0010\u0017\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0011\u001a\u0019\u0010\u0018\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/random/Random;", BLivePkCategory.random, "", "j", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I", "to", "Lkotlin/ranges/IntProgression;", RXScreenCaptureService.KEY_INDEX, "(II)Lkotlin/ranges/IntProgression;", "k", "(II)Lkotlin/ranges/IntRange;", "minimumValue", "b", "(II)I", "", "c", "(JJ)J", "", "a", "(FF)F", "maximumValue", "e", "f", Constants.INAPP_DATA_TAG, "g", "(III)I", "h", "(JJJ)J", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension
public class C15167a extends gcc0 {
    /* JADX INFO: renamed from: a */
    public static float m87595a(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: b */
    public static int m87596b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: c */
    public static long m87597c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* JADX INFO: renamed from: d */
    public static float m87598d(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: e */
    public static int m87599e(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: f */
    public static long m87600f(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* JADX INFO: renamed from: g */
    public static int m87601g(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: h */
    public static long m87602h(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static IntProgression m87603i(int i, int i2) {
        return IntProgression.INSTANCE.m87582a(i, i2, -1);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: j */
    public static int m87604j(@NotNull IntRange intRange, @NotNull Random random) {
        intRange.getClass();
        random.getClass();
        try {
            return RandomKt.m87573g(random, intRange);
        } catch (IllegalArgumentException e) {
            kgj0.m145892a(e.getMessage());
            return 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static IntRange m87605k(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.INSTANCE.m87587a() : new IntRange(i, i2 - 1);
    }
}
