package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class wlc0 {
    /* JADX INFO: renamed from: a */
    public static String m203804a(long j, boolean z, long j2, long j3) {
        long j4 = j * 1000;
        long j5 = j3 - j4;
        if (!z) {
            j5 = j4 - (j2 * 1000);
        }
        if (j5 < 0) {
            j5 = 0;
        }
        long j6 = j5 / 1000;
        long j7 = j5 / Constants.ONE_MIN_IN_MILLIS;
        long j8 = j5 / 3600000;
        long j9 = j5 / 86400000;
        if (j8 >= 24) {
            return j9 + "天";
        }
        String str = "";
        if (j8 >= 1) {
            long j10 = j7 % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(j8);
            sb.append("小时");
            if (j10 != 0) {
                str = j10 + "分钟";
            }
            sb.append(str);
            return sb.toString();
        }
        if (j7 < 1) {
            if (j6 == 0) {
                j6 = 1;
            }
            return j6 + "秒";
        }
        long j11 = j6 % 60;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j7);
        sb2.append("分钟");
        if (j11 != 0) {
            str = j11 + "秒";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
