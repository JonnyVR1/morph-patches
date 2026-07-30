package p153l;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.beatles.file.diskusage.WarningLevel;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes11.dex */
public class fpp0 implements Comparable<fpp0> {

    /* JADX INFO: renamed from: d */
    public static fpp0 f100209d = new fpp0(2147483647L, Constants.ONE_MIN_IN_MILLIS, WarningLevel.NOTICE);

    /* JADX INFO: renamed from: e */
    public static fpp0 f100210e = new fpp0(1024000, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, WarningLevel.MID_ALERT);

    /* JADX INFO: renamed from: f */
    public static fpp0 f100211f = new fpp0(512000, 10000, WarningLevel.HIGH_ALERT);

    /* JADX INFO: renamed from: g */
    public static fpp0 f100212g = new fpp0(OSSConstants.MIN_PART_SIZE_LIMIT, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, WarningLevel.URGENT_ALERT);

    /* JADX INFO: renamed from: a */
    public final long f100213a;

    /* JADX INFO: renamed from: b */
    public final long f100214b;

    /* JADX INFO: renamed from: c */
    public final WarningLevel f100215c;

    public fpp0(long j, long j2, WarningLevel warningLevel) {
        this.f100213a = j;
        this.f100214b = j2;
        this.f100215c = warningLevel;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fpp0 fpp0Var) {
        if (fpp0Var == null) {
            return -1;
        }
        return (int) (this.f100213a - fpp0Var.f100213a);
    }
}
