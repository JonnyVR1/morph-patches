package com.hellogroup.p036mk.business.webmonitor;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.core.FepManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a6k0;
import p153l.drb;
import p153l.frp0;
import p153l.glw;
import p153l.grp0;
import p153l.hul;
import p153l.i8g0;
import p153l.jlw;
import p153l.jzv;
import p153l.l4k;
import p153l.r5e;
import p153l.sjw;
import p153l.uyp;
import p153l.wi20;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010#\"\u0004\b$\u0010\t¨\u0006'"}, m88121d2 = {"Lcom/hellogroup/mk/business/webmonitor/MKWebMonitorManager;", "", "<init>", "()V", "", "g", "", "msg", "h", "(Ljava/lang/String;)V", "j", "Ll/grp0;", RXScreenCaptureService.KEY_INDEX, "()Ll/grp0;", "a", "Ljava/lang/String;", "WEB_APM", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsPrepared", "Ljava/util/concurrent/atomic/AtomicReference;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "mInjectContent", Constants.INAPP_DATA_TAG, "monitorEnable", "Ljava/text/SimpleDateFormat;", "e", "Ljava/text/SimpleDateFormat;", "f", "()Ljava/text/SimpleDateFormat;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/text/SimpleDateFormat;)V", "TIME_FORMATTER", "()Ljava/lang/String;", "k", "NETWORK_TYPE", "WebMonitor", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKWebMonitorManager {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private static SimpleDateFormat TIME_FORMATTER;
    public static final MKWebMonitorManager INSTANCE = new MKWebMonitorManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static String WEB_APM = "webApm";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static volatile AtomicBoolean mIsPrepared = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static AtomicReference<String> mInjectContent = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final AtomicBoolean monitorEnable = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private static String NETWORK_TYPE = "";

    @Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b%\u0010&J'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020)H\u0016¢\u0006\u0004\b\u001f\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\u0003R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00105¨\u00067"}, m88121d2 = {"Lcom/hellogroup/mk/business/webmonitor/MKWebMonitorManager$WebMonitor;", "Ll/grp0;", "<init>", "()V", "", "url", FirebaseAnalytics.Param.LEVEL, "error", "", "isNative", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/webkit/WebView;", "webView", "h", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "webview", "Landroid/graphics/Bitmap;", "favicon", "a", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", OMSTemplateModeType.view, "", "newProgress", "f", "(Landroid/webkit/WebView;I)V", "b", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "c", "(Ljava/lang/String;Ljava/lang/Exception;)V", "errorCode", "description", "failingUrl", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "(Ljava/lang/String;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "dispose", "Ll/frp0;", "Ll/frp0;", "mWebMonitorInfo", "Z", "isDisposed", "", "J", "startOpenPage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "jsSdkInjected", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class WebMonitor implements grp0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final frp0 mWebMonitorInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean isDisposed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private long startOpenPage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private AtomicBoolean jsSdkInjected = new AtomicBoolean();

        /* JADX INFO: renamed from: com.hellogroup.mk.business.webmonitor.MKWebMonitorManager$WebMonitor$1 */
        @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
        @DebugMetadata(m88262c = "com.hellogroup.mk.business.webmonitor.MKWebMonitorManager$WebMonitor$1", m88263f = "MKWebMonitorManager.kt", m88264l = {}, m88265m = "invokeSuspend")
        public static final class C35701 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
            int label;

            /* JADX INFO: renamed from: p$ */
            private drb f12335p$;

            public C35701(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                continuation.getClass();
                C35701 c35701 = new C35701(continuation);
                c35701.f12335p$ = (drb) obj;
                return c35701;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
                return ((C35701) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                uyp.m198688e();
                if (this.label != 0) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
                MKWebMonitorManager.INSTANCE.m18256k(wi20.m206538b());
                return Unit.INSTANCE;
            }
        }

        public WebMonitor() {
            this.startOpenPage = -1L;
            MKWebMonitorManager.m18251h("---> new webMonitor");
            this.startOpenPage = System.currentTimeMillis();
            xh3.m210980d(l4k.INSTANCE, r5e.m179861b(), null, new C35701(null), 2, null);
            this.mWebMonitorInfo = new frp0(sjw.m186330t(), MKWebMonitorManager.INSTANCE.m18252e());
        }

        /* JADX INFO: renamed from: g */
        private final void m18258g(String url, String level, String error, boolean isNative) {
        }

        /* JADX INFO: renamed from: h */
        private final boolean m18259h(WebView webView, String url) {
            if (i8g0.m139007i(url) && (webView instanceof hul)) {
                if (url != null ? StringsKt.m94303P(url, "_bid", false, 2, null) : false) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: a */
        public void mo18260a(@Nullable WebView webview, @Nullable String url, @Nullable Bitmap favicon) {
            if (webview != null) {
                this.jsSdkInjected.set(false);
                if (glw.m130710g(url)) {
                    return;
                }
                jlw.C17976a c17976aM146119d = jlw.INSTANCE.m146119d(url);
                String strM146120a = c17976aM146119d.getUrl();
                if (c17976aM146119d.getIsInnerUrl()) {
                    return;
                }
                boolean zM18259h = m18259h(webview, strM146120a);
                frp0 frp0Var = this.mWebMonitorInfo;
                if (zM18259h) {
                    frp0Var.f100445a = a6k0.m96329a(strM146120a);
                    this.mWebMonitorInfo.f100449e = String.valueOf(FepManager.INSTANCE.m17610a().m17588i(this.mWebMonitorInfo.f100445a, strM146120a));
                } else {
                    frp0Var.f100445a = null;
                    frp0Var.f100449e = "none";
                }
                this.mWebMonitorInfo.f100450f = System.currentTimeMillis();
                MKWebMonitorManager mKWebMonitorManager = MKWebMonitorManager.INSTANCE;
                if (mKWebMonitorManager.m18253f() == null) {
                    mKWebMonitorManager.m18257l(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA));
                }
                SimpleDateFormat simpleDateFormatM18253f = mKWebMonitorManager.m18253f();
                MKWebMonitorManager.m18251h("onPageStarted url:" + c17976aM146119d.getUrl() + " time:" + (simpleDateFormatM18253f != null ? simpleDateFormatM18253f.format(new Date(this.mWebMonitorInfo.f100450f)) : null) + " info:" + this.mWebMonitorInfo);
            }
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: b */
        public void mo18261b(@Nullable WebView webview, @NotNull String url) {
            url.getClass();
            if (webview != null) {
                MKWebMonitorManager mKWebMonitorManager = MKWebMonitorManager.INSTANCE;
                if (MKWebMonitorManager.m18248c(mKWebMonitorManager).get()) {
                    if (glw.m130710g(url)) {
                        this.jsSdkInjected.set(false);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jlw jlwVar = jlw.INSTANCE;
                    if (!jlwVar.m146119d(url).getIsInnerUrl() && !this.jsSdkInjected.get()) {
                        String strM146117a = jlwVar.m146117a(this.mWebMonitorInfo, this.startOpenPage);
                        webview.loadUrl(strM146117a);
                        String str = (String) MKWebMonitorManager.m18246a(mKWebMonitorManager).get();
                        if (str != null && i8g0.m139002d(str)) {
                            webview.loadUrl(str);
                            this.jsSdkInjected.set(true);
                        }
                        MKWebMonitorManager.m18251h("defaultH5Info: " + strM146117a + " sdkContent: " + str);
                    }
                    MKWebMonitorManager.m18251h("onPageFinished inject sdk cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: c */
        public void mo18262c(@Nullable String url, @NotNull Exception e) {
            e.getClass();
            m18258g(url, "error", e.getMessage(), true);
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: d */
        public void mo18263d(@Nullable String url, int errorCode, @Nullable String description, @Nullable String failingUrl) {
            m18258g(url, "error", description, false);
        }

        @Override // p153l.grp0
        public void dispose() {
            this.isDisposed = true;
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: e */
        public void mo18264e(@NotNull String url, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            url.getClass();
            handler.getClass();
            error.getClass();
            m18258g(url, "error", error.toString(), false);
        }

        @Override // p153l.grp0
        /* JADX INFO: renamed from: f */
        public void mo18265f(@Nullable WebView view, int newProgress) {
            MKWebMonitorManager.m18251h("onProgressChanged " + newProgress);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.webmonitor.MKWebMonitorManager$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "queueIdle"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C3571a implements MessageQueue.IdleHandler {
        public static final C3571a INSTANCE = new C3571a();

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            MKWebMonitorManager.INSTANCE.m18250g();
            return false;
        }
    }

    private MKWebMonitorManager() {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReference m18246a(MKWebMonitorManager mKWebMonitorManager) {
        return mInjectContent;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicBoolean m18248c(MKWebMonitorManager mKWebMonitorManager) {
        return monitorEnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m18250g() {
        xh3.m210980d(l4k.INSTANCE, r5e.m179861b(), null, new MKWebMonitorManager$initJsSdk$1(null), 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m18251h(@NotNull String msg) {
        msg.getClass();
        jzv.m147728a(WEB_APM, msg);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m18252e() {
        return NETWORK_TYPE;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SimpleDateFormat m18253f() {
        return TIME_FORMATTER;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final grp0 m18254i() {
        return new WebMonitor();
    }

    /* JADX INFO: renamed from: j */
    public final void m18255j() {
        if (sjw.m186319h()) {
            Looper.myQueue().addIdleHandler(C3571a.INSTANCE);
        } else {
            m18250g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18256k(@Nullable String str) {
        NETWORK_TYPE = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m18257l(@Nullable SimpleDateFormat simpleDateFormat) {
        TIME_FORMATTER = simpleDateFormat;
    }
}
