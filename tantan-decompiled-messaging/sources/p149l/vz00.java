package p149l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes10.dex */
public class vz00 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m200681a(Act act, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        Drawable drawable = act.getResources().getDrawable(c3c0.f78775j1);
        int iM186890d = t100.m186890d(4.0f);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth() + t100.m186890d(4.0f), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new ruw(drawable, iM186890d), str.length(), str.length() + 1, 18);
        return spannableStringBuilder;
    }
}
