package p153l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public class lyo implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f134124b = new lyo();

    /* JADX INFO: renamed from: d */
    public static z6m m156373d() {
        return f134124b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return pm6.m172918f(sj6Var.f168926a) && !TextUtils.isEmpty(e1b.m118950H0(message));
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        String string = sj6Var.f168949x.getString(R$string.f18848Sb);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D1A33C")), 0, string.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
        return spannableString;
    }
}
