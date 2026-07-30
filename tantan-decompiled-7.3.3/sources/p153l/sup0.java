package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;
import p153l.lup0;

/* JADX INFO: loaded from: classes10.dex */
public class sup0<P extends lup0> implements iam<P> {

    /* JADX INFO: renamed from: A */
    public zpq f170707A;

    /* JADX INFO: renamed from: B */
    public rx3 f170708B;

    /* JADX INFO: renamed from: C */
    public k7f0 f170709C;

    /* JADX INFO: renamed from: D */
    public x20 f170710D = null;

    /* JADX INFO: renamed from: E */
    public String f170711E;

    /* JADX INFO: renamed from: a */
    public VLinear f170712a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f170713b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f170714c;

    /* JADX INFO: renamed from: d */
    public WebViewX f170715d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f170716e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f170717f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f170718g;

    /* JADX INFO: renamed from: h */
    public ImageView f170719h;

    /* JADX INFO: renamed from: i */
    public P f170720i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f170721j;

    /* JADX INFO: renamed from: k */
    public String f170722k;

    /* JADX INFO: renamed from: l */
    public String f170723l;

    /* JADX INFO: renamed from: m */
    public boolean f170724m;

    /* JADX INFO: renamed from: n */
    public boolean f170725n;

    /* JADX INFO: renamed from: o */
    public boolean f170726o;

    /* JADX INFO: renamed from: p */
    public boolean f170727p;

    /* JADX INFO: renamed from: q */
    public boolean f170728q;

    /* JADX INFO: renamed from: r */
    public boolean f170729r;

    /* JADX INFO: renamed from: s */
    public boolean f170730s;

    /* JADX INFO: renamed from: t */
    public String f170731t;

    /* JADX INFO: renamed from: u */
    public String f170732u;

    /* JADX INFO: renamed from: v */
    public boolean f170733v;

    /* JADX INFO: renamed from: w */
    public boolean f170734w;

    /* JADX INFO: renamed from: x */
    public boolean f170735x;

    /* JADX INFO: renamed from: y */
    public boolean f170736y;

    /* JADX INFO: renamed from: z */
    public boolean f170737z;

