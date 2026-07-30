package com.p051p1.mobile.putong.core.p058ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.adc0;
import p153l.jyb;
import p153l.nxl;
import p153l.rlw;
import p153l.rx3;
import p153l.w0c;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes6.dex */
public class MKWebViewFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public MKWebView f28838A;

    /* JADX INFO: renamed from: B */
    public ProgressBar f28839B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f28840C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f28841D;

    /* JADX INFO: renamed from: E */
    public ImageView f28842E;

    /* JADX INFO: renamed from: J */
    public String f28847J;

    /* JADX INFO: renamed from: K */
    public String f28848K;

    /* JADX INFO: renamed from: L */
    public w0c f28849L;

    /* JADX INFO: renamed from: z */
    public FrameLayout f28851z;

    /* JADX INFO: renamed from: F */
    public boolean f28843F = true;

    /* JADX INFO: renamed from: G */
    public boolean f28844G = true;

    /* JADX INFO: renamed from: H */
    public String f28845H = "transparent";

    /* JADX INFO: renamed from: I */
    public boolean f28846I = true;

    /* JADX INFO: renamed from: M */
    public x20 f28850M = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.MKWebViewFrag$a */
    public class C8422a extends MKWebViewHelper.C3521b {
        public C8422a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewFrag.this.f28848K)) {
                MKWebViewFrag.this.f28840C.setVisibility(0);
            } else {
                MKWebViewFrag.this.f28840C.setVisibility(8);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            MKWebViewFrag.this.f28839B.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewFrag.this.f28847J) && NullChecker.m82486a(MKWebViewFrag.this.f28838A) && !TextUtils.isEmpty(MKWebViewFrag.this.f28838A.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && MKWebViewFrag.this.f28840C.getVisibility() != 0 && MKWebViewFrag.this.f28838A.getTag(adc0.f70682zf) != null) {
                MKWebViewFrag.this.f28838A.setTag(adc0.f70682zf, null);
            }
            if (NullChecker.m82486a(MKWebViewFrag.this.f28850M)) {
                MKWebViewFrag.this.f28850M.call();
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
        }
    }

    public MKWebViewFrag() {
        creates(new y20() { // from class: l.olw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147879a.m45091W4((Bundle) obj);
            }
        }, new x20() { // from class: l.plw
            @Override // p153l.x20
            public final void call() {
                this.f153095a.m45092X4();
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m45086N4(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    /* JADX INFO: renamed from: V4 */
    private void m45090V4() {
        int color = 0;
        if (TextUtils.isEmpty(this.f28845H)) {
            this.f28838A.getSettings().setCacheMode(-1);
            this.f28838A.clearCache(false);
            return;
        }
        if (!this.f28845H.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f28845H.startsWith("#");
            String str = this.f28845H;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f28838A.getSettings().setCacheMode(-1);
                this.f28838A.clearCache(false);
                return;
            }
        }
        this.f28838A.setBackgroundColor(color);
        this.f28838A.getSettings().setCacheMode(2);
        this.f28838A.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m45091W4(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f28847J)) {
            act().setTitle(this.f28847J);
        }
        m45096U4(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m45092X4() {
        this.f28849L.m204135K();
        if (NullChecker.m82486a(this.f28838A)) {
            this.f28838A.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f28838A.getParent();
            if (NullChecker.m82486a(viewGroup)) {
                viewGroup.removeView(this.f28838A);
            }
            this.f28838A.setTag(null);
            this.f28838A.clearHistory();
            this.f28838A.destroy();
            this.f28838A = null;
        }
    }

    /* JADX INFO: renamed from: R4 */
    public View m45093R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rlw.m182033b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public void m45094S4(String str) {
        w0c w0cVar = this.f28849L;
        if (w0cVar == null || jyb.m147479J(w0cVar.m204136L())) {
            return;
        }
        this.f28849L.m204136L().get(0).m205747x().mo97004b(str, new String[0]);
    }

    /* JADX INFO: renamed from: T4 */
    public MKWebViewHelper.C3521b m45095T4() {
        return new C8422a(this.f28849L);
    }

    /* JADX INFO: renamed from: U4 */
    public void m45096U4(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f28848K)) {
            return;
        }
        w0c w0cVar = new w0c();
        this.f28849L = w0cVar;
        w0cVar.m17975z(getActivity(), this.f28838A);
        this.f28849L.m17959J(new MKWebViewHelper.InterfaceC3520a() { // from class: l.qlw
            @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.InterfaceC3520a
            /* JADX INFO: renamed from: a */
            public final void mo17976a(MKWebView mKWebView) {
                MKWebViewFrag.m45086N4(mKWebView);
            }
        });
        if (this.f28843F && !this.f28849L.m204138N()) {
            this.f28849L.m204137M((PutongAct) getActivity(), "", this.f28838A, this.f28848K);
        }
        boolean z = this.f28844G;
        ProgressBar progressBar = this.f28839B;
        if (z) {
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        m45090V4();
        this.f28838A.setMKWebLoadListener(m45095T4());
        boolean zM82486a = NullChecker.m82486a(map);
        MKWebView mKWebView = this.f28838A;
        if (zM82486a) {
            mKWebView.loadUrl(this.f28848K, map);
        } else {
            mKWebView.loadUrl(this.f28848K);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m45093R4(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        if (NullChecker.m82486a(getArguments())) {
            this.f28847J = getArguments().getString("title");
            this.f28848K = getArguments().getString("url");
        }
    }
}
