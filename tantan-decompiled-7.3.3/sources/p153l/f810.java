package p153l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes12.dex */
public class f810 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m124512a(Act act, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        Drawable drawable = act.getResources().getDrawable(ibc0.f114050j1);
        int iM175859d = qa00.m175859d(4.0f);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth() + qa00.m175859d(4.0f), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new qxw(drawable, iM175859d), str.length(), str.length() + 1, 18);
        return spannableStringBuilder;
    }
}
