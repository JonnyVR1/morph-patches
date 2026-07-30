package com.p051p1.mobile.putong.live.base.webview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewClientX;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.HashMap;
import java.util.Map;
import p153l.asp0;
import p153l.awr;
import p153l.bnl0;
import p153l.brw;
import p153l.bsp0;
import p153l.dpf0;
import p153l.ffv;
import p153l.fhw;
import p153l.jdc0;
import p153l.lhl;
import p153l.mjw;
import p153l.ntp0;
import p153l.nxl;
import p153l.rx3;
import p153l.vec0;
import p153l.vxr;
import p153l.w0c;
import p153l.wqo;
import p153l.wqp0;
import p153l.zpq;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMkWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f45678a;

    /* JADX INFO: renamed from: b */
    public MKWebView f45679b;

    /* JADX INFO: renamed from: c */
    public w0c f45680c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f45681d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f45682e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f45683f;

    /* JADX INFO: renamed from: g */
    public ImageView f45684g;

    /* JADX INFO: renamed from: h */
    public rx3.InterfaceC19928a f45685h;

    /* JADX INFO: renamed from: i */
    public boolean f45686i;

    /* JADX INFO: renamed from: j */
    public zpq f45687j;

    /* JADX INFO: renamed from: k */
    public boolean f45688k;

    /* JADX INFO: renamed from: l */
    public boolean f45689l;

    /* JADX INFO: renamed from: m */
    public boolean f45690m;

    /* JADX INFO: renamed from: n */
    public int f45691n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$b */
    public class C12649b extends dpf0 {
        public C12649b(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            if (str2.endsWith(".js") || str2.endsWith(".html") || str2.endsWith(".css")) {
                super.mo17978e(webView, i, str, str2);
                LiveMkWebView.this.f45686i = true;
                webView.loadUrl("about:blank");
                webView.setVisibility(4);
                if (LiveMkWebView.this.f45685h != null) {
                    LiveMkWebView.this.f45685h.mo37615c(i, str, str2);
                }
                fhw.m125605a("[live]webDialog", "onReceivedErrorX message = " + str);
                awr.m100708b(i, str, str2, LiveMkWebView.class.getName());
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            bnl0.m105525M0(webView, !LiveMkWebView.this.f45686i);
            if (LiveMkWebView.this.f45685h != null) {
                LiveMkWebView.this.f45685h.mo37613a(str);
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
            LiveMkWebView.this.f45686i = false;
            if (!bnl0.m105529O0(webView)) {
                bnl0.m105524M(webView, true);
            }
            if (LiveMkWebView.this.f45685h != null) {
                LiveMkWebView.this.f45685h.mo37614b(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$c */
    public class C12650c implements rx3.InterfaceC19928a {
        public C12650c() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            bnl0.m105524M(LiveMkWebView.this.f45681d, false);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            bnl0.m105524M(LiveMkWebView.this.f45682e, false);
            if (LiveMkWebView.this.f45689l) {
                bnl0.m105524M(LiveMkWebView.this.f45681d, true);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            if (TextUtils.equals(str2, "about:blank")) {
                return;
            }
            bnl0.m105524M(LiveMkWebView.this.f45681d, false);
            if (LiveMkWebView.this.f45690m) {
                bnl0.m105524M(LiveMkWebView.this.f45682e, true);
            }
            if (LiveMkWebView.this.f45688k) {
                WebViewX webViewX = LiveMkWebView.this.f45678a;
                LiveMkWebView liveMkWebView = LiveMkWebView.this;
                if (webViewX != null) {
                    liveMkWebView.f45678a.setBackgroundColor(-1);
                } else if (liveMkWebView.f45679b != null) {
                    LiveMkWebView.this.f45679b.setBackgroundColor(-1);
                }
            }
        }
    }

    public LiveMkWebView(@NonNull Context context) {
        super(context);
        this.f45688k = true;
        this.f45689l = true;
        this.f45690m = true;
        this.f45691n = vec0.f183727I;
    }

    private rx3.InterfaceC19928a getPageListener() {
        return new C12650c();
    }

    private WebView getWebview() {
        WebViewX webViewX = this.f45678a;
        return webViewX != null ? webViewX : this.f45679b;
    }

    /* JADX INFO: renamed from: A */
    public void m70043A() {
        if (this.f45690m) {
            bnl0.m105524M(this.f45682e, true);
        }
        bnl0.m105524M(this.f45681d, false);
    }

    /* JADX INFO: renamed from: B */
    public void m70044B() {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.stopLoading();
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.stopLoading();
        }
    }

    public int getWebViewHashCode() {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            return webViewX.hashCode();
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            return mKWebView.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public void m70045k(PutongAct putongAct, String str, String str2) {
        m70046l(putongAct, str, str2, new HashMap());
    }

    /* JADX INFO: renamed from: l */
    public void m70046l(PutongAct putongAct, String str, String str2, Map<String, String> map) {
        String strM154223p = lhl.INSTANCE.m154223p(str2);
        WebViewX webViewX = this.f45678a;
        if (webViewX == null) {
            if (this.f45679b != null) {
                if (ntp0.m164746d(strM154223p)) {
                    map.put("H5-Authorization", str);
                }
                this.f45679b.loadUrl(strM154223p, map);
                return;
            }
            return;
        }
        if (this.f45687j == null) {
            this.f45687j = new zpq(putongAct, str, webViewX);
        }
        this.f45678a.addJavascriptInterface(this.f45687j, "tantan");
        if (ntp0.m164746d(strM154223p)) {
            map.put("H5-Authorization", str);
        }
        this.f45678a.loadUrl(strM154223p, map);
    }

    /* JADX INFO: renamed from: m */
    public void m70047m(wqo wqoVar, String str) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.addJavascriptInterface(wqoVar, str);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.addJavascriptInterface(wqoVar, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m70048n(String str) {
        zpq zpqVar = this.f45687j;
        if (zpqVar == null || str == null) {
            return;
        }
        zpqVar.m220919d().mo97003a(str);
    }

    /* JADX INFO: renamed from: o */
    public boolean m70049o() {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null && webViewX.canGoBack() && !"about:blank".equals(this.f45678a.getUrl())) {
            return true;
        }
        MKWebView mKWebView = this.f45679b;
        return (mKWebView == null || !mKWebView.canGoBack() || "about:blank".equals(this.f45679b.getUrl())) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p */
    public void m70050p() {
        ffv.m125426b(this.f45678a, this.f45687j);
        ffv.m125425a(this.f45679b, this.f45680c);
        this.f45678a = null;
        this.f45679b = null;
        this.f45687j = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m70051q(String str, CommonH5Builder.BgType bgType) {
        View viewFindViewById;
        if (vxr.m203876d().m171032x0() && this.f45691n == vec0.f183728J) {
            fhw.m125605a("[live]campaign", "MK 优化  ,开启 WebView缓存池");
            LinearLayout linearLayout = (LinearLayout) findViewById(jdc0.f120223p1);
            if (linearLayout != null) {
                viewFindViewById = mjw.INSTANCE.m158641s((PutongAct) getContext(), str, ((PutongAct) getContext()).act.getIntent());
                if (viewFindViewById == null) {
                    viewFindViewById = new MKWebView((PutongAct) getContext(), brw.m106162a(((PutongAct) getContext()).act.getIntent(), str));
                    fhw.m125605a("[live]campaign", "MK 优化  ,缓存池为空 重新创建webview");
                } else {
                    CommonH5Builder.BgType bgType2 = CommonH5Builder.BgType.DEFAULT_BG;
                    if (bgType != bgType2) {
                        viewFindViewById.setBackgroundColor(0);
                    }
                    StringBuilder sb = new StringBuilder("MK 优化  , 使用WebView缓存池(背景色");
                    sb.append(bgType != bgType2 ? "透明值" : "默认值");
                    sb.append(")");
                    fhw.m125605a("[live]campaign", sb.toString());
                }
                if (viewFindViewById.getParent() == null) {
                    linearLayout.setVisibility(0);
                    linearLayout.addView(viewFindViewById, new ViewGroup.LayoutParams(-1, -1));
                }
            } else {
                viewFindViewById = null;
            }
        } else {
            viewFindViewById = findViewById(jdc0.f120220o1);
        }
        if (viewFindViewById instanceof MKWebView) {
            this.f45679b = (MKWebView) viewFindViewById;
            w0c w0cVar = new w0c();
            this.f45680c = w0cVar;
            w0cVar.m17975z((Activity) getContext(), this.f45679b);
            this.f45680c.m204137M((PutongAct) getContext(), "", this.f45679b, "");
        } else {
            this.f45678a = (WebViewX) viewFindViewById;
        }
        this.f45681d = (ProgressBar) findViewById(jdc0.f120237w0);
        this.f45682e = (FrameLayout) findViewById(jdc0.f120144K);
        this.f45683f = (FrameLayout) findViewById(jdc0.f120243z0);
        this.f45684g = (ImageView) findViewById(jdc0.f120198h0);
    }

    /* JADX INFO: renamed from: r */
    public void m70052r() {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.goBack();
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.goBack();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m70053s(Context context, boolean z) {
        if (!z) {
            LayoutInflater.from(context).inflate(vec0.f183731M, this);
            return;
        }
        if (vxr.m203876d().m171032x0()) {
            this.f45691n = vec0.f183728J;
        }
        LayoutInflater.from(context).inflate(this.f45691n, this);
    }

    public void setCanLoadWhiteBgOnError(boolean z) {
        this.f45688k = z;
    }

    public void setOnCheckIsTextEditorFlag(boolean z) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.m30696h(z);
        }
    }

    public void setVerticalScrollBarEnable(boolean z) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.setVerticalScrollBarEnabled(z);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebChromeClientX(wqp0 wqp0Var) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.setWebChromeClientX(wqp0Var);
        }
    }

    public void setWebViewBg(CommonH5Builder.BgType bgType) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                webViewX.setBackgroundColor(-1);
                this.f45678a.getSettings().setCacheMode(-1);
                this.f45678a.clearCache(false);
                return;
            } else {
                webViewX.setBackgroundColor(0);
                this.f45678a.getSettings().setCacheMode(2);
                this.f45678a.clearCache(true);
                return;
            }
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                mKWebView.setBackgroundColor(-1);
                this.f45679b.getSettings().setCacheMode(-1);
                this.f45679b.clearCache(false);
            } else {
                mKWebView.setBackgroundColor(0);
                this.f45679b.getSettings().setCacheMode(2);
                this.f45679b.clearCache(true);
            }
        }
    }

    public void setWebViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener != null) {
            WebViewX webViewX = this.f45678a;
            if (webViewX != null) {
                webViewX.setOnLongClickListener(onLongClickListener);
                return;
            }
            MKWebView mKWebView = this.f45679b;
            if (mKWebView != null) {
                mKWebView.setOnLongClickListener(onLongClickListener);
            }
        }
    }

    public void setWebViewMarginTop(int i) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            bnl0.m105540X(webViewX, i);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            bnl0.m105540X(mKWebView, i);
        }
    }

    public void setWebViewOverScrollMode(int i) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.setOverScrollMode(i);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.setOverScrollMode(i);
        }
    }

    public void setWithErrorView(boolean z) {
        this.f45690m = z;
    }

    public void setWithProgressView(boolean z) {
        this.f45689l = z;
    }

    /* JADX INFO: renamed from: t */
    public void m70054t() {
        WebView webview = getWebview();
        if (webview == null) {
            return;
        }
        webview.setLayerType(2, null);
        webview.setBackgroundColor(0);
        WebSettings settings = webview.getSettings();
        settings.setCacheMode(1);
        settings.setMixedContentMode(0);
        settings.setBuiltInZoomControls(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
    }

    /* JADX INFO: renamed from: u */
    public final void m70055u() {
        this.f45685h = getPageListener();
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.getSettings().setCacheMode(-1);
            this.f45678a.setWebViewClientX(new C12648a());
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.getSettings().setCacheMode(-1);
            this.f45679b.setMKWebLoadListener(new C12649b(this.f45680c));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m70056v() {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.loadUrl("about:blank");
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.loadUrl("about:blank");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m70057w(String str) {
        String strM154223p = lhl.INSTANCE.m154223p(str);
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.loadUrl(strM154223p, new HashMap());
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.loadUrl(strM154223p, new HashMap());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m70058x(String str, Map<String, String> map) {
        String strM154223p = lhl.INSTANCE.m154223p(str);
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.loadUrl(strM154223p, map);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.loadUrl(strM154223p, map);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m70059y(boolean z, String str, CommonH5Builder.BgType bgType) {
        m70053s(getContext(), z);
        m70051q(str, bgType);
        m70055u();
    }

    /* JADX INFO: renamed from: z */
    public void m70060z(int i, Object obj) {
        WebViewX webViewX = this.f45678a;
        if (webViewX != null) {
            webViewX.setTag(i, obj);
            return;
        }
        MKWebView mKWebView = this.f45679b;
        if (mKWebView != null) {
            mKWebView.setTag(i, obj);
        }
    }

    public LiveMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45688k = true;
        this.f45689l = true;
        this.f45690m = true;
        this.f45691n = vec0.f183727I;
    }

    public LiveMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45688k = true;
        this.f45689l = true;
        this.f45690m = true;
        this.f45691n = vec0.f183727I;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$a */
    public class C12648a extends WebViewClientX {
        public C12648a() {
        }

        @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            bnl0.m105525M0(webViewX, !LiveMkWebView.this.f45686i);
            if (LiveMkWebView.this.f45685h != null) {
                LiveMkWebView.this.f45685h.mo37613a(str);
            }
        }

        @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
            super.onPageStartedX(webViewX, str, bitmap);
            LiveMkWebView.this.f45686i = false;
            if (!bnl0.m105529O0(webViewX)) {
                bnl0.m105524M(webViewX, true);
            }
            if (LiveMkWebView.this.f45685h != null) {
                LiveMkWebView.this.f45685h.mo37614b(str);
            }
        }

        @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
            super.onReceivedErrorX(webViewX, i, str, str2);
            LiveMkWebView.this.f45686i = true;
            webViewX.loadUrl("about:blank");
            webViewX.setVisibility(4);
            if (LiveMkWebView.this.f45685h != null) {
                LiveMkWebView.this.f45685h.mo37615c(i, str, str2);
            }
            fhw.m125605a("[live]webDialog", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, LiveMkWebView.class.getName());
        }

        @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onReceivedErrorX(WebViewX webViewX, bsp0 bsp0Var, asp0 asp0Var) {
            super.onReceivedErrorX(webViewX, bsp0Var, asp0Var);
            fhw.m125605a("[live]webDialog", "onReceivedErrorX webResourceError = " + ((Object) asp0Var.m99963a()));
            awr.m100709c(webViewX, bsp0Var, asp0Var, LiveMkWebView.class.getName());
        }
    }
}
