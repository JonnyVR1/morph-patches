package p149l;

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
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkProgressView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;
import p149l.u400;

/* JADX INFO: loaded from: classes11.dex */
public class a500<P extends u400> implements s7m<P> {

    /* JADX INFO: renamed from: A */
    public String f67586A;

    /* JADX INFO: renamed from: B */
    public dze0 f67587B;

    /* JADX INFO: renamed from: D */
    public boolean f67589D;

    /* JADX INFO: renamed from: a */
    public VLinear f67595a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f67596b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f67597c;

    /* JADX INFO: renamed from: d */
    public P f67598d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f67599e;

    /* JADX INFO: renamed from: f */
    public izb f67600f;

    /* JADX INFO: renamed from: g */
    public MKWebView f67601g;

    /* JADX INFO: renamed from: h */
    public MkProgressView f67602h;

    /* JADX INFO: renamed from: i */
    public ProgressBar f67603i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f67604j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f67605k;

    /* JADX INFO: renamed from: l */
    public ImageView f67606l;

    /* JADX INFO: renamed from: m */
    public String f67607m;

    /* JADX INFO: renamed from: n */
    public String f67608n;

    /* JADX INFO: renamed from: o */
    public String f67609o;

    /* JADX INFO: renamed from: p */
    public boolean f67610p;

    /* JADX INFO: renamed from: q */
    public boolean f67611q;

    /* JADX INFO: renamed from: r */
    public boolean f67612r;

    /* JADX INFO: renamed from: s */
    public boolean f67613s;

    /* JADX INFO: renamed from: t */
    public boolean f67614t;

    /* JADX INFO: renamed from: u */
    public boolean f67615u;

    /* JADX INFO: renamed from: v */
    public boolean f67616v;

    /* JADX INFO: renamed from: w */
    public String f67617w;

    /* JADX INFO: renamed from: x */
    public String f67618x;

    /* JADX INFO: renamed from: y */
    public boolean f67619y;

    /* JADX INFO: renamed from: z */
    public boolean f67620z;

    /* JADX INFO: renamed from: C */
    public d30 f67588C = null;

    /* JADX INFO: renamed from: E */
    public boolean f67590E = true;

    /* JADX INFO: renamed from: F */
    public long f67591F = 0;

    /* JADX INFO: renamed from: G */
    public long f67592G = 0;

    /* JADX INFO: renamed from: H */
    public final AtomicInteger f67593H = new AtomicInteger();

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f67594I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l.a500$a */
    public class C15529a implements ne80 {
        public C15529a() {
        }

        @Override // p149l.ne80
        /* JADX INFO: renamed from: a */
        public boolean mo95002a(String str) {
            zvp zvpVar = zvp.INSTANCE;
            a500 a500Var = a500.this;
            return zvpVar.m220465b(a500Var.f67601g, str, a500Var.f67599e);
        }

