package tv.danmaku.ijk.media.player;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static final Pattern ipv4Pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    public static final Pattern ipv6Pattern = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$|^(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?::(([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4})?$");

    public static boolean isIpaddr(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 7 || str.length() > 15) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    public static boolean isValidIpAddress(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return ipv4Pattern.matcher(str).matches() || ipv6Pattern.matcher(str).matches();
    }
}
