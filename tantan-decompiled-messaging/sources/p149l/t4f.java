package p149l;

import android.content.Context;
import android.location.Location;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.network.C1296b;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSMercuryType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010)J\u0017\u0010.\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105J/\u00109\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b;\u0010/J\u001f\u0010>\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J)\u0010B\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\bB\u0010CJ1\u0010F\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u0001002\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010H\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bI\u0010JJ-\u0010K\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bK\u0010:J/\u0010L\u001a\u00020'2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bL\u0010:J-\u0010M\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bM\u0010:J)\u0010Q\u001a\u00020'2\b\u0010N\u001a\u0004\u0018\u00010%2\u0006\u0010O\u001a\u00020D2\u0006\u0010P\u001a\u000207H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020'H\u0016¢\u0006\u0004\bS\u0010TJ-\u0010V\u001a\b\u0012\u0002\b\u0003\u0018\u00010U2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\bV\u0010WJ5\u0010X\u001a\b\u0012\u0002\b\u0003\u0018\u00010U2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bZ\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010[R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\\R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010]R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010^R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010_R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010aR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010bR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010rR\u0016\u0010{\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0011\u0010~\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, m87232d2 = {"Ll/t4f;", "Ll/ak2;", "Ll/bwf;", "Ll/ui2;", "baseDatabaseManager", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/x3f;", "eventMediator", "Ll/ske0;", "sessionManager", "Ll/vg2;", "callbackManager", "Ll/lpw;", "mainLooperHandler", "Ll/hyd;", "deviceInfo", "Ll/ork0;", "validationResultStack", "Lcom/clevertap/android/sdk/network/b;", "networkManager", "Ll/qs9;", "cleverTapMetaData", "Ll/ov3;", "ctLockManager", "Ll/csv;", "localDataStore", "Ll/r26;", "controllerManager", "Ll/wyv;", "loginInfoProvider", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "<init>", "(Ll/ui2;Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/x3f;Ll/ske0;Ll/vg2;Ll/lpw;Ll/hyd;Ll/ork0;Lcom/clevertap/android/sdk/network/b;Ll/qs9;Ll/ov3;Ll/csv;Ll/r26;Ll/wyv;Lcom/clevertap/android/sdk/network/NetworkMonitor;)V", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "", BaseSei.f13931Y, "(Landroid/content/Context;Lorg/json/JSONObject;)V", "o", BLiveStormDanmakuGiftResourceType.f44446s, "(Lorg/json/JSONObject;)V", Constants.KEY_T, "B", "(Landroid/content/Context;)V", "", "eventName", "", "type", "E", "(Ljava/lang/String;I)V", "eventType", "Ll/ypi;", "flattenedEventData", "r", "(Landroid/content/Context;Lorg/json/JSONObject;ILl/ypi;)V", "a", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "u", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;)V", "b", BLiveRole.caller, "c", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;)V", "", "isUserSwitchFlush", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;Z)V", "eventData", "D", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Lorg/json/JSONObject;)V", BaseSei.f13932Z, BaseSei.f13930X, "A", "baseProfile", "removeFromSharedPrefs", "profileChanges", "e", "(Lorg/json/JSONObject;ZLl/ypi;)V", "f", "()V", "Ljava/util/concurrent/Future;", "g", "(Landroid/content/Context;Lorg/json/JSONObject;I)Ljava/util/concurrent/Future;", "h", "(Landroid/content/Context;Lorg/json/JSONObject;ILl/ypi;)Ljava/util/concurrent/Future;", b2s.C_ZONE, "Ll/ui2;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/x3f;", "Ll/ske0;", "Ll/lpw;", "Ll/hyd;", "Ll/ork0;", RXScreenCaptureService.KEY_INDEX, "Lcom/clevertap/android/sdk/network/b;", "j", "Ll/qs9;", "k", "Ll/ov3;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/csv;", "m", "Ll/r26;", "n", "Ll/wyv;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "Ljava/lang/Runnable;", "p", "Ljava/lang/Runnable;", "commsRunnable", "Lcom/clevertap/android/sdk/Logger;", "q", "Lcom/clevertap/android/sdk/Logger;", "logger", "pushNotificationViewedRunnable", ResourceDirection.f38808v, "()Ljava/lang/String;", "cleverTapID", "w", "()I", "now", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t4f extends ak2 implements bwf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ui2 baseDatabaseManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final x3f eventMediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ske0 sessionManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final lpw mainLooperHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ork0 validationResultStack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final C1296b networkManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final qs9 cleverTapMetaData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ov3 ctLockManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final csv localDataStore;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final r26 controllerManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final wyv loginInfoProvider;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Runnable commsRunnable;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private Runnable pushNotificationViewedRunnable;

    public t4f(@NotNull ui2 ui2Var, @NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull x3f x3fVar, @NotNull ske0 ske0Var, @NotNull vg2 vg2Var, @NotNull lpw lpwVar, @NotNull hyd hydVar, @NotNull ork0 ork0Var, @NotNull C1296b c1296b, @NotNull qs9 qs9Var, @NotNull ov3 ov3Var, @NotNull csv csvVar, @NotNull r26 r26Var, @NotNull wyv wyvVar, @NotNull NetworkMonitor networkMonitor) {
        ui2Var.getClass();
        context.getClass();
        cleverTapInstanceConfig.getClass();
        x3fVar.getClass();
        ske0Var.getClass();
        vg2Var.getClass();
        lpwVar.getClass();
        hydVar.getClass();
        ork0Var.getClass();
        c1296b.getClass();
        qs9Var.getClass();
        ov3Var.getClass();
        csvVar.getClass();
        r26Var.getClass();
        wyvVar.getClass();
        networkMonitor.getClass();
        this.baseDatabaseManager = ui2Var;
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.eventMediator = x3fVar;
        this.sessionManager = ske0Var;
        this.mainLooperHandler = lpwVar;
        this.deviceInfo = hydVar;
        this.validationResultStack = ork0Var;
        this.networkManager = c1296b;
        this.cleverTapMetaData = qs9Var;
        this.ctLockManager = ov3Var;
        this.localDataStore = csvVar;
        this.controllerManager = r26Var;
        this.loginInfoProvider = wyvVar;
        this.networkMonitor = networkMonitor;
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        this.logger = logger;
        vg2Var.mo100749w(this);
    }

    /* JADX INFO: renamed from: B */
    private final void m187179B(final Context context) {
        if (this.pushNotificationViewedRunnable == null) {
            this.pushNotificationViewedRunnable = new Runnable() { // from class: l.r4f
                @Override // java.lang.Runnable
                public final void run() {
                    t4f.m187183k(this.f157667a, context);
                }
            };
        }
        lpw lpwVar = this.mainLooperHandler;
        Runnable runnable = this.pushNotificationViewedRunnable;
        runnable.getClass();
        lpwVar.removeCallbacks(runnable);
        lpw lpwVar2 = this.mainLooperHandler;
        Runnable runnable2 = this.pushNotificationViewedRunnable;
        runnable2.getClass();
        lpwVar2.post(runnable2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m187180E(String eventName, int type) {
        if (type == 4) {
            this.localDataStore.m108590B(eventName);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Void m187181i(final t4f t4fVar, final JSONObject jSONObject, final int i, final Context context, final ypi ypiVar) {
        t4fVar.getClass();
        jSONObject.getClass();
        context.getClass();
        ypiVar.getClass();
        if (t4fVar.eventMediator.m206915h(jSONObject, i)) {
            return null;
        }
        if (t4fVar.eventMediator.m206914g(jSONObject, i)) {
            t4fVar.config.getLogger().debug(t4fVar.config.getAccountId(), "App Launched not yet processed, re-queuing event " + jSONObject + "after 2s");
            t4fVar.mainLooperHandler.postDelayed(new Runnable() { // from class: l.m4f
                @Override // java.lang.Runnable
                public final void run() {
                    t4f.m187189q(this.f131288a, context, jSONObject, i, ypiVar);
                }
            }, 2000L);
            return null;
        }
        if (i == 6 || i == 7) {
            t4fVar.m187197r(context, jSONObject, i, ypiVar);
            return null;
        }
        t4fVar.sessionManager.m184591e(context);
        t4fVar.mo97099f();
        t4fVar.m187197r(context, jSONObject, i, ypiVar);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m187182j(t4f t4fVar, Context context, EventGroup eventGroup, String str, boolean z) throws JSONException {
        t4fVar.getClass();
        context.getClass();
        eventGroup.getClass();
        t4fVar.networkManager.m6848i(context, eventGroup, str, z);
    }

    /* JADX INFO: renamed from: k */
    public static void m187183k(t4f t4fVar, Context context) {
        t4fVar.getClass();
        context.getClass();
        t4fVar.config.getLogger().verbose(t4fVar.config.getAccountId(), "Pushing Notification Viewed event onto queue flush async");
        t4fVar.m187198u(context, EventGroup.PUSH_NOTIFICATION_VIEWED);
    }

    /* JADX INFO: renamed from: l */
    public static Void m187184l(t4f t4fVar, Context context, JSONObject jSONObject, int i, ypi ypiVar) {
        t4fVar.getClass();
        context.getClass();
        jSONObject.getClass();
        ypiVar.getClass();
        t4fVar.sessionManager.m184591e(context);
        t4fVar.mo97099f();
        t4fVar.m187197r(context, jSONObject, i, ypiVar);
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m187185m(t4f t4fVar, Context context, EventGroup eventGroup, JSONArray jSONArray) {
        t4fVar.getClass();
        context.getClass();
        eventGroup.getClass();
        t4fVar.networkManager.m6844C(context, eventGroup, jSONArray, null, false);
    }

    /* JADX INFO: renamed from: n */
    public static void m187186n(t4f t4fVar, Context context) {
        t4fVar.getClass();
        context.getClass();
        t4fVar.m187198u(context, EventGroup.REGULAR);
        t4fVar.m187198u(context, EventGroup.PUSH_NOTIFICATION_VIEWED);
    }

    /* JADX INFO: renamed from: o */
    public static Void m187187o(EventGroup eventGroup, t4f t4fVar, Context context) throws JSONException {
        eventGroup.getClass();
        t4fVar.getClass();
        context.getClass();
        EventGroup eventGroup2 = EventGroup.PUSH_NOTIFICATION_VIEWED;
        Logger logger = t4fVar.logger;
        if (eventGroup == eventGroup2) {
            logger.verbose(t4fVar.config.getAccountId(), "Pushing Notification Viewed event onto queue flush sync");
        } else {
            logger.verbose(t4fVar.config.getAccountId(), "Pushing event onto queue flush sync");
        }
        t4fVar.mo97095b(context, eventGroup);
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static Void m187188p(t4f t4fVar) {
        t4fVar.getClass();
        try {
            t4fVar.config.getLogger().verbose(t4fVar.config.getAccountId(), "Queuing daily events");
            t4fVar.mo97098e(null, false, ypi.C21468b.INSTANCE);
            return null;
        } catch (Throwable th) {
            t4fVar.config.getLogger().verbose(t4fVar.config.getAccountId(), "Daily profile sync failed", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m187189q(final t4f t4fVar, final Context context, final JSONObject jSONObject, final int i, final ypi ypiVar) {
        t4fVar.getClass();
        context.getClass();
        jSONObject.getClass();
        ypiVar.getClass();
        st3.m185849c(t4fVar.config).m190592d().m6946g("queueEventWithDelay", new Callable() { // from class: l.o4f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4f.m187184l(this.f141768a, context, jSONObject, i, ypiVar);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    private final void m187190s(JSONObject o) {
        try {
            o.put(OMSMercuryType.f38791mc, Utils.m5917n());
        } catch (Throwable unused) {
        }
        try {
            String strM6802k = this.networkMonitor.m6802k();
            if (strM6802k == null) {
                strM6802k = "Unavailable";
            }
            o.put(Constants.NOTIF_TITLE, strM6802k);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m187191t(Context context, JSONObject event) {
        try {
            if (Intrinsics.m87488d(NotificationCompat.CATEGORY_EVENT, event.getString("type")) && Intrinsics.m87488d(Constants.APP_LAUNCHED_EVENT, event.getString(Constants.KEY_EVT_NAME))) {
                event.put("pai", context.getPackageName());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: v */
    private final String m187192v() {
        return this.deviceInfo.m133539E();
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    private final void m187193y(Context context, JSONObject event) {
        m187196D(context, EventGroup.VARIABLES, event);
    }

    /* JADX INFO: renamed from: A */
    public final void m187194A(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull ypi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            try {
                event.put(BLiveStormDanmakuGiftResourceType.f44446s, this.cleverTapMetaData.m176213k());
                event.put("type", NotificationCompat.CATEGORY_EVENT);
                event.put("ep", m187199w());
                mrk0 mrk0VarM165674a = this.validationResultStack.m165674a();
                if (mrk0VarM165674a != null) {
                    event.put(Constants.ERROR_KEY, mv3.m156464c(mrk0VarM165674a));
                }
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto DB");
                this.baseDatabaseManager.mo94413f(context, event);
                m187200x(context, event, eventType, flattenedEventData);
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush");
                m187179B(context);
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to queue notification viewed event: " + event, th);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m187195C(@NotNull final Context context) {
        context.getClass();
        if (this.commsRunnable == null) {
            this.commsRunnable = new Runnable() { // from class: l.q4f
                @Override // java.lang.Runnable
                public final void run() {
                    t4f.m187186n(this.f152622a, context);
                }
            };
        }
        lpw lpwVar = this.mainLooperHandler;
        Runnable runnable = this.commsRunnable;
        runnable.getClass();
        lpwVar.removeCallbacks(runnable);
        lpw lpwVar2 = this.mainLooperHandler;
        Runnable runnable2 = this.commsRunnable;
        runnable2.getClass();
        lpwVar2.postDelayed(runnable2, this.networkManager.m6850k());
        this.logger.verbose(this.config.getAccountId(), "Scheduling delayed queue flush on main event loop");
    }

    /* JADX INFO: renamed from: D */
    public void m187196D(@NotNull final Context context, @NotNull final EventGroup eventGroup, @Nullable JSONObject eventData) {
        context.getClass();
        eventGroup.getClass();
        if (!this.networkMonitor.m6803n()) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Event won't be sent.");
            return;
        }
        if (this.cleverTapMetaData.m176180G()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send event");
            return;
        }
        final JSONArray jSONArrayPut = new JSONArray().put(eventData);
        boolean zM6852t = this.networkManager.m6852t(eventGroup);
        C1296b c1296b = this.networkManager;
        if (zM6852t) {
            c1296b.m6851s(eventGroup, new Runnable() { // from class: l.p4f
                @Override // java.lang.Runnable
                public final void run() {
                    t4f.m187185m(this.f147164a, context, eventGroup, jSONArrayPut);
                }
            });
        } else {
            c1296b.m6844C(context, eventGroup, jSONArrayPut, null, false);
        }
    }

    @Override // p149l.bwf
    /* JADX INFO: renamed from: a */
    public void mo104154a(@NotNull Context context) {
        context.getClass();
        m187195C(context);
    }

    @Override // p149l.ak2
    /* JADX INFO: renamed from: b */
    public void mo97095b(@NotNull Context context, @NotNull EventGroup eventGroup) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        mo97096c(context, eventGroup, null);
    }

    @Override // p149l.ak2
    /* JADX INFO: renamed from: c */
    public void mo97096c(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable String caller) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        mo97097d(context, eventGroup, caller, false);
    }

    @Override // p149l.ak2
    /* JADX INFO: renamed from: d */
    public void mo97097d(@NotNull final Context context, @NotNull final EventGroup eventGroup, @Nullable final String caller, final boolean isUserSwitchFlush) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        if (!this.networkMonitor.m6803n()) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Will retry later");
            this.controllerManager.m177579n();
            this.controllerManager.m177578m(new JSONArray(), false);
        } else if (this.cleverTapMetaData.m176180G()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send events queue");
            this.controllerManager.m177579n();
            this.controllerManager.m177578m(new JSONArray(), false);
        } else if (this.networkManager.m6852t(eventGroup)) {
            this.networkManager.m6851s(eventGroup, new Runnable() { // from class: l.l4f
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    t4f.m187182j(this.f126030a, context, eventGroup, caller, isUserSwitchFlush);
                }
            });
        } else {
            this.logger.verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue DB flush");
            this.networkManager.m6848i(context, eventGroup, caller, isUserSwitchFlush);
        }
    }

    @Override // p149l.ak2
    /* JADX INFO: renamed from: e */
    public void mo97098e(@Nullable JSONObject baseProfile, boolean removeFromSharedPrefs, @NotNull ypi profileChanges) {
        Object jSONObject;
        profileChanges.getClass();
        try {
            String strM187192v = m187192v();
            JSONObject jSONObject2 = new JSONObject();
            if (baseProfile != null && baseProfile.length() > 0) {
                Iterator<String> itKeys = baseProfile.keys();
                wcm wcmVarM208126a = xcm.m208126a(this.context, this.config, this.validationResultStack);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        try {
                            jSONObject = baseProfile.getJSONObject(next);
                        } catch (Throwable unused) {
                            jSONObject = baseProfile.get(next);
                        }
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONObject2.put(next, jSONObject);
                        if (wcmVarM208126a.mo145178b(next) && !this.deviceInfo.m133557d0()) {
                            wyv wyvVar = this.loginInfoProvider;
                            if (removeFromSharedPrefs) {
                                try {
                                    wyvVar.m206226k(strM187192v, next);
                                } catch (Throwable unused3) {
                                }
                            } else {
                                wyvVar.m206218a(strM187192v, next, jSONObject.toString());
                            }
                        }
                    }
                }
            }
            try {
                String strM133572x = this.deviceInfo.m133572x();
                if (strM133572x != null && !Intrinsics.m87488d(strM133572x, "")) {
                    jSONObject2.put(Constants.CLTAP_CARRIER, strM133572x);
                }
                String strM133536A = this.deviceInfo.m133536A();
                if (strM133536A != null && !Intrinsics.m87488d(strM133536A, "")) {
                    jSONObject2.put("cc", strM133536A);
                }
                jSONObject2.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("profile", jSONObject2);
                mo97101h(this.context, jSONObject3, 3, profileChanges);
            } catch (JSONException unused4) {
                this.config.getLogger().verbose(this.config.getAccountId(), "FATAL: Creating basic profile update event failed!");
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Basic profile sync", th);
        }
    }

    @Override // p149l.ak2
    /* JADX INFO: renamed from: f */
    public void mo97099f() {
        if (this.cleverTapMetaData.m176224v()) {
            return;
        }
        st3.m185849c(this.config).m190592d().m6946g("CleverTapAPI#pushInitialEventsAsync", new Callable() { // from class: l.n4f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4f.m187188p(this.f137094a);
            }
        });
    }

    @Override // p149l.ak2
    @Nullable
    /* JADX INFO: renamed from: g */
    public Future<?> mo97100g(@NotNull Context context, @NotNull JSONObject event, int eventType) {
        context.getClass();
        event.getClass();
        return mo97101h(context, event, eventType, ypi.C21468b.INSTANCE);
    }

    @Override // p149l.ak2
    @Nullable
    /* JADX INFO: renamed from: h */
    public Future<?> mo97101h(@NotNull final Context context, @NotNull final JSONObject event, final int eventType, @NotNull final ypi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        return st3.m185849c(this.config).m190592d().m6951n("queueEvent", new Callable() { // from class: l.k4f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4f.m187181i(this.f121087a, event, eventType, context, flattenedEventData);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m187197r(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull ypi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        if (eventType == 6) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto separate queue");
            m187194A(context, event, eventType, flattenedEventData);
        } else if (eventType != 8) {
            m187201z(context, event, eventType, flattenedEventData);
        } else {
            m187193y(context, event);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m187198u(@NotNull final Context context, @NotNull final EventGroup eventGroup) {
        context.getClass();
        eventGroup.getClass();
        st3.m185849c(this.config).m190592d().m6946g("CommsManager#flushQueueAsync", new Callable() { // from class: l.s4f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4f.m187187o(eventGroup, this, context);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final int m187199w() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: x */
    public final void m187200x(@Nullable Context context, @NotNull JSONObject event, int eventType, @NotNull ypi flattenedEventData) throws JSONException {
        event.getClass();
        flattenedEventData.getClass();
        String strM206910c = this.eventMediator.m206910c(event);
        Location locationM176218p = this.cleverTapMetaData.m176218p();
        m187180E(strM206910c, eventType);
        this.config.getLogger().verbose(this.config.getAccountId(), "FlattenedEventData : " + flattenedEventData);
        if (flattenedEventData instanceof ypi.C21468b) {
            return;
        }
        InAppController inAppControllerM177573h = this.controllerManager.m177573h();
        if (this.eventMediator.m206912e(event)) {
            Map<String, Object> mapM206908a = this.eventMediator.m206908a(event);
            mapM206908a.getClass();
            List<Map<String, Object>> listM206909b = this.eventMediator.m206909b(event);
            listM206909b.getClass();
            inAppControllerM177573h.m6261R(mapM206908a, listM206909b, locationM176218p);
            return;
        }
        if (flattenedEventData instanceof ypi.C21469c) {
            inAppControllerM177573h.m6263T(nta0.INSTANCE.m161367a(((ypi.C21469c) flattenedEventData).m215636a()), locationM176218p);
            return;
        }
        Map<String, Object> mapM215635a = ((ypi.C21467a) flattenedEventData).m215635a();
        boolean zM6803n = this.networkMonitor.m6803n();
        boolean zM206913f = this.eventMediator.m206913f(event);
        boolean zM206911d = this.eventMediator.m206911d(event);
        if ((zM6803n || !zM206913f) && (!zM6803n || zM206911d)) {
            return;
        }
        strM206910c.getClass();
        inAppControllerM177573h.m6262S(strM206910c, mapM215635a, locationM176218p);
    }

    /* JADX INFO: renamed from: z */
    public final void m187201z(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull ypi flattenedEventData) {
        String str;
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            try {
                if (qs9.m176168e() == 0) {
                    qs9.m176164K(1);
                }
                if (eventType == 1) {
                    str = OMSTemplateModeType.page;
                } else if (eventType == 2) {
                    str = "ping";
                    m187190s(event);
                    if (event.has("bk")) {
                        this.cleverTapMetaData.m176187P(true);
                        event.remove("bk");
                    }
                    if (this.cleverTapMetaData.m176179F()) {
                        event.put("gf", true);
                        this.cleverTapMetaData.m176203d0(false);
                        event.put("gfSDKVersion", this.cleverTapMetaData.m176216m());
                        this.cleverTapMetaData.m176196Z(0);
                    }
                } else if (eventType != 3) {
                    str = eventType != 5 ? NotificationCompat.CATEGORY_EVENT : "data";
                } else {
                    str = "profile";
                }
                String strM176221s = this.cleverTapMetaData.m176221s();
                if (strM176221s != null) {
                    event.put("n", strM176221s);
                }
                event.put(BLiveStormDanmakuGiftResourceType.f44446s, this.cleverTapMetaData.m176213k());
                event.put("pg", qs9.m176168e());
                event.put("type", str);
                event.put("ep", m187199w());
                event.put("f", this.cleverTapMetaData.m176176C());
                event.put("lsl", this.cleverTapMetaData.m176217o());
                m187191t(context, event);
                mrk0 mrk0VarM165674a = this.validationResultStack.m165674a();
                if (mrk0VarM165674a != null) {
                    event.put(Constants.ERROR_KEY, mv3.m156464c(mrk0VarM165674a));
                }
                this.localDataStore.m108594J(event);
                this.baseDatabaseManager.mo94408a(context, event, eventType);
                m187200x(context, event, eventType, flattenedEventData);
                m187195C(context);
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to queue event: " + event, th);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
