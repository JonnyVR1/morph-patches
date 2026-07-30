package p009l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.d30;
import l.j760;
import l.plp0;
import l.s4c0;
import l.s7m;
import l.u2c0;
import l.vwb;
import l.w9j;
import l.zvf0;
import p009l.hlp0;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class olp0<P extends hlp0> implements s7m<P> {

    /* JADX INFO: renamed from: A */
    public aoq f18137A;

    /* JADX INFO: renamed from: B */
    public sw3 f18138B;

    /* JADX INFO: renamed from: C */
    public dze0 f18139C;

    /* JADX INFO: renamed from: D */
    public d30 f18140D = null;

    /* JADX INFO: renamed from: E */
    public String f18141E;

    /* JADX INFO: renamed from: a */
    public VLinear f18142a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f18143b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f18144c;

    /* JADX INFO: renamed from: d */
    public WebViewX f18145d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f18146e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f18147f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f18148g;

    /* JADX INFO: renamed from: h */
    public ImageView f18149h;

    /* JADX INFO: renamed from: i */
    public P f18150i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f18151j;

    /* JADX INFO: renamed from: k */
    public String f18152k;

    /* JADX INFO: renamed from: l */
    public String f18153l;

    /* JADX INFO: renamed from: m */
    public boolean f18154m;

    /* JADX INFO: renamed from: n */
    public boolean f18155n;

    /* JADX INFO: renamed from: o */
    public boolean f18156o;

    /* JADX INFO: renamed from: p */
    public boolean f18157p;

    /* JADX INFO: renamed from: q */
    public boolean f18158q;

    /* JADX INFO: renamed from: r */
    public boolean f18159r;

    /* JADX INFO: renamed from: s */
    public boolean f18160s;

    /* JADX INFO: renamed from: t */
    public String f18161t;

    /* JADX INFO: renamed from: u */
    public String f18162u;

    /* JADX INFO: renamed from: v */
    public boolean f18163v;

    /* JADX INFO: renamed from: w */
    public boolean f18164w;

    /* JADX INFO: renamed from: x */
    public boolean f18165x;

    /* JADX INFO: renamed from: y */
    public boolean f18166y;

    /* JADX INFO: renamed from: z */
    public boolean f18167z;

    /* JADX INFO: renamed from: l.olp0$a */
    public class C1085a implements sw3.InterfaceC1195a {
        public C1085a() {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            olp0.this.f18146e.setVisibility(8);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            olp0.this.m19955L(str, map);
            if (TextUtils.isEmpty(olp0.this.f18152k) && NullChecker.a(olp0.this.f18145d) && !TextUtils.isEmpty(olp0.this.f18145d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && olp0.this.f18147f.getVisibility() != 0) {
                Object tag = olp0.this.f18145d.getTag(s4c0.J0);
                olp0 olp0Var = olp0.this;
                if (tag == null) {
                    olp0Var.f18151j.setTitle(olp0.this.f18145d.getTitle());
                    olp0 olp0Var2 = olp0.this;
                    olp0Var2.f18143b.setTitle(olp0Var2.f18145d.getTitle());
                } else {
                    olp0Var.f18145d.setTag(s4c0.J0, null);
                }
            }
            if (NullChecker.a(olp0.this.f18140D)) {
                olp0.this.f18140D.call();
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
            if (NullChecker.a(olp0.this.f18145d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onStart");
                olp0 olp0Var = olp0.this;
                olp0Var.m19955L(olp0Var.f18145d.getUrl(), map);
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            olp0.this.f18147f.setVisibility(0);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            olp0 olp0Var = olp0.this;
            olp0Var.m19955L(olp0Var.f18153l, map);
        }
    }

    public olp0(PutongAct putongAct) {
        this.f18151j = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m19941C() {
        int color = 0;
        if (TextUtils.isEmpty(this.f18161t)) {
            this.f18145d.getSettings().setCacheMode(-1);
            this.f18145d.clearCache(false);
            return;
        }
        if (!this.f18161t.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f18161t.startsWith("#");
            String str = this.f18161t;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f18145d.getSettings().setCacheMode(-1);
                this.f18145d.clearCache(false);
                return;
            }
        }
        this.f18145d.setBackgroundColor(color);
        this.f18145d.getSettings().setCacheMode(2);
        this.f18145d.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m19942F(String str) {
        if (this.f18159r && !str.startsWith("http")) {
            if (epq.m14090a(str)) {
                epq.m14092c(act(), str);
            } else {
                epq.m14092c(act(), str);
            }
            return Boolean.TRUE;
        }
        if (str.contains("tantan") && !this.f18167z) {
            this.f18145d.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.startsWith("https://wx.tenpay.com")) {
            HashMap map = new HashMap();
            if (this.f18167z) {
                map.put("Referer", "https://npay.meituan.com");
            }
            this.f18145d.loadUrl(str, map);
            return Boolean.TRUE;
        }
        String strM19969s = m19969s(str);
        if (TextUtils.isEmpty(strM19969s)) {
            return Boolean.FALSE;
        }
        this.f18145d.loadUrl(strM19969s);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m19943G(View view) {
        this.f18151j.onHomePressed();
    }

    /* JADX INFO: renamed from: z */
    private void m19948z() {
        if (TextUtils.isEmpty(this.f18162u)) {
            return;
        }
        if (this.f18162u.equalsIgnoreCase("transparent")) {
            this.f18151j.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f18162u.startsWith("#");
        String str = this.f18162u;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f18151j.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: A */
    public void mo16293A(Map<String, String> map) {
        if (this.f18164w) {
            this.f18145d.setBackgroundColor(0);
        }
        if (TextUtils.isEmpty(m19968q())) {
            return;
        }
        if (this.f18157p && this.f18137A == null) {
            this.f18137A = new aoq(this.f18151j, "", this.f18145d);
        }
        aoq aoqVarM19967p = m19967p();
        if (NullChecker.a(aoqVarM19967p) && !this.f18159r) {
            this.f18145d.addJavascriptInterface(aoqVarM19967p, "tantan");
        }
        if (this.f18159r) {
            this.f18145d.getSettings().setUserAgentString(null);
            this.f18145d.setDownloadListener(new DownloadListener() { // from class: l.mlp0
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f16992a.m19951H(str, str2, str3, str4, j);
                }
            });
        }
        this.f18145d.getSettings().setMediaPlaybackRequiresUserGesture(this.f18156o);
        this.f18145d.getSettings().setTextZoom(100);
        if (this.f18166y) {
            this.f18145d.getSettings().setLoadWithOverviewMode(true);
        }
        if (this.f18154m && this.f18151j.getSupportActionBar() != null) {
            this.f18151j.getSupportActionBar().m();
        }
        boolean z = this.f18160s;
        ProgressBar progressBar = this.f18146e;
        if (z) {
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        m19941C();
        m19948z();
        m19971x();
        sw3 sw3Var = new sw3(this.f18151j, mo16304u(), this.f18155n);
        this.f18138B = sw3Var;
        sw3Var.setListener(mo16305v());
        dze0 dze0Var = new dze0(this.f18151j);
        this.f18139C = dze0Var;
        dze0Var.setSelectFileType(this.f18141E);
        if (this.f18159r) {
            this.f18139C.setADWebViewSet();
        }
        this.f18145d.setWebViewClientX(this.f18138B);
        this.f18145d.setWebChromeClientX(this.f18139C);
        boolean zA = NullChecker.a(map);
        WebViewX webViewX = this.f18145d;
        if (zA) {
            webViewX.loadUrl(m19968q(), map);
        } else {
            webViewX.loadUrl(m19968q());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19949C0() {
        return this.f18151j;
    }

    /* JADX INFO: renamed from: E */
    public boolean m19950E() {
        return this.f18158q;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m19951H(String str, String str2, String str3, String str4, long j) {
        m19966n(str);
    }

    /* JADX INFO: renamed from: I */
    public void m19952I(String str) {
        this.f18145d.loadUrl(str);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m19953J(String str) {
        if (!TextUtils.isEmpty(this.f18153l)) {
            try {
                return TextUtils.equals("1", Uri.parse(this.f18153l).getQueryParameter(str));
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m19954K(Bundle bundle) {
        this.f18152k = this.f18151j.getIntent().getStringExtra("title");
        this.f18153l = this.f18151j.getIntent().getStringExtra("url");
        boolean z = true;
        this.f18154m = this.f18151j.getIntent().getBooleanExtra("hideNavigationBar", false) || m19953J("hideNavigationBar");
        this.f18155n = this.f18151j.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f18156o = this.f18151j.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f18157p = this.f18151j.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f18158q = this.f18151j.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f18159r = this.f18151j.getIntent().getBooleanExtra("AD_WebView", false) || m19953J("AD_WebView");
        this.f18160s = this.f18151j.getIntent().getBooleanExtra("skipLoading", false) || m19953J("skipLoading");
        this.f18161t = this.f18151j.getIntent().getStringExtra("webviewColor");
        this.f18162u = this.f18151j.getIntent().getStringExtra("notchColor");
        if (!this.f18151j.getIntent().getBooleanExtra("hideNotch", false) && !m19953J("hideNotch")) {
            z = false;
        }
        this.f18163v = z;
        this.f18164w = this.f18151j.getIntent().getBooleanExtra("transparent_webview", false);
        this.f18165x = this.f18151j.getIntent().getBooleanExtra("disable_keybord_back", false);
        this.f18166y = this.f18151j.getIntent().getBooleanExtra("autofill", false);
        this.f18167z = this.f18151j.getIntent().getBooleanExtra("is_mt_pay", false);
        this.f18141E = this.f18151j.getIntent().getStringExtra("selectFileType");
        try {
            String str = this.f18153l;
            if (str == null || !str.toLowerCase().startsWith("file:") || new File(Uri.parse(this.f18153l).getPath()).getAbsolutePath().startsWith(m19949C0().getFilesDir().getParentFile().getAbsolutePath())) {
                return;
            }
            CrashHelper.c(new Exception("WebViewViewModel url try to load extra file : " + this.f18153l));
            this.f18153l = "about:blank";
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m19955L(String str, HashMap<String, String> map) {
        zvf0.D("e_intl_android_web_vue", "p_intl_android_web_vue", new j760[]{vwb.Y("url", str), vwb.Y("params", map)});
    }

    /* JADX INFO: renamed from: M */
    public void m19956M() {
        if (TextUtils.isEmpty(this.f18152k)) {
            return;
        }
        act().setTitle(this.f18152k);
        this.f18143b.setTitle(this.f18152k);
    }

    /* JADX INFO: renamed from: N */
    public boolean m19957N() {
        return this.f18164w;
    }

    public void destroy() {
        if (NullChecker.a(this.f18137A)) {
            this.f18137A.m11546k();
        }
        m19964l();
    }

    /* JADX INFO: renamed from: e */
    public View m19958e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return plp0.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f18151j;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m19961i1(P p) {
        this.f18150i = p;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m19958e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public boolean m19962j() {
        return this.f18154m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m19963k() {
        return this.f18145d.canGoBack() && !this.f18145d.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: l */
    public void m19964l() {
        if (NullChecker.a(this.f18145d)) {
            this.f18145d.removeAllViews();
            this.f18144c.removeView(this.f18145d);
            this.f18145d.setTag(null);
            this.f18145d.clearHistory();
            this.f18145d.destroy();
            this.f18145d = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m19965m() {
        return this.f18165x;
    }

    /* JADX INFO: renamed from: n */
    public final void m19966n(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f18151j.startActivity(intent);
    }

    /* JADX INFO: renamed from: p */
    public aoq m19967p() {
        return this.f18137A;
    }

    /* JADX INFO: renamed from: q */
    public String m19968q() {
        return this.f18153l;
    }

    /* JADX INFO: renamed from: s */
    public final String m19969s(String str) {
        String next;
        Iterator<String> it = epq.f12658b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                return "";
            }
            next = it.next();
        } while (!str.startsWith(next));
        String[] strArrSplit = str.split("\\?");
        String str2 = epq.f12658b.get(next);
        String str3 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str2 + "?" + str3;
    }

    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo16304u() {
        return new w9j() { // from class: l.nlp0
            public final Object call(Object obj) {
                return this.f17574a.m19942F((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC1195a mo16305v() {
        return new C1085a();
    }

    /* JADX INFO: renamed from: w */
    public void m19970w() {
        this.f18145d.goBack();
    }

    /* JADX INFO: renamed from: x */
    public final void m19971x() {
        if (this.f18163v) {
            this.f18151j.getWindow().addFlags(Integer.MIN_VALUE);
            this.f18151j.getWindow().clearFlags(67108864);
            this.f18151j.getWindow().setStatusBarColor(0);
            this.f18151j.setLightStatusBar(1296);
            this.f18151j.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f18151j.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f18151j.getWindow(), true);
            if (NullChecker.a(this.f18151j.getSupportActionBar())) {
                this.f18151j.getSupportActionBar().A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo16306y() {
        this.f18143b.setLeftIconResource(u2c0.n);
        this.f18143b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.llp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16251a.m19943G(view);
            }
        });
        if (m19962j()) {
            this.f18143b.setVisibility(8);
        }
    }
}
