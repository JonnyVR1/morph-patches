package com.p046p1.mobile.putong.live.base.webview;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewClientX;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.Map;
import p149l.aoq;
import p149l.cow;
import p149l.d5c0;
import p149l.edv;
import p149l.hfw;
import p149l.ihw;
import p149l.izb;
import p149l.jkp0;
import p149l.q6c0;
import p149l.sw3;
import p149l.thp0;
import p149l.uvr;
import p149l.vip0;
import p149l.wip0;
import p149l.woo;
import p149l.wul;
import p149l.xdl0;
import p149l.ztr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMkWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f44830a;

    /* JADX INFO: renamed from: b */
    public MKWebView f44831b;

    /* JADX INFO: renamed from: c */
    public izb f44832c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f44833d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f44834e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f44835f;

    /* JADX INFO: renamed from: g */
    public ImageView f44836g;

    /* JADX INFO: renamed from: h */
    public sw3.InterfaceC20043a f44837h;

    /* JADX INFO: renamed from: i */
    public boolean f44838i;

    /* JADX INFO: renamed from: j */
    public aoq f44839j;

    /* JADX INFO: renamed from: k */
    public boolean f44840k;

    /* JADX INFO: renamed from: l */
    public boolean f44841l;

    /* JADX INFO: renamed from: m */
    public boolean f44842m;

    /* JADX INFO: renamed from: n */
    public int f44843n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$b */
    public class C12486b extends MKWebViewHelper.C14921b {
        public C12486b(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            if (str2.endsWith(".js") || str2.endsWith(".html") || str2.endsWith(".css")) {
                super.mo43911e(webView, i, str, str2);
                LiveMkWebView.this.f44838i = true;
                webView.loadUrl("about:blank");
                webView.setVisibility(4);
                if (LiveMkWebView.this.f44837h != null) {
                    LiveMkWebView.this.f44837h.mo36612c(i, str, str2);
                }
                hfw.m130790a("[live]webDialog", "onReceivedErrorX message = " + str);
                ztr.m220137b(i, str, str2, LiveMkWebView.class.getName());
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            xdl0.m208345M0(webView, !LiveMkWebView.this.f44838i);
            if (LiveMkWebView.this.f44837h != null) {
                LiveMkWebView.this.f44837h.mo36610a(str);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            super.mo43913g(webView, str, bitmap);
            LiveMkWebView.this.f44838i = false;
            if (!xdl0.m208349O0(webView)) {
                xdl0.m208344M(webView, true);
            }
            if (LiveMkWebView.this.f44837h != null) {
                LiveMkWebView.this.f44837h.mo36611b(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$c */
    public class C12487c implements sw3.InterfaceC20043a {
        public C12487c() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.m208344M(LiveMkWebView.this.f44833d, false);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.m208344M(LiveMkWebView.this.f44834e, false);
            if (LiveMkWebView.this.f44841l) {
                xdl0.m208344M(LiveMkWebView.this.f44833d, true);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            if (TextUtils.equals(str2, "about:blank")) {
                return;
            }
            xdl0.m208344M(LiveMkWebView.this.f44833d, false);
            if (LiveMkWebView.this.f44842m) {
                xdl0.m208344M(LiveMkWebView.this.f44834e, true);
            }
            if (LiveMkWebView.this.f44840k) {
                WebViewX webViewX = LiveMkWebView.this.f44830a;
                LiveMkWebView liveMkWebView = LiveMkWebView.this;
                if (webViewX != null) {
                    liveMkWebView.f44830a.setBackgroundColor(-1);
                } else if (liveMkWebView.f44831b != null) {
                    LiveMkWebView.this.f44831b.setBackgroundColor(-1);
                }
            }
        }
    }

    public LiveMkWebView(@NonNull Context context) {
        super(context);
        this.f44840k = true;
        this.f44841l = true;
        this.f44842m = true;
        this.f44843n = q6c0.f152870I;
    }

    private sw3.InterfaceC20043a getPageListener() {
        return new C12487c();
    }

    private WebView getWebview() {
        WebViewX webViewX = this.f44830a;
        return webViewX != null ? webViewX : this.f44831b;
    }

    /* JADX INFO: renamed from: A */
    public void m68860A() {
        if (this.f44842m) {
            xdl0.m208344M(this.f44834e, true);
        }
        xdl0.m208344M(this.f44833d, false);
    }

    /* JADX INFO: renamed from: B */
    public void m68861B() {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.stopLoading();
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.stopLoading();
        }
    }

    public int getWebViewHashCode() {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            return webViewX.hashCode();
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            return mKWebView.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public void m68862k(PutongAct putongAct, String str, String str2) {
        m68863l(putongAct, str, str2, new HashMap());
    }

    /* JADX INFO: renamed from: l */
    public void m68863l(PutongAct putongAct, String str, String str2, Map<String, String> map) {
        WebViewX webViewX = this.f44830a;
        if (webViewX == null) {
            if (this.f44831b != null) {
                if (jkp0.m141904d(str2)) {
                    map.put("H5-Authorization", str);
                }
                this.f44831b.loadUrl(str2, map);
                return;
            }
            return;
        }
        if (this.f44839j == null) {
            this.f44839j = new aoq(putongAct, str, webViewX);
        }
        this.f44830a.addJavascriptInterface(this.f44839j, "tantan");
        if (jkp0.m141904d(str2)) {
            map.put("H5-Authorization", str);
        }
        this.f44830a.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: m */
    public void m68864m(woo wooVar, String str) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.addJavascriptInterface(wooVar, str);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.addJavascriptInterface(wooVar, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m68865n(String str) {
        aoq aoqVar = this.f44839j;
        if (aoqVar == null || str == null) {
            return;
        }
        aoqVar.m97924d().mo127284a(str);
    }

    /* JADX INFO: renamed from: o */
    public boolean m68866o() {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null && webViewX.canGoBack() && !"about:blank".equals(this.f44830a.getUrl())) {
            return true;
        }
        MKWebView mKWebView = this.f44831b;
        return (mKWebView == null || !mKWebView.canGoBack() || "about:blank".equals(this.f44831b.getUrl())) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p */
    public void m68867p() {
        edv.m115834a(this.f44830a, this.f44839j);
        edv.m115835b(this.f44831b, this.f44832c);
        this.f44830a = null;
        this.f44831b = null;
        this.f44839j = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m68868q(String str, CommonH5Builder.BgType bgType) {
        View viewFindViewById;
        if (uvr.m196087d().m162725x0() && this.f44843n == q6c0.f152871J) {
            hfw.m130790a("[live]campaign", "MK 优化  ,开启 WebView缓存池");
            LinearLayout linearLayout = (LinearLayout) findViewById(d5c0.f84505p1);
            if (linearLayout != null) {
                viewFindViewById = ihw.INSTANCE.m136322s((PutongAct) getContext(), str, ((PutongAct) getContext()).act.getIntent());
                if (viewFindViewById == null) {
                    viewFindViewById = new MKWebView((PutongAct) getContext(), cow.m108032a(((PutongAct) getContext()).act.getIntent(), str));
                    hfw.m130790a("[live]campaign", "MK 优化  ,缓存池为空 重新创建webview");
                } else {
                    CommonH5Builder.BgType bgType2 = CommonH5Builder.BgType.DEFAULT_BG;
                    if (bgType != bgType2) {
                        viewFindViewById.setBackgroundColor(0);
                    }
                    StringBuilder sb = new StringBuilder("MK 优化  , 使用WebView缓存池(背景色");
                    sb.append(bgType != bgType2 ? "透明值" : "默认值");
                    sb.append(")");
                    hfw.m130790a("[live]campaign", sb.toString());
                }
                if (viewFindViewById.getParent() == null) {
                    linearLayout.setVisibility(0);
                    linearLayout.addView(viewFindViewById, new ViewGroup.LayoutParams(-1, -1));
                }
            } else {
                viewFindViewById = null;
            }
        } else {
            viewFindViewById = findViewById(d5c0.f84502o1);
        }
        if (viewFindViewById instanceof MKWebView) {
            this.f44831b = (MKWebView) viewFindViewById;
            izb izbVar = new izb();
            this.f44832c = izbVar;
            izbVar.m87118q((Activity) getContext(), this.f44831b);
            this.f44832c.m139034A((PutongAct) getContext(), "", this.f44831b, "");
        } else {
            this.f44830a = (WebViewX) viewFindViewById;
        }
        this.f44833d = (ProgressBar) findViewById(d5c0.f84519w0);
        this.f44834e = (FrameLayout) findViewById(d5c0.f84426K);
        this.f44835f = (FrameLayout) findViewById(d5c0.f84525z0);
        this.f44836g = (ImageView) findViewById(d5c0.f84480h0);
    }

    /* JADX INFO: renamed from: r */
    public void m68869r() {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.goBack();
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.goBack();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m68870s(Context context, boolean z) {
        if (!z) {
            LayoutInflater.from(context).inflate(q6c0.f152874M, this);
            return;
        }
        if (uvr.m196087d().m162725x0()) {
            this.f44843n = q6c0.f152871J;
        }
        LayoutInflater.from(context).inflate(this.f44843n, this);
    }

    public void setCanLoadWhiteBgOnError(boolean z) {
        this.f44840k = z;
    }

    public void setOnCheckIsTextEditorFlag(boolean z) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.m29698h(z);
        }
    }

    public void setVerticalScrollBarEnable(boolean z) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.setVerticalScrollBarEnabled(z);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebChromeClientX(thp0 thp0Var) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.setWebChromeClientX(thp0Var);
        }
    }

    public void setWebViewBg(CommonH5Builder.BgType bgType) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                webViewX.setBackgroundColor(-1);
                this.f44830a.getSettings().setCacheMode(-1);
                this.f44830a.clearCache(false);
                return;
            } else {
                webViewX.setBackgroundColor(0);
                this.f44830a.getSettings().setCacheMode(2);
                this.f44830a.clearCache(true);
                return;
            }
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                mKWebView.setBackgroundColor(-1);
                this.f44831b.getSettings().setCacheMode(-1);
                this.f44831b.clearCache(false);
            } else {
                mKWebView.setBackgroundColor(0);
                this.f44831b.getSettings().setCacheMode(2);
                this.f44831b.clearCache(true);
            }
        }
    }

    public void setWebViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener != null) {
            WebViewX webViewX = this.f44830a;
            if (webViewX != null) {
                webViewX.setOnLongClickListener(onLongClickListener);
                return;
            }
            MKWebView mKWebView = this.f44831b;
            if (mKWebView != null) {
                mKWebView.setOnLongClickListener(onLongClickListener);
            }
        }
    }

    public void setWebViewMarginTop(int i) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            xdl0.m208360X(webViewX, i);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            xdl0.m208360X(mKWebView, i);
        }
    }

    public void setWebViewOverScrollMode(int i) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.setOverScrollMode(i);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.setOverScrollMode(i);
        }
    }

    public void setWithErrorView(boolean z) {
        this.f44842m = z;
    }

    public void setWithProgressView(boolean z) {
        this.f44841l = z;
    }

    /* JADX INFO: renamed from: t */
    public void m68871t() {
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
    public final void m68872u() {
        this.f44837h = getPageListener();
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.getSettings().setCacheMode(-1);
            this.f44830a.setWebViewClientX(new C12485a());
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.getSettings().setCacheMode(-1);
            this.f44831b.setMKWebLoadListener(new C12486b(this.f44832c));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m68873v() {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.loadUrl("about:blank");
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.loadUrl("about:blank");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m68874w(String str) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.loadUrl(str, new HashMap());
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.loadUrl(str, new HashMap());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m68875x(String str, Map<String, String> map) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.loadUrl(str, map);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.loadUrl(str, map);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m68876y(boolean z, String str, CommonH5Builder.BgType bgType) {
        m68870s(getContext(), z);
        m68868q(str, bgType);
        m68872u();
    }

    /* JADX INFO: renamed from: z */
    public void m68877z(int i, Object obj) {
        WebViewX webViewX = this.f44830a;
        if (webViewX != null) {
            webViewX.setTag(i, obj);
            return;
        }
        MKWebView mKWebView = this.f44831b;
        if (mKWebView != null) {
            mKWebView.setTag(i, obj);
        }
    }

    public LiveMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44840k = true;
        this.f44841l = true;
        this.f44842m = true;
        this.f44843n = q6c0.f152870I;
    }

    public LiveMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44840k = true;
        this.f44841l = true;
        this.f44842m = true;
        this.f44843n = q6c0.f152870I;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.webview.LiveMkWebView$a */
    public class C12485a extends WebViewClientX {
        public C12485a() {
        }

        @Override // com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            xdl0.m208345M0(webViewX, !LiveMkWebView.this.f44838i);
            if (LiveMkWebView.this.f44837h != null) {
                LiveMkWebView.this.f44837h.mo36610a(str);
            }
        }

        @Override // com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
            super.onPageStartedX(webViewX, str, bitmap);
            LiveMkWebView.this.f44838i = false;
            if (!xdl0.m208349O0(webViewX)) {
                xdl0.m208344M(webViewX, true);
            }
            if (LiveMkWebView.this.f44837h != null) {
                LiveMkWebView.this.f44837h.mo36611b(str);
            }
        }

        @Override // com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
            super.onReceivedErrorX(webViewX, i, str, str2);
            LiveMkWebView.this.f44838i = true;
            webViewX.loadUrl("about:blank");
            webViewX.setVisibility(4);
            if (LiveMkWebView.this.f44837h != null) {
                LiveMkWebView.this.f44837h.mo36612c(i, str, str2);
            }
            hfw.m130790a("[live]webDialog", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, LiveMkWebView.class.getName());
        }

        @Override // com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onReceivedErrorX(WebViewX webViewX, wip0 wip0Var, vip0 vip0Var) {
            super.onReceivedErrorX(webViewX, wip0Var, vip0Var);
            hfw.m130790a("[live]webDialog", "onReceivedErrorX webResourceError = " + ((Object) vip0Var.m198600a()));
            ztr.m220138c(webViewX, wip0Var, vip0Var, LiveMkWebView.class.getName());
        }
    }
}
