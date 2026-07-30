package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksTagType;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/kg70;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kg70 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.kg70$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0085\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/kg70$a;", "", "<init>", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "Lcom/p1/mobile/android/app/Frag;", "frag", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "from", "Ll/dac0;", "adapter", "Ll/e30;", "showDialog", "Ll/d30;", "afterSwipe", "f", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Frag;Lcom/p1/mobile/putong/core/data/PicksUser;Ljava/lang/String;Ll/dac0;Ll/e30;Ll/d30;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;Ll/dac0;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/PicksUser;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m145880a(C7994d c7994d, boolean z, User user, String str, Act act, dac0 dac0Var, String str2, PicksUser picksUser) {
            c7994d.m38481p();
            Companion companion = kg70.INSTANCE;
            act.getClass();
            companion.m145884e(true, true, z, c7994d, user, str, act, dac0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: b */
        public static void m145881b(C7994d c7994d, dac0 dac0Var, Throwable th) {
            HomeStatisticsHelper.m36687A(c7994d, th);
            dac0Var.notifyDataSetChanged();
            if (sja.m184461r3() > 0) {
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m145882c(boolean z, C7994d c7994d, User user, String str, Act act, dac0 dac0Var, String str2, PicksUser picksUser) {
            swh0.m186255p0().m186301U0();
            Companion companion = kg70.INSTANCE;
            c7994d.getClass();
            act.getClass();
            companion.m145884e(true, true, z, c7994d, user, str, act, dac0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: d */
        public static void m145883d(C7994d c7994d, boolean z, Act act, boolean z2, dac0 dac0Var, String str, boolean z3, User user, String str2, Relationship relationship) {
            relationship.getClass();
            HomeStatisticsHelper.m36688B(c7994d, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLikedEach))) {
                    i = 13;
                } else if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLiked))) {
                    i = z ? 12 : 11;
                } else if (relationship.status.size() == 0 || !Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
                    i = 0;
                }
                act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
            } else if (z2) {
                dac0Var.notifyDataSetChanged();
                if (z) {
                    if (!TextUtils.isEmpty(str)) {
                        zar.m217750i(act);
                    } else if (z3) {
                        PicksHelper.INSTANCE.m56741c(act, user, true);
                        CoreModule.f17545c.f19555C0.m210112u4();
                    } else {
                        rxg0.m181562L(act);
                    }
                } else if (z3) {
                    PicksHelper.INSTANCE.m56741c(act, user, false);
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }
            if (ura.m195053e().m195057d().mo33922t() && z3) {
                CoreModule.f17545c.f19663m0.m31094d9();
            }
            if (Intrinsics.m87488d(str2, "from_meet")) {
                if (!z2) {
                    f5y.Companion companion = f5y.INSTANCE;
                    String str3 = user.f56011id;
                    str3.getClass();
                    companion.m119569i(str3);
                    return;
                }
                f5y.Companion companion2 = f5y.INSTANCE;
                String str4 = user.f56011id;
                str4.getClass();
                RelationshipStatus relationshipStatus = relationship.state;
                relationshipStatus.getClass();
                companion2.m119570l(str4, relationshipStatus);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m145884e(final boolean liked, final boolean superLiked, boolean fromButton, final C7994d swipeScData, final User user, final String letter, final Act act, final dac0<Object> adapter, final String from, PicksUser clickedUser) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f22979h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(clickedUser.f20468id).pageId(swipeScData.m38473h()).build();
            final boolean z = !xma.m210044G3() && sja.m184461r3() > 0;
            act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(liked, superLiked, null, user, letter, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, clickedUser.picksTracker)).subscribe(mkd0.m154956H(new e30() { // from class: l.ig70
                @Override // p149l.e30
                public final void call(Object obj) {
                    kg70.Companion.m145883d(swipeScData, superLiked, act, liked, adapter, letter, z, user, from, (Relationship) obj);
                }
            }, new e30() { // from class: l.jg70
                @Override // p149l.e30
                public final void call(Object obj) {
                    kg70.Companion.m145881b(swipeScData, adapter, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m145885f(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, @NotNull String picUrl, @NotNull final User user, @Nullable final String letter, @NotNull Frag frag, @NotNull final PicksUser clickedUser, @Nullable final String from, @NotNull final dac0<Object> adapter, @NotNull e30<String> showDialog, @NotNull d30 afterSwipe) {
            final C7994d c7994d;
            picUrl.getClass();
            user.getClass();
            frag.getClass();
            clickedUser.getClass();
            adapter.getClass();
            showDialog.getClass();
            afterSwipe.getClass();
            final Act act = frag.act();
            Bundle arguments = frag.getArguments();
            zvf0.m220401w("e_picks_card", frag.pageId(), vwb.m200311Y("picks_card_type", TEnum.equals(clickedUser.picksTagType, PicksTagType.masking) ? "grayed" : BLiveResOperation.clear), vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("direction", liked ? "like" : "dislike"));
            final C7994d c7994dM38461B = HomeStatisticsHelper.m36699e(act.pageId(), fromButton, liked, superLiked, user).m38491z(picIndex).m38461B(picUrl);
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            c7994dM38461B.f22979h = HomeStatisticsHelper.ScActionFrom.PICKS;
            Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
            CounterLikeLimit counterLikeLimit = counterM31484o3 != null ? counterM31484o3.likeLimit : null;
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                adapter.notifyDataSetChanged();
                HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
                return false;
            }
            if (userM169527p9.isNameFake()) {
                HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
                ark.m98449T0(act);
                return false;
            }
            if (TEnum.equals(clickedUser.picksTagType, PicksTagType.masking)) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (!liked && !xma.m210044G3()) {
                return false;
            }
            if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                C8764c.m53384D0(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, 0, null, null, null, null, false, false, 4088, null);
                return false;
            }
            if (superLiked && !TextUtils.isEmpty(letter) && !xma.m210041D3() && swh0.m186191G() && swh0.m186255p0().m186311e1()) {
                swh0.m186180B1(act, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.gg70
                    @Override // p149l.d30
                    public final void call() {
                        kg70.Companion.m145882c(fromButton, c7994dM38461B, user, letter, act, adapter, from, clickedUser);
                    }
                }, null);
                return false;
            }
            if (!superLiked || !TextUtils.isEmpty(letter) || swh0.m186276x0() > 0) {
                if (superLiked && TextUtils.isEmpty(letter)) {
                    c7994d = c7994dM38461B;
                    if (swh0.m186193G1(act, new d30() { // from class: l.hg70
                        @Override // p149l.d30
                        public final void call() {
                            kg70.Companion.m145880a(c7994d, fromButton, user, letter, act, adapter, from, clickedUser);
                        }
                    })) {
                        act = act;
                        return false;
                    }
                    act = act;
                } else {
                    c7994d = c7994dM38461B;
                }
                m145884e(liked, superLiked, fromButton, c7994d, user, letter, act, adapter, from, clickedUser);
                afterSwipe.call();
                return true;
            }
            if (xma.m210071e4()) {
                if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                    showDialog.call(arguments != null ? arguments.getString("swipeFrom", "e_picks_card_superlike") : null);
                } else if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                    C8764c.m53397H1(act, w2b0.m201089c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
                } else {
                    C8764c.m53384D0(act, "e_picks_card_superlike", Privilege.vip_super_like, null, null, 0, null, null, null, null, false, false, 4088, null);
                }
            } else if (xma.m210044G3() || sja.m184461r3() > 0) {
                C8764c.m53397H1(act, w2b0.m201089c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
                HomeStatisticsHelper.m36688B(c7994dM38461B, "failExhaustSuperlike");
            } else {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
            }
            return false;
        }

        public Companion() {
        }
    }
}
