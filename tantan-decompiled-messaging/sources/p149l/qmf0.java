package p149l;

import android.app.Activity;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class qmf0 {

    /* JADX INFO: renamed from: l.qmf0$a */
    public class C19540a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URLSpan f155311a;

        public C19540a(URLSpan uRLSpan) {
            this.f155311a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            String url = this.f155311a.getURL();
            Activity activity = Act.foreground_() != null ? Act.foreground_().f15343a.get() : null;
            if (NullChecker.m81303a(activity)) {
                j2e0.m139446m(activity, Uri.parse(url));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m175568a(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), ForegroundColorSpan.class);
        if (!vwb.m200297K(uRLSpanArr)) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                m175569b(spannableStringBuilder, uRLSpan);
            }
        }
        if (!vwb.m200297K(foregroundColorSpanArr)) {
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(foregroundColorSpan.getForegroundColor()), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), 33);
                spannableStringBuilder.removeSpan(foregroundColorSpan);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static void m175569b(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C19540a(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }
}
