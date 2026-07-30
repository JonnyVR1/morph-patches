package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006)"}, m88121d2 = {"Ll/afj0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "user", "Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;", "quickChatCardInfo", "", "quickchatPage", "", "k", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;Ljava/lang/String;)V", "m", "", "isEmoji", "isMaleQuickChatRing", "quickchatSkinType", "a", "(ZZLjava/lang/String;Ljava/lang/String;)V", "e", "(Z)V", "h", "(ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "g", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "f", "Lcom/p1/mobile/putong/data/User;", "pushUser", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/RelationshipStatus;", "relationshipStatus", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/RelationshipStatus;)Ljava/lang/String;", "Ll/l4g0;", "Ll/l4g0;", "pageBroadcastHelper", "b", "pageMatchHelper", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class afj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public l4g0 pageBroadcastHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public l4g0 pageMatchHelper;

    /* JADX INFO: renamed from: l.afj0$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/afj0$a", "Ll/e6m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15699a implements e6m {
        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: l.afj0$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/afj0$b", "Ll/e6m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15700b implements e6m {
        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_quickchat_adpopup";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m97341b(afj0 afj0Var, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "default";
        }
        if ((i & 8) != 0) {
            str2 = "message";
        }
        afj0Var.m97344a(z, z2, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m97342i(afj0 afj0Var, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "default";
        }
        if ((i & 4) != 0) {
            str2 = "message";
        }
        afj0Var.m97350h(z, str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m97343l(afj0 afj0Var, OnlineMatchPushUser onlineMatchPushUser, QuickChatCardInfo quickChatCardInfo, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            quickChatCardInfo = null;
        }
        if ((i & 4) != 0) {
            str = "message";
        }
        afj0Var.m97352k(onlineMatchPushUser, quickChatCardInfo, str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m97344a(boolean isEmoji, boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        sfj0.m185596c("e_quickchat_adpopup_trynow", "p_quickchat_adpopup", sfj0.C20032a.m185613f("remainingtimes", C8772a.m51429b0()), sfj0.C20032a.m185616i("is_emoji", isEmoji), sfj0.C20032a.m185613f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), sfj0.C20032a.m185615h("quickchat_skin_type", quickchatSkinType), sfj0.C20032a.m185615h("quickchat_page", quickchatPage));
    }

    /* JADX INFO: renamed from: c */
    public final String m97345c(User pushUser) {
        if (pushUser == null) {
            return "nothing";
        }
        if (TextUtils.isEmpty(pushUser.description)) {
            return !jyb.m147479J(pushUser.profile.tags) ? com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: d */
    public final String m97346d(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(relationshipStatus, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: e */
    public final void m97347e(boolean isEmoji) {
        sfj0.m185596c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", sfj0.C20032a.m185616i("is_emoji", isEmoji));
    }

    /* JADX INFO: renamed from: f */
    public final void m97348f() {
        l4g0 l4g0Var = this.pageMatchHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
        }
        l4g0 l4g0Var2 = this.pageMatchHelper;
        if (l4g0Var2 != null) {
            l4g0Var2.m152775j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m97349g(@NotNull OnlineMatchMatchUser user) {
        user.getClass();
        l4g0 l4g0Var = new l4g0(new C15699a());
        this.pageMatchHelper = l4g0Var;
        l4g0Var.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("otheruserID", user.userId), sfj0.C20032a.m185615h("time", String.valueOf(C8772a.m51410K() / 1000)), sfj0.C20032a.m185615h("quickchat_user_stats", qtk.m177977I0())));
        l4g0 l4g0Var2 = this.pageMatchHelper;
        if (l4g0Var2 != null) {
            l4g0Var2.m152774i();
        }
        l4g0 l4g0Var3 = this.pageMatchHelper;
        if (l4g0Var3 != null) {
            l4g0Var3.m152777l();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m97350h(boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        sfj0.m185596c("e_quickchat_adpopup_reject", "p_quickchat_adpopup", sfj0.C20032a.m185613f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), sfj0.C20032a.m185615h("quickchat_skin_type", quickchatSkinType), sfj0.C20032a.m185615h("quickchat_page", quickchatPage));
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public final void m97351j(@Nullable OnlineMatchPushUser onlineMatchPushUser) {
        m97343l(this, onlineMatchPushUser, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @JvmOverloads
    /* JADX INFO: renamed from: k */
    public final void m97352k(@Nullable OnlineMatchPushUser user, @Nullable QuickChatCardInfo quickChatCardInfo, @NotNull String quickchatPage) {
        String str;
        String str2;
        RelationshipStatus relationshipStatus;
        String strM97345c;
        String str3;
        String str4;
        quickchatPage.getClass();
        this.pageBroadcastHelper = new l4g0(new C15700b());
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
        String strM97346d = m97346d(relationshipStatus);
        if (NullChecker.m82486a(user)) {
            user.getClass();
            strM97345c = m97345c(user.user);
        } else if (NullChecker.m82486a(quickChatCardInfo)) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            quickChatCardInfo.getClass();
            strM97345c = m97345c(dkbVar.m116503Pa(quickChatCardInfo.userID));
        } else {
            strM97345c = "nothing";
        }
        boolean z = user != null ? user.isBell : false;
        int i = user != null ? user.isMaleQuickChatRing : 0;
        h1c0 h1c0Var = h1c0.INSTANCE;
        if (user != null && (str3 = user.fitReason) != null) {
            str6 = str3;
        } else if (quickChatCardInfo != null) {
            str6 = quickChatCardInfo.fitReason;
        }
        String strM133321b = h1c0Var.m133321b(str6);
        l4g0 l4g0Var = this.pageBroadcastHelper;
        if (l4g0Var != null) {
            l4g0Var.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("aduserID", str), sfj0.C20032a.m185615h("adshowfrom", "listpage"), sfj0.C20032a.m185615h("adtime", String.valueOf(uqb0.m197289u0() / 1000)), sfj0.C20032a.m185615h("quickchat_adpop_id", str2), sfj0.C20032a.m185615h("radio_type", str5), sfj0.C20032a.m185615h("user_action", strM97346d), sfj0.C20032a.m185615h("which_content", strM97345c), sfj0.C20032a.m185616i("is_quickchatbell", z), sfj0.C20032a.m185613f("quickchat_male_ring", i), sfj0.C20032a.m185615h("quickchat_skin_type", strM133321b), sfj0.C20032a.m185615h("quickchat_page", quickchatPage)));
        }
        l4g0 l4g0Var2 = this.pageBroadcastHelper;
        if (l4g0Var2 != null) {
            l4g0Var2.m152774i();
        }
        l4g0 l4g0Var3 = this.pageBroadcastHelper;
        if (l4g0Var3 != null) {
            l4g0Var3.m152777l();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m97353m() {
        l4g0 l4g0Var = this.pageBroadcastHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
        }
        l4g0 l4g0Var2 = this.pageBroadcastHelper;
        if (l4g0Var2 != null) {
            l4g0Var2.m152770e();
        }
    }
}
