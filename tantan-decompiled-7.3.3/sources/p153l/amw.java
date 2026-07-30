package p153l;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0012\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b28\u0010\u0011\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0014\u0010*\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'¨\u00064"}, m88121d2 = {"Ll/amw;", "", "<init>", "()V", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Landroid/view/ViewGroup;", "webRootView", "", "startUrl", "Lkotlin/Function2;", "Ll/zlw;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "mkWhiteRepairData", "rebuildUrl", "", "rebuildMK", Constants.INAPP_DATA_TAG, "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Landroid/view/ViewGroup;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", OMSTemplateModeType.view, "Lkotlin/Function0;", "reloadCallback", "c", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "b", "a", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "retryReloadWebViewCnt", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isNeedReloadWebView", "", "I", "WEB_RECYCLE_RELOAD_RETRY_TIME", "", "Z", "isOpenWhiteRepair", "e", "isOpenWhiteRepairNow", "f", "isPageVisible", "", "g", "J", "lastResumeRepair", "h", "isReloadRightNow", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class amw {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicInteger retryReloadWebViewCnt = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicBoolean isNeedReloadWebView = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int WEB_RECYCLE_RELOAD_RETRY_TIME = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isOpenWhiteRepair = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isOpenWhiteRepairNow = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isPageVisible;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long lastResumeRepair;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isReloadRightNow;

    /* JADX INFO: renamed from: a */
    public final void m98860a(@Nullable MKWebView mkWebView) {
        if (mkWebView != null) {
            try {
                mkWebView.m17928p0();
            } catch (Throwable th) {
                jzv.m147730c("MKWhiteScreenUtil", "", th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m98861b() {
        this.isPageVisible = false;
        jzv.m147732e("MKWhiteScreenUtil", "onPagePause");
    }

    /* JADX INFO: renamed from: c */
    public final void m98862c(@Nullable MKWebView mkWebView, @Nullable View view, @NotNull Function0<Unit> reloadCallback) {
        reloadCallback.getClass();
        if (mkWebView != null && Intrinsics.m88377d(mkWebView, view)) {
            this.isNeedReloadWebView.set(true);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        jzv.m147732e("MKWhiteScreenUtil", "isPageVisible=" + this.isPageVisible);
        try {
            if (this.isOpenWhiteRepairNow && this.isPageVisible && jUptimeMillis - this.lastResumeRepair > Constants.ONE_MIN_IN_MILLIS) {
                jzv.m147732e("MKWhiteScreenUtil", "recordWhiteScreen=startReload");
                this.lastResumeRepair = jUptimeMillis;
                this.isReloadRightNow = true;
                reloadCallback.invoke();
                this.isReloadRightNow = false;
            }
        } catch (Throwable th) {
            jzv.m147730c("MKWhiteScreenUtil", "", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m98863d(@Nullable MKWebView mkWebView, @Nullable ViewGroup webRootView, @Nullable String startUrl, @NotNull Function2<? super zlw, ? super String, Unit> rebuildMK) {
        boolean z;
        boolean z2;
        String string;
        rebuildMK.getClass();
        this.isPageVisible = true;
        if (!this.isOpenWhiteRepair || mkWebView == null || webRootView == null || startUrl == null) {
            return;
        }
        try {
            if (this.isNeedReloadWebView.get() && this.retryReloadWebViewCnt.getAndIncrement() < this.WEB_RECYCLE_RELOAD_RETRY_TIME) {
                jzv.m147732e("MKWhiteScreenUtil", "reloadRecycleWebOnResume=".concat(startUrl));
                int childCount = webRootView.getChildCount();
                if (childCount <= 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        z2 = false;
                        break;
                    }
                    View childAt = webRootView.getChildAt(i);
                    childAt.getClass();
                    if (childAt == mkWebView) {
                        webRootView.removeView(childAt);
                        boolean z3 = !mkWebView.isDestroyed();
                        jzv.m147732e("MKWhiteScreenUtil", "delete recycled webview=" + startUrl);
                        z = z3;
                        z2 = true;
                        break;
                    }
                    i++;
                }
                if (webRootView instanceof MKSwipeRefreshLayout) {
                    ((MKSwipeRefreshLayout) webRootView).m18286d();
                }
                jzv.m147732e("MKWhiteScreenUtil", "rebuild recycled webview=" + startUrl);
                INSTANCE.m98864a(mkWebView, startUrl, this.retryReloadWebViewCnt.get(), z, z2, this.isReloadRightNow);
                nlw mkWebRebuildData = mkWebView.getMkWebRebuildData();
                try {
                    mkWebView.m17915b1();
                } catch (Throwable th) {
                    jzv.m147730c("MKWhiteScreenUtil", "", th);
                }
                if (!StringsKt.m94303P(startUrl, "_ui_keepurl_mkrebuild=1", false, 2, null) || (string = mkWebView.getUrl()) == null) {
                    string = startUrl;
                }
                if (!StringsKt.m94303P(string, "_ui_is_mkrebuild=1", false, 2, null)) {
                    string = Uri.parse(string).buildUpon().appendQueryParameter("_ui_is_mkrebuild", "1").toString();
                    string.getClass();
                }
                if (!i8g0.m139000b(string)) {
                    startUrl = string;
                }
                zlw zlwVar = new zlw();
                zlwVar.m220305b(mkWebRebuildData);
                zlwVar.m220306c(startUrl);
                rebuildMK.invoke(zlwVar, startUrl);
            }
        } catch (Throwable th2) {
            try {
                jzv.m147730c("MKWhiteScreenUtil", "", th2);
            } finally {
                this.isNeedReloadWebView.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.amw$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, m88121d2 = {"Ll/amw$a;", "", "<init>", "()V", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "startUrl", "", "retryReloadWebViewCnt", "", "isTryRecycleWeb", "isTryDeleteWeb", "isReloadRightNow", "", "a", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/String;IZZZ)V", "PARAM_IS_FROM_REBUILD", "Ljava/lang/String;", "PARAM_KEEPURL_REBUILD", "REPAIR_TIME_LIMIT", "I", "TAG", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m98864a(@Nullable MKWebView mkWebView, @Nullable String startUrl, int retryReloadWebViewCnt, boolean isTryRecycleWeb, boolean isTryDeleteWeb, boolean isReloadRightNow) {
            if (mkWebView != null) {
                try {
                    MKCoreLogManager.m18427e().m18462y(mkWebView.getBid(), startUrl, Integer.valueOf(retryReloadWebViewCnt), Boolean.valueOf(isTryRecycleWeb), Boolean.valueOf(isTryDeleteWeb), Boolean.valueOf(isReloadRightNow));
                } catch (Throwable th) {
                    jzv.m147730c("MKWhiteScreenUtil", "", th);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
