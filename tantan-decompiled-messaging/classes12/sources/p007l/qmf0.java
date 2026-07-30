package p007l;

import android.app.Activity;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.j2e0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qmf0 {

    /* JADX INFO: renamed from: l.qmf0$a */
    public class C2469a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ URLSpan f12275a;

        public C2469a(URLSpan uRLSpan) {
            this.f12275a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            String url = this.f12275a.getURL();
            Activity activity = Act.foreground_() != null ? (Activity) Act.foreground_().a.get() : null;
            if (NullChecker.a(activity)) {
                j2e0.m(activity, Uri.parse(url));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m13586a(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), ForegroundColorSpan.class);
        if (!vwb.K(uRLSpanArr)) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                m13587b(spannableStringBuilder, uRLSpan);
            }
        }
        if (!vwb.K(foregroundColorSpanArr)) {
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(foregroundColorSpan.getForegroundColor()), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), 33);
                spannableStringBuilder.removeSpan(foregroundColorSpan);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static void m13587b(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C2469a(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }
}
