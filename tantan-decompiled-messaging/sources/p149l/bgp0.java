package p149l;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes13.dex */
public class bgp0 implements Comparable<bgp0> {

    /* JADX INFO: renamed from: d */
    public static bgp0 f75477d = new bgp0(2147483647L, Constants.ONE_MIN_IN_MILLIS, WarningLevel.NOTICE);

    /* JADX INFO: renamed from: e */
    public static bgp0 f75478e = new bgp0(1024000, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, WarningLevel.MID_ALERT);

    /* JADX INFO: renamed from: f */
    public static bgp0 f75479f = new bgp0(512000, 10000, WarningLevel.HIGH_ALERT);

    /* JADX INFO: renamed from: g */
    public static bgp0 f75480g = new bgp0(OSSConstants.MIN_PART_SIZE_LIMIT, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, WarningLevel.URGENT_ALERT);

    /* JADX INFO: renamed from: a */
    public final long f75481a;

    /* JADX INFO: renamed from: b */
    public final long f75482b;

    /* JADX INFO: renamed from: c */
    public final WarningLevel f75483c;

    public bgp0(long j, long j2, WarningLevel warningLevel) {
        this.f75481a = j;
        this.f75482b = j2;
        this.f75483c = warningLevel;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bgp0 bgp0Var) {
        if (bgp0Var == null) {
            return -1;
        }
        return (int) (this.f75481a - bgp0Var.f75481a);
    }
}
