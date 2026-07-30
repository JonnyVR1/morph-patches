package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksTagType;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/qo70;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qo70 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.qo70$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0085\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/qo70$a;", "", "<init>", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "Lcom/p1/mobile/android/app/Frag;", "frag", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "from", "Ll/jic0;", "adapter", "Ll/y20;", "showDialog", "Ll/x20;", "afterSwipe", "f", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Frag;Lcom/p1/mobile/putong/core/data/PicksUser;Ljava/lang/String;Ll/jic0;Ll/y20;Ll/x20;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;Ll/jic0;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/PicksUser;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m177287a(C8145d c8145d, boolean z, User user, String str, Act act, jic0 jic0Var, String str2, PicksUser picksUser) {
            c8145d.m39484p();
            Companion companion = qo70.INSTANCE;
            act.getClass();
            companion.m177291e(true, true, z, c8145d, user, str, act, jic0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: b */
        public static void m177288b(C8145d c8145d, jic0 jic0Var, Throwable th) {
            HomeStatisticsHelper.m37690A(c8145d, th);
            jic0Var.notifyDataSetChanged();
            if (ela.m121122r3() > 0) {
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m177289c(boolean z, C8145d c8145d, User user, String str, Act act, jic0 jic0Var, String str2, PicksUser picksUser) {
            a5i0.m96160p0().m96206U0();
            Companion companion = qo70.INSTANCE;
            c8145d.getClass();
            act.getClass();
            companion.m177291e(true, true, z, c8145d, user, str, act, jic0Var, str2, picksUser);
        }

        /* JADX INFO: renamed from: d */
        public static void m177290d(C8145d c8145d, boolean z, Act act, boolean z2, jic0 jic0Var, String str, boolean z3, User user, String str2, Relationship relationship) {
            relationship.getClass();
            HomeStatisticsHelper.m37691B(c8145d, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLikedEach))) {
                    i = 13;
                } else if (relationship.status.size() != 0 && Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLiked))) {
                    i = z ? 12 : 11;
                } else if (relationship.status.size() == 0 || !Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
                    i = 0;
                }
                act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
            } else if (z2) {
                jic0Var.notifyDataSetChanged();
                if (z) {
                    if (!TextUtils.isEmpty(str)) {
                        bdr.m103631i(act);
                    } else if (z3) {
                        PicksHelper.INSTANCE.m57924c(act, user, true);
                        CoreModule.f18264c.f20297C0.m146425v4();
                    } else {
                        z5h0.m218665L(act);
                    }
                } else if (z3) {
                    PicksHelper.INSTANCE.m57924c(act, user, false);
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }
            if (gta.m132210e().m132214d().mo34925t() && z3) {
                CoreModule.f18264c.f20405m0.m32097d9();
            }
            if (Intrinsics.m88377d(str2, "from_meet")) {
                if (!z2) {
                    cey.Companion companion = cey.INSTANCE;
                    String str3 = user.f56859id;
                    str3.getClass();
                    companion.m109499i(str3);
                    return;
                }
                cey.Companion companion2 = cey.INSTANCE;
                String str4 = user.f56859id;
                str4.getClass();
                RelationshipStatus relationshipStatus = relationship.state;
                relationshipStatus.getClass();
                companion2.m109500l(str4, relationshipStatus);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m177291e(final boolean liked, final boolean superLiked, boolean fromButton, final C8145d swipeScData, final User user, final String letter, final Act act, final jic0<Object> adapter, final String from, PicksUser clickedUser) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f23721h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(clickedUser.f21210id).pageId(swipeScData.m39476h()).build();
            final boolean z = !joa.m146358H3() && ela.m121122r3() > 0;
            act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(liked, superLiked, null, user, letter, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, clickedUser.picksTracker)).subscribe(psd0.m173597H(new y20() { // from class: l.oo70
                @Override // p153l.y20
                public final void call(Object obj) {
                    qo70.Companion.m177290d(swipeScData, superLiked, act, liked, adapter, letter, z, user, from, (Relationship) obj);
                }
            }, new y20() { // from class: l.po70
                @Override // p153l.y20
                public final void call(Object obj) {
                    qo70.Companion.m177288b(swipeScData, adapter, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m177292f(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, @NotNull String picUrl, @NotNull final User user, @Nullable final String letter, @NotNull Frag frag, @NotNull final PicksUser clickedUser, @Nullable final String from, @NotNull final jic0<Object> adapter, @NotNull y20<String> showDialog, @NotNull x20 afterSwipe) {
            final C8145d c8145d;
            picUrl.getClass();
            user.getClass();
            frag.getClass();
            clickedUser.getClass();
            adapter.getClass();
            showDialog.getClass();
            afterSwipe.getClass();
            final Act act = frag.act();
            Bundle arguments = frag.getArguments();
            i4g0.m138525w("e_picks_card", frag.pageId(), jyb.m147494Y("picks_card_type", TEnum.equals(clickedUser.picksTagType, PicksTagType.masking) ? "grayed" : BLiveResOperation.clear), jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("direction", liked ? "like" : "dislike"));
            final C8145d c8145dM39464B = HomeStatisticsHelper.m37702e(act.pageId(), fromButton, liked, superLiked, user).m39494z(picIndex).m39464B(picUrl);
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            c8145dM39464B.f23721h = HomeStatisticsHelper.ScActionFrom.PICKS;
            Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
            CounterLikeLimit counterLikeLimit = counterM32487o3 != null ? counterM32487o3.likeLimit : null;
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                adapter.notifyDataSetChanged();
                HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
                return false;
            }
            if (userM116600p9.isNameFake()) {
                HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
                qtk.m177999T0(act);
                return false;
            }
            if (TEnum.equals(clickedUser.picksTagType, PicksTagType.masking)) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (!liked && !joa.m146358H3()) {
                return false;
            }
            if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
                return false;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                C8927c.m54567D0(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, 0, null, null, null, null, false, false, 4088, null);
                return false;
            }
            if (superLiked && !TextUtils.isEmpty(letter) && !joa.m146355E3() && a5i0.m96096G() && a5i0.m96160p0().m96216e1()) {
                a5i0.m96085B1(act, PurchaseType.TYPE_GET_LETTER, new x20() { // from class: l.mo70
                    @Override // p153l.x20
                    public final void call() {
                        qo70.Companion.m177289c(fromButton, c8145dM39464B, user, letter, act, adapter, from, clickedUser);
                    }
                }, null);
                return false;
            }
            if (!superLiked || !TextUtils.isEmpty(letter) || a5i0.m96181x0() > 0) {
                if (superLiked && TextUtils.isEmpty(letter)) {
                    c8145d = c8145dM39464B;
                    if (a5i0.m96098G1(act, new x20() { // from class: l.no70
                        @Override // p153l.x20
                        public final void call() {
                            qo70.Companion.m177287a(c8145d, fromButton, user, letter, act, adapter, from, clickedUser);
                        }
                    })) {
                        act = act;
                        return false;
                    }
                    act = act;
                } else {
                    c8145d = c8145dM39464B;
                }
                m177291e(liked, superLiked, fromButton, c8145d, user, letter, act, adapter, from, clickedUser);
                afterSwipe.call();
                return true;
            }
            if (joa.m146386f4()) {
                if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                    showDialog.call(arguments != null ? arguments.getString("swipeFrom", "e_picks_card_superlike") : null);
                } else if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                    C8927c.m54580H1(act, abb0.m96736c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
                } else {
                    C8927c.m54567D0(act, "e_picks_card_superlike", Privilege.vip_super_like, null, null, 0, null, null, null, null, false, false, 4088, null);
                }
            } else if (joa.m146358H3() || ela.m121122r3() > 0) {
                C8927c.m54580H1(act, abb0.m96736c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
                HomeStatisticsHelper.m37691B(c8145dM39464B, "failExhaustSuperlike");
            } else {
                showDialog.call(arguments != null ? arguments.getString("swipeFrom", "picks_view_card") : null);
            }
            return false;
        }

        public Companion() {
        }
    }
}
