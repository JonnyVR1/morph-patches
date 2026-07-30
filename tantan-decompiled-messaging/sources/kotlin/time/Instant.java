package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\u0019\u0010!\u001a\u00020\"2\n\u0010#\u001a\u00060$j\u0002`%H\u0002¢\u0006\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, m87232d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toEpochMilliseconds", "plus", BLiveOperationTitleShowType.duration, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "equals", "", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
@ExperimentalTime
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Instant MIN = new Instant(-31557014167219200L, 0);

    @NotNull
    private static final Instant MAX = new Instant(31556889864403199L, 999999999);

    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m87232d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "", "epochSeconds", "nanosecondAdjustment", "Lkotlin/time/Instant;", "b", "(JJ)Lkotlin/time/Instant;", "", "a", "(JI)Lkotlin/time/Instant;", "MIN", "Lkotlin/time/Instant;", Constants.INAPP_DATA_TAG, "()Lkotlin/time/Instant;", "MAX", "c", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Instant m93566a(long epochSeconds, int nanosecondAdjustment) {
            return m93567b(epochSeconds, nanosecondAdjustment);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Instant m93567b(long epochSeconds, long nanosecondAdjustment) {
            long j = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j * 1000000000 != nanosecondAdjustment) {
                j--;
            }
            long j2 = epochSeconds + j;
            if ((epochSeconds ^ j2) < 0 && (j ^ epochSeconds) >= 0) {
                return epochSeconds > 0 ? Instant.INSTANCE.m93568c() : Instant.INSTANCE.m93569d();
            }
            if (j2 < -31557014167219200L) {
                return m93569d();
            }
            if (j2 > 31556889864403199L) {
                return m93568c();
            }
            long j3 = nanosecondAdjustment % 1000000000;
            return new Instant(j2, (int) (j3 + ((((j3 ^ 1000000000) & ((-j3) | j3)) >> 63) & 1000000000)));
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Instant m93568c() {
            return Instant.MAX;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Instant m93569d() {
            return Instant.MIN;
        }

        private Companion() {
        }
    }

    public Instant(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            ig3.m135964a("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return InstantJvmKt.m93570a(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Instant other) {
        other.getClass();
        int iM87490f = Intrinsics.m87490f(this.epochSeconds, other.epochSeconds);
        return iM87490f != 0 ? iM87490f : Intrinsics.m87489e(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m224659minusLRDsOJo(long duration) {
        return m224661plusLRDsOJo(Duration.m93520Q(duration));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m224660minusUwyO8pc(@NotNull Instant other) {
        other.getClass();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m93517N(DurationKt.m93562p(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS), DurationKt.m93561o(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m224661plusLRDsOJo(long duration) {
        long jM93537w = Duration.m93537w(duration);
        int iM93539y = Duration.m93539y(duration);
        if (jM93537w == 0 && iM93539y == 0) {
            return this;
        }
        long j = this.epochSeconds;
        long j2 = j + jM93537w;
        if ((j ^ j2) >= 0 || (jM93537w ^ j) < 0) {
            return INSTANCE.m93566a(j2, this.nanosecondsOfSecond + iM93539y);
        }
        return Duration.m93515L(duration) ? MAX : MIN;
    }

    public final long toEpochMilliseconds() {
        long j = this.epochSeconds;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.nanosecondsOfSecond / PlaybackException.CUSTOM_ERROR_CODE_BASE;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.nanosecondsOfSecond / PlaybackException.CUSTOM_ERROR_CODE_BASE) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    @NotNull
    public String toString() {
        return InstantKt.m93572b(this);
    }
}
