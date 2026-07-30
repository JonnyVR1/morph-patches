package p149l;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.feed.newui.webview.FeedWebViewAct;
import com.p046p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.Map;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class mai implements s7m<iai> {

    /* JADX INFO: renamed from: a */
    public VLinear f132885a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f132886b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f132887c;

    /* JADX INFO: renamed from: d */
    public WebViewX f132888d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f132889e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f132890f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f132891g;

    /* JADX INFO: renamed from: h */
    public ImageView f132892h;

    /* JADX INFO: renamed from: i */
    public String f132893i;

    /* JADX INFO: renamed from: j */
    public String f132894j;

    /* JADX INFO: renamed from: k */
    public String f132895k;

    /* JADX INFO: renamed from: l */
    public String f132896l;

    /* JADX INFO: renamed from: m */
    public String f132897m;

    /* JADX INFO: renamed from: n */
    public boolean f132898n;

    /* JADX INFO: renamed from: o */
    public boolean f132899o;

    /* JADX INFO: renamed from: p */
    public boolean f132900p;

    /* JADX INFO: renamed from: q */
    public boolean f132901q;

    /* JADX INFO: renamed from: r */
    public boolean f132902r;

    /* JADX INFO: renamed from: s */
    public boolean f132903s;

    /* JADX INFO: renamed from: t */
    public aoq f132904t;

    /* JADX INFO: renamed from: u */
    public sw3 f132905u;

    /* JADX INFO: renamed from: v */
    public dze0 f132906v;

    /* JADX INFO: renamed from: w */
    public d30 f132907w = null;

    /* JADX INFO: renamed from: x */
    public final PutongAct f132908x;

    /* JADX INFO: renamed from: y */
    public FeedWebViewFrag f132909y;

    /* JADX INFO: renamed from: z */
    public iai f132910z;

    public mai(PutongAct putongAct, FeedWebViewFrag feedWebViewFrag) {
        this.f132909y = feedWebViewFrag;
        this.f132908x = putongAct;
    }

    /* JADX INFO: renamed from: A */
    private void m153790A() {
        if (TextUtils.isEmpty(this.f132896l) || this.f132896l.equalsIgnoreCase("transparent")) {
            return;
        }
        boolean zStartsWith = this.f132896l.startsWith("#");
        String str = this.f132896l;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f132885a.setBackgroundColor(color);
            this.f132888d.setBackgroundColor(color);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m153791E(View view) {
        this.f132908x.onHomePressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Boolean m153797B(String str) {
        HashMap map = new HashMap();
        if (jkp0.m141904d(str)) {
            map.put("H5-Authorization", this.f132893i);
        } else {
            jkp0.m141906f("Load override url not in token whitelist: " + str + "\norigin: " + this.f132895k);
        }
        this.f132888d.loadUrl(str, map);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m153798C() {
        if (this.f132888d == null) {
            return;
        }
        if (!jkp0.m141904d(this.f132895k)) {
            jkp0.m141906f("Load javascript:doWhenGetToken not in token whitelist: " + this.f132895k);
        } else {
            this.f132888d.loadUrl("javascript:doWhenGetToken('" + this.f132893i + "')");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f132908x;
    }

    /* JADX INFO: renamed from: F */
    public final void m153799F(Map<String, String> map) {
        if (TextUtils.isEmpty(m153813q())) {
            return;
        }
        if (this.f132900p && this.f132904t == null) {
            this.f132904t = new aoq(this.f132908x, "", this.f132888d);
        }
        aoq aoqVarM153812p = m153812p();
        if (NullChecker.m81303a(aoqVarM153812p)) {
            this.f132888d.addJavascriptInterface(aoqVarM153812p, "tantan");
        }
        sw3 sw3Var = new sw3(this.f132908x, m153814s(), this.f132899o);
        this.f132905u = sw3Var;
        sw3Var.setListener(m153815u());
        this.f132906v = new dze0(this.f132908x);
        this.f132888d.setWebViewClientX(this.f132905u);
        this.f132888d.setWebChromeClientX(this.f132906v);
        boolean zM81303a = NullChecker.m81303a(map);
        WebViewX webViewX = this.f132888d;
        if (zM81303a) {
            webViewX.loadUrl(m153813q(), map);
        } else {
            webViewX.loadUrl(m153813q());
        }
        this.f132888d.getSettings().setLoadWithOverviewMode(true);
        this.f132888d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.f132888d.getSettings().setMediaPlaybackRequiresUserGesture(this.f132902r);
        this.f132888d.getSettings().setBuiltInZoomControls(false);
        this.f132888d.getSettings().setSupportZoom(false);
        this.f132888d.setHorizontalScrollBarEnabled(false);
        this.f132888d.setFadingEdgeLength(0);
        if (this.f132898n) {
            PutongAct putongAct = this.f132908x;
            if ((putongAct instanceof FeedWebViewAct) && putongAct.getSupportActionBar() != null) {
                this.f132908x.getSupportActionBar().mo134126m();
            }
        }
        int i = this.f132908x.getResources().getDisplayMetrics().densityDpi;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        if (i == 120) {
            zoomDensity = WebSettings.ZoomDensity.CLOSE;
        } else if (i != 160 && i == 240) {
            zoomDensity = WebSettings.ZoomDensity.FAR;
        }
        this.f132888d.getSettings().setDefaultZoom(zoomDensity);
    }

    /* JADX INFO: renamed from: G */
    public void m153800G(Bundle bundle) {
        if (NullChecker.m81303a(bundle)) {
            this.f132894j = bundle.getString("title");
            this.f132895k = bundle.getString("url");
            this.f132896l = bundle.getString("webviewColor", "#ffffff");
            this.f132897m = bundle.getString("notchColor", "#ffffff");
            this.f132898n = bundle.getBoolean("hideNavigationBar", false);
            this.f132899o = bundle.getBoolean("hardwareAccelerated", false);
            this.f132900p = bundle.getBoolean("advanceInitJsBridge", true);
            this.f132901q = bundle.getBoolean("transparent_status_bar", false);
            this.f132903s = bundle.getBoolean("useActConfig", false);
            this.f132902r = bundle.getBoolean("playbackRequiresUserGesture", false);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m153801H(Throwable th) {
        this.f132890f.setVisibility(0);
        this.f132889e.setVisibility(8);
    }

    /* JADX INFO: renamed from: I */
    public void m153802I(AuthData authData) {
        this.f132893i = authData.accessToken;
        this.f132904t = m153810m(act(), this.f132893i, this.f132888d);
        HashMap map = new HashMap();
        if (jkp0.m141904d(this.f132895k)) {
            map.put("H5-Authorization", authData.accessToken);
        } else {
            jkp0.m141906f("Load url not in token whitelist: " + this.f132895k);
        }
        if (TextUtils.isEmpty(authData.accessToken)) {
            CrashHelper.m81296c(new NullPointerException("AccessTokenWebView request h5 right,but accessToken is null !"));
        }
        m153799F(map);
    }

    /* JADX INFO: renamed from: J */
    public void m153803J() {
        if (TextUtils.isEmpty(this.f132894j)) {
            return;
        }
        act().setTitle(this.f132894j);
        this.f132886b.setTitle(this.f132894j);
    }

    /* JADX INFO: renamed from: K */
    public void m153804K(String str) {
        aoq aoqVar = this.f132904t;
        if (aoqVar != null) {
            aoqVar.m97924d().mo127285b("resume", str);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f132904t)) {
            this.f132904t.m97931k();
        }
        m153811n();
    }

    /* JADX INFO: renamed from: f */
    public View m153805f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nai.m158690b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f132908x;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m153805f(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iai iaiVar) {
        this.f132910z = iaiVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m153808k() {
        return this.f132898n;
    }

    /* JADX INFO: renamed from: l */
    public boolean m153809l() {
        return this.f132888d.canGoBack() && !this.f132888d.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: m */
    public aoq m153810m(PutongAct putongAct, String str, WebViewX webViewX) {
        return new aoq(putongAct, this.f132893i, this.f132888d);
    }

    /* JADX INFO: renamed from: n */
    public void m153811n() {
        if (NullChecker.m81303a(this.f132888d)) {
            this.f132888d.removeAllViews();
            this.f132887c.removeView(this.f132888d);
            this.f132888d.setTag(null);
            this.f132888d.clearHistory();
            this.f132888d.destroy();
            this.f132888d = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public aoq m153812p() {
        return this.f132904t;
    }

    /* JADX INFO: renamed from: q */
    public String m153813q() {
        return this.f132895k;
    }

    /* JADX INFO: renamed from: s */
    public w9j<String, Boolean> m153814s() {
        return new w9j() { // from class: l.lai
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127209a.m153797B((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: u */
    public sw3.InterfaceC20043a m153815u() {
        return new C18428a();
    }

    /* JADX INFO: renamed from: v */
    public void m153816v() {
        this.f132888d.goBack();
    }

    /* JADX INFO: renamed from: w */
    public void m153817w() {
        this.f132907w = new d30() { // from class: l.kai
            @Override // p149l.d30
            public final void call() {
                this.f122119a.m153798C();
            }
        };
    }

    /* JADX INFO: renamed from: x */
    public void m153818x() {
        this.f132886b.setLeftIconResource(u2c0.f173386n);
        this.f132886b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.jai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117091a.m153791E(view);
            }
        });
        if (m153808k()) {
            this.f132886b.setVisibility(8);
        }
        this.f132886b.m223584B();
    }

    /* JADX INFO: renamed from: y */
    public final void m153819y() {
        if (TextUtils.isEmpty(this.f132897m)) {
            return;
        }
        if (this.f132897m.equalsIgnoreCase("transparent")) {
            this.f132908x.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f132897m.startsWith("#");
        String str = this.f132897m;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            int color = Color.parseColor(str);
            this.f132908x.getWindow().addFlags(Integer.MIN_VALUE);
            this.f132908x.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f132908x.getWindow().setStatusBarColor(0);
            PutongAct.setLightStatusBar(this.f132908x.getWindow(), false, 0);
            this.f132908x.getWindow().getDecorView().setBackgroundColor(color);
            this.f132908x.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f132908x.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f132908x.getWindow(), true);
            if (NullChecker.m81303a(this.f132908x.getSupportActionBar())) {
                this.f132908x.getSupportActionBar().mo134111A(0.0f);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: z */
    public void m153820z(Map<String, String> map) {
        if (m153813q() == null || !m153813q().contains("?speed=true")) {
            this.f132888d.setLayerType(1, null);
        }
        this.f132910z.m135157h0();
        m153790A();
        m153819y();
    }

    /* JADX INFO: renamed from: l.mai$a */
    public class C18428a implements sw3.InterfaceC20043a {
        public C18428a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            mai.this.f132889e.setVisibility(8);
            if (TextUtils.isEmpty(mai.this.f132894j) && NullChecker.m81303a(mai.this.f132888d) && !TextUtils.isEmpty(mai.this.f132888d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && mai.this.f132890f.getVisibility() != 0 && (mai.this.f132908x instanceof FeedWebViewAct)) {
                Object tag = mai.this.f132888d.getTag(s4c0.f162302J0);
                mai maiVar = mai.this;
                if (tag == null) {
                    maiVar.f132908x.setTitle(mai.this.f132888d.getTitle());
                    mai maiVar2 = mai.this;
                    maiVar2.f132886b.setTitle(maiVar2.f132888d.getTitle());
                } else {
                    maiVar.f132888d.setTag(s4c0.f162302J0, null);
                }
            }
            if (NullChecker.m81303a(mai.this.f132907w)) {
                mai.this.f132907w.call();
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            mai.this.f132890f.setVisibility(0);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }
    }
}
