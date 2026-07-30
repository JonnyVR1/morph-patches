package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, m88121d2 = {"", "value", "Lkotlin/time/Duration;", "a", "(J)J", "origin1", "origin2", "Lkotlin/time/DurationUnit;", "unit", "c", "(JJLkotlin/time/DurationUnit;)J", "value1", "value2", "b", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: a */
    public static final long m94465a(long j) {
        return j < 0 ? Duration.INSTANCE.m94435b() : Duration.INSTANCE.m94434a();
    }

    /* JADX INFO: renamed from: b */
    public static final long m94466b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.m94453p(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m94411Q(m94465a(j3));
        }
        long jM94454a = DurationUnitKt__DurationUnitJvmKt.m94454a(1L, durationUnit2, durationUnit);
        long j4 = (j / jM94454a) - (j2 / jM94454a);
        long j5 = (j % jM94454a) - (j2 % jM94454a);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m94408N(DurationKt.m94453p(j4, durationUnit2), DurationKt.m94453p(j5, durationUnit));
    }

    /* JADX INFO: renamed from: c */
    public static final long m94467c(long j, long j2, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return j == j2 ? Duration.INSTANCE.m94436c() : Duration.m94411Q(m94465a(j2));
        }
        return (1 | (j - 1)) == Long.MAX_VALUE ? m94465a(j) : m94466b(j, j2, durationUnit);
    }
}
