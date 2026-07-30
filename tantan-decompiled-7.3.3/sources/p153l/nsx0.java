package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class nsx0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f143560a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f143561b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX INFO: renamed from: a */
    public static long m164656a(@Nullable String str, @Nullable String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                y4w0.m214275c("HttpUtil", "Unexpected Content-Length [" + str + Constants.AES_SUFFIX);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f143560a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            y4w0.m214278f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + Constants.AES_SUFFIX);
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            y4w0.m214275c("HttpUtil", "Unexpected Content-Range [" + str2 + Constants.AES_SUFFIX);
            return j;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m164657b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f143561b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
