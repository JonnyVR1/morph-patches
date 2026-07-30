package com.hellogroup.p036mk.business.base.p037ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.configcontrol.FepConfigControlHelper;
import com.hellogroup.p036mk.business.p038ui.MKWebCommonActivity;
import com.hellogroup.p036mk.business.util.MKWebCaptureHelper;
import com.hellogroup.p036mk.business.util.OfflinePkgCheckUtil;
import com.hellogroup.p036mk.business.util.WhiteScreenLogTracker;
import com.hellogroup.p036mk.business.webmonitor.MKWebMonitorManager;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.hellogroup.p036mk.core.pkg.WebViewPkgInfoCache;
import com.hellogroup.p036mk.core.safety.MKPathNotSafeException;
import com.hellogroup.p036mk.core.safety.MKUrlNotSafeException;
import com.hellogroup.p036mk.fdt.FDTManager;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONObject;
import p153l.a43;
import p153l.a6k0;
import p153l.arw;
import p153l.auf;
import p153l.bfe0;
import p153l.brw;
import p153l.bwi0;
import p153l.c2f;
import p153l.cjw;
import p153l.dlw;
import p153l.drp0;
import p153l.ekw;
import p153l.erp0;
import p153l.fqq;
import p153l.g4k;
import p153l.g7m;
import p153l.gjw;
import p153l.glw;
import p153l.gpj0;
import p153l.grp0;
import p153l.h510;
import p153l.hjw;
import p153l.hul;
import p153l.i8g0;
import p153l.ilw;
import p153l.jqh0;
import p153l.jri;
import p153l.jzv;
import p153l.kjw;
import p153l.lf3;
import p153l.mf3;
import p153l.mjw;
import p153l.mkw;
import p153l.ngi;
import p153l.nlw;
import p153l.pxl;
import p153l.qgi;
import p153l.r26;
import p153l.rf3;
import p153l.rs8;
import p153l.sjw;
import p153l.tm80;
import p153l.vkw;
import p153l.wam;
import p153l.wg3;
import p153l.wi20;
import p153l.wkw;
import p153l.x4d0;
import p153l.xjw;
import p153l.xkw;
import p153l.y35;
import p153l.yfi;
import p153l.ykw;
import p153l.ylw;
import p153l.zgi;
import p153l.zqw;
import p153l.zrp0;
import p153l.zym;

/* JADX INFO: loaded from: classes7.dex */
public class MKWebView extends BaseWebView implements g4k.InterfaceC17150a, hul {

    /* JADX INFO: renamed from: Y0 */
    private static final boolean f12034Y0 = yfi.m215607w();

    /* JADX INFO: renamed from: Z0 */
    private static String f12035Z0 = "";

    /* JADX INFO: renamed from: A */
    private long f12036A;

    /* JADX INFO: renamed from: B */
    private boolean f12037B;

    /* JADX INFO: renamed from: C */
    private boolean f12038C;

    /* JADX INFO: renamed from: D */
    private String f12039D;

    /* JADX INFO: renamed from: E */
    private AtomicBoolean f12040E;

    /* JADX INFO: renamed from: E0 */
    private String f12041E0;

    /* JADX INFO: renamed from: F */
    private boolean f12042F;

    /* JADX INFO: renamed from: F0 */
    private String f12043F0;

    /* JADX INFO: renamed from: G */
    private boolean f12044G;

    /* JADX INFO: renamed from: G0 */
    private String f12045G0;

    /* JADX INFO: renamed from: H */
    private boolean f12046H;

    /* JADX INFO: renamed from: H0 */
    private InterfaceC3514f f12047H0;

    /* JADX INFO: renamed from: I */
    public boolean f12048I;

    /* JADX INFO: renamed from: I0 */
    private long f12049I0;

    /* JADX INFO: renamed from: J */
    private int f12050J;

    /* JADX INFO: renamed from: J0 */
    private String f12051J0;

    /* JADX INFO: renamed from: K */
    private String f12052K;

    /* JADX INFO: renamed from: K0 */
    private boolean f12053K0;

    /* JADX INFO: renamed from: L */
    private Context f12054L;

    /* JADX INFO: renamed from: L0 */
    private cjw f12055L0;

    /* JADX INFO: renamed from: M */
    private gpj0 f12056M;

    /* JADX INFO: renamed from: M0 */
    private boolean f12057M0;

    /* JADX INFO: renamed from: N */
    private y35 f12058N;

    /* JADX INFO: renamed from: N0 */
    private boolean f12059N0;

    /* JADX INFO: renamed from: O */
    private boolean f12060O;

    /* JADX INFO: renamed from: O0 */
    private Map<String, byte[]> f12061O0;

    /* JADX INFO: renamed from: P */
    private BroadcastReceiver f12062P;

    /* JADX INFO: renamed from: P0 */
    private String f12063P0;

    /* JADX INFO: renamed from: Q */
    private String f12064Q;

    /* JADX INFO: renamed from: Q0 */
    private WebChromeClient f12065Q0;

    /* JADX INFO: renamed from: R */
    private String f12066R;

    /* JADX INFO: renamed from: R0 */
    private AtomicBoolean f12067R0;

    /* JADX INFO: renamed from: S */
    private final Boolean f12068S;

    /* JADX INFO: renamed from: S0 */
    private boolean f12069S0;

    /* JADX INFO: renamed from: T */
    private String f12070T;

    /* JADX INFO: renamed from: T0 */
    private WebViewClient f12071T0;

    /* JADX INFO: renamed from: U */
    private String f12072U;

    /* JADX INFO: renamed from: U0 */
    private volatile List<ilw> f12073U0;

    /* JADX INFO: renamed from: V */
    private boolean f12074V;

    /* JADX INFO: renamed from: V0 */
    private tm80 f12075V0;

    /* JADX INFO: renamed from: W */
    protected fqq f12076W;

    /* JADX INFO: renamed from: W0 */
    private grp0 f12077W0;

    /* JADX INFO: renamed from: X0 */
    private ArrayList<InterfaceC3515g> f12078X0;

    /* JADX INFO: renamed from: a */
    private boolean f12079a;

    /* JADX INFO: renamed from: b */
    private MKWebView f12080b;

    /* JADX INFO: renamed from: c */
    public final gjw f12081c;

    /* JADX INFO: renamed from: d */
    private DelayInjectState f12082d;

    /* JADX INFO: renamed from: e */
    private boolean f12083e;

    /* JADX INFO: renamed from: f */
    private arw f12084f;

    /* JADX INFO: renamed from: g */
    private boolean f12085g;

    /* JADX INFO: renamed from: h */
    private boolean f12086h;

    /* JADX INFO: renamed from: i */
    private MKWebCaptureHelper f12087i;

    /* JADX INFO: renamed from: j */
    private WhiteScreenLogTracker f12088j;

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f12089k;

    /* JADX INFO: renamed from: k0 */
    private wam f12090k0;

    /* JADX INFO: renamed from: l */
    private nlw f12091l;

    /* JADX INFO: renamed from: m */
    private boolean f12092m;

    /* JADX INFO: renamed from: n */
    public ViewGroup f12093n;

    /* JADX INFO: renamed from: o */
    public int f12094o;

    /* JADX INFO: renamed from: p */
    public int f12095p;

    /* JADX INFO: renamed from: p0 */
    private String f12096p0;

    /* JADX INFO: renamed from: q */
    private ekw f12097q;

    /* JADX INFO: renamed from: r */
    private Set<String> f12098r;

    /* JADX INFO: renamed from: s */
    public x4d0 f12099s;

    /* JADX INFO: renamed from: t */
    private String f12100t;

    /* JADX INFO: renamed from: u */
    private final WebViewPkgInfoCache f12101u;

    /* JADX INFO: renamed from: v */
    private Path f12102v;

    /* JADX INFO: renamed from: w */
    private RectF f12103w;

    /* JADX INFO: renamed from: x */
    private Paint f12104x;

    /* JADX INFO: renamed from: y */
    private boolean f12105y;

    /* JADX INFO: renamed from: z */
    private boolean f12106z;

    public enum DelayInjectState {
        NONE,
        WEBCACHE_WITHOUTLOAD_URL,
        WEBCACHE_LOADING_URL,
        WEBCACHE_LOADED_URL
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$a */
    public class C3509a implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12108a;

