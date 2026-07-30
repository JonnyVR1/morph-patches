package p149l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mqa {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f135201a = new DecimalFormat("##");

    /* JADX INFO: renamed from: a */
    public static void m155878a(TextView textView, Drawable drawable) {
        int iM186890d = t100.m186890d(4.0f);
        drawable.setBounds(iM186890d, 0, drawable.getIntrinsicWidth() + iM186890d, drawable.getIntrinsicHeight());
        q0l0 q0l0Var = new q0l0(drawable);
        SpannableString spannableString = new SpannableString("icon");
        spannableString.setSpan(q0l0Var, 0, 4, 33);
        textView.append(spannableString);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m155879b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
