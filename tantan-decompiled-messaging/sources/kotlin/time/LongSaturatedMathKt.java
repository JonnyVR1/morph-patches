package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, m87232d2 = {"", "value", "Lkotlin/time/Duration;", "a", "(J)J", "origin1", "origin2", "Lkotlin/time/DurationUnit;", "unit", "c", "(JJLkotlin/time/DurationUnit;)J", "value1", "value2", "b", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: a */
    public static final long m93574a(long j) {
        return j < 0 ? Duration.INSTANCE.m93544b() : Duration.INSTANCE.m93543a();
    }

    /* JADX INFO: renamed from: b */
    public static final long m93575b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.m93562p(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m93520Q(m93574a(j3));
        }
        long jM93563a = DurationUnitKt__DurationUnitJvmKt.m93563a(1L, durationUnit2, durationUnit);
        long j4 = (j / jM93563a) - (j2 / jM93563a);
        long j5 = (j % jM93563a) - (j2 % jM93563a);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m93517N(DurationKt.m93562p(j4, durationUnit2), DurationKt.m93562p(j5, durationUnit));
    }

    /* JADX INFO: renamed from: c */
    public static final long m93576c(long j, long j2, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return j == j2 ? Duration.INSTANCE.m93545c() : Duration.m93520Q(m93574a(j2));
        }
        return (1 | (j - 1)) == Long.MAX_VALUE ? m93574a(j) : m93575b(j, j2, durationUnit);
    }
}
