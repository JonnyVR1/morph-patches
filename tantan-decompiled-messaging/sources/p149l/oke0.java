package p149l;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\rB'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR$\u0010!\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b \u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*¨\u0006-"}, m87232d2 = {"Ll/oke0;", "", "", "sessionStartTime", "sessionLastEventTime", "Ljava/util/UUID;", "sessionId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "", "h", "()V", "m", "a", "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "b", "e", "k", "(Ljava/lang/Long;)V", "c", "Ljava/util/UUID;", Constants.INAPP_DATA_TAG, "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", "", "<set-?>", "I", "()I", "interruptionCount", RXScreenCaptureService.KEY_INDEX, "diskRestoreTime", "Ll/wlf0;", "f", "Ll/wlf0;", "g", "()Ll/wlf0;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/wlf0;)V", "sourceApplicationInfo", "()J", "sessionLength", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class oke0 {

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
    public wlf0 sourceApplicationInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ oke0(Long l2, Long l3, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            uuid.getClass();
        }
        this(l2, l3, uuid);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Long m164842b() {
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
    public final long m164846f() {
        Long l2;
        if (this.sessionStartTime != null && (l2 = this.sessionLastEventTime) != null) {
            if (l2 != null) {
                return l2.longValue() - this.sessionStartTime.longValue();
            }
            qkq0.m175383a("Required value was null.");
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final wlf0 getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    /* JADX INFO: renamed from: h */
    public final void m164848h() {
        this.interruptionCount++;
    }

    /* JADX INFO: renamed from: i */
    public final void m164849i(@Nullable Long l2) {
        this.diskRestoreTime = l2;
    }

    /* JADX INFO: renamed from: j */
    public final void m164850j(@NotNull UUID uuid) {
        uuid.getClass();
        this.sessionId = uuid;
    }

    /* JADX INFO: renamed from: k */
    public final void m164851k(@Nullable Long l2) {
        this.sessionLastEventTime = l2;
    }

    /* JADX INFO: renamed from: l */
    public final void m164852l(@Nullable wlf0 wlf0Var) {
        this.sourceApplicationInfo = wlf0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m164853m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l()).edit();
        Long l2 = this.sessionStartTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2 != null ? l2.longValue() : 0L);
        Long l3 = this.sessionLastEventTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l3 != null ? l3.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
        editorEdit.apply();
        wlf0 wlf0Var = this.sourceApplicationInfo;
        if (wlf0Var == null || wlf0Var == null) {
            return;
        }
        wlf0Var.m203808a();
    }

    /* JADX INFO: renamed from: l.oke0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m87232d2 = {"Ll/oke0$a;", "", "<init>", "()V", "Ll/oke0;", "b", "()Ll/oke0;", "", "a", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m164854a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            wlf0.INSTANCE.m203809a();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final oke0 m164855b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            oke0 oke0Var = new oke0(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            oke0Var.interruptionCount = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            oke0Var.m164852l(wlf0.INSTANCE.m203810b());
            oke0Var.m164849i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            uuidFromString.getClass();
            oke0Var.m164850j(uuidFromString);
            return oke0Var;
        }

        public Companion() {
        }
    }

    @JvmOverloads
    public oke0(@Nullable Long l2, @Nullable Long l3, @NotNull UUID uuid) {
        uuid.getClass();
        this.sessionStartTime = l2;
        this.sessionLastEventTime = l3;
        this.sessionId = uuid;
    }
}
