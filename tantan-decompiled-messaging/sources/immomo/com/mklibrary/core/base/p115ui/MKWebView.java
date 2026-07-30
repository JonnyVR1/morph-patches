package immomo.com.mklibrary.core.base.p115ui;

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
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mmdns.MDDNSEntrance;
import com.immomo.mmdns.WebDNSHandler;
import com.immomo.mmdns.WebFDTDNSHandler;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import immomo.com.mklibrary.core.safety.MKPathNotSafeException;
import immomo.com.mklibrary.core.safety.MKUrlNotSafeException;
import immomo.com.mklibrary.core.utils.MKWebCaptureHelper;
import immomo.com.mklibrary.server.LocalServerHandler;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import p149l.AbstractC17922k4;
import p149l.aip0;
import p149l.ani0;
import p149l.aow;
import p149l.ax00;
import p149l.b0g0;
import p149l.bjw;
import p149l.bow;
import p149l.cih0;
import p149l.cip0;
import p149l.cow;
import p149l.df3;
import p149l.dgj0;
import p149l.ee80;
import p149l.ehw;
import p149l.fhw;
import p149l.foq;
import p149l.g8m;
import p149l.giw;
import p149l.gnw;
import p149l.iei;
import p149l.ig3;
import p149l.ihw;
import p149l.ii5;
import p149l.jxv;
import p149l.k33;
import p149l.liw;
import p149l.lxv;
import p149l.m16;
import p149l.mei;
import p149l.miw;
import p149l.mxv;
import p149l.na20;
import p149l.ne80;
import p149l.nhw;
import p149l.noi;
import p149l.oiq;
import p149l.oiw;
import p149l.onw;
import p149l.q4m;
import p149l.qsf;
import p149l.shp0;
import p149l.shw;
import p149l.uei;
import p149l.uhp0;
import p149l.uhw;
import p149l.uip0;
import p149l.v750;
import p149l.vei;
import p149l.vhw;
import p149l.w6e0;
import p149l.whw;
import p149l.xbr;
import p149l.xe3;
import p149l.xul;
import p149l.y0f;
import p149l.yhw;
import p149l.ywm;
import p149l.ze3;
import p149l.zhw;
import p149l.zwm;

/* JADX INFO: loaded from: classes2.dex */
public class MKWebView extends BaseWebView {

    /* JADX INFO: renamed from: A */
    private boolean f63219A;

    /* JADX INFO: renamed from: B */
    private BroadcastReceiver f63220B;

    /* JADX INFO: renamed from: C */
    private String f63221C;

    /* JADX INFO: renamed from: D */
    private String f63222D;

    /* JADX INFO: renamed from: E */
    private String f63223E;

    /* JADX INFO: renamed from: E0 */
    private ArrayList<InterfaceC14915h> f63224E0;

    /* JADX INFO: renamed from: F */
    private boolean f63225F;

    /* JADX INFO: renamed from: G */
    protected foq f63226G;

    /* JADX INFO: renamed from: H */
    private String f63227H;

    /* JADX INFO: renamed from: I */
    private String f63228I;

    /* JADX INFO: renamed from: J */
    private String f63229J;

    /* JADX INFO: renamed from: K */
    private String f63230K;

    /* JADX INFO: renamed from: L */
    private long f63231L;

    /* JADX INFO: renamed from: M */
    private String f63232M;

    /* JADX INFO: renamed from: N */
    private boolean f63233N;

    /* JADX INFO: renamed from: O */
    private boolean f63234O;

    /* JADX INFO: renamed from: P */
    private boolean f63235P;

    /* JADX INFO: renamed from: Q */
    private Map<String, byte[]> f63236Q;

    /* JADX INFO: renamed from: R */
    private String f63237R;

    /* JADX INFO: renamed from: S */
    private WebChromeClient f63238S;

    /* JADX INFO: renamed from: T */
    private AtomicBoolean f63239T;

    /* JADX INFO: renamed from: U */
    private boolean f63240U;

    /* JADX INFO: renamed from: V */
    private WebViewClient f63241V;

    /* JADX INFO: renamed from: W */
    private volatile List<miw> f63242W;

    /* JADX INFO: renamed from: a */
    private boolean f63243a;

    /* JADX INFO: renamed from: b */
    private MKWebView f63244b;

    /* JADX INFO: renamed from: c */
    public final ehw f63245c;

    /* JADX INFO: renamed from: d */
    private DelayInjectState f63246d;

    /* JADX INFO: renamed from: e */
    private boolean f63247e;

    /* JADX INFO: renamed from: f */
    private bow f63248f;

    /* JADX INFO: renamed from: g */
    private boolean f63249g;

    /* JADX INFO: renamed from: h */
    private boolean f63250h;

    /* JADX INFO: renamed from: i */
    private MKWebCaptureHelper f63251i;

    /* JADX INFO: renamed from: j */
    private Path f63252j;

    /* JADX INFO: renamed from: k */
    private RectF f63253k;

    /* JADX INFO: renamed from: k0 */
    private ne80 f63254k0;

    /* JADX INFO: renamed from: l */
    private Paint f63255l;

    /* JADX INFO: renamed from: m */
    private boolean f63256m;

    /* JADX INFO: renamed from: n */
    private boolean f63257n;

    /* JADX INFO: renamed from: o */
    private long f63258o;

    /* JADX INFO: renamed from: p */
    private boolean f63259p;

    /* JADX INFO: renamed from: p0 */
    private cip0 f63260p0;

    /* JADX INFO: renamed from: q */
    private boolean f63261q;

    /* JADX INFO: renamed from: r */
    private String f63262r;

    /* JADX INFO: renamed from: s */
    private AtomicBoolean f63263s;

    /* JADX INFO: renamed from: t */
    private boolean f63264t;

    /* JADX INFO: renamed from: u */
    private int f63265u;

    /* JADX INFO: renamed from: v */
    private String f63266v;

    /* JADX INFO: renamed from: w */
    private Context f63267w;

    /* JADX INFO: renamed from: x */
    private dgj0 f63268x;

    /* JADX INFO: renamed from: y */
    private C14912e f63269y;

    /* JADX INFO: renamed from: z */
    private shp0 f63270z;

    public enum DelayInjectState {
        NONE,
        WEBCACHE_WITHOUTLOAD_URL,
        WEBCACHE_LOADING_URL,
        WEBCACHE_LOADED_URL
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$a */
    public class C14908a implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f63272a;

