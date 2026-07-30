package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006)"}, m87232d2 = {"Ll/w5j0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "user", "Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;", "quickChatCardInfo", "", "quickchatPage", "", "k", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;Ljava/lang/String;)V", "m", "", "isEmoji", "isMaleQuickChatRing", "quickchatSkinType", "a", "(ZZLjava/lang/String;Ljava/lang/String;)V", "e", "(Z)V", "h", "(ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "g", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "f", "Lcom/p1/mobile/putong/data/User;", "pushUser", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/RelationshipStatus;", "relationshipStatus", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/RelationshipStatus;)Ljava/lang/String;", "Ll/cwf0;", "Ll/cwf0;", "pageBroadcastHelper", "b", "pageMatchHelper", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w5j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageBroadcastHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageMatchHelper;

    /* JADX INFO: renamed from: l.w5j0$a */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/w5j0$a", "Ll/n3m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20804a implements n3m {
        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: l.w5j0$b */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/w5j0$b", "Ll/n3m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20805b implements n3m {
        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_quickchat_adpopup";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m201633b(w5j0 w5j0Var, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "default";
        }
        if ((i & 8) != 0) {
            str2 = "message";
        }
        w5j0Var.m201636a(z, z2, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m201634i(w5j0 w5j0Var, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "default";
        }
        if ((i & 4) != 0) {
            str2 = "message";
        }
        w5j0Var.m201642h(z, str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m201635l(w5j0 w5j0Var, OnlineMatchPushUser onlineMatchPushUser, QuickChatCardInfo quickChatCardInfo, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            quickChatCardInfo = null;
        }
        if ((i & 4) != 0) {
            str = "message";
        }
        w5j0Var.m201644k(onlineMatchPushUser, quickChatCardInfo, str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m201636a(boolean isEmoji, boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        o6j0.m162859c("e_quickchat_adpopup_trynow", "p_quickchat_adpopup", o6j0.C18854a.m162876f("remainingtimes", C8609a.m50246b0()), o6j0.C18854a.m162879i("is_emoji", isEmoji), o6j0.C18854a.m162876f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), o6j0.C18854a.m162878h("quickchat_skin_type", quickchatSkinType), o6j0.C18854a.m162878h("quickchat_page", quickchatPage));
    }

    /* JADX INFO: renamed from: c */
    public final String m201637c(User pushUser) {
        if (pushUser == null) {
            return "nothing";
        }
        if (TextUtils.isEmpty(pushUser.description)) {
            return !vwb.m200296J(pushUser.profile.tags) ? com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: d */
    public final String m201638d(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(relationshipStatus, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: e */
    public final void m201639e(boolean isEmoji) {
        o6j0.m162859c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", o6j0.C18854a.m162879i("is_emoji", isEmoji));
    }

    /* JADX INFO: renamed from: f */
    public final void m201640f() {
        cwf0 cwf0Var = this.pageMatchHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
        }
        cwf0 cwf0Var2 = this.pageMatchHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.m109034j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m201641g(@NotNull OnlineMatchMatchUser user) {
        user.getClass();
        cwf0 cwf0Var = new cwf0(new C20804a());
        this.pageMatchHelper = cwf0Var;
        cwf0Var.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("otheruserID", user.userId), o6j0.C18854a.m162878h("time", String.valueOf(C8609a.m50227K() / 1000)), o6j0.C18854a.m162878h("quickchat_user_stats", ark.m98427I0())));
        cwf0 cwf0Var2 = this.pageMatchHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.m109033i();
        }
        cwf0 cwf0Var3 = this.pageMatchHelper;
        if (cwf0Var3 != null) {
            cwf0Var3.m109036l();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m201642h(boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        o6j0.m162859c("e_quickchat_adpopup_reject", "p_quickchat_adpopup", o6j0.C18854a.m162876f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), o6j0.C18854a.m162878h("quickchat_skin_type", quickchatSkinType), o6j0.C18854a.m162878h("quickchat_page", quickchatPage));
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public final void m201643j(@Nullable OnlineMatchPushUser onlineMatchPushUser) {
        m201635l(this, onlineMatchPushUser, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @JvmOverloads
    /* JADX INFO: renamed from: k */
    public final void m201644k(@Nullable OnlineMatchPushUser user, @Nullable QuickChatCardInfo quickChatCardInfo, @NotNull String quickchatPage) {
        String str;
        String str2;
        RelationshipStatus relationshipStatus;
        String strM201637c;
        String str3;
        String str4;
        quickchatPage.getClass();
        this.pageBroadcastHelper = new cwf0(new C20805b());
        String str5 = "";
        String str6 = null;
        if (user == null || (str = user.userId) == null) {
            str = quickChatCardInfo != null ? quickChatCardInfo.userID : null;
            if (str == null) {
                str = "";
            }
        }
        if (user == null || (str2 = user.broadcastId) == null) {
            str2 = "";
        }
        if (user != null && (str4 = user.radioType) != null) {
            str5 = str4;
        }
        if (user == null || (relationshipStatus = user.rsStateReceiverToSender) == null) {
            relationshipStatus = quickChatCardInfo != null ? quickChatCardInfo.rsState : null;
        }
        String strM201638d = m201638d(relationshipStatus);
        if (NullChecker.m81303a(user)) {
            user.getClass();
            strM201637c = m201637c(user.user);
        } else if (NullChecker.m81303a(quickChatCardInfo)) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            quickChatCardInfo.getClass();
            strM201637c = m201637c(pibVar.m169430Pa(quickChatCardInfo.userID));
        } else {
            strM201637c = "nothing";
        }
        boolean z = user != null ? user.isBell : false;
        int i = user != null ? user.isMaleQuickChatRing : 0;
        dtb0 dtb0Var = dtb0.INSTANCE;
        if (user != null && (str3 = user.fitReason) != null) {
            str6 = str3;
        } else if (quickChatCardInfo != null) {
            str6 = quickChatCardInfo.fitReason;
        }
        String strM113539b = dtb0Var.m113539b(str6);
        cwf0 cwf0Var = this.pageBroadcastHelper;
        if (cwf0Var != null) {
            cwf0Var.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("aduserID", str), o6j0.C18854a.m162878h("adshowfrom", "listpage"), o6j0.C18854a.m162878h("adtime", String.valueOf(qib0.m174835u0() / 1000)), o6j0.C18854a.m162878h("quickchat_adpop_id", str2), o6j0.C18854a.m162878h("radio_type", str5), o6j0.C18854a.m162878h("user_action", strM201638d), o6j0.C18854a.m162878h("which_content", strM201637c), o6j0.C18854a.m162879i("is_quickchatbell", z), o6j0.C18854a.m162876f("quickchat_male_ring", i), o6j0.C18854a.m162878h("quickchat_skin_type", strM113539b), o6j0.C18854a.m162878h("quickchat_page", quickchatPage)));
        }
        cwf0 cwf0Var2 = this.pageBroadcastHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.m109033i();
        }
        cwf0 cwf0Var3 = this.pageBroadcastHelper;
        if (cwf0Var3 != null) {
            cwf0Var3.m109036l();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m201645m() {
        cwf0 cwf0Var = this.pageBroadcastHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
        }
        cwf0 cwf0Var2 = this.pageBroadcastHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.m109029e();
        }
    }
}
