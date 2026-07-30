package p149l;

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
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;
import p149l.hlp0;

/* JADX INFO: loaded from: classes11.dex */
public class olp0<P extends hlp0> implements s7m<P> {

    /* JADX INFO: renamed from: A */
    public aoq f144522A;

    /* JADX INFO: renamed from: B */
    public sw3 f144523B;

    /* JADX INFO: renamed from: C */
    public dze0 f144524C;

    /* JADX INFO: renamed from: D */
    public d30 f144525D = null;

    /* JADX INFO: renamed from: E */
    public String f144526E;

    /* JADX INFO: renamed from: a */
    public VLinear f144527a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f144528b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f144529c;

    /* JADX INFO: renamed from: d */
    public WebViewX f144530d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f144531e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f144532f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f144533g;

    /* JADX INFO: renamed from: h */
    public ImageView f144534h;

    /* JADX INFO: renamed from: i */
    public P f144535i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f144536j;

    /* JADX INFO: renamed from: k */
    public String f144537k;

    /* JADX INFO: renamed from: l */
    public String f144538l;

    /* JADX INFO: renamed from: m */
    public boolean f144539m;

    /* JADX INFO: renamed from: n */
    public boolean f144540n;

    /* JADX INFO: renamed from: o */
    public boolean f144541o;

    /* JADX INFO: renamed from: p */
    public boolean f144542p;

    /* JADX INFO: renamed from: q */
    public boolean f144543q;

    /* JADX INFO: renamed from: r */
    public boolean f144544r;

    /* JADX INFO: renamed from: s */
    public boolean f144545s;

    /* JADX INFO: renamed from: t */
    public String f144546t;

    /* JADX INFO: renamed from: u */
    public String f144547u;

    /* JADX INFO: renamed from: v */
    public boolean f144548v;

    /* JADX INFO: renamed from: w */
    public boolean f144549w;

    /* JADX INFO: renamed from: x */
    public boolean f144550x;

    /* JADX INFO: renamed from: y */
    public boolean f144551y;

    /* JADX INFO: renamed from: z */
    public boolean f144552z;

