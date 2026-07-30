package p149l;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mmutil.task.C3804c;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\"\"\u0004\b#\u0010\b¨\u0006%"}, m87232d2 = {"Ll/oiw;", "", "<init>", "()V", "", "msg", "", "g", "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "Ll/cip0;", "h", "()Ll/cip0;", "a", "Ljava/lang/String;", "WEB_APM", "", "b", "Z", "mIsPrepared", "c", "mInjectContent", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "monitorEnable", "Ljava/text/SimpleDateFormat;", "e", "Ljava/text/SimpleDateFormat;", "f", "()Ljava/text/SimpleDateFormat;", "k", "(Ljava/text/SimpleDateFormat;)V", "TIME_FORMATTER", "()Ljava/lang/String;", "j", "NETWORK_TYPE", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class oiw {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static volatile boolean mIsPrepared;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private static SimpleDateFormat TIME_FORMATTER;
    public static final oiw INSTANCE = new oiw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static String WEB_APM = "webApm";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static String mInjectContent = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final AtomicBoolean monitorEnable = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private static String NETWORK_TYPE = "";

    /* JADX INFO: renamed from: l.oiw$b */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "queueIdle"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class C18954b implements MessageQueue.IdleHandler {
        public static final C18954b INSTANCE = new C18954b();

        /* JADX INFO: renamed from: l.oiw$b$a */
        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
        public static final class a implements Runnable {
            public static final a INSTANCE = new a();

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    oiw oiwVar = oiw.INSTANCE;
                    oiw.m164567b(oiwVar).set(mei.m154192B());
                    if (oiw.m164567b(oiwVar).get()) {
                        oiw.mInjectContent = niw.m159566b();
                        oiw.mIsPrepared = !TextUtils.isEmpty(oiw.m164566a(oiwVar));
                    }
                    oiwVar.m164575j(na20.m158571b());
                    oiw.m164570g(" monitorEnable:" + oiw.m164567b(oiwVar) + "  mInjectContent:" + oiw.m164566a(oiwVar) + " prepare cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                } catch (Throwable th) {
                    MDLog.printErrStackTrace(oiw.WEB_APM, th);
                }
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            C3804c.m18444d(2, a.INSTANCE);
            return false;
        }
    }

    private oiw() {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m164566a(oiw oiwVar) {
        return mInjectContent;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicBoolean m164567b(oiw oiwVar) {
        return monitorEnable;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m164570g(@NotNull String msg) {
        msg.getClass();
        MDLog.m7389d(WEB_APM, msg);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m164571e() {
        return NETWORK_TYPE;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SimpleDateFormat m164572f() {
        return TIME_FORMATTER;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final cip0 m164573h() {
        return new C18953a(mIsPrepared ? mInjectContent : null, monitorEnable.get());
    }

    /* JADX INFO: renamed from: i */
    public final void m164574i() {
        Looper.myQueue().addIdleHandler(C18954b.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public final void m164575j(@Nullable String str) {
        NETWORK_TYPE = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m164576k(@Nullable SimpleDateFormat simpleDateFormat) {
        TIME_FORMATTER = simpleDateFormat;
    }

    /* JADX INFO: renamed from: l.oiw$a */
    @Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J5\u0010&\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'J'\u0010 \u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020*H\u0016¢\u0006\u0004\b \u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00101R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b8\u00109¨\u0006:"}, m87232d2 = {"Ll/oiw$a;", "Ll/cip0;", "", "mSdkContent", "", "monitorEnable", "<init>", "(Ljava/lang/String;Z)V", "url", FirebaseAnalytics.Param.LEVEL, "error", "isNative", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/webkit/WebView;", "webView", "h", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "webview", "Landroid/graphics/Bitmap;", "favicon", "a", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", OMSTemplateModeType.view, "", "newProgress", "f", "(Landroid/webkit/WebView;I)V", "b", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Ljava/lang/Exception;", "e", "c", "(Ljava/lang/String;Ljava/lang/Exception;)V", "errorCode", "description", "failingUrl", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "(Ljava/lang/String;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "dispose", "()V", "Ll/bip0;", "Ll/bip0;", "mWebMonitorInfo", "Z", "isDisposed", "", "J", "startOpenPage", "jsSdkInjected", "Ljava/lang/String;", "getMonitorEnable", "()Z", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class C18953a implements cip0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final bip0 mWebMonitorInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean isDisposed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private long startOpenPage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean jsSdkInjected;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String mSdkContent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean monitorEnable;

        /* JADX INFO: renamed from: l.oiw$a$a */
        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
        public static final class a implements Runnable {
            public static final a INSTANCE = new a();

            @Override // java.lang.Runnable
            public final void run() {
                oiw.INSTANCE.m164575j(na20.m158571b());
            }
        }

        public C18953a(@Nullable String str, boolean z) {
            this.mSdkContent = str;
            this.monitorEnable = z;
            this.startOpenPage = -1L;
            oiw.m164570g("---> new webMonitor");
            this.startOpenPage = System.currentTimeMillis();
            C3804c.m18444d(1, a.INSTANCE);
            this.mWebMonitorInfo = new bip0(shw.m184280D(), oiw.INSTANCE.m164571e());
        }

        /* JADX INFO: renamed from: h */
        private final boolean m164578h(WebView webView, String url) {
            if (b0g0.m99776i(url) && (webView instanceof MKWebView)) {
                if (url != null ? StringsKt.m93412P(url, "_bid", false, 2, null) : false) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: a */
        public void mo107088a(@Nullable WebView webview, @Nullable String url, @Nullable Bitmap favicon) {
            if (webview != null) {
                this.jsSdkInjected = false;
                if (liw.m149946g(url)) {
                    return;
                }
                niw.C18702a c18702aM159570d = niw.INSTANCE.m159570d(url);
                String strM159571a = c18702aM159570d.getUrl();
                if (c18702aM159570d.getIsInnerUrl()) {
                    return;
                }
                boolean zM164578h = m164578h(webview, strM159571a);
                bip0 bip0Var = this.mWebMonitorInfo;
                if (zM164578h) {
                    bip0Var.f75785a = zhw.m218869b(strM159571a);
                    this.mWebMonitorInfo.f75789e = String.valueOf(yhw.m214862s().m214873v(this.mWebMonitorInfo.f75785a));
                } else {
                    bip0Var.f75785a = null;
                    bip0Var.f75789e = "none";
                }
                this.mWebMonitorInfo.f75790f = System.currentTimeMillis();
                oiw oiwVar = oiw.INSTANCE;
                if (oiwVar.m164572f() == null) {
                    oiwVar.m164576k(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA));
                }
                SimpleDateFormat simpleDateFormatM164572f = oiwVar.m164572f();
                oiw.m164570g("onPageStarted url:" + c18702aM159570d.getUrl() + " time:" + (simpleDateFormatM164572f != null ? simpleDateFormatM164572f.format(new Date(this.mWebMonitorInfo.f75790f)) : null) + " info:" + this.mWebMonitorInfo);
            }
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: b */
        public void mo107089b(@Nullable WebView webview, @NotNull String url) {
            url.getClass();
            if (webview == null || !this.monitorEnable) {
                return;
            }
            if (liw.m149946g(url)) {
                this.jsSdkInjected = false;
                return;
            }
            niw niwVar = niw.INSTANCE;
            if (niwVar.m159570d(url).getIsInnerUrl() || this.jsSdkInjected) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM159568a = niwVar.m159568a(this.mWebMonitorInfo, this.startOpenPage);
            webview.loadUrl(strM159568a);
            if (b0g0.m99776i(this.mSdkContent)) {
                webview.loadUrl(this.mSdkContent);
                this.jsSdkInjected = true;
            }
            oiw.m164570g("defaultH5Info: " + strM159568a + " sdkContent: " + this.mSdkContent);
            StringBuilder sb = new StringBuilder("onPageFinished inject sdk cost: ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append(" ms");
            oiw.m164570g(sb.toString());
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: c */
        public void mo107090c(@Nullable String url, @NotNull Exception e) {
            e.getClass();
            m164577g(url, "error", e.getMessage(), true);
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: d */
        public void mo107091d(@Nullable String url, int errorCode, @Nullable String description, @Nullable String failingUrl) {
            m164577g(url, "error", description, false);
        }

        @Override // p149l.cip0
        public void dispose() {
            this.isDisposed = true;
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: e */
        public void mo107092e(@NotNull String url, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            url.getClass();
            handler.getClass();
            error.getClass();
            m164577g(url, "error", error.toString(), false);
        }

        @Override // p149l.cip0
        /* JADX INFO: renamed from: f */
        public void mo107093f(@Nullable WebView view, int newProgress) {
            oiw.m164570g("onProgressChanged " + newProgress);
        }

        /* JADX INFO: renamed from: g */
        private final void m164577g(String url, String level, String error, boolean isNative) {
        }
    }
}
