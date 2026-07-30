package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes6.dex */
public class zz6 extends i0g0 {

    /* JADX INFO: renamed from: h */
    public static final DecimalFormat f205780h = new DecimalFormat("##");

    /* JADX INFO: renamed from: n0 */
    public static CharSequence m220997n0(String str, CharSequence charSequence) {
        if (ura.m195053e().m195057d().mo33940w()) {
            return m220998o0(str, charSequence, Color.parseColor("#B2000000"), Color.parseColor("#4d4d4d"));
        }
        return m220998o0(str, charSequence, CoreModule.f17544b.getResources().getColor(i1c0.f110439b), CoreModule.m29935P().m94658i().mo158424o5() ? CoreModule.f17544b.getResources().getColor(i1c0.f110438a) : CoreModule.f17544b.getResources().getColor(i1c0.f110440c));
    }

    /* JADX INFO: renamed from: o0 */
    public static CharSequence m220998o0(String str, CharSequence charSequence, int i, int i2) {
        return m220999p0(str, charSequence, i, i2, true);
    }

    /* JADX INFO: renamed from: p0 */
    public static CharSequence m220999p0(String str, CharSequence charSequence, int i, int i2, boolean z) {
        String lowerCase = str.toLowerCase();
        if (!TextUtils.isEmpty(charSequence)) {
            if (CoreModule.m29935P().m94658i().mo158424o5()) {
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
    public static String m221000q0(int i) {
        return i >= 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: r0 */
    public static String m221001r0(int i) {
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
    public static CharSequence m221002s0(String str, @ColorInt int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: t0 */
    public static CharSequence m221003t0(String str, @ColorInt int i, Typeface typeface) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m221004u0() {
        if (qib0.f154713b0 != null && CoreModule.m29931H() != null && CoreModule.m29931H().signedIn_() && !TextUtils.isEmpty(CoreModule.m29931H().userId())) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
                if (TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
                    return true;
                }
                if (TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) {
                    return false;
                }
                return !TEnum.equals(userM169527p9.gender, "male");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public static CharSequence m221005v0(String str, CharSequence charSequence, int i, int i2) {
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
