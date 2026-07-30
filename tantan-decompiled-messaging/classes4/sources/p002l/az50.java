package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.da;
import l.emr;
import l.gr9;
import l.hpd0;
import l.lac0;
import l.uqd0;
import l.vwb;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/az50;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class az50 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static vse0 f7930a;

    /* JADX INFO: renamed from: b */
    public static long f7931b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f7932c = "";

    /* JADX INFO: renamed from: l.az50$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0018J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0003J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0010J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0010J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001e\u00104\u001a\u0004\u0018\u0001038B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Ll/az50$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "userId", "from", "", "type", "", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;I)V", "", "m", "()Z", "", "time", "n", "(J)V", "g", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "text", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "isRead", "o", "(Z)V", "r", "conVersionId", "b", "c", "j", "l", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "k", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "id", "i", "(Ljava/lang/String;)Z", "currentTopOutLikeCardId", "Ljava/lang/String;", "d", "setCurrentTopOutLikeCardId", "Ll/vse0;", "shareDataManager", "Ll/vse0;", "h", "()Ll/vse0;", "LeastClickTime", "J", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m10120a(@Nullable Act act, @NotNull String userId, @Nullable String from, int type) {
            userId.getClass();
            if (act != null && System.currentTimeMillis() - az50.f7931b > 300) {
                az50.f7931b = System.currentTimeMillis();
                act.startActivityWithCustomTransition(CoreModule.P().a().n8(act, vwb.f0(new String[]{userId}), type, new ArrayList(), from), CoreModule.P().a().hg(act));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m10121b(@NotNull String conVersionId) {
            conVersionId.getClass();
            CoreModule.c.T1.s3(conVersionId);
        }

        /* JADX INFO: renamed from: c */
        public final void m10122c() {
            CoreModule.c.T1.o3();
            CoreModule.c.T1.G3((SeeExposedUser) null);
            m10136q("");
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final String m10123d() {
            return az50.f7932c;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m10124e() {
            Object obj = new hpd0("core_receive_like_local_message_unread" + CoreModule.H().userId(), Boolean.FALSE).get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m10125f(@NotNull String userId) {
            userId.getClass();
            Object obj = new uqd0("core_receive_like_local_text" + userId, "").get();
            obj.getClass();
            return (String) obj;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m10126g() {
            uqd0 localReceiveLikeUserId;
            String str;
            vse0 vse0VarM10127h = m10127h();
            return (vse0VarM10127h == null || (localReceiveLikeUserId = vse0VarM10127h.getLocalReceiveLikeUserId()) == null || (str = (String) localReceiveLikeUserId.get()) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: h */
        public final vse0 m10127h() {
            if (az50.f7930a == null) {
                az50.f7930a = new vse0();
            }
            return az50.f7930a;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m10128i(@NotNull String id) {
            id.getClass();
            return gr9.Companion.d() && TextUtils.equals(id, m10123d());
        }

        /* JADX INFO: renamed from: j */
        public final boolean m10129j() {
            return (lac0.Companion.b() && da.Companion.k()) ? false : true;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m10130k(@NotNull CoreSuggested.UserInfo otherInfo) {
            otherInfo.getClass();
            emr emrVar = emr.INSTANCE;
            String str = otherInfo.id;
            str.getClass();
            return emrVar.f(str);
        }

        /* JADX INFO: renamed from: l */
        public final boolean m10131l() {
            return RemoteConfig.x().s("vas_enable_member_exclusive_liked_me_tag");
        }

        /* JADX INFO: renamed from: m */
        public final boolean m10132m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public final void m10133n(long time) {
            zpd0 leastLikedTime;
            vse0 vse0VarM10127h = m10127h();
            if (vse0VarM10127h == null || (leastLikedTime = vse0VarM10127h.getLeastLikedTime()) == null) {
                return;
            }
            leastLikedTime.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: o */
        public final void m10134o(boolean isRead) {
            new hpd0("core_receive_like_local_message_unread" + CoreModule.H().userId(), Boolean.FALSE).put(Boolean.valueOf(isRead));
        }

        /* JADX INFO: renamed from: p */
        public final void m10135p(@NotNull String text, @NotNull String userId) {
            text.getClass();
            userId.getClass();
            new uqd0("core_receive_like_local_text" + userId, "").put(text);
        }

        /* JADX INFO: renamed from: q */
        public final void m10136q(@NotNull String userId) {
            uqd0 localReceiveLikeUserId;
            userId.getClass();
            vse0 vse0VarM10127h = m10127h();
            if (vse0VarM10127h == null || (localReceiveLikeUserId = vse0VarM10127h.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            localReceiveLikeUserId.put(userId);
        }

        /* JADX INFO: renamed from: r */
        public final boolean m10137r() {
            return false;
        }

        public Companion() {
        }
    }
}
