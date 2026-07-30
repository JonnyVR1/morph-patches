package p149l;

import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class i7u0 {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f111945a;

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f111946b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("sharedStringBuilder")
    public static final StringBuilder f111947c;

    static {
        Locale locale = Locale.ROOT;
        f111945a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f111946b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f111947c = new StringBuilder(33);
    }

    /* JADX INFO: renamed from: a */
    public static String m134923a(long j) {
        String string;
        StringBuilder sb = f111947c;
        synchronized (sb) {
            sb.setLength(0);
            m134924b(j, sb);
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static void m134924b(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append(Constants.INAPP_DATA_TAG);
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= Constants.ONE_MIN_IN_MILLIS) {
            sb.append(j / Constants.ONE_MIN_IN_MILLIS);
            sb.append("m");
            j %= Constants.ONE_MIN_IN_MILLIS;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(BLiveStormDanmakuGiftResourceType.f44446s);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
