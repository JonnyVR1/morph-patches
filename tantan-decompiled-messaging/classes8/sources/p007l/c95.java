package p007l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class c95 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final String f2448a;

    /* JADX INFO: renamed from: b */
    public boolean f2449b = false;

    /* JADX INFO: renamed from: c */
    public String f2450c = "";

    /* JADX INFO: renamed from: d */
    public int f2451d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f2452e = false;

    public c95(String str) {
        this.f2448a = str;
    }

    /* JADX INFO: renamed from: a */
    public c95 m8777a(boolean z) {
        this.f2452e = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public c95 m8778b(@ColorInt int i) {
        this.f2451d = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public c95 m8779c(String str) {
        this.f2450c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public c95 m8780d(boolean z) {
        this.f2449b = z;
        return this;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        String queryParameter;
        Activity activityE = xdl0.E(view);
        if (!NullChecker.a(activityE) || TextUtils.isEmpty(this.f2448a)) {
            return;
        }
        try {
            queryParameter = Uri.parse(this.f2448a).getQueryParameter("_bid");
        } catch (Exception unused) {
            queryParameter = null;
        }
        boolean zA = NullChecker.a(queryParameter);
        String str = this.f2450c;
        activityE.startActivity(zA ? MkWebViewAct.a2(activityE, str, this.f2448a) : WebViewAct.Z1(activityE, str, this.f2448a));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.f2451d;
        if (i != -1) {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(this.f2449b);
        if (this.f2452e) {
            textPaint.setFakeBoldText(true);
        }
    }
}
