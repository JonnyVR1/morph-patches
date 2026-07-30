package com.p000p1.mobile.putong.core.p004ui.toppicks;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.toppicks.C0355a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.d;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ark;
import l.d30;
import l.e30;
import l.g30;
import l.jq2;
import l.mb90;
import l.mkd0;
import l.q860;
import l.vwb;
import l.w2b0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.kxi0;
import p006l.rxg0;
import p006l.swh0;
import p006l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.toppicks.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010'¨\u0006E"}, d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ll/jq2;", "Ll/kxi0;", "Lcom/p1/mobile/putong/core/ui/toppicks/b$a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "liked", "superLiked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "t0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "", "r0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "destroy", "()V", "Z", "a0", "u0", "clickedUser", "superLike", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "hadSentSuperLiked", "likedUser", "y0", "(ZLcom/p1/mobile/putong/data/User;Z)Z", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "c", "(Z)V", "n", "()Z", "from", "D0", "(Ljava/lang/String;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "s0", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "b", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "A0", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;)V", "clickedItem", "Lcom/p1/mobile/putong/data/User;", "k", "()Lcom/p1/mobile/putong/data/User;", "C0", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C0355a extends jq2<kxi0> implements C0356b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TopPicksTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public TopPicksItemView clickedItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public User clickedUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355a(@NotNull TopPicksTabFrag topPicksTabFrag) {
        super(topPicksTabFrag);
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m9347e0(C0355a c0355a, q860 q860Var) {
        if (q860Var != null) {
            ((kxi0) ((jq2) c0355a).viewModel).m18326B(q860Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m9348f0(C0355a c0355a, int i, Intent intent, c cVar) {
        if (NullChecker.a(c0355a.clickedItem) && NullChecker.a(c0355a.m9369k())) {
            User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) c0355a.m9369k()).id);
            if (NullChecker.a(userM21393Pa)) {
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                boolean z2 = i == SwipeDirection.UP.getValue();
                String stringExtra = ((Media) userM21393Pa.pictures.get(0)).url;
                if (intent != null) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                }
                String str = stringExtra;
                str.getClass();
                c0355a.m9361t0(z, z2, true, intExtra, str, userM21393Pa);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m9349g0(C0355a c0355a) {
        Act act = c0355a.act();
        act.getClass();
        act.startActivityForResult(MediaPickerAct.d2(c0355a.act(), 1, false, false, true, (String) null), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m9350h0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m9351i0(d dVar, C0355a c0355a, boolean z, User user) {
        dVar.p();
        c0355a.m9360r0(true, true, z, dVar, user);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m9352j0(d dVar, C0355a c0355a, Throwable th) {
        HomeStatisticsHelper.A(dVar, th);
        c0355a.frag.m9340X4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m9353k0(C0355a c0355a, UserPrivilege userPrivilege) {
        c0355a.m9372u0();
        ((kxi0) ((jq2) c0355a).viewModel).m18349z();
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m9354l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m9355m0(d dVar, boolean z, C0355a c0355a, boolean z2, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.B(dVar, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                c0355a.frag.m9340X4().notifyDataSetChanged();
                if (z) {
                    rxg0.m23407L(c0355a.act());
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && Intrinsics.d(relationship.status.get(0), MatchFrom.get("superLikedEach"))) {
            i = 13;
        } else if (relationship.status.size() != 0 && Intrinsics.d(relationship.status.get(0), MatchFrom.get("superLiked"))) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && Intrinsics.d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
            i = 1;
        }
        Act act = c0355a.act();
        if (act != null) {
            act.startActivityWithCustomTransition(MatchAct.e2(c0355a.act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9356n0(C0355a c0355a, NetworkInfo networkInfo) {
        if (CoreModule.f1534c.f3581O1.m15258j3()) {
            c0355a.m9372u0();
        } else if (CoreModule.f1534c.f3581O1.m15267s3() == 0) {
            CoreModule.f1534c.f3581O1.m15265q3().subscribe(mkd0.B());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m9357o0(C0355a c0355a, Bundle bundle) {
        ((kxi0) ((jq2) c0355a).viewModel).m18342r();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m9358p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m9359q0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m9360r0(final boolean liked, final boolean superLiked, boolean fromButton, final d swipeScData, User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(((DbObject) m9369k()).id).pageId(swipeScData.h()).build();
        duringCreated(CoreModule.f1534c.f3652m0.m3003Y7(liked, superLiked, null, user, null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.H(new e30() { // from class: l.wwi0
            public final void call(Object obj) {
                C0355a.m9355m0(swipeScData, superLiked, this, liked, (Relationship) obj);
            }
        }, new e30() { // from class: l.xwi0
            public final void call(Object obj) {
                C0355a.m9352j0(swipeScData, this, (Throwable) obj);
            }
        }));
        m9375z0(m9369k());
    }

    /* JADX INFO: renamed from: t0 */
    private final boolean m9361t0(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, String picUrl, final User user) {
        final d dVarB = HomeStatisticsHelper.e(this.frag.pageId(), fromButton, liked, superLiked, user).z(picIndex).B(picUrl);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (!NullChecker.a(userM21490p9)) {
            return true;
        }
        dVarB.h = HomeStatisticsHelper.ScActionFrom.INTL_PICKS;
        Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
        CounterLikeLimit counterLikeLimit = counterM3414o3 != null ? counterM3414o3.likeLimit : null;
        if (userM21490p9.isJailed()) {
            CoreModule.m1851K().startJailedDialogLikeAct();
            this.frag.m9340X4().notifyDataSetChanged();
            HomeStatisticsHelper.B(dVarB, "failJailedUser");
            return false;
        }
        if (ark.F0(act(), new Runnable() { // from class: l.uwi0
            @Override // java.lang.Runnable
            public final void run() {
                C0355a.m9349g0(this.f23783a);
            }
        })) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            return false;
        }
        if (userM21490p9.isNameFake()) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            ark.T0(act());
            return false;
        }
        if (!liked && !xma.m27355L3()) {
            return false;
        }
        if (!xma.m27355L3()) {
            m9364D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return false;
        }
        if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            com.p1.mobile.putong.core.ui.purchase.c.D0(act(), "e_intl_picks_user_card", Privilege.vip_unlimited_likes, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4088, (Object) null);
            return false;
        }
        if (!superLiked || swh0.m24327x0() > 0) {
            if (superLiked && swh0.m24244G1(act(), new d30() { // from class: l.ywi0
                public final void call() {
                    C0355a.m9351i0(dVarB, this, fromButton, user);
                }
            })) {
                return false;
            }
            m9360r0(liked, superLiked, fromButton, dVarB, user);
            return true;
        }
        if (xma.m27355L3()) {
            com.p1.mobile.putong.core.ui.purchase.c.H1(act(), w2b0.c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, (g30) null, 12, (Object) null);
            HomeStatisticsHelper.B(dVarB, "failExhaustSuperlike");
        } else {
            m9364D0("p_intl_picks_main_page,e_superlikeButton,click");
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m9362A0(@Nullable TopPicksItemView topPicksItemView) {
        this.clickedItem = topPicksItemView;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m9363C0(@NotNull User user) {
        user.getClass();
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m9364D0(@NotNull String from) {
        from.getClass();
        ((kxi0) ((jq2) this).viewModel).m18331G(from);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.toppicks.C0356b.a
    /* JADX INFO: renamed from: E */
    public void mo9365E(@NotNull User clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m9363C0(clickedUser);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) clickedUser).id);
        if (liked) {
            if (m9374y0(false, clickedUser, false)) {
                return;
            }
            this.frag.m9340X4().notifyDataSetChanged();
        } else {
            String str = userM21393Pa.picture(0).cover().profileMiddle().formatted();
            str.getClass();
            if (m9361t0(false, false, false, 0, str, userM21393Pa)) {
                return;
            }
            this.frag.m9340X4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m9366Z() {
        m9372u0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9367a0() {
        super.a0();
        creates(new e30() { // from class: l.cxi0
            public final void call(Object obj) {
                C0355a.m9357o0(this.f9904a, (Bundle) obj);
            }
        });
        rx.c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.dxi0
            public final Object invoke(Object obj) {
                return C0355a.m9350h0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.exi0
            public final Object call(Object obj) {
                return C0355a.m9354l0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fxi0
            public final void call(Object obj) {
                C0355a.m9356n0(this.f12963a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3581O1.m15268t3()).subscribe(mkd0.G(new e30() { // from class: l.gxi0
            public final void call(Object obj) {
                C0355a.m9347e0(this.f13563a, (q860) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).subscribe(mkd0.G(new e30() { // from class: l.vwi0
            public final void call(Object obj) {
                C0355a.m9353k0(this.f24507a, (UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.toppicks.C0356b.a
    /* JADX INFO: renamed from: c */
    public void mo9368c(boolean liked) {
        this.frag.m9340X4().notifyDataSetChanged();
    }

    public void destroy() {
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final User m9369k() {
        User user = this.clickedUser;
        if (user != null) {
            return user;
        }
        Intrinsics.r("clickedUser");
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.toppicks.C0356b.a
    /* JADX INFO: renamed from: n */
    public boolean mo9370n() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final TopPicksTabFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9372u0() {
        CoreModule.f1534c.f3544C0.m27420u4();
        CoreModule.f1534c.f3581O1.m15265q3();
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m9373x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 24) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.zwi0
            public final Object invoke(Object obj) {
                return C0355a.m9359q0((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.axi0
            public final Object call(Object obj) {
                return C0355a.m9358p0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bxi0
            public final void call(Object obj) {
                C0355a.m9348f0(this.f9202a, resultCode, data, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m9374y0(boolean hadSentSuperLiked, @NotNull User likedUser, boolean fromButton) {
        likedUser.getClass();
        m9363C0(likedUser);
        String str = ((Media) likedUser.picture(0).cover()).url;
        str.getClass();
        return m9361t0(true, hadSentSuperLiked, fromButton, 0, str, likedUser);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m9375z0(@NotNull User user) {
        user.getClass();
        if (this.frag.m9340X4().m23456N(user)) {
            CoreModule.f1534c.f3581O1.m15269u3(((DbObject) user).id);
            if (this.frag.m9340X4().m23458P() <= 0) {
                ((kxi0) ((jq2) this).viewModel).m18347x(false, this.frag.m9340X4().m23458P() <= 0);
                ((kxi0) ((jq2) this).viewModel).m18330F(false);
            }
        }
        this.frag.m9340X4().notifyDataSetChanged();
    }
}
