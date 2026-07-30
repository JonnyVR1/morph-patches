package p153l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class yra {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f201299a = new DecimalFormat("##");

    /* JADX INFO: renamed from: a */
    public static void m217164a(TextView textView, Drawable drawable) {
        int iM175859d = qa00.m175859d(4.0f);
        drawable.setBounds(iM175859d, 0, drawable.getIntrinsicWidth() + iM175859d, drawable.getIntrinsicHeight());
        v9l0 v9l0Var = new v9l0(drawable);
        SpannableString spannableString = new SpannableString("icon");
        spannableString.setSpan(v9l0Var, 0, 4, 33);
        textView.append(spannableString);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m217165b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
