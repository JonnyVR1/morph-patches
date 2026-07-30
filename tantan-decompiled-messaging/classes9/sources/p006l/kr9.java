package p006l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.i0g0;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kr9 extends i0g0 {
    /* JADX INFO: renamed from: N */
    public static SpannableStringBuilder m18259N(String str, int i, Typeface typeface) {
        return m18260O(str, i, typeface, 0);
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m18260O(String str, int i, Typeface typeface, int i2) {
        Matcher matcher = Pattern.compile("-?[0-9]\\d*").matcher(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i, i2), matcher.start(), matcher.end(), 33);
        }
        int iIndexOf = str.indexOf("+");
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i, i2), iIndexOf, iIndexOf + 1, 33);
        }
        return spannableStringBuilder;
    }
}
