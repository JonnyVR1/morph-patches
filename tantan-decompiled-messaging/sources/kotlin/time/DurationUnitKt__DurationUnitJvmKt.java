package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "b", "(JLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)J", "a", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/time/DurationUnitKt")
public class DurationUnitKt__DurationUnitJvmKt {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66658a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f66658a = iArr;
        }
    }

    @SinceKotlin
    /* JADX INFO: renamed from: a */
    public static final long m93563a(long j, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        durationUnit.getClass();
        durationUnit2.getClass();
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }

    @SinceKotlin
    /* JADX INFO: renamed from: b */
    public static final long m93564b(long j, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        durationUnit.getClass();
        durationUnit2.getClass();
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }
}
