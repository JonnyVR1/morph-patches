package p153l;

import android.app.Application;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class xau extends a9g0 {

    /* JADX INFO: renamed from: b */
    public static Application f193085b;

    /* JADX INFO: renamed from: A */
    public static boolean m209896A() {
        return "zh".equalsIgnoreCase(vxr.m203877e().getResources().getConfiguration().getLocales().get(0).getLanguage());
    }

    /* JADX INFO: renamed from: B */
    public static boolean m209897B() {
        return Network.language().startsWith("zh");
    }

    /* JADX INFO: renamed from: C */
    public static int m209898C(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m209899D(Application application) {
        f193085b = application;
    }

    /* JADX INFO: renamed from: E */
    public static void m209900E(TextView textView, int i, String str, String str2) {
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
    public static String m209901F(String str, int i) {
        int i2;
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i3 = 0;
        int i4 = 0;
        while (i3 < charArray.length && i4 < i) {
            char c = charArray[i3];
            int iM209908r = m209908r(c);
            if (Character.isHighSurrogate(c) && (i2 = i3 + 1) < charArray.length && Character.isLowSurrogate(charArray[i2])) {
                iM209908r = 2;
                i3 = i2;
            }
            i4 += iM209908r;
            if (i4 > i) {
                break;
            }
            i3++;
        }
        return str.substring(0, i3);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m209902h(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
    }

    /* JADX INFO: renamed from: m */
    public static String m209903m(String str) {
        return str + ", Thread:" + Thread.currentThread();
    }

    /* JADX INFO: renamed from: n */
    public static void m209904n(@Nullable String str, @NonNull y20<String> y20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        y20Var.call(str);
    }

    /* JADX INFO: renamed from: o */
    public static int m209905o(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && '.' != cCharAt) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static String m209906p(String str, int i) {
        return m209907q(str, i, "...");
    }

    /* JADX INFO: renamed from: q */
    public static String m209907q(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + str2;
    }

    /* JADX INFO: renamed from: r */
    public static int m209908r(char c) {
        return m209902h(c) ? 2 : 1;
    }

    /* JADX INFO: renamed from: s */
    public static String m209909s(String str, int i) {
        if (i <= 0) {
            i = 6;
        }
        return str.length() > i ? str.substring(0, i).concat("...") : str;
    }

    /* JADX INFO: renamed from: t */
    public static String m209910t(@StringRes int i) {
        return f193085b.getString(i);
    }

    /* JADX INFO: renamed from: u */
    public static String m209911u(@StringRes int i, Object obj) {
        return f193085b.getString(i, obj);
    }

    /* JADX INFO: renamed from: v */
    public static String m209912v(@StringRes int i, Object... objArr) {
        return f193085b.getString(i, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static Pair<Integer, Integer> m209913w(String str, String str2) {
        if (!str.contains(str2)) {
            return new Pair<>(0, 0);
        }
        int iIndexOf = str.indexOf(str2);
        return new Pair<>(Integer.valueOf(iIndexOf), Integer.valueOf(str2.length() + iIndexOf));
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static String m209914x(@NonNull Location location) {
        int i = location.distance;
        if (i < 100000) {
            return q8g0.m175811p(i, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
        Region region = location.region;
        return !zIsEmpty ? region.city : region.country;
    }

    /* JADX INFO: renamed from: y */
    public static String m209915y(User user) {
        return !TextUtils.isEmpty(user.publicId) ? user.publicId : user.f56859id;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m209916z(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.ROOT).endsWith("svga");
    }
}
