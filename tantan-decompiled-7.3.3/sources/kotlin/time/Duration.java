package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b$\b\u0087@\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J?\u0010-\u001a\u00020,*\u00060&j\u0002`'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010 \u001a\u00020#2\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0014\u00101\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0014\u00104\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u001a\u0010;\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u001a\u0010A\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b@\u0010:\u001a\u0004\b?\u00108R\u001a\u0010D\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010:\u001a\u0004\bB\u00108R\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010\u0005R\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006P"}, m88121d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "n", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "(J)Z", "H", "Q", "N", "(JJ)J", "thisMillis", "otherNanos", "g", "(JJJ)J", "M", "K", "L", "J", "F", "m", "(JJ)I", "Lkotlin/time/DurationUnit;", "unit", BloodType.f39576O, "(JLkotlin/time/DurationUnit;)J", "", "P", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "h", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "a", "B", "value", "A", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "q", "absoluteValue", "r", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", BaseSei.f14624X, "getMinutesComponent$annotations", "minutesComponent", BaseSei.f14626Z, "getSecondsComponent$annotations", "secondsComponent", BaseSei.f14625Y, "getNanosecondsComponent$annotations", "nanosecondsComponent", BLiveStormDanmakuGiftResourceType.f45294s, "inWholeDays", Constants.KEY_T, "inWholeHours", ResourceDirection.f39656v, "inWholeMinutes", "w", "inWholeSeconds", "u", "inWholeMilliseconds", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmInline
@SourceDebugExtension
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final long f67326b = m94419n(0);

    /* JADX INFO: renamed from: c */
    public static final long f67327c = DurationKt.m94446i(4611686018427387903L);

    /* JADX INFO: renamed from: d */
    public static final long f67328d = DurationKt.m94446i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long rawValue;

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m88121d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "Lkotlin/time/Duration;", "ZERO", "J", "c", "()J", "INFINITE", "a", "NEG_INFINITE", "b", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m94434a() {
            return Duration.f67327c;
        }

        /* JADX INFO: renamed from: b */
        public final long m94435b() {
            return Duration.f67328d;
        }

        /* JADX INFO: renamed from: c */
        public final long m94436c() {
            return Duration.f67326b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* JADX INFO: renamed from: A */
    public static final DurationUnit m94398A(long j) {
        return m94403I(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: B */
    public static final long m94399B(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: C */
    public static int m94400C(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m94401F(long j) {
        return !m94404J(j);
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m94402H(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m94403I(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m94404J(long j) {
        return j == f67327c || j == f67328d;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m94405K(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m94406L(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: M */
    public static final long m94407M(long j, long j2) {
        return m94408N(j, m94411Q(j2));
    }

    /* JADX INFO: renamed from: N */
    public static final long m94408N(long j, long j2) {
        if (m94404J(j)) {
            if (m94401F(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            wg3.m206174a("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (m94404J(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m94402H(j) ? m94415g(j, m94399B(j), m94399B(j2)) : m94415g(j, m94399B(j2), m94399B(j));
        }
        long jM94399B = m94399B(j) + m94399B(j2);
        return m94403I(j) ? DurationKt.m94449l(jM94399B) : DurationKt.m94447j(jM94399B);
    }

    /* JADX INFO: renamed from: O */
    public static final long m94409O(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == f67327c) {
            return Long.MAX_VALUE;
        }
        if (j == f67328d) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.m94454a(m94399B(j), m94398A(j), durationUnit);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public static String m94410P(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f67327c) {
            return "Infinity";
        }
        if (j == f67328d) {
            return "-Infinity";
        }
        boolean zM94405K = m94405K(j);
        StringBuilder sb = new StringBuilder();
        if (zM94405K) {
            sb.append('-');
        }
        long jM94422q = m94422q(j);
        long jM94424s = m94424s(jM94422q);
        int iM94423r = m94423r(jM94422q);
        int iM94429x = m94429x(jM94422q);
        int iM94431z = m94431z(jM94422q);
        int iM94430y = m94430y(jM94422q);
        int i = 0;
        boolean z = jM94424s != 0;
        boolean z2 = iM94423r != 0;
        boolean z3 = iM94429x != 0;
        boolean z4 = (iM94431z == 0 && iM94430y == 0) ? false : true;
        if (z) {
            sb.append(jM94424s);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM94423r);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM94429x);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM94431z != 0 || z || z2 || z3) {
                m94416h(j, sb, iM94431z, iM94430y, 9, BLiveStormDanmakuGiftResourceType.f45294s, false);
            } else if (iM94430y >= 1000000) {
                m94416h(j, sb, iM94430y / PlaybackException.CUSTOM_ERROR_CODE_BASE, iM94430y % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms", false);
            } else if (iM94430y >= 1000) {
                m94416h(j, sb, iM94430y / 1000, iM94430y % 1000, 3, "us", false);
            } else {
                sb.append(iM94430y);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM94405K && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static final long m94411Q(long j) {
        return DurationKt.m94445h(-m94399B(j), ((int) j) & 1);
    }

    /* JADX INFO: renamed from: g */
    public static final long m94415g(long j, long j2, long j3) {
        long jM94451n = DurationKt.m94451n(j3);
        long j4 = j2 + jM94451n;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return DurationKt.m94446i(C15274a.m88493i(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.m94448k(DurationKt.m94450m(j4) + (j3 - DurationKt.m94450m(jM94451n)));
    }

    /* JADX INFO: renamed from: h */
    public static final void m94416h(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strO0 = StringsKt.m94339o0(String.valueOf(i2), i3, '0');
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
    public static final /* synthetic */ Duration m94417i(long j) {
        return new Duration(j);
    }

    /* JADX INFO: renamed from: m */
    public static int m94418m(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.m88379f(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m94405K(j) ? -i : i;
    }

    /* JADX INFO: renamed from: n */
    public static long m94419n(long j) {
        if (!DurationJvmKt.m94437a()) {
            return j;
        }
        if (m94403I(j)) {
            long jM94399B = m94399B(j);
            if (-4611686018426999999L <= jM94399B && jM94399B < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(m94399B(j) + " ns is out of nanoseconds range");
        }
        long jM94399B2 = m94399B(j);
        if (-4611686018427387903L > jM94399B2 || jM94399B2 >= 4611686018427387904L) {
            throw new AssertionError(m94399B(j) + " ms is out of milliseconds range");
        }
        long jM94399B3 = m94399B(j);
        if (-4611686018426L > jM94399B3 || jM94399B3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(m94399B(j) + " ms is denormalized");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m94420o(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m94421p(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: q */
    public static final long m94422q(long j) {
        return m94405K(j) ? m94411Q(j) : j;
    }

    /* JADX INFO: renamed from: r */
    public static final int m94423r(long j) {
        if (m94404J(j)) {
            return 0;
        }
        return (int) (m94425t(j) % 24);
    }

    /* JADX INFO: renamed from: s */
    public static final long m94424s(long j) {
        return m94409O(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: t */
    public static final long m94425t(long j) {
        return m94409O(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: u */
    public static final long m94426u(long j) {
        return (m94402H(j) && m94401F(j)) ? m94399B(j) : m94409O(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: v */
    public static final long m94427v(long j) {
        return m94409O(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: w */
    public static final long m94428w(long j) {
        return m94409O(j, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: x */
    public static final int m94429x(long j) {
        if (m94404J(j)) {
            return 0;
        }
        return (int) (m94427v(j) % 60);
    }

    /* JADX INFO: renamed from: y */
    public static final int m94430y(long j) {
        if (m94404J(j)) {
            return 0;
        }
        return (int) (m94402H(j) ? DurationKt.m94450m(m94399B(j) % 1000) : m94399B(j) % 1000000000);
    }

    /* JADX INFO: renamed from: z */
    public static final int m94431z(long j) {
        if (m94404J(j)) {
            return 0;
        }
        return (int) (m94428w(j) % 60);
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m94433j(duration.getRawValue());
    }

    public boolean equals(Object other) {
        return m94420o(this.rawValue, other);
    }

    public int hashCode() {
        return m94400C(this.rawValue);
    }

    /* JADX INFO: renamed from: j */
    public int m94433j(long j) {
        return m94418m(this.rawValue, j);
    }

    @NotNull
    public String toString() {
        return m94410P(this.rawValue);
    }
}
