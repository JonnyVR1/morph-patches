package p153l;

import android.app.Activity;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes6.dex */
public class da5 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final String f85838a;

    /* JADX INFO: renamed from: b */
    public boolean f85839b = false;

    /* JADX INFO: renamed from: c */
    public String f85840c = "";

    /* JADX INFO: renamed from: d */
    public int f85841d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f85842e = false;

    public da5(String str) {
        this.f85838a = str;
    }

    /* JADX INFO: renamed from: a */
    public da5 m115112a(boolean z) {
        this.f85842e = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public da5 m115113b(@ColorInt int i) {
        this.f85841d = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public da5 m115114c(String str) {
        this.f85840c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public da5 m115115d(boolean z) {
        this.f85839b = z;
        return this;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        String queryParameter;
        Activity activityM105508E = bnl0.m105508E(view);
        if (!NullChecker.m82486a(activityM105508E) || TextUtils.isEmpty(this.f85838a)) {
            return;
        }
        try {
            queryParameter = Uri.parse(this.f85838a).getQueryParameter("_bid");
        } catch (Exception unused) {
            queryParameter = null;
        }
        boolean zM82486a = NullChecker.m82486a(queryParameter);
        String str = this.f85840c;
        activityM105508E.startActivity(zM82486a ? MkWebViewAct.m81419b2(activityM105508E, str, this.f85838a) : WebViewAct.m81347a2(activityM105508E, str, this.f85838a));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.f85841d;
        if (i != -1) {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(this.f85839b);
        if (this.f85842e) {
            textPaint.setFakeBoldText(true);
        }
    }
}
