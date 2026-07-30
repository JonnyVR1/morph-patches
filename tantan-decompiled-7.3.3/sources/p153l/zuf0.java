package p153l;

import android.app.Activity;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class zuf0 {

    /* JADX INFO: renamed from: l.zuf0$a */
    public class C21900a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URLSpan f206119a;

        public C21900a(URLSpan uRLSpan) {
            this.f206119a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            String url = this.f206119a.getURL();
            Activity activity = Act.foreground_() != null ? Act.foreground_().f16062a.get() : null;
            if (NullChecker.m82486a(activity)) {
                nae0.m162083m(activity, Uri.parse(url));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m221643a(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), ForegroundColorSpan.class);
        if (!jyb.m147480K(uRLSpanArr)) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                m221644b(spannableStringBuilder, uRLSpan);
            }
        }
        if (!jyb.m147480K(foregroundColorSpanArr)) {
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(foregroundColorSpan.getForegroundColor()), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), 33);
                spannableStringBuilder.removeSpan(foregroundColorSpan);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static void m221644b(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C21900a(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }
}
