package com.p046p1.mobile.putong.core.p053ui.vip.picks.act;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Picks;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8969a;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.bh70;
import p149l.d30;
import p149l.e30;
import p149l.j6f;
import p149l.jq2;
import p149l.mkd0;
import p149l.q860;
import p149l.qg70;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J'\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u00100\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u00102R$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010%¨\u0006R"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ll/jq2;", "Ll/bh70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;)V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "F0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)Z", "", "destroy", "()V", "Z", "a0", "G0", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "superLike", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "hadSentSuperLiked", "likedUser", "N0", "(ZLcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;Z)Z", "O0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", "c", "(Z)V", "n", "()Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "L0", "(IILandroid/content/Intent;)Z", "from", "R0", "(Ljava/lang/String;)V", "Ll/qg70;", "E0", "()Ll/qg70;", "J0", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "D0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Act;", "A0", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "P0", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;)V", "clickedItem", "e", "Lcom/p1/mobile/putong/core/data/PicksUser;", "C0", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "Q0", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C8969a extends jq2<bh70> implements C8970b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PicksFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PicksItemView clickedItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PicksUser clickedUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8969a(@NotNull PicksFrag picksFrag) {
        super(picksFrag);
        picksFrag.getClass();
        this.frag = picksFrag;
        Act act = picksFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F0 */
    private final boolean m56756F0(boolean liked, boolean superLiked, boolean fromButton, int picIndex, String picUrl, User user, String letter) {
        return CoreMemberModule.m36001F().m132651b().mo35995on(liked, superLiked, fromButton, picIndex, picUrl, user, letter, this.frag, m56780C0(), this.from, m56782E0(), new e30() { // from class: l.af70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56766l0(this.f69156a, (String) obj);
            }
        }, new d30() { // from class: l.lf70
            @Override // p149l.d30
            public final void call() {
                C8969a.m56771q0(this.f127842a);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static final PaymentResultWrapper m56757H0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: I0 */
    public static final PaymentResultWrapper m56758I0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m56759e0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22306c m56760f0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m56761g0(C8969a c8969a, Picks picks) {
        ((bh70) c8969a.viewModel).m101790P(picks.todayLikedCount);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m56762h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m56763i0(C8969a c8969a, NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19658k1.m184475u3()) {
            c8969a.m56783G0();
        } else if (CoreModule.f17545c.f19658k1.m184464D3() == 0) {
            CoreModule.f17545c.f19658k1.m184462A3().subscribe(mkd0.m154950B());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static C22306c m56764j0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22306c.just(paymentResultWrapper);
        }
        C22306c<List<UserPrivilege>> c22306cTake = CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.gf70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8969a.m56757H0(paymentResultWrapper, (List) obj);
            }
        };
        return c22306cTake.map(new w9j() { // from class: l.hf70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8969a.m56758I0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static void m56765k0(C8969a c8969a, Bundle bundle) {
        Bundle arguments = c8969a.frag.getArguments();
        c8969a.from = arguments != null ? arguments.getString("from") : null;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m56766l0(C8969a c8969a, String str) {
        c8969a.m56790R0(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m56767m0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m56768n0(C8969a c8969a, int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(c8969a.clickedItem) && NullChecker.m81303a(c8969a.m56780C0())) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(c8969a.m56780C0().f20468id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM169430Pa.pictures.get(0).url;
            if (intent != null) {
                intExtra = intent.getIntExtra(CoreMemberModule.m36001F().m132651b().mo35985bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35987ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String stringExtra2 = null;
            if (i == swipeDirection.getValue() && intent != null) {
                stringExtra2 = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35996pc());
            }
            str.getClass();
            c8969a.m56756F0(z, z2, true, i2, str, userM169430Pa, stringExtra2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m56769o0(C8969a c8969a) {
        c8969a.m56783G0();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m56770p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m56771q0(C8969a c8969a) {
        c8969a.m56787O0(c8969a.m56780C0());
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m56772r0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m56773s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m56774t0(C8969a c8969a, PaymentResultWrapper paymentResultWrapper) {
        c8969a.m56783G0();
        ((bh70) c8969a.viewModel).m101788M();
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m56776x0(C8969a c8969a, int i, int i2, Intent intent) {
        return c8969a.m56785L0(i, i2, intent);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m56778z0(C8969a c8969a, q860 q860Var) {
        if (q860Var != null) {
            ((bh70) c8969a.viewModel).m101789O(q860Var);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final PicksUser m56780C0() {
        PicksUser picksUser = this.clickedUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.m87502r("clickedUser");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final PicksFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final qg70 m56782E0() {
        return this.frag.m56749T4();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m56783G0() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19658k1.m184468H3();
        CoreModule.f17545c.f19658k1.m184462A3();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m56784J0() {
        return this.frag.getIsSingleFrag();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m56785L0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f17554l.m94651a().mo33455Z9()) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.if70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8969a.m56759e0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.jf70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8969a.m56762h0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kf70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56768n0(this.f122903a, resultCode, data, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m56786N0(boolean hadSentSuperLiked, @NotNull PicksUser likedUser, @NotNull User user, boolean fromButton) {
        likedUser.getClass();
        user.getClass();
        m56789Q0(likedUser);
        String str = user.picture(0).cover().url;
        str.getClass();
        return m56756F0(true, hadSentSuperLiked, fromButton, 0, str, user, null);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m56787O0(@NotNull PicksUser user) {
        user.getClass();
        if (m56782E0().m174393N(user)) {
            CoreModule.f17545c.f19658k1.m184469I3(user.f20468id);
            if (m56782E0().m174395P() <= 0) {
                ((bh70) this.viewModel).m101786K(false, m56782E0().m174395P() <= 0);
                ((bh70) this.viewModel).m101794T(false);
            }
        }
        m56782E0().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m56788P0(@Nullable PicksItemView picksItemView) {
        this.clickedItem = picksItemView;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m56789Q0(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.clickedUser = picksUser;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m56790R0(@Nullable String from) {
        ((bh70) this.viewModel).m101795U(from);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: S */
    public void mo56791S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m56789Q0(clickedUser);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(clickedUser.f20468id);
        if (liked) {
            userM169430Pa.getClass();
            if (m56786N0(false, clickedUser, userM169430Pa, false)) {
                return;
            }
            m56782E0().notifyDataSetChanged();
            return;
        }
        String str = userM169430Pa.picture(0).cover().profileMiddle().formatted();
        str.getClass();
        if (m56756F0(false, false, false, 0, str, userM169430Pa, null)) {
            return;
        }
        m56782E0().notifyDataSetChanged();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m56783G0();
        this.act.registerOnActivityResultListener(new C4317a.a() { // from class: l.ff70
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return C8969a.m56776x0(this.f97192a, i, i2, intent);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.mf70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56765k0(this.f133567a, (Bundle) obj);
            }
        }, new d30() { // from class: l.pf70
            @Override // p149l.d30
            public final void call() {
                C8969a.m56769o0(this.f148533a);
            }
        });
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.qf70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8969a.m56772r0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.rf70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8969a.m56770p0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sf70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56763i0(this.f164266a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19658k1.m184465E3()).subscribe(mkd0.m154955G(new e30() { // from class: l.tf70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56778z0(this.f169949a, (q860) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19658k1.m184473s3()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.bf70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56761g0(this.f75279a, (Picks) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17554l.m94656g().mo35022On());
        final Function1 function2 = new Function1() { // from class: l.cf70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8969a.m56773s0((PaymentResultWrapper) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.df70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8969a.m56767m0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.ef70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8969a.m56764j0((PaymentResultWrapper) obj);
            }
        };
        c22306cFilter.switchMap(new w9j() { // from class: l.nf70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8969a.m56760f0(function3, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.of70
            @Override // p149l.e30
            public final void call(Object obj) {
                C8969a.m56774t0(this.f143632a, (PaymentResultWrapper) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: c */
    public void mo56792c(boolean liked) {
        m56782E0().notifyDataSetChanged();
    }

    @Override // p149l.q0m
    public void destroy() {
        CoreModule.f17545c.f19658k1.m184467G3();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: n */
    public boolean mo56793n() {
        return false;
    }
}
