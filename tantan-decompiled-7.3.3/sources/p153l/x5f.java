package p153l;

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
import com.clevertap.android.sdk.network.C1319b;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010)J\u0017\u0010.\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105J/\u00109\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b;\u0010/J\u001f\u0010>\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J)\u0010B\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\bB\u0010CJ1\u0010F\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u0001002\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<2\b\u0010H\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bI\u0010JJ-\u0010K\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bK\u0010:J/\u0010L\u001a\u00020'2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bL\u0010:J-\u0010M\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207¢\u0006\u0004\bM\u0010:J)\u0010Q\u001a\u00020'2\b\u0010N\u001a\u0004\u0018\u00010%2\u0006\u0010O\u001a\u00020D2\u0006\u0010P\u001a\u000207H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020'H\u0016¢\u0006\u0004\bS\u0010TJ-\u0010V\u001a\b\u0012\u0002\b\u0003\u0018\u00010U2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\bV\u0010WJ5\u0010X\u001a\b\u0012\u0002\b\u0003\u0018\u00010U2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u00106\u001a\u0002022\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\bZ\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010[R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\\R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010]R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010^R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010_R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010aR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010bR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010rR\u0016\u0010{\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0011\u0010~\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, m88121d2 = {"Ll/x5f;", "Ll/ik2;", "Ll/pxf;", "Ll/bj2;", "baseDatabaseManager", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/b5f;", "eventMediator", "Ll/xse0;", "sessionManager", "Ll/ch2;", "callbackManager", "Ll/ksw;", "mainLooperHandler", "Ll/uzd;", "deviceInfo", "Ll/u0l0;", "validationResultStack", "Lcom/clevertap/android/sdk/network/b;", "networkManager", "Ll/bu9;", "cleverTapMetaData", "Ll/nw3;", "ctLockManager", "Ll/duv;", "localDataStore", "Ll/w36;", "controllerManager", "Ll/u0w;", "loginInfoProvider", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "<init>", "(Ll/bj2;Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/b5f;Ll/xse0;Ll/ch2;Ll/ksw;Ll/uzd;Ll/u0l0;Lcom/clevertap/android/sdk/network/b;Ll/bu9;Ll/nw3;Ll/duv;Ll/w36;Ll/u0w;Lcom/clevertap/android/sdk/network/NetworkMonitor;)V", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "", BaseSei.f14625Y, "(Landroid/content/Context;Lorg/json/JSONObject;)V", "o", BLiveStormDanmakuGiftResourceType.f45294s, "(Lorg/json/JSONObject;)V", Constants.KEY_T, "B", "(Landroid/content/Context;)V", "", "eventName", "", "type", "E", "(Ljava/lang/String;I)V", "eventType", "Ll/usi;", "flattenedEventData", "r", "(Landroid/content/Context;Lorg/json/JSONObject;ILl/usi;)V", "a", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "u", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;)V", "b", BLiveRole.caller, "c", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;)V", "", "isUserSwitchFlush", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;Z)V", "eventData", "D", "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Lorg/json/JSONObject;)V", BaseSei.f14626Z, BaseSei.f14624X, "A", "baseProfile", "removeFromSharedPrefs", "profileChanges", "e", "(Lorg/json/JSONObject;ZLl/usi;)V", "f", "()V", "Ljava/util/concurrent/Future;", "g", "(Landroid/content/Context;Lorg/json/JSONObject;I)Ljava/util/concurrent/Future;", "h", "(Landroid/content/Context;Lorg/json/JSONObject;ILl/usi;)Ljava/util/concurrent/Future;", c4s.C_ZONE, "Ll/bj2;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/b5f;", "Ll/xse0;", "Ll/ksw;", "Ll/uzd;", "Ll/u0l0;", RXScreenCaptureService.KEY_INDEX, "Lcom/clevertap/android/sdk/network/b;", "j", "Ll/bu9;", "k", "Ll/nw3;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/duv;", "m", "Ll/w36;", "n", "Ll/u0w;", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "Ljava/lang/Runnable;", "p", "Ljava/lang/Runnable;", "commsRunnable", "Lcom/clevertap/android/sdk/Logger;", "q", "Lcom/clevertap/android/sdk/Logger;", "logger", "pushNotificationViewedRunnable", ResourceDirection.f39656v, "()Ljava/lang/String;", "cleverTapID", "w", "()I", "now", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class x5f extends ik2 implements pxf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final bj2 baseDatabaseManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final b5f eventMediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final xse0 sessionManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ksw mainLooperHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final u0l0 validationResultStack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final C1319b networkManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final bu9 cleverTapMetaData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final nw3 ctLockManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final duv localDataStore;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final u0w loginInfoProvider;

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

    public x5f(@NotNull bj2 bj2Var, @NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull b5f b5fVar, @NotNull xse0 xse0Var, @NotNull ch2 ch2Var, @NotNull ksw kswVar, @NotNull uzd uzdVar, @NotNull u0l0 u0l0Var, @NotNull C1319b c1319b, @NotNull bu9 bu9Var, @NotNull nw3 nw3Var, @NotNull duv duvVar, @NotNull w36 w36Var, @NotNull u0w u0wVar, @NotNull NetworkMonitor networkMonitor) {
        bj2Var.getClass();
        context.getClass();
        cleverTapInstanceConfig.getClass();
        b5fVar.getClass();
        xse0Var.getClass();
        ch2Var.getClass();
        kswVar.getClass();
        uzdVar.getClass();
        u0l0Var.getClass();
        c1319b.getClass();
        bu9Var.getClass();
        nw3Var.getClass();
        duvVar.getClass();
        w36Var.getClass();
        u0wVar.getClass();
        networkMonitor.getClass();
        this.baseDatabaseManager = bj2Var;
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.eventMediator = b5fVar;
        this.sessionManager = xse0Var;
        this.mainLooperHandler = kswVar;
        this.deviceInfo = uzdVar;
        this.validationResultStack = u0l0Var;
        this.networkManager = c1319b;
        this.cleverTapMetaData = bu9Var;
        this.ctLockManager = nw3Var;
        this.localDataStore = duvVar;
        this.controllerManager = w36Var;
        this.loginInfoProvider = u0wVar;
        this.networkMonitor = networkMonitor;
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        this.logger = logger;
        ch2Var.mo96529w(this);
    }

    /* JADX INFO: renamed from: B */
    private final void m209362B(final Context context) {
        if (this.pushNotificationViewedRunnable == null) {
            this.pushNotificationViewedRunnable = new Runnable() { // from class: l.v5f
                @Override // java.lang.Runnable
                public final void run() {
                    x5f.m209366k(this.f182535a, context);
                }
            };
        }
        ksw kswVar = this.mainLooperHandler;
        Runnable runnable = this.pushNotificationViewedRunnable;
        runnable.getClass();
        kswVar.removeCallbacks(runnable);
        ksw kswVar2 = this.mainLooperHandler;
        Runnable runnable2 = this.pushNotificationViewedRunnable;
        runnable2.getClass();
        kswVar2.post(runnable2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m209363E(String eventName, int type) {
        if (type == 4) {
            this.localDataStore.m118206B(eventName);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Void m209364i(final x5f x5fVar, final JSONObject jSONObject, final int i, final Context context, final usi usiVar) {
        x5fVar.getClass();
        jSONObject.getClass();
        context.getClass();
        usiVar.getClass();
        if (x5fVar.eventMediator.m102578h(jSONObject, i)) {
            return null;
        }
        if (x5fVar.eventMediator.m102577g(jSONObject, i)) {
            x5fVar.config.getLogger().debug(x5fVar.config.getAccountId(), "App Launched not yet processed, re-queuing event " + jSONObject + "after 2s");
            x5fVar.mainLooperHandler.postDelayed(new Runnable() { // from class: l.q5f
                @Override // java.lang.Runnable
                public final void run() {
                    x5f.m209372q(this.f155707a, context, jSONObject, i, usiVar);
                }
            }, 2000L);
            return null;
        }
        if (i == 6 || i == 7) {
            x5fVar.m209380r(context, jSONObject, i, usiVar);
            return null;
        }
        x5fVar.sessionManager.m212970e(context);
        x5fVar.mo140248f();
        x5fVar.m209380r(context, jSONObject, i, usiVar);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m209365j(x5f x5fVar, Context context, EventGroup eventGroup, String str, boolean z) throws JSONException {
        x5fVar.getClass();
        context.getClass();
        eventGroup.getClass();
        x5fVar.networkManager.m6902i(context, eventGroup, str, z);
    }

    /* JADX INFO: renamed from: k */
    public static void m209366k(x5f x5fVar, Context context) {
        x5fVar.getClass();
        context.getClass();
        x5fVar.config.getLogger().verbose(x5fVar.config.getAccountId(), "Pushing Notification Viewed event onto queue flush async");
        x5fVar.m209381u(context, EventGroup.PUSH_NOTIFICATION_VIEWED);
    }

    /* JADX INFO: renamed from: l */
    public static Void m209367l(x5f x5fVar, Context context, JSONObject jSONObject, int i, usi usiVar) {
        x5fVar.getClass();
        context.getClass();
        jSONObject.getClass();
        usiVar.getClass();
        x5fVar.sessionManager.m212970e(context);
        x5fVar.mo140248f();
        x5fVar.m209380r(context, jSONObject, i, usiVar);
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m209368m(x5f x5fVar, Context context, EventGroup eventGroup, JSONArray jSONArray) {
        x5fVar.getClass();
        context.getClass();
        eventGroup.getClass();
        x5fVar.networkManager.m6898C(context, eventGroup, jSONArray, null, false);
    }

    /* JADX INFO: renamed from: n */
    public static void m209369n(x5f x5fVar, Context context) {
        x5fVar.getClass();
        context.getClass();
        x5fVar.m209381u(context, EventGroup.REGULAR);
        x5fVar.m209381u(context, EventGroup.PUSH_NOTIFICATION_VIEWED);
    }

    /* JADX INFO: renamed from: o */
    public static Void m209370o(EventGroup eventGroup, x5f x5fVar, Context context) throws JSONException {
        eventGroup.getClass();
        x5fVar.getClass();
        context.getClass();
        EventGroup eventGroup2 = EventGroup.PUSH_NOTIFICATION_VIEWED;
        Logger logger = x5fVar.logger;
        if (eventGroup == eventGroup2) {
            logger.verbose(x5fVar.config.getAccountId(), "Pushing Notification Viewed event onto queue flush sync");
        } else {
            logger.verbose(x5fVar.config.getAccountId(), "Pushing event onto queue flush sync");
        }
        x5fVar.mo140244b(context, eventGroup);
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static Void m209371p(x5f x5fVar) {
        x5fVar.getClass();
        try {
            x5fVar.config.getLogger().verbose(x5fVar.config.getAccountId(), "Queuing daily events");
            x5fVar.mo140247e(null, false, usi.C20659b.INSTANCE);
            return null;
        } catch (Throwable th) {
            x5fVar.config.getLogger().verbose(x5fVar.config.getAccountId(), "Daily profile sync failed", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m209372q(final x5f x5fVar, final Context context, final JSONObject jSONObject, final int i, final usi usiVar) {
        x5fVar.getClass();
        context.getClass();
        jSONObject.getClass();
        usiVar.getClass();
        ru3.m183186c(x5fVar.config).m187990d().m7000g("queueEventWithDelay", new Callable() { // from class: l.s5f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x5f.m209367l(this.f166356a, context, jSONObject, i, usiVar);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    private final void m209373s(JSONObject o) {
        try {
            o.put(OMSMercuryType.f39639mc, Utils.m5971n());
        } catch (Throwable unused) {
        }
        try {
            String strM6856k = this.networkMonitor.m6856k();
            if (strM6856k == null) {
                strM6856k = "Unavailable";
            }
            o.put(Constants.NOTIF_TITLE, strM6856k);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m209374t(Context context, JSONObject event) {
        try {
            if (Intrinsics.m88377d(NotificationCompat.CATEGORY_EVENT, event.getString("type")) && Intrinsics.m88377d(Constants.APP_LAUNCHED_EVENT, event.getString(Constants.KEY_EVT_NAME))) {
                event.put("pai", context.getPackageName());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: v */
    private final String m209375v() {
        return this.deviceInfo.m198762E();
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    private final void m209376y(Context context, JSONObject event) {
        m209379D(context, EventGroup.VARIABLES, event);
    }

    /* JADX INFO: renamed from: A */
    public final void m209377A(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull usi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            try {
                event.put(BLiveStormDanmakuGiftResourceType.f45294s, this.cleverTapMetaData.m106480k());
                event.put("type", NotificationCompat.CATEGORY_EVENT);
                event.put("ep", m209382w());
                s0l0 s0l0VarM193843a = this.validationResultStack.m193843a();
                if (s0l0VarM193843a != null) {
                    event.put(Constants.ERROR_KEY, lw3.m156022c(s0l0VarM193843a));
                }
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto DB");
                this.baseDatabaseManager.mo104586f(context, event);
                m209383x(context, event, eventType, flattenedEventData);
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush");
                m209362B(context);
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to queue notification viewed event: " + event, th);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m209378C(@NotNull final Context context) {
        context.getClass();
        if (this.commsRunnable == null) {
            this.commsRunnable = new Runnable() { // from class: l.u5f
                @Override // java.lang.Runnable
                public final void run() {
                    x5f.m209369n(this.f177630a, context);
                }
            };
        }
        ksw kswVar = this.mainLooperHandler;
        Runnable runnable = this.commsRunnable;
        runnable.getClass();
        kswVar.removeCallbacks(runnable);
        ksw kswVar2 = this.mainLooperHandler;
        Runnable runnable2 = this.commsRunnable;
        runnable2.getClass();
        kswVar2.postDelayed(runnable2, this.networkManager.m6904k());
        this.logger.verbose(this.config.getAccountId(), "Scheduling delayed queue flush on main event loop");
    }

    /* JADX INFO: renamed from: D */
    public void m209379D(@NotNull final Context context, @NotNull final EventGroup eventGroup, @Nullable JSONObject eventData) {
        context.getClass();
        eventGroup.getClass();
        if (!this.networkMonitor.m6857n()) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Event won't be sent.");
            return;
        }
        if (this.cleverTapMetaData.m106447G()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send event");
            return;
        }
        final JSONArray jSONArrayPut = new JSONArray().put(eventData);
        boolean zM6906t = this.networkManager.m6906t(eventGroup);
        C1319b c1319b = this.networkManager;
        if (zM6906t) {
            c1319b.m6905s(eventGroup, new Runnable() { // from class: l.t5f
                @Override // java.lang.Runnable
                public final void run() {
                    x5f.m209368m(this.f172201a, context, eventGroup, jSONArrayPut);
                }
            });
        } else {
            c1319b.m6898C(context, eventGroup, jSONArrayPut, null, false);
        }
    }

    @Override // p153l.pxf
    /* JADX INFO: renamed from: a */
    public void mo174218a(@NotNull Context context) {
        context.getClass();
        m209378C(context);
    }

    @Override // p153l.ik2
    /* JADX INFO: renamed from: b */
    public void mo140244b(@NotNull Context context, @NotNull EventGroup eventGroup) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        mo140245c(context, eventGroup, null);
    }

    @Override // p153l.ik2
    /* JADX INFO: renamed from: c */
    public void mo140245c(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable String caller) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        mo140246d(context, eventGroup, caller, false);
    }

    @Override // p153l.ik2
    /* JADX INFO: renamed from: d */
    public void mo140246d(@NotNull final Context context, @NotNull final EventGroup eventGroup, @Nullable final String caller, final boolean isUserSwitchFlush) throws JSONException {
        context.getClass();
        eventGroup.getClass();
        if (!this.networkMonitor.m6857n()) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Will retry later");
            this.controllerManager.m204751n();
            this.controllerManager.m204750m(new JSONArray(), false);
        } else if (this.cleverTapMetaData.m106447G()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send events queue");
            this.controllerManager.m204751n();
            this.controllerManager.m204750m(new JSONArray(), false);
        } else if (this.networkManager.m6906t(eventGroup)) {
            this.networkManager.m6905s(eventGroup, new Runnable() { // from class: l.p5f
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    x5f.m209365j(this.f150639a, context, eventGroup, caller, isUserSwitchFlush);
                }
            });
        } else {
            this.logger.verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue DB flush");
            this.networkManager.m6902i(context, eventGroup, caller, isUserSwitchFlush);
        }
    }

    @Override // p153l.ik2
    /* JADX INFO: renamed from: e */
    public void mo140247e(@Nullable JSONObject baseProfile, boolean removeFromSharedPrefs, @NotNull usi profileChanges) {
        Object jSONObject;
        profileChanges.getClass();
        try {
            String strM209375v = m209375v();
            JSONObject jSONObject2 = new JSONObject();
            if (baseProfile != null && baseProfile.length() > 0) {
                Iterator<String> itKeys = baseProfile.keys();
                mfm mfmVarM162931a = nfm.m162931a(this.context, this.config, this.validationResultStack);
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
                        if (mfmVarM162931a.mo157933b(next) && !this.deviceInfo.m198780d0()) {
                            u0w u0wVar = this.loginInfoProvider;
                            if (removeFromSharedPrefs) {
                                try {
                                    u0wVar.m193882k(strM209375v, next);
                                } catch (Throwable unused3) {
                                }
                            } else {
                                u0wVar.m193874a(strM209375v, next, jSONObject.toString());
                            }
                        }
                    }
                }
            }
            try {
                String strM198795x = this.deviceInfo.m198795x();
                if (strM198795x != null && !Intrinsics.m88377d(strM198795x, "")) {
                    jSONObject2.put(Constants.CLTAP_CARRIER, strM198795x);
                }
                String strM198759A = this.deviceInfo.m198759A();
                if (strM198759A != null && !Intrinsics.m88377d(strM198759A, "")) {
                    jSONObject2.put("cc", strM198759A);
                }
                jSONObject2.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("profile", jSONObject2);
                mo140250h(this.context, jSONObject3, 3, profileChanges);
            } catch (JSONException unused4) {
                this.config.getLogger().verbose(this.config.getAccountId(), "FATAL: Creating basic profile update event failed!");
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Basic profile sync", th);
        }
    }

    @Override // p153l.ik2
    /* JADX INFO: renamed from: f */
    public void mo140248f() {
        if (this.cleverTapMetaData.m106491v()) {
            return;
        }
        ru3.m183186c(this.config).m187990d().m7000g("CleverTapAPI#pushInitialEventsAsync", new Callable() { // from class: l.r5f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x5f.m209371p(this.f161349a);
            }
        });
    }

    @Override // p153l.ik2
    @Nullable
    /* JADX INFO: renamed from: g */
    public Future<?> mo140249g(@NotNull Context context, @NotNull JSONObject event, int eventType) {
        context.getClass();
        event.getClass();
        return mo140250h(context, event, eventType, usi.C20659b.INSTANCE);
    }

    @Override // p153l.ik2
    @Nullable
    /* JADX INFO: renamed from: h */
    public Future<?> mo140250h(@NotNull final Context context, @NotNull final JSONObject event, final int eventType, @NotNull final usi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        return ru3.m183186c(this.config).m187990d().m7005n("queueEvent", new Callable() { // from class: l.o5f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x5f.m209364i(this.f145063a, event, eventType, context, flattenedEventData);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m209380r(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull usi flattenedEventData) {
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        if (eventType == 6) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto separate queue");
            m209377A(context, event, eventType, flattenedEventData);
        } else if (eventType != 8) {
            m209384z(context, event, eventType, flattenedEventData);
        } else {
            m209376y(context, event);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m209381u(@NotNull final Context context, @NotNull final EventGroup eventGroup) {
        context.getClass();
        eventGroup.getClass();
        ru3.m183186c(this.config).m187990d().m7000g("CommsManager#flushQueueAsync", new Callable() { // from class: l.w5f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x5f.m209370o(eventGroup, this, context);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final int m209382w() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: x */
    public final void m209383x(@Nullable Context context, @NotNull JSONObject event, int eventType, @NotNull usi flattenedEventData) throws JSONException {
        event.getClass();
        flattenedEventData.getClass();
        String strM102573c = this.eventMediator.m102573c(event);
        Location locationM106485p = this.cleverTapMetaData.m106485p();
        m209363E(strM102573c, eventType);
        this.config.getLogger().verbose(this.config.getAccountId(), "FlattenedEventData : " + flattenedEventData);
        if (flattenedEventData instanceof usi.C20659b) {
            return;
        }
        InAppController inAppControllerM204745h = this.controllerManager.m204745h();
        if (this.eventMediator.m102575e(event)) {
            Map<String, Object> mapM102571a = this.eventMediator.m102571a(event);
            mapM102571a.getClass();
            List<Map<String, Object>> listM102572b = this.eventMediator.m102572b(event);
            listM102572b.getClass();
            inAppControllerM204745h.m6315R(mapM102571a, listM102572b, locationM106485p);
            return;
        }
        if (flattenedEventData instanceof usi.C20660c) {
            inAppControllerM204745h.m6317T(r1b0.INSTANCE.m179394a(((usi.C20660c) flattenedEventData).m197941a()), locationM106485p);
            return;
        }
        Map<String, Object> mapM197940a = ((usi.C20658a) flattenedEventData).m197940a();
        boolean zM6857n = this.networkMonitor.m6857n();
        boolean zM102576f = this.eventMediator.m102576f(event);
        boolean zM102574d = this.eventMediator.m102574d(event);
        if ((zM6857n || !zM102576f) && (!zM6857n || zM102574d)) {
            return;
        }
        strM102573c.getClass();
        inAppControllerM204745h.m6316S(strM102573c, mapM197940a, locationM106485p);
    }

    /* JADX INFO: renamed from: z */
    public final void m209384z(@NotNull Context context, @NotNull JSONObject event, int eventType, @NotNull usi flattenedEventData) {
        String str;
        context.getClass();
        event.getClass();
        flattenedEventData.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            try {
                if (bu9.m106435e() == 0) {
                    bu9.m106431K(1);
                }
                if (eventType == 1) {
                    str = OMSTemplateModeType.page;
                } else if (eventType == 2) {
                    str = "ping";
                    m209373s(event);
                    if (event.has("bk")) {
                        this.cleverTapMetaData.m106454P(true);
                        event.remove("bk");
                    }
                    if (this.cleverTapMetaData.m106446F()) {
                        event.put("gf", true);
                        this.cleverTapMetaData.m106470d0(false);
                        event.put("gfSDKVersion", this.cleverTapMetaData.m106483m());
                        this.cleverTapMetaData.m106463Z(0);
                    }
                } else if (eventType != 3) {
                    str = eventType != 5 ? NotificationCompat.CATEGORY_EVENT : "data";
                } else {
                    str = "profile";
                }
                String strM106488s = this.cleverTapMetaData.m106488s();
                if (strM106488s != null) {
                    event.put("n", strM106488s);
                }
                event.put(BLiveStormDanmakuGiftResourceType.f45294s, this.cleverTapMetaData.m106480k());
                event.put("pg", bu9.m106435e());
                event.put("type", str);
                event.put("ep", m209382w());
                event.put("f", this.cleverTapMetaData.m106443C());
                event.put("lsl", this.cleverTapMetaData.m106484o());
                m209374t(context, event);
                s0l0 s0l0VarM193843a = this.validationResultStack.m193843a();
                if (s0l0VarM193843a != null) {
                    event.put(Constants.ERROR_KEY, lw3.m156022c(s0l0VarM193843a));
                }
                this.localDataStore.m118210J(event);
                this.baseDatabaseManager.mo104581a(context, event, eventType);
                m209383x(context, event, eventType, flattenedEventData);
                m209378C(context);
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to queue event: " + event, th);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
