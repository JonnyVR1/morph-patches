package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0003J3\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0003R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m88121d2 = {"Ll/mjw;", "", "<init>", "()V", "", "k", "()Ljava/lang/String;", "Landroid/webkit/WebView;", "webView", "Landroid/content/Context;", "context", "", Constants.KEY_T, "(Landroid/webkit/WebView;Landroid/content/Context;)Z", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "m", "(Landroid/content/Context;)Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "u", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "p", "q", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/app/Activity;", "activity", "startUrl", "Landroid/content/Intent;", "intent", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/app/Activity;Ljava/lang/String;Landroid/content/Intent;)Lcom/hellogroup/mk/business/base/ui/MKWebView;", "webview", "r", "(Landroid/webkit/WebView;)V", "o", "a", "Ljava/lang/String;", "getPreLoadUrl", "setPreLoadUrl", "(Ljava/lang/String;)V", "preLoadUrl", "", "b", "I", "maxCacheSize", "", "c", "J", "cacheTimeout", Constants.INAPP_DATA_TAG, "lastCreateWebTime", "Ljava/lang/ref/SoftReference;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/lang/ref/SoftReference;", "cachePool", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "runningWebViewSize", "g", "Z", "enableLoadData", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class mjw {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static int maxCacheSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static long cacheTimeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static long lastCreateWebTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static boolean enableLoadData;
    public static final mjw INSTANCE = new mjw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String preLoadUrl = "data:text/html; charset=utf-8,";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final SoftReference<CopyOnWriteArrayList<MKWebView>> cachePool = new SoftReference<>(new CopyOnWriteArrayList());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final AtomicInteger runningWebViewSize = new AtomicInteger();

    /* JADX INFO: renamed from: l.mjw$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "queueIdle"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C18628a implements MessageQueue.IdleHandler {
        public static final C18628a INSTANCE = new C18628a();

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            CopyOnWriteArrayList copyOnWriteArrayList;
            MKWebView mKWebViewM158633n;
            try {
                mjw mjwVar = mjw.INSTANCE;
                if (mjw.m158624d(mjwVar) <= 0) {
                    mjw.maxCacheSize = yfi.m215602r();
                    mjw.enableLoadData = yfi.m215598n();
                    mjw.cacheTimeout = ((long) (yfi.m215606v() * 60)) * 1000;
                }
                jzv.m147728a("MKCachePoolManager", "lehua:boost 缓存池参数 " + mjwVar.m158631k());
                if (mjw.m158624d(mjwVar) > 0 && (copyOnWriteArrayList = (CopyOnWriteArrayList) mjw.m158622b(mjwVar).get()) != null && copyOnWriteArrayList.isEmpty() && mjw.m158624d(mjwVar) - mjw.m158625e(mjwVar).get() > 0 && (mKWebViewM158633n = mjw.m158633n(mjwVar, null, 1, null)) != null) {
                    copyOnWriteArrayList.add(mKWebViewM158633n);
                    mjw.lastCreateWebTime = SystemClock.uptimeMillis();
                    if (mjw.m158623c(mjwVar)) {
                        String strM215597m = yfi.m215597m();
                        long jM17588i = FepManager.INSTANCE.m17610a().m17588i(yfi.m215594j(), (strM215597m == null || !C15493d.m94374J(strM215597m, "https://", false, 2, null)) ? "" : strM215597m);
                        if (!yfi.m215590f() || !hjw.INSTANCE.m135534a(jM17588i) || strM215597m == null || StringsKt.m94329e0(strM215597m)) {
                            jzv.m147728a("MKCachePoolManager", "lehua:boost 创建缓存池 普通MKWebView 实例");
                            gjw gjwVar = mKWebViewM158633n.f12081c;
                            gjwVar.m130558d(false);
                            gjwVar.m130561g(0L);
                            gjwVar.m130560f("");
                            mKWebViewM158633n.loadDataWithBaseURL(null, "<html><style>html,body{background:transparent;}</style><body></body><html>", MimeTypes.TEXT_HTML, "UTF-8", null);
                        } else {
                            jzv.m147728a("MKCachePoolManager", "lehua:boost 创建缓存池 加速器MKWebView 实例 " + strM215597m);
                            mKWebViewM158633n.setWebUserAgent(sjw.m186321j(strM215597m));
                            gjw gjwVar2 = mKWebViewM158633n.f12081c;
                            gjwVar2.m130558d(true);
                            gjwVar2.m130561g(jM17588i);
                            gjwVar2.m130560f(strM215597m);
                            mKWebViewM158633n.m17911V0(strM215597m);
                        }
                    }
                }
            } catch (Throwable th) {
                jzv.m147730c("MKCachePoolManager", "", th);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.mjw$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/mjw$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C18629b extends WebViewClient {
        final /* synthetic */ Ref.ObjectRef $mkWebView;

        public C18629b(Ref.ObjectRef objectRef) {
            this.$mkWebView = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
            try {
                jzv.m147728a("MKCachePoolManager", "lehua:boost:onRenderProcessGone: 缓存池内存回收");
                mjw mjwVar = mjw.INSTANCE;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) mjw.m158622b(mjwVar).get();
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                if (!(view instanceof MKWebView)) {
                    view = null;
                }
                MKWebView mKWebView = (MKWebView) view;
                if (mKWebView != null && !mKWebView.isDestroyed()) {
                    mKWebView.m17915b1();
                }
                mjwVar.m158635u((MKWebView) this.$mkWebView.element);
                return true;
            } catch (Throwable th) {
                jzv.m147730c("MKCachePoolManager", "", th);
                return true;
            }
        }
    }

    private mjw() {
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ SoftReference m158622b(mjw mjwVar) {
        return cachePool;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean m158623c(mjw mjwVar) {
        return enableLoadData;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int m158624d(mjw mjwVar) {
        return maxCacheSize;
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicInteger m158625e(mjw mjwVar) {
        return runningWebViewSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final String m158631k() {
        return "{\n            \"maxCacheSize\": \"" + maxCacheSize + "\",\n            \"enableLoadData\": \"" + enableLoadData + "\",\n            \"cacheTimeout\": \"" + cacheTimeout + "\",\n            \"runningWebViewSize\": \"" + runningWebViewSize.get() + "\"\n        }";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View, com.hellogroup.mk.business.base.ui.MKWebView] */
    /* JADX INFO: renamed from: m */
    private final MKWebView m158632m(Context context) {
        Context contextM155971a = lv0.m155971a();
        if (contextM155971a == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jzv.m147732e("MKCachePoolManager", "create start");
            if (context == null) {
                context = contextM155971a;
            }
            ?? mKWebView = new MKWebView((Context) new MutableContextWrapper(context), true);
            objectRef.element = mKWebView;
            mKWebView.setBackgroundColor(0);
            ((MKWebView) objectRef.element).setWebViewClient(new C18629b(objectRef));
            jzv.m147732e("MKCachePoolManager", "createWebView=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            jzv.m147730c("MKCachePoolManager", "", th);
        }
        return (MKWebView) objectRef.element;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ MKWebView m158633n(mjw mjwVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return mjwVar.m158632m(context);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m158634t(WebView webView, Context context) {
        if (context != null && webView != null) {
            try {
                Context context2 = webView.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context);
                    return true;
                }
            } catch (Throwable th) {
                jzv.m147730c("MKCachePoolManager", "", th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m158635u(MKWebView mkWebView) {
        MKCoreLogManager.m18427e().m18463z(mkWebView.getBid(), Boolean.valueOf(sjw.m186325n()));
    }

    /* JADX INFO: renamed from: l */
    public final void m158636l() {
        try {
            Looper.myQueue().addIdleHandler(C18628a.INSTANCE);
        } catch (Throwable th) {
            jzv.m147730c("MKCachePoolManager", "", th);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m158637o() {
        MKWebView mKWebView;
        try {
            SoftReference<CopyOnWriteArrayList<MKWebView>> softReference = cachePool;
            CopyOnWriteArrayList<MKWebView> copyOnWriteArrayList = softReference.get();
            if (copyOnWriteArrayList == null || (mKWebView = (MKWebView) CollectionsKt.first((List) copyOnWriteArrayList)) == null) {
                return;
            }
            jzv.m147728a("MKCachePoolManager", "lehua:boost onLowMemory:缓存池内存被回收了");
            softReference.clear();
            mKWebView.m17915b1();
        } catch (Throwable th) {
            jzv.m147730c("MKCachePoolManager", "", th);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m158638p() {
        runningWebViewSize.incrementAndGet();
    }

    /* JADX INFO: renamed from: q */
    public final void m158639q() {
        runningWebViewSize.decrementAndGet();
        m158636l();
    }

    /* JADX INFO: renamed from: r */
    public final void m158640r(@Nullable WebView webview) {
        if (webview != null) {
            m158634t(webview, lv0.m155971a());
        }
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: s */
    public final MKWebView m158641s(@Nullable Activity activity, @Nullable String startUrl, @Nullable Intent intent) {
        CopyOnWriteArrayList<MKWebView> copyOnWriteArrayList;
        if (activity != null && (copyOnWriteArrayList = cachePool.get()) != null && !copyOnWriteArrayList.isEmpty()) {
            try {
                MKWebView mKWebView = (MKWebView) CollectionsKt.first((List) copyOnWriteArrayList);
                copyOnWriteArrayList.clear();
                if (mKWebView == null) {
                    return null;
                }
                if (SystemClock.uptimeMillis() - lastCreateWebTime > cacheTimeout) {
                    mKWebView.m17915b1();
                    return null;
                }
                if (mKWebView.isDestroyed() || !INSTANCE.m158634t(mKWebView, activity)) {
                    return null;
                }
                int i = -1;
                if (startUrl != null) {
                    try {
                        Uri uri = Uri.parse(startUrl);
                        uri.getClass();
                        if (Intrinsics.m88377d("1", uri.getQueryParameter("_bgc_transparent"))) {
                            i = 0;
                        }
                    } catch (Exception e) {
                        jzv.m147730c("MKCachePoolManager", "", e);
                    }
                    if (intent == null) {
                        mKWebView.m17932t0(brw.m106163b(startUrl));
                    } else {
                        mKWebView.m17932t0(brw.m106162a(intent, startUrl));
                    }
                }
                mKWebView.setBackgroundColor(i);
                jzv.m147728a("MKCachePoolManager", "lehua:boost:pop createWebView from cache boost=" + mKWebView.f12081c);
                return mKWebView;
            } catch (Throwable th) {
                jzv.m147730c("MKCachePoolManager", "", th);
            }
        }
        return null;
    }
}
