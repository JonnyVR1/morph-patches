package p003l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.HomeTabModuleTopicShowType;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Locale;
import l.q0l0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mqa {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f6401a = new DecimalFormat("##");

    /* JADX INFO: renamed from: a */
    public static void m8213a(TextView textView, Drawable drawable) {
        int iD = t100.d(4.0f);
        drawable.setBounds(iD, 0, drawable.getIntrinsicWidth() + iD, drawable.getIntrinsicHeight());
        q0l0 q0l0Var = new q0l0(drawable);
        SpannableString spannableString = new SpannableString(HomeTabModuleTopicShowType.icon);
        spannableString.setSpan(q0l0Var, 0, 4, 33);
        textView.append(spannableString);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8214b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
