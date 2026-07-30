package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class sm3 implements iam<om3> {

    /* JADX INFO: renamed from: A */
    public k7f0 f169489A;

    /* JADX INFO: renamed from: B */
    public x20 f169490B = null;

    /* JADX INFO: renamed from: C */
    public int f169491C = -1;

    /* JADX INFO: renamed from: a */
    public VLinear f169492a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f169493b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f169494c;

    /* JADX INFO: renamed from: d */
    public TextView f169495d;

    /* JADX INFO: renamed from: e */
    public PullFrameLayout f169496e;

    /* JADX INFO: renamed from: f */
    public WebViewX f169497f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f169498g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f169499h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f169500i;

    /* JADX INFO: renamed from: j */
    public ImageView f169501j;

    /* JADX INFO: renamed from: k */
    public om3 f169502k;

    /* JADX INFO: renamed from: l */
    public final PutongAct f169503l;

    /* JADX INFO: renamed from: m */
    public String f169504m;

    /* JADX INFO: renamed from: n */
    public String f169505n;

    /* JADX INFO: renamed from: o */
    public long f169506o;

    /* JADX INFO: renamed from: p */
    public boolean f169507p;

    /* JADX INFO: renamed from: q */
    public boolean f169508q;

    /* JADX INFO: renamed from: r */
    public boolean f169509r;

    /* JADX INFO: renamed from: s */
    public boolean f169510s;

    /* JADX INFO: renamed from: t */
    public boolean f169511t;

    /* JADX INFO: renamed from: u */
    public boolean f169512u;

    /* JADX INFO: renamed from: v */
    public boolean f169513v;

    /* JADX INFO: renamed from: w */
    public String f169514w;

    /* JADX INFO: renamed from: x */
    public String f169515x;

    /* JADX INFO: renamed from: y */
    public zpq f169516y;

    /* JADX INFO: renamed from: z */
    public rx3 f169517z;

    public sm3(PutongAct putongAct) {
        this.f169503l = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m186733C(View view) {
        this.f169503l.m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m186734E(View view) {
        this.f169503l.onHomePressed();
    }

    /* JADX INFO: renamed from: A */
    public boolean m186739A() {
        return this.f169511t;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m186740B(String str) {
        if (!m186759z() || (!str.contains("kanjianxinli") && !str.contains("wzhxl"))) {
            if (m186759z()) {
                return Boolean.FALSE;
            }
            if (!str.contains("tantan")) {
                return Boolean.FALSE;
            }
            this.f169497f.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Login")) {
            this.f169502k.m168194r0(str);
            return Boolean.TRUE;
        }
        if (str.contains("tantanapp.com/kanjianxinli/Home")) {
            this.f169502k.m168189l0();
            return Boolean.TRUE;
        }
        if (!str.contains("tantanapp.com/kanjianxinli/Purchase")) {
            return Boolean.FALSE;
        }
        this.f169502k.m168193q0(this.f169506o, str);
        return Boolean.TRUE;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f169503l;
    }

    /* JADX INFO: renamed from: F */
    public void m186741F(String str) {
        this.f169497f.loadUrl(str);
    }

    /* JADX INFO: renamed from: G */
    public void m186742G() {
        if (TextUtils.isEmpty(this.f169504m)) {
            return;
        }
        act().setTitle(this.f169504m);
        this.f169493b.setTitle(this.f169504m);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f169516y)) {
            this.f169516y.m220926k();
        }
        m186749m();
    }

    /* JADX INFO: renamed from: e */
    public View m186743e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tm3.m191721b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f169503l;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(om3 om3Var) {
        this.f169502k = om3Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186743e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m186746j(String str, String str2) {
        if (this.f169516y == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f169516y.m220919d().mo97004b(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public boolean m186747k() {
        return this.f169507p;
    }

    /* JADX INFO: renamed from: l */
    public boolean m186748l() {
        return this.f169497f.canGoBack() && !this.f169497f.getUrl().equals(rx3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public void m186749m() {
        if (NullChecker.m82486a(this.f169497f)) {
            this.f169497f.removeAllViews();
            this.f169494c.removeView(this.f169497f);
            this.f169497f.setTag(null);
            this.f169497f.clearHistory();
            this.f169497f.destroy();
            this.f169497f = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public zpq m186750n() {
        return this.f169516y;
    }

    /* JADX INFO: renamed from: p */
    public String m186751p() {
        return this.f169505n;
    }

    /* JADX INFO: renamed from: q */
    public qcj<String, Boolean> m186752q() {
        return new qcj() { // from class: l.rm3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163824a.m186740B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public rx3.InterfaceC19928a m186753s() {
        return new C20103a();
    }

    /* JADX INFO: renamed from: u */
    public void m186754u() {
        this.f169497f.goBack();
    }

    /* JADX INFO: renamed from: v */
    public void m186755v() {
        this.f169504m = this.f169503l.getIntent().getStringExtra("title");
        this.f169506o = this.f169503l.getIntent().getLongExtra("id", 1L);
        this.f169505n = this.f169503l.getIntent().getStringExtra("url");
        this.f169507p = this.f169503l.getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f169508q = this.f169503l.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f169509r = this.f169503l.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f169510s = this.f169503l.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f169511t = this.f169503l.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f169512u = this.f169503l.getIntent().getBooleanExtra("enableWebOfflineCache", false);
        this.f169513v = this.f169503l.getIntent().getBooleanExtra("skipLoading", false);
        this.f169514w = this.f169503l.getIntent().getStringExtra("webviewColor");
        String stringExtra = this.f169503l.getIntent().getStringExtra("webview_load_type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "webview_load_type_tantan_default";
        }
        this.f169515x = stringExtra;
    }

    /* JADX INFO: renamed from: w */
    public void m186756w() {
        boolean zM186759z = m186759z();
        VNavigationBar vNavigationBar = this.f169493b;
        if (zM186759z) {
            vNavigationBar.setLeftIconResource(gbc0.f103391r1);
            this.f169493b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pm3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153118a.m186733C(view);
                }
            });
        } else {
            vNavigationBar.setLeftIconResource(abc0.f69506n);
            this.f169493b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.qm3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158298a.m186734E(view);
                }
            });
        }
        if (m186747k()) {
            this.f169493b.setVisibility(8);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: x */
    public void m186757x(Map<String, String> map) {
        if (!TextUtils.isEmpty(m186751p())) {
            if (this.f169510s && this.f169516y == null) {
                this.f169516y = new zpq(this.f169503l, "", this.f169497f);
            }
            zpq zpqVarM186750n = m186750n();
            if (NullChecker.m82486a(zpqVarM186750n) && !m186759z()) {
                this.f169497f.addJavascriptInterface(zpqVarM186750n, "tantan");
            }
            boolean zM186759z = m186759z();
            WebViewX webViewX = this.f169497f;
            if (zM186759z) {
                webViewX.getSettings().setUserAgentString(null);
                this.f169497f.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
                this.f169497f.getSettings().setMediaPlaybackRequiresUserGesture(this.f169509r);
                this.f169497f.getSettings().setUseWideViewPort(true);
                this.f169497f.getSettings().setLoadWithOverviewMode(true);
                this.f169497f.getSettings().setTextZoom(100);
                this.f169497f.getSettings().setMinimumFontSize(1);
                this.f169497f.getSettings().setMinimumLogicalFontSize(1);
                this.f169497f.setVerticalScrollBarEnabled(false);
                this.f169497f.setHorizontalScrollBarEnabled(false);
                this.f169497f.setOverScrollMode(2);
            } else {
                webViewX.getSettings().setMediaPlaybackRequiresUserGesture(this.f169509r);
                this.f169497f.getSettings().setTextZoom(100);
                this.f169497f.getSettings().setUseWideViewPort(false);
            }
            if (this.f169507p && this.f169503l.getSupportActionBar() != null) {
                this.f169503l.getSupportActionBar().mo102186m();
            }
            boolean z = this.f169513v;
            ProgressBar progressBar = this.f169498g;
            if (z) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
            }
            m186758y();
            rx3 rx3Var = new rx3(this.f169503l, m186752q(), this.f169508q);
            this.f169517z = rx3Var;
            rx3Var.setListener(m186753s());
            this.f169489A = new k7f0(this.f169503l);
            if (m186759z()) {
                this.f169489A.setADWebViewSet();
            }
            this.f169497f.setWebViewClientX(this.f169517z);
            this.f169497f.setWebChromeClientX(this.f169489A);
            if (m186759z()) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f169497f, true);
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.flush();
            }
            boolean zM82486a = NullChecker.m82486a(map);
            WebViewX webViewX2 = this.f169497f;
            if (zM82486a) {
                webViewX2.loadUrl(m186751p(), map);
            } else {
                webViewX2.loadUrl(m186751p());
            }
        }
        if (m186759z()) {
            this.f169496e.set_webview(this.f169497f);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m186758y() {
        int color = 0;
        if (TextUtils.isEmpty(this.f169514w)) {
            this.f169497f.getSettings().setCacheMode(-1);
            this.f169497f.clearCache(false);
            return;
        }
        if (!this.f169514w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f169514w.startsWith("#");
            String str = this.f169514w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f169497f.getSettings().setCacheMode(-1);
                this.f169497f.clearCache(false);
                return;
            }
        }
        this.f169497f.setBackgroundColor(color);
        this.f169497f.getSettings().setCacheMode(2);
        this.f169497f.clearCache(true);
    }

    /* JADX INFO: renamed from: z */
    public boolean m186759z() {
        return TextUtils.equals(this.f169515x, "webview_load_type_knowme");
    }

    /* JADX INFO: renamed from: l.sm3$a */
    public class C20103a implements rx3.InterfaceC19928a {
        public C20103a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            sm3.this.f169498g.setVisibility(8);
            if (sm3.this.m186759z()) {
                bnl0.m105524M(sm3.this.f169495d, true);
            }
            if (TextUtils.isEmpty(sm3.this.f169504m) && NullChecker.m82486a(sm3.this.f169497f) && !TextUtils.isEmpty(sm3.this.f169497f.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && sm3.this.f169499h.getVisibility() != 0) {
                Object tag = sm3.this.f169497f.getTag(ddc0.f87894X);
                sm3 sm3Var = sm3.this;
                if (tag == null) {
                    String title = sm3Var.f169497f.getTitle();
                    sm3.this.f169503l.setTitle(title);
                    sm3.this.f169493b.setTitle(title);
                } else {
                    sm3Var.f169497f.setTag(ddc0.f87894X, null);
                }
            }
            if (NullChecker.m82486a(sm3.this.f169490B)) {
                sm3.this.f169490B.call();
            }
            if (str.contains(CoreModule.f18264c.f20403l1.f20812R)) {
                sm3.this.f169497f.reload();
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            sm3.this.f169499h.setVisibility(0);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }
    }
}
