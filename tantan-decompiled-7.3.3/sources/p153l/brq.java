package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;

/* JADX INFO: loaded from: classes12.dex */
public class brq {

    /* JADX INFO: renamed from: l.brq$a */
    public class C16098a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f78047a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f78048b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f78049c;

        public C16098a(Act act, String str, String str2) {
            this.f78047a = act;
            this.f78048b = str;
            this.f78049c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Act act = this.f78047a;
            act.startActivity(AccessTokenWebViewAct.m81333a2(act, this.f78048b.replace("【", "").replace("】", ""), this.f78049c));
            this.f78047a.lambda$debugItems$19();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#4a95e2"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m106159a(final Act act) {
        String string = act.getString(R$string.f18573J8);
        String str = String.format(act.getString(R$string.f18542I8), string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C16098a(act, string, "http://feedback.tantanapp.com/feedback-mobile/form?from=vip_complaint"), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        act.dialog().m21506G0(act.getString(R$string.f18511H8)).m21510I0(c9c0.f80376T0).m21512J0(17).m21530a0(act.getDrawable(dbc0.f87199lu)).m21564y(true).m21503F(spannableStringBuilder).m21509I(17).m21507H(c9c0.f80404c).m21513K(14.0f).m21511J(true).m21556u().m21554t().m21559v0(act.getString(R$string.f18303Ah), new Runnable() { // from class: l.arq
            @Override // java.lang.Runnable
            public final void run() {
                act.lambda$debugItems$19();
            }
        }).m21566z().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m106160b(Act act, String str) {
        str.getClass();
        if (str.equals(SchemeKey.coPay)) {
            m106159a(act);
        }
    }
}
