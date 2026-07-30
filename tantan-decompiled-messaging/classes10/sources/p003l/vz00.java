package p003l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.p1.mobile.android.app.Act;
import l.ruw;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vz00 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m10423a(Act act, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) " ");
        Drawable drawable = act.getResources().getDrawable(c3c0.f3812j1);
        int iD = t100.d(4.0f);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth() + t100.d(4.0f), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new ruw(drawable, iD), str.length(), str.length() + 1, 18);
        return spannableStringBuilder;
    }
}
