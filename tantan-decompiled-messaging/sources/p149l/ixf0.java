package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.C2655b;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ixf0 {

    /* JADX INFO: renamed from: a */
    public final cqi0 f115365a = cqi0.m108276b();

    /* JADX INFO: renamed from: b */
    public boolean f115366b;

    /* JADX INFO: renamed from: c */
    public long f115367c;

    /* JADX INFO: renamed from: d */
    public long f115368d;

    /* JADX INFO: renamed from: l.ixf0$a */
    public static /* synthetic */ class C17641a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115369a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f115369a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115369a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115369a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115369a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115369a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115369a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115369a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m138840a(TimeUnit timeUnit) {
        switch (C17641a.f115369a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return BLiveStormDanmakuGiftResourceType.f44446s;
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return Constants.INAPP_DATA_TAG;
            default:
                shg0.m184191a();
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static TimeUnit m138841b(long j) {
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
    public static ixf0 m138842c() {
        return new ixf0().m138846g();
    }

    /* JADX INFO: renamed from: d */
    public static ixf0 m138843d() {
        return new ixf0();
    }

    /* JADX INFO: renamed from: e */
    public long m138844e(TimeUnit timeUnit) {
        return timeUnit.convert(m138845f(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: f */
    public final long m138845f() {
        return this.f115366b ? (this.f115365a.mo15486a() - this.f115368d) + this.f115367c : this.f115367c;
    }

    /* JADX INFO: renamed from: g */
    public ixf0 m138846g() {
        sf80.m183901w(!this.f115366b, "This stopwatch is already running.");
        this.f115366b = true;
        this.f115368d = this.f115365a.mo15486a();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public ixf0 m138847h() {
        long jMo15486a = this.f115365a.mo15486a();
        sf80.m183901w(this.f115366b, "This stopwatch is already stopped.");
        this.f115366b = false;
        this.f115367c += jMo15486a - this.f115368d;
        return this;
    }

    public String toString() {
        long jM138845f = m138845f();
        TimeUnit timeUnitM138841b = m138841b(jM138845f);
        String strM15441c = C2655b.m15441c(jM138845f / TimeUnit.NANOSECONDS.convert(1L, timeUnitM138841b));
        String strM138840a = m138840a(timeUnitM138841b);
        StringBuilder sb = new StringBuilder(String.valueOf(strM15441c).length() + 1 + String.valueOf(strM138840a).length());
        sb.append(strM15441c);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(strM138840a);
        return sb.toString();
    }
}
