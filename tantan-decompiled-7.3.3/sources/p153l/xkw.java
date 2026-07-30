package p153l;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.hellogroup.p036mk.core.log.page.BasePageLog;
import com.hellogroup.p036mk.core.log.page.MKPageLogType;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u0012J3\u0010#\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J+\u0010&\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010)\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010\u0012J!\u0010*\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010-\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010\u0012J%\u00101\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u0012J\u0015\u00105\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u0012J\u0015\u00106\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b6\u0010\u0012J\u0015\u00107\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u0012J\u0015\u00108\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b8\u0010\u0012J\u0015\u00109\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b9\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u0012¨\u0006B"}, m88121d2 = {"Ll/xkw;", "Lcom/hellogroup/mk/core/log/page/BasePageLog;", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "reporter", "", "bid", "url", "<init>", "(Lcom/hellogroup/mk/core/log/core/MKLogReporter;Ljava/lang/String;Ljava/lang/String;)V", "", "R", "()V", "Q", "N", "B", "A", "logDesc", "M", "(Ljava/lang/String;)V", "logDes", "L", "K", "U", "P", "errorMsg", "W", "G", p7f.GPS_MEASUREMENT_INTERRUPTED, p7f.LATITUDE_SOUTH, "message", "X", "namespace", FirebaseAnalytics.Param.METHOD, CommandMessage.PARAMS, "webViewId", c4s.C_ZONE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", NotificationCompat.CATEGORY_ERROR, "D", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "E", "F", BloodType.f39576O, "(Ljava/lang/String;Ljava/lang/String;)V", "I", "J", "useWhich", "", "success", "H", "(Ljava/lang/String;Ljava/lang/String;Z)V", "msg", "u", ResourceDirection.f39656v, BaseSei.f14625Y, BaseSei.f14626Z, "w", BaseSei.f14624X, "k", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", p7f.GPS_DIRECTION_TRUE, BLiveStormDanmakuGiftResourceType.f45292l, "j", "n", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class xkw extends BasePageLog {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String bid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String url;

    public xkw(@Nullable MKLogReporter mKLogReporter, @Nullable String str, @Nullable String str2) {
        super(mKLogReporter, str, str2);
        this.bid = str;
        this.url = str2;
    }

    /* JADX INFO: renamed from: A */
    public final void m211426A() {
        BasePageLog.m18468f(this, MKPageLogType.APP_BACKGROUND, null, null, null, false, 30, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m211427B() {
        BasePageLog.m18468f(this, MKPageLogType.APP_FOREGROUND, null, null, null, false, 30, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX INFO: renamed from: C */
    public final void m211428C(@Nullable String namespace, @NotNull String method, @Nullable String params, @Nullable String webViewId) {
        method.getClass();
        if (params == null) {
            params = "empty params";
        } else {
            if (StringsKt.m94329e0(params)) {
                params = null;
            }
            if (params == null) {
                params = "empty params";
            }
        }
        BasePageLog.m18468f(this, MKPageLogType.BRIDGE_CALL, null, CollectionsKt.listOfNotNull((Object[]) new String[]{namespace, method, params, webViewId}), null, false, 26, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m211429D(@Nullable String namespace, @Nullable String method, @Nullable String err) {
        if (namespace == null || method == null) {
            return;
        }
        BasePageLog.m18468f(this, MKPageLogType.BRIDGE_NOT_FOUND, err, CollectionsKt.listOf((Object[]) new String[]{namespace, method}), null, false, 24, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m211430E(@Nullable String message) {
        BasePageLog.m18468f(this, MKPageLogType.CONSOLE_ERROR, null, (message == null || StringsKt.m94329e0(message)) ? new ArrayList() : CollectionsKt.listOf(message), null, false, 26, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m211431F(@Nullable String message) {
        BasePageLog.m18468f(this, MKPageLogType.CONSOLE_LOG, message, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m211432G(@Nullable String errorMsg) {
        BasePageLog.m18468f(this, MKPageLogType.HTML_FAIL, errorMsg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m211433H(@NotNull String useWhich, @NotNull String url, boolean success) {
        useWhich.getClass();
        url.getClass();
        BasePageLog.m18468f(this, MKPageLogType.INTERCEPT_FILE, useWhich + "&&&" + url + "&&&" + (success ? "suc" : "fail"), null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m211434I(@NotNull String message) {
        message.getClass();
        BasePageLog.m18468f(this, MKPageLogType.NATIVE_ERROR, null, CollectionsKt.listOf(message), null, false, 26, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m211435J(@Nullable String logDesc) {
        BasePageLog.m18468f(this, MKPageLogType.NATIVE_OVERTIME, logDesc, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m211436K(@Nullable String logDes) {
        BasePageLog.m18468f(this, MKPageLogType.ON_LOAD_RESOURCE, logDes, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m211437L(@Nullable String logDes) {
        BasePageLog.m18468f(this, MKPageLogType.ON_PAGE_FINISHED, logDes, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m211438M(@Nullable String logDesc) {
        BasePageLog.m18468f(this, MKPageLogType.ON_PAGE_START, logDesc, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m211439N() {
        BasePageLog.m18468f(this, MKPageLogType.ON_PAUSE, null, null, null, false, 30, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m211440O(@Nullable String message, @Nullable String url) {
        BasePageLog.m18468f(this, MKPageLogType.RECEIVED_TITLE, message, null, MapsKt.mapOf(TuplesKt.m88129a("url", url)), false, 20, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m211441P(@Nullable String logDes) {
        BasePageLog.m18468f(this, MKPageLogType.PROCESS_GONE, logDes, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m211442Q() {
        BasePageLog.m18468f(this, MKPageLogType.ON_RESUME, null, null, null, false, 30, null);
    }

    /* JADX INFO: renamed from: R */
    public final void m211443R() {
        BasePageLog.m18468f(this, MKPageLogType.ON_WEB_VIEW_CREATE, null, null, null, false, 30, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m211444S(@Nullable String errorMsg) {
        BasePageLog.m18468f(this, MKPageLogType.RECEIVED_ERROR, errorMsg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: T */
    public void m211445T(@Nullable String str) {
        this.bid = str;
    }

    /* JADX INFO: renamed from: U */
    public final void m211446U(@Nullable String logDes) {
        BasePageLog.m18468f(this, MKPageLogType.SHOW_LOADING_PAGE, logDes, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: V */
    public final void m211447V(@NotNull String errorMsg) {
        errorMsg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.WHITE_SCREEN_JS, errorMsg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m211448W(@NotNull String errorMsg) {
        errorMsg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.WHITE_SCREEN_NATIVE, errorMsg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m211449X(@Nullable String message) {
        BasePageLog.m18468f(this, MKPageLogType.WINDOW_ON_ERROR, null, CollectionsKt.listOf(d8g0.m114836a(message)), null, false, 26, null);
    }

    @Override // com.hellogroup.p036mk.core.log.page.BasePageLog
    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getBid() {
        return this.bid;
    }

    @Override // com.hellogroup.p036mk.core.log.page.BasePageLog
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Override // com.hellogroup.p036mk.core.log.page.BasePageLog
    /* JADX INFO: renamed from: n */
    public void mo18477n(@Nullable String str) {
        this.url = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m211450u(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.COMMON_LOG, msg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m211451v(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.MWC_LOG_DEBUG, msg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m211452w(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.MWC_ERR_JS_LOG, msg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m211453x(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.MWC_ERR_NATIVE_LOG, msg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m211454y(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.MWC_LOG_INFO, msg, null, null, false, 28, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m211455z(@NotNull String msg) {
        msg.getClass();
        BasePageLog.m18468f(this, MKPageLogType.MWC_LOG_WARN, msg, null, null, false, 28, null);
    }
}
