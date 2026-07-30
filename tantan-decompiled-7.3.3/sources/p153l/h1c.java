package p153l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p014db.Table;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0097\u00012\u00020\u0001:\u0001mB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*2\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020)0-H\u0007¢\u0006\u0004\b/\u00100J#\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b3\u00104J+\u00106\u001a\u0002022\u0010\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b6\u00107J#\u00108\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b8\u00104J%\u0010:\u001a\u0002022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u00107J%\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040<2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0013H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040<2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040<2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bD\u0010@J)\u0010E\u001a\u0002022\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bE\u00107J!\u0010G\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020\u0013H\u0007¢\u0006\u0004\bG\u0010HJ+\u0010J\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bJ\u0010KJ)\u0010L\u001a\u0002022\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bL\u00107J!\u0010M\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020\u0013H\u0007¢\u0006\u0004\bM\u0010HJ+\u0010P\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\bP\u0010QJ#\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0013¢\u0006\u0004\bX\u0010YJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040Z¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u0002022\u0006\u0010N\u001a\u00020\u0004¢\u0006\u0004\b]\u0010^J\u001d\u0010`\u001a\u00020\u001f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040ZH\u0007¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001f¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u001f¢\u0006\u0004\bd\u0010cJ\r\u0010e\u001a\u00020\u0013¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0007¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0007¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001e\u0010\u0082\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bJ\u0010{\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0086\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bb\u0010{\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u008a\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b \u0010{\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008e\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\"\u0010{\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0092\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bk\u0010{\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0093\u0001R\u001a\u0010\u0096\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0095\u0001¨\u0006\u0098\u0001"}, m88121d2 = {"Ll/h1c;", "", "Landroid/content/Context;", "context", "", "databaseName", "accountId", "Ll/axl;", "logger", "Ll/j1c;", "dbEncryptionHandler", "Ll/oa5;", "clock", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll/axl;Ll/j1c;Ll/oa5;)V", "Lorg/json/JSONObject;", "obj", "Lcom/clevertap/android/sdk/db/Table;", "table", "", "N", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)J", "", Constants.KEY_LIMIT, "Ll/gxb0;", "p", "(Lcom/clevertap/android/sdk/db/Table;I)Ll/gxb0;", "batchSize", "o", "(I)Ll/gxb0;", "lastId", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Lcom/clevertap/android/sdk/db/Table;)V", "j", "(Lcom/clevertap/android/sdk/db/Table;)V", "J", "I", "(Lcom/clevertap/android/sdk/db/Table;)I", "userId", "Ljava/util/ArrayList;", "Ll/ow3;", "Lkotlin/collections/ArrayList;", BaseSei.f14625Y, "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "inboxMessages", p7f.LATITUDE_SOUTH, "(Ljava/util/List;)V", "messageId", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/lang/String;)Z", "messageIDs", "m", "(Ljava/util/List;Ljava/lang/String;)Z", "H", "messageIds", "F", "staleCutoffSeconds", "", Constants.KEY_T, "(Ljava/lang/String;J)Ljava/util/Set;", BaseSei.f14626Z, "(Ljava/lang/String;)Ljava/util/Set;", "Ll/tq60;", "A", "(Ljava/lang/String;)Ljava/util/List;", "B", "G", "nowSeconds", "K", "(Ljava/lang/String;J)I", "expiresAt", "g", "(Ljava/lang/String;Ljava/lang/String;J)Z", "M", "L", "id", Constants.DEVICE_ID_TAG, "Q", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)J", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Ljava/util/Map;", "r", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "ttlInSeconds", BloodType.f39576O, "(Ljava/lang/String;J)V", "", "q", "()[Ljava/lang/String;", "n", "(Ljava/lang/String;)Z", "ids", "R", "([Ljava/lang/String;)V", "h", "()V", "P", BaseSei.f14624X, "()J", "Ll/gek0;", p7f.GPS_DIRECTION_TRUE, "()Ll/gek0;", "Ll/kud;", "k", "()Ll/kud;", "a", "Ljava/lang/String;", "b", "Ll/axl;", "c", "Ll/j1c;", Constants.INAPP_DATA_TAG, "Ll/oa5;", "Ll/z6c;", "e", "Ll/z6c;", "dbHelper", "Ll/z3f;", "f", "Lkotlin/Lazy;", "u", "()Ll/z3f;", "eventDAO", "Ll/xsm;", ResourceDirection.f39656v, "()Ll/xsm;", "inboxMessageDAO", "Ll/sgk0;", "E", "()Ll/sgk0;", "userProfileDAO", "Ll/tnb0;", c4s.C_ZONE, "()Ll/tnb0;", "pushNotificationDAO", "Ll/oxj0;", "D", "()Ll/oxj0;", "uninstallTimestampDAO", "Ll/atm;", "w", "()Ll/atm;", "inboxPendingActionsDAO", "Ll/gek0;", "userEventLogDao", "Ll/kud;", "delayedLegacyInAppDao", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class h1c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final z6c dbHelper;

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
    private volatile gek0 userEventLogDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private volatile kud delayedLegacyInAppDao;

    public h1c(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull axl axlVar, @NotNull j1c j1cVar, @NotNull oa5 oa5Var) {
        context.getClass();
        str.getClass();
        str2.getClass();
        axlVar.getClass();
        j1cVar.getClass();
        oa5Var.getClass();
        this.accountId = str2;
        this.logger = axlVar;
        this.dbEncryptionHandler = j1cVar;
        this.clock = oa5Var;
        this.dbHelper = new z6c(context, str2, str, axlVar);
        this.eventDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.b1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133277b(this.f74362a);
            }
        });
        this.inboxMessageDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.c1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133279d(this.f79387a);
            }
        });
        this.userProfileDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.d1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133278c(this.f84662a);
            }
        });
        this.pushNotificationDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.e1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133280e(this.f91590a);
            }
        });
        this.uninstallTimestampDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.f1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133276a(this.f96779a);
            }
        });
        this.inboxPendingActionsDAO = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.g1c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1c.m133281f(this.f101736a);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    private final tnb0 m133273C() {
        return (tnb0) this.pushNotificationDAO.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final oxj0 m133274D() {
        return (oxj0) this.uninstallTimestampDAO.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final sgk0 m133275E() {
        return (sgk0) this.userProfileDAO.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static pxj0 m133276a(h1c h1cVar) {
        h1cVar.getClass();
        return new pxj0(h1cVar.dbHelper, h1cVar.logger, null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static a4f m133277b(h1c h1cVar) {
        h1cVar.getClass();
        return new a4f(h1cVar.dbHelper, h1cVar.logger, h1cVar.dbEncryptionHandler, h1cVar.clock);
    }

    /* JADX INFO: renamed from: c */
    public static tgk0 m133278c(h1c h1cVar) {
        h1cVar.getClass();
        return new tgk0(h1cVar.dbHelper, h1cVar.logger, h1cVar.dbEncryptionHandler);
    }

    /* JADX INFO: renamed from: d */
    public static ysm m133279d(h1c h1cVar) {
        h1cVar.getClass();
        return new ysm(h1cVar.dbHelper, h1cVar.logger, h1cVar.dbEncryptionHandler);
    }

    /* JADX INFO: renamed from: e */
    public static unb0 m133280e(h1c h1cVar) {
        h1cVar.getClass();
        return new unb0(h1cVar.dbHelper, h1cVar.logger, h1cVar.clock);
    }

    /* JADX INFO: renamed from: f */
    public static btm m133281f(h1c h1cVar) {
        h1cVar.getClass();
        return new btm(h1cVar.dbHelper, h1cVar.logger, h1cVar.clock);
    }

    /* JADX INFO: renamed from: u */
    private final z3f m133282u() {
        return (z3f) this.eventDAO.getValue();
    }

    /* JADX INFO: renamed from: v */
    private final xsm m133283v() {
        return (xsm) this.inboxMessageDAO.getValue();
    }

    /* JADX INFO: renamed from: w */
    private final atm m133284w() {
        return (atm) this.inboxPendingActionsDAO.getValue();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: A */
    public final synchronized List<tq60> m133285A(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m133284w().mo100202g(userId) : CollectionsKt.emptyList();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: B */
    public final synchronized Set<String> m133286B(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m133284w().mo100198c(userId) : SetsKt.emptySet();
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final synchronized boolean m133287F(@NotNull List<String> messageIds, @NotNull String userId) {
        messageIds.getClass();
        userId.getClass();
        return m133283v().mo212994f(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final synchronized boolean m133288G(@Nullable List<String> messageIds, @Nullable String userId) {
        List<String> list;
        list = messageIds;
        return (list == null || list.isEmpty() || userId == null) ? false : m133284w().mo100203h(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final synchronized boolean m133289H(@Nullable String messageId, @Nullable String userId) {
        return (messageId == null || userId == null) ? false : m133283v().mo212989a(messageId, userId);
    }

    /* JADX INFO: renamed from: I */
    public final int m133290I(@NotNull Table table) {
        table.getClass();
        return m133282u().mo95921f(table);
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m133291J(@NotNull Table table) {
        table.getClass();
        m133282u().mo95922g(table);
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final synchronized int m133292K(@Nullable String userId, long nowSeconds) {
        return userId != null ? m133284w().mo100197b(userId, nowSeconds) : 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final synchronized int m133293L(@Nullable String userId, long nowSeconds) {
        return userId != null ? m133284w().mo100200e(userId, nowSeconds) : 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final synchronized boolean m133294M(@Nullable List<String> messageIds, @Nullable String userId) {
        List<String> list;
        list = messageIds;
        return (list == null || list.isEmpty() || userId == null) ? false : m133284w().mo100199d(messageIds, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final synchronized long m133295N(@NotNull JSONObject obj, @NotNull Table table) {
        obj.getClass();
        table.getClass();
        return m133282u().mo95918c(obj, table);
    }

    /* JADX INFO: renamed from: O */
    public final synchronized void m133296O(@NotNull String id, long ttlInSeconds) {
        id.getClass();
        m133273C().mo191878a(id, ttlInSeconds);
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m133297P() {
        m133274D().mo169717a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: Q */
    public final synchronized long m133298Q(@Nullable String id, @Nullable String deviceId, @NotNull JSONObject obj) {
        obj.getClass();
        return (id == null || deviceId == null) ? -1L : m133275E().mo185793b(id, deviceId, obj);
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final synchronized void m133299R(@NotNull String[] ids) {
        ids.getClass();
        m133273C().mo191880c(ids);
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final synchronized void m133300S(@NotNull List<? extends ow3> inboxMessages) {
        inboxMessages.getClass();
        m133283v().mo212993e(inboxMessages);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: T */
    public final gek0 m133301T() {
        gek0 hek0Var;
        gek0 gek0Var = this.userEventLogDao;
        if (gek0Var != null) {
            return gek0Var;
        }
        synchronized (this) {
            hek0Var = this.userEventLogDao;
            if (hek0Var == null) {
                hek0Var = new hek0(this.dbHelper, this.logger, Table.USER_EVENT_LOGS_TABLE);
                this.userEventLogDao = hek0Var;
            }
        }
        return hek0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m133302g(@Nullable String messageId, @Nullable String userId, long expiresAt) {
        return (messageId == null || userId == null) ? false : m133284w().mo100201f(messageId, userId, expiresAt);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m133303h() {
        m133273C().mo191879b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final synchronized void m133304i(@NotNull String lastId, @NotNull Table table) {
        lastId.getClass();
        table.getClass();
        m133282u().mo95917b(lastId, table);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m133305j(@NotNull Table table) {
        table.getClass();
        m133282u().mo95916a(table);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: k */
    public final kud m133306k() {
        kud kudVar;
        kud kudVar2 = this.delayedLegacyInAppDao;
        if (kudVar2 != null) {
            return kudVar2;
        }
        synchronized (this) {
            kudVar = this.delayedLegacyInAppDao;
            if (kudVar == null) {
                lud ludVar = new lud(this.dbHelper, this.logger, Table.DELAYED_LEGACY_INAPPS, null, 8, null);
                this.delayedLegacyInAppDao = ludVar;
                kudVar = ludVar;
            }
        }
        return kudVar;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final synchronized boolean m133307l(@Nullable String messageId, @Nullable String userId) {
        return (messageId == null || userId == null) ? false : m133283v().mo212991c(messageId, userId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    public final synchronized boolean m133308m(@Nullable List<String> messageIDs, @Nullable String userId) {
        boolean zMo212990b;
        zMo212990b = false;
        if (messageIDs != null && userId != null) {
            List<String> listFilterNotNull = CollectionsKt.filterNotNull(messageIDs);
            if (!listFilterNotNull.isEmpty()) {
                zMo212990b = m133283v().mo212990b(listFilterNotNull, userId);
            }
        }
        return zMo212990b;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m133309n(@NotNull String id) {
        id.getClass();
        return m133273C().mo191882e(id);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: o */
    public final synchronized gxb0 m133310o(int batchSize) {
        return m133282u().mo95919d(batchSize);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: p */
    public final synchronized gxb0 m133311p(@NotNull Table table, int limit) {
        table.getClass();
        return m133282u().mo95920e(table, limit);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final synchronized String[] m133312q() {
        return m133273C().mo191881d();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final synchronized JSONObject m133313r(@Nullable String accountId, @Nullable String deviceId) {
        return (accountId == null || deviceId == null) ? null : m133275E().mo185792a(accountId, deviceId);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final synchronized Map<String, JSONObject> m133314s(@Nullable String accountId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return accountId != null ? m133275E().mo185794c(accountId) : MapsKt.emptyMap();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: t */
    public final synchronized Set<String> m133315t(@NotNull String userId, long staleCutoffSeconds) {
        userId.getClass();
        return m133283v().mo212992d(userId, staleCutoffSeconds);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized long m133316x() {
        return m133274D().mo169718b();
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: y */
    public final synchronized ArrayList<ow3> m133317y(@NotNull String userId) {
        userId.getClass();
        return m133283v().mo212995g(userId);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: z */
    public final synchronized Set<String> m133318z(@Nullable String userId) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return userId != null ? m133284w().mo100196a(userId) : SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: l.h1c$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/h1c$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "", "a", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Ljava/lang/String;", "", "DB_UPDATE_ERROR", "J", "DB_OUT_OF_MEMORY_ERROR", "NOT_ENOUGH_SPACE_LOG", "Ljava/lang/String;", "DATABASE_NAME", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m133319a(@NotNull CleverTapInstanceConfig config) {
            config.getClass();
            if (config.isDefaultInstance()) {
                return "clevertap";
            }
            return "clevertap_" + config.getAccountId();
        }

        private Companion() {
        }
    }

    public /* synthetic */ h1c(Context context, String str, String str2, axl axlVar, j1c j1cVar, oa5 oa5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, axlVar, j1cVar, (i & 32) != 0 ? oa5.f145660a : oa5Var);
    }
}
