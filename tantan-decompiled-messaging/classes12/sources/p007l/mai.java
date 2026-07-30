package p007l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.AuthData;
import com.p000p1.mobile.putong.feed.newui.webview.FeedWebViewAct;
import com.p000p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.d30;
import l.dze0;
import l.jkp0;
import l.s4c0;
import l.s7m;
import l.sw3;
import l.u2c0;
import l.w9j;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mai implements s7m<iai> {

    /* JADX INFO: renamed from: a */
    public VLinear f10375a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f10376b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f10377c;

    /* JADX INFO: renamed from: d */
    public WebViewX f10378d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f10379e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f10380f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f10381g;

    /* JADX INFO: renamed from: h */
    public ImageView f10382h;

    /* JADX INFO: renamed from: i */
    public String f10383i;

    /* JADX INFO: renamed from: j */
    public String f10384j;

    /* JADX INFO: renamed from: k */
    public String f10385k;

    /* JADX INFO: renamed from: l */
    public String f10386l;

    /* JADX INFO: renamed from: m */
    public String f10387m;

    /* JADX INFO: renamed from: n */
    public boolean f10388n;

    /* JADX INFO: renamed from: o */
    public boolean f10389o;

    /* JADX INFO: renamed from: p */
    public boolean f10390p;

    /* JADX INFO: renamed from: q */
    public boolean f10391q;

    /* JADX INFO: renamed from: r */
    public boolean f10392r;

    /* JADX INFO: renamed from: s */
    public boolean f10393s;

    /* JADX INFO: renamed from: t */
    public aoq f10394t;

    /* JADX INFO: renamed from: u */
    public sw3 f10395u;

    /* JADX INFO: renamed from: v */
    public dze0 f10396v;

    /* JADX INFO: renamed from: w */
    public d30 f10397w = null;

    /* JADX INFO: renamed from: x */
    public final PutongAct f10398x;

    /* JADX INFO: renamed from: y */
    public FeedWebViewFrag f10399y;

    /* JADX INFO: renamed from: z */
    public iai f10400z;

    public mai(PutongAct putongAct, FeedWebViewFrag feedWebViewFrag) {
        this.f10399y = feedWebViewFrag;
        this.f10398x = putongAct;
    }

    /* JADX INFO: renamed from: A */
    private void m11873A() {
        if (TextUtils.isEmpty(this.f10386l) || this.f10386l.equalsIgnoreCase("transparent")) {
            return;
        }
        boolean zStartsWith = this.f10386l.startsWith("#");
        String str = this.f10386l;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f10375a.setBackgroundColor(color);
            this.f10378d.setBackgroundColor(color);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m11874E(View view) {
        this.f10398x.onHomePressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m11880B(String str) {
        HashMap map = new HashMap();
        if (jkp0.d(str)) {
            map.put("H5-Authorization", this.f10383i);
        } else {
            jkp0.f("Load override url not in token whitelist: " + str + "\norigin: " + this.f10385k);
        }
        this.f10378d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m11881C() {
        if (this.f10378d == null) {
            return;
        }
        if (!jkp0.d(this.f10385k)) {
            jkp0.f("Load javascript:doWhenGetToken not in token whitelist: " + this.f10385k);
        } else {
            this.f10378d.loadUrl("javascript:doWhenGetToken('" + this.f10383i + "')");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11882C0() {
        return this.f10398x;
    }

    /* JADX INFO: renamed from: F */
    public final void m11883F(Map<String, String> map) {
        if (TextUtils.isEmpty(m11898q())) {
            return;
        }
        if (this.f10390p && this.f10394t == null) {
            this.f10394t = new aoq(this.f10398x, "", this.f10378d);
        }
        aoq aoqVarM11897p = m11897p();
        if (NullChecker.a(aoqVarM11897p)) {
            this.f10378d.addJavascriptInterface(aoqVarM11897p, "tantan");
        }
        sw3 sw3Var = new sw3(this.f10398x, m11899s(), this.f10389o);
        this.f10395u = sw3Var;
        sw3Var.setListener(m11900u());
        this.f10396v = new dze0(this.f10398x);
        this.f10378d.setWebViewClientX(this.f10395u);
        this.f10378d.setWebChromeClientX(this.f10396v);
        boolean zA = NullChecker.a(map);
        WebViewX webViewX = this.f10378d;
        if (zA) {
            webViewX.loadUrl(m11898q(), map);
        } else {
            webViewX.loadUrl(m11898q());
        }
        this.f10378d.getSettings().setLoadWithOverviewMode(true);
        this.f10378d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.f10378d.getSettings().setMediaPlaybackRequiresUserGesture(this.f10392r);
        this.f10378d.getSettings().setBuiltInZoomControls(false);
        this.f10378d.getSettings().setSupportZoom(false);
        this.f10378d.setHorizontalScrollBarEnabled(false);
        this.f10378d.setFadingEdgeLength(0);
        if (this.f10388n) {
            PutongAct putongAct = this.f10398x;
            if ((putongAct instanceof FeedWebViewAct) && putongAct.getSupportActionBar() != null) {
                this.f10398x.getSupportActionBar().m();
            }
        }
        int i = this.f10398x.getResources().getDisplayMetrics().densityDpi;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        if (i == 120) {
            zoomDensity = WebSettings.ZoomDensity.CLOSE;
        } else if (i != 160 && i == 240) {
            zoomDensity = WebSettings.ZoomDensity.FAR;
        }
        this.f10378d.getSettings().setDefaultZoom(zoomDensity);
    }

    /* JADX INFO: renamed from: G */
    public void m11884G(Bundle bundle) {
        if (NullChecker.a(bundle)) {
            this.f10384j = bundle.getString("title");
            this.f10385k = bundle.getString("url");
            this.f10386l = bundle.getString("webviewColor", "#ffffff");
            this.f10387m = bundle.getString("notchColor", "#ffffff");
            this.f10388n = bundle.getBoolean("hideNavigationBar", false);
            this.f10389o = bundle.getBoolean("hardwareAccelerated", false);
            this.f10390p = bundle.getBoolean("advanceInitJsBridge", true);
            this.f10391q = bundle.getBoolean("transparent_status_bar", false);
            this.f10393s = bundle.getBoolean("useActConfig", false);
            this.f10392r = bundle.getBoolean("playbackRequiresUserGesture", false);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m11885H(Throwable th) {
        this.f10380f.setVisibility(0);
        this.f10379e.setVisibility(8);
    }

    /* JADX INFO: renamed from: I */
    public void m11886I(AuthData authData) {
        this.f10383i = authData.accessToken;
        this.f10394t = m11895m(act(), this.f10383i, this.f10378d);
        HashMap map = new HashMap();
        if (jkp0.d(this.f10385k)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            jkp0.f("Load url not in token whitelist: " + this.f10385k);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        m11883F(map);
    }

    /* JADX INFO: renamed from: J */
    public void m11887J() {
        if (TextUtils.isEmpty(this.f10384j)) {
            return;
        }
        act().setTitle(this.f10384j);
        this.f10376b.setTitle(this.f10384j);
    }

    /* JADX INFO: renamed from: K */
    public void m11888K(String str) {
        aoq aoqVar = this.f10394t;
        if (aoqVar != null) {
            aoqVar.d().b("resume", new String[]{str});
        }
    }

    public void destroy() {
        if (NullChecker.a(this.f10394t)) {
            this.f10394t.k();
        }
        m11896n();
    }

    /* JADX INFO: renamed from: f */
    public View m11889f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nai.m12134b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f10398x;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11889f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m11891i1(iai iaiVar) {
        this.f10400z = iaiVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m11893k() {
        return this.f10388n;
    }

    /* JADX INFO: renamed from: l */
    public boolean m11894l() {
        return this.f10378d.canGoBack() && !this.f10378d.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public aoq m11895m(PutongAct putongAct, String str, WebViewX webViewX) {
        return new aoq(putongAct, this.f10383i, this.f10378d);
    }

    /* JADX INFO: renamed from: n */
    public void m11896n() {
        if (NullChecker.a(this.f10378d)) {
            this.f10378d.removeAllViews();
            this.f10377c.removeView(this.f10378d);
            this.f10378d.setTag(null);
            this.f10378d.clearHistory();
            this.f10378d.destroy();
            this.f10378d = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public aoq m11897p() {
        return this.f10394t;
    }

    /* JADX INFO: renamed from: q */
    public String m11898q() {
        return this.f10385k;
    }

    /* JADX INFO: renamed from: s */
    public w9j<String, Boolean> m11899s() {
        return new w9j() { // from class: l.lai
            public final Object call(Object obj) {
                return this.f9985a.m11880B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: u */
    public sw3.a m11900u() {
        return new C2426a();
    }

    /* JADX INFO: renamed from: v */
    public void m11901v() {
        this.f10378d.goBack();
    }

    /* JADX INFO: renamed from: w */
    public void m11902w() {
        this.f10397w = new d30() { // from class: l.kai
            public final void call() {
                this.f9660a.m11881C();
            }
        };
    }

    /* JADX INFO: renamed from: x */
    public void m11903x() {
        this.f10376b.setLeftIconResource(u2c0.n);
        this.f10376b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.jai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9296a.m11874E(view);
            }
        });
        if (m11893k()) {
            this.f10376b.setVisibility(8);
        }
        this.f10376b.B();
    }

    /* JADX INFO: renamed from: y */
    public final void m11904y() {
        if (TextUtils.isEmpty(this.f10387m)) {
            return;
        }
        if (this.f10387m.equalsIgnoreCase("transparent")) {
            this.f10398x.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f10387m.startsWith("#");
        String str = this.f10387m;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f10398x.getWindow().addFlags(Integer.MIN_VALUE);
            this.f10398x.getWindow().clearFlags(67108864);
            this.f10398x.getWindow().setStatusBarColor(0);
            PutongAct.setLightStatusBar(this.f10398x.getWindow(), false, 0);
            this.f10398x.getWindow().getDecorView().setBackgroundColor(color);
            this.f10398x.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f10398x.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f10398x.getWindow(), true);
            if (NullChecker.a(this.f10398x.getSupportActionBar())) {
                this.f10398x.getSupportActionBar().A(0.0f);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: z */
    public void m11905z(Map<String, String> map) {
        if (m11898q() == null || !m11898q().contains("?speed=true")) {
            this.f10378d.setLayerType(1, null);
        }
        this.f10400z.m10853h0();
        m11873A();
        m11904y();
    }

    /* JADX INFO: renamed from: l.mai$a */
    public class C2426a implements sw3.a {
        public C2426a() {
        }

        /* JADX INFO: renamed from: a */
        public void m11906a(String str) {
            mai.this.f10379e.setVisibility(8);
            if (TextUtils.isEmpty(mai.this.f10384j) && NullChecker.a(mai.this.f10378d) && !TextUtils.isEmpty(mai.this.f10378d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && mai.this.f10380f.getVisibility() != 0 && (mai.this.f10398x instanceof FeedWebViewAct)) {
                Object tag = mai.this.f10378d.getTag(s4c0.J0);
                mai maiVar = mai.this;
                if (tag == null) {
                    maiVar.f10398x.setTitle(mai.this.f10378d.getTitle());
                    mai maiVar2 = mai.this;
                    maiVar2.f10376b.setTitle(maiVar2.f10378d.getTitle());
                } else {
                    maiVar.f10378d.setTag(s4c0.J0, null);
                }
            }
            if (NullChecker.a(mai.this.f10397w)) {
                mai.this.f10397w.call();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11908c(int i, String str, String str2) {
            mai.this.f10380f.setVisibility(0);
        }

        /* JADX INFO: renamed from: b */
        public void m11907b(String str) {
        }
    }
}
