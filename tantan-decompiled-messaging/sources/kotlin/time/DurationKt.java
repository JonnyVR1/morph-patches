package kotlin.time;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m87232d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "o", "(ILkotlin/time/DurationUnit;)J", "", "p", "(JLkotlin/time/DurationUnit;)J", "nanos", "n", "(J)J", "millis", "m", "normalNanos", "k", "normalMillis", RXScreenCaptureService.KEY_INDEX, "normalValue", "unitDiscriminator", "h", "(JI)J", BLiveStormDanmakuGiftResourceType.f44444l, "j", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DurationKt {
    /* JADX INFO: renamed from: h */
    public static final long m93554h(long j, int i) {
        return Duration.m93528n((j << 1) + ((long) i));
    }

    /* JADX INFO: renamed from: i */
    public static final long m93555i(long j) {
        return Duration.m93528n((j << 1) + 1);
    }

    /* JADX INFO: renamed from: j */
    public static final long m93556j(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? m93555i(C15167a.m87602h(j, -4611686018427387903L, 4611686018427387903L)) : m93557k(m93559m(j));
    }

    /* JADX INFO: renamed from: k */
    public static final long m93557k(long j) {
        return Duration.m93528n(j << 1);
    }

    /* JADX INFO: renamed from: l */
    public static final long m93558l(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? m93555i(m93560n(j)) : m93557k(j);
    }

    /* JADX INFO: renamed from: m */
    public static final long m93559m(long j) {
        return j * 1000000;
    }

    /* JADX INFO: renamed from: n */
    public static final long m93560n(long j) {
        return j / 1000000;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: o */
    public static final long m93561o(int i, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        return durationUnit.compareTo(DurationUnit.SECONDS) <= 0 ? m93557k(DurationUnitKt__DurationUnitJvmKt.m93564b(i, durationUnit, DurationUnit.NANOSECONDS)) : m93562p(i, durationUnit);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: p */
    public static final long m93562p(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long jM93564b = DurationUnitKt__DurationUnitJvmKt.m93564b(4611686018426999999L, durationUnit2, durationUnit);
        return ((-jM93564b) > j || j > jM93564b) ? m93555i(C15167a.m87602h(DurationUnitKt__DurationUnitJvmKt.m93563a(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m93557k(DurationUnitKt__DurationUnitJvmKt.m93564b(j, durationUnit, durationUnit2));
    }
}
