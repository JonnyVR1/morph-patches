package p153l;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\rB'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR$\u0010!\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b \u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*¨\u0006-"}, m88121d2 = {"Ll/tse0;", "", "", "sessionStartTime", "sessionLastEventTime", "Ljava/util/UUID;", "sessionId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "", "h", "()V", "m", "a", "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "b", "e", "k", "(Ljava/lang/Long;)V", "c", "Ljava/util/UUID;", Constants.INAPP_DATA_TAG, "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", "", "<set-?>", "I", "()I", "interruptionCount", RXScreenCaptureService.KEY_INDEX, "diskRestoreTime", "Ll/fuf0;", "f", "Ll/fuf0;", "g", "()Ll/fuf0;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/fuf0;)V", "sourceApplicationInfo", "()J", "sessionLength", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class tse0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Long sessionStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Long sessionLastEventTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public UUID sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int interruptionCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Long diskRestoreTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public fuf0 sourceApplicationInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tse0(Long l2, Long l3, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            uuid.getClass();
        }
        this(l2, l3, uuid);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Long m192589b() {
        Long l2 = this.diskRestoreTime;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    /* JADX INFO: renamed from: f */
    public final long m192593f() {
        Long l2;
        if (this.sessionStartTime != null && (l2 = this.sessionLastEventTime) != null) {
            if (l2 != null) {
                return l2.longValue() - this.sessionStartTime.longValue();
            }
            wtq0.m207906a("Required value was null.");
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final fuf0 getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    /* JADX INFO: renamed from: h */
    public final void m192595h() {
        this.interruptionCount++;
    }

    /* JADX INFO: renamed from: i */
    public final void m192596i(@Nullable Long l2) {
        this.diskRestoreTime = l2;
    }

    /* JADX INFO: renamed from: j */
    public final void m192597j(@NotNull UUID uuid) {
        uuid.getClass();
        this.sessionId = uuid;
    }

    /* JADX INFO: renamed from: k */
    public final void m192598k(@Nullable Long l2) {
        this.sessionLastEventTime = l2;
    }

    /* JADX INFO: renamed from: l */
    public final void m192599l(@Nullable fuf0 fuf0Var) {
        this.sourceApplicationInfo = fuf0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m192600m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1600c.m8101l()).edit();
        Long l2 = this.sessionStartTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2 != null ? l2.longValue() : 0L);
        Long l3 = this.sessionLastEventTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l3 != null ? l3.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
        editorEdit.apply();
        fuf0 fuf0Var = this.sourceApplicationInfo;
        if (fuf0Var == null || fuf0Var == null) {
            return;
        }
        fuf0Var.m127459a();
    }

    /* JADX INFO: renamed from: l.tse0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m88121d2 = {"Ll/tse0$a;", "", "<init>", "()V", "Ll/tse0;", "b", "()Ll/tse0;", "", "a", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m192601a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1600c.m8101l()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            fuf0.INSTANCE.m127460a();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final tse0 m192602b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1600c.m8101l());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            tse0 tse0Var = new tse0(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            tse0Var.interruptionCount = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            tse0Var.m192599l(fuf0.INSTANCE.m127461b());
            tse0Var.m192596i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            uuidFromString.getClass();
            tse0Var.m192597j(uuidFromString);
            return tse0Var;
        }

        public Companion() {
        }
    }

    @JvmOverloads
    public tse0(@Nullable Long l2, @Nullable Long l3, @NotNull UUID uuid) {
        uuid.getClass();
        this.sessionStartTime = l2;
        this.sessionLastEventTime = l3;
        this.sessionId = uuid;
    }
}
