package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.PicksTagType;
import com.p000p1.mobile.putong.core.data.PicksUser;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.d;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.dac0;
import l.e30;
import l.f5y;
import l.g30;
import l.j760;
import l.mkd0;
import l.rxg0;
import l.sja;
import l.swh0;
import l.ura;
import l.vwb;
import l.w2b0;
import l.xma;
import l.zar;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/kg70;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class kg70 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.kg70$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0085\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ll/kg70$a;", "", "<init>", "()V", "", "liked", "superLiked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "Lcom/p1/mobile/android/app/Frag;", "frag", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "from", "Ll/dac0;", "adapter", "Ll/e30;", "showDialog", "Ll/d30;", "afterSwipe", "f", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Frag;Lcom/p1/mobile/putong/core/data/PicksUser;Ljava/lang/String;Ll/dac0;Ll/e30;Ll/d30;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "Lcom/p1/mobile/android/app/Act;", "act", "", "e", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;Ll/dac0;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/PicksUser;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m7589a(d dVar, boolean z, User user, String str, Act act, dac0 dac0Var, String str2, PicksUser picksUser) {
            dVar.p();
            Companion companion = kg70.INSTANCE;
            act.getClass();
            companion.m7593e(true, true, z, dVar, user, str, act, dac0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: b */
        public static void m7590b(d dVar, dac0 dac0Var, Throwable th) {
            HomeStatisticsHelper.A(dVar, th);
            dac0Var.notifyDataSetChanged();
            if (sja.r3() > 0) {
                CoreModule.c.C0.u4();
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m7591c(boolean z, d dVar, User user, String str, Act act, dac0 dac0Var, String str2, PicksUser picksUser) {
            swh0.p0().U0();
            Companion companion = kg70.INSTANCE;
            dVar.getClass();
            act.getClass();
            companion.m7593e(true, true, z, dVar, user, str, act, dac0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: d */
        public static void m7592d(d dVar, boolean z, Act act, boolean z2, dac0 dac0Var, String str, boolean z3, User user, String str2, Relationship relationship) {
            relationship.getClass();
            HomeStatisticsHelper.B(dVar, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && Intrinsics.d(relationship.status.get(0), MatchFrom.get("superLikedEach"))) {
                    i = 13;
                } else if (relationship.status.size() != 0 && Intrinsics.d(relationship.status.get(0), MatchFrom.get("superLiked"))) {
                    i = z ? 12 : 11;
                } else if (relationship.status.size() == 0 || !Intrinsics.d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
                    i = 0;
                }
                act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
            } else if (z2) {
                dac0Var.notifyDataSetChanged();
                if (z) {
                    if (!TextUtils.isEmpty(str)) {
                        zar.i(act);
                    } else if (z3) {
                        PicksHelper.Companion.c(act, user, true);
                        CoreModule.c.C0.u4();
                    } else {
                        rxg0.L(act);
                    }
                } else if (z3) {
                    PicksHelper.Companion.c(act, user, false);
                    CoreModule.c.C0.u4();
                }
            }
            if (ura.e().d().t() && z3) {
                CoreModule.c.m0.d9();
            }
            if (Intrinsics.d(str2, "from_meet")) {
                if (!z2) {
                    f5y.a aVar = f5y.Companion;
                    String str3 = ((DbObject) user).id;
                    str3.getClass();
                    aVar.i(str3);
                    return;
                }
                f5y.a aVar2 = f5y.Companion;
                String str4 = ((DbObject) user).id;
                str4.getClass();
                RelationshipStatus relationshipStatus = relationship.state;
                relationshipStatus.getClass();
                aVar2.l(str4, relationshipStatus);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m7593e(final boolean liked, final boolean superLiked, boolean fromButton, final d swipeScData, final User user, final String letter, final Act act, final dac0<Object> adapter, final String from, PicksUser clickedUser) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(clickedUser.f130id).pageId(swipeScData.h()).build();
            final boolean z = !xma.G3() && sja.r3() > 0;
            act.duringCreated(CoreModule.c.m0.Y7(liked, superLiked, (Map) null, user, letter, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, clickedUser.picksTracker)).subscribe(mkd0.H(new e30() { // from class: l.ig70
                public final void call(Object obj) {
                    kg70.Companion.m7592d(swipeScData, superLiked, act, liked, adapter, letter, z, user, from, (Relationship) obj);
                }
            }, new e30() { // from class: l.jg70
                public final void call(Object obj) {
                    kg70.Companion.m7590b(swipeScData, adapter, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m7594f(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, @NotNull String picUrl, @NotNull final User user, @Nullable final String letter, @NotNull Frag frag, @NotNull final PicksUser clickedUser, @Nullable final String from, @NotNull final dac0<Object> adapter, @NotNull e30<String> showDialog, @NotNull d30 afterSwipe) {
            final d dVar;
            picUrl.getClass();
            user.getClass();
            frag.getClass();
            clickedUser.getClass();
            adapter.getClass();
            showDialog.getClass();
            afterSwipe.getClass();
            final Act act = frag.act();
            Bundle arguments = frag.getArguments();
            zvf0.w("e_picks_card", frag.pageId(), new j760[]{vwb.Y("picks_card_type", TEnum.equals(clickedUser.picksTagType, PicksTagType.masking) ? "grayed" : "clear"), vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("direction", liked ? "like" : "dislike")});
            final d dVarB = HomeStatisticsHelper.e(act.pageId(), fromButton, liked, superLiked, user).z(picIndex).B(picUrl);
            User userP9 = CoreModule.c.e0.p9();
            dVarB.h = HomeStatisticsHelper.ScActionFrom.PICKS;
            Counter counterO3 = CoreModule.c.o3();
            CounterLikeLimit counterLikeLimit = counterO3 != null ? counterO3.likeLimit : null;
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                adapter.notifyDataSetChanged();
                HomeStatisticsHelper.B(dVarB, "failJailedUser");
                return false;
            }
            if (userP9.isNameFake()) {
                HomeStatisticsHelper.B(dVarB, "failFakeUser");
                ark.m5556T0(act);
                return false;
            }
            if (TEnum.equals(clickedUser.picksTagType, PicksTagType.masking)) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (!liked && !xma.G3()) {
                return false;
            }
            if (!xma.G3() && sja.r3() <= 0) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                c.D0(act, "p_home,likelimit", Privilege.vip_unlimited_likes, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4088, (Object) null);
                return false;
            }
            if (superLiked && !TextUtils.isEmpty(letter) && !xma.D3() && swh0.G() && swh0.p0().e1()) {
                swh0.B1(act, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.gg70
                    public final void call() {
                        kg70.Companion.m7591c(fromButton, dVarB, user, letter, act, adapter, from, clickedUser);
                    }
                }, (d30) null);
                return false;
            }
            if (!superLiked || !TextUtils.isEmpty(letter) || swh0.x0() > 0) {
                if (superLiked && TextUtils.isEmpty(letter)) {
                    dVar = dVarB;
                    if (swh0.G1(act, new d30() { // from class: l.hg70
                        public final void call() {
                            kg70.Companion.m7589a(dVar, fromButton, user, letter, act, adapter, from, clickedUser);
                        }
                    })) {
                        act = act;
                        return false;
                    }
                    act = act;
                } else {
                    dVar = dVarB;
                }
                m7593e(liked, superLiked, fromButton, dVar, user, letter, act, adapter, from, clickedUser);
                afterSwipe.call();
                return true;
            }
            if (xma.e4()) {
                if (!xma.G3() && sja.r3() <= 0) {
                    showDialog.call(arguments != null ? arguments.getString("swipeFrom", "e_picks_card_superlike") : null);
                } else if (mb90.m8138c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                    c.H1(act, w2b0.c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, (g30) null, 12, (Object) null);
                } else {
                    c.D0(act, "e_picks_card_superlike", Privilege.vip_super_like, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4088, (Object) null);
                }
            } else if (xma.G3() || sja.r3() > 0) {
                c.H1(act, w2b0.c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, (g30) null, 12, (Object) null);
                HomeStatisticsHelper.B(dVarB, "failExhaustSuperlike");
            } else {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
            }
            return false;
        }

        public Companion() {
        }
    }
}
