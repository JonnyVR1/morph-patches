package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/qap;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qap {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static bdp f156402a;

    /* JADX INFO: renamed from: b */
    public static boolean f156403b;

    /* JADX INFO: renamed from: c */
    public static long f156404c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f156405d = "";

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m175962i() {
        return INSTANCE.m175973k();
    }

    /* JADX INFO: renamed from: l.qap$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u0003J!\u0010(\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0007¢\u0006\u0004\b/\u0010\u0012J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u0003R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u001fR\"\u00106\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u000fR\u001e\u0010;\u001a\u0004\u0018\u00010:8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m88121d2 = {"Ll/qap$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "userId", "from", "", "type", "", "c", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;I)V", BaseSei.f14625Y, "(Ljava/lang/String;)V", "", "p", "()Z", "", "time", "u", "(J)V", Constants.KEY_T, "o", "h", "()Ljava/lang/String;", "w", "g", "isRead", ResourceDirection.f39656v, "(Z)V", BaseSei.f14624X, "conVersionId", Constants.INAPP_DATA_TAG, "e", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "Lcom/p1/mobile/putong/data/User;", "user", "n", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;Lcom/p1/mobile/putong/data/User;)Z", "m", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "id", "j", "(Ljava/lang/String;)Z", "k", "b", "q", "isLastCardIsOutLikeCard", "Z", BLiveStormDanmakuGiftResourceType.f45292l, BLiveStormDanmakuGiftResourceType.f45294s, "currentTopOutLikeCardId", "Ljava/lang/String;", "f", "r", "Ll/bdp;", "shareDataManager", "Ll/bdp;", RXScreenCaptureService.KEY_INDEX, "()Ll/bdp;", "LeastClickTime", "J", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m175963a(String str, String str2) {
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
            if (conversationQuery != null) {
                Companion companion = qap.INSTANCE;
                String str3 = conversationQuery.f56859id;
                str3.getClass();
                companion.m175966d(str3);
            }
            CoreModule.f18264c.f20434v2.m175895J3(str2);
        }

        /* JADX INFO: renamed from: b */
        public final void m175964b() {
            wyd0 wyd0VarM103622c;
            byd0 byd0VarM103620a;
            byd0 byd0VarM103621b;
            bdp bdpVarM175971i = m175971i();
            if (bdpVarM175971i != null && (byd0VarM103621b = bdpVarM175971i.getLeastLikedTime()) != null) {
                byd0VarM103621b.clear();
            }
            bdp bdpVarM175971i2 = m175971i();
            if (bdpVarM175971i2 != null && (byd0VarM103620a = bdpVarM175971i2.getCoreHadClearData()) != null) {
                byd0VarM103620a.clear();
            }
            bdp bdpVarM175971i3 = m175971i();
            if (bdpVarM175971i3 == null || (wyd0VarM103622c = bdpVarM175971i3.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            wyd0VarM103622c.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m175965c(@Nullable Act act, @NotNull String userId, @Nullable String from, int type) {
            userId.getClass();
            if (act != null && System.currentTimeMillis() - qap.f156404c > 300) {
                qap.f156404c = System.currentTimeMillis();
                act.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act, jyb.m147507f0(userId), type, new ArrayList<>(), from), CoreModule.m30933P().m143405a().mo34515hg(act));
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m175966d(@NotNull String conVersionId) {
            conVersionId.getClass();
            CoreModule.f18264c.f20434v2.m175897u3(conVersionId);
        }

        /* JADX INFO: renamed from: e */
        public final void m175967e() {
            CoreModule.f18264c.f20434v2.m175896q3();
            CoreModule.f18264c.f20434v2.m175894I3(null);
            m175985w("");
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m175968f() {
            return qap.f156405d;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m175969g() {
            Boolean bool = new jxd0("intl_core_receive_like_local_message_unread" + CoreModule.m30929H().userId(), Boolean.FALSE).get();
            bool.getClass();
            return bool.booleanValue();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final String m175970h() {
            wyd0 wyd0VarM103622c;
            String str;
            bdp bdpVarM175971i = m175971i();
            return (bdpVarM175971i == null || (wyd0VarM103622c = bdpVarM175971i.getLocalReceiveLikeUserId()) == null || (str = wyd0VarM103622c.get()) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: i */
        public final bdp m175971i() {
            if (qap.f156402a == null) {
                qap.f156402a = new bdp();
            }
            return qap.f156402a;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m175972j(@NotNull String id) {
            id.getClass();
            return m175973k() && TextUtils.equals(id, m175968f());
        }

        @JvmStatic
        /* JADX INFO: renamed from: k */
        public final boolean m175973k() {
            if (IntlCountryCodeController.m29114k()) {
                return false;
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            return userM116593na == null || !userM116593na.isFemale();
        }

        /* JADX INFO: renamed from: l */
        public final boolean m175974l() {
            return qap.f156403b;
        }

        /* JADX INFO: renamed from: m */
        public final boolean m175975m(@NotNull CoreSuggested.UserInfo otherInfo) {
            otherInfo.getClass();
            return m175973k() && !CoreModule.m30930K().me_().isFemale() && !joa.m146386f4() && otherInfo.hasLikeMeSlideCardTop;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0027  */
        /* JADX INFO: renamed from: n */
        public final boolean m175976n(@Nullable CoreSuggested.UserInfo otherInfo, @Nullable User user) {
            if (otherInfo != null && user != null && m175973k() && NullChecker.m82486a(otherInfo) && otherInfo.hasLikeMeSlideCardTop) {
                if (!m175986x()) {
                    String str = otherInfo.f20214id;
                    str.getClass();
                    if (m175972j(str)) {
                        if (user.superLikedMe() && !user.letter() && m175978p()) {
                            return true;
                        }
                    }
                } else if (user.superLikedMe()) {
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: o */
        public final boolean m175977o() {
            byd0 byd0VarM103620a;
            Long l2;
            bdp bdpVarM175971i = m175971i();
            return pzi0.m174439D((bdpVarM175971i == null || (byd0VarM103620a = bdpVarM175971i.getCoreHadClearData()) == null || (l2 = byd0VarM103620a.get()) == null) ? 0L : l2.longValue());
        }

        /* JADX INFO: renamed from: p */
        public final boolean m175978p() {
            byd0 byd0VarM103621b;
            Long l2;
            bdp bdpVarM175971i = m175971i();
            return !pzi0.m174438C((bdpVarM175971i == null || (byd0VarM103621b = bdpVarM175971i.getLeastLikedTime()) == null || (l2 = byd0VarM103621b.get()) == null) ? 0L : l2.longValue(), pzi0.m174454o());
        }

        /* JADX INFO: renamed from: q */
        public final void m175979q() {
            qap.f156402a = null;
        }

        /* JADX INFO: renamed from: r */
        public final void m175980r(@NotNull String str) {
            str.getClass();
            qap.f156405d = str;
        }

        /* JADX INFO: renamed from: s */
        public final void m175981s(boolean z) {
            qap.f156403b = z;
        }

        /* JADX INFO: renamed from: t */
        public final void m175982t(long time) {
            byd0 byd0VarM103620a;
            bdp bdpVarM175971i = m175971i();
            if (bdpVarM175971i == null || (byd0VarM103620a = bdpVarM175971i.getCoreHadClearData()) == null) {
                return;
            }
            byd0VarM103620a.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: u */
        public final void m175983u(long time) {
            byd0 byd0VarM103621b;
            bdp bdpVarM175971i = m175971i();
            if (bdpVarM175971i == null || (byd0VarM103621b = bdpVarM175971i.getLeastLikedTime()) == null) {
                return;
            }
            byd0VarM103621b.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: v */
        public final void m175984v(boolean isRead) {
            new jxd0("intl_core_receive_like_local_message_unread" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.valueOf(isRead));
        }

        /* JADX INFO: renamed from: w */
        public final void m175985w(@NotNull String userId) {
            wyd0 wyd0VarM103622c;
            userId.getClass();
            bdp bdpVarM175971i = m175971i();
            if (bdpVarM175971i == null || (wyd0VarM103622c = bdpVarM175971i.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            wyd0VarM103622c.put(userId);
        }

        /* JADX INFO: renamed from: x */
        public final boolean m175986x() {
            return (CoreModule.f18264c.f20381e0.m116593na() == null || CoreModule.f18264c.f20381e0.m116593na().isFemale() || !joa.m146386f4()) ? false : true;
        }

        /* JADX INFO: renamed from: y */
        public final void m175987y(@NotNull final String userId) {
            userId.getClass();
            final String strM175970h = m175970h();
            if (Intrinsics.m88377d(strM175970h, userId)) {
                return;
            }
            l51.m152919y(new Runnable() { // from class: l.pap
                @Override // java.lang.Runnable
                public final void run() {
                    qap.Companion.m175963a(strM175970h, userId);
                }
            });
        }

        public Companion() {
        }
    }
}
