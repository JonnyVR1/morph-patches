package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kll {

    /* JADX INFO: renamed from: a */
    public static final Pattern f123672a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f123673b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m146417a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(BytesRange.PREFIX);
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static long m146418b(@Nullable String str, @Nullable String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                jwv.m143683c("HttpUtil", "Unexpected Content-Length [" + str + Constants.AES_SUFFIX);
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f123672a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) p11.m167011e(matcher.group(2))) - Long.parseLong((String) p11.m167011e(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            jwv.m143689i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + Constants.AES_SUFFIX);
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            jwv.m143683c("HttpUtil", "Unexpected Content-Range [" + str2 + Constants.AES_SUFFIX);
            return j;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m146419c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f123673b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) p11.m167011e(matcher.group(1)));
        }
        return -1L;
    }
}
