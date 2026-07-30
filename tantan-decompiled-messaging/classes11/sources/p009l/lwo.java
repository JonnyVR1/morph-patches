package p009l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;
import l.ml6;
import l.rza;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lwo implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f16435b = new lwo();

    /* JADX INFO: renamed from: d */
    public static j4m m18070d() {
        return f16435b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return ml6.f(pi6Var.f18622a) && !TextUtils.isEmpty(rza.H0(message));
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        String string = pi6Var.f18645x.getString(R.string.Db);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D1A33C")), 0, string.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
        return spannableString;
    }
}
