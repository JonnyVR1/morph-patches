package kotlin.time;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m88121d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "o", "(ILkotlin/time/DurationUnit;)J", "", "p", "(JLkotlin/time/DurationUnit;)J", "nanos", "n", "(J)J", "millis", "m", "normalNanos", "k", "normalMillis", RXScreenCaptureService.KEY_INDEX, "normalValue", "unitDiscriminator", "h", "(JI)J", BLiveStormDanmakuGiftResourceType.f45292l, "j", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DurationKt {
    /* JADX INFO: renamed from: h */
    public static final long m94445h(long j, int i) {
        return Duration.m94419n((j << 1) + ((long) i));
    }

    /* JADX INFO: renamed from: i */
    public static final long m94446i(long j) {
        return Duration.m94419n((j << 1) + 1);
    }

    /* JADX INFO: renamed from: j */
    public static final long m94447j(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? m94446i(C15274a.m88493i(j, -4611686018427387903L, 4611686018427387903L)) : m94448k(m94450m(j));
    }

    /* JADX INFO: renamed from: k */
    public static final long m94448k(long j) {
        return Duration.m94419n(j << 1);
    }

    /* JADX INFO: renamed from: l */
    public static final long m94449l(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? m94446i(m94451n(j)) : m94448k(j);
    }

    /* JADX INFO: renamed from: m */
    public static final long m94450m(long j) {
        return j * 1000000;
    }

    /* JADX INFO: renamed from: n */
    public static final long m94451n(long j) {
        return j / 1000000;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: o */
    public static final long m94452o(int i, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        return durationUnit.compareTo(DurationUnit.SECONDS) <= 0 ? m94448k(DurationUnitKt__DurationUnitJvmKt.m94455b(i, durationUnit, DurationUnit.NANOSECONDS)) : m94453p(i, durationUnit);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: p */
    public static final long m94453p(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long jM94455b = DurationUnitKt__DurationUnitJvmKt.m94455b(4611686018426999999L, durationUnit2, durationUnit);
        return ((-jM94455b) > j || j > jM94455b) ? m94446i(C15274a.m88493i(DurationUnitKt__DurationUnitJvmKt.m94454a(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m94448k(DurationUnitKt__DurationUnitJvmKt.m94455b(j, durationUnit, durationUnit2));
    }
}
