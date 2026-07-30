package com.p051p1.mobile.putong.core.p058ui.toppicks;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.toppicks.C9082a;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.a5i0;
import p153l.abb0;
import p153l.ar2;
import p153l.joa;
import p153l.jyb;
import p153l.o6j0;
import p153l.psd0;
import p153l.qcj;
import p153l.qj90;
import p153l.qtk;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.z5h0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.toppicks.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010'¨\u0006E"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ll/ar2;", "Ll/o6j0;", "Lcom/p1/mobile/putong/core/ui/toppicks/b$a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "t0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "", "r0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "destroy", "()V", "Z", "a0", "u0", "clickedUser", "superLike", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "hadSentSuperLiked", "likedUser", "y0", "(ZLcom/p1/mobile/putong/data/User;Z)Z", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "c", "(Z)V", "n", "()Z", "from", "D0", "(Ljava/lang/String;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "s0", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "b", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "A0", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;)V", "clickedItem", "Lcom/p1/mobile/putong/data/User;", "k", "()Lcom/p1/mobile/putong/data/User;", "C0", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C9082a extends ar2<o6j0> implements C9083b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TopPicksTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public TopPicksItemView clickedItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public User clickedUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9082a(@NotNull TopPicksTabFrag topPicksTabFrag) {
        super(topPicksTabFrag);
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m57125e0(C9082a c9082a, vg60 vg60Var) {
        if (vg60Var != null) {
            ((o6j0) c9082a.viewModel).m166238B(vg60Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m57126f0(C9082a c9082a, int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(c9082a.clickedItem) && NullChecker.m82486a(c9082a.m57145k())) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(c9082a.m57145k().f56859id);
            if (NullChecker.m82486a(userM116503Pa)) {
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                boolean z2 = i == SwipeDirection.UP.getValue();
                String stringExtra = userM116503Pa.pictures.get(0).url;
                if (intent != null) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                }
                String str = stringExtra;
                str.getClass();
                c9082a.m57139t0(z, z2, true, intExtra, str, userM116503Pa);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m57127g0(C9082a c9082a) {
        Act act = c9082a.act();
        act.getClass();
        act.startActivityForResult(MediaPickerAct.m48966e2(c9082a.act(), 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m57128h0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m57129i0(C8145d c8145d, C9082a c9082a, boolean z, User user) {
        c8145d.m39484p();
        c9082a.m57138r0(true, true, z, c8145d, user);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m57130j0(C8145d c8145d, C9082a c9082a, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
        c9082a.frag.m57121X4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m57131k0(C9082a c9082a, UserPrivilege userPrivilege) {
        c9082a.m57148u0();
        ((o6j0) c9082a.viewModel).m166259z();
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m57132l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m57133m0(C8145d c8145d, boolean z, C9082a c9082a, boolean z2, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                c9082a.frag.m57121X4().notifyDataSetChanged();
                if (z) {
                    z5h0.m218665L(c9082a.act());
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLikedEach))) {
            i = 13;
        } else if (relationship.status.size() != 0 && Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLiked))) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && Intrinsics.m88377d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
            i = 1;
        }
        Act act = c9082a.act();
        if (act != null) {
            act.startActivityWithCustomTransition(MatchAct.m48746g2(c9082a.act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m57134n0(C9082a c9082a, NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20334O1.m185311j3()) {
            c9082a.m57148u0();
        } else if (CoreModule.f18264c.f20334O1.m185320s3() == 0) {
            CoreModule.f18264c.f20334O1.m185318q3().subscribe(psd0.m173591B());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m57135o0(C9082a c9082a, Bundle bundle) {
        ((o6j0) c9082a.viewModel).m166252r();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m57136p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m57137q0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m57138r0(final boolean liked, final boolean superLiked, boolean fromButton, final C8145d swipeScData, User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f23721h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(m57145k().f56859id).pageId(swipeScData.m39476h()).build();
        duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(liked, superLiked, null, user, null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173597H(new y20() { // from class: l.a6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57133m0(swipeScData, superLiked, this, liked, (Relationship) obj);
            }
        }, new y20() { // from class: l.b6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57130j0(swipeScData, this, (Throwable) obj);
            }
        }));
        m57151z0(m57145k());
    }

    /* JADX INFO: renamed from: t0 */
    private final boolean m57139t0(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, String picUrl, final User user) {
        final C8145d c8145dM39464B = HomeStatisticsHelper.m37702e(this.frag.pageId(), fromButton, liked, superLiked, user).m39494z(picIndex).m39464B(picUrl);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9)) {
            return true;
        }
        c8145dM39464B.f23721h = HomeStatisticsHelper.ScActionFrom.INTL_PICKS;
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 != null ? counterM32487o3.likeLimit : null;
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            this.frag.m57121X4().notifyDataSetChanged();
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
            return false;
        }
        if (qtk.m177971F0(act(), new Runnable() { // from class: l.y5j0
            @Override // java.lang.Runnable
            public final void run() {
                C9082a.m57127g0(this.f197565a);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            qtk.m177999T0(act());
            return false;
        }
        if (!liked && !joa.m146361M3()) {
            return false;
        }
        if (!joa.m146361M3()) {
            m57142D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return false;
        }
        if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54567D0(act(), "e_intl_picks_user_card", Privilege.vip_unlimited_likes, null, null, 0, null, null, null, null, false, false, 4088, null);
            return false;
        }
        if (!superLiked || a5i0.m96181x0() > 0) {
            if (superLiked && a5i0.m96098G1(act(), new x20() { // from class: l.c6j0
                @Override // p153l.x20
                public final void call() {
                    C9082a.m57129i0(c8145dM39464B, this, fromButton, user);
                }
            })) {
                return false;
            }
            m57138r0(liked, superLiked, fromButton, c8145dM39464B, user);
            return true;
        }
        if (joa.m146361M3()) {
            C8927c.m54580H1(act(), abb0.m96736c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failExhaustSuperlike");
        } else {
            m57142D0("p_intl_picks_main_page,e_superlikeButton,click");
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m57140A0(@Nullable TopPicksItemView topPicksItemView) {
        this.clickedItem = topPicksItemView;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m57141C0(@NotNull User user) {
        user.getClass();
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m57142D0(@NotNull String from) {
        from.getClass();
        ((o6j0) this.viewModel).m166242G(from);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.toppicks.C9083b.a
    /* JADX INFO: renamed from: E */
    public void mo57143E(@NotNull User clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m57141C0(clickedUser);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(clickedUser.f56859id);
        if (liked) {
            if (m57150y0(false, clickedUser, false)) {
                return;
            }
            this.frag.m57121X4().notifyDataSetChanged();
        } else {
            String str = userM116503Pa.picture(0).cover().profileMiddle().formatted();
            str.getClass();
            if (m57139t0(false, false, false, 0, str, userM116503Pa)) {
                return;
            }
            this.frag.m57121X4().notifyDataSetChanged();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        m57148u0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57135o0(this.f102464a, (Bundle) obj);
            }
        });
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.h6j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9082a.m57128h0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.i6j0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9082a.m57132l0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.j6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57134n0(this.f118566a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20334O1.m185321t3()).subscribe(psd0.m173596G(new y20() { // from class: l.k6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57125e0(this.f124185a, (vg60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).subscribe(psd0.m173596G(new y20() { // from class: l.z5j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57131k0(this.f203064a, (UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.toppicks.C9083b.a
    /* JADX INFO: renamed from: c */
    public void mo57144c(boolean liked) {
        this.frag.m57121X4().notifyDataSetChanged();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final User m57145k() {
        User user = this.clickedUser;
        if (user != null) {
            return user;
        }
        Intrinsics.m88391r("clickedUser");
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.toppicks.C9083b.a
    /* JADX INFO: renamed from: n */
    public boolean mo57146n() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final TopPicksTabFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m57148u0() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20334O1.m185318q3();
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m57149x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 24) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.d6j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9082a.m57137q0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.e6j0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9082a.m57136p0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.f6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                C9082a.m57126f0(this.f97406a, resultCode, data, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m57150y0(boolean hadSentSuperLiked, @NotNull User likedUser, boolean fromButton) {
        likedUser.getClass();
        m57141C0(likedUser);
        String str = likedUser.picture(0).cover().url;
        str.getClass();
        return m57139t0(true, hadSentSuperLiked, fromButton, 0, str, likedUser);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m57151z0(@NotNull User user) {
        user.getClass();
        if (this.frag.m57121X4().m200073N(user)) {
            CoreModule.f18264c.f20334O1.m185322u3(user.f56859id);
            if (this.frag.m57121X4().m200075P() <= 0) {
                ((o6j0) this.viewModel).m166257x(false, this.frag.m57121X4().m200075P() <= 0);
                ((o6j0) this.viewModel).m166241F(false);
            }
        }
        this.frag.m57121X4().notifyDataSetChanged();
    }
}
