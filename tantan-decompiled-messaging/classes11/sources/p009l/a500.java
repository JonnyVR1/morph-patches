package p009l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkProgressView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.b500;
import l.cll;
import l.cow;
import l.d30;
import l.e30;
import l.e6c0;
import l.ihw;
import l.j760;
import l.mei;
import l.mkd0;
import l.ne80;
import l.qib0;
import l.s4c0;
import l.s7m;
import l.shw;
import l.u2c0;
import l.vwb;
import l.wul;
import l.zvf0;
import p009l.u400;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a500<P extends u400> implements s7m<P> {

    /* JADX INFO: renamed from: A */
    public String f9214A;

    /* JADX INFO: renamed from: B */
    public dze0 f9215B;

    /* JADX INFO: renamed from: D */
    public boolean f9217D;

    /* JADX INFO: renamed from: a */
    public VLinear f9223a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f9224b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f9225c;

    /* JADX INFO: renamed from: d */
    public P f9226d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f9227e;

    /* JADX INFO: renamed from: f */
    public izb f9228f;

    /* JADX INFO: renamed from: g */
    public MKWebView f9229g;

    /* JADX INFO: renamed from: h */
    public MkProgressView f9230h;

    /* JADX INFO: renamed from: i */
    public ProgressBar f9231i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f9232j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f9233k;

    /* JADX INFO: renamed from: l */
    public ImageView f9234l;

    /* JADX INFO: renamed from: m */
    public String f9235m;

    /* JADX INFO: renamed from: n */
    public String f9236n;

    /* JADX INFO: renamed from: o */
    public String f9237o;

    /* JADX INFO: renamed from: p */
    public boolean f9238p;

    /* JADX INFO: renamed from: q */
    public boolean f9239q;

    /* JADX INFO: renamed from: r */
    public boolean f9240r;

    /* JADX INFO: renamed from: s */
    public boolean f9241s;

    /* JADX INFO: renamed from: t */
    public boolean f9242t;

    /* JADX INFO: renamed from: u */
    public boolean f9243u;

    /* JADX INFO: renamed from: v */
    public boolean f9244v;

    /* JADX INFO: renamed from: w */
    public String f9245w;

    /* JADX INFO: renamed from: x */
    public String f9246x;

    /* JADX INFO: renamed from: y */
    public boolean f9247y;

    /* JADX INFO: renamed from: z */
    public boolean f9248z;

    /* JADX INFO: renamed from: C */
    public d30 f9216C = null;

    /* JADX INFO: renamed from: E */
    public boolean f9218E = true;

    /* JADX INFO: renamed from: F */
    public long f9219F = 0;

    /* JADX INFO: renamed from: G */
    public long f9220G = 0;

    /* JADX INFO: renamed from: H */
    public final AtomicInteger f9221H = new AtomicInteger();

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f9222I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.a500$a */
    public class C0745a implements ne80 {
        public C0745a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m11237a(String str) {
            zvp zvpVar = zvp.INSTANCE;
            a500 a500Var = a500.this;
            return zvpVar.m25985b(a500Var.f9229g, str, a500Var.f9227e);
        }

        /* JADX INFO: renamed from: b */
        public boolean m11238b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.a500$b */
    public class C0746b extends MKWebViewHelper.b {
        public C0746b(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: renamed from: e */
        public void m11239e(WebView webView, int i, String str, String str2) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            a500 a500Var = a500.this;
            a500Var.m11225W(a500Var.f9236n, map);
            if (a500.this.f9218E) {
                try {
                    MKWebView mKWebView = a500.this.f9229g;
                    if (mKWebView != null) {
                        mKWebView.getMkWebCaptureHelper().l(a500.this.f9229g);
                    }
                } catch (Exception unused) {
                }
                a500.this.f9232j.setVisibility(0);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m11240f(WebView webView, String str) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            a500.this.m11225W(str, map);
            System.currentTimeMillis();
            long unused = a500.this.f9220G;
            if (NullChecker.a(a500.this.f9229g)) {
                a500.this.f9229g.setLayerType(0, null);
            }
            a500.this.f9231i.setVisibility(8);
            if (TextUtils.isEmpty(a500.this.f9235m) && NullChecker.a(a500.this.f9229g) && !TextUtils.isEmpty(a500.this.f9229g.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && a500.this.f9232j.getVisibility() != 0) {
                Object tag = a500.this.f9229g.getTag(s4c0.J0);
                a500 a500Var = a500.this;
                if (tag == null) {
                    a500Var.f9227e.setTitle(a500.this.f9229g.getTitle());
                    a500 a500Var2 = a500.this;
                    a500Var2.f9224b.setTitle(a500Var2.f9229g.getTitle());
                } else {
                    a500Var.f9229g.setTag(s4c0.J0, null);
                }
            }
            if (NullChecker.a(a500.this.f9216C)) {
                a500.this.f9216C.call();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m11241g(WebView webView, String str, Bitmap bitmap) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onStart");
            a500.this.m11225W(str, map);
            System.currentTimeMillis();
            long unused = a500.this.f9220G;
            if (NullChecker.a(a500.this.f9229g)) {
                a500.this.f9229g.setLayerType(2, null);
            }
            if (a500.this.f9244v) {
                a500.this.f9231i.setVisibility(8);
            } else {
                boolean zContains = str.contains("&_offline=1");
                a500 a500Var = a500.this;
                if (zContains) {
                    a500Var.f9218E = false;
                    a500.this.f9231i.setVisibility(8);
                } else {
                    a500Var.f9218E = true;
                    a500.this.f9231i.setVisibility(0);
                }
            }
            super.g(webView, str, bitmap);
        }

        /* JADX INFO: renamed from: l */
        public void m11242l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super/*l.miw*/.l(webView, renderProcessGoneDetail);
            a500 a500Var = a500.this;
            if (a500Var.f9229g == webView) {
                a500Var.f9222I.set(true);
            }
        }

        /* JADX INFO: renamed from: m */
        public WebResourceResponse m11243m(WebView webView, String str) {
            WebResourceResponse webResourceResponseM11216L = a500.this.m11216L(webView, str);
            return NullChecker.a(webResourceResponseM11216L) ? webResourceResponseM11216L : super/*l.miw*/.m(webView, str);
        }
    }

    public a500(PutongAct putongAct) {
        this.f9227e = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m11191C() {
        if (this.f9247y) {
            this.f9227e.getWindow().addFlags(Integer.MIN_VALUE);
            this.f9227e.getWindow().clearFlags(67108864);
            this.f9227e.getWindow().setStatusBarColor(0);
            this.f9227e.setLightStatusBar(1296);
            this.f9227e.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f9227e.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f9227e.getWindow(), true);
            if (NullChecker.a(this.f9227e.getSupportActionBar())) {
                this.f9227e.getSupportActionBar().A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m11192G() {
        if (TextUtils.isEmpty(this.f9246x)) {
            return;
        }
        if (this.f9246x.equalsIgnoreCase("transparent")) {
            this.f9227e.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f9246x.startsWith("#");
        String str = this.f9246x;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f9227e.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    private void m11193I() {
        MkProgressView mkProgressView = (MkProgressView) this.f9227e.getLayoutInflater().inflate(e6c0.D, (ViewGroup) null);
        this.f9230h = mkProgressView;
        this.f9225c.addView(mkProgressView);
        MkProgressView mkProgressView2 = this.f9230h;
        this.f9231i = mkProgressView2.f8401a;
        this.f9232j = mkProgressView2.f8402b;
        this.f9233k = mkProgressView2.f8403c;
        this.f9234l = mkProgressView2.f8404d;
    }

    /* JADX INFO: renamed from: K */
    private void m11194K() {
        int color = 0;
        if (TextUtils.isEmpty(this.f9245w)) {
            this.f9229g.getSettings().setCacheMode(-1);
            this.f9229g.clearCache(false);
            return;
        }
        if (!this.f9245w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f9245w.startsWith("#");
            String str = this.f9245w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f9229g.getSettings().setCacheMode(-1);
                this.f9229g.clearCache(false);
                return;
            }
        }
        this.f9229g.setBackgroundColor(color);
        this.f9229g.getSettings().setCacheMode(2);
        this.f9229g.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11195P(View view) {
        this.f9227e.onHomePressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m11196Q(String str, String str2, String str3, String str4, long j) {
        m11208x(str);
    }

    /* JADX INFO: renamed from: x */
    private void m11208x(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f9227e.startActivity(intent);
    }

    /* JADX INFO: renamed from: A */
    public void m11209A() {
        this.f9229g.goBack();
    }

    /* JADX INFO: renamed from: B */
    public void m11210B() {
        cll cllVarR = cll.r(m11235y());
        if (cllVarR != null && TextUtils.equals("1", cllVarR.A("useToken")) && jkp0.m17145d(m11235y())) {
            act().duringCreated(qib0.c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.y400
                public final void call(Object obj) {
                    this.f22878a.m11218N((AuthData) obj);
                }
            }, new e30() { // from class: l.z400
                public final void call(Object obj) {
                    this.f23341a.m11219O((Throwable) obj);
                }
            }));
        } else {
            this.f9228f.m16803A(this.f9227e, "", this.f9229g, m11235y());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11211C0() {
        return this.f9227e;
    }

    /* JADX INFO: renamed from: E */
    public void m11212E() {
        this.f9219F = System.currentTimeMillis();
        this.f9228f = new izb();
        if (mei.x() > 0) {
            ihw ihwVar = ihw.INSTANCE;
            PutongAct putongAct = this.f9227e;
            MKWebView mKWebViewS = ihwVar.s(putongAct, this.f9236n, putongAct.getIntent());
            this.f9229g = mKWebViewS;
            if (mKWebViewS == null) {
                PutongAct putongAct2 = this.f9227e;
                this.f9229g = new MKWebView(putongAct2, cow.a(putongAct2.getIntent(), this.f9236n));
            } else if (!TextUtils.isEmpty(this.f9236n) && !TextUtils.isEmpty(this.f9245w) && this.f9245w.equalsIgnoreCase("transparent")) {
                this.f9229g.setBackgroundColor(0);
            }
        } else {
            PutongAct putongAct3 = this.f9227e;
            this.f9229g = new MKWebView(putongAct3, cow.a(putongAct3.getIntent(), this.f9236n));
        }
        if (this.f9229g.getParent() == null) {
            this.f9225c.addView(this.f9229g);
            m11193I();
        }
        this.f9229g.setMKPreLoadingUrlProcessor(new C0745a());
        this.f9228f.q(this.f9227e, this.f9229g);
        this.f9229g.setWebUserAgent(shw.k());
        this.f9229g.getSettings().setMixedContentMode(0);
        this.f9229g.setLayerType(2, null);
    }

    /* JADX INFO: renamed from: F */
    public void mo11213F() {
        this.f9224b.setLeftIconResource(u2c0.n);
        this.f9224b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.w400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21889a.m11195P(view);
            }
        });
        if (m11231s()) {
            this.f9224b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11214H() {
        if (TextUtils.isEmpty(this.f9214A)) {
            return;
        }
        gkp0.m15106c(this.f9227e, this.f9214A.equals("black"));
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: J */
    public void mo11215J() {
        if (TextUtils.isEmpty(m11235y())) {
            return;
        }
        this.f9228f.x(new MKWebViewHelper.a() { // from class: l.v400
            /* JADX INFO: renamed from: a */
            public final void m23256a(MKWebView mKWebView) {
                this.f21439a.m11220R(mKWebView);
            }
        });
        if (this.f9241s && !this.f9228f.m16804B()) {
            m11210B();
        }
        if (this.f9238p && this.f9227e.getSupportActionBar() != null) {
            this.f9227e.getSupportActionBar().m();
        }
        m11194K();
        m11192G();
        m11191C();
        m11214H();
        this.f9229g.setMKWebLoadListener(mo11236z());
        this.f9220G = System.currentTimeMillis();
        this.f9229g.loadUrl(m11235y());
    }

    /* JADX INFO: renamed from: L */
    public WebResourceResponse m11216L(WebView webView, String str) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public boolean m11217M() {
        return this.f9242t;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m11218N(AuthData authData) {
        boolean zM16804B = this.f9228f.m16804B();
        izb izbVar = this.f9228f;
        if (zM16804B) {
            izbVar.m16805D(authData.accessToken);
        } else {
            izbVar.m16803A(this.f9227e, authData.accessToken, this.f9229g, m11235y());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m11219O(Throwable th) {
        if (this.f9228f.m16804B()) {
            return;
        }
        this.f9228f.m16803A(this.f9227e, "", this.f9229g, m11235y());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11220R(MKWebView mKWebView) {
        if (this.f9243u) {
            mKWebView.getSettings().setUserAgentString(null);
            mKWebView.setDownloadListener(new DownloadListener() { // from class: l.x400
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f22425a.m11196Q(str, str2, str3, str4, j);
                }
            });
        }
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(this.f9240r);
        mKWebView.getSettings().setTextZoom(100);
        if (this.f9217D) {
            mKWebView.getSettings().setLoadWithOverviewMode(true);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m11221S() {
        this.f9228f.m();
    }

    /* JADX INFO: renamed from: T */
    public void m11222T() {
        m11232u();
        this.f9228f.n();
    }

    /* JADX INFO: renamed from: U */
    public void m11223U(Bundle bundle) {
        this.f9235m = this.f9227e.getIntent().getStringExtra("title");
        this.f9237o = this.f9227e.getIntent().getStringExtra("extra_custom_data");
        this.f9236n = this.f9227e.getIntent().getStringExtra("url");
        this.f9248z = this.f9227e.getIntent().getBooleanExtra("needParseUrl", false);
        Uri uri = NullChecker.a(this.f9236n) ? Uri.parse(this.f9236n) : null;
        this.f9238p = alp0.m11512b(this.f9227e.getIntent(), uri, "hideNavigationBar", this.f9248z, false);
        this.f9239q = alp0.m11512b(this.f9227e.getIntent(), uri, "hardwareAccelerated", this.f9248z, false);
        this.f9240r = alp0.m11512b(this.f9227e.getIntent(), uri, "playbackRequiresUserGesture", this.f9248z, true);
        this.f9241s = alp0.m11512b(this.f9227e.getIntent(), uri, "advanceInitJsBridge", this.f9248z, true);
        this.f9242t = alp0.m11512b(this.f9227e.getIntent(), uri, "transparent_status_bar", this.f9248z, false);
        this.f9243u = alp0.m11512b(this.f9227e.getIntent(), uri, "AD_WebView", this.f9248z, false);
        this.f9244v = alp0.m11512b(this.f9227e.getIntent(), uri, "skipLoading", this.f9248z, false);
        this.f9245w = alp0.m11511a(this.f9227e.getIntent(), uri, "webviewColor", this.f9248z, null);
        this.f9246x = alp0.m11511a(this.f9227e.getIntent(), uri, "notchColor", this.f9248z, null);
        this.f9247y = alp0.m11512b(this.f9227e.getIntent(), uri, "hideNotch", this.f9248z, false);
        boolean zM11512b = alp0.m11512b(this.f9227e.getIntent(), uri, "swipeBack", this.f9248z, true);
        this.f9217D = alp0.m11512b(this.f9227e.getIntent(), uri, "autofill", this.f9248z, false);
        this.f9214A = alp0.m11511a(this.f9227e.getIntent(), uri, "notchTextColor", true, "");
        if (zM11512b) {
            return;
        }
        this.f9227e.setSwipeBackEnable(zM11512b);
    }

    /* JADX INFO: renamed from: V */
    public final void m11224V(boolean z, boolean z2) {
        CrashHelper.c(new Exception("recordReloadRecycleWeb,isTryRecycleWeb:" + z + " isTryDeleteWeb:" + z2));
    }

    /* JADX INFO: renamed from: W */
    public void m11225W(String str, HashMap<String, String> map) {
        if (NullChecker.a(this.f9237o)) {
            map.put("tracker", this.f9237o);
        }
        zvf0.D("e_intl_android_web_vue", "p_intl_android_web_vue", new j760[]{vwb.Y("url", str), vwb.Y("params", map)});
    }

    /* JADX INFO: renamed from: X */
    public void m11226X() {
        if (TextUtils.isEmpty(this.f9235m)) {
            return;
        }
        act().setTitle(this.f9235m);
        this.f9224b.setTitle(this.f9235m);
    }

    public void destroy() {
        m11234w();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11228n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m11228n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b500.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f9227e;
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m11227i1(P p) {
        this.f9226d = p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m11231s() {
        return this.f9238p;
    }

    /* JADX INFO: renamed from: u */
    public final void m11232u() {
        FrameLayout frameLayout;
        boolean z;
        try {
            if (this.f9222I.get()) {
                boolean z2 = false;
                this.f9222I.set(false);
                if (this.f9221H.getAndIncrement() >= 3 || (frameLayout = this.f9225c) == null) {
                    return;
                }
                int childCount = frameLayout.getChildCount();
                if (childCount > 0) {
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f9225c.getChildAt(i);
                        View view = this.f9229g;
                        if (view != null && childAt == view) {
                            this.f9225c.removeView(childAt);
                            z = true;
                            if (!this.f9229g.q0()) {
                                this.f9229g.destroy();
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                this.f9229g = null;
                this.f9228f = null;
                this.f9226d.m22743g0();
                m11224V(z2, z);
            }
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m11233v() {
        return this.f9229g.canGoBack() && !this.f9229g.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: w */
    public void m11234w() {
        this.f9228f.m16809y();
        if (NullChecker.a(this.f9229g)) {
            this.f9229g.removeAllViews();
            this.f9225c.removeAllViews();
            this.f9229g.setTag(null);
            this.f9229g.clearHistory();
        }
    }

    /* JADX INFO: renamed from: y */
    public String m11235y() {
        return this.f9236n;
    }

    /* JADX INFO: renamed from: z */
    public MKWebViewHelper.b mo11236z() {
        return new C0746b(this.f9228f);
    }
}
