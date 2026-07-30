package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e51;
import l.hpd0;
import l.mqi0;
import l.uqd0;
import l.vwb;
import l.xma;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/q8p;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q8p {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static bbp f17855a;

    /* JADX INFO: renamed from: b */
    public static boolean f17856b;

    /* JADX INFO: renamed from: c */
    public static long f17857c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f17858d = "";

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m21078i() {
        return INSTANCE.m21089k();
    }

    /* JADX INFO: renamed from: l.q8p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u0003J!\u0010(\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0007¢\u0006\u0004\b/\u0010\u0012J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u0003R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u001fR\"\u00106\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u000fR\u001e\u0010;\u001a\u0004\u0018\u00010:8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Ll/q8p$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "userId", "from", "", "type", "", "c", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;I)V", "y", "(Ljava/lang/String;)V", "", "p", "()Z", "", "time", "u", "(J)V", "t", "o", "h", "()Ljava/lang/String;", "w", "g", "isRead", "v", "(Z)V", "x", "conVersionId", "d", "e", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "Lcom/p1/mobile/putong/data/User;", "user", "n", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;Lcom/p1/mobile/putong/data/User;)Z", "m", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "id", "j", "(Ljava/lang/String;)Z", "k", "b", "q", "isLastCardIsOutLikeCard", "Z", "l", "s", "currentTopOutLikeCardId", "Ljava/lang/String;", "f", "r", "Ll/bbp;", "shareDataManager", "Ll/bbp;", "i", "()Ll/bbp;", "LeastClickTime", "J", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m21079a(String str, String str2) {
            Conversation conversationQuery = CoreModule.k.m.query(str);
            if (conversationQuery != null) {
                Companion companion = q8p.INSTANCE;
                String str3 = ((DbObject) conversationQuery).id;
                str3.getClass();
                companion.m21082d(str3);
            }
            CoreModule.c.v2.J3(str2);
        }

        /* JADX INFO: renamed from: b */
        public final void m21080b() {
            uqd0 localReceiveLikeUserId;
            zpd0 coreHadClearData;
            zpd0 leastLikedTime;
            bbp bbpVarM21087i = m21087i();
            if (bbpVarM21087i != null && (leastLikedTime = bbpVarM21087i.getLeastLikedTime()) != null) {
                leastLikedTime.clear();
            }
            bbp bbpVarM21087i2 = m21087i();
            if (bbpVarM21087i2 != null && (coreHadClearData = bbpVarM21087i2.getCoreHadClearData()) != null) {
                coreHadClearData.clear();
            }
            bbp bbpVarM21087i3 = m21087i();
            if (bbpVarM21087i3 == null || (localReceiveLikeUserId = bbpVarM21087i3.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            localReceiveLikeUserId.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m21081c(@Nullable Act act, @NotNull String userId, @Nullable String from, int type) {
            userId.getClass();
            if (act != null && System.currentTimeMillis() - q8p.f17857c > 300) {
                q8p.f17857c = System.currentTimeMillis();
                act.startActivityWithCustomTransition(CoreModule.P().a().n8(act, vwb.f0(new String[]{userId}), type, new ArrayList(), from), CoreModule.P().a().hg(act));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m21082d(@NotNull String conVersionId) {
            conVersionId.getClass();
            CoreModule.c.v2.u3(conVersionId);
        }

        /* JADX INFO: renamed from: e */
        public final void m21083e() {
            CoreModule.c.v2.q3();
            CoreModule.c.v2.I3((SeeExposedUser) null);
            m21101w("");
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m21084f() {
            return q8p.f17858d;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m21085g() {
            Object obj = new hpd0("intl_core_receive_like_local_message_unread" + CoreModule.H().userId(), Boolean.FALSE).get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final String m21086h() {
            uqd0 localReceiveLikeUserId;
            String str;
            bbp bbpVarM21087i = m21087i();
            return (bbpVarM21087i == null || (localReceiveLikeUserId = bbpVarM21087i.getLocalReceiveLikeUserId()) == null || (str = (String) localReceiveLikeUserId.get()) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: i */
        public final bbp m21087i() {
            if (q8p.f17855a == null) {
                q8p.f17855a = new bbp();
            }
            return q8p.f17855a;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m21088j(@NotNull String id) {
            id.getClass();
            return m21089k() && TextUtils.equals(id, m21084f());
        }

        @JvmStatic
        /* JADX INFO: renamed from: k */
        public final boolean m21089k() {
            if (IntlCountryCodeController.k()) {
                return false;
            }
            User userNa = CoreModule.c.e0.na();
            return userNa == null || !userNa.isFemale();
        }

        /* JADX INFO: renamed from: l */
        public final boolean m21090l() {
            return q8p.f17856b;
        }

        /* JADX INFO: renamed from: m */
        public final boolean m21091m(@NotNull CoreSuggested.UserInfo otherInfo) {
            otherInfo.getClass();
            return m21089k() && !CoreModule.K().me_().isFemale() && !xma.e4() && otherInfo.hasLikeMeSlideCardTop;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0027  */
        /* JADX INFO: renamed from: n */
        public final boolean m21092n(@Nullable CoreSuggested.UserInfo otherInfo, @Nullable User user) {
            if (otherInfo != null && user != null && m21089k() && NullChecker.a(otherInfo) && otherInfo.hasLikeMeSlideCardTop) {
                if (!m21102x()) {
                    String str = otherInfo.id;
                    str.getClass();
                    if (m21088j(str)) {
                        if (user.superLikedMe() && !user.letter() && m21094p()) {
                            return true;
                        }
                    }
                } else if (user.superLikedMe()) {
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: o */
        public final boolean m21093o() {
            zpd0 coreHadClearData;
            Long l2;
            bbp bbpVarM21087i = m21087i();
            return mqi0.D((bbpVarM21087i == null || (coreHadClearData = bbpVarM21087i.getCoreHadClearData()) == null || (l2 = (Long) coreHadClearData.get()) == null) ? 0L : l2.longValue());
        }

        /* JADX INFO: renamed from: p */
        public final boolean m21094p() {
            zpd0 leastLikedTime;
            Long l2;
            bbp bbpVarM21087i = m21087i();
            return !mqi0.C((bbpVarM21087i == null || (leastLikedTime = bbpVarM21087i.getLeastLikedTime()) == null || (l2 = (Long) leastLikedTime.get()) == null) ? 0L : l2.longValue(), mqi0.o());
        }

        /* JADX INFO: renamed from: q */
        public final void m21095q() {
            q8p.f17855a = null;
        }

        /* JADX INFO: renamed from: r */
        public final void m21096r(@NotNull String str) {
            str.getClass();
            q8p.f17858d = str;
        }

        /* JADX INFO: renamed from: s */
        public final void m21097s(boolean z) {
            q8p.f17856b = z;
        }

        /* JADX INFO: renamed from: t */
        public final void m21098t(long time) {
            zpd0 coreHadClearData;
            bbp bbpVarM21087i = m21087i();
            if (bbpVarM21087i == null || (coreHadClearData = bbpVarM21087i.getCoreHadClearData()) == null) {
                return;
            }
            coreHadClearData.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: u */
        public final void m21099u(long time) {
            zpd0 leastLikedTime;
            bbp bbpVarM21087i = m21087i();
            if (bbpVarM21087i == null || (leastLikedTime = bbpVarM21087i.getLeastLikedTime()) == null) {
                return;
            }
            leastLikedTime.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: v */
        public final void m21100v(boolean isRead) {
            new hpd0("intl_core_receive_like_local_message_unread" + CoreModule.H().userId(), Boolean.FALSE).put(Boolean.valueOf(isRead));
        }

        /* JADX INFO: renamed from: w */
        public final void m21101w(@NotNull String userId) {
            uqd0 localReceiveLikeUserId;
            userId.getClass();
            bbp bbpVarM21087i = m21087i();
            if (bbpVarM21087i == null || (localReceiveLikeUserId = bbpVarM21087i.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            localReceiveLikeUserId.put(userId);
        }

        /* JADX INFO: renamed from: x */
        public final boolean m21102x() {
            return (CoreModule.c.e0.na() == null || CoreModule.c.e0.na().isFemale() || !xma.e4()) ? false : true;
        }

        /* JADX INFO: renamed from: y */
        public final void m21103y(@NotNull final String userId) {
            userId.getClass();
            final String strM21086h = m21086h();
            if (Intrinsics.d(strM21086h, userId)) {
                return;
            }
            e51.y(new Runnable() { // from class: l.p8p
                @Override // java.lang.Runnable
                public final void run() {
                    q8p.Companion.m21079a(strM21086h, userId);
                }
            });
        }

        public Companion() {
        }
    }
}
