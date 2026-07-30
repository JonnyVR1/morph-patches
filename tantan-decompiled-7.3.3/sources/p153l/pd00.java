package p153l;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkProgressView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;
import p153l.jd00;

/* JADX INFO: loaded from: classes10.dex */
public class pd00<P extends jd00> implements iam<P> {

    /* JADX INFO: renamed from: A */
    public String f151640A;

    /* JADX INFO: renamed from: B */
    public k7f0 f151641B;

    /* JADX INFO: renamed from: D */
    public boolean f151643D;

    /* JADX INFO: renamed from: a */
    public VLinear f151649a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f151650b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f151651c;

    /* JADX INFO: renamed from: d */
    public P f151652d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f151653e;

    /* JADX INFO: renamed from: f */
    public w0c f151654f;

    /* JADX INFO: renamed from: g */
    public MKWebView f151655g;

    /* JADX INFO: renamed from: h */
    public MkProgressView f151656h;

    /* JADX INFO: renamed from: i */
    public ProgressBar f151657i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f151658j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f151659k;

    /* JADX INFO: renamed from: l */
    public ImageView f151660l;

    /* JADX INFO: renamed from: m */
    public String f151661m;

    /* JADX INFO: renamed from: n */
    public String f151662n;

    /* JADX INFO: renamed from: o */
    public String f151663o;

    /* JADX INFO: renamed from: p */
    public boolean f151664p;

    /* JADX INFO: renamed from: q */
    public boolean f151665q;

    /* JADX INFO: renamed from: r */
    public boolean f151666r;

    /* JADX INFO: renamed from: s */
    public boolean f151667s;

    /* JADX INFO: renamed from: t */
    public boolean f151668t;

    /* JADX INFO: renamed from: u */
    public boolean f151669u;

    /* JADX INFO: renamed from: v */
    public boolean f151670v;

    /* JADX INFO: renamed from: w */
    public String f151671w;

    /* JADX INFO: renamed from: x */
    public String f151672x;

    /* JADX INFO: renamed from: y */
    public boolean f151673y;

    /* JADX INFO: renamed from: z */
    public boolean f151674z;

    /* JADX INFO: renamed from: C */
    public x20 f151642C = null;

    /* JADX INFO: renamed from: E */
    public boolean f151644E = true;

    /* JADX INFO: renamed from: F */
    public long f151645F = 0;

    /* JADX INFO: renamed from: G */
    public long f151646G = 0;

    /* JADX INFO: renamed from: H */
    public final AtomicInteger f151647H = new AtomicInteger();

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f151648I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.pd00$a */
    public class C19350a implements tm80 {
        public C19350a() {
        }

        @Override // p153l.tm80
        /* JADX INFO: renamed from: a */
        public boolean mo171747a(String str) {
            zxp zxpVar = zxp.INSTANCE;
            pd00 pd00Var = pd00.this;
            return zxpVar.m222061b(pd00Var.f151655g, str, pd00Var.f151653e);
        }

