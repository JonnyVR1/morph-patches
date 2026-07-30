package p009l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.p002ui.intl.visitor.IntlVisitorsViewModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.abi;
import l.ark;
import l.d30;
import l.e30;
import l.e51;
import l.g30;
import l.j760;
import l.jq2;
import l.mb90;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.rxg0;
import l.swh0;
import l.u59;
import l.vwb;
import l.w9j;
import l.xma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010!R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010)\"\u0004\b.\u0010!¨\u00060"}, d2 = {"Ll/eop;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "N0", "()V", "", "liked", "superLiked", "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "L0", "(ZZZLcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "I0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "U0", "(IILandroid/content/Intent;)Z", "isFirst", "R0", "(Z)V", "destroy", "", "from", "V0", "(Ljava/lang/String;)V", "a", "getHasPrivilege", "()Z", "setHasPrivilege", "hasPrivilege", "b", "J0", "setCouldLoadMore", "couldLoadMore", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class eop extends jq2<IntlVisitorsViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean couldLoadMore;

    public eop(@Nullable mcr mcrVar) {
        super(mcrVar);
        boolean z = false;
        if (!CoreModule.c.p0.g3() ? !xma.e4() : !xma.h4()) {
            z = true;
        }
        this.hasPrivilege = z;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m14014A0() {
        CoreModule.c.E1.q3();
        CoreModule.c.E1.G3();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m14015C0(eop eopVar, PaymentResultWrapper paymentResultWrapper) {
        boolean z = false;
        if (!CoreModule.c.p0.g3() ? !xma.e4() : !xma.h4()) {
            z = true;
        }
        eopVar.hasPrivilege = z;
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m8297E(z);
        }
        e51.H(eopVar.act(), new Runnable() { // from class: l.qnp
            @Override // java.lang.Runnable
            public final void run() {
                eop.m14024Q0();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m14016D0(eop eopVar, UserPrivilege userPrivilege) {
        if (xma.L3()) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m8298G();
                return;
            }
            return;
        }
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m8303m();
        }
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m8297E(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m14017E0(C0158d c0158d, eop eopVar, boolean z, User user) {
        c0158d.m2459p();
        eopVar.m14046I0(true, true, z, c0158d, user);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m14018F0(eop eopVar, UserPrivilege userPrivilege) {
        if (!xma.h4()) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m8298G();
                return;
            }
            return;
        }
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m8303m();
        }
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m8297E(false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static void m14020H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    private final void m14021N0() {
        m14049R0(true);
    }

    /* JADX INFO: renamed from: P0 */
    public static final PaymentResultWrapper m14023P0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m14024Q0() {
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m14025S0(eop eopVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eopVar.m14049R0(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m14026e0(C0158d c0158d, boolean z, eop eopVar, boolean z2, User user, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.m637B(c0158d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2 && z) {
                rxg0.L(eopVar.act());
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
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null || !userP9.isFemale()) {
            Act act = eopVar.act();
            if (act != null) {
                act.startActivityWithCustomTransition(MatchAct.e2(eopVar.act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
                return;
            }
            return;
        }
        Act act2 = eopVar.act();
        if (act2 != null) {
            abi.J(act2, user);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m14027f0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m14028g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m14030i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m14031j0(eop eopVar, Bundle bundle) {
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m8307r();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static c m14032k0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m14033l0(com.p1.mobile.android.app.c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == com.p1.mobile.android.app.c.i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m14034m0(C0158d c0158d, Throwable th) {
        HomeStatisticsHelper.m636A(c0158d, th);
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m14035n0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: o0 */
    public static void m14036o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m14037p0(Intent intent, int i, eop eopVar, com.p1.mobile.android.app.c cVar) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userPa = CoreModule.c.e0.Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (eopVar.act() != null) {
            userPa.getClass();
            eopVar.m14048L0(z, z2, true, userPa);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m14038q0(eop eopVar, NetworkInfo networkInfo) {
        if (CoreModule.c.E1.r3()) {
            return;
        }
        eopVar.m14021N0();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m14039r0(eop eopVar, j760 j760Var) {
        Boolean bool;
        if (!NullChecker.a(j760Var)) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m8299H(null, eopVar.hasPrivilege);
                return;
            }
            return;
        }
        eopVar.couldLoadMore = (j760Var == null || (bool = (Boolean) j760Var.b) == null) ? true : bool.booleanValue();
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m8299H(j760Var != null ? (List) j760Var.a : null, eopVar.hasPrivilege);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m14040s0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static void m14041t0(boolean z, eop eopVar, Throwable th) {
        IntlVisitorsViewModel intlVisitorsViewModel;
        if (!z || (intlVisitorsViewModel = (IntlVisitorsViewModel) ((jq2) eopVar).viewModel) == null) {
            return;
        }
        intlVisitorsViewModel.m8299H(CollectionsKt.emptyList(), eopVar.hasPrivilege);
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m14043x0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static c m14044y0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return c.just(paymentResultWrapper);
        }
        c cVarTake = CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.snp
            public final Object invoke(Object obj) {
                return eop.m14022O0(paymentResultWrapper, (List) obj);
            }
        };
        return cVarTake.map(new w9j() { // from class: l.tnp
            public final Object call(Object obj) {
                return eop.m14023P0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m14045z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m14046I0(final boolean liked, final boolean superLiked, boolean fromButton, final C0158d swipeScData, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f1757h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(((DbObject) user).id).pageId(swipeScData.m2451h()).build();
        duringCreated(CoreModule.c.m0.Y7(liked, superLiked, (Map) null, user, (String) null, LikeFrom.get("intl_visitor"), true, likeExtraDataNew_, 0, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.unp
            public final void call(Object obj) {
                eop.m14026e0(swipeScData, superLiked, this, liked, user, (Relationship) obj);
            }
        }, new e30() { // from class: l.vnp
            public final void call(Object obj) {
                eop.m14034m0(swipeScData, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getCouldLoadMore() {
        return this.couldLoadMore;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m14048L0(boolean liked, boolean superLiked, final boolean fromButton, final User user) {
        Act act = act();
        final C0158d c0158dM648e = HomeStatisticsHelper.m648e(act != null ? act.pageId() : null, fromButton, liked, superLiked, user);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            c0158dM648e.f1757h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
            Counter counterO3 = CoreModule.c.o3();
            CounterLikeLimit counterLikeLimit = counterO3 != null ? counterO3.likeLimit : null;
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                HomeStatisticsHelper.m637B(c0158dM648e, "failJailedUser");
                return;
            }
            if (userP9.isNameFake()) {
                HomeStatisticsHelper.m637B(c0158dM648e, "failFakeUser");
                ark.T0(act());
                return;
            }
            if (!xma.L3()) {
                rmp.m21747p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                rmp.m21747p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (!superLiked || swh0.x0() > 0) {
                if (superLiked && swh0.G1(act(), new d30() { // from class: l.rnp
                    public final void call() {
                        eop.m14017E0(c0158dM648e, this, fromButton, user);
                    }
                })) {
                    return;
                }
                m14046I0(liked, superLiked, fromButton, c0158dM648e, user);
                return;
            }
            if (!xma.L3() && !u59.a0()) {
                rmp.m21747p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
            } else {
                com.p1.mobile.putong.core.ui.purchase.c.H1(act(), fromButton ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like", 0, (g30) null, 12, (Object) null);
                HomeStatisticsHelper.m637B(c0158dM648e, "failExhaustSuperlike");
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m14049R0(final boolean isFirst) {
        duringCreated(CoreModule.c.E1.C3()).subscribe(mkd0.H(new e30() { // from class: l.xnp
            public final void call(Object obj) {
                eop.m14027f0((roj0) obj);
            }
        }, new e30() { // from class: l.ynp
            public final void call(Object obj) {
                eop.m14041t0(isFirst, this, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m14050U0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 18) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.dnp
            public final Object invoke(Object obj) {
                return eop.m14033l0((com.p1.mobile.android.app.c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.onp
            public final Object call(Object obj) {
                return eop.m14045z0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wnp
            public final void call(Object obj) {
                eop.m14037p0(data, resultCode, this, (com.p1.mobile.android.app.c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m14051V0(@NotNull String from) {
        from.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        CoreModule.P().g().zr(act, from);
    }

    /* JADX INFO: renamed from: Z */
    public void m14052Z() {
        super.Z();
        boolean z = false;
        if (!CoreModule.c.p0.g3() ? !xma.e4() : !xma.h4()) {
            z = true;
        }
        this.hasPrivilege = z;
        m14021N0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m14053a0() {
        creates(new e30() { // from class: l.znp
            public final void call(Object obj) {
                eop.m14031j0(this.f23759a, (Bundle) obj);
            }
        }, new d30() { // from class: l.gnp
            public final void call() {
                eop.m14014A0();
            }
        });
        c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.hnp
            public final Object invoke(Object obj) {
                return eop.m14035n0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.inp
            public final Object call(Object obj) {
                return eop.m14043x0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.jnp
            public final void call(Object obj) {
                eop.m14038q0(this.f15242a, (NetworkInfo) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(CoreModule.P().g().On());
        final Function1 function2 = new Function1() { // from class: l.knp
            public final Object invoke(Object obj) {
                return eop.m14030i0((PaymentResultWrapper) obj);
            }
        };
        c cVarFilter = cVarDuringCreated.filter(new w9j() { // from class: l.lnp
            public final Object call(Object obj) {
                return eop.m14028g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.mnp
            public final Object invoke(Object obj) {
                return eop.m14044y0((PaymentResultWrapper) obj);
            }
        };
        cVarFilter.switchMap(new w9j() { // from class: l.nnp
            public final Object call(Object obj) {
                return eop.m14032k0(function3, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pnp
            public final void call(Object obj) {
                eop.m14015C0(this.f18796a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.c.E1.I3()).subscribe(mkd0.H(new e30() { // from class: l.aop
            public final void call(Object obj) {
                eop.m14039r0(this.f9591a, (j760) obj);
            }
        }, new e30() { // from class: l.bop
            public final void call(Object obj) {
                eop.m14020H0((Throwable) obj);
            }
        }));
        if (CoreModule.c.p0.g3()) {
            duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("seeWhoLikedMe"))).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.cop
                public final void call(Object obj) {
                    eop.m14018F0(this.f10716a, (UserPrivilege) obj);
                }
            }, new e30() { // from class: l.dop
                public final void call(Object obj) {
                    eop.m14036o0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.enp
                public final void call(Object obj) {
                    eop.m14016D0(this.f12627a, (UserPrivilege) obj);
                }
            }, new e30() { // from class: l.fnp
                public final void call(Object obj) {
                    eop.m14040s0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: O0 */
    public static final PaymentResultWrapper m14022O0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
