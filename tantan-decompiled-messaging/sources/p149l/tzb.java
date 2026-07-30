package p149l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0097\u00012\u00020\u0001:\u0001mB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*2\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020)0-H\u0007¢\u0006\u0004\b/\u00100J#\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b3\u00104J+\u00106\u001a\u0002022\u0010\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b6\u00107J#\u00108\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b8\u00104J%\u0010:\u001a\u0002022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u00107J%\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040<2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0013H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040<2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040<2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010@J)\u0010E\u001a\u0002022\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bE\u00107J!\u0010G\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020\u0013H\u0007¢\u0006\u0004\bG\u0010HJ+\u0010J\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bJ\u0010KJ)\u0010L\u001a\u0002022\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bL\u00107J!\u0010M\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020\u0013H\u0007¢\u0006\u0004\bM\u0010HJ+\u0010P\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\bP\u0010QJ#\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0013¢\u0006\u0004\bX\u0010YJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040Z¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u0002022\u0006\u0010N\u001a\u00020\u0004¢\u0006\u0004\b]\u0010^J\u001d\u0010`\u001a\u00020\u001f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040ZH\u0007¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001f¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u001f¢\u0006\u0004\bd\u0010cJ\r\u0010e\u001a\u00020\u0013¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0007¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001e\u0010\u0082\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bJ\u0010{\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0086\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bb\u0010{\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u008a\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b \u0010{\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008e\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\"\u0010{\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0092\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bk\u0010{\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0093\u0001R\u001a\u0010\u0096\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0095\u0001¨\u0006\u0098\u0001"}, m87232d2 = {"Ll/tzb;", "", "Landroid/content/Context;", "context", "", "databaseName", "accountId", "Ll/nul;", "logger", "Ll/vzb;", "dbEncryptionHandler", "Ll/n95;", "clock", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll/nul;Ll/vzb;Ll/n95;)V", "Lorg/json/JSONObject;", "obj", "Lcom/clevertap/android/sdk/db/Table;", "table", "", "N", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)J", "", Constants.KEY_LIMIT, "Ll/cpb0;", "p", "(Lcom/clevertap/android/sdk/db/Table;I)Ll/cpb0;", "batchSize", "o", "(I)Ll/cpb0;", "lastId", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Lcom/clevertap/android/sdk/db/Table;)V", "j", "(Lcom/clevertap/android/sdk/db/Table;)V", "J", "I", "(Lcom/clevertap/android/sdk/db/Table;)I", "userId", "Ljava/util/ArrayList;", "Ll/pv3;", "Lkotlin/collections/ArrayList;", BaseSei.f13931Y, "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "inboxMessages", j6f.LATITUDE_SOUTH, "(Ljava/util/List;)V", "messageId", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Ljava/lang/String;)Z", "messageIDs", "m", "(Ljava/util/List;Ljava/lang/String;)Z", "H", "messageIds", "F", "staleCutoffSeconds", "", Constants.KEY_T, "(Ljava/lang/String;J)Ljava/util/Set;", BaseSei.f13932Z, "(Ljava/lang/String;)Ljava/util/Set;", "Ll/oi60;", "A", "(Ljava/lang/String;)Ljava/util/List;", "B", "G", "nowSeconds", "K", "(Ljava/lang/String;J)I", "expiresAt", "g", "(Ljava/lang/String;Ljava/lang/String;J)Z", "M", "L", "id", Constants.DEVICE_ID_TAG, "Q", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)J", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)Ljava/util/Map;", "r", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "ttlInSeconds", BloodType.f38728O, "(Ljava/lang/String;J)V", "", "q", "()[Ljava/lang/String;", "n", "(Ljava/lang/String;)Z", "ids", "R", "([Ljava/lang/String;)V", "h", "()V", "P", BaseSei.f13930X, "()J", "Ll/a5k0;", j6f.GPS_DIRECTION_TRUE, "()Ll/a5k0;", "Ll/wsd;", "k", "()Ll/wsd;", "a", "Ljava/lang/String;", "b", "Ll/nul;", "c", "Ll/vzb;", Constants.INAPP_DATA_TAG, "Ll/n95;", "Ll/t5c;", "e", "Ll/t5c;", "dbHelper", "Ll/u2f;", "f", "Lkotlin/Lazy;", "u", "()Ll/u2f;", "eventDAO", "Ll/vqm;", ResourceDirection.f38808v, "()Ll/vqm;", "inboxMessageDAO", "Ll/m7k0;", "E", "()Ll/m7k0;", "userProfileDAO", "Ll/pfb0;", b2s.C_ZONE, "()Ll/pfb0;", "pushNotificationDAO", "Ll/loj0;", "D", "()Ll/loj0;", "uninstallTimestampDAO", "Ll/yqm;", "w", "()Ll/yqm;", "inboxPendingActionsDAO", "Ll/a5k0;", "userEventLogDao", "Ll/wsd;", "delayedLegacyInAppDao", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class tzb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final vzb dbEncryptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final t5c dbHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventDAO;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy inboxMessageDAO;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy userProfileDAO;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy pushNotificationDAO;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy uninstallTimestampDAO;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy inboxPendingActionsDAO;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private volatile a5k0 userEventLogDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private volatile wsd delayedLegacyInAppDao;

    public tzb(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull nul nulVar, @NotNull vzb vzbVar, @NotNull n95 n95Var) {
        context.getClass();
        str.getClass();
        str2.getClass();
        nulVar.getClass();
        vzbVar.getClass();
        n95Var.getClass();
        this.accountId = str2;
        this.logger = nulVar;
        this.dbEncryptionHandler = vzbVar;
        this.clock = n95Var;
        this.dbHelper = new t5c(context, str2, str, nulVar);
        this.eventDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.nzb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191145b(this.f141198a);
            }
        });
        this.inboxMessageDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ozb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191147d(this.f146412a);
            }
        });
        this.userProfileDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.pzb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191146c(this.f151935a);
            }
        });
        this.pushNotificationDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qzb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191148e(this.f157019a);
            }
        });
        this.uninstallTimestampDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.rzb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191144a(this.f161626a);
            }
        });
        this.inboxPendingActionsDAO = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.szb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tzb.m191149f(this.f167025a);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    private final pfb0 m191141C() {
        return (pfb0) this.pushNotificationDAO.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final loj0 m191142D() {
        return (loj0) this.uninstallTimestampDAO.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final m7k0 m191143E() {
        return (m7k0) this.userProfileDAO.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static moj0 m191144a(tzb tzbVar) {
        tzbVar.getClass();
        return new moj0(tzbVar.dbHelper, tzbVar.logger, null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static v2f m191145b(tzb tzbVar) {
        tzbVar.getClass();
        return new v2f(tzbVar.dbHelper, tzbVar.logger, tzbVar.dbEncryptionHandler, tzbVar.clock);
    }

    /* JADX INFO: renamed from: c */
    public static n7k0 m191146c(tzb tzbVar) {
        tzbVar.getClass();
        return new n7k0(tzbVar.dbHelper, tzbVar.logger, tzbVar.dbEncryptionHandler);
    }

    /* JADX INFO: renamed from: d */
    public static wqm m191147d(tzb tzbVar) {
        tzbVar.getClass();
        return new wqm(tzbVar.dbHelper, tzbVar.logger, tzbVar.dbEncryptionHandler);
    }

    /* JADX INFO: renamed from: e */
    public static qfb0 m191148e(tzb tzbVar) {
        tzbVar.getClass();
        return new qfb0(tzbVar.dbHelper, tzbVar.logger, tzbVar.clock);
    }

    /* JADX INFO: renamed from: f */
    public static zqm m191149f(tzb tzbVar) {
        tzbVar.getClass();
        return new zqm(tzbVar.dbHelper, tzbVar.logger, tzbVar.clock);
    }

    /* JADX INFO: renamed from: u */
    private final u2f m191150u() {
        return (u2f) this.eventDAO.getValue();
    }

    /* JADX INFO: renamed from: v */
    private final vqm m191151v() {
        return (vqm) this.inboxMessageDAO.getValue();
    }

    /* JADX INFO: renamed from: w */
    private final yqm m191152w() {
        return (yqm) this.inboxPendingActionsDAO.getValue();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: A */
    public final synchronized List<oi60> m191153A(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m191152w().mo215752g(userId) : CollectionsKt.emptyList();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: B */
    public final synchronized Set<String> m191154B(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m191152w().mo215748c(userId) : SetsKt.emptySet();
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final synchronized boolean m191155F(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        return m191151v().mo199590f(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final synchronized boolean m191156G(@Nullable List<String> messageIds, @Nullable String userId) {
        List<String> list;
        list = messageIds;
        return (list == null || list.isEmpty() || userId == null) ? false : m191152w().mo215753h(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final synchronized boolean m191157H(@Nullable String messageId, @Nullable String userId) {
        return (messageId == null || userId == null) ? false : m191151v().mo199585a(messageId, userId);
    }

    /* JADX INFO: renamed from: I */
    public final int m191158I(@NotNull Table table) {
        table.getClass();
        return m191150u().mo191488f(table);
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m191159J(@NotNull Table table) {
        table.getClass();
        m191150u().mo191489g(table);
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final synchronized int m191160K(@Nullable String userId, long nowSeconds) {
        return userId != null ? m191152w().mo215747b(userId, nowSeconds) : 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final synchronized int m191161L(@Nullable String userId, long nowSeconds) {
        return userId != null ? m191152w().mo215750e(userId, nowSeconds) : 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final synchronized boolean m191162M(@Nullable List<String> messageIds, @Nullable String userId) {
        List<String> list;
        list = messageIds;
        return (list == null || list.isEmpty() || userId == null) ? false : m191152w().mo215749d(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final synchronized long m191163N(@NotNull JSONObject obj, @NotNull Table table) {
        obj.getClass();
        table.getClass();
        return m191150u().mo191485c(obj, table);
    }

    /* JADX INFO: renamed from: O */
    public final synchronized void m191164O(@NotNull String id, long ttlInSeconds) {
        id.getClass();
        m191141C().mo168602a(id, ttlInSeconds);
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m191165P() {
        m191142D().mo150780a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: Q */
    public final synchronized long m191166Q(@Nullable String id, @Nullable String deviceId, @NotNull JSONObject obj) {
        obj.getClass();
        return (id == null || deviceId == null) ? -1L : m191143E().mo153378b(id, deviceId, obj);
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final synchronized void m191167R(@NotNull String[] ids) {
        ids.getClass();
        m191141C().mo168604c(ids);
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final synchronized void m191168S(@NotNull List<? extends pv3> inboxMessages) {
        inboxMessages.getClass();
        m191151v().mo199589e(inboxMessages);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: T */
    public final a5k0 m191169T() {
        a5k0 b5k0Var;
        a5k0 a5k0Var = this.userEventLogDao;
        if (a5k0Var != null) {
            return a5k0Var;
        }
        synchronized (this) {
            b5k0Var = this.userEventLogDao;
            if (b5k0Var == null) {
                b5k0Var = new b5k0(this.dbHelper, this.logger, Table.USER_EVENT_LOGS_TABLE);
                this.userEventLogDao = b5k0Var;
            }
        }
        return b5k0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m191170g(@Nullable String messageId, @Nullable String userId, long expiresAt) {
        return (messageId == null || userId == null) ? false : m191152w().mo215751f(messageId, userId, expiresAt);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m191171h() {
        m191141C().mo168603b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final synchronized void m191172i(@NotNull String lastId, @NotNull Table table) {
        lastId.getClass();
        table.getClass();
        m191150u().mo191484b(lastId, table);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m191173j(@NotNull Table table) {
        table.getClass();
        m191150u().mo191483a(table);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: k */
    public final wsd m191174k() {
        wsd wsdVar;
        wsd wsdVar2 = this.delayedLegacyInAppDao;
        if (wsdVar2 != null) {
            return wsdVar2;
        }
        synchronized (this) {
            wsdVar = this.delayedLegacyInAppDao;
            if (wsdVar == null) {
                xsd xsdVar = new xsd(this.dbHelper, this.logger, Table.DELAYED_LEGACY_INAPPS, null, 8, null);
                this.delayedLegacyInAppDao = xsdVar;
                wsdVar = xsdVar;
            }
        }
        return wsdVar;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final synchronized boolean m191175l(@Nullable String messageId, @Nullable String userId) {
        return (messageId == null || userId == null) ? false : m191151v().mo199587c(messageId, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    public final synchronized boolean m191176m(@Nullable List<String> messageIDs, @Nullable String userId) {
        boolean zMo199586b;
        zMo199586b = false;
        if (messageIDs != null && userId != null) {
            List<String> listFilterNotNull = CollectionsKt.filterNotNull(messageIDs);
            if (!listFilterNotNull.isEmpty()) {
                zMo199586b = m191151v().mo199586b(listFilterNotNull, userId);
            }
        }
        return zMo199586b;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m191177n(@NotNull String id) {
        id.getClass();
        return m191141C().mo168606e(id);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: o */
    public final synchronized cpb0 m191178o(int batchSize) {
        return m191150u().mo191486d(batchSize);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: p */
    public final synchronized cpb0 m191179p(@NotNull Table table, int limit) {
        table.getClass();
        return m191150u().mo191487e(table, limit);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final synchronized String[] m191180q() {
        return m191141C().mo168605d();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final synchronized JSONObject m191181r(@Nullable String accountId, @Nullable String deviceId) {
        return (accountId == null || deviceId == null) ? null : m191143E().mo153377a(accountId, deviceId);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final synchronized Map<String, JSONObject> m191182s(@Nullable String accountId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return accountId != null ? m191143E().mo153379c(accountId) : MapsKt.emptyMap();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: t */
    public final synchronized Set<String> m191183t(@NotNull String userId, long staleCutoffSeconds) {
        userId.getClass();
        return m191151v().mo199588d(userId, staleCutoffSeconds);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized long m191184x() {
        return m191142D().mo150781b();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: y */
    public final synchronized ArrayList<pv3> m191185y(@NotNull String userId) {
        userId.getClass();
        return m191151v().mo199591g(userId);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: z */
    public final synchronized Set<String> m191186z(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m191152w().mo215746a(userId) : SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: l.tzb$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/tzb$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "", "a", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Ljava/lang/String;", "", "DB_UPDATE_ERROR", "J", "DB_OUT_OF_MEMORY_ERROR", "NOT_ENOUGH_SPACE_LOG", "Ljava/lang/String;", "DATABASE_NAME", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m191187a(@NotNull CleverTapInstanceConfig config) {
            config.getClass();
            if (config.isDefaultInstance()) {
                return "clevertap";
            }
            return "clevertap_" + config.getAccountId();
        }

        private Companion() {
        }
    }

    public /* synthetic */ tzb(Context context, String str, String str2, nul nulVar, vzb vzbVar, n95 n95Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, nulVar, vzbVar, (i & 32) != 0 ? n95.f137721a : n95Var);
    }
}
