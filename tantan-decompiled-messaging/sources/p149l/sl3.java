package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class sl3 implements s7m<ol3> {

    /* JADX INFO: renamed from: A */
    public dze0 f165103A;

    /* JADX INFO: renamed from: B */
    public d30 f165104B = null;

    /* JADX INFO: renamed from: C */
    public int f165105C = -1;

    /* JADX INFO: renamed from: a */
    public VLinear f165106a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f165107b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f165108c;

    /* JADX INFO: renamed from: d */
    public TextView f165109d;

    /* JADX INFO: renamed from: e */
    public PullFrameLayout f165110e;

    /* JADX INFO: renamed from: f */
    public WebViewX f165111f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f165112g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f165113h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f165114i;

    /* JADX INFO: renamed from: j */
    public ImageView f165115j;

    /* JADX INFO: renamed from: k */
    public ol3 f165116k;

    /* JADX INFO: renamed from: l */
    public final PutongAct f165117l;

    /* JADX INFO: renamed from: m */
    public String f165118m;

    /* JADX INFO: renamed from: n */
    public String f165119n;

    /* JADX INFO: renamed from: o */
    public long f165120o;

    /* JADX INFO: renamed from: p */
    public boolean f165121p;

    /* JADX INFO: renamed from: q */
    public boolean f165122q;

    /* JADX INFO: renamed from: r */
    public boolean f165123r;

    /* JADX INFO: renamed from: s */
    public boolean f165124s;

    /* JADX INFO: renamed from: t */
    public boolean f165125t;

    /* JADX INFO: renamed from: u */
    public boolean f165126u;

    /* JADX INFO: renamed from: v */
    public boolean f165127v;

    /* JADX INFO: renamed from: w */
    public String f165128w;

    /* JADX INFO: renamed from: x */
    public String f165129x;

    /* JADX INFO: renamed from: y */
    public aoq f165130y;

    /* JADX INFO: renamed from: z */
    public sw3 f165131z;

    public sl3(PutongAct putongAct) {
        this.f165117l = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m184729C(View view) {
        this.f165117l.m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m184730E(View view) {
        this.f165117l.onHomePressed();
    }

    /* JADX INFO: renamed from: A */
    public boolean m184735A() {
        return this.f165125t;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m184736B(String str) {
        if (!m184755z() || (!str.contains("kanjianxinli") && !str.contains("wzhxl"))) {
            if (m184755z()) {
                return Boolean.FALSE;
            }
            if (!str.contains("tantan")) {
                return Boolean.FALSE;
            }
            this.f165111f.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Login")) {
            this.f165116k.m164923r0(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Home")) {
            this.f165116k.m164918l0();
            return Boolean.TRUE;
        }
        if (!str.contains("tantanapp.com/kanjianxinli/Purchase")) {
            return Boolean.FALSE;
        }
        this.f165116k.m164922q0(this.f165120o, str);
        return Boolean.TRUE;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165117l;
    }

    /* JADX INFO: renamed from: F */
    public void m184737F(String str) {
        this.f165111f.loadUrl(str);
    }

    /* JADX INFO: renamed from: G */
    public void m184738G() {
        if (TextUtils.isEmpty(this.f165118m)) {
            return;
        }
        act().setTitle(this.f165118m);
        this.f165107b.setTitle(this.f165118m);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f165130y)) {
            this.f165130y.m97931k();
        }
        m184745m();
    }

    /* JADX INFO: renamed from: e */
    public View m184739e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tl3.m189615b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f165117l;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ol3 ol3Var) {
        this.f165116k = ol3Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m184739e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m184742j(String str, String str2) {
        if (this.f165130y == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f165130y.m97924d().mo127285b(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public boolean m184743k() {
        return this.f165121p;
    }

    /* JADX INFO: renamed from: l */
    public boolean m184744l() {
        return this.f165111f.canGoBack() && !this.f165111f.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public void m184745m() {
        if (NullChecker.m81303a(this.f165111f)) {
            this.f165111f.removeAllViews();
            this.f165108c.removeView(this.f165111f);
            this.f165111f.setTag(null);
            this.f165111f.clearHistory();
            this.f165111f.destroy();
            this.f165111f = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public aoq m184746n() {
        return this.f165130y;
    }

    /* JADX INFO: renamed from: p */
    public String m184747p() {
        return this.f165119n;
    }

    /* JADX INFO: renamed from: q */
    public w9j<String, Boolean> m184748q() {
        return new w9j() { // from class: l.rl3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159923a.m184736B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public sw3.InterfaceC20043a m184749s() {
        return new C19982a();
    }

    /* JADX INFO: renamed from: u */
    public void m184750u() {
        this.f165111f.goBack();
    }

    /* JADX INFO: renamed from: v */
    public void m184751v() {
        this.f165118m = this.f165117l.getIntent().getStringExtra("title");
        this.f165120o = this.f165117l.getIntent().getLongExtra("id", 1L);
        this.f165119n = this.f165117l.getIntent().getStringExtra("url");
        this.f165121p = this.f165117l.getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f165122q = this.f165117l.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f165123r = this.f165117l.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f165124s = this.f165117l.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f165125t = this.f165117l.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f165126u = this.f165117l.getIntent().getBooleanExtra("enableWebOfflineCache", false);
        this.f165127v = this.f165117l.getIntent().getBooleanExtra("skipLoading", false);
        this.f165128w = this.f165117l.getIntent().getStringExtra("webviewColor");
        String stringExtra = this.f165117l.getIntent().getStringExtra("webview_load_type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "webview_load_type_tantan_default";
        }
        this.f165129x = stringExtra;
    }

    /* JADX INFO: renamed from: w */
    public void m184752w() {
        boolean zM184755z = m184755z();
        VNavigationBar vNavigationBar = this.f165107b;
        if (zM184755z) {
            vNavigationBar.setLeftIconResource(b3c0.f73140r1);
            this.f165107b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pl3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150072a.m184729C(view);
                }
            });
        } else {
            vNavigationBar.setLeftIconResource(u2c0.f173386n);
            this.f165107b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ql3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155189a.m184730E(view);
                }
            });
        }
        if (m184743k()) {
            this.f165107b.setVisibility(8);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: x */
    public void m184753x(Map<String, String> map) {
        if (!TextUtils.isEmpty(m184747p())) {
            if (this.f165124s && this.f165130y == null) {
                this.f165130y = new aoq(this.f165117l, "", this.f165111f);
            }
            aoq aoqVarM184746n = m184746n();
            if (NullChecker.m81303a(aoqVarM184746n) && !m184755z()) {
                this.f165111f.addJavascriptInterface(aoqVarM184746n, "tantan");
            }
            boolean zM184755z = m184755z();
            WebViewX webViewX = this.f165111f;
            if (zM184755z) {
                webViewX.getSettings().setUserAgentString(null);
                this.f165111f.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
                this.f165111f.getSettings().setMediaPlaybackRequiresUserGesture(this.f165123r);
                this.f165111f.getSettings().setUseWideViewPort(true);
                this.f165111f.getSettings().setLoadWithOverviewMode(true);
                this.f165111f.getSettings().setTextZoom(100);
                this.f165111f.getSettings().setMinimumFontSize(1);
                this.f165111f.getSettings().setMinimumLogicalFontSize(1);
                this.f165111f.setVerticalScrollBarEnabled(false);
                this.f165111f.setHorizontalScrollBarEnabled(false);
                this.f165111f.setOverScrollMode(2);
            } else {
                webViewX.getSettings().setMediaPlaybackRequiresUserGesture(this.f165123r);
                this.f165111f.getSettings().setTextZoom(100);
                this.f165111f.getSettings().setUseWideViewPort(false);
            }
            if (this.f165121p && this.f165117l.getSupportActionBar() != null) {
                this.f165117l.getSupportActionBar().mo134126m();
            }
            boolean z = this.f165127v;
            ProgressBar progressBar = this.f165112g;
            if (z) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
            }
            m184754y();
            sw3 sw3Var = new sw3(this.f165117l, m184748q(), this.f165122q);
            this.f165131z = sw3Var;
            sw3Var.setListener(m184749s());
            this.f165103A = new dze0(this.f165117l);
            if (m184755z()) {
                this.f165103A.setADWebViewSet();
            }
            this.f165111f.setWebViewClientX(this.f165131z);
            this.f165111f.setWebChromeClientX(this.f165103A);
            if (m184755z()) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f165111f, true);
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.flush();
            }
            boolean zM81303a = NullChecker.m81303a(map);
            WebViewX webViewX2 = this.f165111f;
            if (zM81303a) {
                webViewX2.loadUrl(m184747p(), map);
            } else {
                webViewX2.loadUrl(m184747p());
            }
        }
        if (m184755z()) {
            this.f165110e.set_webview(this.f165111f);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m184754y() {
        int color = 0;
        if (TextUtils.isEmpty(this.f165128w)) {
            this.f165111f.getSettings().setCacheMode(-1);
            this.f165111f.clearCache(false);
            return;
        }
        if (!this.f165128w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f165128w.startsWith("#");
            String str = this.f165128w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f165111f.getSettings().setCacheMode(-1);
                this.f165111f.clearCache(false);
                return;
            }
        }
        this.f165111f.setBackgroundColor(color);
        this.f165111f.getSettings().setCacheMode(2);
        this.f165111f.clearCache(true);
    }

    /* JADX INFO: renamed from: z */
    public boolean m184755z() {
        return TextUtils.equals(this.f165129x, "webview_load_type_knowme");
    }

    /* JADX INFO: renamed from: l.sl3$a */
    public class C19982a implements sw3.InterfaceC20043a {
        public C19982a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            sl3.this.f165112g.setVisibility(8);
            if (sl3.this.m184755z()) {
                xdl0.m208344M(sl3.this.f165109d, true);
            }
            if (TextUtils.isEmpty(sl3.this.f165118m) && NullChecker.m81303a(sl3.this.f165111f) && !TextUtils.isEmpty(sl3.this.f165111f.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && sl3.this.f165113h.getVisibility() != 0) {
                Object tag = sl3.this.f165111f.getTag(x4c0.f190989X);
                sl3 sl3Var = sl3.this;
                if (tag == null) {
                    String title = sl3Var.f165111f.getTitle();
                    sl3.this.f165117l.setTitle(title);
                    sl3.this.f165107b.setTitle(title);
                } else {
                    sl3Var.f165111f.setTag(x4c0.f190989X, null);
                }
            }
            if (NullChecker.m81303a(sl3.this.f165104B)) {
                sl3.this.f165104B.call();
            }
            if (str.contains(CoreModule.f17545c.f19661l1.f20070R)) {
                sl3.this.f165111f.reload();
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            sl3.this.f165113h.setVisibility(0);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }
    }
}
