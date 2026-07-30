package com.p046p1.mobile.putong.core.p053ui.toppicks;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.toppicks.C8919a;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ark;
import p149l.d30;
import p149l.e30;
import p149l.jq2;
import p149l.kxi0;
import p149l.mb90;
import p149l.mkd0;
import p149l.q860;
import p149l.rxg0;
import p149l.swh0;
import p149l.vwb;
import p149l.w2b0;
import p149l.w9j;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.toppicks.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ'\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010'¨\u0006E"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Ll/jq2;", "Ll/kxi0;", "Lcom/p1/mobile/putong/core/ui/toppicks/b$a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "t0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "", "r0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "destroy", "()V", "Z", "a0", "u0", "clickedUser", "superLike", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "hadSentSuperLiked", "likedUser", "y0", "(ZLcom/p1/mobile/putong/data/User;Z)Z", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "c", "(Z)V", "n", "()Z", "from", "D0", "(Ljava/lang/String;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "s0", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "b", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "A0", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;)V", "clickedItem", "Lcom/p1/mobile/putong/data/User;", "k", "()Lcom/p1/mobile/putong/data/User;", "C0", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C8919a extends jq2<kxi0> implements C8920b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TopPicksTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public TopPicksItemView clickedItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public User clickedUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8919a(@NotNull TopPicksTabFrag topPicksTabFrag) {
        super(topPicksTabFrag);
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m55942e0(C8919a c8919a, q860 q860Var) {
        if (q860Var != null) {
            ((kxi0) c8919a.viewModel).m147768B(q860Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m55943f0(C8919a c8919a, int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(c8919a.clickedItem) && NullChecker.m81303a(c8919a.m55962k())) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(c8919a.m55962k().f56011id);
            if (NullChecker.m81303a(userM169430Pa)) {
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                boolean z2 = i == SwipeDirection.UP.getValue();
                String stringExtra = userM169430Pa.pictures.get(0).url;
                if (intent != null) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                }
                String str = stringExtra;
                str.getClass();
                c8919a.m55956t0(z, z2, true, intExtra, str, userM169430Pa);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m55944g0(C8919a c8919a) {
        Act act = c8919a.act();
        act.getClass();
        act.startActivityForResult(MediaPickerAct.m47783d2(c8919a.act(), 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m55945h0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m55946i0(C7994d c7994d, C8919a c8919a, boolean z, User user) {
        c7994d.m38481p();
        c8919a.m55955r0(true, true, z, c7994d, user);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m55947j0(C7994d c7994d, C8919a c8919a, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
        c8919a.frag.m55938X4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m55948k0(C8919a c8919a, UserPrivilege userPrivilege) {
        c8919a.m55965u0();
        ((kxi0) c8919a.viewModel).m147789z();
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m55949l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m55950m0(C7994d c7994d, boolean z, C8919a c8919a, boolean z2, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                c8919a.frag.m55938X4().notifyDataSetChanged();
                if (z) {
                    rxg0.m181562L(c8919a.act());
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLikedEach))) {
            i = 13;
        } else if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLiked))) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
            i = 1;
        }
        Act act = c8919a.act();
        if (act != null) {
            act.startActivityWithCustomTransition(MatchAct.m47563e2(c8919a.act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m55951n0(C8919a c8919a, NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19592O1.m120172j3()) {
            c8919a.m55965u0();
        } else if (CoreModule.f17545c.f19592O1.m120181s3() == 0) {
            CoreModule.f17545c.f19592O1.m120179q3().subscribe(mkd0.m154950B());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m55952o0(C8919a c8919a, Bundle bundle) {
        ((kxi0) c8919a.viewModel).m147782r();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m55953p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m55954q0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m55955r0(final boolean liked, final boolean superLiked, boolean fromButton, final C7994d swipeScData, User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f22979h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(m55962k().f56011id).pageId(swipeScData.m38473h()).build();
        duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(liked, superLiked, null, user, null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.wwi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55950m0(swipeScData, superLiked, this, liked, (Relationship) obj);
            }
        }, new e30() { // from class: l.xwi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55947j0(swipeScData, this, (Throwable) obj);
            }
        }));
        m55968z0(m55962k());
    }

    /* JADX INFO: renamed from: t0 */
    private final boolean m55956t0(boolean liked, boolean superLiked, final boolean fromButton, int picIndex, String picUrl, final User user) {
        final C7994d c7994dM38461B = HomeStatisticsHelper.m36699e(this.frag.pageId(), fromButton, liked, superLiked, user).m38491z(picIndex).m38461B(picUrl);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9)) {
            return true;
        }
        c7994dM38461B.f22979h = HomeStatisticsHelper.ScActionFrom.INTL_PICKS;
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 != null ? counterM31484o3.likeLimit : null;
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            this.frag.m55938X4().notifyDataSetChanged();
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
            return false;
        }
        if (ark.m98421F0(act(), new Runnable() { // from class: l.uwi0
            @Override // java.lang.Runnable
            public final void run() {
                C8919a.m55944g0(this.f178649a);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            ark.m98449T0(act());
            return false;
        }
        if (!liked && !xma.m210047L3()) {
            return false;
        }
        if (!xma.m210047L3()) {
            m55959D0("p_intl_picks_main_page,e_intl_picks_user_card,click");
            return false;
        }
        if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53384D0(act(), "e_intl_picks_user_card", Privilege.vip_unlimited_likes, null, null, 0, null, null, null, null, false, false, 4088, null);
            return false;
        }
        if (!superLiked || swh0.m186276x0() > 0) {
            if (superLiked && swh0.m186193G1(act(), new d30() { // from class: l.ywi0
                @Override // p149l.d30
                public final void call() {
                    C8919a.m55946i0(c7994dM38461B, this, fromButton, user);
                }
            })) {
                return false;
            }
            m55955r0(liked, superLiked, fromButton, c7994dM38461B, user);
            return true;
        }
        if (xma.m210047L3()) {
            C8764c.m53397H1(act(), w2b0.m201089c("p_navigation_ilike,card_button_pull", fromButton ? 2 : 1), 0, null, 12, null);
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failExhaustSuperlike");
        } else {
            m55959D0("p_intl_picks_main_page,e_superlikeButton,click");
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m55957A0(@Nullable TopPicksItemView topPicksItemView) {
        this.clickedItem = topPicksItemView;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m55958C0(@NotNull User user) {
        user.getClass();
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m55959D0(@NotNull String from) {
        from.getClass();
        ((kxi0) this.viewModel).m147772G(from);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.toppicks.C8920b.a
    /* JADX INFO: renamed from: E */
    public void mo55960E(@NotNull User clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m55958C0(clickedUser);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(clickedUser.f56011id);
        if (liked) {
            if (m55967y0(false, clickedUser, false)) {
                return;
            }
            this.frag.m55938X4().notifyDataSetChanged();
        } else {
            String str = userM169430Pa.picture(0).cover().profileMiddle().formatted();
            str.getClass();
            if (m55956t0(false, false, false, 0, str, userM169430Pa)) {
                return;
            }
            this.frag.m55938X4().notifyDataSetChanged();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        m55965u0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.cxi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55952o0(this.f82878a, (Bundle) obj);
            }
        });
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.dxi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8919a.m55945h0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.exi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8919a.m55949l0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fxi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55951n0(this.f99766a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19592O1.m120182t3()).subscribe(mkd0.m154955G(new e30() { // from class: l.gxi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55942e0(this.f104900a, (q860) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).subscribe(mkd0.m154955G(new e30() { // from class: l.vwi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55948k0(this.f183348a, (UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.toppicks.C8920b.a
    /* JADX INFO: renamed from: c */
    public void mo55961c(boolean liked) {
        this.frag.m55938X4().notifyDataSetChanged();
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final User m55962k() {
        User user = this.clickedUser;
        if (user != null) {
            return user;
        }
        Intrinsics.m87502r("clickedUser");
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.toppicks.C8920b.a
    /* JADX INFO: renamed from: n */
    public boolean mo55963n() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final TopPicksTabFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m55965u0() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19592O1.m120179q3();
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m55966x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 24) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.zwi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8919a.m55954q0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.axi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8919a.m55953p0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bxi0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8919a.m55943f0(this.f77794a, resultCode, data, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m55967y0(boolean hadSentSuperLiked, @NotNull User likedUser, boolean fromButton) {
        likedUser.getClass();
        m55958C0(likedUser);
        String str = likedUser.picture(0).cover().url;
        str.getClass();
        return m55956t0(true, hadSentSuperLiked, fromButton, 0, str, likedUser);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m55968z0(@NotNull User user) {
        user.getClass();
        if (this.frag.m55938X4().m181608N(user)) {
            CoreModule.f17545c.f19592O1.m120183u3(user.f56011id);
            if (this.frag.m55938X4().m181610P() <= 0) {
                ((kxi0) this.viewModel).m147787x(false, this.frag.m55938X4().m181610P() <= 0);
                ((kxi0) this.viewModel).m147771F(false);
            }
        }
        this.frag.m55938X4().notifyDataSetChanged();
    }
}
