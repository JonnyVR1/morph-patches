package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.AbstractLongTimeSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wwq0;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, m88121d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "f", "()J", "Lkotlin/time/ComparableTimeMark;", "e", "()Lkotlin/time/ComparableTimeMark;", "b", "a", "Lkotlin/time/DurationUnit;", "c", "()Lkotlin/time/DurationUnit;", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "zero", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@WasExperimental
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DurationUnit unit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy zero;

    public AbstractLongTimeSource(@NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        this.unit = durationUnit;
        this.zero = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.j7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(AbstractLongTimeSource.m94389a(this.f118619a));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static long m94389a(AbstractLongTimeSource abstractLongTimeSource) {
        return abstractLongTimeSource.mo94394f();
    }

    /* JADX INFO: renamed from: b */
    public final long m94390b() {
        return mo94394f() - m94392d();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final DurationUnit getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: d */
    public final long m94392d() {
        return ((Number) this.zero.getValue()).longValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public ComparableTimeMark m94393e() {
        return new C15498a(m94390b(), this, Duration.INSTANCE.m94436c(), null);
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo94394f();

    /* JADX INFO: renamed from: kotlin.time.AbstractLongTimeSource$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m88121d2 = {"Lkotlin/time/AbstractLongTimeSource$a;", "Lkotlin/time/ComparableTimeMark;", "", "startedAt", "Lkotlin/time/AbstractLongTimeSource;", "timeSource", "Lkotlin/time/Duration;", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "e", "(Lkotlin/time/ComparableTimeMark;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "Lkotlin/time/AbstractLongTimeSource;", "c", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15498a implements ComparableTimeMark {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long startedAt;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractLongTimeSource timeSource;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long offset;

        public C15498a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2) {
            abstractLongTimeSource.getClass();
            this.startedAt = j;
            this.timeSource = abstractLongTimeSource;
            this.offset = j2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public /* bridge */ int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.m94397a(this, comparableTimeMark);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: e */
        public long mo94396e(@NotNull ComparableTimeMark other) {
            other.getClass();
            if (other instanceof C15498a) {
                C15498a c15498a = (C15498a) other;
                if (Intrinsics.m88377d(this.timeSource, c15498a.timeSource)) {
                    return Duration.m94408N(LongSaturatedMathKt.m94467c(this.startedAt, c15498a.startedAt, this.timeSource.getUnit()), Duration.m94407M(this.offset, c15498a.offset));
                }
            }
            wwq0.m208289a("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", other);
            return 0L;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof C15498a) && Intrinsics.m88377d(this.timeSource, ((C15498a) other).timeSource) && Duration.m94421p(mo94396e((ComparableTimeMark) other), Duration.INSTANCE.m94436c());
        }

        public int hashCode() {
            return (Duration.m94400C(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.m94456c(this.timeSource.getUnit()) + " + " + ((Object) Duration.m94410P(this.offset)) + ", " + this.timeSource + ')';
        }

        public /* synthetic */ C15498a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }
    }
}
