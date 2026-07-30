package p149l;

import android.app.Activity;
import android.app.Application;
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
import com.cosmos.mdlog.MDLog;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0003J3\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0003R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m87232d2 = {"Ll/ihw;", "", "<init>", "()V", "", "k", "()Ljava/lang/String;", "Landroid/webkit/WebView;", "webView", "Landroid/content/Context;", "context", "", Constants.KEY_T, "(Landroid/webkit/WebView;Landroid/content/Context;)Z", "Limmomo/com/mklibrary/core/base/ui/MKWebView;", "m", "(Landroid/content/Context;)Limmomo/com/mklibrary/core/base/ui/MKWebView;", "mkWebView", "", "u", "(Limmomo/com/mklibrary/core/base/ui/MKWebView;)V", "p", "q", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/app/Activity;", "activity", "startUrl", "Landroid/content/Intent;", "intent", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/app/Activity;Ljava/lang/String;Landroid/content/Intent;)Limmomo/com/mklibrary/core/base/ui/MKWebView;", "webview", "r", "(Landroid/webkit/WebView;)V", "o", "", "a", "I", "maxCacheSize", "", "b", "J", "cacheTimeout", "c", "lastCreateWebTime", "Ljava/util/concurrent/CopyOnWriteArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/CopyOnWriteArrayList;", "cachePool", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/atomic/AtomicInteger;", "runningWebViewSize", "f", "Z", "enableLoadData", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class ihw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static int maxCacheSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long cacheTimeout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static long lastCreateWebTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static boolean enableLoadData;
    public static final ihw INSTANCE = new ihw();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final CopyOnWriteArrayList<MKWebView> cachePool = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final AtomicInteger runningWebViewSize = new AtomicInteger();

    /* JADX INFO: renamed from: l.ihw$a */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "queueIdle"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class C17553a implements MessageQueue.IdleHandler {
        public static final C17553a INSTANCE = new C17553a();

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            MKWebView mKWebViewM136314n;
            try {
                ihw ihwVar = ihw.INSTANCE;
                if (ihw.m136305d(ihwVar) <= 0) {
                    ihw.maxCacheSize = mei.m154218x();
                    ihw.enableLoadData = mei.m154215u();
                    ihw.cacheTimeout = ((long) (mei.m154191A() * 60)) * 1000;
                }
                MDLog.m7389d("MKCachePoolManager", "lehua:boost 缓存池参数 " + ihwVar.m136312k());
                if (ihw.m136305d(ihwVar) > 0 && ihw.m136305d(ihwVar) - ihw.m136306e(ihwVar).get() > 0 && ihw.m136303b(ihwVar).isEmpty() && (mKWebViewM136314n = ihw.m136314n(ihwVar, null, 1, null)) != null) {
                    ihw.m136303b(ihwVar).add(mKWebViewM136314n);
                    ihw.lastCreateWebTime = SystemClock.uptimeMillis();
                    if (ihw.m136304c(ihwVar)) {
                        String strM154214t = mei.m154214t();
                        long jM214873v = yhw.m214862s().m214873v(mei.m154206l());
                        if (!mei.m154199e() || !fhw.INSTANCE.m121465a(jM214873v) || strM154214t == null || StringsKt.m93438e0(strM154214t)) {
                            MDLog.m7389d("MKCachePoolManager", "lehua:boost 创建缓存池 普通MKWebView 实例");
                            ehw ehwVar = mKWebViewM136314n.f63245c;
                            ehwVar.m116601d(false);
                            ehwVar.m116604g(0L);
                            ehwVar.m116603f("");
                            mKWebViewM136314n.loadDataWithBaseURL(null, "<html><style>html,body{background:transparent;}</style><body></body><html>", MimeTypes.TEXT_HTML, "UTF-8", null);
                        } else {
                            MDLog.m7389d("MKCachePoolManager", "lehua:boost 创建缓存池 加速器MKWebView 实例 " + strM154214t);
                            mKWebViewM136314n.setWebUserAgent(shw.m184291k());
                            ehw ehwVar2 = mKWebViewM136314n.f63245c;
                            ehwVar2.m116601d(true);
                            ehwVar2.m116604g(jM214873v);
                            strM154214t.getClass();
                            ehwVar2.m116603f(strM154214t);
                            mKWebViewM136314n.m87091y0(strM154214t);
                        }
                    }
                }
            } catch (Throwable th) {
                MDLog.printErrStackTrace("MKCachePoolManager", th);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ihw$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/ihw$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C17554b extends WebViewClient {
        final /* synthetic */ Ref.ObjectRef $mkWebView;

        public C17554b(Ref.ObjectRef objectRef) {
            this.$mkWebView = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
            try {
                MDLog.m7389d("MKCachePoolManager", "lehua:boost:onRenderProcessGone: 缓存池内存回收");
                ihw ihwVar = ihw.INSTANCE;
                ihw.m136303b(ihwVar).clear();
                if (!(view instanceof MKWebView)) {
                    view = null;
                }
                MKWebView mKWebView = (MKWebView) view;
                if (mKWebView != null && !mKWebView.m87087q0()) {
                    mKWebView.m87078C0();
                }
                ihwVar.m136316u((MKWebView) this.$mkWebView.element);
                return true;
            } catch (Throwable th) {
                MDLog.printErrStackTrace("MKCachePoolManager", th);
                return true;
            }
        }
    }

    private ihw() {
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CopyOnWriteArrayList m136303b(ihw ihwVar) {
        return cachePool;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean m136304c(ihw ihwVar) {
        return enableLoadData;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int m136305d(ihw ihwVar) {
        return maxCacheSize;
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicInteger m136306e(ihw ihwVar) {
        return runningWebViewSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final String m136312k() {
        return "{\n            \"maxCacheSize\": \"" + maxCacheSize + "\",\n            \"enableLoadData\": \"" + enableLoadData + "\",\n            \"cacheTimeout\": \"" + cacheTimeout + "\",\n            \"runningWebViewSize\": \"" + runningWebViewSize.get() + "\"\n        }";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View, immomo.com.mklibrary.core.base.ui.MKWebView] */
    /* JADX INFO: renamed from: m */
    private final MKWebView m136313m(Context context) {
        Application applicationM184283c = shw.m184283c();
        if (applicationM184283c == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MDLog.m7395i("MKCachePoolManager", "create start");
            if (context == null) {
                context = applicationM184283c;
            }
            ?? mKWebView = new MKWebView((Context) new MutableContextWrapper(context), true);
            objectRef.element = mKWebView;
            mKWebView.setBackgroundColor(0);
            ((MKWebView) objectRef.element).setWebViewClient(new C17554b(objectRef));
            MDLog.m7395i("MKCachePoolManager", "createWebView=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKCachePoolManager", th);
        }
        return (MKWebView) objectRef.element;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ MKWebView m136314n(ihw ihwVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return ihwVar.m136313m(context);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m136315t(WebView webView, Context context) {
        if (context != null && webView != null) {
            try {
                Context context2 = webView.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context);
                    return true;
                }
            } catch (Throwable th) {
                MDLog.printErrStackTrace("MKCachePoolManager", th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m136316u(MKWebView mkWebView) {
        qnw.m175704a("momo-web").m128649e(mkWebView.getBid()).m128650f("recycle_reload_cache").m128645a(new onw("is_foreground", Boolean.valueOf(shw.m184302v()))).m128647c();
    }

    /* JADX INFO: renamed from: l */
    public final void m136317l() {
        try {
            Looper.myQueue().addIdleHandler(C17553a.INSTANCE);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKCachePoolManager", th);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m136318o() {
        try {
            CopyOnWriteArrayList<MKWebView> copyOnWriteArrayList = cachePool;
            MKWebView mKWebView = (MKWebView) CollectionsKt.first((List) copyOnWriteArrayList);
            if (mKWebView != null) {
                MDLog.m7389d("MKCachePoolManager", "lehua:boost onLowMemory:缓存池内存被回收了");
                copyOnWriteArrayList.clear();
                mKWebView.m87078C0();
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKCachePoolManager", th);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m136319p() {
        runningWebViewSize.incrementAndGet();
    }

    /* JADX INFO: renamed from: q */
    public final void m136320q() {
        runningWebViewSize.decrementAndGet();
        m136317l();
    }

    /* JADX INFO: renamed from: r */
    public final void m136321r(@Nullable WebView webview) {
        if (webview != null) {
            m136315t(webview, shw.m184283c());
        }
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: s */
    public final MKWebView m136322s(@Nullable Activity activity, @Nullable String startUrl, @Nullable Intent intent) {
        if (activity == null) {
            MDLog.m7389d("MKCachePoolManager", "lehua:boost:pop: activity is null");
            return null;
        }
        CopyOnWriteArrayList<MKWebView> copyOnWriteArrayList = cachePool;
        if (copyOnWriteArrayList.isEmpty()) {
            MDLog.m7389d("MKCachePoolManager", "lehua:boost:pop: empty cachePool");
            return null;
        }
        try {
            MKWebView mKWebView = (MKWebView) CollectionsKt.first((List) copyOnWriteArrayList);
            if (mKWebView == null) {
                return null;
            }
            copyOnWriteArrayList.clear();
            if (SystemClock.uptimeMillis() - lastCreateWebTime > cacheTimeout) {
                mKWebView.m87078C0();
                MDLog.m7389d("MKCachePoolManager", "lehua:boost:pop: cache webview timeout will be destroy");
                return null;
            }
            if (mKWebView.m87087q0()) {
                MDLog.m7389d("MKCachePoolManager", "lehua:boost:pop cache webview is destroyed");
                return null;
            }
            if (!m136315t(mKWebView, activity)) {
                MDLog.m7391e("MKCachePoolManager", "lehua:boost:pop: replace context to activity fail");
                return null;
            }
            int i = -1;
            if (startUrl != null) {
                try {
                    if (Intrinsics.m87488d("1", Uri.parse(startUrl).getQueryParameter("_bgc_transparent"))) {
                        i = 0;
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace("MKCachePoolManager", e);
                }
                if (intent == null) {
                    mKWebView.m87084Y(cow.m108033b(startUrl));
                } else {
                    mKWebView.m87084Y(cow.m108032a(intent, startUrl));
                }
            }
            mKWebView.setBackgroundColor(i);
            MDLog.m7389d("MKCachePoolManager", "lehua:boost:pop createWebView from cache boost=" + mKWebView.f63245c);
            return mKWebView;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKCachePoolManager", th);
            return null;
        }
    }
}
