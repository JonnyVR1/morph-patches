package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.C2678b;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class s5g0 {

    /* JADX INFO: renamed from: a */
    public final fzi0 f166363a = fzi0.m128190b();

    /* JADX INFO: renamed from: b */
    public boolean f166364b;

    /* JADX INFO: renamed from: c */
    public long f166365c;

    /* JADX INFO: renamed from: d */
    public long f166366d;

    /* JADX INFO: renamed from: l.s5g0$a */
    public static /* synthetic */ class C19984a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166367a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f166367a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f166367a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f166367a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f166367a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f166367a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f166367a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f166367a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m184666a(TimeUnit timeUnit) {
        switch (C19984a.f166367a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return BLiveStormDanmakuGiftResourceType.f45294s;
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return Constants.INAPP_DATA_TAG;
            default:
                aqg0.m99478a();
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static TimeUnit m184667b(long j) {
        if (j / 86400000000000L > 0) {
            return TimeUnit.DAYS;
        }
        if (j / 3600000000000L > 0) {
            return TimeUnit.HOURS;
        }
        if (j / 60000000000L > 0) {
            return TimeUnit.MINUTES;
        }
        if (j / 1000000000 > 0) {
            return TimeUnit.SECONDS;
        }
        if (j / 1000000 > 0) {
            return TimeUnit.MILLISECONDS;
        }
        return j / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
    }

    /* JADX INFO: renamed from: c */
    public static s5g0 m184668c() {
        return new s5g0().m184672g();
    }

    /* JADX INFO: renamed from: d */
    public static s5g0 m184669d() {
        return new s5g0();
    }

    /* JADX INFO: renamed from: e */
    public long m184670e(TimeUnit timeUnit) {
        return timeUnit.convert(m184671f(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: f */
    public final long m184671f() {
        return this.f166364b ? (this.f166363a.mo15540a() - this.f166366d) + this.f166365c : this.f166365c;
    }

    /* JADX INFO: renamed from: g */
    public s5g0 m184672g() {
        xn80.m212118w(!this.f166364b, "This stopwatch is already running.");
        this.f166364b = true;
        this.f166366d = this.f166363a.mo15540a();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public s5g0 m184673h() {
        long jMo15540a = this.f166363a.mo15540a();
        xn80.m212118w(this.f166364b, "This stopwatch is already stopped.");
        this.f166364b = false;
        this.f166365c += jMo15540a - this.f166366d;
        return this;
    }

    public String toString() {
        long jM184671f = m184671f();
        TimeUnit timeUnitM184667b = m184667b(jM184671f);
        String strM15495c = C2678b.m15495c(jM184671f / TimeUnit.NANOSECONDS.convert(1L, timeUnitM184667b));
        String strM184666a = m184666a(timeUnitM184667b);
        StringBuilder sb = new StringBuilder(String.valueOf(strM15495c).length() + 1 + String.valueOf(strM184666a).length());
        sb.append(strM15495c);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(strM184666a);
        return sb.toString();
    }
}
