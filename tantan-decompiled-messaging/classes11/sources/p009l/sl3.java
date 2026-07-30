package p009l;

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
import com.p000p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.b3c0;
import l.d30;
import l.s7m;
import l.tl3;
import l.u2c0;
import l.w9j;
import l.x4c0;
import l.xdl0;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sl3 implements s7m<ol3> {

    /* JADX INFO: renamed from: A */
    public dze0 f20322A;

    /* JADX INFO: renamed from: B */
    public d30 f20323B = null;

    /* JADX INFO: renamed from: C */
    public int f20324C = -1;

    /* JADX INFO: renamed from: a */
    public VLinear f20325a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f20326b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f20327c;

    /* JADX INFO: renamed from: d */
    public TextView f20328d;

    /* JADX INFO: renamed from: e */
    public PullFrameLayout f20329e;

    /* JADX INFO: renamed from: f */
    public WebViewX f20330f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f20331g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f20332h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f20333i;

    /* JADX INFO: renamed from: j */
    public ImageView f20334j;

    /* JADX INFO: renamed from: k */
    public ol3 f20335k;

    /* JADX INFO: renamed from: l */
    public final PutongAct f20336l;

    /* JADX INFO: renamed from: m */
    public String f20337m;

    /* JADX INFO: renamed from: n */
    public String f20338n;

    /* JADX INFO: renamed from: o */
    public long f20339o;

    /* JADX INFO: renamed from: p */
    public boolean f20340p;

    /* JADX INFO: renamed from: q */
    public boolean f20341q;

    /* JADX INFO: renamed from: r */
    public boolean f20342r;

    /* JADX INFO: renamed from: s */
    public boolean f20343s;

    /* JADX INFO: renamed from: t */
    public boolean f20344t;

    /* JADX INFO: renamed from: u */
    public boolean f20345u;

    /* JADX INFO: renamed from: v */
    public boolean f20346v;

    /* JADX INFO: renamed from: w */
    public String f20347w;

    /* JADX INFO: renamed from: x */
    public String f20348x;

    /* JADX INFO: renamed from: y */
    public aoq f20349y;

    /* JADX INFO: renamed from: z */
    public sw3 f20350z;

    public sl3(PutongAct putongAct) {
        this.f20336l = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m22229C(View view) {
        this.f20336l.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m22230E(View view) {
        this.f20336l.onHomePressed();
    }

    /* JADX INFO: renamed from: A */
    public boolean m22235A() {
        return this.f20344t;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m22236B(String str) {
        if (!m22257z() || (!str.contains("kanjianxinli") && !str.contains("wzhxl"))) {
            if (m22257z()) {
                return Boolean.FALSE;
            }
            if (!str.contains("tantan")) {
                return Boolean.FALSE;
            }
            this.f20330f.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Login")) {
            this.f20335k.m19931r0(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Home")) {
            this.f20335k.m19926l0();
            return Boolean.TRUE;
        }
        if (!str.contains("tantanapp.com/kanjianxinli/Purchase")) {
            return Boolean.FALSE;
        }
        this.f20335k.m19930q0(this.f20339o, str);
        return Boolean.TRUE;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22237C0() {
        return this.f20336l;
    }

    /* JADX INFO: renamed from: F */
    public void m22238F(String str) {
        this.f20330f.loadUrl(str);
    }

    /* JADX INFO: renamed from: G */
    public void m22239G() {
        if (TextUtils.isEmpty(this.f20337m)) {
            return;
        }
        act().setTitle(this.f20337m);
        this.f20326b.setTitle(this.f20337m);
    }

    public void destroy() {
        if (NullChecker.a(this.f20349y)) {
            this.f20349y.m11546k();
        }
        m22247m();
    }

    /* JADX INFO: renamed from: e */
    public View m22240e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tl3.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f20336l;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m22243i1(ol3 ol3Var) {
        this.f20335k = ol3Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22240e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m22244j(String str, String str2) {
        if (this.f20349y == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f20349y.m11539d().mo15130b(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public boolean m22245k() {
        return this.f20340p;
    }

    /* JADX INFO: renamed from: l */
    public boolean m22246l() {
        return this.f20330f.canGoBack() && !this.f20330f.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public void m22247m() {
        if (NullChecker.a(this.f20330f)) {
            this.f20330f.removeAllViews();
            this.f20327c.removeView(this.f20330f);
            this.f20330f.setTag(null);
            this.f20330f.clearHistory();
            this.f20330f.destroy();
            this.f20330f = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public aoq m22248n() {
        return this.f20349y;
    }

    /* JADX INFO: renamed from: p */
    public String m22249p() {
        return this.f20338n;
    }

    /* JADX INFO: renamed from: q */
    public w9j<String, Boolean> m22250q() {
        return new w9j() { // from class: l.rl3
            public final Object call(Object obj) {
                return this.f19900a.m22236B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public sw3.InterfaceC1195a m22251s() {
        return new C1192a();
    }

    /* JADX INFO: renamed from: u */
    public void m22252u() {
        this.f20330f.goBack();
    }

    /* JADX INFO: renamed from: v */
    public void m22253v() {
        this.f20337m = this.f20336l.getIntent().getStringExtra("title");
        this.f20339o = this.f20336l.getIntent().getLongExtra("id", 1L);
        this.f20338n = this.f20336l.getIntent().getStringExtra("url");
        this.f20340p = this.f20336l.getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f20341q = this.f20336l.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f20342r = this.f20336l.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f20343s = this.f20336l.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f20344t = this.f20336l.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f20345u = this.f20336l.getIntent().getBooleanExtra("enableWebOfflineCache", false);
        this.f20346v = this.f20336l.getIntent().getBooleanExtra("skipLoading", false);
        this.f20347w = this.f20336l.getIntent().getStringExtra("webviewColor");
        String stringExtra = this.f20336l.getIntent().getStringExtra("webview_load_type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "webview_load_type_tantan_default";
        }
        this.f20348x = stringExtra;
    }

    /* JADX INFO: renamed from: w */
    public void m22254w() {
        boolean zM22257z = m22257z();
        VNavigationBar vNavigationBar = this.f20326b;
        if (zM22257z) {
            vNavigationBar.setLeftIconResource(b3c0.r1);
            this.f20326b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pl3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18778a.m22229C(view);
                }
            });
        } else {
            vNavigationBar.setLeftIconResource(u2c0.n);
            this.f20326b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ql3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19374a.m22230E(view);
                }
            });
        }
        if (m22245k()) {
            this.f20326b.setVisibility(8);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: x */
    public void m22255x(Map<String, String> map) {
        if (!TextUtils.isEmpty(m22249p())) {
            if (this.f20343s && this.f20349y == null) {
                this.f20349y = new aoq(this.f20336l, "", this.f20330f);
            }
            aoq aoqVarM22248n = m22248n();
            if (NullChecker.a(aoqVarM22248n) && !m22257z()) {
                this.f20330f.addJavascriptInterface(aoqVarM22248n, "tantan");
            }
            boolean zM22257z = m22257z();
            WebViewX webViewX = this.f20330f;
            if (zM22257z) {
                webViewX.getSettings().setUserAgentString(null);
                this.f20330f.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
                this.f20330f.getSettings().setMediaPlaybackRequiresUserGesture(this.f20342r);
                this.f20330f.getSettings().setUseWideViewPort(true);
                this.f20330f.getSettings().setLoadWithOverviewMode(true);
                this.f20330f.getSettings().setTextZoom(100);
                this.f20330f.getSettings().setMinimumFontSize(1);
                this.f20330f.getSettings().setMinimumLogicalFontSize(1);
                this.f20330f.setVerticalScrollBarEnabled(false);
                this.f20330f.setHorizontalScrollBarEnabled(false);
                this.f20330f.setOverScrollMode(2);
            } else {
                webViewX.getSettings().setMediaPlaybackRequiresUserGesture(this.f20342r);
                this.f20330f.getSettings().setTextZoom(100);
                this.f20330f.getSettings().setUseWideViewPort(false);
            }
            if (this.f20340p && this.f20336l.getSupportActionBar() != null) {
                this.f20336l.getSupportActionBar().m();
            }
            boolean z = this.f20346v;
            ProgressBar progressBar = this.f20331g;
            if (z) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
            }
            m22256y();
            sw3 sw3Var = new sw3(this.f20336l, m22250q(), this.f20341q);
            this.f20350z = sw3Var;
            sw3Var.setListener(m22251s());
            this.f20322A = new dze0(this.f20336l);
            if (m22257z()) {
                this.f20322A.setADWebViewSet();
            }
            this.f20330f.setWebViewClientX(this.f20350z);
            this.f20330f.setWebChromeClientX(this.f20322A);
            if (m22257z()) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f20330f, true);
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.flush();
            }
            boolean zA = NullChecker.a(map);
            WebViewX webViewX2 = this.f20330f;
            if (zA) {
                webViewX2.loadUrl(m22249p(), map);
            } else {
                webViewX2.loadUrl(m22249p());
            }
        }
        if (m22257z()) {
            this.f20329e.set_webview(this.f20330f);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m22256y() {
        int color = 0;
        if (TextUtils.isEmpty(this.f20347w)) {
            this.f20330f.getSettings().setCacheMode(-1);
            this.f20330f.clearCache(false);
            return;
        }
        if (!this.f20347w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f20347w.startsWith("#");
            String str = this.f20347w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f20330f.getSettings().setCacheMode(-1);
                this.f20330f.clearCache(false);
                return;
            }
        }
        this.f20330f.setBackgroundColor(color);
        this.f20330f.getSettings().setCacheMode(2);
        this.f20330f.clearCache(true);
    }

    /* JADX INFO: renamed from: z */
    public boolean m22257z() {
        return TextUtils.equals(this.f20348x, "webview_load_type_knowme");
    }

    /* JADX INFO: renamed from: l.sl3$a */
    public class C1192a implements sw3.InterfaceC1195a {
        public C1192a() {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            sl3.this.f20331g.setVisibility(8);
            if (sl3.this.m22257z()) {
                xdl0.M(sl3.this.f20328d, true);
            }
            if (TextUtils.isEmpty(sl3.this.f20337m) && NullChecker.a(sl3.this.f20330f) && !TextUtils.isEmpty(sl3.this.f20330f.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && sl3.this.f20332h.getVisibility() != 0) {
                Object tag = sl3.this.f20330f.getTag(x4c0.X);
                sl3 sl3Var = sl3.this;
                if (tag == null) {
                    String title = sl3Var.f20330f.getTitle();
                    sl3.this.f20336l.setTitle(title);
                    sl3.this.f20326b.setTitle(title);
                } else {
                    sl3Var.f20330f.setTag(x4c0.X, null);
                }
            }
            if (NullChecker.a(sl3.this.f20323B)) {
                sl3.this.f20323B.call();
            }
            if (str.contains(CoreModule.c.l1.R)) {
                sl3.this.f20330f.reload();
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            sl3.this.f20332h.setVisibility(0);
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
        }
    }
}
