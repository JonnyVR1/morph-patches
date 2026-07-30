package p153l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.ic */
/* JADX INFO: loaded from: classes5.dex */
public class C17696ic implements iam<C17920jc> {

    /* JADX INFO: renamed from: a */
    public LiveMkWebView f114263a;

    /* JADX INFO: renamed from: b */
    public C17920jc f114264b;

    /* JADX INFO: renamed from: c */
    public String f114265c;

    public C17696ic(Act act) {
        LiveMkWebView liveMkWebView = new LiveMkWebView(act);
        this.f114263a = liveMkWebView;
        liveMkWebView.setBackgroundColor(n3d0.m161277a(n9c0.f140824f));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114263a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C17920jc c17920jc) {
        this.f114264b = c17920jc;
    }

    /* JADX INFO: renamed from: b */
    public View m139416b() {
        return this.f114263a;
    }

    /* JADX INFO: renamed from: c */
    public void m139417c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("_bid");
        LiveMkWebView liveMkWebView = this.f114263a;
        boolean zM82486a = NullChecker.m82486a(queryParameter);
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m70059y(zM82486a, str, bgType);
        this.f114263a.setWebViewBg(bgType);
        this.f114263a.setOnCheckIsTextEditorFlag(true);
        this.f114263a.m70057w(str);
        this.f114265c = str;
    }

    /* JADX INFO: renamed from: d */
    public void m139418d() {
        this.f114263a.m70057w(this.f114265c);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f114263a.m70050p();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
    }
}
