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
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aat0;
import p149l.abt0;
import p149l.b6w0;
import p149l.b8s0;
import p149l.b9s0;
import p149l.c8s0;
import p149l.d1s0;
import p149l.e8s0;
import p149l.exr0;
import p149l.gnr;
import p149l.h1s0;
import p149l.hat0;
import p149l.hbt0;
import p149l.hft0;
import p149l.i2t0;
import p149l.i3t0;
import p149l.ibt0;
import p149l.jbs0;
import p149l.jmw0;
import p149l.k5t0;
import p149l.k6t0;
import p149l.kxv0;
import p149l.lhu0;
import p149l.m7s0;
import p149l.mrs0;
import p149l.myv0;
import p149l.n6s0;
import p149l.nxv0;
import p149l.o7t0;
import p149l.ptr0;
import p149l.q9t0;
import p149l.rbt0;
import p149l.rxr0;
import p149l.s4s0;
import p149l.sat0;
import p149l.u7s0;
import p149l.vat0;
import p149l.vgs0;
import p149l.vny0;
import p149l.w7s0;
import p149l.x2t0;
import p149l.xsu0;
import p149l.xzx0;
import p149l.y2s0;
import p149l.yas0;
import p149l.z0r0;
import p149l.z2s0;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzckf extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, q9t0 {

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ int f10174k0 = 0;

    /* JADX INFO: renamed from: A */
    public boolean f10175A;

    /* JADX INFO: renamed from: B */
    public boolean f10176B;

    /* JADX INFO: renamed from: C */
    public jbs0 f10177C;

    /* JADX INFO: renamed from: D */
    public yas0 f10178D;

    /* JADX INFO: renamed from: E */
    public h1s0 f10179E;

    /* JADX INFO: renamed from: F */
    public int f10180F;

    /* JADX INFO: renamed from: G */
    public int f10181G;

    /* JADX INFO: renamed from: H */
    public b8s0 f10182H;

    /* JADX INFO: renamed from: I */
    public final b8s0 f10183I;

    /* JADX INFO: renamed from: J */
    public b8s0 f10184J;

    /* JADX INFO: renamed from: K */
    public final c8s0 f10185K;

    /* JADX INFO: renamed from: L */
    public int f10186L;

    /* JADX INFO: renamed from: M */
    public BinderC2073b f10187M;

    /* JADX INFO: renamed from: N */
    public boolean f10188N;

    /* JADX INFO: renamed from: O */
    public final hft0 f10189O;

    /* JADX INFO: renamed from: P */
    public int f10190P;

    /* JADX INFO: renamed from: Q */
    public int f10191Q;

    /* JADX INFO: renamed from: R */
    public int f10192R;

    /* JADX INFO: renamed from: S */
    public int f10193S;

    /* JADX INFO: renamed from: T */
    public Map f10194T;

    /* JADX INFO: renamed from: U */
    public final WindowManager f10195U;

    /* JADX INFO: renamed from: V */
    public final z2s0 f10196V;

    /* JADX INFO: renamed from: W */
    public boolean f10197W;

    /* JADX INFO: renamed from: a */
    public final ibt0 f10198a;

    /* JADX INFO: renamed from: b */
    public final ptr0 f10199b;

    /* JADX INFO: renamed from: c */
    public final myv0 f10200c;

    /* JADX INFO: renamed from: d */
    public final b9s0 f10201d;

    /* JADX INFO: renamed from: e */
    public final zzcei f10202e;

    /* JADX INFO: renamed from: f */
    public xzx0 f10203f;

    /* JADX INFO: renamed from: g */
    public final z0r0 f10204g;

    /* JADX INFO: renamed from: h */
    public final DisplayMetrics f10205h;

    /* JADX INFO: renamed from: i */
    public final float f10206i;

    /* JADX INFO: renamed from: j */
    public kxv0 f10207j;

    /* JADX INFO: renamed from: k */
    public nxv0 f10208k;

    /* JADX INFO: renamed from: l */
    public boolean f10209l;

    /* JADX INFO: renamed from: m */
    public boolean f10210m;

    /* JADX INFO: renamed from: n */
    public aat0 f10211n;

    /* JADX INFO: renamed from: o */
    public BinderC2073b f10212o;

    /* JADX INFO: renamed from: p */
    public b6w0 f10213p;

    /* JADX INFO: renamed from: q */
    public rbt0 f10214q;

    /* JADX INFO: renamed from: r */
    public final String f10215r;

    /* JADX INFO: renamed from: s */
    public boolean f10216s;

    /* JADX INFO: renamed from: t */
    public boolean f10217t;

    /* JADX INFO: renamed from: u */
    public boolean f10218u;

    /* JADX INFO: renamed from: v */
    public boolean f10219v;

    /* JADX INFO: renamed from: w */
    public Boolean f10220w;

    /* JADX INFO: renamed from: x */
    public boolean f10221x;

    /* JADX INFO: renamed from: y */
    public final String f10222y;

    /* JADX INFO: renamed from: z */
    public sat0 f10223z;

    @VisibleForTesting
    public zzckf(ibt0 ibt0Var, rbt0 rbt0Var, String str, boolean z, boolean z2, ptr0 ptr0Var, b9s0 b9s0Var, zzcei zzceiVar, e8s0 e8s0Var, xzx0 xzx0Var, z0r0 z0r0Var, z2s0 z2s0Var, kxv0 kxv0Var, nxv0 nxv0Var, myv0 myv0Var) {
        nxv0 nxv0Var2;
        super(ibt0Var);
        this.f10209l = false;
        this.f10210m = false;
        this.f10221x = true;
        this.f10222y = "";
        this.f10190P = -1;
        this.f10191Q = -1;
        this.f10192R = -1;
        this.f10193S = -1;
        this.f10198a = ibt0Var;
        this.f10214q = rbt0Var;
        this.f10215r = str;
        this.f10218u = z;
        this.f10199b = ptr0Var;
        this.f10200c = myv0Var;
        this.f10201d = b9s0Var;
        this.f10202e = zzceiVar;
        this.f10203f = xzx0Var;
        this.f10204g = z0r0Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        this.f10195U = windowManager;
        vny0.m199080r();
        DisplayMetrics displayMetricsM12300U = C2075b.m12300U(windowManager);
        this.f10205h = displayMetricsM12300U;
        this.f10206i = displayMetricsM12300U.density;
        this.f10196V = z2s0Var;
        this.f10207j = kxv0Var;
        this.f10208k = nxv0Var;
        this.f10189O = new hft0(ibt0Var.m135270a(), this, this, null);
        this.f10197W = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            x2t0.m206867e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132155Za)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(vny0.m199080r().m12335E(ibt0Var, zzceiVar.zza));
        vny0.m199080r();
        final Context context = getContext();
        k6t0.m144630a(context, new Callable() { // from class: l.lux0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                obw0 obw0Var = C2075b.f9714l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131965K0)).booleanValue()) {
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
        m13735L0();
        addJavascriptInterface(new C2202n1(this, new vat0(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m13743T0();
        c8s0 c8s0Var = new c8s0(new e8s0(true, "make_wv", this.f10215r));
        this.f10185K = c8s0Var;
        c8s0Var.m105818a().m115281c(null);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() && (nxv0Var2 = this.f10208k) != null && nxv0Var2.f141055b != null) {
            c8s0Var.m105818a().m115282d("gqi", this.f10208k.f141055b);
        }
        c8s0Var.m105818a();
        b8s0 b8s0VarM115278f = e8s0.m115278f();
        this.f10183I = b8s0VarM115278f;
        c8s0Var.m105819b("native:view_create", b8s0VarM115278f);
        this.f10184J = null;
        this.f10182H = null;
        hat0.m130199a().m130200b(ibt0Var);
        vny0.m199079q().m212287t();
    }

    /* JADX INFO: renamed from: B0 */
    public final aat0 m13727B0() {
        return this.f10211n;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: C */
    public final synchronized void mo13652C(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC2073b binderC2073b = this.f10212o;
        if (binderC2073b != null) {
            binderC2073b.m12272q8(z);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: C0 */
    public final synchronized Boolean m13728C0() {
        return this.f10220w;
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: D */
    public final synchronized void mo13653D(int i) {
        this.f10186L = i;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: E */
    public final void mo13654E(boolean z) {
        this.f10197W = true;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: F */
    public final synchronized void mo13655F(jbs0 jbs0Var) {
        this.f10177C = jbs0Var;
    }

    /* JADX INFO: renamed from: F0 */
    public final synchronized void m13729F0(String str, ValueCallback valueCallback) {
        if (mo13670V()) {
            x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo13656G(rbt0 rbt0Var) {
        this.f10214q = rbt0Var;
        requestLayout();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m13730G0(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            m13732I0("javascript:".concat(str));
            return;
        }
        if (m13728C0() == null) {
            m13744U0();
        }
        if (m13728C0().booleanValue()) {
            m13729F0(str, null);
        } else {
            m13732I0("javascript:".concat(str));
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: H */
    public final synchronized void mo13657H(BinderC2073b binderC2073b) {
        this.f10187M = binderC2073b;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m13731H0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: I */
    public final synchronized jbs0 mo13658I() {
        return this.f10177C;
    }

    /* JADX INFO: renamed from: I0 */
    public final synchronized void m13732I0(String str) {
        if (mo13670V()) {
            x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: J */
    public final boolean mo13659J(final boolean z, final int i) {
        destroy();
        this.f10196V.m216993b(new y2s0() { // from class: com.google.android.gms.internal.ads.k1
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                int i2 = zzckf.f10174k0;
                n6s0 n6s0VarM12684L = C2138f1.m12684L();
                boolean zM158070s = n6s0VarM12684L.m158070s();
                boolean z2 = z;
                if (zM158070s != z2) {
                    n6s0VarM12684L.m158068q(z2);
                }
                n6s0VarM12684L.m158069r(i);
                s4s0Var.m182315z((C2138f1) n6s0VarM12684L.m153521m());
            }
        });
        this.f10196V.m216994c(10003);
        return true;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: J0 */
    public final void m13733J0(Boolean bool) {
        synchronized (this) {
            this.f10220w = bool;
        }
        vny0.m199079q().m212291x(bool);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: K */
    public final void mo13660K(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put(BLiveOperationTitleShowType.duration, Long.toString(j));
        mo13674Z("onCacheAccessComplete", map);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m13734K0() {
        int i;
        int iM134094x;
        if (this.f10211n.zzL() || this.f10211n.zzM()) {
            exr0.m118703b();
            DisplayMetrics displayMetrics = this.f10205h;
            int iM134094x2 = i2t0.m134094x(displayMetrics, displayMetrics.widthPixels);
            exr0.m118703b();
            DisplayMetrics displayMetrics2 = this.f10205h;
            int iM134094x3 = i2t0.m134094x(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityM135270a = this.f10198a.m135270a();
            if (activityM135270a == null || activityM135270a.getWindow() == null) {
                i = iM134094x2;
                iM134094x = iM134094x3;
            } else {
                vny0.m199080r();
                int[] iArrM12323p = C2075b.m12323p(activityM135270a);
                exr0.m118703b();
                int iM134094x4 = i2t0.m134094x(this.f10205h, iArrM12323p[0]);
                exr0.m118703b();
                iM134094x = i2t0.m134094x(this.f10205h, iArrM12323p[1]);
                i = iM134094x4;
            }
            int i2 = this.f10191Q;
            if (i2 != iM134094x2 || this.f10190P != iM134094x3 || this.f10192R != i || this.f10193S != iM134094x) {
                boolean z = (i2 == iM134094x2 && this.f10190P == iM134094x3) ? false : true;
                this.f10191Q = iM134094x2;
                this.f10190P = iM134094x3;
                this.f10192R = i;
                this.f10193S = iM134094x;
                new mrs0(this, "").m156082e(iM134094x2, iM134094x3, i, iM134094x, this.f10205h.density, this.f10195U.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: L */
    public final WebView mo13661L() {
        return this;
    }

    /* JADX INFO: renamed from: L0 */
    public final synchronized void m13735L0() {
        kxv0 kxv0Var = this.f10207j;
        if (kxv0Var != null && kxv0Var.f125210n0) {
            x2t0.m206864b("Disabling hardware acceleration on an overlay.");
            m13737N0();
            return;
        }
        if (!this.f10218u && !this.f10214q.m178700i()) {
            x2t0.m206864b("Enabling hardware acceleration on an AdView.");
            m13739P0();
            return;
        }
        x2t0.m206864b("Enabling hardware acceleration on an overlay.");
        m13739P0();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: M */
    public final Context mo13662M() {
        return this.f10198a.m135271b();
    }

    /* JADX INFO: renamed from: M0 */
    public final synchronized void m13736M0() {
        if (this.f10188N) {
            return;
        }
        this.f10188N = true;
        vny0.m199079q().m212285r();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: N */
    public final void mo13663N(kxv0 kxv0Var, nxv0 nxv0Var) {
        this.f10207j = kxv0Var;
        this.f10208k = nxv0Var;
    }

    /* JADX INFO: renamed from: N0 */
    public final synchronized void m13737N0() {
        try {
            if (!this.f10219v) {
                setLayerType(1, null);
            }
            this.f10219v = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m13738O0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        mo13674Z("onAdVisibilityChanged", map);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: P */
    public final synchronized o7t0 mo13664P(String str) {
        Map map = this.f10194T;
        if (map == null) {
            return null;
        }
        return (o7t0) map.get(str);
    }

    /* JADX INFO: renamed from: P0 */
    public final synchronized void m13739P0() {
        try {
            if (this.f10219v) {
                setLayerType(0, null);
            }
            this.f10219v = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: Q */
    public final void mo13665Q(String str, vgs0 vgs0Var) {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.zzI(str, vgs0Var);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final synchronized void m13740Q0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "AdWebViewImpl.loadUrlUnsafe");
            x2t0.m206870h("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: R */
    public final void mo13666R(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f10211n.zzz(z, i, str, z2, z3);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m13741R0() {
        w7s0.m202071a(this.f10185K.m105818a(), this.f10183I, "aeh2");
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: S */
    public final void mo13667S(zzc zzcVar, boolean z) {
        this.f10211n.zzu(zzcVar, z);
    }

    /* JADX INFO: renamed from: S0 */
    public final synchronized void m13742S0() {
        try {
            Map map = this.f10194T;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((o7t0) it.next()).release();
                }
            }
            this.f10194T = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: T */
    public final gnr mo13668T() {
        b9s0 b9s0Var = this.f10201d;
        return b9s0Var == null ? jmw0.m142235h(null) : b9s0Var.m100824a();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m13743T0() {
        c8s0 c8s0Var = this.f10185K;
        if (c8s0Var == null) {
            return;
        }
        e8s0 e8s0VarM105818a = c8s0Var.m105818a();
        u7s0 u7s0VarM212277g = vny0.m199079q().m212277g();
        if (u7s0VarM212277g != null) {
            u7s0VarM212277g.m192162f(e8s0VarM105818a);
        }
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        boolean z;
        synchronized (this) {
            z = rxr0Var.f161504j;
            this.f10175A = z;
        }
        m13738O0(z);
    }

    /* JADX INFO: renamed from: U0 */
    public final synchronized void m13744U0() {
        Boolean boolM212281l = vny0.m199079q().m212281l();
        this.f10220w = boolM212281l;
        if (boolM212281l == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m13733J0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m13733J0(Boolean.FALSE);
            }
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: V */
    public final synchronized boolean mo13670V() {
        return this.f10217t;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: W */
    public final synchronized void mo13671W(b6w0 b6w0Var) {
        this.f10213p = b6w0Var;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: X */
    public final synchronized void mo13672X(BinderC2073b binderC2073b) {
        this.f10212o = binderC2073b;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: Y */
    public final synchronized boolean mo13673Y() {
        return this.f10221x;
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: Z */
    public final void mo13674Z(String str, Map map) {
        try {
            mo13705q(str, exr0.m118703b().m134103k(map));
        } catch (JSONException unused) {
            x2t0.m206869g("Could not convert parameters to JSON.");
        }
    }

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: a */
    public final synchronized sat0 mo13675a() {
        return this.f10223z;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: a0 */
    public final synchronized boolean mo13676a0() {
        return this.f10218u;
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: b */
    public final void mo13677b(String str, String str2) {
        m13730G0(str + "(" + str2 + ");");
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: b0 */
    public final void mo13678b0(boolean z) {
        this.f10211n.zzi(z);
    }

    @Override // p149l.q9t0, p149l.h9t0
    /* JADX INFO: renamed from: c */
    public final kxv0 mo13679c() {
        return this.f10207j;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: c0 */
    public final boolean mo13680c0() {
        return false;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: d */
    public final synchronized h1s0 mo13681d() {
        return this.f10179E;
    }

    @Override // p149l.xzx0
    /* JADX INFO: renamed from: d0 */
    public final synchronized void mo13682d0() {
        xzx0 xzx0Var = this.f10203f;
        if (xzx0Var != null) {
            xzx0Var.mo13682d0();
        }
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final synchronized void destroy() {
        try {
            m13743T0();
            this.f10189O.m130782a();
            BinderC2073b binderC2073b = this.f10212o;
            if (binderC2073b != null) {
                binderC2073b.zzb();
                this.f10212o.zzm();
                this.f10212o = null;
            }
            this.f10213p = null;
            this.f10211n.zzh();
            this.f10179E = null;
            this.f10203f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f10217t) {
                return;
            }
            vny0.m199061A().m129795g(this);
            m13742S0();
            this.f10217t = true;
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132336na)).booleanValue()) {
                xsu0.m210834k("Destroying the WebView immediately...");
                zzV();
            } else {
                xsu0.m210834k("Initiating WebView self destruct sequence in 3...");
                xsu0.m210834k("Loading blank page in WebView, 2...");
                m13740Q0("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: e */
    public final synchronized String mo13683e() {
        return this.f10215r;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: e0 */
    public final void mo13684e0(int i) {
        if (i == 0) {
            c8s0 c8s0Var = this.f10185K;
            w7s0.m202071a(c8s0Var.m105818a(), this.f10183I, "aebb2");
        }
        m13741R0();
        this.f10185K.m105818a();
        this.f10185K.m105818a().m115282d("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10202e.zza);
        mo13674Z("onhide", map);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (mo13670V()) {
            x2t0.m206871i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132349oa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            i3t0.f111376e.mo122103a(new Runnable() { // from class: com.google.android.gms.internal.ads.j1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9940a.m13731H0(str, valueCallback);
                }
            });
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: f */
    public final myv0 mo13685f() {
        return this.f10200c;
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: f0 */
    public final void mo13686f0(int i) {
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f10217t) {
                        this.f10211n.zzh();
                        vny0.m199061A().m129795g(this);
                        m13742S0();
                        m13736M0();
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

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo13687g(String str, o7t0 o7t0Var) {
        try {
            if (this.f10194T == null) {
                this.f10194T = new HashMap();
            }
            this.f10194T.put(str, o7t0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: g0 */
    public final void mo13688g0(Context context) {
        this.f10198a.setBaseContext(context);
        this.f10189O.m130786e(this.f10198a.m135270a());
    }

    @Override // p149l.q9t0, p149l.tat0
    /* JADX INFO: renamed from: h */
    public final nxv0 mo13689h() {
        return this.f10208k;
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: h0 */
    public final void mo13690h0(int i) {
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: i0 */
    public final synchronized void mo13691i0(boolean z) {
        BinderC2073b binderC2073b = this.f10212o;
        if (binderC2073b != null) {
            binderC2073b.m12279x8(this.f10211n.zzL(), z);
        } else {
            this.f10216s = z;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: j */
    public final synchronized boolean mo13692j() {
        return this.f10216s;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: j0 */
    public final void mo13693j0(String str, vgs0 vgs0Var) {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.zzA(str, vgs0Var);
        }
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: k */
    public final synchronized void mo13694k() {
        yas0 yas0Var = this.f10178D;
        if (yas0Var != null) {
            final lhu0 lhu0Var = (lhu0) yas0Var;
            C2075b.f9714l.post(new Runnable() { // from class: l.ehu0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        lhu0Var.zzd();
                    } catch (RemoteException e) {
                        x2t0.m206871i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: l */
    public final void mo13695l() {
        if (this.f10184J == null) {
            this.f10185K.m105818a();
            b8s0 b8s0VarM115278f = e8s0.m115278f();
            this.f10184J = b8s0VarM115278f;
            this.f10185K.m105819b("native:view_load", b8s0VarM115278f);
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: l0 */
    public final synchronized void mo13696l0(h1s0 h1s0Var) {
        this.f10179E = h1s0Var;
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo13670V()) {
            x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo13670V()) {
            x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final synchronized void loadUrl(String str) {
        if (mo13670V()) {
            x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            vny0.m199079q().m212290w(th, "AdWebViewImpl.loadUrl");
            x2t0.m206870h("Could not call loadUrl. ", th);
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: m */
    public final void mo13697m() {
        this.f10189O.m130783b();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: m0 */
    public final synchronized void mo13698m0(boolean z) {
        this.f10221x = z;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: n */
    public final synchronized b6w0 mo13699n() {
        return this.f10213p;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: n0 */
    public final void mo13700n0() {
        if (this.f10182H == null) {
            c8s0 c8s0Var = this.f10185K;
            w7s0.m202071a(c8s0Var.m105818a(), this.f10183I, "aes2");
            this.f10185K.m105818a();
            b8s0 b8s0VarM115278f = e8s0.m115278f();
            this.f10182H = b8s0VarM115278f;
            this.f10185K.m105819b("native:view_show", b8s0VarM115278f);
        }
        HashMap map = new HashMap(1);
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10202e.zza);
        mo13674Z("onshow", map);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: o */
    public final WebViewClient mo13701o() {
        return this.f10211n;
    }

    @Override // p149l.xzx0
    /* JADX INFO: renamed from: o0 */
    public final synchronized void mo13702o0() {
        xzx0 xzx0Var = this.f10203f;
        if (xzx0Var != null) {
            xzx0Var.mo13702o0();
        }
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!mo13670V()) {
                this.f10189O.m130784c();
            }
            if (this.f10197W) {
                onResume();
                this.f10197W = false;
            }
            boolean z = this.f10175A;
            aat0 aat0Var = this.f10211n;
            if (aat0Var != null && aat0Var.zzM()) {
                if (!this.f10176B) {
                    this.f10211n.zza();
                    this.f10211n.zzb();
                    this.f10176B = true;
                }
                m13734K0();
                z = true;
            }
            m13738O0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        aat0 aat0Var;
        synchronized (this) {
            try {
                if (!mo13670V()) {
                    this.f10189O.m130785d();
                }
                super.onDetachedFromWindow();
                if (this.f10176B && (aat0Var = this.f10211n) != null && aat0Var.zzM() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f10211n.zza();
                    this.f10211n.zzb();
                    this.f10176B = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m13738O0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132485za)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            vny0.m199080r();
            C2075b.m12326s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            x2t0.m206864b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            vny0.m199079q().m212290w(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (mo13670V()) {
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
        boolean zM13734K0 = m13734K0();
        BinderC2073b binderC2073bZzL = zzL();
        if (binderC2073bZzL == null || !zM13734K0) {
            return;
        }
        binderC2073bZzL.zzn();
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
        if (mo13670V()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f10218u && !this.f10214q.m178697f()) {
            if (this.f10214q.m178699h()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.f10214q.m178701j()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131956J3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                sat0 sat0VarMo13675a = mo13675a();
                float fZze = sat0VarMo13675a != null ? sat0VarMo13675a.zze() : 0.0f;
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
            if (this.f10214q.m178698g()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132040Q3)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                mo13693j0("/contentHeight", new C2186l1(this));
                m13730G0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.f10205h.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i8 = this.f10181G;
                setMeasuredDimension(size3, i8 != -1 ? (int) (i8 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.f10214q.m178700i()) {
                DisplayMetrics displayMetrics = this.f10205h;
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
            rbt0 rbt0Var = this.f10214q;
            boolean z = rbt0Var.f158683c > i10 || rbt0Var.f158682b > i9;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132370q5)).booleanValue()) {
                rbt0 rbt0Var2 = this.f10214q;
                float f3 = rbt0Var2.f158683c;
                float f4 = this.f10206i;
                z &= f3 / f4 <= ((float) i10) / f4 && ((float) rbt0Var2.f158682b) / f4 <= ((float) i9) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f10210m) {
                    this.f10196V.m216994c(10002);
                    this.f10210m = true;
                }
                rbt0 rbt0Var3 = this.f10214q;
                setMeasuredDimension(rbt0Var3.f158683c, rbt0Var3.f158682b);
                return;
            }
            rbt0 rbt0Var4 = this.f10214q;
            float f5 = rbt0Var4.f158683c;
            float f6 = this.f10206i;
            x2t0.m206869g("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + BaseSei.f13930X + ((int) (rbt0Var4.f158682b / f6)) + " dp, but only has " + ((int) (size4 / f6)) + BaseSei.f13930X + ((int) (size5 / f6)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.f10209l) {
                return;
            }
            this.f10196V.m216994c(10001);
            this.f10209l = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final void onPause() {
        if (mo13670V()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            x2t0.m206867e("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final void onResume() {
        if (mo13670V()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            x2t0.m206867e("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10211n.zzM() || this.f10211n.zzK()) {
            ptr0 ptr0Var = this.f10199b;
            if (ptr0Var != null) {
                ptr0Var.m171379d(motionEvent);
            }
            b9s0 b9s0Var = this.f10201d;
            if (b9s0Var != null) {
                b9s0Var.m100825b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    jbs0 jbs0Var = this.f10177C;
                    if (jbs0Var != null) {
                        jbs0Var.mo140806a(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (mo13670V()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // p149l.q9t0, p149l.cbt0
    /* JADX INFO: renamed from: p */
    public final ptr0 mo13703p() {
        return this.f10199b;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: p0 */
    public final void mo13704p0() {
        throw null;
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: q */
    public final void mo13705q(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        x2t0.m206864b("Dispatching AFMA event: ".concat(sb.toString()));
        m13730G0(sb.toString());
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: r */
    public final void mo13706r() {
        m13741R0();
        HashMap map = new HashMap(1);
        map.put(WBConstants.AUTH_PARAMS_VERSION, this.f10202e.zza);
        mo13674Z("onhide", map);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: r0 */
    public final synchronized void mo13707r0(yas0 yas0Var) {
        this.f10178D = yas0Var;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: s */
    public final void mo13708s() {
        throw null;
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: s0 */
    public final synchronized String mo13709s0() {
        return this.f10222y;
    }

    @Override // android.webkit.WebView, p149l.q9t0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof aat0) {
            this.f10211n = (aat0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo13670V()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            x2t0.m206867e("Could not stop loading webview.", e);
        }
    }

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo13710t(sat0 sat0Var) {
        if (this.f10223z != null) {
            x2t0.m206866d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f10223z = sat0Var;
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: t0 */
    public final void mo13711t0(String str, Predicate predicate) {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.zzJ(str, predicate);
        }
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: u */
    public final void mo13712u(boolean z) {
        this.f10211n.zzD(false);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: u0 */
    public final synchronized void mo13713u0(int i) {
        BinderC2073b binderC2073b = this.f10212o;
        if (binderC2073b != null) {
            binderC2073b.m12271p8(i);
        }
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: v */
    public final void mo13714v() {
        setBackgroundColor(0);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: v0 */
    public final void mo13715v0(boolean z, int i, boolean z2) {
        this.f10211n.zzw(z, i, z2);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: w */
    public final synchronized void mo13716w(boolean z) {
        BinderC2073b binderC2073b;
        int i = this.f10180F + (true != z ? -1 : 1);
        this.f10180F = i;
        if (i > 0 || (binderC2073b = this.f10212o) == null) {
            return;
        }
        binderC2073b.m12263M();
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: w0 */
    public final void mo13717w0(boolean z, int i, String str, String str2, boolean z2) {
        this.f10211n.zzy(z, i, str, str2, z2);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: x */
    public final void mo13718x(int i) {
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: x0 */
    public final synchronized void mo13719x0(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (mo13670V()) {
                    x2t0.m206869g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) d1s0.m109677c().m144697a(m7s0.f132024P);
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
                    x2t0.m206870h("Unable to build MRAID_ENV", e);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, abt0.m95698a(str2, str4), MimeTypes.TEXT_HTML, "UTF-8", null);
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

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: y */
    public final synchronized BinderC2073b mo13720y() {
        return this.f10187M;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: y0 */
    public final synchronized void mo13721y0(boolean z) {
        try {
            boolean z2 = this.f10218u;
            this.f10218u = z;
            m13735L0();
            if (z != z2) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132036Q)).booleanValue()) {
                    if (!this.f10214q.m178700i()) {
                    }
                }
                new mrs0(this, "").m156084g(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: z */
    public final void mo13722z(String str, String str2, int i) {
        this.f10211n.zzv(str, str2, 14);
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: z0 */
    public final void mo13723z0(String str, JSONObject jSONObject) {
        mo13677b(str, jSONObject.toString());
    }

    @Override // p149l.q9t0, p149l.ebt0
    public final View zzF() {
        return this;
    }

    @Override // p149l.q9t0
    public final synchronized BinderC2073b zzL() {
        return this.f10212o;
    }

    @Override // p149l.q9t0
    public final /* synthetic */ hbt0 zzN() {
        return this.f10211n;
    }

    @Override // p149l.q9t0, p149l.bbt0
    public final synchronized rbt0 zzO() {
        return this.f10214q;
    }

    @Override // p149l.q9t0
    public final synchronized void zzV() {
        xsu0.m210834k("Destroying WebView!");
        m13736M0();
        C2075b.f9714l.post(new RunnableC2194m1(this));
    }

    @Override // p149l.rks0
    public final void zza(String str) {
        throw null;
    }

    @Override // p149l.q9t0
    public final synchronized boolean zzaz() {
        return this.f10180F > 0;
    }

    @Override // p149l.a7u0
    public final void zzbo() {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.zzbo();
        }
    }

    @Override // p149l.v5t0
    public final synchronized int zzf() {
        return this.f10186L;
    }

    @Override // p149l.v5t0
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // p149l.v5t0
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // p149l.q9t0, p149l.wat0, p149l.v5t0
    public final Activity zzi() {
        return this.f10198a.m135270a();
    }

    @Override // p149l.q9t0, p149l.v5t0
    public final z0r0 zzj() {
        return this.f10204g;
    }

    @Override // p149l.v5t0
    public final b8s0 zzk() {
        return this.f10183I;
    }

    @Override // p149l.q9t0, p149l.v5t0
    public final c8s0 zzm() {
        return this.f10185K;
    }

    @Override // p149l.q9t0, p149l.dbt0, p149l.v5t0
    public final zzcei zzn() {
        return this.f10202e;
    }

    @Override // p149l.v5t0
    public final k5t0 zzo() {
        return null;
    }

    @Override // p149l.v5t0
    public final synchronized String zzr() {
        nxv0 nxv0Var = this.f10208k;
        if (nxv0Var == null) {
            return null;
        }
        return nxv0Var.f141055b;
    }

    @Override // p149l.a7u0
    public final void zzs() {
        aat0 aat0Var = this.f10211n;
        if (aat0Var != null) {
            aat0Var.zzs();
        }
    }

    @Override // p149l.v5t0
    public final void zzu() {
        BinderC2073b binderC2073bZzL = zzL();
        if (binderC2073bZzL != null) {
            binderC2073bZzL.zzd();
        }
    }
}
