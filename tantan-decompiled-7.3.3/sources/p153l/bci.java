package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.feed.newui.webview.FeedWebViewAct;
import com.p051p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.Map;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class bci implements iam<xbi> {

    /* JADX INFO: renamed from: a */
    public VLinear f76150a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f76151b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f76152c;

    /* JADX INFO: renamed from: d */
    public WebViewX f76153d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f76154e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f76155f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f76156g;

    /* JADX INFO: renamed from: h */
    public ImageView f76157h;

    /* JADX INFO: renamed from: i */
    public String f76158i;

    /* JADX INFO: renamed from: j */
    public String f76159j;

    /* JADX INFO: renamed from: k */
    public String f76160k;

    /* JADX INFO: renamed from: l */
    public String f76161l;

    /* JADX INFO: renamed from: m */
    public String f76162m;

    /* JADX INFO: renamed from: n */
    public boolean f76163n;

    /* JADX INFO: renamed from: o */
    public boolean f76164o;

    /* JADX INFO: renamed from: p */
    public boolean f76165p;

    /* JADX INFO: renamed from: q */
    public boolean f76166q;

    /* JADX INFO: renamed from: r */
    public boolean f76167r;

    /* JADX INFO: renamed from: s */
    public boolean f76168s;

    /* JADX INFO: renamed from: t */
    public zpq f76169t;

    /* JADX INFO: renamed from: u */
    public rx3 f76170u;

    /* JADX INFO: renamed from: v */
    public k7f0 f76171v;

    /* JADX INFO: renamed from: w */
    public x20 f76172w = null;

    /* JADX INFO: renamed from: x */
    public final PutongAct f76173x;

    /* JADX INFO: renamed from: y */
    public FeedWebViewFrag f76174y;

    /* JADX INFO: renamed from: z */
    public xbi f76175z;

    public bci(PutongAct putongAct, FeedWebViewFrag feedWebViewFrag) {
        this.f76174y = feedWebViewFrag;
        this.f76173x = putongAct;
    }

    /* JADX INFO: renamed from: A */
    private void m103512A() {
        if (TextUtils.isEmpty(this.f76161l) || this.f76161l.equalsIgnoreCase("transparent")) {
            return;
        }
        boolean zStartsWith = this.f76161l.startsWith("#");
        String str = this.f76161l;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f76150a.setBackgroundColor(color);
            this.f76153d.setBackgroundColor(color);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m103513E(View view) {
        this.f76173x.onHomePressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m103519B(String str) {
        HashMap map = new HashMap();
        if (ntp0.m164746d(str)) {
            map.put("H5-Authorization", this.f76158i);
        } else {
            ntp0.m164748f("Load override url not in token whitelist: " + str + "\norigin: " + this.f76160k);
        }
        this.f76153d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m103520C() {
        if (this.f76153d == null) {
            return;
        }
        if (!ntp0.m164746d(this.f76160k)) {
            ntp0.m164748f("Load javascript:doWhenGetToken not in token whitelist: " + this.f76160k);
        } else {
            this.f76153d.loadUrl("javascript:doWhenGetToken('" + this.f76158i + "')");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76173x;
    }

    /* JADX INFO: renamed from: F */
    public final void m103521F(Map<String, String> map) {
        if (TextUtils.isEmpty(m103535q())) {
            return;
        }
        if (this.f76165p && this.f76169t == null) {
            this.f76169t = new zpq(this.f76173x, "", this.f76153d);
        }
        zpq zpqVarM103534p = m103534p();
        if (NullChecker.m82486a(zpqVarM103534p)) {
            this.f76153d.addJavascriptInterface(zpqVarM103534p, "tantan");
        }
        rx3 rx3Var = new rx3(this.f76173x, m103536s(), this.f76164o);
        this.f76170u = rx3Var;
        rx3Var.setListener(m103537u());
        this.f76171v = new k7f0(this.f76173x);
        this.f76153d.setWebViewClientX(this.f76170u);
        this.f76153d.setWebChromeClientX(this.f76171v);
        boolean zM82486a = NullChecker.m82486a(map);
        WebViewX webViewX = this.f76153d;
        if (zM82486a) {
            webViewX.loadUrl(m103535q(), map);
        } else {
            webViewX.loadUrl(m103535q());
        }
        this.f76153d.getSettings().setLoadWithOverviewMode(true);
        this.f76153d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.f76153d.getSettings().setMediaPlaybackRequiresUserGesture(this.f76167r);
        this.f76153d.getSettings().setBuiltInZoomControls(false);
        this.f76153d.getSettings().setSupportZoom(false);
        this.f76153d.setHorizontalScrollBarEnabled(false);
        this.f76153d.setFadingEdgeLength(0);
        if (this.f76163n) {
            PutongAct putongAct = this.f76173x;
            if ((putongAct instanceof FeedWebViewAct) && putongAct.getSupportActionBar() != null) {
                this.f76173x.getSupportActionBar().mo102186m();
            }
        }
        int i = this.f76173x.getResources().getDisplayMetrics().densityDpi;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        if (i == 120) {
            zoomDensity = WebSettings.ZoomDensity.CLOSE;
        } else if (i != 160 && i == 240) {
            zoomDensity = WebSettings.ZoomDensity.FAR;
        }
        this.f76153d.getSettings().setDefaultZoom(zoomDensity);
    }

    /* JADX INFO: renamed from: G */
    public void m103522G(Bundle bundle) {
        if (NullChecker.m82486a(bundle)) {
            this.f76159j = bundle.getString("title");
            this.f76160k = bundle.getString("url");
            this.f76161l = bundle.getString("webviewColor", "#ffffff");
            this.f76162m = bundle.getString("notchColor", "#ffffff");
            this.f76163n = bundle.getBoolean("hideNavigationBar", false);
            this.f76164o = bundle.getBoolean("hardwareAccelerated", false);
            this.f76165p = bundle.getBoolean("advanceInitJsBridge", true);
            this.f76166q = bundle.getBoolean("transparent_status_bar", false);
            this.f76168s = bundle.getBoolean("useActConfig", false);
            this.f76167r = bundle.getBoolean("playbackRequiresUserGesture", false);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m103523H(Throwable th) {
        this.f76155f.setVisibility(0);
        this.f76154e.setVisibility(8);
    }

    /* JADX INFO: renamed from: I */
    public void m103524I(AuthData authData) {
        this.f76158i = authData.accessToken;
        this.f76169t = m103532m(act(), this.f76158i, this.f76153d);
        HashMap map = new HashMap();
        if (ntp0.m164746d(this.f76160k)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            ntp0.m164748f("Load url not in token whitelist: " + this.f76160k);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.m82479c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        m103521F(map);
    }

    /* JADX INFO: renamed from: J */
    public void m103525J() {
        if (TextUtils.isEmpty(this.f76159j)) {
            return;
        }
        act().setTitle(this.f76159j);
        this.f76151b.setTitle(this.f76159j);
    }

    /* JADX INFO: renamed from: K */
    public void m103526K(String str) {
        zpq zpqVar = this.f76169t;
        if (zpqVar != null) {
            zpqVar.m220919d().mo97004b("resume", str);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f76169t)) {
            this.f76169t.m220926k();
        }
        m103533n();
    }

    /* JADX INFO: renamed from: f */
    public View m103527f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cci.m108709b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f76173x;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103527f(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xbi xbiVar) {
        this.f76175z = xbiVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m103530k() {
        return this.f76163n;
    }

    /* JADX INFO: renamed from: l */
    public boolean m103531l() {
        return this.f76153d.canGoBack() && !this.f76153d.getUrl().equals(rx3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public zpq m103532m(PutongAct putongAct, String str, WebViewX webViewX) {
        return new zpq(putongAct, this.f76158i, this.f76153d);
    }

    /* JADX INFO: renamed from: n */
    public void m103533n() {
        if (NullChecker.m82486a(this.f76153d)) {
            this.f76153d.removeAllViews();
            this.f76152c.removeView(this.f76153d);
            this.f76153d.setTag(null);
            this.f76153d.clearHistory();
            this.f76153d.destroy();
            this.f76153d = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public zpq m103534p() {
        return this.f76169t;
    }

    /* JADX INFO: renamed from: q */
    public String m103535q() {
        return this.f76160k;
    }

    /* JADX INFO: renamed from: s */
    public qcj<String, Boolean> m103536s() {
        return new qcj() { // from class: l.aci
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69715a.m103519B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: u */
    public rx3.InterfaceC19928a m103537u() {
        return new C15970a();
    }

    /* JADX INFO: renamed from: v */
    public void m103538v() {
        this.f76153d.goBack();
    }

    /* JADX INFO: renamed from: w */
    public void m103539w() {
        this.f76172w = new x20() { // from class: l.zbi
            @Override // p153l.x20
            public final void call() {
                this.f203670a.m103520C();
            }
        };
    }

    /* JADX INFO: renamed from: x */
    public void m103540x() {
        this.f76151b.setLeftIconResource(abc0.f69506n);
        this.f76151b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ybi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198339a.m103513E(view);
            }
        });
        if (m103530k()) {
            this.f76151b.setVisibility(8);
        }
        this.f76151b.m224830B();
    }

    /* JADX INFO: renamed from: y */
    public final void m103541y() {
        if (TextUtils.isEmpty(this.f76162m)) {
            return;
        }
        if (this.f76162m.equalsIgnoreCase("transparent")) {
            this.f76173x.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f76162m.startsWith("#");
        String str = this.f76162m;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f76173x.getWindow().addFlags(Integer.MIN_VALUE);
            this.f76173x.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f76173x.getWindow().setStatusBarColor(0);
            PutongAct.setLightStatusBar(this.f76173x.getWindow(), false, 0);
            this.f76173x.getWindow().getDecorView().setBackgroundColor(color);
            this.f76173x.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f76173x.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f76173x.getWindow(), true);
            if (NullChecker.m82486a(this.f76173x.getSupportActionBar())) {
                this.f76173x.getSupportActionBar().mo102168A(0.0f);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: z */
    public void m103542z(Map<String, String> map) {
        if (m103535q() == null || !m103535q().contains("?speed=true")) {
            this.f76153d.setLayerType(1, null);
        }
        this.f76175z.m209956h0();
        m103512A();
        m103541y();
    }

    /* JADX INFO: renamed from: l.bci$a */
    public class C15970a implements rx3.InterfaceC19928a {
        public C15970a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            bci.this.f76154e.setVisibility(8);
            if (TextUtils.isEmpty(bci.this.f76159j) && NullChecker.m82486a(bci.this.f76153d) && !TextUtils.isEmpty(bci.this.f76153d.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && bci.this.f76155f.getVisibility() != 0 && (bci.this.f76173x instanceof FeedWebViewAct)) {
                Object tag = bci.this.f76153d.getTag(ycc0.f198423J0);
                bci bciVar = bci.this;
                if (tag == null) {
                    bciVar.f76173x.setTitle(bci.this.f76153d.getTitle());
                    bci bciVar2 = bci.this;
                    bciVar2.f76151b.setTitle(bciVar2.f76153d.getTitle());
                } else {
                    bciVar.f76153d.setTag(ycc0.f198423J0, null);
                }
            }
            if (NullChecker.m82486a(bci.this.f76172w)) {
                bci.this.f76172w.call();
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            bci.this.f76155f.setVisibility(0);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }
    }
}
