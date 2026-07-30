package p149l;

import android.app.Application;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class w8u extends t0g0 {

    /* JADX INFO: renamed from: b */
    public static Application f185256b;

    /* JADX INFO: renamed from: A */
    public static boolean m202203A() {
        return "zh".equalsIgnoreCase(uvr.m196088e().getResources().getConfiguration().getLocales().get(0).getLanguage());
    }

    /* JADX INFO: renamed from: B */
    public static boolean m202204B() {
        return Network.language().startsWith("zh");
    }

    /* JADX INFO: renamed from: C */
    public static int m202205C(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m202206D(Application application) {
        f185256b = application;
    }

    /* JADX INFO: renamed from: E */
    public static void m202207E(TextView textView, int i, String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf != -1) {
            int length = str2.length() + iIndexOf;
            if (length > str.length()) {
                length = str.length();
            }
            if (iIndexOf < length) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 33);
                textView.setText(spannableString);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static String m202208F(String str, int i) {
        int i2;
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i3 = 0;
        int i4 = 0;
        while (i3 < charArray.length && i4 < i) {
            char c = charArray[i3];
            int iM202215r = m202215r(c);
            if (Character.isHighSurrogate(c) && (i2 = i3 + 1) < charArray.length && Character.isLowSurrogate(charArray[i2])) {
                iM202215r = 2;
                i3 = i2;
            }
            i4 += iM202215r;
            if (i4 > i) {
                break;
            }
            i3++;
        }
        return str.substring(0, i3);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m202209h(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
    }

    /* JADX INFO: renamed from: m */
    public static String m202210m(String str) {
        return str + ", Thread:" + Thread.currentThread();
    }

    /* JADX INFO: renamed from: n */
    public static void m202211n(@Nullable String str, @NonNull e30<String> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e30Var.call(str);
    }

    /* JADX INFO: renamed from: o */
    public static int m202212o(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && '.' != cCharAt) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static String m202213p(String str, int i) {
        return m202214q(str, i, "...");
    }

    /* JADX INFO: renamed from: q */
    public static String m202214q(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + str2;
    }

    /* JADX INFO: renamed from: r */
    public static int m202215r(char c) {
        return m202209h(c) ? 2 : 1;
    }

    /* JADX INFO: renamed from: s */
    public static String m202216s(String str, int i) {
        if (i <= 0) {
            i = 6;
        }
        return str.length() > i ? str.substring(0, i).concat("...") : str;
    }

    /* JADX INFO: renamed from: t */
    public static String m202217t(@StringRes int i) {
        return f185256b.getString(i);
    }

    /* JADX INFO: renamed from: u */
    public static String m202218u(@StringRes int i, Object obj) {
        return f185256b.getString(i, obj);
    }

    /* JADX INFO: renamed from: v */
    public static String m202219v(@StringRes int i, Object... objArr) {
        return f185256b.getString(i, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static Pair<Integer, Integer> m202220w(String str, String str2) {
        if (!str.contains(str2)) {
            return new Pair<>(0, 0);
        }
        int iIndexOf = str.indexOf(str2);
        return new Pair<>(Integer.valueOf(iIndexOf), Integer.valueOf(str2.length() + iIndexOf));
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static String m202221x(@NonNull Location location) {
        int i = location.distance;
        if (i < 100000) {
            return i0g0.m133876p(i, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
        Region region = location.region;
        return !zIsEmpty ? region.city : region.country;
    }

    /* JADX INFO: renamed from: y */
    public static String m202222y(User user) {
        return !TextUtils.isEmpty(user.publicId) ? user.publicId : user.f56011id;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m202223z(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.ROOT).endsWith("svga");
    }
}