    /* JADX INFO: renamed from: l.olp0$a */
    public class C18971a implements sw3.InterfaceC20043a {
        public C18971a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            olp0.this.f144531e.setVisibility(8);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            olp0.this.m164968L(str, map);
            if (TextUtils.isEmpty(olp0.this.f144537k) && NullChecker.m81303a(olp0.this.f144530d) && !TextUtils.isEmpty(olp0.this.f144530d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && olp0.this.f144532f.getVisibility() != 0) {
                Object tag = olp0.this.f144530d.getTag(s4c0.f162302J0);
                olp0 olp0Var = olp0.this;
                if (tag == null) {
                    olp0Var.f144536j.setTitle(olp0.this.f144530d.getTitle());
                    olp0 olp0Var2 = olp0.this;
                    olp0Var2.f144528b.setTitle(olp0Var2.f144530d.getTitle());
                } else {
                    olp0Var.f144530d.setTag(s4c0.f162302J0, null);
                }
            }
            if (NullChecker.m81303a(olp0.this.f144525D)) {
                olp0.this.f144525D.call();
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            if (NullChecker.m81303a(olp0.this.f144530d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onStart");
                olp0 olp0Var = olp0.this;
                olp0Var.m164968L(olp0Var.f144530d.getUrl(), map);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            olp0.this.f144532f.setVisibility(0);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            olp0 olp0Var = olp0.this;
            olp0Var.m164968L(olp0Var.f144538l, map);
        }
    }

    public olp0(PutongAct putongAct) {
        this.f144536j = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m164955C() {
        int color = 0;
        if (TextUtils.isEmpty(this.f144546t)) {
            this.f144530d.getSettings().setCacheMode(-1);
            this.f144530d.clearCache(false);
            return;
        }
        if (!this.f144546t.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f144546t.startsWith("#");
            String str = this.f144546t;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f144530d.getSettings().setCacheMode(-1);
                this.f144530d.clearCache(false);
                return;
            }
        }
        this.f144530d.setBackgroundColor(color);
        this.f144530d.getSettings().setCacheMode(2);
        this.f144530d.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m164956F(String str) {
        if (this.f144544r && !str.startsWith("http")) {
            if (epq.m117670a(str)) {
                epq.m117672c(act(), str);
            } else {
                epq.m117672c(act(), str);
            }
            return Boolean.TRUE;
        }
        if (str.contains("tantan") && !this.f144552z) {
            this.f144530d.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.startsWith("https://wx.tenpay.com")) {
            HashMap map = new HashMap();
            if (this.f144552z) {
                map.put(HttpHeaders.REFERER, "https://npay.meituan.com");
            }
            this.f144530d.loadUrl(str, map);
            return Boolean.TRUE;
        }
        String strM164981s = m164981s(str);
        if (TextUtils.isEmpty(strM164981s)) {
            return Boolean.FALSE;
        }
        this.f144530d.loadUrl(strM164981s);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m164957G(View view) {
        this.f144536j.onHomePressed();
    }

    /* JADX INFO: renamed from: z */
    private void m164962z() {
        if (TextUtils.isEmpty(this.f144547u)) {
            return;
        }
        if (this.f144547u.equalsIgnoreCase("transparent")) {
            this.f144536j.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f144547u.startsWith("#");
        String str = this.f144547u;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f144536j.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: A */
    public void mo135219A(Map<String, String> map) {
        if (this.f144549w) {
            this.f144530d.setBackgroundColor(0);
        }
        if (TextUtils.isEmpty(m164980q())) {
            return;
        }
        if (this.f144542p && this.f144522A == null) {
            this.f144522A = new aoq(this.f144536j, "", this.f144530d);
        }
        aoq aoqVarM164979p = m164979p();
        if (NullChecker.m81303a(aoqVarM164979p) && !this.f144544r) {
            this.f144530d.addJavascriptInterface(aoqVarM164979p, "tantan");
        }
        if (this.f144544r) {
            this.f144530d.getSettings().setUserAgentString(null);
            this.f144530d.setDownloadListener(new DownloadListener() { // from class: l.mlp0
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f134460a.m164964H(str, str2, str3, str4, j);
                }
            });
        }
        this.f144530d.getSettings().setMediaPlaybackRequiresUserGesture(this.f144541o);
        this.f144530d.getSettings().setTextZoom(100);
        if (this.f144551y) {
            this.f144530d.getSettings().setLoadWithOverviewMode(true);
        }
        if (this.f144539m && this.f144536j.getSupportActionBar() != null) {
            this.f144536j.getSupportActionBar().mo134126m();
        }
        boolean z = this.f144545s;
        ProgressBar progressBar = this.f144531e;
        if (z) {
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        m164955C();
        m164962z();
        m164983x();
        sw3 sw3Var = new sw3(this.f144536j, mo135230u(), this.f144540n);
        this.f144523B = sw3Var;
        sw3Var.setListener(mo135231v());
        dze0 dze0Var = new dze0(this.f144536j);
        this.f144524C = dze0Var;
        dze0Var.setSelectFileType(this.f144526E);
        if (this.f144544r) {
            this.f144524C.setADWebViewSet();
        }
        this.f144530d.setWebViewClientX(this.f144523B);
        this.f144530d.setWebChromeClientX(this.f144524C);
        boolean zM81303a = NullChecker.m81303a(map);
        WebViewX webViewX = this.f144530d;
        if (zM81303a) {
            webViewX.loadUrl(m164980q(), map);
        } else {
            webViewX.loadUrl(m164980q());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f144536j;
    }

    /* JADX INFO: renamed from: E */
    public boolean m164963E() {
        return this.f144543q;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m164964H(String str, String str2, String str3, String str4, long j) {
        m164978n(str);
    }

    /* JADX INFO: renamed from: I */
    public void m164965I(String str) {
        this.f144530d.loadUrl(str);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m164966J(String str) {
        if (!TextUtils.isEmpty(this.f144538l)) {
            try {
                return TextUtils.equals("1", Uri.parse(this.f144538l).getQueryParameter(str));
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m164967K(Bundle bundle) {
        this.f144537k = this.f144536j.getIntent().getStringExtra("title");
        this.f144538l = this.f144536j.getIntent().getStringExtra("url");
        boolean z = true;
        this.f144539m = this.f144536j.getIntent().getBooleanExtra("hideNavigationBar", false) || m164966J("hideNavigationBar");
        this.f144540n = this.f144536j.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f144541o = this.f144536j.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f144542p = this.f144536j.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f144543q = this.f144536j.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f144544r = this.f144536j.getIntent().getBooleanExtra("AD_WebView", false) || m164966J("AD_WebView");
        this.f144545s = this.f144536j.getIntent().getBooleanExtra("skipLoading", false) || m164966J("skipLoading");
        this.f144546t = this.f144536j.getIntent().getStringExtra("webviewColor");
        this.f144547u = this.f144536j.getIntent().getStringExtra("notchColor");
        if (!this.f144536j.getIntent().getBooleanExtra("hideNotch", false) && !m164966J("hideNotch")) {
            z = false;
        }
        this.f144548v = z;
        this.f144549w = this.f144536j.getIntent().getBooleanExtra("transparent_webview", false);
        this.f144550x = this.f144536j.getIntent().getBooleanExtra("disable_keybord_back", false);
        this.f144551y = this.f144536j.getIntent().getBooleanExtra("autofill", false);
        this.f144552z = this.f144536j.getIntent().getBooleanExtra("is_mt_pay", false);
        this.f144526E = this.f144536j.getIntent().getStringExtra("selectFileType");
        try {
            String str = this.f144538l;
            if (str == null || !str.toLowerCase().startsWith("file:") || new File(Uri.parse(this.f144538l).getPath()).getAbsolutePath().startsWith(getContext().getFilesDir().getParentFile().getAbsolutePath())) {
                return;
            }
            CrashHelper.m81296c(new Exception("WebViewViewModel url try to load extra file : " + this.f144538l));
            this.f144538l = "about:blank";
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m164968L(String str, HashMap<String, String> map) {
        zvf0.m220371D("e_intl_android_web_vue", "p_intl_android_web_vue", vwb.m200311Y("url", str), vwb.m200311Y(CommandMessage.PARAMS, map));
    }

    /* JADX INFO: renamed from: M */
    public void m164969M() {
        if (TextUtils.isEmpty(this.f144537k)) {
            return;
        }
        act().setTitle(this.f144537k);
        this.f144528b.setTitle(this.f144537k);
    }

    /* JADX INFO: renamed from: N */
    public boolean m164970N() {
        return this.f144549w;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f144522A)) {
            this.f144522A.m97931k();
        }
        m164976l();
    }

    /* JADX INFO: renamed from: e */
    public View m164971e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return plp0.m170240b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f144536j;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f144535i = p;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m164971e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public boolean m164974j() {
        return this.f144539m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m164975k() {
        return this.f144530d.canGoBack() && !this.f144530d.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: l */
    public void m164976l() {
        if (NullChecker.m81303a(this.f144530d)) {
            this.f144530d.removeAllViews();
            this.f144529c.removeView(this.f144530d);
            this.f144530d.setTag(null);
            this.f144530d.clearHistory();
            this.f144530d.destroy();
            this.f144530d = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m164977m() {
        return this.f144550x;
    }

    /* JADX INFO: renamed from: n */
    public final void m164978n(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f144536j.startActivity(intent);
    }

    /* JADX INFO: renamed from: p */
    public aoq m164979p() {
        return this.f144522A;
    }

    /* JADX INFO: renamed from: q */
    public String m164980q() {
        return this.f144538l;
    }

    /* JADX INFO: renamed from: s */
    public final String m164981s(String str) {
        String next;
        Iterator<String> it = epq.f92704b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                return "";
            }
            next = it.next();
        } while (!str.startsWith(next));
        String[] strArrSplit = str.split("\\?");
        String str2 = epq.f92704b.get(next);
        String str3 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str2 + "?" + str3;
    }

    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo135230u() {
        return new w9j() { // from class: l.nlp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139578a.m164956F((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC20043a mo135231v() {
        return new C18971a();
    }

    /* JADX INFO: renamed from: w */
    public void m164982w() {
        this.f144530d.goBack();
    }

    /* JADX INFO: renamed from: x */
    public final void m164983x() {
        if (this.f144548v) {
            this.f144536j.getWindow().addFlags(Integer.MIN_VALUE);
            this.f144536j.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f144536j.getWindow().setStatusBarColor(0);
            this.f144536j.setLightStatusBar(1296);
            this.f144536j.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f144536j.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f144536j.getWindow(), true);
            if (NullChecker.m81303a(this.f144536j.getSupportActionBar())) {
                this.f144536j.getSupportActionBar().mo134111A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo135232y() {
        this.f144528b.setLeftIconResource(u2c0.f173386n);
        this.f144528b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.llp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128741a.m164957G(view);
            }
        });
        if (m164974j()) {
            this.f144528b.setVisibility(8);
        }
    }
}
