package p149l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes8.dex */
public class c95 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final String f79858a;

    /* JADX INFO: renamed from: b */
    public boolean f79859b = false;

    /* JADX INFO: renamed from: c */
    public String f79860c = "";

    /* JADX INFO: renamed from: d */
    public int f79861d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f79862e = false;

    public c95(String str) {
        this.f79858a = str;
    }

    /* JADX INFO: renamed from: a */
    public c95 m105840a(boolean z) {
        this.f79862e = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public c95 m105841b(@ColorInt int i) {
        this.f79861d = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public c95 m105842c(String str) {
        this.f79860c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public c95 m105843d(boolean z) {
        this.f79859b = z;
        return this;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        String queryParameter;
        Activity activityM208328E = xdl0.m208328E(view);
        if (!NullChecker.m81303a(activityM208328E) || TextUtils.isEmpty(this.f79858a)) {
            return;
        }
        try {
            queryParameter = Uri.parse(this.f79858a).getQueryParameter("_bid");
        } catch (Exception unused) {
            queryParameter = null;
        }
        boolean zM81303a = NullChecker.m81303a(queryParameter);
        String str = this.f79860c;
        activityM208328E.startActivity(zM81303a ? MkWebViewAct.m80236a2(activityM208328E, str, this.f79858a) : WebViewAct.m80164Z1(activityM208328E, str, this.f79858a));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.f79861d;
        if (i != -1) {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(this.f79859b);
        if (this.f79862e) {
            textPaint.setFakeBoldText(true);
        }
    }
}
