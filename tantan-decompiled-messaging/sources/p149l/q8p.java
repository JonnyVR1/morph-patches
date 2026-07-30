package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/q8p;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q8p {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static bbp f153203a;

    /* JADX INFO: renamed from: b */
    public static boolean f153204b;

    /* JADX INFO: renamed from: c */
    public static long f153205c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f153206d = "";

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m173425i() {
        return INSTANCE.m173436k();
    }

    /* JADX INFO: renamed from: l.q8p$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u0003J!\u0010(\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0007¢\u0006\u0004\b/\u0010\u0012J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u0003R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u001fR\"\u00106\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u000fR\u001e\u0010;\u001a\u0004\u0018\u00010:8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m87232d2 = {"Ll/q8p$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "userId", "from", "", "type", "", "c", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;I)V", BaseSei.f13931Y, "(Ljava/lang/String;)V", "", "p", "()Z", "", "time", "u", "(J)V", Constants.KEY_T, "o", "h", "()Ljava/lang/String;", "w", "g", "isRead", ResourceDirection.f38808v, "(Z)V", BaseSei.f13930X, "conVersionId", Constants.INAPP_DATA_TAG, "e", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "Lcom/p1/mobile/putong/data/User;", "user", "n", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;Lcom/p1/mobile/putong/data/User;)Z", "m", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "id", "j", "(Ljava/lang/String;)Z", "k", "b", "q", "isLastCardIsOutLikeCard", "Z", BLiveStormDanmakuGiftResourceType.f44444l, BLiveStormDanmakuGiftResourceType.f44446s, "currentTopOutLikeCardId", "Ljava/lang/String;", "f", "r", "Ll/bbp;", "shareDataManager", "Ll/bbp;", RXScreenCaptureService.KEY_INDEX, "()Ll/bbp;", "LeastClickTime", "J", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m173426a(String str, String str2) {
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
            if (conversationQuery != null) {
                Companion companion = q8p.INSTANCE;
                String str3 = conversationQuery.f56011id;
                str3.getClass();
                companion.m173429d(str3);
            }
            CoreModule.f17545c.f19692v2.m129983J3(str2);
        }

        /* JADX INFO: renamed from: b */
        public final void m173427b() {
            uqd0 uqd0VarM101014c;
            zpd0 zpd0VarM101012a;
            zpd0 zpd0VarM101013b;
            bbp bbpVarM173434i = m173434i();
            if (bbpVarM173434i != null && (zpd0VarM101013b = bbpVarM173434i.getLeastLikedTime()) != null) {
                zpd0VarM101013b.clear();
            }
            bbp bbpVarM173434i2 = m173434i();
            if (bbpVarM173434i2 != null && (zpd0VarM101012a = bbpVarM173434i2.getCoreHadClearData()) != null) {
                zpd0VarM101012a.clear();
            }
            bbp bbpVarM173434i3 = m173434i();
            if (bbpVarM173434i3 == null || (uqd0VarM101014c = bbpVarM173434i3.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            uqd0VarM101014c.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m173428c(@Nullable Act act, @NotNull String userId, @Nullable String from, int type) {
            userId.getClass();
            if (act != null && System.currentTimeMillis() - q8p.f153205c > 300) {
                q8p.f153205c = System.currentTimeMillis();
                act.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act, vwb.m200324f0(userId), type, new ArrayList<>(), from), CoreModule.m29935P().m94651a().mo33512hg(act));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m173429d(@NotNull String conVersionId) {
            conVersionId.getClass();
            CoreModule.f17545c.f19692v2.m129985u3(conVersionId);
        }

        /* JADX INFO: renamed from: e */
        public final void m173430e() {
            CoreModule.f17545c.f19692v2.m129984q3();
            CoreModule.f17545c.f19692v2.m129982I3(null);
            m173448w("");
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m173431f() {
            return q8p.f153206d;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m173432g() {
            Boolean bool = new hpd0("intl_core_receive_like_local_message_unread" + CoreModule.m29931H().userId(), Boolean.FALSE).get();
            bool.getClass();
            return bool.booleanValue();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final String m173433h() {
            uqd0 uqd0VarM101014c;
            String str;
            bbp bbpVarM173434i = m173434i();
            return (bbpVarM173434i == null || (uqd0VarM101014c = bbpVarM173434i.getLocalReceiveLikeUserId()) == null || (str = uqd0VarM101014c.get()) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: i */
        public final bbp m173434i() {
            if (q8p.f153203a == null) {
                q8p.f153203a = new bbp();
            }
            return q8p.f153203a;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m173435j(@NotNull String id) {
            id.getClass();
            return m173436k() && TextUtils.equals(id, m173431f());
        }

        @JvmStatic
        /* JADX INFO: renamed from: k */
        public final boolean m173436k() {
            if (IntlCountryCodeController.m28115k()) {
                return false;
            }
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            return userM169520na == null || !userM169520na.isFemale();
        }

        /* JADX INFO: renamed from: l */
        public final boolean m173437l() {
            return q8p.f153204b;
        }

        /* JADX INFO: renamed from: m */
        public final boolean m173438m(@NotNull CoreSuggested.UserInfo otherInfo) {
            otherInfo.getClass();
            return m173436k() && !CoreModule.m29932K().me_().isFemale() && !xma.m210071e4() && otherInfo.hasLikeMeSlideCardTop;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0027  */
        /* JADX INFO: renamed from: n */
        public final boolean m173439n(@Nullable CoreSuggested.UserInfo otherInfo, @Nullable User user) {
            if (otherInfo != null && user != null && m173436k() && NullChecker.m81303a(otherInfo) && otherInfo.hasLikeMeSlideCardTop) {
                if (!m173449x()) {
                    String str = otherInfo.f19472id;
                    str.getClass();
                    if (m173435j(str)) {
                        if (user.superLikedMe() && !user.letter() && m173441p()) {
                            return true;
                        }
                    }
                } else if (user.superLikedMe()) {
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: o */
        public final boolean m173440o() {
            zpd0 zpd0VarM101012a;
            Long l2;
            bbp bbpVarM173434i = m173434i();
            return mqi0.m155929D((bbpVarM173434i == null || (zpd0VarM101012a = bbpVarM173434i.getCoreHadClearData()) == null || (l2 = zpd0VarM101012a.get()) == null) ? 0L : l2.longValue());
        }

        /* JADX INFO: renamed from: p */
        public final boolean m173441p() {
            zpd0 zpd0VarM101013b;
            Long l2;
            bbp bbpVarM173434i = m173434i();
            return !mqi0.m155928C((bbpVarM173434i == null || (zpd0VarM101013b = bbpVarM173434i.getLeastLikedTime()) == null || (l2 = zpd0VarM101013b.get()) == null) ? 0L : l2.longValue(), mqi0.m155944o());
        }

        /* JADX INFO: renamed from: q */
        public final void m173442q() {
            q8p.f153203a = null;
        }

        /* JADX INFO: renamed from: r */
        public final void m173443r(@NotNull String str) {
            str.getClass();
            q8p.f153206d = str;
        }

        /* JADX INFO: renamed from: s */
        public final void m173444s(boolean z) {
            q8p.f153204b = z;
        }

        /* JADX INFO: renamed from: t */
        public final void m173445t(long time) {
            zpd0 zpd0VarM101012a;
            bbp bbpVarM173434i = m173434i();
            if (bbpVarM173434i == null || (zpd0VarM101012a = bbpVarM173434i.getCoreHadClearData()) == null) {
                return;
            }
            zpd0VarM101012a.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: u */
        public final void m173446u(long time) {
            zpd0 zpd0VarM101013b;
            bbp bbpVarM173434i = m173434i();
            if (bbpVarM173434i == null || (zpd0VarM101013b = bbpVarM173434i.getLeastLikedTime()) == null) {
                return;
            }
            zpd0VarM101013b.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: v */
        public final void m173447v(boolean isRead) {
            new hpd0("intl_core_receive_like_local_message_unread" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.valueOf(isRead));
        }

        /* JADX INFO: renamed from: w */
        public final void m173448w(@NotNull String userId) {
            uqd0 uqd0VarM101014c;
            userId.getClass();
            bbp bbpVarM173434i = m173434i();
            if (bbpVarM173434i == null || (uqd0VarM101014c = bbpVarM173434i.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            uqd0VarM101014c.put(userId);
        }

        /* JADX INFO: renamed from: x */
        public final boolean m173449x() {
            return (CoreModule.f17545c.f19639e0.m169520na() == null || CoreModule.f17545c.f19639e0.m169520na().isFemale() || !xma.m210071e4()) ? false : true;
        }

        /* JADX INFO: renamed from: y */
        public final void m173450y(@NotNull final String userId) {
            userId.getClass();
            final String strM173433h = m173433h();
            if (Intrinsics.m87488d(strM173433h, userId)) {
                return;
            }
            e51.m114774y(new Runnable() { // from class: l.p8p
                @Override // java.lang.Runnable
                public final void run() {
                    q8p.Companion.m173426a(strM173433h, userId);
                }
            });
        }

        public Companion() {
        }
    }
}
