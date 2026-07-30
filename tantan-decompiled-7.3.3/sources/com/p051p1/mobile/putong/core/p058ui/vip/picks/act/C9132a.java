package com.p051p1.mobile.putong.core.p058ui.vip.picks.act;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Picks;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9132a;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.User;
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
import p137rx.C22421c;
import p153l.ar2;
import p153l.hp70;
import p153l.p7f;
import p153l.psd0;
import p153l.qcj;
import p153l.vg60;
import p153l.wo70;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J'\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u00100\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u00102R$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010%¨\u0006R"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ll/ar2;", "Ll/hp70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;)V", "", "liked", MatchFrom.superLiked, "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "letter", "F0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)Z", "", "destroy", "()V", "Z", "a0", "G0", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "superLike", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "hadSentSuperLiked", "likedUser", "N0", "(ZLcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;Z)Z", "O0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", "c", "(Z)V", "n", "()Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "L0", "(IILandroid/content/Intent;)Z", "from", "R0", "(Ljava/lang/String;)V", "Ll/wo70;", "E0", "()Ll/wo70;", "J0", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "D0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Act;", "A0", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "getClickedItem", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "P0", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;)V", "clickedItem", "e", "Lcom/p1/mobile/putong/core/data/PicksUser;", "C0", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "Q0", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C9132a extends ar2<hp70> implements C9133b.a {

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
    public C9132a(@NotNull PicksFrag picksFrag) {
        super(picksFrag);
        picksFrag.getClass();
        this.frag = picksFrag;
        Act act = picksFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F0 */
    private final boolean m57939F0(boolean liked, boolean superLiked, boolean fromButton, int picIndex, String picUrl, User user, String letter) {
        return CoreMemberModule.m37004F().m187693b().mo36998on(liked, superLiked, fromButton, picIndex, picUrl, user, letter, this.frag, m57963C0(), this.from, m57965E0(), new y20() { // from class: l.gn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57949l0(this.f105065a, (String) obj);
            }
        }, new x20() { // from class: l.rn70
            @Override // p153l.x20
            public final void call() {
                C9132a.m57954q0(this.f163955a);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static final PaymentResultWrapper m57940H0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: I0 */
    public static final PaymentResultWrapper m57941I0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m57942e0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22421c m57943f0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m57944g0(C9132a c9132a, Picks picks) {
        ((hp70) c9132a.viewModel).m136506P(picks.todayLikedCount);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m57945h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m57946i0(C9132a c9132a, NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20400k1.m121136u3()) {
            c9132a.m57966G0();
        } else if (CoreModule.f18264c.f20400k1.m121125D3() == 0) {
            CoreModule.f18264c.f20400k1.m121123A3().subscribe(psd0.m173591B());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static C22421c m57947j0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22421c.just(paymentResultWrapper);
        }
        C22421c<List<UserPrivilege>> c22421cTake = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.mn70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9132a.m57940H0(paymentResultWrapper, (List) obj);
            }
        };
        return c22421cTake.map(new qcj() { // from class: l.nn70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9132a.m57941I0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static void m57948k0(C9132a c9132a, Bundle bundle) {
        Bundle arguments = c9132a.frag.getArguments();
        c9132a.from = arguments != null ? arguments.getString("from") : null;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m57949l0(C9132a c9132a, String str) {
        c9132a.m57973R0(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m57950m0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m57951n0(C9132a c9132a, int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(c9132a.clickedItem) && NullChecker.m82486a(c9132a.m57963C0())) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(c9132a.m57963C0().f21210id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM116503Pa.pictures.get(0).url;
            if (intent != null) {
                intExtra = intent.getIntExtra(CoreMemberModule.m37004F().m187693b().mo36988bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36990ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String stringExtra2 = null;
            if (i == swipeDirection.getValue() && intent != null) {
                stringExtra2 = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36999pc());
            }
            str.getClass();
            c9132a.m57939F0(z, z2, true, i2, str, userM116503Pa, stringExtra2);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m57952o0(C9132a c9132a) {
        c9132a.m57966G0();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m57953p0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m57954q0(C9132a c9132a) {
        c9132a.m57970O0(c9132a.m57963C0());
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m57955r0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m57956s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m57957t0(C9132a c9132a, PaymentResultWrapper paymentResultWrapper) {
        c9132a.m57966G0();
        ((hp70) c9132a.viewModel).m136504M();
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m57959x0(C9132a c9132a, int i, int i2, Intent intent) {
        return c9132a.m57968L0(i, i2, intent);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m57961z0(C9132a c9132a, vg60 vg60Var) {
        if (vg60Var != null) {
            ((hp70) c9132a.viewModel).m136505O(vg60Var);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final PicksUser m57963C0() {
        PicksUser picksUser = this.clickedUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.m88391r("clickedUser");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final PicksFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final wo70 m57965E0() {
        return this.frag.m57932T4();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m57966G0() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20400k1.m121129H3();
        CoreModule.f18264c.f20400k1.m121123A3();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m57967J0() {
        return this.frag.getIsSingleFrag();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m57968L0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f18273l.m143405a().mo34458Z9()) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.on70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9132a.m57942e0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.pn70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9132a.m57945h0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57951n0(this.f158472a, resultCode, data, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m57969N0(boolean hadSentSuperLiked, @NotNull PicksUser likedUser, @NotNull User user, boolean fromButton) {
        likedUser.getClass();
        user.getClass();
        m57972Q0(likedUser);
        String str = user.picture(0).cover().url;
        str.getClass();
        return m57939F0(true, hadSentSuperLiked, fromButton, 0, str, user, null);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m57970O0(@NotNull PicksUser user) {
        user.getClass();
        if (m57965E0().m207273N(user)) {
            CoreModule.f18264c.f20400k1.m121130I3(user.f21210id);
            if (m57965E0().m207275P() <= 0) {
                ((hp70) this.viewModel).m136502K(false, m57965E0().m207275P() <= 0);
                ((hp70) this.viewModel).m136510T(false);
            }
        }
        m57965E0().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m57971P0(@Nullable PicksItemView picksItemView) {
        this.clickedItem = picksItemView;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m57972Q0(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.clickedUser = picksUser;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m57973R0(@Nullable String from) {
        ((hp70) this.viewModel).m136511U(from);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: S */
    public void mo57974S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m57972Q0(clickedUser);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(clickedUser.f21210id);
        if (liked) {
            userM116503Pa.getClass();
            if (m57969N0(false, clickedUser, userM116503Pa, false)) {
                return;
            }
            m57965E0().notifyDataSetChanged();
            return;
        }
        String str = userM116503Pa.picture(0).cover().profileMiddle().formatted();
        str.getClass();
        if (m57939F0(false, false, false, 0, str, userM116503Pa, null)) {
            return;
        }
        m57965E0().notifyDataSetChanged();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m57966G0();
        this.act.registerOnActivityResultListener(new C4468a.a() { // from class: l.ln70
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return C9132a.m57959x0(this.f132746a, i, i2, intent);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.sn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57948k0(this.f169651a, (Bundle) obj);
            }
        }, new x20() { // from class: l.vn70
            @Override // p153l.x20
            public final void call() {
                C9132a.m57952o0(this.f184841a);
            }
        });
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.wn70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9132a.m57955r0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.xn70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9132a.m57953p0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57946i0(this.f200798a, (NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20400k1.m121126E3()).subscribe(psd0.m173596G(new y20() { // from class: l.zn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57961z0(this.f205183a, (vg60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20400k1.m121134s3()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.hn70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57944g0(this.f110707a, (Picks) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18273l.m143410g().mo36025On());
        final Function1 function2 = new Function1() { // from class: l.in70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9132a.m57956s0((PaymentResultWrapper) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.jn70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9132a.m57950m0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.kn70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9132a.m57947j0((PaymentResultWrapper) obj);
            }
        };
        c22421cFilter.switchMap(new qcj() { // from class: l.tn70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C9132a.m57943f0(function3, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.un70
            @Override // p153l.y20
            public final void call(Object obj) {
                C9132a.m57957t0(this.f179704a, (PaymentResultWrapper) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: c */
    public void mo57975c(boolean liked) {
        m57965E0().notifyDataSetChanged();
    }

    @Override // p153l.k3m
    public void destroy() {
        CoreModule.f18264c.f20400k1.m121128G3();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: n */
    public boolean mo57976n() {
        return false;
    }
}