        public C14908a(String str) {
            this.f63272a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                return null;
            }
            MDLog.m7389d("MK---WebView", "lehua:boost 失败降级重新load url " + this.f63272a);
            try {
                MKWebView.super.loadUrl(this.f63272a);
                return null;
            } catch (Exception e) {
                MDLog.printErrStackTrace("MK---WebView", e);
                MKWebView.super.loadUrl(this.f63272a);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$b */
    public class C14909b extends WebView.VisualStateCallback {
        public C14909b() {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j) {
            MKWebView.m86998A(MKWebView.this);
            mxv.m156930e("LogTracker", "postVisualStateCallback -----" + j);
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$e */
    public static class C14912e {

        /* JADX INFO: renamed from: a */
        public WeakReference<MKWebView> f63275a;

        /* JADX INFO: renamed from: b */
        public boolean f63276b = false;
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$f */
    public static class C14913f {

        /* JADX INFO: renamed from: a */
        private WeakReference<MKWebView> f63277a;

        public C14913f(MKWebView mKWebView) {
            this.f63277a = new WeakReference<>(mKWebView);
        }

        @JavascriptInterface
        public void bridgejs(String str, String str2, String str3) {
            MKWebView mKWebView = this.f63277a.get();
            if (mKWebView == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            mKWebView.m87007F0(str, str2, str3);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            mxv.m156926a("MK---WebView", "tang-----JavaInterface-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis2 + "       " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$g */
    public interface InterfaceC14914g {
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$h */
    public interface InterfaceC14915h {
        /* JADX INFO: renamed from: a */
        void m87093a(int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$i */
    public static class C14916i {

        /* JADX INFO: renamed from: a */
        boolean f63278a = false;

        /* JADX INFO: renamed from: b */
        String f63279b;

        private C14916i() {
        }

        /* JADX INFO: renamed from: a */
        public static C14916i m87094a(boolean z, String str) {
            C14916i c14916i = new C14916i();
            c14916i.f63278a = z;
            c14916i.f63279b = str;
            return c14916i;
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$j */
    public static class C14917j extends ax00.AbstractRunnableC15743b<Object, Void, String> {

        /* JADX INFO: renamed from: g */
        private WeakReference<MKWebView> f63280g;

        /* JADX INFO: renamed from: h */
        private byte[] f63281h;

        /* JADX INFO: renamed from: i */
        private String f63282i;

        public C14917j(MKWebView mKWebView, byte[] bArr, String str) {
            this.f63280g = new WeakReference<>(mKWebView);
            this.f63281h = bArr;
            this.f63282i = str;
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: n */
        public void mo87096n(Exception exc) {
            MKWebView mKWebView = this.f63280g.get();
            if (mKWebView == null || mKWebView.m87089v0()) {
                return;
            }
            byte[] bArr = this.f63281h;
            String str = this.f63282i;
            if (bArr != null) {
                mKWebView.m87032X(str, bArr);
            } else {
                mKWebView.m87031W(str);
            }
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String mo87095f(Object[] objArr) throws Exception {
            return WebDNSHandler.getLocationUrl(this.f63281h, this.f63282i);
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo87097p(String str) {
            if (this.f63280g.get() != null) {
                MKWebView mKWebView = this.f63280g.get();
                if (mKWebView.m87089v0()) {
                    return;
                }
                mKWebView.loadUrl(str);
            }
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$k */
    public static class HandlerC14918k extends dgj0<MKWebView> {
        public HandlerC14918k(MKWebView mKWebView) {
            super(mKWebView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (m111669a() == null) {
                return;
            }
            m111669a().m87051j0(message);
        }
    }

    public MKWebView(Context context, boolean z) {
        super(m87043f0(context));
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        this.f63250h = z;
        if (z) {
            this.f63246d = DelayInjectState.WEBCACHE_WITHOUTLOAD_URL;
            this.f63247e = true;
        }
        m87055l0(context);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ InterfaceC14914g m86998A(MKWebView mKWebView) {
        mKWebView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m86999A0(String str, String str2, String str3, int i, String str4) {
        try {
            if (TextUtils.isEmpty(str3)) {
                str3 = "unknownUrl";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "unknown";
            }
            String str5 = str2 + "&&&" + i + "&&&" + str4 + "&&&" + str3;
            lxv.m152102h(aip0.m96872j(getLogSessionKey(), str, str5));
            if (this.f63261q) {
                uei.m193256a("mk", str3, this.f63230K, str5);
            }
            na20.m158570a();
        } catch (Exception e) {
            mxv.m156927b("MK---WebView", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: B0 */
    private void m87001B0(boolean z, C14916i c14916i, String str) {
        giw.INSTANCE.m126415l(this.f63221C, str);
        if (!z || c14916i.f63278a || !m87036b0(c14916i.f63279b) || "Android 7.1.1".equalsIgnoreCase(Build.VERSION.RELEASE)) {
            return;
        }
        try {
            postVisualStateCallback(System.currentTimeMillis(), new C14909b());
        } catch (AbstractMethodError unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private C14916i m87005E0(String str) {
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
        return C14916i.m87094a(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m87007F0(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(this.f63223E)) {
                w6e0.m201810b(this.f63223E);
                if (shw.m184294n() != null) {
                    shw.m184294n().mo110232d(this.f63223E);
                }
            }
            String str4 = this.f63221C;
            try {
                if (!TextUtils.isEmpty(str4)) {
                    w6e0.m201810b(str4);
                }
            } catch (MKUrlNotSafeException e) {
                e.printStackTrace();
            }
            JSONObject jSONObject = !TextUtils.isEmpty(str3) ? new JSONObject(str3) : new JSONObject();
            foq foqVar = this.f63226G;
            if (foqVar != null) {
                foqVar.m122486g(str, str2, jSONObject);
            }
            if (TextUtils.equals("getBatteryInfo", str2)) {
                String strOptString = jSONObject.optString("callback");
                shp0 shp0Var = this.f63270z;
                m87086o0(strOptString, shp0Var == null ? "" : shp0Var.toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (e2 instanceof MKPathNotSafeException) {
                mxv.m156927b("MK---WebView", "dangerous path alert, " + e2.getMessage());
            } else if (e2 instanceof MKUrlNotSafeException) {
                mxv.m156927b("MK---WebView", "dangerous url alert, " + e2.getMessage());
            }
            lxv.m152102h(ze3.m218271l(getLogSessionKey(), e2.getMessage(), this.f63266v));
            if (getWebMonitorListener() != null) {
                getWebMonitorListener().mo107090c(getOriginURL(), e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m87009G0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            System.currentTimeMillis();
            String strM99777j = b0g0.m99777j(str, "mkjsbridge", "http", 1);
            URL url = new URL(strM99777j);
            String host = url.getHost();
            String strSubstring = url.getPath().substring(1);
            Uri uri = Uri.parse(strM99777j);
            System.currentTimeMillis();
            String queryParameter = uri.getQueryParameter("param");
            System.currentTimeMillis();
            m87007F0(host, strSubstring, queryParameter);
            System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public void m87011H0(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Target.TYPE);
            String stringExtra2 = intent.getStringExtra("type");
            String stringExtra3 = intent.getStringExtra(AuthenticationTokenClaims.JSON_KEY_NAME);
            String stringExtra4 = intent.getStringExtra("data");
            String stringExtra5 = intent.getStringExtra("origin");
            String url = getUrl();
            String strM184286f = shw.m184286f(url);
            if (url.contains("?")) {
                url = url.substring(0, url.indexOf("?"));
            }
            if (stringExtra.contains("*") && stringExtra.length() > 1) {
                stringExtra = stringExtra.substring(stringExtra.indexOf("*") + 2);
            }
            if ("*".equals(stringExtra) || strM184286f.contains(stringExtra) || url.equals(stringExtra)) {
                m87039d0(stringExtra2, stringExtra3, stringExtra4, stringExtra5);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public void m87015K0(int i, String str) {
        String currentLogKey = getCurrentLogKey();
        xul xulVarM193796f = uhw.m193793e().m193796f(currentLogKey);
        if (xulVarM193796f != null) {
            whw whwVar = (whw) xulVarM193796f;
            whwVar.m203245n(i, str);
            whwVar.m101939h();
            uhw.m193793e().m193799i(whwVar);
            uhw.m193793e().m193798h(currentLogKey);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m87017L0() {
        dgj0 dgj0Var;
        removeAllViews();
        removeJavascriptInterface("mkAobj");
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        boolean z = shw.m184287g() != null && shw.m184287g().mo193552a();
        MDLog.m7389d("MK---WebView", "postDestroyEnable " + z);
        if ((z || m87062p0()) && (dgj0Var = this.f63268x) != null) {
            dgj0Var.sendEmptyMessage(3);
        } else {
            MDLog.m7389d("MK---WebView", "destroy directly");
            destroy();
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m87020N0() {
        this.f63257n = false;
        this.f63222D = null;
        this.f63231L = System.currentTimeMillis();
        C14912e c14912e = this.f63269y;
        if (c14912e != null && c14912e.f63276b) {
            c14912e.f63276b = false;
        }
        this.f63235P = true;
        this.f63239T.set(true);
        this.f63240U = false;
    }

    /* JADX INFO: renamed from: O0 */
    private void m87022O0() {
        MDLog.m7389d("MK---WebView", "lehua:boost resetWebClient=" + getUrl());
        setWebChromeClient(this.f63238S);
        setWebViewClient(this.f63241V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public void m87023P0(@Nullable SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            uip0.m193955l(this, sslError.getUrl(), sslErrorHandler);
        } catch (Exception e) {
            e.printStackTrace();
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private Message m87024Q(int i, String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            ig3.m135964a("keys length must be equal to values length");
            return null;
        }
        Message messageObtainMessage = this.f63268x.obtainMessage();
        messageObtainMessage.what = i;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bundle.putString(strArr[i2], strArr2[i2]);
        }
        messageObtainMessage.setData(bundle);
        return messageObtainMessage;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m87025Q0() {
        Context context = this.f63267w;
        if (context == null || this.f63220B == null) {
            return;
        }
        mxv.m156926a("MK---WebView", "tang-------取消广播");
        context.getApplicationContext().unregisterReceiver(this.f63220B);
        df3.m111428d(context.getApplicationContext(), this.f63220B);
        this.f63220B = null;
    }

    /* JADX INFO: renamed from: R */
    private boolean m87026R(byte[] bArr, String str) {
        if (!getWebDnsEnable() || !MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return false;
        }
        if (!str.startsWith("https://www.immomo.com/checkurl/?url=") && !str.startsWith("https://passport.immomo.com/authorize?redirect_uri=")) {
            return false;
        }
        ax00.m99336e(Integer.valueOf(hashCode()), new C14917j(this, bArr, str));
        return true;
    }

    /* JADX INFO: renamed from: S */
    private String m87027S(String str, C14916i c14916i) {
        boolean z;
        String str2;
        String strM159459b;
        String str3;
        String strConcat = str;
        String strM218869b = zhw.m218869b(strConcat);
        this.f63230K = strM218869b;
        if (this.f63249g && this.f63248f == null && !TextUtils.isEmpty(strM218869b)) {
            this.f63248f = aow.m97988c(cow.m108033b(strConcat));
            this.f63249g = false;
        }
        this.f63228I = null;
        this.f63221C = strConcat;
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f63222D)) {
            String str4 = c14916i.f63279b;
            this.f63222D = str4;
            try {
                Uri uri = Uri.parse(str4);
                if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                    this.f63225F = uri.getBooleanQueryParameter("_dns", true);
                    MDLog.m7389d("MK---WebView", "enterUrl require dns open :" + this.f63225F);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (strConcat.startsWith("file://")) {
            strConcat = strConcat.indexOf("?") > 0 ? strConcat.concat("&_offline=1") : strConcat.concat("?&_offline=1");
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f63243a = true;
            str3 = strConcat;
            str2 = "MK---WebView";
        } else {
            if (this.f63258o == -1) {
                this.f63258o = yhw.m214862s().m214873v(strM218869b);
                MDLog.m7389d("FepPublishManager", "update local version : " + this.f63258o);
                z2 = true;
            }
            iei ieiVarM198188c = vei.m198186e().m198188c(c14916i.f63279b, strM218869b, this.f63258o, "open_mk_url");
            boolean z3 = ieiVarM198188c.f112780b;
            this.f63259p = z3;
            this.f63261q = ieiVarM198188c.f112779a;
            if (z3) {
                MDLog.m7389d("FepPublishManager", "==== fep strategy hit ====");
                this.f63243a = false;
                str3 = ieiVarM198188c.f112781c;
                c14916i.f63279b = str3;
                MDLog.m7389d("FepPublishManager", "fepAppliedUrl = " + str3);
                try {
                    WebSettings settings = getSettings();
                    if (settings.getCacheMode() != 2) {
                        settings.setCacheMode(2);
                    }
                    str2 = "MK---WebView";
                } catch (Throwable th) {
                    str2 = "MK---WebView";
                    MDLog.printErrStackTrace(str2, th);
                }
                giw.INSTANCE.m126407a(str3, strM218869b);
            } else {
                str2 = "MK---WebView";
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z4 = yhw.m214862s().m214875z(strM218869b, ieiVarM198188c.f112781c, null) == 1;
                mxv.m156928c(str2, "tang------预处理离线包，是否存在合法的离线包：" + z4 + "   预处理耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
                String strM218873f = zhw.m218871d(strConcat) != null ? zhw.m218873f(strConcat, "_offline", "1") : "";
                if (!z4 || TextUtils.isEmpty(strM218873f)) {
                    strM159459b = ieiVarM198188c.f112781c;
                    this.f63243a = false;
                    mxv.m156926a(str2, "tang------没有离线包,去检查更新 " + strM218869b);
                    giw.INSTANCE.m126407a(strM159459b, strM218869b);
                } else {
                    this.f63243a = true;
                    strM159459b = ieiVarM198188c.f112779a ? nhw.m159459b(strM218873f, ieiVarM198188c.f112782d) : strM218873f;
                }
                try {
                    v750 v750VarM214871t = yhw.m214862s().m214871t(strM218869b);
                    StringBuilder sb = new StringBuilder();
                    sb.append("\nappConfig 校验总开关：" + shw.m184294n().mo110233e());
                    if (v750VarM214871t != null) {
                        sb.append("\n本地存储的 asymEncrypt = " + v750VarM214871t.f180304d.f137043d);
                        sb.append("\n是否需要本地校验：" + v750VarM214871t.m197344j());
                    }
                    sb.append("\n是否存在有效的离线包" + z4);
                    if (z4) {
                        sb.append("\n本地包的地址：" + v750VarM214871t.m197337c());
                    }
                    MDLog.m7399w("webRsa", sb.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                str3 = strM159459b;
            }
        }
        String strM176234a = qsf.INSTANCE.m176234a(str3, this.f63266v);
        mxv.m156926a(str2, "tang-----最终访问的url " + strM176234a);
        jxv jxvVarM198475e = vhw.m198471d().m198475e(getLogSessionKey());
        if (jxvVarM198475e != null) {
            jxvVarM198475e.f120250b = strM218869b;
            jxvVarM198475e.f120256h = this.f63243a;
            jxvVarM198475e.f120251c = c14916i.f63279b;
            if (this.f63259p) {
                AbstractC17922k4 abstractC17922k4Mo179045b = vei.m198186e().m198189d().mo179045b(strM218869b, strConcat);
                jxvVarM198475e.f120262n = abstractC17922k4Mo179045b != null ? abstractC17922k4Mo179045b.toString() : "";
            }
            v750 v750VarM214871t2 = yhw.m214862s().m214871t(strM218869b);
            if (v750VarM214871t2 != null) {
                jxvVarM198475e.f120254f = v750VarM214871t2.m197341g();
            }
            mxv.m156926a("LogTracker", "update bid: " + strM218869b + " version: " + jxvVarM198475e.f120254f);
        }
        return strM176234a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m87028T(MKWebView mKWebView) {
        MKWebCaptureHelper mKWebCaptureHelper;
        if (mKWebView == null || (mKWebCaptureHelper = this.f63251i) == null) {
            return;
        }
        mKWebCaptureHelper.m87173l(this);
    }

    /* JADX INFO: renamed from: U */
    private void m87029U(String str) {
        MDLog.m7389d("MK---WebView", "lehua:boost:debug checkInjectMonitor=" + str + "   isFirstUrl=" + this.f63239T.get() + "  isNeedClearHistory=" + this.f63247e + "  delayInjectState=" + this.f63246d);
        DelayInjectState delayInjectState = this.f63246d;
        if (delayInjectState == DelayInjectState.WEBCACHE_WITHOUTLOAD_URL) {
            this.f63246d = DelayInjectState.NONE;
            m87082M0();
            m87022O0();
        } else if (delayInjectState == DelayInjectState.WEBCACHE_LOADING_URL && m87065r0(str)) {
            this.f63246d = DelayInjectState.WEBCACHE_LOADED_URL;
            m87022O0();
        } else if (this.f63246d == DelayInjectState.WEBCACHE_LOADED_URL && m87065r0(str)) {
            this.f63246d = DelayInjectState.NONE;
            m87020N0();
            this.f63247e = true;
            m87082M0();
        }
    }

    /* JADX INFO: renamed from: V */
    private void m87030V(String str) {
        if (MKWebCaptureHelper.m87170k() && this.f63246d == DelayInjectState.NONE) {
            if (this.f63251i == null) {
                this.f63251i = new MKWebCaptureHelper();
            }
            this.f63251i.m87172g(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m87031W(String str) {
        String strM87027S;
        this.f63223E = m87065r0(str) ? str : this.f63223E;
        C14916i c14916iM87005E0 = m87005E0(str);
        boolean zM87070u0 = m87070u0(str, c14916iM87005E0);
        if (zM87070u0) {
            try {
                strM87027S = m87027S(str, c14916iM87005E0);
            } catch (Exception e) {
                e.printStackTrace();
                m87001B0(zM87070u0, c14916iM87005E0, str);
                super.loadUrl(str);
                return;
            }
        } else {
            strM87027S = str;
        }
        if (c14916iM87005E0.f63278a) {
            strM87027S = m87047h0(strM87027S);
        }
        m87001B0(zM87070u0, c14916iM87005E0, str);
        MDLog.m7389d("MK---WebView", "lehua:boost:debug beforeLoadBoost=" + strM87027S + "   isFirstUrl=" + this.f63239T.get() + "  isNeedClearHistory=" + this.f63247e + "  delayInjectState=" + this.f63246d);
        if (!fhw.INSTANCE.m121466g(this, strM87027S, new C14908a(strM87027S))) {
            super.loadUrl(strM87027S);
        } else {
            if (getContext() == null || m87089v0() || !this.f63239T.get()) {
                return;
            }
            this.f63239T.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public void m87032X(String str, byte[] bArr) {
        if (getWebDnsEnable() && MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            this.f63236Q.put(str, bArr);
            super.loadUrl(str);
        } else {
            str = m87047h0(str);
            super.postUrl(str, bArr);
        }
        mxv.m156926a("MK---WebView", "tang-------MKWebView postUrl " + str);
    }

    /* JADX INFO: renamed from: Z */
    private Paint m87033Z() {
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        return paint;
    }

    /* JADX INFO: renamed from: a0 */
    private WebResourceResponse m87034a0(WebView webView, String str) {
        WebResourceResponse webResourceResponseMo95005m;
        try {
            if (this.f63242W != null && this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (this.f63242W != null ? this.f63242W.size() : 0)) {
                        break;
                    }
                    if (this.f63242W.get(i) != null) {
                        this.f63242W.get(i).m154762n(webView, str);
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        WebResourceResponse webResourceResponse = null;
        try {
            if (this.f63242W != null && this.f63242W.size() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= (this.f63242W != null ? this.f63242W.size() : 0)) {
                        break;
                    }
                    if (this.f63242W.get(i2) != null && (webResourceResponseMo95005m = this.f63242W.get(i2).mo95005m(webView, str)) != null) {
                        webResourceResponse = webResourceResponseMo95005m;
                    }
                    i2++;
                }
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace("MK---WebView", e);
        }
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m87036b0(String str) {
        try {
            return mei.m154217w() && b0g0.m99768a(liw.m149945f(this.f63222D), liw.m149945f(str)) && !m87073w0();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m87039d0(String... strArr) {
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
        Message messageObtainMessage = this.f63268x.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.obj = "javascript:window.mm&&window.mm.fireDocumentEvent(" + string + ")";
        this.f63268x.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: e0 */
    private String m87041e0() {
        return System.currentTimeMillis() + "_" + new Random().nextInt(123456);
    }

    /* JADX INFO: renamed from: f0 */
    private static Context m87043f0(Context context) {
        boolean z = shw.f164659i;
        return context;
    }

    /* JADX INFO: renamed from: g0 */
    public static String m87045g0(JSONObject jSONObject) {
        return jSONObject.optString("callback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IntentFilter getBatteryFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        return intentFilter;
    }

    private boolean getWebDnsEnable() {
        return shw.m184287g() != null && shw.m184287g().mo105188b() && this.f63225F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public String m87047h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            File fileM218871d = zhw.m218871d(str);
            if (fileM218871d != null) {
                mxv.m156926a("MK---WebView", "exists local file " + fileM218871d.getAbsolutePath());
                return str;
            }
            String strM193948e = uip0.m193948e(str);
            if (!TextUtils.isEmpty(strM193948e)) {
                return strM193948e;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public WebResourceResponse m87049i0(WebView webView, String str, String str2, WebResourceRequest webResourceRequest) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        WebResourceResponse webResourceResponseM87034a0 = m87034a0(webView, str);
        if (webResourceResponseM87034a0 != null) {
            return webResourceResponseM87034a0;
        }
        WebResourceResponse webResourceResponseM220668i = this.f63259p ? null : zwm.m220668i(str, this.f63221C);
        if (this.f63259p) {
            MDLog.m7389d("FepPublishManager", "fepForceOnline --> " + str);
        }
        if (webResourceResponseM220668i != null) {
            MDLog.m7389d("MK---WebView", "lehua:offline 耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  加载本地资源 " + str);
            vhw.m198471d().m198472a(this.f63230K, str, getCheckOfflineInfo());
            lxv.m152102h(ywm.m216408j(getLogSessionKey(), "local", str, true));
        }
        if (webResourceResponseM220668i == null && qsf.INSTANCE.m176236c(str) && (webResourceResponseM220668i = WebFDTDNSHandler.handleInterceptRequest(this.f63236Q.remove(str), webView, webResourceRequest)) == null) {
            MDLog.m7391e("MK---WebView", "fdt mkweb use dns failed, url: " + str);
        }
        if (webResourceResponseM220668i == null) {
            MDLog.m7389d("MK---WebView", "mkweb method " + webResourceRequest.getMethod() + " ---> " + str);
            boolean webDnsEnable = getWebDnsEnable();
            StringBuilder sb = new StringBuilder("mkweb enableWebDns --> ");
            sb.append(webDnsEnable);
            MDLog.m7389d("MK---WebView", sb.toString());
            if (webDnsEnable && MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
                MDLog.m7389d("MK---WebView", "mkweb use dns --> " + str);
                WebResourceResponse webResourceResponseM136335e = ii5.m136335e(this.f63236Q.remove(str), webView, webResourceRequest);
                if (webResourceResponseM136335e == null) {
                    MDLog.m7391e("MK---WebView", "mkweb use dns failed, url: " + str);
                }
                lxv.m152102h(ywm.m216408j(getLogSessionKey(), "dns", str, webResourceResponseM136335e != null));
                webResourceResponseM220668i = webResourceResponseM136335e;
            } else {
                WebResourceResponse webResourceResponseM193950g = uip0.m193950g(getLogSessionKey(), str, str2, webResourceRequest);
                if (webResourceResponseM193950g == null) {
                    MDLog.m7391e("MK---WebView", "mkweb use referee failed, url: " + str);
                }
                webResourceResponseM220668i = webResourceResponseM193950g;
            }
            if (webResourceResponseM220668i != null) {
                MDLog.m7389d("MK---WebView", "lehua:offline  耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  加载远程资源 " + str);
            }
        }
        if (webResourceResponseM220668i == null) {
            return null;
        }
        qsf.INSTANCE.m176239h(webResourceResponseM220668i, webResourceRequest);
        return webResourceResponseM220668i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m87051j0(Message message) {
        if ((getRealContext() instanceof q4m) && !((q4m) getRealContext()).m172947a()) {
            String string = message.getData().getString("value");
            if (!TextUtils.isEmpty(string)) {
                try {
                    if (new JSONObject(string).optJSONObject(LovePlanetStage.result).optJSONObject("event_msg").optBoolean("active_response", false)) {
                        return;
                    }
                } catch (Exception e) {
                    MDLog.m7391e("MK---WebView", e.getMessage());
                }
            }
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                MDLog.m7389d("mkleak", "destroy from post");
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
        String strM149950k = liw.m149950k(string2);
        String str = "javascript:" + string3 + "('" + strM149950k + "')";
        try {
            lxv.m152102h(ze3.m218270k(getLogSessionKey(), string3, strM149950k, this.f63266v));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        loadUrl(str);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ g8m m87052k(MKWebView mKWebView) {
        mKWebView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m87053k0(WebView webView, String str, int i, String str2) {
        mxv.m156927b("MK---WebView", "tang------handleReceivedErrorInner " + i + ":" + str2 + "  " + str);
        m87015K0(i, str2);
        if (this.f63242W != null && this.f63242W.size() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= (this.f63242W != null ? this.f63242W.size() : 0)) {
                    break;
                }
                if (this.f63242W.get(i2) != null) {
                    this.f63242W.get(i2).mo43911e(webView, i, str2, str);
                }
                i2++;
            }
        }
        if (getWebMonitorListener() != null) {
            getWebMonitorListener().mo107091d(getOriginURL(), i, str2, str);
        }
        uip0.m193952i(str);
        m87028T(this);
    }

    /* JADX INFO: renamed from: l0 */
    private void m87055l0(Context context) {
        this.f63244b = this;
        this.f63231L = System.currentTimeMillis();
        MDLog.m7389d("webRsa", "mk init start");
        lxv.m152101g();
        this.f63267w = context;
        lxv.m152102h(xbr.m207732j(getLogSessionKey(), "onWebViewCreate"));
        this.f63268x = new HandlerC14918k(this);
        this.f63266v = m87041e0();
        m87059n0();
        this.f63226G = new foq(this);
        bjw.m102233a().m102235c(this);
        giw.INSTANCE.m126410e();
        shw.m184285e();
        this.f63232M = getSettings().getUserAgentString();
        ihw.INSTANCE.m136319p();
        if (this.f63246d == DelayInjectState.NONE) {
            m87082M0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m87057m0() {
        Context context = this.f63267w;
        if (context == null) {
            return;
        }
        MDLog.m7389d("mkleak", "init receivers");
        this.f63270z = new shp0();
        this.f63220B = new MKBroadcastReceiver(this, null);
        ii5.m136342l(context.getApplicationContext(), this.f63220B, getBatteryFilter());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.immomo.momo.mk.post_message");
        df3.m111425a(context.getApplicationContext(), this.f63220B, intentFilter);
    }

    /* JADX INFO: renamed from: n0 */
    private void m87059n0() {
        WebSettings settings = getSettings();
        settings.setMixedContentMode(0);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setGeolocationEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(mei.m154197c());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheMaxSize(16777216L);
        settings.setAppCacheEnabled(false);
        Context context = this.f63267w;
        if (context != null) {
            settings.setAppCachePath(context.getCacheDir().getPath());
        }
        if (na20.m158575f()) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        if (this.f63246d == DelayInjectState.NONE) {
            m87022O0();
        }
        setDrawingCacheEnabled(false);
        cih0.m107069c(settings);
        setDebuggable(false);
        addJavascriptInterface(new C14913f(this), "mkAobj");
        setScrollBarStyle(0);
        requestFocusFromTouch();
    }

    /* JADX INFO: renamed from: p0 */
    private boolean m87062p0() {
        try {
            String userAgentString = this.f63237R;
            if (TextUtils.isEmpty(userAgentString)) {
                userAgentString = getSettings().getUserAgentString();
            }
            if (!TextUtils.isEmpty(userAgentString) && userAgentString.contains("Chrome/")) {
                MDLog.m7389d("MK---WebView", userAgentString);
                int iIndexOf = userAgentString.indexOf("Chrome/") + 7;
                return Integer.valueOf(userAgentString.substring(iIndexOf, userAgentString.indexOf(".", iIndexOf))).intValue() >= 77;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public boolean m87065r0(String str) {
        return str.startsWith("https://") || str.startsWith("http://");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public boolean m87068t0(String str) {
        return str.startsWith("file://");
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m87070u0(String str, C14916i c14916i) {
        if (m87089v0() || TextUtils.isEmpty(str) || str.startsWith("javascript:")) {
            return false;
        }
        if (!m87065r0(str) && !str.startsWith("file://")) {
            return false;
        }
        jxv jxvVarM198475e = vhw.m198471d().m198475e(getLogSessionKey());
        if (jxvVarM198475e != null && TextUtils.isEmpty(jxvVarM198475e.f120251c)) {
            mxv.m156926a("LogTracker", "first update url " + c14916i.f63279b);
            jxvVarM198475e.f120251c = c14916i.f63279b;
        }
        return !TextUtils.isEmpty(zhw.m218869b(str));
    }

    /* JADX INFO: renamed from: w0 */
    private boolean m87073w0() {
        int iM144364b;
        if (TextUtils.isEmpty(this.f63222D) || (iM144364b = k33.m144364b(true, this.f63222D)) == 1) {
            return false;
        }
        if (iM144364b == 0) {
            return true;
        }
        return k33.m144365c(true, this.f63222D);
    }

    /* JADX INFO: renamed from: z0 */
    private void m87077z0(Canvas canvas) {
        if (this.f63252j == null) {
            Path path = new Path();
            this.f63252j = path;
            path.setFillType(Path.FillType.INVERSE_WINDING);
        }
        RectF rectF = this.f63253k;
        if (rectF == null) {
            this.f63253k = new RectF(0.0f, getScrollY(), getWidth(), getScrollY() + getHeight());
        } else {
            rectF.set(0.0f, getScrollY(), getWidth(), getScrollY() + getHeight());
        }
        this.f63252j.reset();
        Path path2 = this.f63252j;
        RectF rectF2 = this.f63253k;
        int i = this.f63265u;
        path2.addRoundRect(rectF2, i, i, Path.Direction.CW);
        if (this.f63255l == null) {
            this.f63255l = m87033Z();
        }
        canvas.drawPath(this.f63252j, this.f63255l);
    }

    /* JADX INFO: renamed from: C0 */
    public void m87078C0() {
        lxv.m152102h(xbr.m207732j(getLogSessionKey(), "destroy"));
        vhw.m198471d().m198473b(getLogSessionKey());
        shw.m184285e();
        this.f63242W = null;
        this.f63226G = null;
        if (getWebMonitorListener() != null) {
            getWebMonitorListener().dispose();
            this.f63260p0 = null;
        }
        ee80.m115855j().m115860e(Integer.valueOf(hashCode()));
        m87025Q0();
        m87017L0();
        this.f63219A = true;
        this.f63267w = null;
        LocalServerHandler.m87204k(this.f63230K);
        bjw.m102233a().m102236d(this);
        qsf.INSTANCE.m176240i(this.f63266v);
        if (!bjw.m102233a().m102234b()) {
            LocalServerHandler.m87203j();
        }
        bow bowVar = this.f63248f;
        if (bowVar != null) {
            bowVar.m102991a();
        }
        m87028T(this);
    }

    /* JADX INFO: renamed from: D0 */
    public void m87079D0(boolean z) {
        if (shw.m184287g() != null && shw.m184287g().mo193554d() && !this.f63233N) {
            MDLog.m7399w("webRsa", "onPause called");
            super.onPause();
        }
        mxv.m156926a("MK---WebView", "tang------MKWebView  ----onPause:" + this.f63266v);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", z ? "webview" : "home");
            lxv.m152102h(xbr.m207732j(getLogSessionKey(), "onPause"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        foq bridgeProcessor = getBridgeProcessor();
        if (bridgeProcessor != null) {
            bridgeProcessor.m122484e();
        }
        m87039d0("bridgeEvent", "pause", jSONObject.toString(), getUrl());
        this.f63234O = false;
    }

    /* JADX INFO: renamed from: I0 */
    public void m87080I0(String str) {
        this.f63228I = str;
    }

    /* JADX INFO: renamed from: J0 */
    public void m87081J0(String str) {
        this.f63229J = str;
    }

    /* JADX INFO: renamed from: M0 */
    public void m87082M0() {
        setWebMonitorListener(oiw.INSTANCE.m164573h());
    }

    /* JADX INFO: renamed from: P */
    public void m87083P(miw miwVar) {
        this.f63242W.add(miwVar);
    }

    /* JADX INFO: renamed from: Y */
    public void m87084Y(cow cowVar) {
        if (aow.m97990e(cowVar.m108035d())) {
            return;
        }
        this.f63248f = aow.m97988c(cowVar);
        this.f63249g = false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m87085c0(String str, String str2, @Nullable String str3) {
        m87039d0("bridgeEvent", str, str2, str3);
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        if (this.f63239T.get()) {
            return false;
        }
        return super.canGoBack();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        setDestroyed(true);
        if (this.f63250h) {
            ihw.INSTANCE.m136321r(this);
        }
    }

    public String getBid() {
        return this.f63230K;
    }

    public foq getBridgeProcessor() {
        return this.f63226G;
    }

    public C14912e getCheckOfflineInfo() {
        if (this.f63269y == null) {
            C14912e c14912e = new C14912e();
            this.f63269y = c14912e;
            c14912e.f63276b = false;
            c14912e.f63275a = new WeakReference<>(this);
        }
        return this.f63269y;
    }

    public String getCurrentLogKey() {
        return uhw.m193792d(getWebViewId(), "OpenURL", this.f63221C);
    }

    public String getLogSessionKey() {
        return hashCode() + "";
    }

    public MKWebCaptureHelper getMkWebCaptureHelper() {
        return this.f63251i;
    }

    public String getOriginURL() {
        return this.f63221C;
    }

    public String getPageUID() {
        return this.f63262r;
    }

    public String getPayCallback() {
        return this.f63227H;
    }

    public Context getRealContext() {
        Context context = getContext();
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextThemeWrapper) {
            return ((ContextThemeWrapper) context).getBaseContext();
        }
        if (context instanceof m16) {
            return ((m16) context).getBaseContext();
        }
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }

    public cip0 getWebMonitorListener() {
        if (getBid() != null) {
            return this.f63260p0;
        }
        return null;
    }

    public String getWebViewId() {
        return this.f63266v;
    }

    @Nullable
    public String getWorkerId() {
        bow bowVar = this.f63248f;
        return bowVar == null ? "" : bowVar.f76568a;
    }

    @Override // immomo.com.mklibrary.core.base.p115ui.BaseWebView, android.webkit.WebView
    public final void loadUrl(String str) {
        MDLog.m7389d("MK---WebView", "lehua:boost:debug loadUrl=" + str + "   isFirstUrl=" + this.f63239T.get() + "  isNeedClearHistory=" + this.f63247e + "  delayInjectState=" + this.f63246d);
        StringBuilder sb = new StringBuilder("tang----mwc:loadUrl ");
        sb.append(str);
        sb.append(" release: ");
        sb.append(this.f63219A);
        mxv.m156926a("MK---WebView", sb.toString());
        m87029U(str);
        if (TextUtils.isEmpty(str) || m87089v0()) {
            return;
        }
        ne80 ne80Var = this.f63254k0;
        if ((ne80Var == null || !ne80Var.mo95003b(str)) && !m87026R(null, str)) {
            m87030V(str);
            m87031W(str);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m87086o0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lxv.m152097c(new xe3(str, Uri.decode(str2)));
        dgj0 dgj0Var = this.f63268x;
        if (str2 != null) {
            dgj0Var.sendMessage(m87024Q(1, new String[]{"callback", "value"}, new String[]{str, str2}));
        } else {
            dgj0Var.sendMessage(m87024Q(1, new String[]{"callback"}, new String[]{str}));
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m87057m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m87025Q0();
        qsf.INSTANCE.m176240i(this.f63266v);
        giw.INSTANCE.m126413i(this.f63221C);
        ihw.INSTANCE.m136320q();
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f63265u > 0) {
            m87077z0(canvas);
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        super.onResume();
        mxv.m156926a("MK---WebView", "tang------MKWebView  ----onResume:" + this.f63266v);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f63235P ? "webview" : "home");
            jSONObject.put("hidden", false);
            lxv.m152102h(xbr.m207732j(getLogSessionKey(), "onResume"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        m87039d0("bridgeEvent", "resume", jSONObject.toString(), getUrl());
        foq bridgeProcessor = getBridgeProcessor();
        if (bridgeProcessor != null) {
            bridgeProcessor.m122485f();
        }
        this.f63234O = true;
        this.f63235P = false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f63265u > 0) {
            invalidate();
        }
        ArrayList<InterfaceC14915h> arrayList = this.f63224E0;
        if (arrayList != null) {
            Iterator<InterfaceC14915h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m87093a(i, i2, i3, i4);
            }
        }
    }

    @Override // immomo.com.mklibrary.core.base.p115ui.BaseWebView, android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (m87026R(bArr, str)) {
            return;
        }
        m87032X(str, bArr);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m87087q0() {
        return this.f63264t;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m87088s0() {
        return this.f63263s.get();
    }

    public void setDebuggable(boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
        if (z) {
            WebSettings settings = getSettings();
            settings.setDatabaseEnabled(false);
            settings.setAppCacheMaxSize(0L);
            settings.setAppCacheEnabled(false);
            settings.setAppCachePath("");
            settings.setCacheMode(2);
        }
    }

    public void setDestroyed(boolean z) {
        this.f63264t = z;
    }

    public void setInterceptPause(boolean z) {
        this.f63233N = z;
    }

    public void setLoadedCapture(boolean z) {
        this.f63263s.set(z);
    }

    public void setMKPreLoadingUrlProcessor(ne80 ne80Var) {
        this.f63254k0 = ne80Var;
    }

    public void setMKWebLoadListener(miw miwVar) {
        m87083P(miwVar);
    }

    public void setOnLoadUrlListener(InterfaceC14914g interfaceC14914g) {
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            if (!stackTraceString.contains("android.content.pm.PackageManager$NameNotFoundException") && !stackTraceString.contains("java.lang.RuntimeException: Cannot load WebView") && !stackTraceString.contains("android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed") && !stackTraceString.contains("java.lang.NoSuchMethodError")) {
                throw th;
            }
            th.printStackTrace();
        }
    }

    public void setPageUID(String str) {
        this.f63262r = str;
    }

    public void setPayCallback(String str) {
        this.f63227H = str;
    }

    public void setPrefetch(String str) {
        ee80.m115855j().m115858b(Integer.valueOf(hashCode()), this.f63221C, str);
    }

    public void setRoundCorner(int i) {
        this.f63265u = i;
        invalidate();
    }

    public void setWebMonitorListener(cip0 cip0Var) {
        this.f63260p0 = cip0Var;
    }

    public void setWebUserAgent(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63232M);
        sb.append(str != null ? MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.concat(str) : "");
        this.f63237R = sb.toString();
        getSettings().setUserAgentString(this.f63237R);
        try {
            jxv jxvVarM198475e = vhw.m198471d().m198475e(getLogSessionKey());
            if (jxvVarM198475e != null) {
                mxv.m156926a("LogTracker", "update ua: " + this.f63237R);
                jxvVarM198475e.f120263o = this.f63237R;
                jxvVarM198475e.f120261m = shw.m184287g() != null && shw.m184287g().mo105188b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        qsf.INSTANCE.m176242k(this.f63266v, this.f63237R);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m87089v0() {
        return this.f63219A;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m87090x0() {
        return this.f63234O;
    }

    /* JADX INFO: renamed from: y0 */
    public void m87091y0(String str) {
        this.f63246d = DelayInjectState.WEBCACHE_LOADING_URL;
        loadUrl(str);
    }

    public class MKBroadcastReceiver extends BroadcastReceiver {
        private MKBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            boolean zEquals = "com.immomo.momo.mk.post_message".equals(intent.getAction());
            MKWebView mKWebView = MKWebView.this;
            if (zEquals) {
                mKWebView.m87011H0(intent);
                return;
            }
            if (!mKWebView.getBatteryFilter().hasAction(intent.getAction()) || MKWebView.this.f63270z == null) {
                return;
            }
            float fRound = Math.round(((intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 1.0f) / intent.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1)) * 100.0f) / 100.0f;
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            MKWebView.this.f63270z.m184263b(fRound);
            MKWebView.this.f63270z.m184262a(intExtra == 2);
        }

        public /* synthetic */ MKBroadcastReceiver(MKWebView mKWebView, C14908a c14908a) {
            this();
        }
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$c */
    public class C14910c extends noi {
        public C14910c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).mo87122a(consoleMessage);
                    }
                    i++;
                }
            }
            ConsoleMessage.MessageLevel messageLevel = ConsoleMessage.MessageLevel.ERROR;
            if (messageLevel.equals(consoleMessage.messageLevel())) {
                String strMessage = consoleMessage.message();
                String strM212114c = y0f.m212114c(strMessage);
                String logSessionKey = MKWebView.this.getLogSessionKey();
                boolean zIsEmpty = TextUtils.isEmpty(strM212114c);
                String str = !TextUtils.isEmpty(strM212114c) ? "ERR_3.1" : "ERR_2.3";
                if (TextUtils.isEmpty(strM212114c)) {
                    strM212114c = consoleMessage.message();
                }
                lxv.m152102h(oiq.m164543j(logSessionKey, zIsEmpty, str, strM212114c));
                if (MKWebView.this.f63261q) {
                    uei.m193256a("mk", MKWebView.this.getUrl(), MKWebView.this.f63230K, strMessage);
                }
            } else {
                lxv.m152102h(oiq.m164544k(MKWebView.this.getLogSessionKey(), consoleMessage.message()));
            }
            if (MKWebView.this.getWebMonitorListener() != null && messageLevel.equals(consoleMessage.messageLevel())) {
                MKWebView.this.getWebMonitorListener().mo107091d(MKWebView.this.f63221C, -1, consoleMessage.message(), MKWebView.this.f63221C);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            liw.m149949j(MKWebView.this, str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView == null || webView.getContext() == null || MKWebView.this.m87089v0()) {
                return false;
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).m154756b(webView, str, str2, jsResult);
                    }
                    i++;
                }
            }
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (webView == null || webView.getContext() == null || MKWebView.this.m87089v0()) {
                return false;
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).m154757c(webView, str, str2, jsResult);
                    }
                    i++;
                }
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (MKWebView.this.getContext() == null || webView == null || webView.getContext() == null || MKWebView.this.m87089v0()) {
                return true;
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).m154758d(webView, str, str2, str3, jsPromptResult);
                    }
                    i++;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        w6e0.m201810b(str);
                    }
                    String str4 = str2;
                    MKWebView.this.m87009G0(str4);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    mxv.m156926a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis2 + "       " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
                    jsPromptResult.cancel();
                    if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                                break;
                            }
                            if (MKWebView.this.f63242W.get(i2) != null) {
                                ((miw) MKWebView.this.f63242W.get(i2)).m154758d(webView, str, str4, str3, jsPromptResult);
                            }
                            i2++;
                            str4 = str2;
                        }
                    }
                } catch (MKUrlNotSafeException e) {
                    e.printStackTrace();
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    mxv.m156926a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis3 + "       " + (jCurrentTimeMillis3 - jCurrentTimeMillis) + "ms");
                    jsPromptResult.cancel();
                    if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                                break;
                            }
                            if (MKWebView.this.f63242W.get(i3) != null) {
                                ((miw) MKWebView.this.f63242W.get(i3)).m154758d(webView, str, str2, str3, jsPromptResult);
                            }
                            i3++;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                mxv.m156926a("MK---WebView", "tang-----onJsPrompt-处理时间是  " + jCurrentTimeMillis + "   " + jCurrentTimeMillis4 + "       " + (jCurrentTimeMillis4 - jCurrentTimeMillis) + "ms");
                jsPromptResult.cancel();
                if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                            break;
                        }
                        if (MKWebView.this.f63242W.get(i4) != null) {
                            ((miw) MKWebView.this.f63242W.get(i4)).m154758d(webView, str, str2, str3, jsPromptResult);
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
            if (!MKWebView.this.f63256m && i > 30) {
                MKWebView.this.f63256m = true;
                y0f.m212117f(MKWebView.this, "onProgressChanged");
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i2) != null) {
                        ((miw) MKWebView.this.f63242W.get(i2)).mo154759h(webView, i);
                    }
                    i2++;
                }
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo107093f(webView, i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
            if (MKWebView.this.f63242W == null || MKWebView.this.f63242W.size() <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                    return;
                }
                if (MKWebView.this.f63242W.get(i) != null) {
                    ((miw) MKWebView.this.f63242W.get(i)).m154760i(webView, bitmap);
                }
                i++;
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            String currentLogKey = MKWebView.this.getCurrentLogKey();
            xul xulVarM193796f = uhw.m193793e().m193796f(currentLogKey);
            if (xulVarM193796f != null) {
                whw whwVar = (whw) xulVarM193796f;
                whwVar.m203251t();
                uhw.m193793e().m193797g(currentLogKey, whwVar);
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).mo87123k(webView, str);
                    }
                    i++;
                }
            }
            qsf.INSTANCE.m176243l(MKWebView.this.f63266v, str);
            if (!"安全错误".equalsIgnoreCase(str) || MKWebView.this.f63257n) {
                return;
            }
            lxv.m152102h(aip0.m96872j(MKWebView.this.getLogSessionKey(), "ERR_1.5", str));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            MKWebView.m87052k(MKWebView.this);
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            MKWebView.m87052k(MKWebView.this);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            openFileChooser(valueCallback, str, null);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            openFileChooser(valueCallback, "");
        }
    }

    public void setWebChooseFile(g8m g8mVar) {
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebView$d */
    public class C14911d extends WebViewClient {
        public C14911d() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            MDLog.m7389d("MK---WebView", "lehua:boost:debug doUpdateVisitedHistory:before=" + str + "   isFirstUrl=" + MKWebView.this.f63239T.get() + "  isNeedClearHistory=" + MKWebView.this.f63247e + "  delayInjectState=" + MKWebView.this.f63246d);
            if (MKWebView.this.f63247e) {
                MDLog.m7389d("MK---WebView", "lehua:boost doUpdateVisitedHistory clearHistory: " + str);
                webView.clearHistory();
                MKWebView.this.f63247e = false;
            }
            MDLog.m7389d("MK---WebView", "lehua:boost:debug doUpdateVisitedHistory:after=" + str + "   isFirstUrl=" + MKWebView.this.f63239T.get() + "  isNeedClearHistory=" + MKWebView.this.f63247e + "  delayInjectState=" + MKWebView.this.f63246d);
        }

        public void onDealRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (MKWebView.this.f63242W == null || MKWebView.this.f63242W.size() <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        return;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).mo95004l(webView, renderProcessGoneDetail);
                    }
                    i++;
                }
            } catch (Throwable th) {
                MDLog.printErrStackTrace("MK---WebView", th);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            try {
                if (mei.m154203i()) {
                    lxv.m152102h(xbr.m207732j(MKWebView.this.getLogSessionKey(), "onLoadResource&&&" + str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            String currentLogKey;
            xul xulVarM193796f;
            if (webView == null || webView.getContext() == null || MKWebView.this.m87089v0()) {
                return;
            }
            MDLog.m7389d("MK---WebView", "lehua:boost:debug onPageFinished=" + str + "   isFirstUrl=" + MKWebView.this.f63239T.get() + "  isNeedClearHistory=" + MKWebView.this.f63247e + "  delayInjectState=" + MKWebView.this.f63246d);
            if (!liw.m149946g(str) && MKWebView.this.f63239T.get()) {
                MKWebView.this.f63239T.set(false);
                webView.clearHistory();
            }
            lxv.m152102h(xbr.m207732j(MKWebView.this.getLogSessionKey(), "onPageFinished&&&" + str));
            super.onPageFinished(webView, str);
            if (!MKWebView.this.f63256m) {
                MKWebView.this.f63256m = true;
                y0f.m212117f(MKWebView.this, "onPageFinished");
            }
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).mo43912f(webView, str);
                    }
                    i++;
                }
            }
            qsf.INSTANCE.m176241j(MKWebView.this.f63266v, str);
            if ((MKWebView.this.m87065r0(str) || MKWebView.this.m87068t0(str)) && (xulVarM193796f = uhw.m193793e().m193796f((currentLogKey = MKWebView.this.getCurrentLogKey()))) != null) {
                whw whwVar = (whw) xulVarM193796f;
                whwVar.m203249r();
                whwVar.m203246o();
                whwVar.m101939h();
                uhw.m193793e().m193799i(whwVar);
                uhw.m193793e().m193798h(currentLogKey);
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo107089b(webView, str);
            }
            try {
                MKWebView.m86998A(MKWebView.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
            giw.INSTANCE.m126413i(MKWebView.this.f63221C);
            MDLog.m7390d("webRsa", "mk loadFinished cost: %d ms", Long.valueOf(System.currentTimeMillis() - MKWebView.this.f63231L));
            MKWebView mKWebView = MKWebView.this;
            mKWebView.m87028T(mKWebView);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String currentLogKey;
            xul xulVarM193796f;
            jxv jxvVarM198475e;
            super.onPageStarted(webView, str, bitmap);
            MKWebView.this.f63257n = true;
            MKWebView.this.f63256m = false;
            try {
                if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                            break;
                        }
                        if (MKWebView.this.f63242W.get(i) != null) {
                            ((miw) MKWebView.this.f63242W.get(i)).mo43913g(webView, str, bitmap);
                        }
                        i++;
                    }
                    lxv.m152102h(xbr.m207732j(MKWebView.this.getLogSessionKey(), "onPageStarted&&&" + str));
                    jxvVarM198475e = vhw.m198471d().m198475e(MKWebView.this.getLogSessionKey());
                    if (jxvVarM198475e != null && !jxvVarM198475e.f120260l) {
                        mxv.m156926a("LogTracker", "mark pageStartInvoked = true");
                        jxvVarM198475e.f120260l = true;
                    }
                    if ((MKWebView.this.m87065r0(str) || MKWebView.this.m87068t0(str)) && (xulVarM193796f = uhw.m193793e().m193796f((currentLogKey = MKWebView.this.getCurrentLogKey()))) != null) {
                        whw whwVar = (whw) xulVarM193796f;
                        whwVar.m203250s();
                        uhw.m193793e().m193797g(currentLogKey, whwVar);
                    }
                    if (MKWebView.this.getWebMonitorListener() != null || MKWebView.this.getBid() == null) {
                    }
                    MKWebView.this.getWebMonitorListener().mo107088a(webView, str, bitmap);
                    return;
                }
                lxv.m152102h(xbr.m207732j(MKWebView.this.getLogSessionKey(), "onPageStarted&&&" + str));
                jxvVarM198475e = vhw.m198471d().m198475e(MKWebView.this.getLogSessionKey());
                if (jxvVarM198475e != null) {
                    mxv.m156926a("LogTracker", "mark pageStartInvoked = true");
                    jxvVarM198475e.f120260l = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (MKWebView.this.m87065r0(str)) {
                whw whwVar2 = (whw) xulVarM193796f;
                whwVar2.m203250s();
                uhw.m193793e().m193797g(currentLogKey, whwVar2);
            } else {
                whw whwVar3 = (whw) xulVarM193796f;
                whwVar3.m203250s();
                uhw.m193793e().m193797g(currentLogKey, whwVar3);
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
            }
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            MKWebView.this.m87053k0(webView, webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "");
            MKWebView.this.m86999A0("ERR_2.1", "onReceivedError2", webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "");
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                boolean zM99768a = b0g0.m99768a(webResourceRequest.getUrl().toString(), MKWebView.this.f63222D);
                MKWebView.m86998A(MKWebView.this);
                MKWebView.this.m86999A0(zM99768a ? "ERR_1.3" : "ERR_2.1", zM99768a ? "Html Fail" : "onReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            mxv.m156927b("MK---WebView", "tang------onReceivedSslError " + sslError);
            MDLog.m7391e("DNSTest", "mkweb dns error: " + sslError);
            if (MKWebView.this.getContext() != null) {
                MKWebView.this.m87023P0(sslErrorHandler, sslError);
            }
            MKWebView.this.m87015K0(-8888, sslError != null ? sslError.toString() : null);
            if (MKWebView.this.f63242W != null && MKWebView.this.f63242W.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= (MKWebView.this.f63242W != null ? MKWebView.this.f63242W.size() : 0)) {
                        break;
                    }
                    if (MKWebView.this.f63242W.get(i) != null) {
                        ((miw) MKWebView.this.f63242W.get(i)).m154761j(webView, sslErrorHandler, sslError);
                    }
                    i++;
                }
            }
            if (MKWebView.this.getWebMonitorListener() != null) {
                MKWebView.this.getWebMonitorListener().mo107092e(MKWebView.this.getOriginURL(), sslErrorHandler, sslError);
            }
            if (sslError != null) {
                uip0.m193952i(sslError.getUrl());
            }
            if (sslError != null) {
                MKWebView.this.m86999A0("ERR_2.1", "onReceivedSslError", sslError.getUrl(), sslError.getPrimaryError(), sslError.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean zDidCrash = renderProcessGoneDetail.didCrash();
            MKWebView mKWebView = MKWebView.this;
            if (!zDidCrash) {
                lxv.m152102h(uhp0.m193786j(mKWebView.getLogSessionKey(), "System killed the WebView rendering process for out of memory, RendererPriority: " + renderProcessGoneDetail.rendererPriorityAtExit()));
                if (MKWebView.this.f63244b != null) {
                    ViewParent parent = MKWebView.this.f63244b.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(MKWebView.this.f63244b);
                        MKWebView.this.f63244b.destroy();
                        MKWebView.this.f63244b = null;
                    }
                }
                onDealRenderProcessGone(webView, renderProcessGoneDetail);
                return true;
            }
            lxv.m152102h(uhp0.m193786j(mKWebView.getLogSessionKey(), "The WebView rendering process crashed! RendererPriority: " + renderProcessGoneDetail.rendererPriorityAtExit()));
            gnw.m127190a("momo-web").m128649e("mkRenderCrash").m128645a(onw.m165243m(MKWebView.this.f63222D)).m128645a(onw.m165234d(MKWebView.this.f63230K)).m128645a(new onw("priority", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()))).m128645a(new onw(DownloadService.KEY_FOREGROUND, Boolean.valueOf(shw.m184302v()))).m128647c();
            if (MKWebView.this.f63244b != null) {
                ViewParent parent2 = MKWebView.this.f63244b.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(MKWebView.this.f63244b);
                    MKWebView.this.f63244b.destroy();
                    MKWebView.this.f63244b = null;
                }
            }
            onDealRenderProcessGone(webView, renderProcessGoneDetail);
            return true;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponseM87049i0 = MKWebView.this.m87049i0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest);
            if (webResourceResponseM87049i0 != null) {
                return webResourceResponseM87049i0;
            }
            try {
                MDLog.m7391e("DNSTest", "lehua:offline  加载线上资源: mkweb handleAllRequest failed: " + webResourceRequest.getUrl().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String strM87047h0 = MKWebView.this.m87047h0(webResourceRequest.getUrl().toString());
            WebResourceResponse webResourceResponseM176238g = qsf.INSTANCE.m176238g(webResourceRequest, MKWebView.this.f63236Q, webView);
            return webResourceResponseM176238g != null ? webResourceResponseM176238g : super.shouldInterceptRequest(webView, strM87047h0);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z = MKWebView.this.f63254k0 != null && MKWebView.this.f63254k0.mo95002a(str);
            mxv.m156926a("MK---WebView", "tang------shouldOverrideUrlLoading " + str + "   hasProcessed " + z);
            if (z) {
                mxv.m156926a("MK---WebView", "tang------shouldOverrideUrlLoading 已经被处理，不需要额外处理");
                return true;
            }
            if (ani0.m97753a(str)) {
                MDLog.m7389d("MK---WebView", "url host in 3rd white host list");
                return false;
            }
            MKWebView.this.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            MKWebView.this.m87053k0(webView, str2, i, str);
            MKWebView.this.m86999A0("ERR_2.1", "onReceivedError1", str2, i, str);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse webResourceResponseM87049i0 = MKWebView.this.m87049i0(webView, str, null, null);
            if (webResourceResponseM87049i0 != null) {
                return webResourceResponseM87049i0;
            }
            MDLog.m7391e("DNSTest", "lehua:offline 加载线上资源: mkweb handleAllRequest failed: " + str);
            String strM87047h0 = MKWebView.this.m87047h0(str);
            mxv.m156926a("MK---WebView", "shouldInterceptRequest=====" + strM87047h0);
            return super.shouldInterceptRequest(webView, strM87047h0);
        }
    }

    @Override // immomo.com.mklibrary.core.base.p115ui.BaseWebView, android.webkit.WebView
    @Deprecated
    public void loadUrl(String str, Map<String, String> map) {
        loadUrl(str);
    }

    public MKWebView(Context context) {
        super(m87043f0(context));
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        m87055l0(context);
    }

    public MKWebView(Context context, cow cowVar) {
        super(m87043f0(context));
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        m87084Y(cowVar);
        m87055l0(context);
    }

    public MKWebView(Context context, AttributeSet attributeSet) {
        super(m87043f0(context), attributeSet);
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        m87055l0(context);
    }

    public MKWebView(Context context, AttributeSet attributeSet, int i) {
        super(m87043f0(context), attributeSet, i);
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        m87055l0(context);
    }

    @TargetApi(21)
    public MKWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(m87043f0(context), attributeSet, i, i2);
        this.f63244b = null;
        this.f63245c = new ehw();
        this.f63246d = DelayInjectState.NONE;
        this.f63247e = false;
        this.f63248f = null;
        this.f63249g = true;
        this.f63250h = false;
        this.f63256m = false;
        this.f63257n = false;
        this.f63258o = -1L;
        this.f63259p = false;
        this.f63261q = false;
        this.f63263s = new AtomicBoolean(false);
        this.f63264t = false;
        this.f63265u = 0;
        this.f63270z = null;
        this.f63219A = false;
        this.f63225F = true;
        this.f63231L = -1L;
        this.f63233N = false;
        this.f63234O = true;
        this.f63235P = true;
        this.f63236Q = new HashMap();
        this.f63237R = "";
        this.f63238S = new C14910c();
        this.f63239T = new AtomicBoolean(true);
        this.f63240U = false;
        this.f63241V = new C14911d();
        this.f63242W = new ArrayList();
        m87055l0(context);
    }
}
