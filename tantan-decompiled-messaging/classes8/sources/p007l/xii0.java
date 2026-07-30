package p007l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xii0 {
    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m11822a(String str, int i) {
        if (str == null) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = Pattern.compile("\\d+(?:\\.\\d+)?").matcher(str);
        while (matcher.find()) {
            if (!matcher.group().equals(".")) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 33);
            }
        }
        return spannableStringBuilder;
    }
}