        @Override // p153l.tm80
        /* JADX INFO: renamed from: b */
        public boolean mo171748b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.pd00$b */
    public class C19351b extends dpf0 {
        public C19351b(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            pd00 pd00Var = pd00.this;
            pd00Var.m171737W(pd00Var.f151662n, map);
            if (pd00.this.f151644E) {
                try {
                    MKWebView mKWebView = pd00.this.f151655g;
                    if (mKWebView != null) {
                        mKWebView.getMkWebCaptureHelper().m18215j(pd00.this.f151655g);
                    }
                } catch (Exception unused) {
                }
                pd00.this.f151658j.setVisibility(0);
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            pd00.this.m171737W(str, map);
            System.currentTimeMillis();
            long unused = pd00.this.f151646G;
            if (NullChecker.m82486a(pd00.this.f151655g)) {
                pd00.this.f151655g.setLayerType(0, null);
            }
            pd00.this.f151657i.setVisibility(8);
            if (TextUtils.isEmpty(pd00.this.f151661m) && NullChecker.m82486a(pd00.this.f151655g) && !TextUtils.isEmpty(pd00.this.f151655g.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && pd00.this.f151658j.getVisibility() != 0) {
                Object tag = pd00.this.f151655g.getTag(ycc0.f198423J0);
                pd00 pd00Var = pd00.this;
                if (tag == null) {
                    pd00Var.f151653e.setTitle(pd00.this.f151655g.getTitle());
                    pd00 pd00Var2 = pd00.this;
                    pd00Var2.f151650b.setTitle(pd00Var2.f151655g.getTitle());
                } else {
                    pd00Var.f151655g.setTag(ycc0.f198423J0, null);
                }
            }
            if (NullChecker.m82486a(pd00.this.f151642C)) {
                pd00.this.f151642C.call();
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onStart");
            pd00.this.m171737W(str, map);
            System.currentTimeMillis();
            long unused = pd00.this.f151646G;
            if (NullChecker.m82486a(pd00.this.f151655g)) {
                pd00.this.f151655g.setLayerType(2, null);
            }
            if (pd00.this.f151670v) {
                pd00.this.f151657i.setVisibility(8);
            } else {
                boolean zContains = str.contains("&_offline=1");
                pd00 pd00Var = pd00.this;
                if (zContains) {
                    pd00Var.f151644E = false;
                    pd00.this.f151657i.setVisibility(8);
                } else {
                    pd00Var.f151644E = true;
                    pd00.this.f151657i.setVisibility(0);
                }
            }
            super.mo17980g(webView, str, bitmap);
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: l */
        public void mo18131l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super.mo18131l(webView, renderProcessGoneDetail);
            pd00 pd00Var = pd00.this;
            if (pd00Var.f151655g == webView) {
                pd00Var.f151648I.set(true);
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: m */
        public WebResourceResponse mo18185m(WebView webView, String str) {
            WebResourceResponse webResourceResponseM171728L = pd00.this.m171728L(webView, str);
            return NullChecker.m82486a(webResourceResponseM171728L) ? webResourceResponseM171728L : super.mo18185m(webView, str);
        }
    }

    public pd00(PutongAct putongAct) {
        this.f151653e = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m171703C() {
        if (this.f151673y) {
            this.f151653e.getWindow().addFlags(Integer.MIN_VALUE);
            this.f151653e.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f151653e.getWindow().setStatusBarColor(0);
            this.f151653e.setLightStatusBar(1296);
            this.f151653e.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f151653e.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f151653e.getWindow(), true);
            if (NullChecker.m82486a(this.f151653e.getSupportActionBar())) {
                this.f151653e.getSupportActionBar().mo102168A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m171704G() {
        if (TextUtils.isEmpty(this.f151672x)) {
            return;
        }
        if (this.f151672x.equalsIgnoreCase("transparent")) {
            this.f151653e.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f151672x.startsWith("#");
        String str = this.f151672x;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f151653e.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    private void m171705I() {
        MkProgressView mkProgressView = (MkProgressView) this.f151653e.getLayoutInflater().inflate(jec0.f120435D, (ViewGroup) null);
        this.f151656h = mkProgressView;
        this.f151651c.addView(mkProgressView);
        MkProgressView mkProgressView2 = this.f151656h;
        this.f151657i = mkProgressView2.f55643a;
        this.f151658j = mkProgressView2.f55644b;
        this.f151659k = mkProgressView2.f55645c;
        this.f151660l = mkProgressView2.f55646d;
    }

    /* JADX INFO: renamed from: K */
    private void m171706K() {
        int color = 0;
        if (TextUtils.isEmpty(this.f151671w)) {
            this.f151655g.getSettings().setCacheMode(-1);
            this.f151655g.clearCache(false);
            return;
        }
        if (!this.f151671w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f151671w.startsWith("#");
            String str = this.f151671w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f151655g.getSettings().setCacheMode(-1);
                this.f151655g.clearCache(false);
                return;
            }
        }
        this.f151655g.setBackgroundColor(color);
        this.f151655g.getSettings().setCacheMode(2);
        this.f151655g.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m171707P(View view) {
        this.f151653e.onHomePressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m171708Q(String str, String str2, String str3, String str4, long j) {
        m171721x(str);
    }

    /* JADX INFO: renamed from: u */
    private void m171720u() {
        FrameLayout frameLayout;
        boolean z;
        try {
            if (this.f151648I.get()) {
                boolean z2 = false;
                this.f151648I.set(false);
                if (this.f151647H.getAndIncrement() >= 3 || (frameLayout = this.f151651c) == null) {
                    return;
                }
                int childCount = frameLayout.getChildCount();
                if (childCount > 0) {
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f151651c.getChildAt(i);
                        MKWebView mKWebView = this.f151655g;
                        if (mKWebView != null && childAt == mKWebView) {
                            this.f151651c.removeView(childAt);
                            z = true;
                            if (!this.f151655g.isDestroyed()) {
                                this.f151655g.destroy();
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                this.f151655g = null;
                this.f151654f = null;
                this.f151652d.m144401g0();
                m171736V(z2, z);
            }
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m171721x(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f151653e.startActivity(intent);
    }

    /* JADX INFO: renamed from: A */
    public void m171722A() {
        this.f151655g.goBack();
    }

    /* JADX INFO: renamed from: B */
    public void m171723B() {
        rnl rnlVarM182265r = rnl.m182265r(m171745y());
        if (rnlVarM182265r != null && TextUtils.equals("1", rnlVarM182265r.m182271A("useToken")) && ntp0.m164746d(m171745y())) {
            act().duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.nd00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141420a.m171730N((AuthData) obj);
                }
            }, new y20() { // from class: l.od00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146755a.m171731O((Throwable) obj);
                }
            }));
        } else {
            this.f151654f.m204137M(this.f151653e, "", this.f151655g, m171745y());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151653e;
    }

    /* JADX INFO: renamed from: E */
    public void mo171724E() {
        this.f151645F = System.currentTimeMillis();
        this.f151654f = new w0c();
        if (yfi.m215602r() > 0) {
            mjw mjwVar = mjw.INSTANCE;
            PutongAct putongAct = this.f151653e;
            MKWebView mKWebViewM158641s = mjwVar.m158641s(putongAct, this.f151662n, putongAct.getIntent());
            this.f151655g = mKWebViewM158641s;
            if (mKWebViewM158641s == null) {
                PutongAct putongAct2 = this.f151653e;
                this.f151655g = new MKWebView(putongAct2, brw.m106162a(putongAct2.getIntent(), this.f151662n));
            } else if (!TextUtils.isEmpty(this.f151662n) && !TextUtils.isEmpty(this.f151671w) && this.f151671w.equalsIgnoreCase("transparent")) {
                this.f151655g.setBackgroundColor(0);
            }
        } else {
            PutongAct putongAct3 = this.f151653e;
            this.f151655g = new MKWebView(putongAct3, brw.m106162a(putongAct3.getIntent(), this.f151662n));
        }
        if (this.f151655g.getParent() == null) {
            this.f151651c.addView(this.f151655g);
            m171705I();
        }
        this.f151655g.setMKPreLoadingUrlProcessor(new C19350a());
        this.f151654f.m17975z(this.f151653e, this.f151655g);
        this.f151655g.setWebUserAgent(sjw.m186320i());
        this.f151655g.getSettings().setMixedContentMode(0);
        this.f151655g.setLayerType(2, null);
    }

    /* JADX INFO: renamed from: F */
    public void mo171725F() {
        this.f151650b.setLeftIconResource(abc0.f69506n);
        this.f151650b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ld00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131394a.m171707P(view);
            }
        });
        if (m171742s()) {
            this.f151650b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m171726H() {
        if (TextUtils.isEmpty(this.f151640A)) {
            return;
        }
        ktp0.m151392c(this.f151653e, this.f151640A.equals("black"));
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: J */
    public void mo171727J() {
        if (TextUtils.isEmpty(m171745y())) {
            return;
        }
        this.f151654f.m17959J(new MKWebViewHelper.InterfaceC3520a() { // from class: l.kd00
            @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.InterfaceC3520a
            /* JADX INFO: renamed from: a */
            public final void mo17976a(MKWebView mKWebView) {
                this.f125123a.m171732R(mKWebView);
            }
        });
        if (this.f151667s && !this.f151654f.m204138N()) {
            m171723B();
        }
        if (this.f151664p && this.f151653e.getSupportActionBar() != null) {
            this.f151653e.getSupportActionBar().mo102186m();
        }
        m171706K();
        m171704G();
        m171703C();
        m171726H();
        this.f151655g.setMKWebLoadListener(mo171746z());
        this.f151646G = System.currentTimeMillis();
        this.f151655g.loadUrl(m171745y());
    }

    /* JADX INFO: renamed from: L */
    public WebResourceResponse m171728L(WebView webView, String str) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public boolean m171729M() {
        return this.f151668t;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m171730N(AuthData authData) {
        boolean zM204138N = this.f151654f.m204138N();
        w0c w0cVar = this.f151654f;
        if (zM204138N) {
            w0cVar.m204139P(authData.accessToken);
        } else {
            w0cVar.m204137M(this.f151653e, authData.accessToken, this.f151655g, m171745y());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m171731O(Throwable th) {
        if (this.f151654f.m204138N()) {
            return;
        }
        this.f151654f.m204137M(this.f151653e, "", this.f151655g, m171745y());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m171732R(MKWebView mKWebView) {
        if (this.f151669u) {
            mKWebView.getSettings().setUserAgentString(null);
            mKWebView.setDownloadListener(new DownloadListener() { // from class: l.md00
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f135856a.m171708Q(str, str2, str3, str4, j);
                }
            });
        }
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(this.f151666r);
        mKWebView.getSettings().setTextZoom(100);
        if (this.f151643D) {
            mKWebView.getSettings().setLoadWithOverviewMode(true);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m171733S() {
        this.f151654f.mo17973u();
    }

    /* JADX INFO: renamed from: T */
    public void m171734T() {
        m171720u();
        this.f151654f.mo17974v();
    }

    /* JADX INFO: renamed from: U */
    public void m171735U(Bundle bundle) {
        this.f151661m = this.f151653e.getIntent().getStringExtra("title");
        this.f151663o = this.f151653e.getIntent().getStringExtra("extra_custom_data");
        this.f151662n = lhl.INSTANCE.m154223p(this.f151653e.getIntent().getStringExtra("url"));
        this.f151674z = this.f151653e.getIntent().getBooleanExtra("needParseUrl", false);
        Uri uri = NullChecker.m82486a(this.f151662n) ? Uri.parse(this.f151662n) : null;
        this.f151664p = eup0.m122678b(this.f151653e.getIntent(), uri, "hideNavigationBar", this.f151674z, false);
        this.f151665q = eup0.m122678b(this.f151653e.getIntent(), uri, "hardwareAccelerated", this.f151674z, false);
        this.f151666r = eup0.m122678b(this.f151653e.getIntent(), uri, "playbackRequiresUserGesture", this.f151674z, true);
        this.f151667s = eup0.m122678b(this.f151653e.getIntent(), uri, "advanceInitJsBridge", this.f151674z, true);
        this.f151668t = eup0.m122678b(this.f151653e.getIntent(), uri, "transparent_status_bar", this.f151674z, false);
        this.f151669u = eup0.m122678b(this.f151653e.getIntent(), uri, "AD_WebView", this.f151674z, false);
        this.f151670v = eup0.m122678b(this.f151653e.getIntent(), uri, "skipLoading", this.f151674z, false);
        this.f151671w = eup0.m122677a(this.f151653e.getIntent(), uri, "webviewColor", this.f151674z, null);
        this.f151672x = eup0.m122677a(this.f151653e.getIntent(), uri, "notchColor", this.f151674z, null);
        this.f151673y = eup0.m122678b(this.f151653e.getIntent(), uri, "hideNotch", this.f151674z, false);
        boolean zM122678b = eup0.m122678b(this.f151653e.getIntent(), uri, "swipeBack", this.f151674z, true);
        this.f151643D = eup0.m122678b(this.f151653e.getIntent(), uri, "autofill", this.f151674z, false);
        this.f151640A = eup0.m122677a(this.f151653e.getIntent(), uri, "notchTextColor", true, "");
        if (zM122678b) {
            return;
        }
        this.f151653e.setSwipeBackEnable(zM122678b);
    }

    /* JADX INFO: renamed from: V */
    public final void m171736V(boolean z, boolean z2) {
        CrashHelper.m82479c(new Exception("recordReloadRecycleWeb,isTryRecycleWeb:" + z + " isTryDeleteWeb:" + z2));
    }

    /* JADX INFO: renamed from: W */
    public void m171737W(String str, HashMap<String, String> map) {
        if (NullChecker.m82486a(this.f151663o)) {
            map.put("tracker", this.f151663o);
        }
        i4g0.m138495D("e_intl_android_web_vue", "p_intl_android_web_vue", jyb.m147494Y("url", str), jyb.m147494Y(CommandMessage.PARAMS, map));
    }

    /* JADX INFO: renamed from: X */
    public void m171738X() {
        if (TextUtils.isEmpty(this.f151661m)) {
            return;
        }
        act().setTitle(this.f151661m);
        this.f151650b.setTitle(this.f151661m);
    }

    @Override // p153l.iam
    public void destroy() {
        m171744w();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m171739n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m171739n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qd00.m176126b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f151653e;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f151652d = p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m171742s() {
        return this.f151664p;
    }

    /* JADX INFO: renamed from: v */
    public boolean m171743v() {
        return this.f151655g.canGoBack() && !this.f151655g.getUrl().equals(rx3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: w */
    public void m171744w() {
        this.f151654f.m204135K();
        if (NullChecker.m82486a(this.f151655g)) {
            this.f151655g.removeAllViews();
            this.f151651c.removeAllViews();
            this.f151655g.setTag(null);
            this.f151655g.clearHistory();
        }
    }

    /* JADX INFO: renamed from: y */
    public String m171745y() {
        return this.f151662n;
    }

    /* JADX INFO: renamed from: z */
    public dpf0 mo171746z() {
        return new C19351b(this.f151654f);
    }
}
