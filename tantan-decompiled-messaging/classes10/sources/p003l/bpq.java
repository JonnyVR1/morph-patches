package p003l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import l.w0c0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bpq {

    /* JADX INFO: renamed from: l.bpq$a */
    public class C3304a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f3420a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3421b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3422c;

        public C3304a(Act act, String str, String str2) {
            this.f3420a = act;
            this.f3421b = str;
            this.f3422c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Act act = this.f3420a;
            act.startActivity(AccessTokenWebViewAct.Z1(act, this.f3421b.replace("【", "").replace("】", ""), this.f3422c));
            this.f3420a.finish();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#4a95e2"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5778a(final Act act) {
        String string = act.getString(R.string.H8);
        String str = String.format(act.getString(R.string.G8), string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C3304a(act, string, "http://feedback.tantanapp.com/feedback-mobile/form?from=vip_complaint"), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        act.dialog().G0(act.getString(R.string.F8)).I0(w0c0.S0).J0(17).a0(act.getDrawable(x2c0.xt)).y(true).F(spannableStringBuilder).I(17).H(w0c0.c).K(14.0f).J(true).u().t().v0(act.getString(R.string.fh), new Runnable() { // from class: l.apq
            @Override // java.lang.Runnable
            public final void run() {
                act.finish();
            }
        }).z().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m5779b(Act act, String str) {
        str.getClass();
        if (str.equals("coPay")) {
            m5778a(act);
        }
    }
}
