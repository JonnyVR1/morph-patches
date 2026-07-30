package p149l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class lwo implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f130281b = new lwo();

    /* JADX INFO: renamed from: d */
    public static j4m m151982d() {
        return f130281b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return ml6.m155121f(pi6Var.f149101a) && !TextUtils.isEmpty(rza.m181728H0(message));
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        String string = pi6Var.f149124x.getString(R$string.f17668Db);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D1A33C")), 0, string.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
        return spannableString;
    }
}
