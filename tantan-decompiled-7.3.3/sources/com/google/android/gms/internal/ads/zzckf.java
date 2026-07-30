package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ahs0;
import p153l.bkt0;
import p153l.bqs0;
import p153l.bxy0;
import p153l.chs0;
import p153l.d2v0;
import p153l.d9y0;
import p153l.dct0;
import p153l.ecs0;
import p153l.eks0;
import p153l.far0;
import p153l.fcs0;
import p153l.gjt0;
import p153l.gkt0;
import p153l.hfw0;
import p153l.hhs0;
import p153l.his0;
import p153l.hpr;
import p153l.ihs0;
import p153l.jas0;
import p153l.k6s0;
import p153l.khs0;
import p153l.nas0;
import p153l.njt0;
import p153l.nkt0;
import p153l.not0;
import p153l.obt0;
import p153l.oct0;
import p153l.okt0;
import p153l.pks0;
import p153l.pvw0;
import p153l.q6w0;
import p153l.qet0;
import p153l.qft0;
import p153l.rqu0;
import p153l.s0t0;
import p153l.s7w0;
import p153l.sgs0;
import p153l.t6w0;
import p153l.tfs0;
import p153l.ugt0;
import p153l.v2s0;
import p153l.wit0;
import p153l.x6s0;
import p153l.xkt0;
import p153l.yds0;
import p153l.yjt0;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzckf extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, wit0 {

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ int f10211k0 = 0;

    /* JADX INFO: renamed from: A */
    public boolean f10212A;

    /* JADX INFO: renamed from: B */
    public boolean f10213B;

    /* JADX INFO: renamed from: C */
    public pks0 f10214C;

    /* JADX INFO: renamed from: D */
    public eks0 f10215D;

    /* JADX INFO: renamed from: E */
    public nas0 f10216E;

    /* JADX INFO: renamed from: F */
    public int f10217F;

    /* JADX INFO: renamed from: G */
    public int f10218G;

    /* JADX INFO: renamed from: H */
    public hhs0 f10219H;

    /* JADX INFO: renamed from: I */
    public final hhs0 f10220I;

    /* JADX INFO: renamed from: J */
    public hhs0 f10221J;

    /* JADX INFO: renamed from: K */
    public final ihs0 f10222K;

    /* JADX INFO: renamed from: L */
    public int f10223L;

    /* JADX INFO: renamed from: M */
    public BinderC2096b f10224M;

    /* JADX INFO: renamed from: N */
    public boolean f10225N;

    /* JADX INFO: renamed from: O */
    public final not0 f10226O;

    /* JADX INFO: renamed from: P */
    public int f10227P;

    /* JADX INFO: renamed from: Q */
    public int f10228Q;

    /* JADX INFO: renamed from: R */
    public int f10229R;

    /* JADX INFO: renamed from: S */
    public int f10230S;

    /* JADX INFO: renamed from: T */
    public Map f10231T;

    /* JADX INFO: renamed from: U */
    public final WindowManager f10232U;

    /* JADX INFO: renamed from: V */
    public final fcs0 f10233V;

    /* JADX INFO: renamed from: W */
    public boolean f10234W;

    /* JADX INFO: renamed from: a */
    public final okt0 f10235a;

    /* JADX INFO: renamed from: b */
    public final v2s0 f10236b;

    /* JADX INFO: renamed from: c */
    public final s7w0 f10237c;

    /* JADX INFO: renamed from: d */
    public final his0 f10238d;

    /* JADX INFO: renamed from: e */
    public final zzcei f10239e;

    /* JADX INFO: renamed from: f */
    public d9y0 f10240f;

    /* JADX INFO: renamed from: g */
    public final far0 f10241g;

    /* JADX INFO: renamed from: h */
    public final DisplayMetrics f10242h;

    /* JADX INFO: renamed from: i */
    public final float f10243i;

    /* JADX INFO: renamed from: j */
    public q6w0 f10244j;

    /* JADX INFO: renamed from: k */
    public t6w0 f10245k;

    /* JADX INFO: renamed from: l */
    public boolean f10246l;

    /* JADX INFO: renamed from: m */
    public boolean f10247m;

    /* JADX INFO: renamed from: n */
    public gjt0 f10248n;

    /* JADX INFO: renamed from: o */
    public BinderC2096b f10249o;

    /* JADX INFO: renamed from: p */
    public hfw0 f10250p;

    /* JADX INFO: renamed from: q */
    public xkt0 f10251q;

    /* JADX INFO: renamed from: r */
    public final String f10252r;

    /* JADX INFO: renamed from: s */
    public boolean f10253s;

    /* JADX INFO: renamed from: t */
    public boolean f10254t;

    /* JADX INFO: renamed from: u */
    public boolean f10255u;

    /* JADX INFO: renamed from: v */
    public boolean f10256v;

    /* JADX INFO: renamed from: w */
    public Boolean f10257w;

    /* JADX INFO: renamed from: x */
    public boolean f10258x;

    /* JADX INFO: renamed from: y */
    public final String f10259y;

    /* JADX INFO: renamed from: z */
    public yjt0 f10260z;

    @VisibleForTesting
    public zzckf(okt0 okt0Var, xkt0 xkt0Var, String str, boolean z, boolean z2, v2s0 v2s0Var, his0 his0Var, zzcei zzceiVar, khs0 khs0Var, d9y0 d9y0Var, far0 far0Var, fcs0 fcs0Var, q6w0 q6w0Var, t6w0 t6w0Var, s7w0 s7w0Var) {
        t6w0 t6w0Var2;
        super(okt0Var);
        this.f10246l = false;
        this.f10247m = false;
        this.f10258x = true;
        this.f10259y = "";
        this.f10227P = -1;
        this.f10228Q = -1;
        this.f10229R = -1;
        this.f10230S = -1;
        this.f10235a = okt0Var;
        this.f10251q = xkt0Var;
        this.f10252r = str;
        this.f10255u = z;
        this.f10236b = v2s0Var;
        this.f10237c = s7w0Var;
        this.f10238d = his0Var;
        this.f10239e = zzceiVar;
        this.f10240f = d9y0Var;
        this.f10241g = far0Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        this.f10232U = windowManager;
        bxy0.m106934r();
        DisplayMetrics displayMetricsM12354U = C2098b.m12354U(windowManager);
        this.f10242h = displayMetricsM12354U;
        this.f10243i = displayMetricsM12354U.density;
        this.f10233V = fcs0Var;
        this.f10244j = q6w0Var;
        this.f10245k = t6w0Var;
        this.f10226O = new not0(okt0Var.m168051a(), this, this, null);
        this.f10234W = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            dct0.m115296e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168226Za)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(bxy0.m106934r().m12389E(okt0Var, zzceiVar.zza));
        bxy0.m106934r();
        final Context context = getContext();
        qft0.m176409a(context, new Callable() { // from class: l.r3y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ukw0 ukw0Var = C2098b.f9751l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168036K0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        m13789L0();
        addJavascriptInterface(new C2225n1(this, new bkt0(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m13797T0();
        ihs0 ihs0Var = new ihs0(new khs0(true, "make_wv", this.f10252r));
        this.f10222K = ihs0Var;
        ihs0Var.m140032a().m149820c(null);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() && (t6w0Var2 = this.f10245k) != null && t6w0Var2.f172368b != null) {
            ihs0Var.m140032a().m149821d("gqi", this.f10245k.f172368b);
        }
        ihs0Var.m140032a();
        hhs0 hhs0VarM149817f = khs0.m149817f();
        this.f10220I = hhs0VarM149817f;
        ihs0Var.m140033b("native:view_create", hhs0VarM149817f);
        this.f10221J = null;
        this.f10219H = null;
        njt0.m163465a().m163466b(okt0Var);
        bxy0.m106933q().m120272t();
    }

    /* JADX INFO: renamed from: B0 */
    public final gjt0 m13781B0() {
        return this.f10248n;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: C */
    public final synchronized void mo13706C(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC2096b binderC2096b = this.f10249o;
        if (binderC2096b != null) {
            binderC2096b.m12326q8(z);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: C0 */
    public final synchronized Boolean m13782C0() {
        return this.f10257w;
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: D */
    public final synchronized void mo13707D(int i) {
        this.f10223L = i;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: E */
    public final void mo13708E(boolean z) {
        this.f10234W = true;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: F */
    public final synchronized void mo13709F(pks0 pks0Var) {
        this.f10214C = pks0Var;
    }

    /* JADX INFO: renamed from: F0 */
    public final synchronized void m13783F0(String str, ValueCallback valueCallback) {
        if (mo13724V()) {
            dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo13710G(xkt0 xkt0Var) {
        this.f10251q = xkt0Var;
        requestLayout();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m13784G0(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            m13786I0("javascript:".concat(str));
            return;
        }
        if (m13782C0() == null) {
            m13798U0();
        }
        if (m13782C0().booleanValue()) {
            m13783F0(str, null);
        } else {
            m13786I0("javascript:".concat(str));
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: H */
    public final synchronized void mo13711H(BinderC2096b binderC2096b) {
        this.f10224M = binderC2096b;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m13785H0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: I */
    public final synchronized pks0 mo13712I() {
        return this.f10214C;
    }

    /* JADX INFO: renamed from: I0 */
    public final synchronized void m13786I0(String str) {
        if (mo13724V()) {
            dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: J */
    public final boolean mo13713J(final boolean z, final int i) {
        destroy();
        this.f10233V.m125046b(new ecs0() { // from class: com.google.android.gms.internal.ads.k1
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                int i2 = zzckf.f10211k0;
                tfs0 tfs0VarM12738L = C2161f1.m12738L();
                boolean zM190982s = tfs0VarM12738L.m190982s();
                boolean z2 = z;
                if (zM190982s != z2) {
                    tfs0VarM12738L.m190980q(z2);
                }
                tfs0VarM12738L.m190981r(i);
                yds0Var.m215289z((C2161f1) tfs0VarM12738L.m185950m());
            }
        });
        this.f10233V.m125047c(10003);
        return true;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: J0 */
    public final void m13787J0(Boolean bool) {
        synchronized (this) {
            this.f10257w = bool;
        }
        bxy0.m106933q().m120276x(bool);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: K */
    public final void mo13714K(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put(BLiveOperationTitleShowType.duration, Long.toString(j));
        mo13728Z("onCacheAccessComplete", map);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m13788K0() {
        int i;
        int iM167047x;
        if (this.f10248n.zzL() || this.f10248n.zzM()) {
            k6s0.m148569b();
            DisplayMetrics displayMetrics = this.f10242h;
            int iM167047x2 = obt0.m167047x(displayMetrics, displayMetrics.widthPixels);
            k6s0.m148569b();
            DisplayMetrics displayMetrics2 = this.f10242h;
            int iM167047x3 = obt0.m167047x(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityM168051a = this.f10235a.m168051a();
            if (activityM168051a == null || activityM168051a.getWindow() == null) {
                i = iM167047x2;
                iM167047x = iM167047x3;
            } else {
                bxy0.m106934r();
                int[] iArrM12377p = C2098b.m12377p(activityM168051a);
                k6s0.m148569b();
                int iM167047x4 = obt0.m167047x(this.f10242h, iArrM12377p[0]);
                k6s0.m148569b();
                iM167047x = obt0.m167047x(this.f10242h, iArrM12377p[1]);
                i = iM167047x4;
            }
            int i2 = this.f10228Q;
            if (i2 != iM167047x2 || this.f10227P != iM167047x3 || this.f10229R != i || this.f10230S != iM167047x) {
                boolean z = (i2 == iM167047x2 && this.f10227P == iM167047x3) ? false : true;
                this.f10228Q = iM167047x2;
                this.f10227P = iM167047x3;
                this.f10229R = i;
                this.f10230S = iM167047x;
                new s0t0(this, "").m183981e(iM167047x2, iM167047x3, i, iM167047x, this.f10242h.density, this.f10232U.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: L */
    public final WebView mo13715L() {
        return this;
    }

    /* JADX INFO: renamed from: L0 */
    public final synchronized void m13789L0() {
        q6w0 q6w0Var = this.f10244j;
        if (q6w0Var != null && q6w0Var.f155900n0) {
            dct0.m115293b("Disabling hardware acceleration on an overlay.");
            m13791N0();
            return;
        }
        if (!this.f10255u && !this.f10251q.m211423i()) {
            dct0.m115293b("Enabling hardware acceleration on an AdView.");
            m13793P0();
            return;
        }
        dct0.m115293b("Enabling hardware acceleration on an overlay.");
        m13793P0();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: M */
    public final Context mo13716M() {
        return this.f10235a.m168052b();
    }

    /* JADX INFO: renamed from: M0 */
    public final synchronized void m13790M0() {
        if (this.f10225N) {
            return;
        }
        this.f10225N = true;
        bxy0.m106933q().m120270r();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: N */
    public final void mo13717N(q6w0 q6w0Var, t6w0 t6w0Var) {
        this.f10244j = q6w0Var;
        this.f10245k = t6w0Var;
    }

    /* JADX INFO: renamed from: N0 */
    public final synchronized void m13791N0() {
        try {
            if (!this.f10256v) {
                setLayerType(1, null);
            }
            this.f10256v = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m13792O0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        mo13728Z("onAdVisibilityChanged", map);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: P */
    public final synchronized ugt0 mo13718P(String str) {
        Map map = this.f10231T;
        if (map == null) {
            return null;
        }
        return (ugt0) map.get(str);
    }

    /* JADX INFO: renamed from: P0 */
    public final synchronized void m13793P0() {
        try {
            if (this.f10256v) {
                setLayerType(0, null);
            }
            this.f10256v = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: Q */
    public final void mo13719Q(String str, bqs0 bqs0Var) {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.zzI(str, bqs0Var);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final synchronized void m13794Q0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            bxy0.m106933q().m120275w(th, "AdWebViewImpl.loadUrlUnsafe");
            dct0.m115299h("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: R */
    public final void mo13720R(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f10248n.zzz(z, i, str, z2, z3);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m13795R0() {
        chs0.m109843a(this.f10222K.m140032a(), this.f10220I, "aeh2");
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: S */
    public final void mo13721S(zzc zzcVar, boolean z) {
        this.f10248n.zzu(zzcVar, z);
    }

    /* JADX INFO: renamed from: S0 */
    public final synchronized void m13796S0() {
        try {
            Map map = this.f10231T;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ugt0) it.next()).release();
                }
            }
            this.f10231T = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: T */
    public final hpr mo13722T() {
        his0 his0Var = this.f10238d;
        return his0Var == null ? pvw0.m173981h(null) : his0Var.m135135a();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m13797T0() {
        ihs0 ihs0Var = this.f10222K;
        if (ihs0Var == null) {
            return;
        }
        khs0 khs0VarM140032a = ihs0Var.m140032a();
        ahs0 ahs0VarM120262g = bxy0.m106933q().m120262g();
        if (ahs0VarM120262g != null) {
            ahs0VarM120262g.m97916f(khs0VarM140032a);
        }
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        boolean z;
        synchronized (this) {
            z = x6s0Var.f192630j;
            this.f10212A = z;
        }
        m13792O0(z);
    }

    /* JADX INFO: renamed from: U0 */
    public final synchronized void m13798U0() {
        Boolean boolM120266l = bxy0.m106933q().m120266l();
        this.f10257w = boolM120266l;
        if (boolM120266l == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m13787J0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m13787J0(Boolean.FALSE);
            }
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: V */
    public final synchronized boolean mo13724V() {
        return this.f10254t;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: W */
    public final synchronized void mo13725W(hfw0 hfw0Var) {
        this.f10250p = hfw0Var;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: X */
    public final synchronized void mo13726X(BinderC2096b binderC2096b) {
        this.f10249o = binderC2096b;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: Y */
    public final synchronized boolean mo13727Y() {
        return this.f10258x;
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: Z */
    public final void mo13728Z(String str, Map map) {
        try {
            mo13759q(str, k6s0.m148569b().m167056k(map));
        } catch (JSONException unused) {
            dct0.m115298g("Could not convert parameters to JSON.");
        }
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: a */
    public final synchronized yjt0 mo13729a() {
        return this.f10260z;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: a0 */
    public final synchronized boolean mo13730a0() {
        return this.f10255u;
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: b */
    public final void mo13731b(String str, String str2) {
        m13784G0(str + "(" + str2 + ");");
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: b0 */
    public final void mo13732b0(boolean z) {
        this.f10248n.zzi(z);
    }

    @Override // p153l.wit0, p153l.nit0
    /* JADX INFO: renamed from: c */
    public final q6w0 mo13733c() {
        return this.f10244j;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: c0 */
    public final boolean mo13734c0() {
        return false;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: d */
    public final synchronized nas0 mo13735d() {
        return this.f10216E;
    }

    @Override // p153l.d9y0
    /* JADX INFO: renamed from: d0 */
    public final synchronized void mo13736d0() {
        d9y0 d9y0Var = this.f10240f;
        if (d9y0Var != null) {
            d9y0Var.mo13736d0();
        }
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final synchronized void destroy() {
        try {
            m13797T0();
            this.f10226O.m164189a();
            BinderC2096b binderC2096b = this.f10249o;
            if (binderC2096b != null) {
                binderC2096b.zzb();
                this.f10249o.zzm();
                this.f10249o = null;
            }
            this.f10250p = null;
            this.f10248n.zzh();
            this.f10216E = null;
            this.f10240f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f10254t) {
                return;
            }
            bxy0.m106915A().m163010g(this);
            m13796S0();
            this.f10254t = true;
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168407na)).booleanValue()) {
                d2v0.m113737k("Destroying the WebView immediately...");
                zzV();
            } else {
                d2v0.m113737k("Initiating WebView self destruct sequence in 3...");
                d2v0.m113737k("Loading blank page in WebView, 2...");
                m13794Q0("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: e */
    public final synchronized String mo13737e() {
        return this.f10252r;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: e0 */
    public final void mo13738e0(int i) {
        if (i == 0) {
            ihs0 ihs0Var = this.f10222K;
            chs0.m109843a(ihs0Var.m140032a(), this.f10220I, "aebb2");
        }
        m13795R0();
        this.f10222K.m140032a();
        this.f10222K.m140032a().m149821d("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10239e.zza);
        mo13728Z("onhide", map);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (mo13724V()) {
            dct0.m115300i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168420oa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            oct0.f146737e.mo155970a(new Runnable() { // from class: com.google.android.gms.internal.ads.j1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9977a.m13785H0(str, valueCallback);
                }
            });
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: f */
    public final s7w0 mo13739f() {
        return this.f10237c;
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: f0 */
    public final void mo13740f0(int i) {
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f10254t) {
                        this.f10248n.zzh();
                        bxy0.m106915A().m163010g(this);
                        m13796S0();
                        m13790M0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo13741g(String str, ugt0 ugt0Var) {
        try {
            if (this.f10231T == null) {
                this.f10231T = new HashMap();
            }
            this.f10231T.put(str, ugt0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: g0 */
    public final void mo13742g0(Context context) {
        this.f10235a.setBaseContext(context);
        this.f10226O.m164193e(this.f10235a.m168051a());
    }

    @Override // p153l.wit0, p153l.zjt0
    /* JADX INFO: renamed from: h */
    public final t6w0 mo13743h() {
        return this.f10245k;
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: h0 */
    public final void mo13744h0(int i) {
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: i0 */
    public final synchronized void mo13745i0(boolean z) {
        BinderC2096b binderC2096b = this.f10249o;
        if (binderC2096b != null) {
            binderC2096b.m12333x8(this.f10248n.zzL(), z);
        } else {
            this.f10253s = z;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: j */
    public final synchronized boolean mo13746j() {
        return this.f10253s;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: j0 */
    public final void mo13747j0(String str, bqs0 bqs0Var) {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.zzA(str, bqs0Var);
        }
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: k */
    public final synchronized void mo13748k() {
        eks0 eks0Var = this.f10215D;
        if (eks0Var != null) {
            final rqu0 rqu0Var = (rqu0) eks0Var;
            C2098b.f9751l.post(new Runnable() { // from class: l.kqu0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        rqu0Var.zzd();
                    } catch (RemoteException e) {
                        dct0.m115300i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: l */
    public final void mo13749l() {
        if (this.f10221J == null) {
            this.f10222K.m140032a();
            hhs0 hhs0VarM149817f = khs0.m149817f();
            this.f10221J = hhs0VarM149817f;
            this.f10222K.m140033b("native:view_load", hhs0VarM149817f);
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: l0 */
    public final synchronized void mo13750l0(nas0 nas0Var) {
        this.f10216E = nas0Var;
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo13724V()) {
            dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo13724V()) {
            dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final synchronized void loadUrl(String str) {
        if (mo13724V()) {
            dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            bxy0.m106933q().m120275w(th, "AdWebViewImpl.loadUrl");
            dct0.m115299h("Could not call loadUrl. ", th);
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: m */
    public final void mo13751m() {
        this.f10226O.m164190b();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: m0 */
    public final synchronized void mo13752m0(boolean z) {
        this.f10258x = z;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: n */
    public final synchronized hfw0 mo13753n() {
        return this.f10250p;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: n0 */
    public final void mo13754n0() {
        if (this.f10219H == null) {
            ihs0 ihs0Var = this.f10222K;
            chs0.m109843a(ihs0Var.m140032a(), this.f10220I, "aes2");
            this.f10222K.m140032a();
            hhs0 hhs0VarM149817f = khs0.m149817f();
            this.f10219H = hhs0VarM149817f;
            this.f10222K.m140033b("native:view_show", hhs0VarM149817f);
        }
        HashMap map = new HashMap(1);
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10239e.zza);
        mo13728Z("onshow", map);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: o */
    public final WebViewClient mo13755o() {
        return this.f10248n;
    }

    @Override // p153l.d9y0
    /* JADX INFO: renamed from: o0 */
    public final synchronized void mo13756o0() {
        d9y0 d9y0Var = this.f10240f;
        if (d9y0Var != null) {
            d9y0Var.mo13756o0();
        }
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!mo13724V()) {
                this.f10226O.m164191c();
            }
            if (this.f10234W) {
                onResume();
                this.f10234W = false;
            }
            boolean z = this.f10212A;
            gjt0 gjt0Var = this.f10248n;
            if (gjt0Var != null && gjt0Var.zzM()) {
                if (!this.f10213B) {
                    this.f10248n.zza();
                    this.f10248n.zzb();
                    this.f10213B = true;
                }
                m13788K0();
                z = true;
            }
            m13792O0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        gjt0 gjt0Var;
        synchronized (this) {
            try {
                if (!mo13724V()) {
                    this.f10226O.m164192d();
                }
                super.onDetachedFromWindow();
                if (this.f10213B && (gjt0Var = this.f10248n) != null && gjt0Var.zzM() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f10248n.zza();
                    this.f10248n.zzb();
                    this.f10213B = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m13792O0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168556za)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            bxy0.m106934r();
            C2098b.m12380s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            dct0.m115293b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            bxy0.m106933q().m120275w(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (mo13724V()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zM13788K0 = m13788K0();
        BinderC2096b binderC2096bZzL = zzL();
        if (binderC2096bZzL == null || !zM13788K0) {
            return;
        }
        binderC2096bZzL.zzn();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:11:0x0012, B:13:0x0018, B:15:0x001c, B:18:0x0026, B:20:0x002e, B:23:0x0033, B:25:0x003b, B:27:0x004d, B:30:0x0052, B:32:0x0059, B:36:0x0063, B:39:0x0068, B:42:0x0079, B:50:0x0091, B:44:0x0080, B:47:0x0085, B:53:0x009e, B:55:0x00a6, B:57:0x00b8, B:60:0x00bd, B:62:0x00d9, B:64:0x00e1, B:63:0x00dd, B:67:0x00e6, B:69:0x00ee, B:72:0x00f9, B:81:0x011d, B:83:0x0124, B:87:0x012b, B:89:0x013d, B:91:0x014b, B:95:0x0158, B:98:0x015d, B:100:0x01a3, B:101:0x01a7, B:103:0x01ae, B:108:0x01bb, B:110:0x01c1, B:111:0x01c4, B:113:0x01c8, B:114:0x01d1, B:117:0x01dc), top: B:122:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (mo13724V()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f10255u && !this.f10251q.m211420f()) {
            if (this.f10251q.m211422h()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.f10251q.m211424j()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168027J3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                yjt0 yjt0VarMo13729a = mo13729a();
                float fZze = yjt0VarMo13729a != null ? yjt0VarMo13729a.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * fZze;
                int i7 = (int) (size / fZze);
                if (size2 != 0) {
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                } else if (i7 != 0) {
                    i5 = (int) (i7 * fZze);
                    i6 = size;
                    i4 = i7;
                } else {
                    size2 = 0;
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                }
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            }
            if (this.f10251q.m211421g()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168111Q3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                mo13747j0("/contentHeight", new C2209l1(this));
                m13784G0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.f10242h.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i8 = this.f10218G;
                setMeasuredDimension(size3, i8 != -1 ? (int) (i8 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.f10251q.m211423i()) {
                DisplayMetrics displayMetrics = this.f10242h;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i9 = size5;
            }
            xkt0 xkt0Var = this.f10251q;
            boolean z = xkt0Var.f194816c > i10 || xkt0Var.f194815b > i9;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168441q5)).booleanValue()) {
                xkt0 xkt0Var2 = this.f10251q;
                float f3 = xkt0Var2.f194816c;
                float f4 = this.f10243i;
                z &= f3 / f4 <= ((float) i10) / f4 && ((float) xkt0Var2.f194815b) / f4 <= ((float) i9) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f10247m) {
                    this.f10233V.m125047c(10002);
                    this.f10247m = true;
                }
                xkt0 xkt0Var3 = this.f10251q;
                setMeasuredDimension(xkt0Var3.f194816c, xkt0Var3.f194815b);
                return;
            }
            xkt0 xkt0Var4 = this.f10251q;
            float f5 = xkt0Var4.f194816c;
            float f6 = this.f10243i;
            dct0.m115298g("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + BaseSei.f14624X + ((int) (xkt0Var4.f194815b / f6)) + " dp, but only has " + ((int) (size4 / f6)) + BaseSei.f14624X + ((int) (size5 / f6)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.f10246l) {
                return;
            }
            this.f10233V.m125047c(10001);
            this.f10246l = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final void onPause() {
        if (mo13724V()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            dct0.m115296e("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final void onResume() {
        if (mo13724V()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            dct0.m115296e("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10248n.zzM() || this.f10248n.zzK()) {
            v2s0 v2s0Var = this.f10236b;
            if (v2s0Var != null) {
                v2s0Var.m199148d(motionEvent);
            }
            his0 his0Var = this.f10238d;
            if (his0Var != null) {
                his0Var.m135136b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    pks0 pks0Var = this.f10214C;
                    if (pks0Var != null) {
                        pks0Var.mo172764a(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (mo13724V()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // p153l.wit0, p153l.ikt0
    /* JADX INFO: renamed from: p */
    public final v2s0 mo13757p() {
        return this.f10236b;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: p0 */
    public final void mo13758p0() {
        throw null;
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: q */
    public final void mo13759q(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        dct0.m115293b("Dispatching AFMA event: ".concat(sb.toString()));
        m13784G0(sb.toString());
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: r */
    public final void mo13760r() {
        m13795R0();
        HashMap map = new HashMap(1);
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10239e.zza);
        mo13728Z("onhide", map);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: r0 */
    public final synchronized void mo13761r0(eks0 eks0Var) {
        this.f10215D = eks0Var;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: s */
    public final void mo13762s() {
        throw null;
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: s0 */
    public final synchronized String mo13763s0() {
        return this.f10259y;
    }

    @Override // android.webkit.WebView, p153l.wit0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof gjt0) {
            this.f10248n = (gjt0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo13724V()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            dct0.m115296e("Could not stop loading webview.", e);
        }
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo13764t(yjt0 yjt0Var) {
        if (this.f10260z != null) {
            dct0.m115295d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f10260z = yjt0Var;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: t0 */
    public final void mo13765t0(String str, Predicate predicate) {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.zzJ(str, predicate);
        }
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: u */
    public final void mo13766u(boolean z) {
        this.f10248n.zzD(false);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: u0 */
    public final synchronized void mo13767u0(int i) {
        BinderC2096b binderC2096b = this.f10249o;
        if (binderC2096b != null) {
            binderC2096b.m12325p8(i);
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: v */
    public final void mo13768v() {
        setBackgroundColor(0);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: v0 */
    public final void mo13769v0(boolean z, int i, boolean z2) {
        this.f10248n.zzw(z, i, z2);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: w */
    public final synchronized void mo13770w(boolean z) {
        BinderC2096b binderC2096b;
        int i = this.f10217F + (true != z ? -1 : 1);
        this.f10217F = i;
        if (i > 0 || (binderC2096b = this.f10249o) == null) {
            return;
        }
        binderC2096b.m12317M();
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: w0 */
    public final void mo13771w0(boolean z, int i, String str, String str2, boolean z2) {
        this.f10248n.zzy(z, i, str, str2, z2);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: x */
    public final void mo13772x(int i) {
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: x0 */
    public final synchronized void mo13773x0(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (mo13724V()) {
                    dct0.m115298g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) jas0.m144075c().m176505a(sgs0.f168095P);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e) {
                    dct0.m115299h("Unable to build MRAID_ENV", e);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, gkt0.m130600a(str2, str4), MimeTypes.TEXT_HTML, "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: y */
    public final synchronized BinderC2096b mo13774y() {
        return this.f10224M;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: y0 */
    public final synchronized void mo13775y0(boolean z) {
        try {
            boolean z2 = this.f10255u;
            this.f10255u = z;
            m13789L0();
            if (z != z2) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168107Q)).booleanValue()) {
                    if (!this.f10251q.m211423i()) {
                    }
                }
                new s0t0(this, "").m183983g(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: z */
    public final void mo13776z(String str, String str2, int i) {
        this.f10248n.zzv(str, str2, 14);
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: z0 */
    public final void mo13777z0(String str, JSONObject jSONObject) {
        mo13731b(str, jSONObject.toString());
    }

    @Override // p153l.wit0, p153l.kkt0
    public final View zzF() {
        return this;
    }

    @Override // p153l.wit0
    public final synchronized BinderC2096b zzL() {
        return this.f10249o;
    }

    @Override // p153l.wit0
    public final /* synthetic */ nkt0 zzN() {
        return this.f10248n;
    }

    @Override // p153l.wit0, p153l.hkt0
    public final synchronized xkt0 zzO() {
        return this.f10251q;
    }

    @Override // p153l.wit0
    public final synchronized void zzV() {
        d2v0.m113737k("Destroying WebView!");
        m13790M0();
        C2098b.f9751l.post(new RunnableC2217m1(this));
    }

    @Override // p153l.xts0
    public final void zza(String str) {
        throw null;
    }

    @Override // p153l.wit0
    public final synchronized boolean zzaz() {
        return this.f10217F > 0;
    }

    @Override // p153l.ggu0
    public final void zzbo() {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.zzbo();
        }
    }

    @Override // p153l.bft0
    public final synchronized int zzf() {
        return this.f10223L;
    }

    @Override // p153l.bft0
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // p153l.bft0
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // p153l.wit0, p153l.ckt0, p153l.bft0
    public final Activity zzi() {
        return this.f10235a.m168051a();
    }

    @Override // p153l.wit0, p153l.bft0
    public final far0 zzj() {
        return this.f10241g;
    }

    @Override // p153l.bft0
    public final hhs0 zzk() {
        return this.f10220I;
    }

    @Override // p153l.wit0, p153l.bft0
    public final ihs0 zzm() {
        return this.f10222K;
    }

    @Override // p153l.wit0, p153l.jkt0, p153l.bft0
    public final zzcei zzn() {
        return this.f10239e;
    }

    @Override // p153l.bft0
    public final qet0 zzo() {
        return null;
    }

    @Override // p153l.bft0
    public final synchronized String zzr() {
        t6w0 t6w0Var = this.f10245k;
        if (t6w0Var == null) {
            return null;
        }
        return t6w0Var.f172368b;
    }

    @Override // p153l.ggu0
    public final void zzs() {
        gjt0 gjt0Var = this.f10248n;
        if (gjt0Var != null) {
            gjt0Var.zzs();
        }
    }

    @Override // p153l.bft0
    public final void zzu() {
        BinderC2096b binderC2096bZzL = zzL();
        if (binderC2096bZzL != null) {
            binderC2096bZzL.zzd();
        }
    }
}