    /* JADX INFO: renamed from: l.sup0$a */
    public class C20157a implements rx3.InterfaceC19928a {
        public C20157a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            sup0.this.f170716e.setVisibility(8);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            sup0.this.m188055L(str, map);
            if (TextUtils.isEmpty(sup0.this.f170722k) && NullChecker.m82486a(sup0.this.f170715d) && !TextUtils.isEmpty(sup0.this.f170715d.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && sup0.this.f170717f.getVisibility() != 0) {
                Object tag = sup0.this.f170715d.getTag(ycc0.f198423J0);
                sup0 sup0Var = sup0.this;
                if (tag == null) {
                    sup0Var.f170721j.setTitle(sup0.this.f170715d.getTitle());
                    sup0 sup0Var2 = sup0.this;
                    sup0Var2.f170713b.setTitle(sup0Var2.f170715d.getTitle());
                } else {
                    sup0Var.f170715d.setTag(ycc0.f198423J0, null);
                }
            }
            if (NullChecker.m82486a(sup0.this.f170710D)) {
                sup0.this.f170710D.call();
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            if (NullChecker.m82486a(sup0.this.f170715d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onStart");
                sup0 sup0Var = sup0.this;
                sup0Var.m188055L(sup0Var.f170715d.getUrl(), map);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            sup0.this.f170717f.setVisibility(0);
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            sup0 sup0Var = sup0.this;
            sup0Var.m188055L(sup0Var.f170723l, map);
        }
    }

    public sup0(PutongAct putongAct) {
        this.f170721j = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m188042C() {
        int color = 0;
        if (TextUtils.isEmpty(this.f170731t)) {
            this.f170715d.getSettings().setCacheMode(-1);
            this.f170715d.clearCache(false);
            return;
        }
        if (!this.f170731t.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f170731t.startsWith("#");
            String str = this.f170731t;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f170715d.getSettings().setCacheMode(-1);
                this.f170715d.clearCache(false);
                return;
            }
        }
        this.f170715d.setBackgroundColor(color);
        this.f170715d.getSettings().setCacheMode(2);
        this.f170715d.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ Boolean m188043F(String str) {
        if (this.f170729r && !str.startsWith("http")) {
            if (erq.m122256a(str)) {
                erq.m122258c(act(), str);
            } else {
                erq.m122258c(act(), str);
            }
            return Boolean.TRUE;
        }
        if (str.contains("tantan") && !this.f170737z) {
            this.f170715d.loadUrl(str);
            return Boolean.TRUE;
        }
        if (str.startsWith("https://wx.tenpay.com")) {
            HashMap map = new HashMap();
            if (this.f170737z) {
                map.put(HttpHeaders.REFERER, "https://npay.meituan.com");
            }
            this.f170715d.loadUrl(str, map);
            return Boolean.TRUE;
        }
        String strM188068s = m188068s(str);
        if (TextUtils.isEmpty(strM188068s)) {
            return Boolean.FALSE;
        }
        this.f170715d.loadUrl(strM188068s);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m188044G(View view) {
        this.f170721j.onHomePressed();
    }

    /* JADX INFO: renamed from: z */
    private void m188049z() {
        if (TextUtils.isEmpty(this.f170732u)) {
            return;
        }
        if (this.f170732u.equalsIgnoreCase("transparent")) {
            this.f170721j.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f170732u.startsWith("#");
        String str = this.f170732u;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f170721j.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: A */
    public void mo115145A(Map<String, String> map) {
        if (this.f170734w) {
            this.f170715d.setBackgroundColor(0);
        }
        if (TextUtils.isEmpty(m188067q())) {
            return;
        }
        if (this.f170727p && this.f170707A == null) {
            this.f170707A = new zpq(this.f170721j, "", this.f170715d);
        }
        zpq zpqVarM188066p = m188066p();
        if (NullChecker.m82486a(zpqVarM188066p) && !this.f170729r) {
            this.f170715d.addJavascriptInterface(zpqVarM188066p, "tantan");
        }
        if (this.f170729r) {
            this.f170715d.getSettings().setUserAgentString(null);
            this.f170715d.setDownloadListener(new DownloadListener() { // from class: l.qup0
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f159596a.m188051H(str, str2, str3, str4, j);
                }
            });
        }
        this.f170715d.getSettings().setMediaPlaybackRequiresUserGesture(this.f170726o);
        this.f170715d.getSettings().setTextZoom(100);
        if (this.f170736y) {
            this.f170715d.getSettings().setLoadWithOverviewMode(true);
        }
        if (this.f170724m && this.f170721j.getSupportActionBar() != null) {
            this.f170721j.getSupportActionBar().mo102186m();
        }
        boolean z = this.f170730s;
        ProgressBar progressBar = this.f170716e;
        if (z) {
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        m188042C();
        m188049z();
        m188070x();
        rx3 rx3Var = new rx3(this.f170721j, mo98401u(), this.f170725n);
        this.f170708B = rx3Var;
        rx3Var.setListener(mo98402v());
        k7f0 k7f0Var = new k7f0(this.f170721j);
        this.f170709C = k7f0Var;
        k7f0Var.setSelectFileType(this.f170711E);
        if (this.f170729r) {
            this.f170709C.setADWebViewSet();
        }
        this.f170715d.setWebViewClientX(this.f170708B);
        this.f170715d.setWebChromeClientX(this.f170709C);
        boolean zM82486a = NullChecker.m82486a(map);
        WebViewX webViewX = this.f170715d;
        if (zM82486a) {
            webViewX.loadUrl(m188067q(), map);
        } else {
            webViewX.loadUrl(m188067q());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f170721j;
    }

    /* JADX INFO: renamed from: E */
    public boolean m188050E() {
        return this.f170728q;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m188051H(String str, String str2, String str3, String str4, long j) {
        m188065n(str);
    }

    /* JADX INFO: renamed from: I */
    public void m188052I(String str) {
        this.f170715d.loadUrl(str);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m188053J(String str) {
        if (!TextUtils.isEmpty(this.f170723l)) {
            try {
                return TextUtils.equals("1", Uri.parse(this.f170723l).getQueryParameter(str));
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m188054K(Bundle bundle) {
        this.f170722k = this.f170721j.getIntent().getStringExtra("title");
        this.f170723l = this.f170721j.getIntent().getStringExtra("url");
        boolean z = true;
        this.f170724m = this.f170721j.getIntent().getBooleanExtra("hideNavigationBar", false) || m188053J("hideNavigationBar");
        this.f170725n = this.f170721j.getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f170726o = this.f170721j.getIntent().getBooleanExtra("playbackRequiresUserGesture", true);
        this.f170727p = this.f170721j.getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f170728q = this.f170721j.getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f170729r = this.f170721j.getIntent().getBooleanExtra("AD_WebView", false) || m188053J("AD_WebView");
        this.f170730s = this.f170721j.getIntent().getBooleanExtra("skipLoading", false) || m188053J("skipLoading");
        this.f170731t = this.f170721j.getIntent().getStringExtra("webviewColor");
        this.f170732u = this.f170721j.getIntent().getStringExtra("notchColor");
        if (!this.f170721j.getIntent().getBooleanExtra("hideNotch", false) && !m188053J("hideNotch")) {
            z = false;
        }
        this.f170733v = z;
        this.f170734w = this.f170721j.getIntent().getBooleanExtra("transparent_webview", false);
        this.f170735x = this.f170721j.getIntent().getBooleanExtra("disable_keybord_back", false);
        this.f170736y = this.f170721j.getIntent().getBooleanExtra("autofill", false);
        this.f170737z = this.f170721j.getIntent().getBooleanExtra("is_mt_pay", false);
        this.f170711E = this.f170721j.getIntent().getStringExtra("selectFileType");
        try {
            String str = this.f170723l;
            if (str == null || !str.toLowerCase().startsWith("file:") || new File(Uri.parse(this.f170723l).getPath()).getAbsolutePath().startsWith(getContext().getFilesDir().getParentFile().getAbsolutePath())) {
                return;
            }
            CrashHelper.m82479c(new Exception("WebViewViewModel url try to load extra file : " + this.f170723l));
            this.f170723l = "about:blank";
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m188055L(String str, HashMap<String, String> map) {
        i4g0.m138495D("e_intl_android_web_vue", "p_intl_android_web_vue", jyb.m147494Y("url", str), jyb.m147494Y(CommandMessage.PARAMS, map));
    }

    /* JADX INFO: renamed from: M */
    public void m188056M() {
        if (TextUtils.isEmpty(this.f170722k)) {
            return;
        }
        act().setTitle(this.f170722k);
        this.f170713b.setTitle(this.f170722k);
    }

    /* JADX INFO: renamed from: N */
    public boolean m188057N() {
        return this.f170734w;
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f170707A)) {
            this.f170707A.m220926k();
        }
        m188063l();
    }

    /* JADX INFO: renamed from: e */
    public View m188058e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tup0.m192759b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f170721j;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f170720i = p;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m188058e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public boolean m188061j() {
        return this.f170724m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m188062k() {
        return this.f170715d.canGoBack() && !this.f170715d.getUrl().equals(rx3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: l */
    public void m188063l() {
        if (NullChecker.m82486a(this.f170715d)) {
            this.f170715d.removeAllViews();
            this.f170714c.removeView(this.f170715d);
            this.f170715d.setTag(null);
            this.f170715d.clearHistory();
            this.f170715d.destroy();
            this.f170715d = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m188064m() {
        return this.f170735x;
    }

    /* JADX INFO: renamed from: n */
    public final void m188065n(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f170721j.startActivity(intent);
    }

    /* JADX INFO: renamed from: p */
    public zpq m188066p() {
        return this.f170707A;
    }

    /* JADX INFO: renamed from: q */
    public String m188067q() {
        return this.f170723l;
    }

    /* JADX INFO: renamed from: s */
    public final String m188068s(String str) {
        String next;
        Iterator<String> it = erq.f95507b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                return "";
            }
            next = it.next();
        } while (!str.startsWith(next));
        String[] strArrSplit = str.split("\\?");
        String str2 = erq.f95507b.get(next);
        String str3 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str2 + "?" + str3;
    }

    /* JADX INFO: renamed from: u */
    public qcj<String, Boolean> mo98401u() {
        return new qcj() { // from class: l.rup0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164930a.m188043F((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public rx3.InterfaceC19928a mo98402v() {
        return new C20157a();
    }

    /* JADX INFO: renamed from: w */
    public void m188069w() {
        this.f170715d.goBack();
    }

    /* JADX INFO: renamed from: x */
    public final void m188070x() {
        if (this.f170733v) {
            this.f170721j.getWindow().addFlags(Integer.MIN_VALUE);
            this.f170721j.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f170721j.getWindow().setStatusBarColor(0);
            this.f170721j.setLightStatusBar(1296);
            this.f170721j.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f170721j.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f170721j.getWindow(), true);
            if (NullChecker.m82486a(this.f170721j.getSupportActionBar())) {
                this.f170721j.getSupportActionBar().mo102168A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo115155y() {
        this.f170713b.setLeftIconResource(abc0.f69506n);
        this.f170713b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pup0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154210a.m188044G(view);
            }
        });
        if (m188061j()) {
            this.f170713b.setVisibility(8);
        }
    }
}
