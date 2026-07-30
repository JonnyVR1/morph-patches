package com.p046p1.mobile.putong.p065ui.webview.p068mk;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonMkWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.Map;
import org.json.JSONObject;
import p149l.aoq;
import p149l.cow;
import p149l.e30;
import p149l.e400;
import p149l.e51;
import p149l.e6c0;
import p149l.f400;
import p149l.ihw;
import p149l.izb;
import p149l.jkp0;
import p149l.s4c0;
import p149l.sw3;
import p149l.wul;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CommonMkWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f54776a;

    /* JADX INFO: renamed from: b */
    public izb f54777b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f54778c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f54779d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f54780e;

    /* JADX INFO: renamed from: f */
    public ImageView f54781f;

    /* JADX INFO: renamed from: g */
    public sw3.InterfaceC20043a f54782g;

    /* JADX INFO: renamed from: h */
    public boolean f54783h;

    /* JADX INFO: renamed from: i */
    public aoq f54784i;

    /* JADX INFO: renamed from: j */
    public boolean f54785j;

    /* JADX INFO: renamed from: k */
    public boolean f54786k;

    /* JADX INFO: renamed from: l */
    public boolean f54787l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$a */
    public class C13144a extends MKWebViewHelper.C14921b {
        public C13144a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            if (str2.endsWith(".js") || str2.endsWith(".html") || str2.endsWith(".css")) {
                super.mo43911e(webView, i, str, str2);
                CommonMkWebView.this.f54783h = true;
                webView.loadUrl("about:blank");
                webView.setVisibility(4);
                if (CommonMkWebView.this.f54782g != null) {
                    CommonMkWebView.this.f54782g.mo36612c(i, str, str2);
                }
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            xdl0.m208345M0(webView, !CommonMkWebView.this.f54783h);
            if (CommonMkWebView.this.f54782g != null) {
                CommonMkWebView.this.f54782g.mo36610a(str);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            super.mo43913g(webView, str, bitmap);
            CommonMkWebView.this.f54783h = false;
            if (!xdl0.m208349O0(webView)) {
                xdl0.m208344M(webView, true);
            }
            if (CommonMkWebView.this.f54782g != null) {
                CommonMkWebView.this.f54782g.mo36611b(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$b */
    public class C13145b implements sw3.InterfaceC20043a {
        public C13145b() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.m208344M(CommonMkWebView.this.f54778c, false);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.m208344M(CommonMkWebView.this.f54779d, false);
            if (CommonMkWebView.this.f54786k) {
                xdl0.m208344M(CommonMkWebView.this.f54778c, true);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            if (TextUtils.equals(str2, "about:blank")) {
                return;
            }
            xdl0.m208344M(CommonMkWebView.this.f54778c, false);
            if (CommonMkWebView.this.f54787l) {
                xdl0.m208344M(CommonMkWebView.this.f54779d, true);
            }
            if (!CommonMkWebView.this.f54785j || CommonMkWebView.this.f54776a == null) {
                return;
            }
            CommonMkWebView.this.f54776a.setBackgroundColor(-1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$c */
    public class C13146c extends e400 {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ DialogC13147a f54790h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ CommonH5Builder f54791i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13146c(PutongAct putongAct, String str, MKWebView mKWebView, DialogC13147a dialogC13147a, CommonH5Builder commonH5Builder) {
            super(putongAct, str, mKWebView);
            this.f54790h = dialogC13147a;
            this.f54791i = commonH5Builder;
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ void m80226C(CommonH5Builder commonH5Builder, JSONObject jSONObject) {
            e30<String> e30Var = commonH5Builder.f54775k;
            if (e30Var != null) {
                e30Var.call(jSONObject.optString("action"));
            }
        }

        @Override // p149l.e400
        /* JADX INFO: renamed from: n */
        public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, final JSONObject jSONObject) {
            if ("closeDialogWebview".equals(str2)) {
                this.f54790h.dismiss();
                return false;
            }
            if (!"doNextAction".equals(str2)) {
                return false;
            }
            final CommonH5Builder commonH5Builder = this.f54791i;
            e51.m114748M(new Runnable() { // from class: l.kk5
                @Override // java.lang.Runnable
                public final void run() {
                    CommonMkWebView.C13146c.m80226C(commonH5Builder, jSONObject);
                }
            });
            return false;
        }
    }

    public CommonMkWebView(@NonNull Context context) {
        super(context);
        this.f54785j = true;
        this.f54786k = true;
        this.f54787l = true;
    }

    private sw3.InterfaceC20043a getPageListener() {
        return new C13145b();
    }

    private WebView getWebview() {
        return this.f54776a;
    }

    /* JADX INFO: renamed from: q */
    public static void m80216q(@Nullable MKWebView mKWebView, izb izbVar) {
        if (izbVar != null) {
            izbVar.m139039y();
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
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            return mKWebView.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public void m80217j(PutongAct putongAct, String str, String str2, Map<String, String> map) {
        if (this.f54776a != null) {
            if (jkp0.m141904d(str2)) {
                map.put("H5-Authorization", str);
            }
            this.f54776a.loadUrl(str2, map);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m80218k() {
        m80216q(this.f54776a, this.f54777b);
        this.f54776a = null;
        this.f54784i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m80219l(String str, CommonH5Builder.BgType bgType) {
        LinearLayout linearLayout = (LinearLayout) findViewById(s4c0.f162296G0);
        MKWebView mKWebViewM136322s = ihw.INSTANCE.m136322s((PutongAct) getContext(), str, ((PutongAct) getContext()).act.getIntent());
        if (mKWebViewM136322s == null) {
            mKWebViewM136322s = new MKWebView((PutongAct) getContext(), cow.m108032a(((PutongAct) getContext()).act.getIntent(), str));
        } else if (bgType != CommonH5Builder.BgType.DEFAULT_BG) {
            mKWebViewM136322s.setBackgroundColor(0);
        }
        if (mKWebViewM136322s.getParent() == null) {
            linearLayout.setVisibility(0);
            linearLayout.addView(mKWebViewM136322s, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f54776a = mKWebViewM136322s;
        izb izbVar = new izb();
        this.f54777b = izbVar;
        izbVar.m87118q((Activity) getContext(), this.f54776a);
        this.f54777b.m139034A((PutongAct) getContext(), "", this.f54776a, "");
        this.f54778c = (ProgressBar) findViewById(s4c0.f162328c0);
        this.f54779d = (LinearLayout) findViewById(s4c0.f162287C);
        this.f54780e = (LinearLayout) findViewById(s4c0.f162350n0);
        this.f54781f = (ImageView) findViewById(s4c0.f162315S);
    }

    /* JADX INFO: renamed from: m */
    public final void m80220m(Context context) {
        LayoutInflater.from(context).inflate(e6c0.f89551j, this);
    }

    /* JADX INFO: renamed from: n */
    public final void m80221n() {
        this.f54782g = getPageListener();
        this.f54776a.getSettings().setCacheMode(-1);
        this.f54776a.setMKWebLoadListener(new C13144a(this.f54777b));
    }

    /* JADX INFO: renamed from: o */
    public void m80222o(String str, CommonH5Builder.BgType bgType) {
        m80220m(getContext());
        m80219l(str, bgType);
        m80221n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p */
    public void m80223p() {
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            mKWebView.loadUrl("about:blank");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m80224r(DialogC13147a dialogC13147a, String str, CommonH5Builder commonH5Builder) {
        this.f54777b.m87119v(str, new C13146c((PutongAct) getContext(), "", this.f54776a, dialogC13147a, commonH5Builder));
    }

    /* JADX INFO: renamed from: s */
    public void m80225s(int i, Object obj) {
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            mKWebView.setTag(i, obj);
        }
    }

    public void setCanLoadWhiteBgOnError(boolean z) {
        this.f54785j = z;
    }

    public void setVerticalScrollBarEnable(boolean z) {
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            mKWebView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebViewBg(CommonH5Builder.BgType bgType) {
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                mKWebView.setBackgroundColor(-1);
                this.f54776a.getSettings().setCacheMode(-1);
                this.f54776a.clearCache(false);
            } else {
                mKWebView.setBackgroundColor(0);
                this.f54776a.getSettings().setCacheMode(2);
                this.f54776a.clearCache(true);
            }
        }
    }

    public void setWebViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        MKWebView mKWebView;
        if (onLongClickListener == null || (mKWebView = this.f54776a) == null) {
            return;
        }
        mKWebView.setOnLongClickListener(onLongClickListener);
    }

    public void setWebViewOverScrollMode(int i) {
        MKWebView mKWebView = this.f54776a;
        if (mKWebView != null) {
            mKWebView.setOverScrollMode(i);
        }
    }

    public void setWithErrorView(boolean z) {
        this.f54787l = z;
    }

    public void setWithProgressView(boolean z) {
        this.f54786k = z;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54785j = true;
        this.f54786k = true;
        this.f54787l = true;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54785j = true;
        this.f54786k = true;
        this.f54787l = true;
    }
}
