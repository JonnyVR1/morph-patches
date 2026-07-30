package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;
import p149l.eke0;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, m87232d2 = {"Lkotlin/time/TimeSource;", "", "Companion", "WithComparableMarks", "Monotonic", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@WasExperimental
public interface TimeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66667a;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66667a = new Companion();

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m87232d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ValueTimeMark", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin
        @Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0088\u0001\u0016\u0092\u0001\u00060\u0012j\u0002`\u0013¨\u0006\u0017"}, m87232d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "other", "Lkotlin/time/Duration;", "h", "(JLkotlin/time/ComparableTimeMark;)J", "g", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "Lkotlin/time/ValueTimeMarkReading;", "a", "J", "reading", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        @JvmInline
        @WasExperimental
        public static final class ValueTimeMark implements ComparableTimeMark {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long reading;

            /* JADX INFO: renamed from: b */
            public static boolean m93578b(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).getReading();
            }

            /* JADX INFO: renamed from: f */
            public static int m93579f(long j) {
                return Long.hashCode(j);
            }

            /* JADX INFO: renamed from: g */
            public static final long m93580g(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m93577a(j, j2);
            }

            /* JADX INFO: renamed from: h */
            public static long m93581h(long j, @NotNull ComparableTimeMark comparableTimeMark) {
                comparableTimeMark.getClass();
                if (comparableTimeMark instanceof ValueTimeMark) {
                    return m93580g(j, ((ValueTimeMark) comparableTimeMark).getReading());
                }
                eke0.m116959a("Subtracting or comparing time marks from different time sources is not possible: ", m93582i(j), " and ", comparableTimeMark);
                return 0L;
            }

            /* JADX INFO: renamed from: i */
            public static String m93582i(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* bridge */ int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.m93506a(this, comparableTimeMark);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: e */
            public long mo93505e(@NotNull ComparableTimeMark comparableTimeMark) {
                comparableTimeMark.getClass();
                return m93581h(this.reading, comparableTimeMark);
            }

            public boolean equals(Object other) {
                return m93578b(this.reading, other);
            }

            public int hashCode() {
                return m93579f(this.reading);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            public String toString() {
                return m93582i(this.reading);
            }
        }

        private Monotonic() {
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    @SinceKotlin
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @WasExperimental
    public interface WithComparableMarks extends TimeSource {
    }
}
