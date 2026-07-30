package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;

/* JADX INFO: loaded from: classes10.dex */
public class bpq {

    /* JADX INFO: renamed from: l.bpq$a */
    public class C15927a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f76664a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f76665b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f76666c;

        public C15927a(Act act, String str, String str2) {
            this.f76664a = act;
            this.f76665b = str;
            this.f76666c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Act act = this.f76664a;
            act.startActivity(AccessTokenWebViewAct.m80150Z1(act, this.f76665b.replace("【", "").replace("】", ""), this.f76666c));
            this.f76664a.lambda$debugItems$19();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#4a95e2"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m103084a(final Act act) {
        String string = act.getString(R$string.f17785H8);
        String str = String.format(act.getString(R$string.f17755G8), string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C15927a(act, string, "http://feedback.tantanapp.com/feedback-mobile/form?from=vip_complaint"), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        act.dialog().m20507G0(act.getString(R$string.f17725F8)).m20511I0(w0c0.f183804S0).m20513J0(17).m20531a0(act.getDrawable(x2c0.f190728xt)).m20565y(true).m20504F(spannableStringBuilder).m20510I(17).m20508H(w0c0.f183835c).m20514K(14.0f).m20512J(true).m20557u().m20555t().m20560v0(act.getString(R$string.f18518fh), new Runnable() { // from class: l.apq
            @Override // java.lang.Runnable
            public final void run() {
                act.lambda$debugItems$19();
            }
        }).m20567z().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m103085b(Act act, String str) {
        str.getClass();
        if (str.equals(SchemeKey.coPay)) {
            m103084a(act);
        }
    }
}
