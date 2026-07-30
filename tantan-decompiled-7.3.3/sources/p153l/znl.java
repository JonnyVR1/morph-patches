package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class znl {

    /* JADX INFO: renamed from: a */
    public static final Pattern f205205a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f205206b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m220603a(long j, long j2) {
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
    public static long m220604b(@Nullable String str, @Nullable String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                kyv.m152145c("HttpUtil", "Unexpected Content-Length [" + str + Constants.AES_SUFFIX);
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f205205a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) w11.m204369e(matcher.group(2))) - Long.parseLong((String) w11.m204369e(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            kyv.m152151i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + Constants.AES_SUFFIX);
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            kyv.m152145c("HttpUtil", "Unexpected Content-Range [" + str2 + Constants.AES_SUFFIX);
            return j;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m220605c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f205206b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) w11.m204369e(matcher.group(1)));
        }
        return -1L;
    }
}
