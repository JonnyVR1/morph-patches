package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes6.dex */
public class c17 extends q8g0 {

    /* JADX INFO: renamed from: h */
    public static final DecimalFormat f79338h = new DecimalFormat("##");

    /* JADX INFO: renamed from: n0 */
    public static CharSequence m107521n0(String str, CharSequence charSequence) {
        if (gta.m132210e().m132214d().mo34943w()) {
            return m107522o0(str, charSequence, Color.parseColor("#B2000000"), Color.parseColor("#4d4d4d"));
        }
        return m107522o0(str, charSequence, CoreModule.f18263b.getResources().getColor(o9c0.f145546b), CoreModule.m30933P().m143412i().mo180516o5() ? CoreModule.f18263b.getResources().getColor(o9c0.f145545a) : CoreModule.f18263b.getResources().getColor(o9c0.f145547c));
    }

    /* JADX INFO: renamed from: o0 */
    public static CharSequence m107522o0(String str, CharSequence charSequence, int i, int i2) {
        return m107523p0(str, charSequence, i, i2, true);
    }

    /* JADX INFO: renamed from: p0 */
    public static CharSequence m107523p0(String str, CharSequence charSequence, int i, int i2, boolean z) {
        String lowerCase = str.toLowerCase();
        if (!TextUtils.isEmpty(charSequence)) {
            if (CoreModule.m30933P().m143412i().mo180516o5()) {
                charSequence = " · " + ((Object) charSequence);
            } else {
                lowerCase = lowerCase + " · ";
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(lowerCase);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, lowerCase.length(), 33);
        if (z) {
            spannableString.setSpan(new StyleSpan(1), 0, lowerCase.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            spannableString2.setSpan(new ForegroundColorSpan(i2), 0, charSequence.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q0 */
    public static String m107524q0(int i) {
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: r0 */
    public static String m107525r0(int i) {
        if (i < 1000) {
            return i + "m";
        }
        int i2 = i / 1000;
        if (i2 > 10) {
            return "10+km";
        }
        return i2 + "km";
    }

    /* JADX INFO: renamed from: s0 */
    public static CharSequence m107526s0(String str, @ColorInt int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: t0 */
    public static CharSequence m107527t0(String str, @ColorInt int i, Typeface typeface) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m107528u0() {
        if (uqb0.f180396b0 != null && CoreModule.m30929H() != null && CoreModule.m30929H().signedIn_() && !TextUtils.isEmpty(CoreModule.m30929H().userId())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
                if (TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
                    return true;
                }
                if (TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) {
                    return false;
                }
                return !TEnum.equals(userM116600p9.gender, "male");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public static CharSequence m107529v0(String str, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            spannableString2.setSpan(new ForegroundColorSpan(i2), 0, charSequence.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }
}
