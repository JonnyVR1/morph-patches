package kotlin.time;

import com.momo.mcamera.mask.Sticker;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", Sticker.GESTURE_TYPE_ONE, "another", "Lkotlin/time/Duration;", "a", "(JJ)J", "", "J", "zero", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    /* JADX INFO: renamed from: a */
    public final long m94468a(long one, long another) {
        return LongSaturatedMathKt.m94467c(one, another, DurationUnit.NANOSECONDS);
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
