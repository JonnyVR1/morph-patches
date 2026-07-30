package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import l.ark;
import l.cwf0;
import l.n3m;
import l.o6j0;
import l.pib;
import l.qib0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006)"}, d2 = {"Ll/w5j0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "user", "Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;", "quickChatCardInfo", "", "quickchatPage", "", "k", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;Lcom/p1/mobile/putong/core/data/QuickChatCardInfo;Ljava/lang/String;)V", "m", "", "isEmoji", "isMaleQuickChatRing", "quickchatSkinType", "a", "(ZZLjava/lang/String;Ljava/lang/String;)V", "e", "(Z)V", "h", "(ZLjava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "g", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "f", "Lcom/p1/mobile/putong/data/User;", "pushUser", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/RelationshipStatus;", "relationshipStatus", "d", "(Lcom/p1/mobile/putong/data/RelationshipStatus;)Ljava/lang/String;", "Ll/cwf0;", "Ll/cwf0;", "pageBroadcastHelper", "b", "pageMatchHelper", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w5j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageBroadcastHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageMatchHelper;

    /* JADX INFO: renamed from: l.w5j0$a */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/w5j0$a", "Ll/n3m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1280a implements n3m {
        public boolean disableAutoPV() {
            return false;
        }

        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: l.w5j0$b */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/w5j0$b", "Ll/n3m;", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1281b implements n3m {
        public boolean disableAutoPV() {
            return false;
        }

        public String pageId() {
            return "p_quickchat_adpopup";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23901b(w5j0 w5j0Var, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "default";
        }
        if ((i & 8) != 0) {
            str2 = "message";
        }
        w5j0Var.m23904a(z, z2, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23902i(w5j0 w5j0Var, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "default";
        }
        if ((i & 4) != 0) {
            str2 = "message";
        }
        w5j0Var.m23910h(z, str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23903l(w5j0 w5j0Var, OnlineMatchPushUser onlineMatchPushUser, QuickChatCardInfo quickChatCardInfo, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            quickChatCardInfo = null;
        }
        if ((i & 4) != 0) {
            str = "message";
        }
        w5j0Var.m23912k(onlineMatchPushUser, quickChatCardInfo, str);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m23904a(boolean isEmoji, boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        o6j0.c("e_quickchat_adpopup_trynow", "p_quickchat_adpopup", new o6j0.a[]{o6j0.a.f("remainingtimes", a.b0()), o6j0.a.i("is_emoji", isEmoji), o6j0.a.f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), o6j0.a.h("quickchat_skin_type", quickchatSkinType), o6j0.a.h("quickchat_page", quickchatPage)});
    }

    /* JADX INFO: renamed from: c */
    public final String m23905c(User pushUser) {
        if (pushUser == null) {
            return "nothing";
        }
        if (TextUtils.isEmpty(pushUser.description)) {
            return !vwb.J(pushUser.profile.tags) ? "label" : "nothing";
        }
        return "sign";
    }

    /* JADX INFO: renamed from: d */
    public final String m23906d(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, "superliked")) {
            return "superlike";
        }
        return TEnum.equals(relationshipStatus, "liked") ? "like" : "normal";
    }

    /* JADX INFO: renamed from: e */
    public final void m23907e(boolean isEmoji) {
        o6j0.c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", new o6j0.a[]{o6j0.a.i("is_emoji", isEmoji)});
    }

    /* JADX INFO: renamed from: f */
    public final void m23908f() {
        cwf0 cwf0Var = this.pageMatchHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
        }
        cwf0 cwf0Var2 = this.pageMatchHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23909g(@NotNull OnlineMatchMatchUser user) {
        user.getClass();
        cwf0 cwf0Var = new cwf0(new C1280a());
        this.pageMatchHelper = cwf0Var;
        cwf0Var.o(o6j0.b(new o6j0.a[]{o6j0.a.h("otheruserID", user.userId), o6j0.a.h("time", String.valueOf(a.K() / 1000)), o6j0.a.h("quickchat_user_stats", ark.I0())}));
        cwf0 cwf0Var2 = this.pageMatchHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.i();
        }
        cwf0 cwf0Var3 = this.pageMatchHelper;
        if (cwf0Var3 != null) {
            cwf0Var3.l();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m23910h(boolean isMaleQuickChatRing, @NotNull String quickchatSkinType, @NotNull String quickchatPage) {
        quickchatSkinType.getClass();
        quickchatPage.getClass();
        o6j0.c("e_quickchat_adpopup_reject", "p_quickchat_adpopup", new o6j0.a[]{o6j0.a.f("quickchat_male_ring", isMaleQuickChatRing ? 1 : 0), o6j0.a.h("quickchat_skin_type", quickchatSkinType), o6j0.a.h("quickchat_page", quickchatPage)});
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public final void m23911j(@Nullable OnlineMatchPushUser onlineMatchPushUser) {
        m23903l(this, onlineMatchPushUser, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @JvmOverloads
    /* JADX INFO: renamed from: k */
    public final void m23912k(@Nullable OnlineMatchPushUser user, @Nullable QuickChatCardInfo quickChatCardInfo, @NotNull String quickchatPage) {
        String str;
        String str2;
        RelationshipStatus relationshipStatus;
        String strM23905c;
        String str3;
        String str4;
        quickchatPage.getClass();
        this.pageBroadcastHelper = new cwf0(new C1281b());
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
        String strM23906d = m23906d(relationshipStatus);
        if (NullChecker.a(user)) {
            user.getClass();
            strM23905c = m23905c(user.user);
        } else if (NullChecker.a(quickChatCardInfo)) {
            pib pibVar = CoreModule.c.e0;
            quickChatCardInfo.getClass();
            strM23905c = m23905c(pibVar.Pa(quickChatCardInfo.userID));
        } else {
            strM23905c = "nothing";
        }
        boolean z = user != null ? user.isBell : false;
        int i = user != null ? user.isMaleQuickChatRing : 0;
        dtb0 dtb0Var = dtb0.INSTANCE;
        if (user != null && (str3 = user.fitReason) != null) {
            str6 = str3;
        } else if (quickChatCardInfo != null) {
            str6 = quickChatCardInfo.fitReason;
        }
        String strM13474b = dtb0Var.m13474b(str6);
        cwf0 cwf0Var = this.pageBroadcastHelper;
        if (cwf0Var != null) {
            cwf0Var.o(o6j0.b(new o6j0.a[]{o6j0.a.h("aduserID", str), o6j0.a.h("adshowfrom", "listpage"), o6j0.a.h("adtime", String.valueOf(qib0.u0() / 1000)), o6j0.a.h("quickchat_adpop_id", str2), o6j0.a.h("radio_type", str5), o6j0.a.h("user_action", strM23906d), o6j0.a.h("which_content", strM23905c), o6j0.a.i("is_quickchatbell", z), o6j0.a.f("quickchat_male_ring", i), o6j0.a.h("quickchat_skin_type", strM13474b), o6j0.a.h("quickchat_page", quickchatPage)}));
        }
        cwf0 cwf0Var2 = this.pageBroadcastHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.i();
        }
        cwf0 cwf0Var3 = this.pageBroadcastHelper;
        if (cwf0Var3 != null) {
            cwf0Var3.l();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m23913m() {
        cwf0 cwf0Var = this.pageBroadcastHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
        }
        cwf0 cwf0Var2 = this.pageBroadcastHelper;
        if (cwf0Var2 != null) {
            cwf0Var2.e();
        }
    }
}