        @Override // p149l.ne80
        /* JADX INFO: renamed from: b */
        public boolean mo95003b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.a500$b */
    public class C15530b extends MKWebViewHelper.C14921b {
        public C15530b(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onError");
            a500 a500Var = a500.this;
            a500Var.m94991W(a500Var.f67608n, map);
            if (a500.this.f67590E) {
                try {
                    MKWebView mKWebView = a500.this.f67601g;
                    if (mKWebView != null) {
                        mKWebView.getMkWebCaptureHelper().m87173l(a500.this.f67601g);
                    }
                } catch (Exception unused) {
                }
                a500.this.f67604j.setVisibility(0);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onFinish");
            a500.this.m94991W(str, map);
            System.currentTimeMillis();
            long unused = a500.this.f67592G;
            if (NullChecker.m81303a(a500.this.f67601g)) {
                a500.this.f67601g.setLayerType(0, null);
            }
            a500.this.f67603i.setVisibility(8);
            if (TextUtils.isEmpty(a500.this.f67607m) && NullChecker.m81303a(a500.this.f67601g) && !TextUtils.isEmpty(a500.this.f67601g.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && a500.this.f67604j.getVisibility() != 0) {
                Object tag = a500.this.f67601g.getTag(s4c0.f162302J0);
                a500 a500Var = a500.this;
                if (tag == null) {
                    a500Var.f67599e.setTitle(a500.this.f67601g.getTitle());
                    a500 a500Var2 = a500.this;
                    a500Var2.f67596b.setTitle(a500Var2.f67601g.getTitle());
                } else {
                    a500Var.f67601g.setTag(s4c0.f162302J0, null);
                }
            }
            if (NullChecker.m81303a(a500.this.f67588C)) {
                a500.this.f67588C.call();
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            HashMap<String, String> map = new HashMap<>();
            map.put("step", "onStart");
            a500.this.m94991W(str, map);
            System.currentTimeMillis();
            long unused = a500.this.f67592G;
            if (NullChecker.m81303a(a500.this.f67601g)) {
                a500.this.f67601g.setLayerType(2, null);
            }
            if (a500.this.f67616v) {
                a500.this.f67603i.setVisibility(8);
            } else {
                boolean zContains = str.contains("&_offline=1");
                a500 a500Var = a500.this;
                if (zContains) {
                    a500Var.f67590E = false;
                    a500.this.f67603i.setVisibility(8);
                } else {
                    a500Var.f67590E = true;
                    a500.this.f67603i.setVisibility(0);
                }
            }
            super.mo43913g(webView, str, bitmap);
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: l */
        public void mo95004l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super.mo95004l(webView, renderProcessGoneDetail);
            a500 a500Var = a500.this;
            if (a500Var.f67601g == webView) {
                a500Var.f67594I.set(true);
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: m */
        public WebResourceResponse mo95005m(WebView webView, String str) {
            WebResourceResponse webResourceResponseM94982L = a500.this.m94982L(webView, str);
            return NullChecker.m81303a(webResourceResponseM94982L) ? webResourceResponseM94982L : super.mo95005m(webView, str);
        }
    }

    public a500(PutongAct putongAct) {
        this.f67599e = putongAct;
    }

    /* JADX INFO: renamed from: C */
    private void m94958C() {
        if (this.f67619y) {
            this.f67599e.getWindow().addFlags(Integer.MIN_VALUE);
            this.f67599e.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            this.f67599e.getWindow().setStatusBarColor(0);
            this.f67599e.setLightStatusBar(1296);
            this.f67599e.setStatusBarColor(0);
            PutongAct.FlymeSetStatusBarLightMode(this.f67599e.getWindow(), true);
            PutongAct.MIUISetStatusBarLightMode(this.f67599e.getWindow(), true);
            if (NullChecker.m81303a(this.f67599e.getSupportActionBar())) {
                this.f67599e.getSupportActionBar().mo134111A(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m94959G() {
        if (TextUtils.isEmpty(this.f67618x)) {
            return;
        }
        if (this.f67618x.equalsIgnoreCase("transparent")) {
            this.f67599e.getWindow().setStatusBarColor(0);
            return;
        }
        boolean zStartsWith = this.f67618x.startsWith("#");
        String str = this.f67618x;
        if (!zStartsWith) {
            str = "#" + str;
        }
        try {
            this.f67599e.getWindow().setStatusBarColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    private void m94960I() {
        MkProgressView mkProgressView = (MkProgressView) this.f67599e.getLayoutInflater().inflate(e6c0.f89522D, (ViewGroup) null);
        this.f67602h = mkProgressView;
        this.f67597c.addView(mkProgressView);
        MkProgressView mkProgressView2 = this.f67602h;
        this.f67603i = mkProgressView2.f54795a;
        this.f67604j = mkProgressView2.f54796b;
        this.f67605k = mkProgressView2.f54797c;
        this.f67606l = mkProgressView2.f54798d;
    }

    /* JADX INFO: renamed from: K */
    private void m94961K() {
        int color = 0;
        if (TextUtils.isEmpty(this.f67617w)) {
            this.f67601g.getSettings().setCacheMode(-1);
            this.f67601g.clearCache(false);
            return;
        }
        if (!this.f67617w.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f67617w.startsWith("#");
            String str = this.f67617w;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f67601g.getSettings().setCacheMode(-1);
                this.f67601g.clearCache(false);
                return;
            }
        }
        this.f67601g.setBackgroundColor(color);
        this.f67601g.getSettings().setCacheMode(2);
        this.f67601g.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m94962P(View view) {
        this.f67599e.onHomePressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m94963Q(String str, String str2, String str3, String str4, long j) {
        m94975x(str);
    }

    /* JADX INFO: renamed from: x */
    private void m94975x(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        this.f67599e.startActivity(intent);
    }

    /* JADX INFO: renamed from: A */
    public void m94976A() {
        this.f67601g.goBack();
    }

    /* JADX INFO: renamed from: B */
    public void m94977B() {
        cll cllVarM107501r = cll.m107501r(m95000y());
        if (cllVarM107501r != null && TextUtils.equals("1", cllVarM107501r.m107507A("useToken")) && jkp0.m141904d(m95000y())) {
            act().duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.y400
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195886a.m94984N((AuthData) obj);
                }
            }, new e30() { // from class: l.z400
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201433a.m94985O((Throwable) obj);
                }
            }));
        } else {
            this.f67600f.m139034A(this.f67599e, "", this.f67601g, m95000y());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f67599e;
    }

    /* JADX INFO: renamed from: E */
    public void mo94978E() {
        this.f67591F = System.currentTimeMillis();
        this.f67600f = new izb();
        if (mei.m154218x() > 0) {
            ihw ihwVar = ihw.INSTANCE;
            PutongAct putongAct = this.f67599e;
            MKWebView mKWebViewM136322s = ihwVar.m136322s(putongAct, this.f67608n, putongAct.getIntent());
            this.f67601g = mKWebViewM136322s;
            if (mKWebViewM136322s == null) {
                PutongAct putongAct2 = this.f67599e;
                this.f67601g = new MKWebView(putongAct2, cow.m108032a(putongAct2.getIntent(), this.f67608n));
            } else if (!TextUtils.isEmpty(this.f67608n) && !TextUtils.isEmpty(this.f67617w) && this.f67617w.equalsIgnoreCase("transparent")) {
                this.f67601g.setBackgroundColor(0);
            }
        } else {
            PutongAct putongAct3 = this.f67599e;
            this.f67601g = new MKWebView(putongAct3, cow.m108032a(putongAct3.getIntent(), this.f67608n));
        }
        if (this.f67601g.getParent() == null) {
            this.f67597c.addView(this.f67601g);
            m94960I();
        }
        this.f67601g.setMKPreLoadingUrlProcessor(new C15529a());
        this.f67600f.m87118q(this.f67599e, this.f67601g);
        this.f67601g.setWebUserAgent(shw.m184291k());
        this.f67601g.getSettings().setMixedContentMode(0);
        this.f67601g.setLayerType(2, null);
    }

    /* JADX INFO: renamed from: F */
    public void mo94979F() {
        this.f67596b.setLeftIconResource(u2c0.f173386n);
        this.f67596b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.w400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184468a.m94962P(view);
            }
        });
        if (m94996s()) {
            this.f67596b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m94980H() {
        if (TextUtils.isEmpty(this.f67586A)) {
            return;
        }
        gkp0.m126668c(this.f67599e, this.f67586A.equals("black"));
    }

    @SuppressLint({"JavascriptInterface"})
    /* JADX INFO: renamed from: J */
    public void mo94981J() {
        if (TextUtils.isEmpty(m95000y())) {
            return;
        }
        this.f67600f.m87120x(new MKWebViewHelper.InterfaceC14920a() { // from class: l.v400
            @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.InterfaceC14920a
            /* JADX INFO: renamed from: a */
            public final void mo87121a(MKWebView mKWebView) {
                this.f179873a.m94986R(mKWebView);
            }
        });
        if (this.f67613s && !this.f67600f.m139035B()) {
            m94977B();
        }
        if (this.f67610p && this.f67599e.getSupportActionBar() != null) {
            this.f67599e.getSupportActionBar().mo134126m();
        }
        m94961K();
        m94959G();
        m94958C();
        m94980H();
        this.f67601g.setMKWebLoadListener(mo95001z());
        this.f67592G = System.currentTimeMillis();
        this.f67601g.loadUrl(m95000y());
    }

    /* JADX INFO: renamed from: L */
    public WebResourceResponse m94982L(WebView webView, String str) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public boolean m94983M() {
        return this.f67614t;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m94984N(AuthData authData) {
        boolean zM139035B = this.f67600f.m139035B();
        izb izbVar = this.f67600f;
        if (zM139035B) {
            izbVar.m139036D(authData.accessToken);
        } else {
            izbVar.m139034A(this.f67599e, authData.accessToken, this.f67601g, m95000y());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m94985O(Throwable th) {
        if (this.f67600f.m139035B()) {
            return;
        }
        this.f67600f.m139034A(this.f67599e, "", this.f67601g, m95000y());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m94986R(MKWebView mKWebView) {
        if (this.f67615u) {
            mKWebView.getSettings().setUserAgentString(null);
            mKWebView.setDownloadListener(new DownloadListener() { // from class: l.x400
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    this.f190933a.m94963Q(str, str2, str3, str4, j);
                }
            });
        }
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(this.f67612r);
        mKWebView.getSettings().setTextZoom(100);
        if (this.f67589D) {
            mKWebView.getSettings().setLoadWithOverviewMode(true);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m94987S() {
        this.f67600f.mo87116m();
    }

    /* JADX INFO: renamed from: T */
    public void m94988T() {
        m94997u();
        this.f67600f.mo87117n();
    }

    /* JADX INFO: renamed from: U */
    public void m94989U(Bundle bundle) {
        this.f67607m = this.f67599e.getIntent().getStringExtra("title");
        this.f67609o = this.f67599e.getIntent().getStringExtra("extra_custom_data");
        this.f67608n = this.f67599e.getIntent().getStringExtra("url");
        this.f67620z = this.f67599e.getIntent().getBooleanExtra("needParseUrl", false);
        Uri uri = NullChecker.m81303a(this.f67608n) ? Uri.parse(this.f67608n) : null;
        this.f67610p = alp0.m97412b(this.f67599e.getIntent(), uri, "hideNavigationBar", this.f67620z, false);
        this.f67611q = alp0.m97412b(this.f67599e.getIntent(), uri, "hardwareAccelerated", this.f67620z, false);
        this.f67612r = alp0.m97412b(this.f67599e.getIntent(), uri, "playbackRequiresUserGesture", this.f67620z, true);
        this.f67613s = alp0.m97412b(this.f67599e.getIntent(), uri, "advanceInitJsBridge", this.f67620z, true);
        this.f67614t = alp0.m97412b(this.f67599e.getIntent(), uri, "transparent_status_bar", this.f67620z, false);
        this.f67615u = alp0.m97412b(this.f67599e.getIntent(), uri, "AD_WebView", this.f67620z, false);
        this.f67616v = alp0.m97412b(this.f67599e.getIntent(), uri, "skipLoading", this.f67620z, false);
        this.f67617w = alp0.m97411a(this.f67599e.getIntent(), uri, "webviewColor", this.f67620z, null);
        this.f67618x = alp0.m97411a(this.f67599e.getIntent(), uri, "notchColor", this.f67620z, null);
        this.f67619y = alp0.m97412b(this.f67599e.getIntent(), uri, "hideNotch", this.f67620z, false);
        boolean zM97412b = alp0.m97412b(this.f67599e.getIntent(), uri, "swipeBack", this.f67620z, true);
        this.f67589D = alp0.m97412b(this.f67599e.getIntent(), uri, "autofill", this.f67620z, false);
        this.f67586A = alp0.m97411a(this.f67599e.getIntent(), uri, "notchTextColor", true, "");
        if (zM97412b) {
            return;
        }
        this.f67599e.setSwipeBackEnable(zM97412b);
    }

    /* JADX INFO: renamed from: V */
    public final void m94990V(boolean z, boolean z2) {
        CrashHelper.m81296c(new Exception("recordReloadRecycleWeb,isTryRecycleWeb:" + z + " isTryDeleteWeb:" + z2));
    }

    /* JADX INFO: renamed from: W */
    public void m94991W(String str, HashMap<String, String> map) {
        if (NullChecker.m81303a(this.f67609o)) {
            map.put("tracker", this.f67609o);
        }
        zvf0.m220371D("e_intl_android_web_vue", "p_intl_android_web_vue", vwb.m200311Y("url", str), vwb.m200311Y(CommandMessage.PARAMS, map));
    }

    /* JADX INFO: renamed from: X */
    public void m94992X() {
        if (TextUtils.isEmpty(this.f67607m)) {
            return;
        }
        act().setTitle(this.f67607m);
        this.f67596b.setTitle(this.f67607m);
    }

    @Override // p149l.s7m
    public void destroy() {
        m94999w();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m94993n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m94993n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b500.m100305b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f67599e;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f67598d = p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m94996s() {
        return this.f67610p;
    }

    /* JADX INFO: renamed from: u */
    public final void m94997u() {
        FrameLayout frameLayout;
        boolean z;
        try {
            if (this.f67594I.get()) {
                boolean z2 = false;
                this.f67594I.set(false);
                if (this.f67593H.getAndIncrement() >= 3 || (frameLayout = this.f67597c) == null) {
                    return;
                }
                int childCount = frameLayout.getChildCount();
                if (childCount > 0) {
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f67597c.getChildAt(i);
                        MKWebView mKWebView = this.f67601g;
                        if (mKWebView != null && childAt == mKWebView) {
                            this.f67597c.removeView(childAt);
                            z = true;
                            if (!this.f67601g.m87087q0()) {
                                this.f67601g.destroy();
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                this.f67601g = null;
                this.f67600f = null;
                this.f67598d.m191669g0();
                m94990V(z2, z);
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m94998v() {
        return this.f67601g.canGoBack() && !this.f67601g.getUrl().equals(sw3.EMPTY_PAGE);
    }

    /* JADX INFO: renamed from: w */
    public void m94999w() {
        this.f67600f.m139039y();
        if (NullChecker.m81303a(this.f67601g)) {
            this.f67601g.removeAllViews();
            this.f67597c.removeAllViews();
            this.f67601g.setTag(null);
            this.f67601g.clearHistory();
        }
    }

    /* JADX INFO: renamed from: y */
    public String m95000y() {
        return this.f67608n;
    }

    /* JADX INFO: renamed from: z */
    public MKWebViewHelper.C14921b mo95001z() {
        return new C15530b(this.f67600f);
    }
}
