package com.p000p1.mobile.putong.p004ui.webview.p007mk;

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
import com.p000p1.mobile.putong.p004ui.webview.p007mk.CommonMkWebView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.Map;
import l.cow;
import l.e30;
import l.e51;
import l.e6c0;
import l.ihw;
import l.s4c0;
import l.wul;
import l.xdl0;
import org.json.JSONObject;
import p009l.aoq;
import p009l.e400;
import p009l.f400;
import p009l.izb;
import p009l.jkp0;
import p009l.sw3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CommonMkWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f8382a;

    /* JADX INFO: renamed from: b */
    public izb f8383b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f8384c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f8385d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f8386e;

    /* JADX INFO: renamed from: f */
    public ImageView f8387f;

    /* JADX INFO: renamed from: g */
    public sw3.InterfaceC1195a f8388g;

    /* JADX INFO: renamed from: h */
    public boolean f8389h;

    /* JADX INFO: renamed from: i */
    public aoq f8390i;

    /* JADX INFO: renamed from: j */
    public boolean f8391j;

    /* JADX INFO: renamed from: k */
    public boolean f8392k;

    /* JADX INFO: renamed from: l */
    public boolean f8393l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$a */
    public class C0546a extends MKWebViewHelper.b {
        public C0546a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: renamed from: e */
        public void m10564e(WebView webView, int i, String str, String str2) {
            if (str2.endsWith(".js") || str2.endsWith(".html") || str2.endsWith(".css")) {
                super.e(webView, i, str, str2);
                CommonMkWebView.this.f8389h = true;
                webView.loadUrl("about:blank");
                webView.setVisibility(4);
                if (CommonMkWebView.this.f8388g != null) {
                    CommonMkWebView.this.f8388g.mo554c(i, str, str2);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m10565f(WebView webView, String str) {
            super.f(webView, str);
            xdl0.M0(webView, !CommonMkWebView.this.f8389h);
            if (CommonMkWebView.this.f8388g != null) {
                CommonMkWebView.this.f8388g.mo552a(str);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m10566g(WebView webView, String str, Bitmap bitmap) {
            super.g(webView, str, bitmap);
            CommonMkWebView.this.f8389h = false;
            if (!xdl0.O0(webView)) {
                xdl0.M(webView, true);
            }
            if (CommonMkWebView.this.f8388g != null) {
                CommonMkWebView.this.f8388g.mo553b(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$b */
    public class C0547b implements sw3.InterfaceC1195a {
        public C0547b() {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.M(CommonMkWebView.this.f8384c, false);
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
            if (TextUtils.equals(str, "about:blank")) {
                return;
            }
            xdl0.M(CommonMkWebView.this.f8385d, false);
            if (CommonMkWebView.this.f8392k) {
                xdl0.M(CommonMkWebView.this.f8384c, true);
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            if (TextUtils.equals(str2, "about:blank")) {
                return;
            }
            xdl0.M(CommonMkWebView.this.f8384c, false);
            if (CommonMkWebView.this.f8393l) {
                xdl0.M(CommonMkWebView.this.f8385d, true);
            }
            if (!CommonMkWebView.this.f8391j || CommonMkWebView.this.f8382a == null) {
                return;
            }
            CommonMkWebView.this.f8382a.setBackgroundColor(-1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.webview.mk.CommonMkWebView$c */
    public class C0548c extends e400 {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C0549a f8396h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ CommonH5Builder f8397i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0548c(PutongAct putongAct, String str, MKWebView mKWebView, C0549a c0549a, CommonH5Builder commonH5Builder) {
            super(putongAct, str, mKWebView);
            this.f8396h = c0549a;
            this.f8397i = commonH5Builder;
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ void m10567C(CommonH5Builder commonH5Builder, JSONObject jSONObject) {
            e30<String> e30Var = commonH5Builder.f8381k;
            if (e30Var != null) {
                e30Var.call(jSONObject.optString("action"));
            }
        }

        @Override // p009l.e400
        /* JADX INFO: renamed from: n */
        public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, final JSONObject jSONObject) {
            if ("closeDialogWebview".equals(str2)) {
                this.f8396h.dismiss();
                return false;
            }
            if (!"doNextAction".equals(str2)) {
                return false;
            }
            final CommonH5Builder commonH5Builder = this.f8397i;
            e51.M(new Runnable() { // from class: l.kk5
                @Override // java.lang.Runnable
                public final void run() {
                    CommonMkWebView.C0548c.m10567C(commonH5Builder, jSONObject);
                }
            });
            return false;
        }
    }

    public CommonMkWebView(@NonNull Context context) {
        super(context);
        this.f8391j = true;
        this.f8392k = true;
        this.f8393l = true;
    }

    private sw3.InterfaceC1195a getPageListener() {
        return new C0547b();
    }

    private WebView getWebview() {
        return this.f8382a;
    }

    /* JADX INFO: renamed from: q */
    public static void m10554q(@Nullable MKWebView mKWebView, izb izbVar) {
        if (izbVar != null) {
            izbVar.m16809y();
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
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            return mKWebView.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public void m10555j(PutongAct putongAct, String str, String str2, Map<String, String> map) {
        if (this.f8382a != null) {
            if (jkp0.m17145d(str2)) {
                map.put("H5-Authorization", str);
            }
            this.f8382a.loadUrl(str2, map);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10556k() {
        m10554q(this.f8382a, this.f8383b);
        this.f8382a = null;
        this.f8390i = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m10557l(String str, CommonH5Builder.BgType bgType) {
        LinearLayout linearLayout = (LinearLayout) findViewById(s4c0.G0);
        MKWebView mKWebViewS = ihw.INSTANCE.s(getContext(), str, ((Act) getContext()).act.getIntent());
        if (mKWebViewS == null) {
            mKWebViewS = new MKWebView(getContext(), cow.a(((Act) getContext()).act.getIntent(), str));
        } else if (bgType != CommonH5Builder.BgType.DEFAULT_BG) {
            mKWebViewS.setBackgroundColor(0);
        }
        if (mKWebViewS.getParent() == null) {
            linearLayout.setVisibility(0);
            linearLayout.addView((View) mKWebViewS, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f8382a = mKWebViewS;
        izb izbVar = new izb();
        this.f8383b = izbVar;
        izbVar.q((Activity) getContext(), this.f8382a);
        this.f8383b.m16803A((PutongAct) getContext(), "", this.f8382a, "");
        this.f8384c = (ProgressBar) findViewById(s4c0.c0);
        this.f8385d = (LinearLayout) findViewById(s4c0.C);
        this.f8386e = (LinearLayout) findViewById(s4c0.n0);
        this.f8387f = (ImageView) findViewById(s4c0.S);
    }

    /* JADX INFO: renamed from: m */
    public final void m10558m(Context context) {
        LayoutInflater.from(context).inflate(e6c0.j, this);
    }

    /* JADX INFO: renamed from: n */
    public final void m10559n() {
        this.f8388g = getPageListener();
        this.f8382a.getSettings().setCacheMode(-1);
        this.f8382a.setMKWebLoadListener(new C0546a(this.f8383b));
    }

    /* JADX INFO: renamed from: o */
    public void m10560o(String str, CommonH5Builder.BgType bgType) {
        m10558m(getContext());
        m10557l(str, bgType);
        m10559n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p */
    public void m10561p() {
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            mKWebView.loadUrl("about:blank");
        }
    }

    /* JADX INFO: renamed from: r */
    public void m10562r(C0549a c0549a, String str, CommonH5Builder commonH5Builder) {
        this.f8383b.v(str, new C0548c(getContext(), "", this.f8382a, c0549a, commonH5Builder));
    }

    /* JADX INFO: renamed from: s */
    public void m10563s(int i, Object obj) {
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            mKWebView.setTag(i, obj);
        }
    }

    public void setCanLoadWhiteBgOnError(boolean z) {
        this.f8391j = z;
    }

    public void setVerticalScrollBarEnable(boolean z) {
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            mKWebView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebViewBg(CommonH5Builder.BgType bgType) {
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            if (bgType == CommonH5Builder.BgType.DEFAULT_BG) {
                mKWebView.setBackgroundColor(-1);
                this.f8382a.getSettings().setCacheMode(-1);
                this.f8382a.clearCache(false);
            } else {
                mKWebView.setBackgroundColor(0);
                this.f8382a.getSettings().setCacheMode(2);
                this.f8382a.clearCache(true);
            }
        }
    }

    public void setWebViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        MKWebView mKWebView;
        if (onLongClickListener == null || (mKWebView = this.f8382a) == null) {
            return;
        }
        mKWebView.setOnLongClickListener(onLongClickListener);
    }

    public void setWebViewOverScrollMode(int i) {
        MKWebView mKWebView = this.f8382a;
        if (mKWebView != null) {
            mKWebView.setOverScrollMode(i);
        }
    }

    public void setWithErrorView(boolean z) {
        this.f8393l = z;
    }

    public void setWithProgressView(boolean z) {
        this.f8392k = z;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8391j = true;
        this.f8392k = true;
        this.f8393l = true;
    }

    public CommonMkWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8391j = true;
        this.f8392k = true;
        this.f8393l = true;
    }
}