        public C3509a(String str) {
            this.f12108a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                return null;
            }
            jzv.m147728a("MK---WebView", "lehua:boost 失败降级重新load url " + this.f12108a);
            try {
                MKWebView.super.loadUrl(this.f12108a);
                return null;
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
                MKWebView.super.loadUrl(this.f12108a);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$b */
    public class C3510b extends WebView.VisualStateCallback {
        public C3510b() {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j) {
            if (MKWebView.this.f12047H0 != null) {
                MKWebView.this.f12047H0.mo17937a(MKWebView.this.f12066R);
            }
            jzv.m147734g("MK---WebView", "postVisualStateCallback -----" + j);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$e */
    public static class C3513e {

        /* JADX INFO: renamed from: a */
        private WeakReference<MKWebView> f12111a;

        public C3513e(MKWebView mKWebView) {
            this.f12111a = new WeakReference<>(mKWebView);
        }

        @JavascriptInterface
        public void bridgejs(String str, String str2, String str3) {
            MKWebView mKWebView = this.f12111a.get();
            if (mKWebView == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            mKWebView.m17864g1(str, str2, str3);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jzv.m147728a("MK---WebView", "tang-----JavaInterface-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis2 + "       " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$f */
    public interface InterfaceC3514f {
        /* JADX INFO: renamed from: a */
        default void mo17937a(String str) {
        }

        /* JADX INFO: renamed from: b */
        default void mo17938b(String str) {
        }

        /* JADX INFO: renamed from: c */
        void mo17939c(String str, boolean z);

        /* JADX INFO: renamed from: d */
        void mo17940d(String str, int i, String str2);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$g */
    public interface InterfaceC3515g {
        /* JADX INFO: renamed from: a */
        void m17941a(int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$h */
    public static class C3516h {

        /* JADX INFO: renamed from: a */
        boolean f12112a = false;

        /* JADX INFO: renamed from: b */
        String f12113b;

        private C3516h() {
        }

        /* JADX INFO: renamed from: a */
        public static C3516h m17942a(boolean z, String str) {
            C3516h c3516h = new C3516h();
            c3516h.f12112a = z;
            c3516h.f12113b = str;
            return c3516h;
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$i */
    public static class C3517i extends h510.AbstractRunnableC17399b<Object, Void, String> {

        /* JADX INFO: renamed from: g */
        private WeakReference<MKWebView> f12114g;

        /* JADX INFO: renamed from: h */
        private byte[] f12115h;

        /* JADX INFO: renamed from: i */
        private String f12116i;

        public C3517i(MKWebView mKWebView, byte[] bArr, String str) {
            this.f12114g = new WeakReference<>(mKWebView);
            this.f12115h = bArr;
            this.f12116i = str;
        }

        @Override // p153l.h510.AbstractRunnableC17399b
        /* JADX INFO: renamed from: n */
        public void mo17944n(Exception exc) {
            MKWebView mKWebView = this.f12114g.get();
            if (mKWebView == null || mKWebView.mo17920e()) {
                return;
            }
            byte[] bArr = this.f12115h;
            String str = this.f12116i;
            if (bArr != null) {
                mKWebView.m17891s0(str, bArr);
            } else {
                mKWebView.m17887q0(str);
            }
        }

        @Override // p153l.h510.AbstractRunnableC17399b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String mo17943f(Object[] objArr) throws Exception {
            return erp0.m122244d(this.f12115h, this.f12116i, this.f12114g.get() != null ? this.f12114g.get().f12064Q : null);
        }

        @Override // p153l.h510.AbstractRunnableC17399b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo17945p(String str) {
            try {
                if (!rs8.m182911b() && str.contains(StringUtil.ALL_INTERFACES)) {
                    MKCoreLogManager.m18427e().m18452o("onTaskSuccess", str, null);
                }
            } catch (Exception unused) {
            }
            if (this.f12114g.get() != null) {
                MKWebView mKWebView = this.f12114g.get();
                if (mKWebView.mo17920e()) {
                    return;
                }
                mKWebView.loadUrl(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$j */
    public static class HandlerC3518j extends gpj0<MKWebView> {
        public HandlerC3518j(MKWebView mKWebView) {
            super(mKWebView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (m131281a() == null) {
                return;
            }
            m131281a().m17819E0(message);
        }
    }

    public MKWebView(Context context, boolean z) {
        super(m17812A0(context));
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        this.f12086h = z;
        if (z) {
            this.f12082d = DelayInjectState.WEBCACHE_WITHOUTLOAD_URL;
            this.f12083e = true;
        }
        m17823G0(context);
    }

    /* JADX INFO: renamed from: A0 */
    private static Context m17812A0(Context context) {
        sjw.m186326o();
        return context;
    }

    /* JADX INFO: renamed from: B0 */
    public static String m17814B0(JSONObject jSONObject) {
        return jSONObject.optString("callback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public WebResourceResponse m17817D0(WebView webView, String str, String str2, WebResourceRequest webResourceRequest) {
        String str3;
        WebResourceResponse webResourceResponseM222135h;
        boolean andSet = this.f12089k.getAndSet(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        WebResourceResponse webResourceResponseM17897v0 = m17897v0(webView, str);
        if (webResourceResponseM17897v0 != null) {
            return webResourceResponseM17897v0;
        }
        WebResourceResponse webResourceResponseM222134g = zym.m222134g(str, this.f12064Q, this.f12097q);
        if (webResourceResponseM222134g != null) {
            return webResourceResponseM222134g;
        }
        if (this.f12037B) {
            str3 = str;
            webResourceResponseM222135h = null;
        } else {
            str3 = str;
            webResourceResponseM222135h = zym.m222135h(andSet, str3, this.f12064Q, this.f12045G0, this.f12048I, this.f12099s);
        }
        if (this.f12037B) {
            jzv.m147728a("MK---WebView", "fepForceOnline --> " + str3);
        }
        if (webResourceResponseM222135h != null) {
            jzv.m147728a("MK---WebView", "lehua:offline isFirstInterceptReq=" + andSet + " 耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  加载本地资源 " + str3);
            MKCoreLogManager.m18431i(getLogSessionKey()).m211433H("local", str3, true);
        }
        if (webResourceResponseM222135h == null && auf.INSTANCE.m100380c(str3) && (webResourceResponseM222135h = drp0.m117699e(this.f12061O0.remove(str3), webView, webResourceRequest, this.f12064Q)) == null) {
            jzv.m147729b("MK---WebView", "fdt mkweb use dns failed, url: " + str3);
        }
        if (webResourceResponseM222135h == null) {
            if (webResourceRequest != null) {
                jzv.m147728a("MK---WebView", "mkweb method " + webResourceRequest.getMethod() + " ---> " + str3);
            }
            boolean webDnsEnable = getWebDnsEnable();
            jzv.m147728a("MK---WebView", "mkweb enableWebDns --> " + webDnsEnable);
            if ((webDnsEnable && FepConfigControlHelper.m18026g() && (FepConfigControlHelper.m18022c(str3) || this.f12061O0.containsKey(str3))) || (webDnsEnable && xjw.m211265a().m211269e(Uri.parse(str3).getHost()))) {
                jzv.m147728a("MK---WebView", "mkweb use dns --> " + str3);
                byte[] bArrRemove = this.f12061O0.remove(str3);
                this.f12100t = str3;
                webResourceResponseM222135h = erp0.m122247g(bArrRemove, webView, webResourceRequest, getOriginURL());
                if (webResourceResponseM222135h == null) {
                    jzv.m147729b("MK---WebView", "mkweb use dns failed, url: " + str3);
                }
                MKCoreLogManager.m18431i(getLogSessionKey()).m211433H("dns", str3, webResourceResponseM222135h != null);
            } else {
                jzv.m147728a("MK---WebView", "mkweb use dns failed, url: " + str3);
            }
            if (webResourceResponseM222135h != null) {
                jzv.m147728a("MK---WebView", "lehua:offline  耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  加载远程资源 " + str3);
            }
        }
        if (webResourceResponseM222135h == null) {
            return null;
        }
        auf.INSTANCE.m100383h(webResourceResponseM222135h, webResourceRequest);
        return webResourceResponseM222135h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public void m17819E0(Message message) {
        if ((getRealContext() instanceof g7m) && !((g7m) getRealContext()).m129335a()) {
            String string = message.getData().getString("value");
            if (!TextUtils.isEmpty(string)) {
                try {
                    if (new JSONObject(string).optJSONObject(LovePlanetStage.result).optJSONObject("event_msg").optBoolean("active_response", false)) {
                        return;
                    }
                } catch (Exception e) {
                    jzv.m147729b("MK---WebView", e.getMessage());
                }
            }
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                jzv.m147728a("mkleak", "destroy from post");
                destroy();
                return;
            }
            Object obj = message.obj;
            if (obj == null) {
                return;
            }
            loadUrl(obj.toString());
            return;
        }
        Bundle data = message.getData();
        String string2 = data.getString("value");
        String string3 = data.getString("callback");
        String strM130718o = glw.m130718o(string2);
        String str = "javascript:" + string3 + "('" + strM130718o + "')";
        try {
            MKCoreLogManager.m18431i(getLogSessionKey()).m211428C("response", string3, strM130718o, this.f12052K);
        } catch (Exception e2) {
            jzv.m147730c("MK---WebView", "", e2);
        }
        try {
            if (!rs8.m182911b() && strM130718o.contains(StringUtil.ALL_INTERFACES)) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("errorMsg", Log.getStackTraceString(new Exception()));
                map.put("msg", string3);
                MKCoreLogManager.m18427e().m18452o("COMMEN_ASSEMBLE_MESSAGE", null, map);
            }
        } catch (Exception unused) {
        }
        loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m17821F0(WebView webView, String str, int i, String str2) {
        jzv.m147729b("MK---WebView", "tang------handleReceivedErrorInner " + i + ":" + str2 + "  " + str);
        m17869j1(i, str2);
        m17878m1(i, str2, str);
        if (this.f12073U0 != null && this.f12073U0.size() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= (this.f12073U0 != null ? this.f12073U0.size() : 0)) {
                    break;
                }
                if (this.f12073U0.get(i2) != null) {
                    this.f12073U0.get(i2).mo17978e(webView, i, str2, str);
                }
                i2++;
            }
        }
        if (getWebMonitorListener() != null) {
            getWebMonitorListener().mo18263d(getOriginURL(), i, str2, str);
        }
        m17874l0(this);
    }

    /* JADX INFO: renamed from: G0 */
    private void m17823G0(Context context) {
        this.f12080b = this;
        this.f12049I0 = System.currentTimeMillis();
        jzv.m147728a("webRsa", "mk init start");
        this.f12054L = context;
        MKCoreLogManager.m18431i(getLogSessionKey()).m211443R();
        this.f12056M = new HandlerC3518j(this);
        this.f12052K = m17904z0();
        m17829K0();
        this.f12076W = new fqq(this);
        kjw.INSTANCE.m150073b(this);
        ylw.m216640a().m216641b(this);
        dlw.INSTANCE.m116902e();
        g4k g4kVarM186316e = sjw.m186316e();
        if (g4kVarM186316e != null) {
            g4kVarM186316e.mo128892a(this);
        }
        this.f12051J0 = getSettings().getUserAgentString();
        mjw.INSTANCE.m158638p();
        if (this.f12082d == DelayInjectState.NONE) {
            m17927n1();
        }
        this.f12097q = new ekw();
        if (this.f12088j == null) {
            this.f12088j = new WhiteScreenLogTracker(getLogSessionKey());
        }
        this.f12055L0 = new cjw();
    }

    /* JADX INFO: renamed from: H0 */
    private void m17825H0() {
        Context context = this.f12054L;
        if (context == null) {
            return;
        }
        jzv.m147728a("mkleak", "init receivers");
        this.f12062P = new MKBroadcastReceiver(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.immomo.momo.mk.post_message");
        rf3.m181163a(context.getApplicationContext(), this.f12062P, intentFilter);
    }

    /* JADX INFO: renamed from: K0 */
    private void m17829K0() {
        WebSettings settings = getSettings();
        settings.setMixedContentMode(0);
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setGeolocationEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(yfi.m215585a());
        if (sjw.m186328q()) {
            settings.setTextZoom(100);
        }
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        if (wi20.m206544h()) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        if (this.f12082d == DelayInjectState.NONE) {
            m17885p1();
        }
        setDrawingCacheEnabled(false);
        jqh0.m146583c(settings);
        if (!MKConfigSetter.INSTANCE.m17766i() && !FDTManager.INSTANCE.m18519k()) {
            z = false;
        }
        setDebuggable(z);
        addJavascriptInterface(new C3513e(this), "mkAobj");
        setScrollBarStyle(0);
        requestFocusFromTouch();
    }

    /* JADX INFO: renamed from: L0 */
    private boolean m17831L0() {
        try {
            String userAgentString = this.f12063P0;
            if (TextUtils.isEmpty(userAgentString)) {
                userAgentString = getSettings().getUserAgentString();
            }
            if (!TextUtils.isEmpty(userAgentString) && userAgentString.contains("Chrome/")) {
                jzv.m147728a("MK---WebView", userAgentString);
                int iIndexOf = userAgentString.indexOf("Chrome/") + 7;
                return Integer.valueOf(userAgentString.substring(iIndexOf, userAgentString.indexOf(".", iIndexOf))).intValue() >= 77;
            }
        } catch (Throwable th) {
            jzv.m147730c("MK---WebView", "", th);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public boolean m17833M0(String str) {
        if (str != null) {
            return str.contains(".js") || str.contains(".html");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public boolean m17837P0(String str) {
        return str.startsWith("file://");
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m17839Q0(String str, C3516h c3516h) {
        if (mo17920e() || TextUtils.isEmpty(str) || str.startsWith("javascript:")) {
            return false;
        }
        if (!m17908N0(str) && !str.startsWith("file://")) {
            return false;
        }
        if (c3516h != null && this.f12072U == null) {
            String str2 = c3516h.f12113b;
            if (TextUtils.isEmpty(str2)) {
                str2 = str;
            }
            this.f12072U = str2;
            jzv.m147732e("MK---WebView", "checkBridgeSafeUrl=" + this.f12072U);
        }
        if (c3516h != null && MKCoreLogManager.m18431i(getLogSessionKey()).m18483t(c3516h.f12113b)) {
            jzv.m147728a("MK---WebView", "first update url " + c3516h.f12113b);
        }
        return !TextUtils.isEmpty(a6k0.m96329a(str));
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m17841R0(Map<String, String> map) {
        return map != null && map.size() > 0;
    }

    /* JADX INFO: renamed from: T0 */
    private boolean m17844T0() {
        int iM95880b;
        if (TextUtils.isEmpty(this.f12066R) || (iM95880b = a43.m95880b(true, this.f12066R)) == 1) {
            return false;
        }
        if (iM95880b == 0) {
            return true;
        }
        return a43.m95881c(true, this.f12066R);
    }

    /* JADX INFO: renamed from: U0 */
    private void m17846U0(String str, Map<String, String> map) {
        jzv.m147728a("MK---WebView", "lehua:boost:debug loadUrl=" + str + "   isFirstUrl=" + this.f12067R0.get() + "  isNeedClearHistory=" + this.f12083e + "  delayInjectState=" + this.f12082d);
        StringBuilder sb = new StringBuilder("tang----mwc:loadUrl ");
        sb.append(str);
        sb.append(" release: ");
        sb.append(this.f12060O);
        jzv.m147728a("MK---WebView", sb.toString());
        m17877m0(str);
        cjw cjwVar = this.f12055L0;
        if (cjwVar != null) {
            cjwVar.m110286b(str, this, this.f12093n, Boolean.FALSE);
        }
        if (TextUtils.isEmpty(str) || mo17920e()) {
            return;
        }
        tm80 tm80Var = this.f12075V0;
        if (tm80Var == null || !tm80Var.mo171748b(str)) {
            try {
                if (!rs8.m182911b() && str.contains(StringUtil.ALL_INTERFACES)) {
                    MKCoreLogManager.m18427e().m18453p(this.f12066R, str, this.f12100t, Boolean.valueOf(this.f12086h));
                }
            } catch (Exception unused) {
            }
            if (m17868j0(null, str)) {
                return;
            }
            m17880n0(str);
            m17889r0(str, map);
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m17849W0(String str, String str2) {
        if (!getWebDnsEnable() || i8g0.m139001c(str) || this.f12098r.contains(str)) {
            return;
        }
        this.f12098r.add(str);
        String strM186315d = sjw.m186315d();
        if (sjw.m186319h()) {
            strM186315d = "escapeUrl";
        }
        if (i8g0.m139000b(strM186315d)) {
            strM186315d = "unknown";
        }
        MKCoreLogManager.m18427e().m18448h(strM186315d, str, str2);
    }

    /* JADX INFO: renamed from: X0 */
    private void m17851X0(Canvas canvas) {
        if (this.f12102v == null) {
            Path path = new Path();
            this.f12102v = path;
            path.setFillType(Path.FillType.INVERSE_WINDING);
        }
        RectF rectF = this.f12103w;
        if (rectF == null) {
            this.f12103w = new RectF(0.0f, getScrollY(), getWidth(), getScrollY() + getHeight());
        } else {
            rectF.set(0.0f, getScrollY(), getWidth(), getScrollY() + getHeight());
        }
        this.f12102v.reset();
        Path path2 = this.f12102v;
        RectF rectF2 = this.f12103w;
        int i = this.f12050J;
        path2.addRoundRect(rectF2, i, i, Path.Direction.CW);
        if (this.f12104x == null) {
            this.f12104x = m17894u0();
        }
        canvas.drawPath(this.f12102v, this.f12104x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public void m17853Y0(String str, String str2, String str3, int i, String str4) {
        try {
            if (TextUtils.isEmpty(str3)) {
                str3 = "unknownUrl";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "unknown";
            }
            String str5 = str2 + "&&&" + i + "&&&" + str4 + "&&&" + str3;
            if (str3 != null && !str3.endsWith("/favicon.ico")) {
                if ("ERR_2.1".equals(str)) {
                    MKCoreLogManager.m18431i(getLogSessionKey()).m211444S(str5);
                } else if ("ERR_1.3".equals(str)) {
                    MKCoreLogManager.m18431i(getLogSessionKey()).m211432G(str5);
                }
            }
            if (this.f12038C) {
                qgi.m176477a("mk", str3, this.f12045G0, str5);
            }
            if (m17833M0(str3) && this.f12047H0 != null && m17934w0(str3)) {
                this.f12047H0.mo17940d(str3, i, str4);
            }
        } catch (Exception e) {
            jzv.m147729b("MK---WebView", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private void m17855Z0(boolean z, C3516h c3516h, String str) {
        dlw.INSTANCE.m116908p(this.f12064Q, str);
        if (this.f12088j != null && z && !this.f12042F && !mo17920e()) {
            MKCoreLogManager.m18431i(getLogSessionKey()).m211450u("monitorLoadStart=" + str);
            this.f12088j.m18245q(getLogSessionKey());
        }
        if (z && !c3516h.f12112a && m17934w0(c3516h.f12113b)) {
            InterfaceC3514f interfaceC3514f = this.f12047H0;
            if (interfaceC3514f != null) {
                interfaceC3514f.mo17939c(str, this.f12079a);
            }
            if ("Android 7.1.1".equalsIgnoreCase(Build.VERSION.RELEASE)) {
                return;
            }
            try {
                postVisualStateCallback(System.currentTimeMillis(), new C3510b());
            } catch (AbstractMethodError unused) {
                InterfaceC3514f interfaceC3514f2 = this.f12047H0;
                if (interfaceC3514f2 != null) {
                    interfaceC3514f2.mo17937a(this.f12066R);
                }
            } catch (Throwable th) {
                jzv.m147730c("MK---WebView", "", th);
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    private C3516h m17862f1(String str) {
        String strDecode;
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("https://www.immomo.com/checkurl/?url=")) {
                strDecode = URLDecoder.decode(str.substring(37));
                z = true;
            } else {
                strDecode = str;
            }
            if (str.startsWith("https://passport.immomo.com/authorize?redirect_uri=")) {
                str = URLDecoder.decode(str.substring(51));
                z = true;
            } else {
                str = strDecode;
            }
        }
        return C3516h.m17942a(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public void m17864g1(String str, String str2, String str3) {
        try {
            String str4 = this.f12068S.booleanValue() ? this.f12070T : this.f12066R;
            if (TextUtils.isEmpty(str4)) {
                String str5 = this.f12072U;
                try {
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    } else {
                        bfe0.m103889d(str5);
                    }
                } catch (MKUrlNotSafeException e) {
                    jzv.m147730c("MK---WebView", "", e);
                    return;
                }
            } else {
                bfe0.m103889d(str4);
                if (sjw.m186322k() != null) {
                    sjw.m186322k().mo115648c(str4);
                }
            }
            JSONObject jSONObject = !TextUtils.isEmpty(str3) ? new JSONObject(str3) : new JSONObject();
            fqq fqqVar = this.f12076W;
            if (fqqVar != null) {
                fqqVar.m126797m(str, str2, jSONObject);
            }
        } catch (Exception e2) {
            jzv.m147730c("MK---WebView", "", e2);
            if (e2 instanceof MKPathNotSafeException) {
                jzv.m147729b("MK---WebView", "dangerous path alert, " + e2.getMessage());
            } else if (e2 instanceof MKUrlNotSafeException) {
                jzv.m147729b("MK---WebView", "dangerous url alert, " + e2.getMessage());
            }
            MKCoreLogManager.m18431i(getLogSessionKey()).m211429D(str, str2, e2.getMessage());
            if (getWebMonitorListener() != null) {
                getWebMonitorListener().mo18262c(getOriginURL(), e2);
            }
        }
    }

    private boolean getWebDnsEnable() {
        return sjw.m186318g() != null && sjw.m186318g().mo111756c() && this.f12074V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m17865h1(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            System.currentTimeMillis();
            String strM139008j = i8g0.m139008j(str, "mkjsbridge", "http", 1);
            URL url = new URL(strM139008j);
            String host = url.getHost();
            String strSubstring = url.getPath().substring(1);
            Uri uri = Uri.parse(strM139008j);
            System.currentTimeMillis();
            String queryParameter = uri.getQueryParameter("param");
            System.currentTimeMillis();
            m17864g1(host, strSubstring, queryParameter);
            System.currentTimeMillis();
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private Message m17866i0(int i, String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            wg3.m206174a("keys length must be equal to values length");
            return null;
        }
        Message messageObtainMessage = this.f12056M.obtainMessage();
        messageObtainMessage.what = i;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bundle.putString(strArr[i2], strArr2[i2]);
        }
        messageObtainMessage.setData(bundle);
        return messageObtainMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public void m17867i1(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Target.TYPE);
            String stringExtra2 = intent.getStringExtra("type");
            String stringExtra3 = intent.getStringExtra(AuthenticationTokenClaims.JSON_KEY_NAME);
            String stringExtra4 = intent.getStringExtra("data");
            String stringExtra5 = intent.getStringExtra("origin");
            String url = getUrl();
            String strM186317f = sjw.m186317f(url);
            if (url.contains("?")) {
                url = url.substring(0, url.indexOf("?"));
            }
            if (stringExtra.contains("*") && stringExtra.length() > 1) {
                stringExtra = stringExtra.substring(stringExtra.indexOf("*") + 2);
            }
            if ("*".equals(stringExtra) || strM186317f.contains(stringExtra) || url.equals(stringExtra)) {
                m17902y0(stringExtra2, stringExtra3, stringExtra4, stringExtra5);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j0 */
    private boolean m17868j0(byte[] bArr, String str) {
        if (!getWebDnsEnable() || !FepConfigControlHelper.m18022c(str)) {
            return false;
        }
        if (!str.startsWith("https://www.immomo.com/checkurl/?url=") && !str.startsWith("https://passport.immomo.com/authorize?redirect_uri=")) {
            return false;
        }
        h510.m133608d(Integer.valueOf(hashCode()), new C3517i(this, bArr, str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public void m17869j1(int i, String str) {
        String currentLogKey = getCurrentLogKey();
        pxl pxlVarM158846g = mkw.m158843f().m158846g(currentLogKey);
        if (pxlVarM158846g != null) {
            vkw vkwVar = (vkw) pxlVarM158846g;
            vkwVar.m201583l(i, str);
            vkwVar.m116157g();
            mkw.m158843f().m158849j(vkwVar);
            mkw.m158843f().m158848i(currentLogKey);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private String m17871k0(String str, C3516h c3516h) {
        boolean z;
        String strM219634q;
        String strConcat = str;
        String strM96329a = a6k0.m96329a(strConcat);
        this.f12045G0 = strM96329a;
        this.f12099s = new x4d0(strM96329a, strConcat, this.f12101u);
        zgi zgiVarM17905C0 = m17905C0(strConcat, CheckPolicy.NO_UPDATE);
        ngi fepGreyState = zgiVarM17905C0 != null ? zgiVarM17905C0.getFepGreyState() : null;
        if (this.f12085g && this.f12084f == null && !TextUtils.isEmpty(strM96329a)) {
            this.f12084f = zqw.m221051c(brw.m106163b(strConcat));
            this.f12085g = false;
        }
        try {
            if (!TextUtils.isEmpty(strM96329a)) {
                ykw.m216540a().m216542c(this.f12070T, strM96329a, strConcat);
            }
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "beforeLoadMKUrl error", e);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12041E0 = null;
        this.f12064Q = strConcat;
        if (TextUtils.isEmpty(this.f12066R)) {
            String str2 = c3516h.f12113b;
            this.f12066R = str2;
            try {
                Uri uri = Uri.parse(str2);
                if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                    this.f12074V = uri.getBooleanQueryParameter("_dns", true);
                    jzv.m147728a("MK---WebView", "enterUrl require dns open :" + this.f12074V);
                    if (!this.f12074V) {
                        m17849W0(strConcat, getClass().getSimpleName().concat("-beforeLoadMKUrl"));
                    }
                }
            } catch (Exception e2) {
                jzv.m147730c("MK---WebView", "", e2);
            }
        }
        if (strConcat.startsWith("file://")) {
            strConcat = strConcat.indexOf("?") > 0 ? strConcat.concat("&_offline=1") : strConcat.concat("?&_offline=1");
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f12079a = true;
            strM219634q = strConcat;
        } else {
            if (this.f12036A == -1 && zgiVarM17905C0 != null) {
                this.f12036A = zgiVarM17905C0.m219624g();
                jzv.m147728a("MK---WebView", "update local version : " + this.f12036A);
            }
            this.f12037B = fepGreyState != null && fepGreyState.m162972g();
            this.f12038C = fepGreyState != null && fepGreyState.m162972g();
            if (this.f12037B) {
                jzv.m147728a("MK---WebView", "==== fep strategy hit ====");
                this.f12079a = false;
                strM219634q = zgiVarM17905C0.m219634q(strConcat);
                c3516h.f12113b = strM219634q;
                jzv.m147728a("MK---WebView", "fepAppliedUrl = " + strM219634q);
                try {
                    WebSettings settings = getSettings();
                    if (settings.getCacheMode() != 2) {
                        settings.setCacheMode(2);
                    }
                } catch (Throwable th) {
                    jzv.m147730c("MK---WebView", "", th);
                }
            } else {
                boolean zM219632o = zgiVarM17905C0 != null ? zgiVarM17905C0.m219632o() : false;
                jzv.m147732e("MK---WebView", "tang------预处理离线包，是否存在合法的离线包：" + zM219632o + "   预处理耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
                String strM206871g = wkw.m206870f(strConcat, this.f12099s) != null ? wkw.m206871g(strConcat, "_offline", "1") : "";
                if (!zM219632o || TextUtils.isEmpty(strM206871g)) {
                    strM219634q = zgiVarM17905C0 != null ? zgiVarM17905C0.m219634q(strConcat) : strConcat;
                    this.f12079a = false;
                    jzv.m147728a("MK---WebView", "tang------没有离线包,去检查更新 " + strM96329a);
                } else {
                    this.f12079a = true;
                    strM219634q = strM206871g;
                }
            }
            dlw.INSTANCE.m116899a(strM219634q, strM96329a);
        }
        String strM100378a = auf.INSTANCE.m100378a(strM219634q, this.f12052K);
        jzv.m147728a("MK---WebView", "tang-----最终访问的url " + strM100378a);
        try {
            if (!rs8.m182911b() && (strM100378a.contains(StringUtil.ALL_INTERFACES) || strConcat.contains(StringUtil.ALL_INTERFACES))) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("url", strConcat);
                MKCoreLogManager.m18427e().m18452o("最终访问的url", strM100378a, map);
            }
        } catch (Exception unused) {
        }
        xkw xkwVarM18431i = MKCoreLogManager.m18431i(getLogSessionKey());
        xkwVarM18431i.m211445T(strM96329a);
        xkwVarM18431i.m18483t(c3516h.f12113b);
        if (this.f12037B && fepGreyState != null) {
            String strM162966a = fepGreyState.m162966a();
            if (i8g0.m139002d(strM162966a)) {
                xkwVarM18431i.m18479p(strM162966a);
            }
        }
        zgi zgiVarM17905C1 = m17905C0(strConcat, CheckPolicy.LOCAL_ONLY);
        if (zgiVarM17905C1 != null) {
            String strM219631n = zgiVarM17905C1.m219631n();
            xkwVarM18431i.m18481r(strM219631n);
            jzv.m147728a("MK---WebView", "update bid: " + strM96329a + " version: " + strM219631n);
        }
        return strM100378a;
    }

    /* JADX INFO: renamed from: k1 */
    private void m17872k1() {
        gpj0 gpj0Var;
        removeAllViews();
        removeJavascriptInterface("mkAobj");
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        boolean z = sjw.m186318g() != null && sjw.m186318g().mo111755b();
        jzv.m147728a("MK---WebView", "postDestroyEnable " + z);
        if ((z || m17831L0()) && (gpj0Var = this.f12056M) != null) {
            gpj0Var.sendEmptyMessage(3);
        } else {
            jzv.m147728a("MK---WebView", "destroy directly");
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m17874l0(MKWebView mKWebView) {
        MKWebCaptureHelper mKWebCaptureHelper;
        if (mKWebView == null || (mKWebCaptureHelper = this.f12087i) == null) {
            return;
        }
        mKWebCaptureHelper.m18215j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public void m17875l1() {
        WhiteScreenLogTracker whiteScreenLogTracker = this.f12088j;
        if (whiteScreenLogTracker != null) {
            whiteScreenLogTracker.m18235f();
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m17877m0(String str) {
        jzv.m147728a("MK---WebView", "lehua:boost:debug checkInjectMonitor=" + str + "   isFirstUrl=" + this.f12067R0.get() + "  isNeedClearHistory=" + this.f12083e + "  delayInjectState=" + this.f12082d);
        DelayInjectState delayInjectState = this.f12082d;
        if (delayInjectState == DelayInjectState.WEBCACHE_WITHOUTLOAD_URL) {
            this.f12082d = DelayInjectState.NONE;
            m17927n1();
            m17885p1();
        } else if (delayInjectState == DelayInjectState.WEBCACHE_LOADING_URL && m17908N0(str)) {
            this.f12082d = DelayInjectState.WEBCACHE_LOADED_URL;
            m17885p1();
        } else if (this.f12082d == DelayInjectState.WEBCACHE_LOADED_URL && m17908N0(str)) {
            this.f12082d = DelayInjectState.NONE;
            m17883o1();
            this.f12083e = true;
            m17927n1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    private void m17878m1(int i, String str, String str2) {
        WhiteScreenLogTracker whiteScreenLogTracker = this.f12088j;
        if (whiteScreenLogTracker != null) {
            whiteScreenLogTracker.m18244o(getLogSessionKey(), Integer.valueOf(i), str, str2);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m17880n0(String str) {
        if (MKWebCaptureHelper.m18212i() && this.f12082d == DelayInjectState.NONE) {
            if (this.f12087i == null) {
                this.f12087i = new MKWebCaptureHelper();
            }
            this.f12087i.m18214g(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public boolean m17882o0(WebView webView, String str) {
        if (webView != null) {
            try {
                if (i8g0.m139002d(str) && (webView instanceof MKWebView)) {
                    Uri uri = Uri.parse(str);
                    Context realContext = ((MKWebView) webView).getRealContext();
                    boolean booleanQueryParameter = uri.getBooleanQueryParameter("_open_new_page", false);
                    boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("_open_close_self", false);
                    if (booleanQueryParameter) {
                        MKWebCommonActivity.m18151S2(realContext, str);
                    }
                    if (booleanQueryParameter2 && (realContext instanceof Activity)) {
                        ((Activity) realContext).finish();
                    }
                    if (booleanQueryParameter || booleanQueryParameter2) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                jzv.m147730c("MK---WebView", "", th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    private void m17883o1() {
        this.f12106z = false;
        this.f12066R = null;
        this.f12049I0 = System.currentTimeMillis();
        y35 y35Var = this.f12058N;
        if (y35Var != null && y35Var.f197306b) {
            y35Var.f197306b = false;
        }
        this.f12059N0 = true;
        this.f12067R0.set(true);
        this.f12069S0 = false;
    }

    /* JADX INFO: renamed from: p1 */
    private void m17885p1() {
        jzv.m147728a("MK---WebView", "lehua:boost resetWebClient=" + getUrl());
        setWebChromeClient(this.f12065Q0);
        setWebViewClient(this.f12071T0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public void m17887q0(String str) {
        m17889r0(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX INFO: renamed from: r0 */
    private void m17889r0(String str, Map<String, String> map) {
        String strM17871k0;
        this.f12070T = m17908N0(str) ? str : this.f12070T;
        C3516h c3516hM17862f1 = m17862f1(str);
        boolean zM17839Q0 = m17839Q0(str, c3516hM17862f1);
        if (zM17839Q0) {
            try {
                strM17871k0 = m17871k0(str, c3516hM17862f1);
            } catch (Exception e) {
                e = e;
                strM17871k0 = str;
                jzv.m147730c("MK---WebView", "", e);
                m17855Z0(zM17839Q0, c3516hM17862f1, str);
                if (m17841R0(map)) {
                    super.loadUrl(strM17871k0, map);
                } else {
                    super.loadUrl(strM17871k0);
                }
            }
        } else {
            strM17871k0 = str;
        }
        try {
            m17855Z0(zM17839Q0, c3516hM17862f1, str);
            jzv.m147732e("MK---WebView", "before loadUrl the webview width=" + getWidth() + ", height=" + getHeight());
            jzv.m147728a("MK---WebView", "lehua:boost:debug beforeLoadBoost=" + strM17871k0 + "   isFirstUrl=" + this.f12067R0.get() + "  isNeedClearHistory=" + this.f12083e + "  delayInjectState=" + this.f12082d);
            if (!hjw.INSTANCE.m135535g(this, strM17871k0, new C3509a(strM17871k0))) {
                if (m17841R0(map)) {
                    super.loadUrl(strM17871k0, map);
                    return;
                } else {
                    super.loadUrl(strM17871k0);
                    return;
                }
            }
            if (getContext() == null || mo17920e() || !this.f12067R0.get()) {
                return;
            }
            this.f12067R0.set(false);
        } catch (Exception e2) {
            e = e2;
            jzv.m147730c("MK---WebView", "", e);
            m17855Z0(zM17839Q0, c3516hM17862f1, str);
            if (m17841R0(map)) {
                super.loadUrl(strM17871k0, map);
            } else {
                super.loadUrl(strM17871k0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m17891s0(String str, byte[] bArr) {
        if (getWebDnsEnable() && FepConfigControlHelper.m18022c(str)) {
            this.f12061O0.put(str, bArr);
            super.loadUrl(str);
        } else {
            m17849W0(str, getClass().getSimpleName().concat("-continuePostUrl"));
            super.postUrl(str, bArr);
        }
        jzv.m147728a("MK---WebView", "tang-------MKWebView postUrl " + str);
    }

    private void setWebMonitorListener(grp0 grp0Var) {
        this.f12077W0 = grp0Var;
    }

    /* JADX INFO: renamed from: u0 */
    private Paint m17894u0() {
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public void m17895u1(@Nullable SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            zrp0.m221181e(this, sslError.getUrl(), sslErrorHandler, this.f12066R);
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    private WebResourceResponse m17897v0(WebView webView, String str) {
        WebResourceResponse webResourceResponseMo18185m;
        try {
            if (this.f12073U0 != null && this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (this.f12073U0 != null ? this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (this.f12073U0.get(i) != null) {
                        this.f12073U0.get(i).mo18132n(webView, str);
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        WebResourceResponse webResourceResponse = null;
        try {
            if (this.f12073U0 != null && this.f12073U0.size() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= (this.f12073U0 != null ? this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (this.f12073U0.get(i2) != null && (webResourceResponseMo18185m = this.f12073U0.get(i2).mo18185m(webView, str)) != null) {
                        webResourceResponse = webResourceResponseMo18185m;
                    }
                    i2++;
                }
            }
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: v1 */
    private void m17898v1() {
        try {
            Context context = this.f12054L;
            if (context == null || this.f12062P == null) {
                return;
            }
            jzv.m147728a("MK---WebView", "tang-------取消广播");
            rf3.m181166d(context.getApplicationContext(), this.f12062P);
            this.f12062P = null;
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m17902y0(String... strArr) {
        String string;
        if (strArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < strArr.length; i++) {
                stringBuffer.append("'");
                stringBuffer.append(strArr[i]);
                stringBuffer.append("'");
                if (i != strArr.length - 1) {
                    stringBuffer.append(Constants.SEPARATOR_COMMA);
                }
            }
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        Message messageObtainMessage = this.f12056M.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.obj = "javascript:window.mm&&window.mm.fireDocumentEvent(" + string + ")";
        this.f12056M.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: z0 */
    private String m17904z0() {
        return System.currentTimeMillis() + "_" + new Random().nextInt(123456);
    }

    /* JADX INFO: renamed from: C0 */
    public zgi m17905C0(String str, CheckPolicy checkPolicy) {
        return this.f12101u.m18488b(str, checkPolicy);
    }

    /* JADX INFO: renamed from: I0 */
    public void m17906I0(nlw nlwVar) {
        m17907J0(true, nlwVar);
    }

    /* JADX INFO: renamed from: J0 */
    public void m17907J0(boolean z, nlw nlwVar) {
        setRenderGoneCacheState(z);
        setMkWebRebuildData(nlwVar);
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m17908N0(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m17909O0() {
        return this.f12040E.get();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m17910S0() {
        return this.f12092m;
    }

    /* JADX INFO: renamed from: V0 */
    public void m17911V0(String str) {
        this.f12082d = DelayInjectState.WEBCACHE_LOADING_URL;
        loadUrl(str);
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: a */
    public void mo17912a() {
        reload();
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m17913a1() {
        if (TextUtils.isEmpty(this.f12041E0)) {
            return false;
        }
        mo17918d(this.f12041E0, null);
        return true;
    }

    @Override // p153l.g4k.InterfaceC17150a
    /* JADX INFO: renamed from: b */
    public void mo17914b(@NonNull String str, String str2) {
        m17935x0(str, str2, getOriginURL());
    }

    /* JADX INFO: renamed from: b1 */
    public void m17915b1() {
        m17875l1();
        MKCoreLogManager.m18431i(getLogSessionKey()).m18476l();
        MKCoreLogManager.m18425c(getLogSessionKey());
        g4k g4kVarM186316e = sjw.m186316e();
        if (g4kVarM186316e != null) {
            g4kVarM186316e.mo128893b(this);
        }
        this.f12093n = null;
        this.f12073U0 = null;
        this.f12076W = null;
        this.f12047H0 = null;
        if (getWebMonitorListener() != null) {
            getWebMonitorListener().dispose();
            this.f12077W0 = null;
        }
        m17898v1();
        m17872k1();
        this.f12060O = true;
        this.f12090k0 = null;
        this.f12054L = null;
        ylw.m216640a().m216642c(this);
        auf.INSTANCE.m100384i(this.f12052K);
        arw arwVar = this.f12084f;
        if (arwVar != null) {
            arwVar.m99784a();
        }
        ekw ekwVar = this.f12097q;
        if (ekwVar != null) {
            ekwVar.m121085b();
        }
        m17874l0(this);
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: c */
    public synchronized String mo17916c(String str) {
        try {
            if (this.f12097q == null) {
                this.f12097q = new ekw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12097q.m121084a(str);
    }

    /* JADX INFO: renamed from: c1 */
    public void m17917c1(boolean z) {
        if (sjw.m186318g() != null && sjw.m186318g().mo111757d() && !this.f12053K0) {
            jzv.m147734g("webRsa", "onPause called");
            super.onPause();
        }
        jzv.m147728a("MK---WebView", "tang------MKWebView  ----onPause:" + this.f12052K);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", z ? "webview" : "home");
            MKCoreLogManager.m18431i(getLogSessionKey()).m211439N();
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
        fqq bridgeProcessor = getBridgeProcessor();
        if (bridgeProcessor != null) {
            bridgeProcessor.m126794j();
        }
        m17902y0("bridgeEvent", "pause", jSONObject.toString(), getUrl());
        this.f12057M0 = false;
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        if (this.f12067R0.get()) {
            return false;
        }
        return super.canGoBack();
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: d */
    public void mo17918d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (lf3.m153969a()) {
            lf3.m153971c(new mf3(str, Uri.decode(str2)));
        }
        gpj0 gpj0Var = this.f12056M;
        if (str2 != null) {
            gpj0Var.sendMessage(m17866i0(1, new String[]{"callback", "value"}, new String[]{str, str2}));
        } else {
            gpj0Var.sendMessage(m17866i0(1, new String[]{"callback"}, new String[]{str}));
        }
        if (!this.f12092m || this.f12091l == null) {
            return;
        }
        jzv.m147732e("MK---WebView", "insertCallback mkWebRebuildData=" + str);
        this.f12091l.m163783c(str, str2);
    }

    /* JADX INFO: renamed from: d1 */
    public void m17919d1() {
        super.onPause();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        setDestroyed(true);
        m17875l1();
        if (this.f12086h) {
            mjw.INSTANCE.m158640r(this);
        }
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: e */
    public boolean mo17920e() {
        return this.f12060O;
    }

    /* JADX INFO: renamed from: e1 */
    public void m17921e1() {
        super.onResume();
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: f */
    public void mo17922f(String str) {
        loadUrl(str);
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: g */
    public void mo17923g(String str) {
        this.f12043F0 = str;
    }

    @Override // p153l.hul
    public String getBid() {
        return this.f12045G0;
    }

    @Override // p153l.hul
    public gjw getBoost() {
        return this.f12081c;
    }

    public fqq getBridgeProcessor() {
        return this.f12076W;
    }

    public y35 getCheckOfflineInfo() {
        if (this.f12058N == null) {
            y35 y35Var = new y35();
            this.f12058N = y35Var;
            y35Var.f197306b = false;
            y35Var.f197305a = new WeakReference<>(this);
        }
        return this.f12058N;
    }

    @Override // p153l.hul
    public ViewGroup getContainerScaleView() {
        return this.f12093n;
    }

    public String getCurrentLogKey() {
        return mkw.m158842e(getWebViewId(), "OpenURL", this.f12064Q);
    }

    @Override // p153l.hul
    public String getLogSessionKey() {
        return hashCode() + "";
    }

    public MKWebCaptureHelper getMkWebCaptureHelper() {
        return this.f12087i;
    }

    @Override // p153l.hul
    public nlw getMkWebRebuildData() {
        return this.f12091l;
    }

    @Override // p153l.hul
    public String getOriginURL() {
        return this.f12064Q;
    }

    public String getPageUID() {
        return this.f12039D;
    }

    public String getPayCallback() {
        return this.f12096p0;
    }

    @Override // p153l.hul
    public Context getRealContext() {
        Context context = getContext();
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextThemeWrapper) {
            return ((ContextThemeWrapper) context).getBaseContext();
        }
        if (context instanceof r26) {
            return ((r26) context).getBaseContext();
        }
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }

    @Override // p153l.hul
    public x4d0 getResourceResponse() {
        return this.f12099s;
    }

    @Override // p153l.hul
    public WebView getView() {
        return this;
    }

    public Object getViewTag() {
        return getTag();
    }

    @Override // p153l.hul
    public Context getWebContext() {
        return getContext();
    }

    public grp0 getWebMonitorListener() {
        if (getBid() != null) {
            return this.f12077W0;
        }
        return null;
    }

    @Override // p153l.hul
    public String getWebViewId() {
        return this.f12052K;
    }

    @Override // p153l.hul
    public ViewParent getWebViewParent() {
        return getParent();
    }

    @Override // p153l.hul
    public WebViewPkgInfoCache getWebViewPkgInfoCache() {
        return this.f12101u;
    }

    @Override // p153l.hul
    public String getWebViewUrl() {
        return getUrl();
    }

    @Override // p153l.hul
    public String getWebWorkerId() {
        return getWorkerId();
    }

    @Nullable
    public String getWorkerId() {
        arw arwVar = this.f12084f;
        return arwVar == null ? "" : arwVar.f72991a;
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: h */
    public void mo17924h(String str) {
        this.f12041E0 = str;
    }

    /* JADX INFO: renamed from: h0 */
    public void m17925h0(ilw ilwVar) {
        this.f12073U0.add(ilwVar);
    }

    @Override // p153l.hul
    /* JADX INFO: renamed from: i */
    public void mo17926i(@NonNull String str, @NonNull ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    @Override // p153l.hul
    public boolean isDestroyed() {
        return this.f12042F;
    }

    @Override // p153l.hul
    public boolean isVisible() {
        return this.f12057M0;
    }

    @Override // com.hellogroup.p036mk.business.base.p037ui.BaseWebView, android.webkit.WebView
    public final void loadUrl(String str) {
        m17846U0(str, null);
    }

    /* JADX INFO: renamed from: n1 */
    public void m17927n1() {
        setWebMonitorListener(MKWebMonitorManager.INSTANCE.m18254i());
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m17825H0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m17898v1();
        auf.INSTANCE.m100384i(this.f12052K);
        dlw.INSTANCE.m116906m(this.f12064Q);
        mjw.INSTANCE.m158639q();
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12050J > 0) {
            m17851X0(canvas);
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        super.onResume();
        jzv.m147728a("MK---WebView", "tang------MKWebView  ----onResume:" + this.f12052K);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f12059N0 ? "webview" : "home");
            jSONObject.put("hidden", false);
            MKCoreLogManager.m18431i(getLogSessionKey()).m211442Q();
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
        m17902y0("bridgeEvent", "resume", jSONObject.toString(), getUrl());
        fqq bridgeProcessor = getBridgeProcessor();
        if (bridgeProcessor != null) {
            bridgeProcessor.m126795k();
        }
        this.f12057M0 = true;
        this.f12059N0 = false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f12050J > 0) {
            invalidate();
        }
        ArrayList<InterfaceC3515g> arrayList = this.f12078X0;
        if (arrayList != null) {
            Iterator<InterfaceC3515g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m17941a(i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m17928p0() {
        nlw nlwVar = this.f12091l;
        if (nlwVar != null) {
            nlwVar.m163781a();
        }
    }

    @Override // com.hellogroup.p036mk.business.base.p037ui.BaseWebView, android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (m17868j0(bArr, str)) {
            return;
        }
        m17891s0(str, bArr);
    }

    /* JADX INFO: renamed from: q1 */
    public void m17929q1(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IntlMarketToken.theme, z ? "dark" : OMSFontStyle.light);
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
        m17902y0("bridgeEvent", "themeChange", jSONObject.toString(), getUrl());
    }

    /* JADX INFO: renamed from: r1 */
    public void m17930r1(ViewGroup viewGroup, int i, int i2) {
        m17931s1(viewGroup, i, i2, false);
    }

    /* JADX INFO: renamed from: s1 */
    public void m17931s1(ViewGroup viewGroup, int i, int i2, boolean z) {
        cjw cjwVar;
        this.f12093n = viewGroup;
        this.f12094o = i;
        this.f12095p = i2;
        if (!z || (cjwVar = this.f12055L0) == null) {
            return;
        }
        cjwVar.m110286b(this.f12064Q, this, viewGroup, Boolean.TRUE);
    }

    public void setDebuggable(boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
        if (z) {
            WebSettings settings = getSettings();
            settings.setDatabaseEnabled(false);
            settings.setCacheMode(2);
        }
    }

    public void setDestroyed(boolean z) {
        this.f12042F = z;
    }

    public void setInterceptPause(boolean z) {
        this.f12053K0 = z;
    }

    public void setLoadedCapture(boolean z) {
        this.f12040E.set(z);
    }

    public void setMKPreLoadingUrlProcessor(tm80 tm80Var) {
        this.f12075V0 = tm80Var;
    }

    public void setMKWebLoadListener(ilw ilwVar) {
        m17925h0(ilwVar);
    }

    public void setMkWebRebuildData(nlw nlwVar) {
        this.f12091l = nlwVar;
    }

    public void setOnLoadUrlListener(InterfaceC3514f interfaceC3514f) {
        this.f12047H0 = interfaceC3514f;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            jzv.m147730c("MK---WebView", "", th);
        }
    }

    public void setPageUID(String str) {
        this.f12039D = str;
    }

    public void setPayCallback(String str) {
        this.f12096p0 = str;
    }

    public void setRenderGoneCacheState(boolean z) {
        this.f12092m = z;
    }

    public void setRoundCorner(int i) {
        this.f12050J = i;
        invalidate();
    }

    public void setWebChooseFile(wam wamVar) {
        this.f12090k0 = wamVar;
    }

    @Override // p153l.hul
    public void setWebDrawingCacheEnabled(boolean z) {
        setDrawingCacheEnabled(z);
    }

    public void setWebUserAgent(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12051J0);
        sb.append(str != null ? MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.concat(str) : "");
        this.f12063P0 = sb.toString();
        getSettings().setUserAgentString(this.f12063P0);
        try {
            boolean z = sjw.m186318g() != null && sjw.m186318g().mo111756c();
            MKCoreLogManager.m18431i(getLogSessionKey()).m18482s(this.f12063P0);
            MKCoreLogManager.m18431i(getLogSessionKey()).m18478o(z);
            jzv.m147728a("MK---WebView", "update ua: " + this.f12063P0 + " useDns: " + z);
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
        }
        auf.INSTANCE.m100388m(this.f12052K, this.f12063P0);
    }

    @Override // p153l.hul
    public void setWebViewPost(Runnable runnable) {
        post(runnable);
    }

    /* JADX INFO: renamed from: t0 */
    public void m17932t0(brw brwVar) {
        if (zqw.m221054f(brwVar.m106165d())) {
            return;
        }
        this.f12084f = zqw.m221051c(brwVar);
        this.f12085g = false;
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m17933t1(WebView webView, String str) {
        boolean z = false;
        try {
            if (this.f12073U0 == null || this.f12073U0.size() <= 0) {
                return false;
            }
            boolean zMo18186o = false;
            for (int i = 0; i < this.f12073U0.size(); i++) {
                try {
                    ilw ilwVar = this.f12073U0.get(i);
                    if (ilwVar != null) {
                        zMo18186o = ilwVar.mo18186o(webView, str);
                    }
                } catch (Throwable th) {
                    th = th;
                    z = zMo18186o;
                    jzv.m147730c("MK---WebView", "", th);
                    return z;
                }
            }
            return zMo18186o;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m17934w0(String str) {
        try {
            return yfi.m215599o() && i8g0.m138999a(glw.m130709f(this.f12066R), glw.m130709f(str)) && !m17844T0();
        } catch (Exception e) {
            jzv.m147730c("MK---WebView", "", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m17935x0(String str, String str2, @Nullable String str3) {
        m17902y0("bridgeEvent", str, str2, str3);
    }

    public class MKBroadcastReceiver extends BroadcastReceiver {
        private MKBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.immomo.momo.mk.post_message".equals(intent.getAction())) {
                MKWebView.this.m17867i1(intent);
            }
        }

        public /* synthetic */ MKBroadcastReceiver(MKWebView mKWebView, C3509a c3509a) {
            this();
        }
    }

    @Override // com.hellogroup.p036mk.business.base.p037ui.BaseWebView, android.webkit.WebView
    @Deprecated
    public void loadUrl(String str, Map<String, String> map) {
        loadUrl(str);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$c */
    public class C3511c extends jri {
        public C3511c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo17977a(consoleMessage);
                    }
                    i++;
                }
            }
            ConsoleMessage.MessageLevel messageLevel = ConsoleMessage.MessageLevel.ERROR;
            if (messageLevel.equals(consoleMessage.messageLevel())) {
                String strMessage = consoleMessage.message();
                String strM107681b = c2f.m107681b(strMessage);
                if (TextUtils.isEmpty(strM107681b)) {
                    strM107681b = consoleMessage.message();
                }
                if (TextUtils.isEmpty(strM107681b) || !strM107681b.startsWith("[WE]")) {
                    MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211430E(strM107681b);
                } else {
                    MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211449X(strM107681b);
                }
                if (MKWebView.this.f12038C) {
                    qgi.m176477a("mk", MKWebView.this.getUrl(), MKWebView.this.f12045G0, strMessage);
                }
            } else {
                MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211431F(consoleMessage.message());
            }
            if (MKWebView.this.getWebMonitorListener() != null && messageLevel.equals(consoleMessage.messageLevel())) {
                MKWebView.this.getWebMonitorListener().mo18263d(MKWebView.this.f12064Q, -1, consoleMessage.message(), MKWebView.this.f12064Q);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            glw.m130717n(MKWebView.this, str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView == null || webView.getContext() == null || MKWebView.this.mo17920e()) {
                return false;
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo18180b(webView, str, str2, jsResult);
                    }
                    i++;
                }
            }
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView == null || webView.getContext() == null || MKWebView.this.mo17920e()) {
                return false;
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo18181c(webView, str, str2, jsResult);
                    }
                    i++;
                }
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (MKWebView.this.getContext() == null || webView == null || webView.getContext() == null || MKWebView.this.mo17920e()) {
                return true;
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo18182d(webView, str, str2, str3, jsPromptResult);
                    }
                    i++;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        bfe0.m103889d(str);
                    }
                    String str4 = str2;
                    MKWebView.this.m17865h1(str4);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    jzv.m147728a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis2 + "       " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
                    jsPromptResult.cancel();
                    if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                                break;
                            }
                            if (MKWebView.this.f12073U0.get(i2) != null) {
                                ((ilw) MKWebView.this.f12073U0.get(i2)).mo18182d(webView, str, str4, str3, jsPromptResult);
                            }
                            i2++;
                            str4 = str2;
                        }
                    }
                } catch (MKUrlNotSafeException e) {
                    jzv.m147730c("MK---WebView", "", e);
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    jzv.m147728a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis3 + "       " + (jCurrentTimeMillis3 - jCurrentTimeMillis) + "ms");
                    jsPromptResult.cancel();
                    if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                                break;
                            }
                            if (MKWebView.this.f12073U0.get(i3) != null) {
                                ((ilw) MKWebView.this.f12073U0.get(i3)).mo18182d(webView, str, str2, str3, jsPromptResult);
                            }
                            i3++;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                jzv.m147728a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis4 + "       " + (jCurrentTimeMillis4 - jCurrentTimeMillis) + "ms");
                jsPromptResult.cancel();
                if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                            break;
                        }
                        if (MKWebView.this.f12073U0.get(i4) != null) {
                            ((ilw) MKWebView.this.f12073U0.get(i4)).mo18182d(webView, str, str2, str3, jsPromptResult);
                        }
                        i4++;
                    }
                }
                throw th;
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (!MKWebView.this.f12105y && i > 30) {
                MKWebView.this.f12105y = true;
                c2f.m107684e(MKWebView.this, "onProgressChanged");
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i2) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i2)).mo18130h(webView, i);
                    }
                    i2++;
                }
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo18265f(webView, i);
            }
            try {
                if (MKWebView.this.f12088j != null) {
                    MKWebView.this.f12088j.m18240k(Integer.valueOf(i));
                }
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
            if (MKWebView.this.f12073U0 == null || MKWebView.this.f12073U0.size() <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                    return;
                }
                if (MKWebView.this.f12073U0.get(i) != null) {
                    ((ilw) MKWebView.this.f12073U0.get(i)).mo18183i(webView, bitmap);
                }
                i++;
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            String currentLogKey = MKWebView.this.getCurrentLogKey();
            pxl pxlVarM158846g = mkw.m158843f().m158846g(currentLogKey);
            if (pxlVarM158846g != null) {
                vkw vkwVar = (vkw) pxlVarM158846g;
                vkwVar.m201587p();
                mkw.m158843f().m158847h(currentLogKey, vkwVar);
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo17981k(webView, str);
                    }
                    i++;
                }
            }
            auf.INSTANCE.m100389n(MKWebView.this.f12052K, str);
            if (MKWebView.this.f12088j != null) {
                MKWebView.this.f12088j.m18242m(str);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (MKWebView.this.f12090k0 == null || MKWebView.this.f12090k0.mo135787d()) {
                return true;
            }
            MKWebView.this.f12090k0.mo135785b(null, valueCallback);
            MKWebView.this.f12090k0.mo135786c(new wam.C21057a(fileChooserParams));
            MKWebView.this.f12090k0.mo135789f();
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (MKWebView.this.f12090k0 == null || MKWebView.this.f12090k0.mo135787d()) {
                return;
            }
            MKWebView.this.f12090k0.mo135785b(valueCallback, null);
            MKWebView.this.f12090k0.mo135786c(new wam.C21057a(str));
            MKWebView.this.f12090k0.mo135789f();
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            openFileChooser(valueCallback, str, null);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            openFileChooser(valueCallback, "");
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebView$d */
    public class C3512d extends WebViewClient {
        private long lastSafeBrowsingHitT = 0;

        public C3512d() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            jzv.m147728a("MK---WebView", "lehua:boost:debug doUpdateVisitedHistory:before=" + str + "   isFirstUrl=" + MKWebView.this.f12067R0.get() + "  isNeedClearHistory=" + MKWebView.this.f12083e + "  delayInjectState=" + MKWebView.this.f12082d);
            if (MKWebView.this.f12083e) {
                jzv.m147728a("MK---WebView", "lehua:boost doUpdateVisitedHistory clearHistory: " + str);
                webView.clearHistory();
                MKWebView.this.f12083e = false;
            }
            jzv.m147728a("MK---WebView", "lehua:boost:debug doUpdateVisitedHistory:after=" + str + "   isFirstUrl=" + MKWebView.this.f12067R0.get() + "  isNeedClearHistory=" + MKWebView.this.f12083e + "  delayInjectState=" + MKWebView.this.f12082d);
        }

        public void onDealRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (MKWebView.this.f12073U0 == null || MKWebView.this.f12073U0.size() <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        return;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo18131l(webView, renderProcessGoneDetail);
                    }
                    i++;
                }
            } catch (Throwable th) {
                jzv.m147730c("MK---WebView", "", th);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            try {
                if (rs8.m182914e()) {
                    MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211436K(str);
                }
                if (MKWebView.this.f12088j != null) {
                    MKWebView.this.f12088j.m18238i(str);
                }
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            String currentLogKey;
            pxl pxlVarM158846g;
            MKCoreLogManager.m18427e().m18458u(MKWebView.this.f12064Q, str, MKWebView.this.f12045G0);
            MKWebView.this.m17875l1();
            if (webView == null || webView.getContext() == null || MKWebView.this.mo17920e()) {
                return;
            }
            jzv.m147728a("MK---WebView", "lehua:boost:debug onPageFinished=" + str + "   isFirstUrl=" + MKWebView.this.f12067R0.get() + "  isNeedClearHistory=" + MKWebView.this.f12083e + "  delayInjectState=" + MKWebView.this.f12082d);
            if (!glw.m130710g(str) && MKWebView.this.f12067R0.get()) {
                MKWebView.this.f12067R0.set(false);
                webView.clearHistory();
            }
            MKWebView.this.f12089k.set(false);
            MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211437L(str);
            super.onPageFinished(webView, str);
            if (!MKWebView.this.f12105y) {
                MKWebView.this.f12105y = true;
                c2f.m107684e(MKWebView.this, "onPageFinished");
            }
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo17979f(webView, str);
                    }
                    i++;
                }
            }
            auf.INSTANCE.m100385j(MKWebView.this.f12052K, str);
            if ((MKWebView.this.m17908N0(str) || MKWebView.this.m17837P0(str)) && (pxlVarM158846g = mkw.m158843f().m158846g((currentLogKey = MKWebView.this.getCurrentLogKey()))) != null) {
                vkw vkwVar = (vkw) pxlVarM158846g;
                vkwVar.m201585n();
                vkwVar.m201584m();
                vkwVar.m116157g();
                mkw.m158843f().m158849j(vkwVar);
                mkw.m158843f().m158848i(currentLogKey);
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo18261b(webView, str);
            }
            try {
                if (MKWebView.this.f12047H0 != null && yfi.m215599o() && !MKWebView.this.f12069S0) {
                    MKWebView.this.f12069S0 = true;
                    jzv.m147734g("MK---WebView", "低版本手机，onPageFinished 关闭UI增强");
                    MKWebView.this.f12047H0.mo17937a(MKWebView.this.f12066R);
                    MKWebView.this.f12047H0.mo17938b(MKWebView.this.f12066R);
                }
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
            dlw.INSTANCE.m116906m(MKWebView.this.f12064Q);
            OfflinePkgCheckUtil.m18228a(MKWebView.this.getCheckOfflineInfo(), MKWebView.this.f12099s);
            jzv.m147728a("webRsa", String.format("mk loadFinished cost: %d ms", Long.valueOf(System.currentTimeMillis() - MKWebView.this.f12049I0)));
            MKWebView mKWebView = MKWebView.this;
            mKWebView.m17874l0(mKWebView);
            if (!MKWebView.this.f12046H) {
                MKWebView mKWebView2 = MKWebView.this;
                mKWebView2.f12046H = yfi.m215587c(mKWebView2, mKWebView2.f12045G0);
            }
            yfi.m215589e(MKWebView.this, str);
            MKWebView.this.f12048I = true;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String currentLogKey;
            pxl pxlVarM158846g;
            super.onPageStarted(webView, str, bitmap);
            MKWebView.this.f12106z = true;
            MKWebView.this.f12105y = false;
            try {
                if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                            break;
                        }
                        if (MKWebView.this.f12073U0.get(i) != null) {
                            ((ilw) MKWebView.this.f12073U0.get(i)).mo17980g(webView, str, bitmap);
                        }
                        i++;
                    }
                    MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211438M(str);
                    if ((MKWebView.this.m17908N0(str) || MKWebView.this.m17837P0(str)) && (pxlVarM158846g = mkw.m158843f().m158846g((currentLogKey = MKWebView.this.getCurrentLogKey()))) != null) {
                        vkw vkwVar = (vkw) pxlVarM158846g;
                        vkwVar.m201586o();
                        mkw.m158843f().m158847h(currentLogKey, vkwVar);
                    }
                    if (MKWebView.this.getWebMonitorListener() != null && MKWebView.this.getBid() != null) {
                        MKWebView.this.getWebMonitorListener().mo18260a(webView, str, bitmap);
                    }
                    if (MKWebView.this.f12088j != null) {
                        MKWebView.this.f12088j.m18239j();
                    }
                    if (MKWebView.this.f12044G) {
                    }
                    MKWebView mKWebView = MKWebView.this;
                    mKWebView.f12044G = yfi.m215588d(mKWebView, mKWebView.f12045G0);
                }
                MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211438M(str);
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
            if (MKWebView.this.m17908N0(str)) {
                vkw vkwVar2 = (vkw) pxlVarM158846g;
                vkwVar2.m201586o();
                mkw.m158843f().m158847h(currentLogKey, vkwVar2);
            } else {
                vkw vkwVar3 = (vkw) pxlVarM158846g;
                vkwVar3.m201586o();
                mkw.m158843f().m158847h(currentLogKey, vkwVar3);
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo18260a(webView, str, bitmap);
            }
            if (MKWebView.this.f12088j != null) {
                MKWebView.this.f12088j.m18239j();
            }
            if (MKWebView.this.f12044G) {
                MKWebView mKWebView2 = MKWebView.this;
                mKWebView2.f12044G = yfi.m215588d(mKWebView2, mKWebView2.f12045G0);
            }
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            MKWebView.this.m17821F0(webView, webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "");
            MKWebView.this.m17853Y0("ERR_2.1", "onReceivedError2", webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "");
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                boolean zM138999a = i8g0.m138999a(webResourceRequest.getUrl().toString(), MKWebView.this.f12066R);
                String string = webResourceRequest.getUrl().toString();
                if (MKWebView.this.m17833M0(string) && MKWebView.this.f12047H0 != null && MKWebView.this.m17934w0(string)) {
                    MKWebView.this.f12047H0.mo17940d(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
                }
                MKWebView.this.m17853Y0(zM138999a ? "ERR_1.3" : "ERR_2.1", zM138999a ? "Html Fail" : "onReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
                if (MKWebView.this.f12088j != null) {
                    MKWebView.this.f12088j.m18241l(webResourceResponse);
                }
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            jzv.m147729b("MK---WebView", "tang------onReceivedSslError " + sslError);
            jzv.m147729b("DNSTest", "mkweb dns error: " + sslError);
            if (MKWebView.this.getContext() != null) {
                MKWebView.this.m17895u1(sslErrorHandler, sslError);
            }
            MKWebView.this.m17869j1(-8888, sslError != null ? sslError.toString() : null);
            if (MKWebView.this.f12073U0 != null && MKWebView.this.f12073U0.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f12073U0 != null ? MKWebView.this.f12073U0.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f12073U0.get(i) != null) {
                        ((ilw) MKWebView.this.f12073U0.get(i)).mo18184j(webView, sslErrorHandler, sslError);
                    }
                    i++;
                }
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo18264e(MKWebView.this.getOriginURL(), sslErrorHandler, sslError);
            }
            if (sslError != null) {
                MKWebView.this.m17853Y0("ERR_2.1", "onReceivedSslError", sslError.getUrl(), sslError.getPrimaryError(), sslError.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (MKWebView.this.m17910S0() && MKWebView.this.f12091l == null) {
                MKWebView.this.f12091l = new nlw();
            }
            boolean zDidCrash = renderProcessGoneDetail.didCrash();
            MKWebView mKWebView = MKWebView.this;
            if (!zDidCrash) {
                MKCoreLogManager.m18431i(mKWebView.getLogSessionKey()).m211441P("System killed the WebView rendering process for out of memory, RendererPriority: " + renderProcessGoneDetail.rendererPriorityAtExit());
                if (MKWebView.this.f12080b != null) {
                    ViewParent parent = MKWebView.this.f12080b.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(MKWebView.this.f12080b);
                        if (!MKWebView.this.m17910S0()) {
                            MKWebView.this.f12080b.destroy();
                        }
                        MKWebView.this.f12080b = null;
                    }
                }
                onDealRenderProcessGone(webView, renderProcessGoneDetail);
                return true;
            }
            MKCoreLogManager.m18431i(mKWebView.getLogSessionKey()).m211441P("The WebView rendering process crashed! RendererPriority: " + renderProcessGoneDetail.rendererPriorityAtExit());
            MKCoreLogManager.m18427e().m18461x(MKWebView.this.f12066R, MKWebView.this.f12045G0, Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), Boolean.valueOf(sjw.m186325n()));
            if (MKWebView.this.f12080b != null) {
                ViewParent parent2 = MKWebView.this.f12080b.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(MKWebView.this.f12080b);
                    if (!MKWebView.this.m17910S0()) {
                        MKWebView.this.f12080b.destroy();
                    }
                    MKWebView.this.f12080b = null;
                }
            }
            onDealRenderProcessGone(webView, renderProcessGoneDetail);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            String str;
            Uri url;
            super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.lastSafeBrowsingHitT < 1000) {
                return;
            }
            this.lastSafeBrowsingHitT = jUptimeMillis;
            if (MKWebView.this.f12106z) {
                return;
            }
            String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? "" : url.toString();
            if (i == 1) {
                str = "SAFE_BROWSING_THREAT_MALWARE";
            } else if (i == 2) {
                str = "SAFE_BROWSING_THREAT_PHISHING";
            } else if (i != 3) {
                str = i != 4 ? "SAFE_BROWSING_THREAT_UNKNOWN" : "SAFE_BROWSING_THREAT_BILLING";
            } else {
                str = "SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE";
            }
            jzv.m147734g("MK---WebView", "onSafeBrowsingHit,threatType: " + i + ",URL: " + string);
            MKCoreLogManager.m18431i(MKWebView.this.getLogSessionKey()).m211440O(str + "(threatType=" + i + ")", string);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            WebResourceResponse webResourceResponseM17817D0 = MKWebView.this.m17817D0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest);
            if (MKWebView.this.f12088j != null) {
                MKWebView.this.f12088j.m18237h(webResourceRequest.getUrl().toString(), webResourceResponseM17817D0);
            }
            if (webResourceResponseM17817D0 != null) {
                return webResourceResponseM17817D0;
            }
            try {
                jzv.m147729b("DNSTest", "lehua:offline  加载线上资源: mkweb handleAllRequest failed: " + webResourceRequest.getUrl().toString());
            } catch (Exception e) {
                jzv.m147730c("MK---WebView", "", e);
            }
            String string = webResourceRequest.getUrl().toString();
            WebResourceResponse webResourceResponseM100382g = auf.INSTANCE.m100382g(webResourceRequest, MKWebView.this.f12061O0, webView);
            return webResourceResponseM100382g != null ? webResourceResponseM100382g : super.shouldInterceptRequest(webView, string);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z = MKWebView.this.f12075V0 != null && MKWebView.this.f12075V0.mo171747a(str);
            jzv.m147728a("MK---WebView", "tang------shouldOverrideUrlLoading " + str + "   hasProcessed " + z);
            if (z) {
                jzv.m147728a("MK---WebView", "tang------shouldOverrideUrlLoading 已经被处理，不需要额外处理");
                return true;
            }
            if (MKWebView.this.m17933t1(webView, str)) {
                return true;
            }
            if (bwi0.m106699a(str)) {
                jzv.m147728a("MK---WebView", "url host in 3rd white host list");
                return false;
            }
            if (MKWebView.this.m17882o0(webView, str)) {
                return true;
            }
            MKWebView.this.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            MKWebView.this.m17821F0(webView, str2, i, str);
            MKWebView.this.m17853Y0("ERR_2.1", "onReceivedError1", str2, i, str);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse webResourceResponseM17817D0 = MKWebView.this.m17817D0(webView, str, null, null);
            if (MKWebView.this.f12088j != null) {
                MKWebView.this.f12088j.m18237h(str, webResourceResponseM17817D0);
            }
            if (webResourceResponseM17817D0 != null) {
                return webResourceResponseM17817D0;
            }
            jzv.m147729b("DNSTest", "lehua:offline 加载线上资源: mkweb handleAllRequest failed: " + str);
            jzv.m147728a("MK---WebView", "shouldInterceptRequest=====" + str);
            return super.shouldInterceptRequest(webView, str);
        }
    }

    public MKWebView(Context context) {
        super(m17812A0(context));
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        m17823G0(context);
    }

    public MKWebView(Context context, brw brwVar) {
        super(m17812A0(context));
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        m17932t0(brwVar);
        m17823G0(context);
    }

    public MKWebView(Context context, AttributeSet attributeSet) {
        super(m17812A0(context), attributeSet);
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        m17823G0(context);
    }

    public MKWebView(Context context, AttributeSet attributeSet, int i) {
        super(m17812A0(context), attributeSet, i);
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        m17823G0(context);
    }

    @TargetApi(21)
    public MKWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(m17812A0(context), attributeSet, i, i2);
        this.f12080b = null;
        this.f12081c = new gjw();
        this.f12082d = DelayInjectState.NONE;
        this.f12083e = false;
        this.f12084f = null;
        this.f12085g = true;
        this.f12086h = false;
        this.f12089k = new AtomicBoolean(f12034Y0);
        this.f12091l = null;
        this.f12092m = false;
        this.f12093n = null;
        this.f12094o = 0;
        this.f12095p = 0;
        this.f12098r = new HashSet();
        this.f12100t = "";
        this.f12101u = new WebViewPkgInfoCache();
        this.f12105y = false;
        this.f12106z = false;
        this.f12036A = -1L;
        this.f12037B = false;
        this.f12038C = false;
        this.f12040E = new AtomicBoolean(false);
        this.f12042F = false;
        this.f12044G = false;
        this.f12046H = false;
        this.f12048I = false;
        this.f12050J = 0;
        this.f12060O = false;
        this.f12068S = Boolean.valueOf(yfi.m215604t());
        this.f12074V = true;
        this.f12049I0 = -1L;
        this.f12053K0 = false;
        this.f12057M0 = true;
        this.f12059N0 = true;
        this.f12061O0 = new HashMap();
        this.f12063P0 = "";
        this.f12065Q0 = new C3511c();
        this.f12067R0 = new AtomicBoolean(true);
        this.f12069S0 = false;
        this.f12071T0 = new C3512d();
        this.f12073U0 = new ArrayList();
        m17823G0(context);
    }
}
