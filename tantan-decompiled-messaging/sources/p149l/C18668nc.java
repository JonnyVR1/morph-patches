package p149l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.nc */
/* JADX INFO: loaded from: classes5.dex */
public class C18668nc implements s7m<C18890oc> {

    /* JADX INFO: renamed from: a */
    public LiveMkWebView f138080a;

    /* JADX INFO: renamed from: b */
    public C18890oc f138081b;

    /* JADX INFO: renamed from: c */
    public String f138082c;

    public C18668nc(Act act) {
        LiveMkWebView liveMkWebView = new LiveMkWebView(act);
        this.f138080a = liveMkWebView;
        liveMkWebView.setBackgroundColor(kvc0.m147352a(h1c0.f105363f));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f138080a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C18890oc c18890oc) {
        this.f138081b = c18890oc;
    }

    /* JADX INFO: renamed from: b */
    public View m158844b() {
        return this.f138080a;
    }

    /* JADX INFO: renamed from: c */
    public void m158845c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("_bid");
        LiveMkWebView liveMkWebView = this.f138080a;
        boolean zM81303a = NullChecker.m81303a(queryParameter);
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m68876y(zM81303a, str, bgType);
        this.f138080a.setWebViewBg(bgType);
        this.f138080a.setOnCheckIsTextEditorFlag(true);
        this.f138080a.m68874w(str);
        this.f138082c = str;
    }

    /* JADX INFO: renamed from: d */
    public void m158846d() {
        this.f138080a.m68874w(this.f138082c);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f138080a.m68867p();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
    }
}
