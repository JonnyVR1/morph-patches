package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class mwm {

    /* JADX INFO: renamed from: a */
    public static final byte[] f136066a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final int[] f136067b = {1, 10, 100, 1000, 10000, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY, PlaybackException.CUSTOM_ERROR_CODE_BASE, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: c */
    public static final int[] f136068c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: d */
    public static final int[] f136069d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e */
    public static int[] f136070e = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: l.mwm$a */
    public static /* synthetic */ class C18578a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f136071a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f136071a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136071a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136071a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f136071a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f136071a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f136071a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f136071a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f136071a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m156750a(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        hex.m130712b(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m156751b(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        int i3 = (int) j;
        hex.m130712b(j == ((long) i3), "checkedMultiply", i, i2);
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: c */
    public static int m156752c(int i, int i2, RoundingMode roundingMode) {
        sf80.m183894p(roundingMode);
        if (i2 == 0) {
            lwm.m151979a("/ by zero");
            return 0;
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (C18578a.f136071a[roundingMode.ordinal()]) {
            case 1:
                hex.m130715e(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                return i3 + i5;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                return i3 + i5;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                return i3 + i5;
            default:
                shg0.m184191a();
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m156753d(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    /* JADX INFO: renamed from: e */
    public static int m156754e(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* JADX INFO: renamed from: f */
    public static int m156755f(int i, RoundingMode roundingMode) {
        hex.m130714d(BaseSei.f13930X, i);
        switch (C18578a.f136071a[roundingMode.ordinal()]) {
            case 1:
                hex.m130715e(m156753d(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + m156754e((-1257966797) >>> iNumberOfLeadingZeros, i);
            default:
                shg0.m184191a();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: g */
    public static int m156756g(int i, int i2) {
        if (i2 > 0) {
            int i3 = i % i2;
            return i3 >= 0 ? i3 : i3 + i2;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i2);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static int m156757h(int i, int i2) {
        return Ints.m16468m(((long) i) + ((long) i2));
    }
}
