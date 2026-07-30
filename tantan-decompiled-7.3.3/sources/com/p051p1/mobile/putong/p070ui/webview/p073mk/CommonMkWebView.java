package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonMkWebView;
import java.util.Map;
import org.json.JSONObject;
import p153l.bnl0;
import p153l.brw;
import p153l.dpf0;
import p153l.jec0;
import p153l.l51;
import p153l.mjw;
import p153l.ntp0;
import p153l.nxl;
import p153l.rx3;
import p153l.w0c;
import p153l.wc00;
import p153l.xc00;
import p153l.y20;
import p153l.ycc0;
import p153l.zpq;

/* JADX INFO: loaded from: classes10.dex */
public class CommonMkWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f55624a;

    /* JADX INFO: renamed from: b */
    public w0c f55625b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f55626c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f55627d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f55628e;

    /* JADX INFO: renamed from: f */
    public ImageView f55629f;

    /* JADX INFO: renamed from: g */
    public rx3.InterfaceC19928a f55630g;

    /* JADX INFO: renamed from: h */
    public boolean f55631h;

    /* JADX INFO: renamed from: i */
    public zpq f55632i;

    /* JADX INFO: renamed from: j */
    public boolean f55633j;

    /* JADX INFO: renamed from: k */
    public boolean f55634k;

    /* JADX INFO: renamed from: l */
    public boolean f55635l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$a */
    public class C13307a extends dpf0 {
        public C13307a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            if (str2.endsWith(".js") || str2.endsWith(".html") || str2.endsWith(".css")) {
                super.mo17978e(webView, i, str, str2);
                CommonMkWebView.this.f55631h = true;
                webView.loadUrl("about:blank");
                webView.setVisibility(4);
                if (CommonMkWebView.this.f55630g != null) {
                    CommonMkWebView.this.f55630g.mo37615c(i, str, str2);
                }
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            bnl0.m105525M0(webView, !CommonMkWebView.this.f55631h);
            if (CommonMkWebView.this.f55630g != null) {
                CommonMkWebView.this.f55630g.mo37613a(str);
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
            CommonMkWebView.this.f55631h = false;
            if (!bnl0.m105529O0(webView)) {
                bnl0.m105524M(webView, true);
            }
            if (CommonMkWebView.this.f55630g != null) {
                CommonMkWebView.this.f55630g.mo37614b(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$b */
    public class C13308b implements rx3.InterfaceC19928a {
        public C13308b() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            bnl0.m105524M(CommonMkWebView.this.f55626c, false);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            bnl0.m105524M(CommonMkWebView.this.f55627d, false);
            if (CommonMkWebView.this.f55634k) {
                bnl0.m105524M(CommonMkWebView.this.f55626c, true);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            if (TextUtils.equals(str2, "about:blank")) {
                return;
            }
            bnl0.m105524M(CommonMkWebView.this.f55626c, false);
            if (CommonMkWebView.this.f55635l) {
                bnl0.m105524M(CommonMkWebView.this.f55627d, true);
            }
            if (!CommonMkWebView.this.f55633j || CommonMkWebView.this.f55624a == null) {
                return;
            }
            CommonMkWebView.this.f55624a.setBackgroundColor(-1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$c */
    public class C13309c extends wc00 {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ DialogC13310a f55638h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ CommonH5Builder f55639i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13309c(PutongAct putongAct, String str, MKWebView mKWebView, DialogC13310a dialogC13310a, CommonH5Builder commonH5Builder) {
            super(putongAct, str, mKWebView);
            this.f55638h = dialogC13310a;
            this.f55639i = commonH5Builder;
        }

        /* JADX INFO: renamed from: K */
        public static /* synthetic */ void m81409K(CommonH5Builder commonH5Builder, JSONObject jSONObject) {
            y20<String> y20Var = commonH5Builder.f55623k;
            if (y20Var != null) {
                y20Var.call(jSONObject.optString("action"));
            }
        }

        @Override // p153l.wc00
        /* JADX INFO: renamed from: v */
        public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
            if ("closeDialogWebview".equals(str2)) {
                this.f55638h.dismiss();
                return false;
            }
            if (!"doNextAction".equals(str2)) {
                return false;
            }
            final CommonH5Builder commonH5Builder = this.f55639i;
            l51.m152893M(new Runnable() { // from class: l.ll5
                @Override // java.lang.Runnable
                public final void run() {
                    CommonMkWebView.C13309c.m81409K(commonH5Builder, jSONObject);
                }
            });
            return false;
        }
    }

    public CommonMkWebView(@NonNull Context context) {
        super(context);
        this.f55633j = true;
        this.f55634k = true;
        this.f55635l = true;
    }

    private rx3.InterfaceC19928a getPageListener() {
        return new C13308b();
    }

    private WebView getWebview() {
        return this.f55624a;
    }

    /* JADX INFO: renamed from: q */
    public static void m81399q(@Nullable MKWebView mKWebView, w0c w0cVar) {
        if (w0cVar != null) {
            w0cVar.m204135K();
        }
        if (mKWebView != null) {
            mKWebView.removeAllViews();
            ViewParent parent = mKWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mKWebView);
            }
            mKWebView.setTag(null);
            mKWebView.clearHistory();
            mKWebView.destroy();
        }
    }

    public int getWebViewHashCode() {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            return mKWebView.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public void m81400j(PutongAct putongAct, String str, String str2, Map<String, String> map) {
        if (this.f55624a != null) {
            if (ntp0.m164746d(str2)) {
                map.put("H5-Authorization", str);
            }
            this.f55624a.loadUrl(str2, map);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m81401k() {
        m81399q(this.f55624a, this.f55625b);
        this.f55624a = null;
        this.f55632i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m81402l(String str, CommonH5Builder.BgType bgType) {
        LinearLayout linearLayout = (LinearLayout) findViewById(ycc0.f198417G0);
        MKWebView mKWebViewM158641s = mjw.INSTANCE.m158641s((PutongAct) getContext(), str, ((PutongAct) getContext()).act.getIntent());
        if (mKWebViewM158641s == null) {
            mKWebViewM158641s = new MKWebView((PutongAct) getContext(), brw.m106162a(((PutongAct) getContext()).act.getIntent(), str));
        } else if (bgType != CommonH5Builder.BgType.DEFAULT_BG) {
            mKWebViewM158641s.setBackgroundColor(0);
        }
        if (mKWebViewM158641s.getParent() == null) {
            linearLayout.setVisibility(0);
            linearLayout.addView(mKWebViewM158641s, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f55624a = mKWebViewM158641s;
        w0c w0cVar = new w0c();
        this.f55625b = w0cVar;
        w0cVar.m17975z((Activity) getContext(), this.f55624a);
        this.f55625b.m204137M((PutongAct) getContext(), "", this.f55624a, "");
        this.f55626c = (ProgressBar) findViewById(ycc0.f198449c0);
        this.f55627d = (LinearLayout) findViewById(ycc0.f198408C);
        this.f55628e = (LinearLayout) findViewById(ycc0.f198471n0);
        this.f55629f = (ImageView) findViewById(ycc0.f198436S);
    }

    /* JADX INFO: renamed from: m */
    public final void m81403m(Context context) {
        LayoutInflater.from(context).inflate(jec0.f120464j, this);
    }

    /* JADX INFO: renamed from: n */
    public final void m81404n() {
        this.f55630g = getPageListener();
        this.f55624a.getSettings().setCacheMode(-1);
        this.f55624a.setMKWebLoadListener(new C13307a(this.f55625b));
    }

    /* JADX INFO: renamed from: o */
    public void m81405o(String str, CommonH5Builder.BgType bgType) {
        m81403m(getContext());
        m81402l(str, bgType);
        m81404n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p */
    public void m81406p() {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            mKWebView.loadUrl("about:blank");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m81407r(DialogC13310a dialogC13310a, String str, CommonH5Builder commonH5Builder) {
        this.f55625b.m17958H(str, new C13309c((PutongAct) getContext(), "", this.f55624a, dialogC13310a, commonH5Builder));
    }

    /* JADX INFO: renamed from: s */
    public void m81408s(int i, Object obj) {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            mKWebView.setTag(i, obj);
        }
    }

    public void setCanLoadWhiteBgOnError(boolean z) {
        this.f55633j = z;
    }

    public void setVerticalScrollBarEnable(boolean z) {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            mKWebView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebViewBg(CommonH5Builder.BgType bgType) {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                mKWebView.setBackgroundColor(-1);
                this.f55624a.getSettings().setCacheMode(-1);
                this.f55624a.clearCache(false);
            } else {
                mKWebView.setBackgroundColor(0);
                this.f55624a.getSettings().setCacheMode(2);
                this.f55624a.clearCache(true);
            }
        }
    }

    public void setWebViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        MKWebView mKWebView;
        if (onLongClickListener == null || (mKWebView = this.f55624a) == null) {
            return;
        }
        mKWebView.setOnLongClickListener(onLongClickListener);
    }

    public void setWebViewOverScrollMode(int i) {
        MKWebView mKWebView = this.f55624a;
        if (mKWebView != null) {
            mKWebView.setOverScrollMode(i);
        }
    }

    public void setWithErrorView(boolean z) {
        this.f55635l = z;
    }

    public void setWithProgressView(boolean z) {
        this.f55634k = z;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55633j = true;
        this.f55634k = true;
        this.f55635l = true;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55633j = true;
        this.f55634k = true;
        this.f55635l = true;
    }
}
