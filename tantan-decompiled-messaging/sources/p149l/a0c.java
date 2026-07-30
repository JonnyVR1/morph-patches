package p149l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.p013db.Table;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u0000 E2\u00020\u0001:\u00019BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b$\u0010\u0016J'\u0010*\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b2\u00103J%\u00105\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b7\u0010-J'\u00109\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00108\u001a\u00020%H\u0017¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010AR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010BR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010C¨\u0006F"}, m87232d2 = {"Ll/a0c;", "Ll/ui2;", "", "accountId", "Ll/nul;", "logger", "databaseName", "Ll/ov3;", "ctLockManager", "Ll/gtl;", "ijRepo", "Ll/vzb;", "dbEncryptionHandler", "Lkotlin/Function0;", "", "clearFirstRequestTs", "clearLastRequestTs", "<init>", "(Ljava/lang/String;Ll/nul;Ljava/lang/String;Ll/ov3;Ll/gtl;Ll/vzb;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)V", "j", "()V", "k", "h", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "Lcom/clevertap/android/sdk/db/Table;", "table", "n", "(Landroid/content/Context;Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)V", "Ll/tzb;", "c", "(Landroid/content/Context;)Ll/tzb;", "b", "", "batchSize", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "Ll/cpb0;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;ILcom/clevertap/android/sdk/events/EventGroup;)Ll/cpb0;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;I)Ll/cpb0;", "", "eventIds", "profileEventIds", "", "e", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z", "ids", "g", "(Landroid/content/Context;Ljava/util/List;)Z", "m", "type", "a", "(Landroid/content/Context;Lorg/json/JSONObject;I)V", "f", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "Ljava/lang/String;", "Ll/nul;", "Ll/ov3;", "Ll/gtl;", "Ll/vzb;", "Lkotlin/jvm/functions/Function0;", "Ll/tzb;", "dbAdapter", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class a0c implements ui2 {

    @NotNull
    private static final C15505a Companion = new C15505a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String databaseName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ov3 ctLockManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final gtl ijRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final vzb dbEncryptionHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearFirstRequestTs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearLastRequestTs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private tzb dbAdapter;

    /* JADX INFO: renamed from: l.a0c$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C15506b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67030a;

        static {
            int[] iArr = new int[EventGroup.values().length];
            try {
                iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f67030a = iArr;
        }
    }

    public a0c(@NotNull String str, @NotNull nul nulVar, @NotNull String str2, @NotNull ov3 ov3Var, @NotNull gtl gtlVar, @NotNull vzb vzbVar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        str.getClass();
        nulVar.getClass();
        str2.getClass();
        ov3Var.getClass();
        gtlVar.getClass();
        vzbVar.getClass();
        function0.getClass();
        function1.getClass();
        this.accountId = str;
        this.logger = nulVar;
        this.databaseName = str2;
        this.ctLockManager = ov3Var;
        this.ijRepo = gtlVar;
        this.dbEncryptionHandler = vzbVar;
        this.clearFirstRequestTs = function0;
        this.clearLastRequestTs = function1;
    }

    /* JADX INFO: renamed from: h */
    private final void m94403h() {
        this.clearFirstRequestTs.invoke();
    }

    /* JADX INFO: renamed from: i */
    private final void m94404i(Context context) {
        this.ijRepo.m127988a(context);
    }

    /* JADX INFO: renamed from: j */
    private final void m94405j() {
        this.clearLastRequestTs.invoke();
    }

    /* JADX INFO: renamed from: k */
    private final void m94406k(Context context) {
        m94404i(context);
        m94403h();
        m94405j();
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    private final void m94407n(Context context, JSONObject event, Table table) {
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            try {
                if (mo94410c(context).m191163N(event, table) > 0) {
                    this.logger.debug(this.accountId, "Queued event: " + event);
                    this.logger.verbose(this.accountId, "Queued event to DB table " + table + ": " + event);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ui2
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo94408a(@NotNull Context context, @NotNull JSONObject event, int type) {
        context.getClass();
        event.getClass();
        m94407n(context, event, type == 3 ? Table.PROFILE_EVENTS : Table.EVENTS);
    }

    @Override // p149l.ui2
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public void mo94409b(@NotNull Context context) {
        context.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            tzb tzbVarMo94410c = mo94410c(context);
            tzbVarMo94410c.m191159J(Table.EVENTS);
            tzbVarMo94410c.m191159J(Table.PROFILE_EVENTS);
            m94406k(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p149l.ui2
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public synchronized tzb mo94410c(@NotNull Context context) {
        tzb tzbVar;
        context.getClass();
        tzbVar = this.dbAdapter;
        if (tzbVar == null) {
            tzb tzbVar2 = new tzb(context, this.databaseName, this.accountId, this.logger, this.dbEncryptionHandler, null, 32, null);
            this.dbAdapter = tzbVar2;
            tzbVar2.m191173j(Table.EVENTS);
            tzbVar2.m191173j(Table.PROFILE_EVENTS);
            tzbVar2.m191173j(Table.PUSH_NOTIFICATION_VIEWED);
            tzbVar2.m191171h();
            tzbVar2.m191169T().mo95048b(11520, EffectsSDKEffectConstants.FaceExtraModel.BEF_MOBILE_FACE_280_DETECT);
            tzbVar2.m191174k().mo205475b();
            tzbVar = tzbVar2;
        }
        return tzbVar;
    }

    @Override // p149l.ui2
    @NotNull
    /* JADX INFO: renamed from: d */
    public cpb0 mo94411d(@NotNull Context context, int batchSize, @NotNull EventGroup eventGroup) {
        context.getClass();
        eventGroup.getClass();
        int i = C15506b.f67030a[eventGroup.ordinal()];
        nul nulVar = this.logger;
        if (i == 1) {
            nulVar.verbose(this.accountId, "Returning Queued Notification Viewed events");
            return m94416m(context, batchSize);
        }
        nulVar.verbose(this.accountId, "Returning combined queued events");
        return m94415l(context, batchSize);
    }

    @Override // p149l.ui2
    /* JADX INFO: renamed from: e */
    public boolean mo94412e(@NotNull Context context, @NotNull List<String> eventIds, @NotNull List<String> profileEventIds) {
        context.getClass();
        eventIds.getClass();
        profileEventIds.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            if (eventIds.isEmpty() && profileEventIds.isEmpty()) {
                return true;
            }
            try {
                tzb tzbVarMo94410c = mo94410c(context);
                if (!eventIds.isEmpty()) {
                    tzbVarMo94410c.m191172i(eventIds.get(eventIds.size() - 1), Table.EVENTS);
                    this.logger.verbose(this.accountId, "Cleaned " + eventIds.size() + " events from events table");
                }
                if (!profileEventIds.isEmpty()) {
                    tzbVarMo94410c.m191172i(profileEventIds.get(profileEventIds.size() - 1), Table.PROFILE_EVENTS);
                    this.logger.verbose(this.accountId, "Cleaned " + profileEventIds.size() + " events from profileEvents table");
                }
                return true;
            } catch (Exception e) {
                this.logger.verbose(this.accountId, "Error during cleanup of sent events", e);
                return false;
            }
        }
    }

    @Override // p149l.ui2
    @WorkerThread
    /* JADX INFO: renamed from: f */
    public void mo94413f(@NotNull Context context, @NotNull JSONObject event) {
        context.getClass();
        event.getClass();
        m94407n(context, event, Table.PUSH_NOTIFICATION_VIEWED);
    }

    @Override // p149l.ui2
    /* JADX INFO: renamed from: g */
    public boolean mo94414g(@NotNull Context context, @NotNull List<String> ids) {
        context.getClass();
        ids.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            if (ids.isEmpty()) {
                return true;
            }
            try {
                tzb tzbVarMo94410c = mo94410c(context);
                if (!ids.isEmpty()) {
                    tzbVarMo94410c.m191172i(ids.get(ids.size() - 1), Table.PUSH_NOTIFICATION_VIEWED);
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
    public cpb0 m94415l(@NotNull Context context, int batchSize) {
        cpb0 cpb0VarM191178o;
        context.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            cpb0VarM191178o = mo94410c(context).m191178o(batchSize);
        }
        return cpb0VarM191178o;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public cpb0 m94416m(@NotNull Context context, int batchSize) {
        cpb0 cpb0VarM191179p;
        context.getClass();
        Object objM166151a = this.ctLockManager.m166151a();
        objM166151a.getClass();
        synchronized (objM166151a) {
            cpb0VarM191179p = mo94410c(context).m191179p(Table.PUSH_NOTIFICATION_VIEWED, batchSize);
        }
        return cpb0VarM191179p;
    }

    /* JADX INFO: renamed from: l.a0c$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"Ll/a0c$a;", "", "<init>", "()V", "", "USER_EVENT_LOG_ROWS_PER_USER", "I", "USER_EVENT_LOG_ROWS_THRESHOLD", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C15505a {
        public /* synthetic */ C15505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15505a() {
        }
    }
}
