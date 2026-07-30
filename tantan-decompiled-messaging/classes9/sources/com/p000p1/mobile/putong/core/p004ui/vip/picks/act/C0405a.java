package com.p000p1.mobile.putong.core.p004ui.vip.picks.act;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.act.C0405a;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.PicksItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Picks;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.q860;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.bh70;
import p006l.qg70;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J'\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u00100\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u00102R$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010%¨\u0006R"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ll/jq2;", "Ll/bh70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;)V", "", "liked", "superLiked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "F0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)Z", "", "destroy", "()V", "Z", "a0", "G0", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "superLike", "S", "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "hadSentSuperLiked", "likedUser", "N0", "(ZLcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;Z)Z", "O0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", "c", "(Z)V", "n", "()Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "L0", "(IILandroid/content/Intent;)Z", "from", "R0", "(Ljava/lang/String;)V", "Ll/qg70;", "E0", "()Ll/qg70;", "J0", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "D0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Act;", "A0", "()Lcom/p1/mobile/android/app/Act;", "act", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "d", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "P0", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;)V", "clickedItem", "e", "Lcom/p1/mobile/putong/core/data/PicksUser;", "C0", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "Q0", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C0405a extends jq2<bh70> implements C0406b.a {

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
    public C0405a(@NotNull PicksFrag picksFrag) {
        super(picksFrag);
        picksFrag.getClass();
        this.frag = picksFrag;
        Act act = picksFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F0 */
    private final boolean m10215F0(boolean liked, boolean superLiked, boolean fromButton, int picIndex, String picUrl, User user, String letter) {
        return CoreMemberModule.F().b().on(liked, superLiked, fromButton, picIndex, picUrl, user, letter, this.frag, m10239C0(), this.from, m10241E0(), new e30() { // from class: l.af70
            public final void call(Object obj) {
                C0405a.m10225l0(this.f8240a, (String) obj);
            }
        }, new d30() { // from class: l.lf70
            public final void call() {
                C0405a.m10230q0(this.f16385a);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static final PaymentResultWrapper m10216H0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: I0 */
    public static final PaymentResultWrapper m10217I0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m10218e0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: f0 */
    public static rx.c m10219f0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m10220g0(C0405a c0405a, Picks picks) {
        ((bh70) ((jq2) c0405a).viewModel).m12656P(picks.todayLikedCount);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m10221h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m10222i0(C0405a c0405a, NetworkInfo networkInfo) {
        if (CoreModule.f1534c.f3647k1.m23855u3()) {
            c0405a.m10242G0();
        } else if (CoreModule.f1534c.f3647k1.m23844D3() == 0) {
            CoreModule.f1534c.f3647k1.m23842A3().subscribe(mkd0.B());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static rx.c m10223j0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return rx.c.just(paymentResultWrapper);
        }
        rx.c cVarTake = CoreModule.f1534c.f3544C0.m27422x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.gf70
            public final Object invoke(Object obj) {
                return C0405a.m10216H0(paymentResultWrapper, (List) obj);
            }
        };
        return cVarTake.map(new w9j() { // from class: l.hf70
            public final Object call(Object obj) {
                return C0405a.m10217I0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static void m10224k0(C0405a c0405a, Bundle bundle) {
        Bundle arguments = c0405a.frag.getArguments();
        c0405a.from = arguments != null ? arguments.getString("from") : null;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m10225l0(C0405a c0405a, String str) {
        c0405a.m10249R0(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m10226m0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m10227n0(C0405a c0405a, int i, Intent intent, c cVar) {
        if (NullChecker.a(c0405a.clickedItem) && NullChecker.a(c0405a.m10239C0())) {
            User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(c0405a.m10239C0().id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = ((Media) userM21393Pa.pictures.get(0)).url;
            if (intent != null) {
                intExtra = intent.getIntExtra(CoreMemberModule.F().b().bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.F().b().ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String stringExtra2 = null;
            if (i == swipeDirection.getValue() && intent != null) {
                stringExtra2 = intent.getStringExtra(CoreMemberModule.F().b().pc());
            }
            str.getClass();
            c0405a.m10215F0(z, z2, true, i2, str, userM21393Pa, stringExtra2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m10228o0(C0405a c0405a) {
        c0405a.m10242G0();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m10229p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m10230q0(C0405a c0405a) {
        c0405a.m10246O0(c0405a.m10239C0());
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m10231r0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m10232s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m10233t0(C0405a c0405a, PaymentResultWrapper paymentResultWrapper) {
        c0405a.m10242G0();
        ((bh70) ((jq2) c0405a).viewModel).m12654M();
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m10235x0(C0405a c0405a, int i, int i2, Intent intent) {
        return c0405a.m10244L0(i, i2, intent);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m10237z0(C0405a c0405a, q860 q860Var) {
        if (q860Var != null) {
            ((bh70) ((jq2) c0405a).viewModel).m12655O(q860Var);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final PicksUser m10239C0() {
        PicksUser picksUser = this.clickedUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.r("clickedUser");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final PicksFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final qg70 m10241E0() {
        return this.frag.m10208T4();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10242G0() {
        CoreModule.f1534c.f3544C0.m27420u4();
        CoreModule.f1534c.f3647k1.m23848H3();
        CoreModule.f1534c.f3647k1.m23842A3();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m10243J0() {
        return this.frag.getIsSingleFrag();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m10244L0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f1543l.m11706a().m5392Z9()) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.if70
            public final Object invoke(Object obj) {
                return C0405a.m10218e0((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.jf70
            public final Object call(Object obj) {
                return C0405a.m10221h0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kf70
            public final void call(Object obj) {
                C0405a.m10227n0(this.f15799a, resultCode, data, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m10245N0(boolean hadSentSuperLiked, @NotNull PicksUser likedUser, @NotNull User user, boolean fromButton) {
        likedUser.getClass();
        user.getClass();
        m10248Q0(likedUser);
        String str = ((Media) user.picture(0).cover()).url;
        str.getClass();
        return m10215F0(true, hadSentSuperLiked, fromButton, 0, str, user, null);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m10246O0(@NotNull PicksUser user) {
        user.getClass();
        if (m10241E0().m22029N(user)) {
            CoreModule.f1534c.f3647k1.m23849I3(user.id);
            if (m10241E0().m22031P() <= 0) {
                ((bh70) ((jq2) this).viewModel).m12652K(false, m10241E0().m22031P() <= 0);
                ((bh70) ((jq2) this).viewModel).m12660T(false);
            }
        }
        m10241E0().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m10247P0(@Nullable PicksItemView picksItemView) {
        this.clickedItem = picksItemView;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10248Q0(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.clickedUser = picksUser;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m10249R0(@Nullable String from) {
        ((bh70) ((jq2) this).viewModel).m12661U(from);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.picks.act.C0406b.a
    /* JADX INFO: renamed from: S */
    public void mo10250S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m10248Q0(clickedUser);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(clickedUser.id);
        if (liked) {
            userM21393Pa.getClass();
            if (m10245N0(false, clickedUser, userM21393Pa, false)) {
                return;
            }
            m10241E0().notifyDataSetChanged();
            return;
        }
        String str = userM21393Pa.picture(0).cover().profileMiddle().formatted();
        str.getClass();
        if (m10215F0(false, false, false, 0, str, userM21393Pa, null)) {
            return;
        }
        m10241E0().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Z */
    public void m10251Z() {
        super.Z();
        m10242G0();
        this.act.registerOnActivityResultListener(new a.a() { // from class: l.ff70
            /* JADX INFO: renamed from: a */
            public final boolean m15348a(int i, int i2, Intent intent) {
                return C0405a.m10235x0(this.f12700a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m10252a0() {
        super.a0();
        creates(new e30() { // from class: l.mf70
            public final void call(Object obj) {
                C0405a.m10224k0(this.f16954a, (Bundle) obj);
            }
        }, new d30() { // from class: l.pf70
            public final void call() {
                C0405a.m10228o0(this.f18715a);
            }
        });
        rx.c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.qf70
            public final Object invoke(Object obj) {
                return C0405a.m10231r0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.rf70
            public final Object call(Object obj) {
                return C0405a.m10229p0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sf70
            public final void call(Object obj) {
                C0405a.m10222i0(this.f21287a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3647k1.m23845E3()).subscribe(mkd0.G(new e30() { // from class: l.tf70
            public final void call(Object obj) {
                C0405a.m10237z0(this.f22080a, (q860) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3647k1.m23853s3()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.bf70
            public final void call(Object obj) {
                C0405a.m10220g0(this.f8860a, (Picks) obj);
            }
        }));
        rx.c cVarDuringCreated = duringCreated(CoreModule.f1543l.m11711g().m6959On());
        final Function1 function2 = new Function1() { // from class: l.cf70
            public final Object invoke(Object obj) {
                return C0405a.m10232s0((PaymentResultWrapper) obj);
            }
        };
        rx.c cVarFilter = cVarDuringCreated.filter(new w9j() { // from class: l.df70
            public final Object call(Object obj) {
                return C0405a.m10226m0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.ef70
            public final Object invoke(Object obj) {
                return C0405a.m10223j0((PaymentResultWrapper) obj);
            }
        };
        cVarFilter.switchMap(new w9j() { // from class: l.nf70
            public final Object call(Object obj) {
                return C0405a.m10219f0(function3, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.of70
            public final void call(Object obj) {
                C0405a.m10233t0(this.f18216a, (PaymentResultWrapper) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.picks.act.C0406b.a
    /* JADX INFO: renamed from: c */
    public void mo10253c(boolean liked) {
        m10241E0().notifyDataSetChanged();
    }

    public void destroy() {
        CoreModule.f1534c.f3647k1.m23847G3();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.picks.act.C0406b.a
    /* JADX INFO: renamed from: n */
    public boolean mo10254n() {
        return false;
    }
}
