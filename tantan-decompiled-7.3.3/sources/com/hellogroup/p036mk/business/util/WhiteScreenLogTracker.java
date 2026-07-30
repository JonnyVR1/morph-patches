package com.hellogroup.p036mk.business.util;

import android.webkit.WebResourceResponse;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d8g0;
import p153l.gfq0;
import p153l.jzv;
import p153l.xh3;
import p153l.yfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J!\u0010\r\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u0005J5\u0010!\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010\u0005J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0010R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u00109\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)¨\u0006@"}, m88121d2 = {"Lcom/hellogroup/mk/business/util/WhiteScreenLogTracker;", "", "", "webViewHash", "<init>", "(Ljava/lang/String;)V", "e", "()Ljava/lang/String;", "logSessionKey", "", "p", "type", "msg", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "()V", "url", "Landroid/webkit/WebResourceResponse;", "response", "h", "(Ljava/lang/String;Landroid/webkit/WebResourceResponse;)V", "f", RXScreenCaptureService.KEY_INDEX, "", "newProgress", "k", "(Ljava/lang/Integer;)V", "title", "m", "errorCode", "description", "failingUrl", "o", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "errorResponse", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/webkit/WebResourceResponse;)V", "q", "n", "a", "Ljava/lang/String;", "TAG", "", "Ll/gfq0;", "b", "Ljava/util/List;", "logTracker", "c", "Ljava/lang/Integer;", "lastProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isOpenTimeout", "isJobReleased", "I", "loadingOvertime", "", "Z", "mkWhiteLogTracker", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/o;", "whiteDisposable", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class WhiteScreenLogTracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<gfq0> logTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Integer lastProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicBoolean isOpenTimeout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean isJobReleased;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int loadingOvertime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private volatile boolean mkWhiteLogTracker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private InterfaceC15593o whiteDisposable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String webViewHash;

    public WhiteScreenLogTracker(@NotNull String str) {
        str.getClass();
        this.webViewHash = str;
        this.TAG = "WhiteScreenLogTracker";
        this.logTracker = new ArrayList();
        this.isOpenTimeout = new AtomicBoolean(false);
        this.isJobReleased = new AtomicBoolean(false);
        this.loadingOvertime = yfi.m215600p();
        this.mkWhiteLogTracker = yfi.m215608x();
    }

    /* JADX INFO: renamed from: e */
    private final String m18233e() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Iterator<T> it = this.logTracker.iterator();
            while (it.hasNext()) {
                stringBuffer.append(((gfq0) it.next()).toString());
            }
            this.logTracker.clear();
        } catch (Throwable th) {
            jzv.m147730c(this.TAG, "", th);
        }
        String string = stringBuffer.toString();
        string.getClass();
        String strW0 = StringsKt.m94347w0(string, "&&&");
        jzv.m147732e(this.TAG, "buildLog>>>" + strW0);
        return strW0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m18234p(String logSessionKey) {
        if (this.mkWhiteLogTracker && logSessionKey != null) {
            jzv.m147732e(this.TAG, "reportTimeoutError=".concat(logSessionKey));
            MKCoreLogManager.m18431i(logSessionKey).m211435J(m18233e());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18235f() {
        jzv.m147732e(this.TAG, BLiveResOperation.clear);
        m18243n();
        this.logTracker.clear();
        this.mkWhiteLogTracker = false;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m18236g(@Nullable String type, @Nullable String msg) {
        try {
            if (!this.mkWhiteLogTracker) {
                return;
            }
            if (msg == null) {
                msg = "";
            }
            if (msg.length() > 200) {
                msg = msg.substring(0, 200);
            }
            gfq0 gfq0Var = new gfq0(type, msg);
            this.logTracker.add(gfq0Var);
            jzv.m147732e(this.TAG, "record>>>   " + gfq0Var);
        } catch (Throwable th) {
            jzv.m147730c(this.TAG, "", th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18237h(@Nullable String url, @Nullable WebResourceResponse response) {
        if (this.mkWhiteLogTracker) {
            if ((url == null || !StringsKt.m94303P(url, ".js", false, 2, null)) && (url == null || !StringsKt.m94303P(url, ".html", false, 2, null))) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(response != null ? Integer.valueOf(response.getStatusCode()) : null);
            sb.append('$');
            sb.append(url);
            m18236g("shouldInterceptRequest", sb.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m18238i(@Nullable String url) {
        m18236g("onLoadResource", url);
    }

    /* JADX INFO: renamed from: j */
    public final void m18239j() {
        m18236g("onPageStarted", "");
    }

    /* JADX INFO: renamed from: k */
    public final void m18240k(@Nullable Integer newProgress) {
        String strValueOf;
        if (this.mkWhiteLogTracker) {
            Integer num = this.lastProgress;
            if (num == null || !Intrinsics.m88377d(num, newProgress)) {
                if (newProgress == null || (strValueOf = String.valueOf(newProgress.intValue())) == null) {
                    strValueOf = "0";
                }
                m18236g("onProgressChanged", strValueOf);
            }
            this.lastProgress = newProgress;
            if (newProgress != null && newProgress.intValue() == 100) {
                m18235f();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18241l(@Nullable WebResourceResponse errorResponse) {
        if (this.mkWhiteLogTracker) {
            StringBuilder sb = new StringBuilder();
            sb.append(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
            sb.append('$');
            sb.append(errorResponse != null ? errorResponse.getReasonPhrase() : null);
            m18236g("onReceivedTitle", sb.toString());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m18242m(@Nullable String title) {
        m18236g("onReceivedTitle", title);
    }

    /* JADX INFO: renamed from: n */
    public final void m18243n() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.isJobReleased.set(true);
            InterfaceC15593o interfaceC15593o = this.whiteDisposable;
            Unit unit = null;
            if (interfaceC15593o != null) {
                InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
                unit = Unit.INSTANCE;
            }
            Result.m225066constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        jzv.m147732e(this.TAG, "releaseTimeout");
    }

    /* JADX INFO: renamed from: o */
    public final void m18244o(@Nullable String logSessionKey, @Nullable Integer errorCode, @Nullable String description, @Nullable String failingUrl) {
        if (this.mkWhiteLogTracker) {
            jzv.m147732e(this.TAG, "reportInnerError=" + logSessionKey);
            m18236g("onReceivedError", errorCode + '$' + description + '$' + failingUrl);
            if (logSessionKey != null) {
                MKCoreLogManager.m18431i(this.webViewHash).m211434I(m18233e());
                m18235f();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m18245q(@Nullable String logSessionKey) {
        if (this.mkWhiteLogTracker && this.whiteDisposable == null && !this.isOpenTimeout.get() && this.loadingOvertime > 0) {
            MKCoreLogManager.m18431i(d8g0.m114836a(logSessionKey)).m211450u("startTimeLogCheck=" + this.loadingOvertime + ',');
            this.isOpenTimeout.set(true);
            this.whiteDisposable = xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new WhiteScreenLogTracker$startTimeLogCheck$1(this, logSessionKey, null), 3, null);
        }
    }
}
