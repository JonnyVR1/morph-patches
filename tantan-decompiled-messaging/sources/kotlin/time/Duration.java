package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b$\b\u0087@\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J?\u0010-\u001a\u00020,*\u00060&j\u0002`'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010 \u001a\u00020#2\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0014\u00101\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0014\u00104\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u001a\u0010;\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u001a\u0010A\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b@\u0010:\u001a\u0004\b?\u00108R\u001a\u0010D\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010:\u001a\u0004\bB\u00108R\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010\u0005R\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006P"}, m87232d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "n", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "(J)Z", "H", "Q", "N", "(JJ)J", "thisMillis", "otherNanos", "g", "(JJJ)J", "M", "K", "L", "J", "F", "m", "(JJ)I", "Lkotlin/time/DurationUnit;", "unit", BloodType.f38728O, "(JLkotlin/time/DurationUnit;)J", "", "P", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "h", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "a", "B", "value", "A", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "q", "absoluteValue", "r", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", BaseSei.f13930X, "getMinutesComponent$annotations", "minutesComponent", BaseSei.f13932Z, "getSecondsComponent$annotations", "secondsComponent", BaseSei.f13931Y, "getNanosecondsComponent$annotations", "nanosecondsComponent", BLiveStormDanmakuGiftResourceType.f44446s, "inWholeDays", Constants.KEY_T, "inWholeHours", ResourceDirection.f38808v, "inWholeMinutes", "w", "inWholeSeconds", "u", "inWholeMilliseconds", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmInline
@SourceDebugExtension
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final long f66652b = m93528n(0);

    /* JADX INFO: renamed from: c */
    public static final long f66653c = DurationKt.m93555i(4611686018427387903L);

    /* JADX INFO: renamed from: d */
    public static final long f66654d = DurationKt.m93555i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long rawValue;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m87232d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "Lkotlin/time/Duration;", "ZERO", "J", "c", "()J", "INFINITE", "a", "NEG_INFINITE", "b", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m93543a() {
            return Duration.f66653c;
        }

        /* JADX INFO: renamed from: b */
        public final long m93544b() {
            return Duration.f66654d;
        }

        /* JADX INFO: renamed from: c */
        public final long m93545c() {
            return Duration.f66652b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* JADX INFO: renamed from: A */
    public static final DurationUnit m93507A(long j) {
        return m93512I(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: B */
    public static final long m93508B(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: C */
    public static int m93509C(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m93510F(long j) {
        return !m93513J(j);
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m93511H(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m93512I(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m93513J(long j) {
        return j == f66653c || j == f66654d;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m93514K(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m93515L(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: M */
    public static final long m93516M(long j, long j2) {
        return m93517N(j, m93520Q(j2));
    }

    /* JADX INFO: renamed from: N */
    public static final long m93517N(long j, long j2) {
        if (m93513J(j)) {
            if (m93510F(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            ig3.m135964a("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (m93513J(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m93511H(j) ? m93524g(j, m93508B(j), m93508B(j2)) : m93524g(j, m93508B(j2), m93508B(j));
        }
        long jM93508B = m93508B(j) + m93508B(j2);
        return m93512I(j) ? DurationKt.m93558l(jM93508B) : DurationKt.m93556j(jM93508B);
    }

    /* JADX INFO: renamed from: O */
    public static final long m93518O(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == f66653c) {
            return Long.MAX_VALUE;
        }
        if (j == f66654d) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.m93563a(m93508B(j), m93507A(j), durationUnit);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public static String m93519P(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f66653c) {
            return "Infinity";
        }
        if (j == f66654d) {
            return "-Infinity";
        }
        boolean zM93514K = m93514K(j);
        StringBuilder sb = new StringBuilder();
        if (zM93514K) {
            sb.append('-');
        }
        long jM93531q = m93531q(j);
        long jM93533s = m93533s(jM93531q);
        int iM93532r = m93532r(jM93531q);
        int iM93538x = m93538x(jM93531q);
        int iM93540z = m93540z(jM93531q);
        int iM93539y = m93539y(jM93531q);
        int i = 0;
        boolean z = jM93533s != 0;
        boolean z2 = iM93532r != 0;
        boolean z3 = iM93538x != 0;
        boolean z4 = (iM93540z == 0 && iM93539y == 0) ? false : true;
        if (z) {
            sb.append(jM93533s);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM93532r);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM93538x);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM93540z != 0 || z || z2 || z3) {
                m93525h(j, sb, iM93540z, iM93539y, 9, BLiveStormDanmakuGiftResourceType.f44446s, false);
            } else if (iM93539y >= 1000000) {
                m93525h(j, sb, iM93539y / PlaybackException.CUSTOM_ERROR_CODE_BASE, iM93539y % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms", false);
            } else if (iM93539y >= 1000) {
                m93525h(j, sb, iM93539y / 1000, iM93539y % 1000, 3, "us", false);
            } else {
                sb.append(iM93539y);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM93514K && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static final long m93520Q(long j) {
        return DurationKt.m93554h(-m93508B(j), ((int) j) & 1);
    }

    /* JADX INFO: renamed from: g */
    public static final long m93524g(long j, long j2, long j3) {
        long jM93560n = DurationKt.m93560n(j3);
        long j4 = j2 + jM93560n;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return DurationKt.m93555i(C15167a.m87602h(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.m93557k(DurationKt.m93559m(j4) + (j3 - DurationKt.m93559m(jM93560n)));
    }

    /* JADX INFO: renamed from: h */
    public static final void m93525h(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strO0 = StringsKt.m93448o0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strO0, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ Duration m93526i(long j) {
        return new Duration(j);
    }

    /* JADX INFO: renamed from: m */
    public static int m93527m(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.m87490f(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m93514K(j) ? -i : i;
    }

    /* JADX INFO: renamed from: n */
    public static long m93528n(long j) {
        if (!DurationJvmKt.m93546a()) {
            return j;
        }
        if (m93512I(j)) {
            long jM93508B = m93508B(j);
            if (-4611686018426999999L <= jM93508B && jM93508B < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(m93508B(j) + " ns is out of nanoseconds range");
        }
        long jM93508B2 = m93508B(j);
        if (-4611686018427387903L > jM93508B2 || jM93508B2 >= 4611686018427387904L) {
            throw new AssertionError(m93508B(j) + " ms is out of milliseconds range");
        }
        long jM93508B3 = m93508B(j);
        if (-4611686018426L > jM93508B3 || jM93508B3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(m93508B(j) + " ms is denormalized");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m93529o(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m93530p(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: q */
    public static final long m93531q(long j) {
        return m93514K(j) ? m93520Q(j) : j;
    }

    /* JADX INFO: renamed from: r */
    public static final int m93532r(long j) {
        if (m93513J(j)) {
            return 0;
        }
        return (int) (m93534t(j) % 24);
    }

    /* JADX INFO: renamed from: s */
    public static final long m93533s(long j) {
        return m93518O(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: t */
    public static final long m93534t(long j) {
        return m93518O(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: u */
    public static final long m93535u(long j) {
        return (m93511H(j) && m93510F(j)) ? m93508B(j) : m93518O(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: v */
    public static final long m93536v(long j) {
        return m93518O(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: w */
    public static final long m93537w(long j) {
        return m93518O(j, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: x */
    public static final int m93538x(long j) {
        if (m93513J(j)) {
            return 0;
        }
        return (int) (m93536v(j) % 60);
    }

    /* JADX INFO: renamed from: y */
    public static final int m93539y(long j) {
        if (m93513J(j)) {
            return 0;
        }
        return (int) (m93511H(j) ? DurationKt.m93559m(m93508B(j) % 1000) : m93508B(j) % 1000000000);
    }

    /* JADX INFO: renamed from: z */
    public static final int m93540z(long j) {
        if (m93513J(j)) {
            return 0;
        }
        return (int) (m93537w(j) % 60);
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m93542j(duration.getRawValue());
    }

    public boolean equals(Object other) {
        return m93529o(this.rawValue, other);
    }

    public int hashCode() {
        return m93509C(this.rawValue);
    }

    /* JADX INFO: renamed from: j */
    public int m93542j(long j) {
        return m93527m(this.rawValue, j);
    }

    @NotNull
    public String toString() {
        return m93519P(this.rawValue);
    }
}
