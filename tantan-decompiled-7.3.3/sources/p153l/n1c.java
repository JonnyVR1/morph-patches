package p153l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.p014db.Table;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u0000 E2\u00020\u0001:\u00019BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b$\u0010\u0016J'\u0010*\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b2\u00103J%\u00105\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b7\u0010-J'\u00109\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00108\u001a\u00020%H\u0017¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010AR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010BR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010C¨\u0006F"}, m88121d2 = {"Ll/n1c;", "Ll/bj2;", "", "accountId", "Ll/axl;", "logger", "databaseName", "Ll/nw3;", "ctLockManager", "Ll/uvl;", "ijRepo", "Ll/j1c;", "dbEncryptionHandler", "Lkotlin/Function0;", "", "clearFirstRequestTs", "clearLastRequestTs", "<init>", "(Ljava/lang/String;Ll/axl;Ljava/lang/String;Ll/nw3;Ll/uvl;Ll/j1c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)V", "j", "()V", "k", "h", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "Lcom/clevertap/android/sdk/db/Table;", "table", "n", "(Landroid/content/Context;Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)V", "Ll/h1c;", "c", "(Landroid/content/Context;)Ll/h1c;", "b", "", "batchSize", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "Ll/gxb0;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;ILcom/clevertap/android/sdk/events/EventGroup;)Ll/gxb0;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/content/Context;I)Ll/gxb0;", "", "eventIds", "profileEventIds", "", "e", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z", "ids", "g", "(Landroid/content/Context;Ljava/util/List;)Z", "m", "type", "a", "(Landroid/content/Context;Lorg/json/JSONObject;I)V", "f", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "Ljava/lang/String;", "Ll/axl;", "Ll/nw3;", "Ll/uvl;", "Ll/j1c;", "Lkotlin/jvm/functions/Function0;", "Ll/h1c;", "dbAdapter", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class n1c implements bj2 {

    @NotNull
    private static final C18760a Companion = new C18760a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String databaseName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final nw3 ctLockManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final uvl ijRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearFirstRequestTs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearLastRequestTs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private h1c dbAdapter;

    /* JADX INFO: renamed from: l.n1c$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C18761b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f139748a;

        static {
            int[] iArr = new int[EventGroup.values().length];
            try {
                iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f139748a = iArr;
        }
    }

    public n1c(@NotNull String str, @NotNull axl axlVar, @NotNull String str2, @NotNull nw3 nw3Var, @NotNull uvl uvlVar, @NotNull j1c j1cVar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        str.getClass();
        axlVar.getClass();
        str2.getClass();
        nw3Var.getClass();
        uvlVar.getClass();
        j1cVar.getClass();
        function0.getClass();
        function1.getClass();
        this.accountId = str;
        this.logger = axlVar;
        this.databaseName = str2;
        this.ctLockManager = nw3Var;
        this.ijRepo = uvlVar;
        this.dbEncryptionHandler = j1cVar;
        this.clearFirstRequestTs = function0;
        this.clearLastRequestTs = function1;
    }

    /* JADX INFO: renamed from: h */
    private final void m161104h() {
        this.clearFirstRequestTs.invoke();
    }

    /* JADX INFO: renamed from: i */
    private final void m161105i(Context context) {
        this.ijRepo.m198297a(context);
    }

    /* JADX INFO: renamed from: j */
    private final void m161106j() {
        this.clearLastRequestTs.invoke();
    }

    /* JADX INFO: renamed from: k */
    private final void m161107k(Context context) {
        m161105i(context);
        m161104h();
        m161106j();
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    private final void m161108n(Context context, JSONObject event, Table table) {
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            try {
                if (mo104583c(context).m133295N(event, table) > 0) {
                    this.logger.debug(this.accountId, "Queued event: " + event);
                    this.logger.verbose(this.accountId, "Queued event to DB table " + table + ": " + event);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.bj2
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo104581a(@NotNull Context context, @NotNull JSONObject event, int type) {
        context.getClass();
        event.getClass();
        m161108n(context, event, type == 3 ? Table.PROFILE_EVENTS : Table.EVENTS);
    }

    @Override // p153l.bj2
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public void mo104582b(@NotNull Context context) {
        context.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            h1c h1cVarMo104583c = mo104583c(context);
            h1cVarMo104583c.m133291J(Table.EVENTS);
            h1cVarMo104583c.m133291J(Table.PROFILE_EVENTS);
            m161107k(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p153l.bj2
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public synchronized h1c mo104583c(@NotNull Context context) {
        h1c h1cVar;
        context.getClass();
        h1cVar = this.dbAdapter;
        if (h1cVar == null) {
            h1c h1cVar2 = new h1c(context, this.databaseName, this.accountId, this.logger, this.dbEncryptionHandler, null, 32, null);
            this.dbAdapter = h1cVar2;
            h1cVar2.m133305j(Table.EVENTS);
            h1cVar2.m133305j(Table.PROFILE_EVENTS);
            h1cVar2.m133305j(Table.PUSH_NOTIFICATION_VIEWED);
            h1cVar2.m133303h();
            h1cVar2.m133301T().mo130016b(11520, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT);
            h1cVar2.m133306k().mo151505b();
            h1cVar = h1cVar2;
        }
        return h1cVar;
    }

    @Override // p153l.bj2
    @NotNull
    /* JADX INFO: renamed from: d */
    public gxb0 mo104584d(@NotNull Context context, int batchSize, @NotNull EventGroup eventGroup) {
        context.getClass();
        eventGroup.getClass();
        int i = C18761b.f139748a[eventGroup.ordinal()];
        axl axlVar = this.logger;
        if (i == 1) {
            axlVar.verbose(this.accountId, "Returning Queued Notification Viewed events");
            return m161110m(context, batchSize);
        }
        axlVar.verbose(this.accountId, "Returning combined queued events");
        return m161109l(context, batchSize);
    }

    @Override // p153l.bj2
    /* JADX INFO: renamed from: e */
    public boolean mo104585e(@NotNull Context context, @NotNull List<String> eventIds, @NotNull List<String> profileEventIds) {
        context.getClass();
        eventIds.getClass();
        profileEventIds.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            if (eventIds.isEmpty() && profileEventIds.isEmpty()) {
                return true;
            }
            try {
                h1c h1cVarMo104583c = mo104583c(context);
                if (!eventIds.isEmpty()) {
                    h1cVarMo104583c.m133304i(eventIds.get(eventIds.size() - 1), Table.EVENTS);
                    this.logger.verbose(this.accountId, "Cleaned " + eventIds.size() + " events from events table");
                }
                if (!profileEventIds.isEmpty()) {
                    h1cVarMo104583c.m133304i(profileEventIds.get(profileEventIds.size() - 1), Table.PROFILE_EVENTS);
                    this.logger.verbose(this.accountId, "Cleaned " + profileEventIds.size() + " events from profileEvents table");
                }
                return true;
            } catch (Exception e) {
                this.logger.verbose(this.accountId, "Error during cleanup of sent events", e);
                return false;
            }
        }
    }

    @Override // p153l.bj2
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public void mo104586f(@NotNull Context context, @NotNull JSONObject event) {
        context.getClass();
        event.getClass();
        m161108n(context, event, Table.PUSH_NOTIFICATION_VIEWED);
    }

    @Override // p153l.bj2
    /* JADX INFO: renamed from: g */
    public boolean mo104587g(@NotNull Context context, @NotNull List<String> ids) {
        context.getClass();
        ids.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            if (ids.isEmpty()) {
                return true;
            }
            try {
                h1c h1cVarMo104583c = mo104583c(context);
                if (!ids.isEmpty()) {
                    h1cVarMo104583c.m133304i(ids.get(ids.size() - 1), Table.PUSH_NOTIFICATION_VIEWED);
                    this.logger.verbose(this.accountId, "Cleaned " + ids.size() + " events from Push impressions table");
                }
                return true;
            } catch (Exception e) {
                this.logger.verbose(this.accountId, "Error during cleanup of notification sent events", e);
                return false;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public gxb0 m161109l(@NotNull Context context, int batchSize) {
        gxb0 gxb0VarM133310o;
        context.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            gxb0VarM133310o = mo104583c(context).m133310o(batchSize);
        }
        return gxb0VarM133310o;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public gxb0 m161110m(@NotNull Context context, int batchSize) {
        gxb0 gxb0VarM133311p;
        context.getClass();
        Object objM164937a = this.ctLockManager.m164937a();
        objM164937a.getClass();
        synchronized (objM164937a) {
            gxb0VarM133311p = mo104583c(context).m133311p(Table.PUSH_NOTIFICATION_VIEWED, batchSize);
        }
        return gxb0VarM133311p;
    }

    /* JADX INFO: renamed from: l.n1c$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"Ll/n1c$a;", "", "<init>", "()V", "", "USER_EVENT_LOG_ROWS_PER_USER", "I", "USER_EVENT_LOG_ROWS_THRESHOLD", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C18760a {
        public /* synthetic */ C18760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C18760a() {
        }
    }
}
