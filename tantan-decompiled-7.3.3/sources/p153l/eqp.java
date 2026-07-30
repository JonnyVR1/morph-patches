package p153l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsViewModel;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010!R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010)\"\u0004\b.\u0010!¨\u00060"}, m88121d2 = {"Ll/eqp;", "Ll/ar2;", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "N0", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "L0", "(ZZZLcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "I0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "U0", "(IILandroid/content/Intent;)Z", "isFirst", "R0", "(Z)V", "destroy", "", "from", "V0", "(Ljava/lang/String;)V", "a", "getHasPrivilege", "()Z", "setHasPrivilege", "hasPrivilege", "b", "J0", "setCouldLoadMore", "couldLoadMore", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class eqp extends ar2<IntlVisitorsViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean couldLoadMore;

    public eqp(@Nullable ner nerVar) {
        super(nerVar);
        boolean z = false;
        if (!CoreModule.f18264c.f20414p0.m219062g3() ? !joa.m146386f4() : !joa.m146392i4()) {
            z = true;
        }
        this.hasPrivilege = z;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m121990A0() {
        CoreModule.f18264c.f20304E1.m109154q3();
        CoreModule.f18264c.f20304E1.m109151G3();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m121991C0(eqp eqpVar, PaymentResultWrapper paymentResultWrapper) {
        boolean z = false;
        if (!CoreModule.f18264c.f20414p0.m219062g3() ? !joa.m146386f4() : !joa.m146392i4()) {
            z = true;
        }
        eqpVar.hasPrivilege = z;
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m47395E(z);
        }
        l51.m152888H(eqpVar.act(), new Runnable() { // from class: l.qpp
            @Override // java.lang.Runnable
            public final void run() {
                eqp.m122000Q0();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m121992D0(eqp eqpVar, UserPrivilege userPrivilege) {
        if (joa.m146361M3()) {
            eqpVar.hasPrivilege = true;
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m47396G();
            }
            IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eqpVar.viewModel;
            if (intlVisitorsViewModel2 != null) {
                intlVisitorsViewModel2.m47395E(true);
                return;
            }
            return;
        }
        eqpVar.hasPrivilege = false;
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m47400m();
        }
        IntlVisitorsViewModel intlVisitorsViewModel4 = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel4 != null) {
            intlVisitorsViewModel4.m47395E(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m121993E0(C8145d c8145d, eqp eqpVar, boolean z, User user) {
        c8145d.m39484p();
        eqpVar.m122022I0(true, true, z, c8145d, user);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m121994F0(eqp eqpVar, UserPrivilege userPrivilege) {
        if (joa.m146392i4()) {
            eqpVar.hasPrivilege = false;
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m47400m();
            }
            IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eqpVar.viewModel;
            if (intlVisitorsViewModel2 != null) {
                intlVisitorsViewModel2.m47395E(false);
                return;
            }
            return;
        }
        eqpVar.hasPrivilege = true;
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m47396G();
        }
        IntlVisitorsViewModel intlVisitorsViewModel4 = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel4 != null) {
            intlVisitorsViewModel4.m47395E(true);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static void m121996H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    private final void m121997N0() {
        m122025R0(true);
    }

    /* JADX INFO: renamed from: P0 */
    public static final PaymentResultWrapper m121999P0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m122000Q0() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m122001S0(eqp eqpVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eqpVar.m122025R0(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m122002e0(C8145d c8145d, boolean z, eqp eqpVar, boolean z2, User user, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2 && z) {
                z5h0.m218665L(eqpVar.act());
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
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || !userM116600p9.isFemale()) {
            Act act = eqpVar.act();
            if (act != null) {
                act.startActivityWithCustomTransition(MatchAct.m48746g2(eqpVar.act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
                return;
            }
            return;
        }
        Act act2 = eqpVar.act();
        if (act2 != null) {
            pci.m171661J(act2, user);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m122003f0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m122004g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m122006i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m122007j0(eqp eqpVar, Bundle bundle) {
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m47404r();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static C22421c m122008k0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m122009l0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m122010m0(C8145d c8145d, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m122011n0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: o0 */
    public static void m122012o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m122013p0(Intent intent, int i, eqp eqpVar, C4470c c4470c) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (eqpVar.act() != null) {
            userM116503Pa.getClass();
            eqpVar.m122024L0(z, z2, true, userM116503Pa);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m122014q0(eqp eqpVar, NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20304E1.m109155r3()) {
            return;
        }
        eqpVar.m121997N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static void m122015r0(eqp eqpVar, pf60 pf60Var) {
        Boolean bool;
        if (!NullChecker.m82486a(pf60Var)) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m47397H(null, eqpVar.hasPrivilege);
                return;
            }
            return;
        }
        eqpVar.couldLoadMore = (pf60Var == null || (bool = (Boolean) pf60Var.f152157b) == null) ? true : bool.booleanValue();
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eqpVar.viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m47397H(pf60Var != null ? (List) pf60Var.f152156a : null, eqpVar.hasPrivilege);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m122016s0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static void m122017t0(boolean z, eqp eqpVar, Throwable th) {
        IntlVisitorsViewModel intlVisitorsViewModel;
        if (!z || (intlVisitorsViewModel = (IntlVisitorsViewModel) eqpVar.viewModel) == null) {
            return;
        }
        intlVisitorsViewModel.m47397H(CollectionsKt.emptyList(), eqpVar.hasPrivilege);
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m122019x0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static C22421c m122020y0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22421c.just(paymentResultWrapper);
        }
        C22421c<List<UserPrivilege>> c22421cTake = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.spp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eqp.m121998O0(paymentResultWrapper, (List) obj);
            }
        };
        return c22421cTake.map(new qcj() { // from class: l.tpp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqp.m121999P0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m122021z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m122022I0(final boolean liked, final boolean superLiked, boolean fromButton, final C8145d swipeScData, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f23721h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(user.f56859id).pageId(swipeScData.m39476h()).build();
        duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(liked, superLiked, null, user, null, LikeFrom.get(LikeFrom.intl_visitor), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173597H(new y20() { // from class: l.upp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122002e0(swipeScData, superLiked, this, liked, user, (Relationship) obj);
            }
        }, new y20() { // from class: l.vpp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122010m0(swipeScData, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getCouldLoadMore() {
        return this.couldLoadMore;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m122024L0(boolean liked, boolean superLiked, final boolean fromButton, final User user) {
        Act act = act();
        final C8145d c8145dM37702e = HomeStatisticsHelper.m37702e(act != null ? act.pageId() : null, fromButton, liked, superLiked, user);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            c8145dM37702e.f23721h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
            Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
            CounterLikeLimit counterLikeLimit = counterM32487o3 != null ? counterM32487o3.likeLimit : null;
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                HomeStatisticsHelper.m37691B(c8145dM37702e, "failJailedUser");
                return;
            }
            if (userM116600p9.isNameFake()) {
                HomeStatisticsHelper.m37691B(c8145dM37702e, "failFakeUser");
                qtk.m177999T0(act());
                return;
            }
            if (!joa.m146361M3()) {
                rop.m182428p(rop.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                rop.m182428p(rop.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (!superLiked || a5i0.m96181x0() > 0) {
                if (superLiked && a5i0.m96098G1(act(), new x20() { // from class: l.rpp
                    @Override // p153l.x20
                    public final void call() {
                        eqp.m121993E0(c8145dM37702e, this, fromButton, user);
                    }
                })) {
                    return;
                }
                m122022I0(liked, superLiked, fromButton, c8145dM37702e, user);
                return;
            }
            if (!joa.m146361M3() && !d79.m114669b0()) {
                rop.m182428p(rop.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
            } else {
                C8927c.m54580H1(act(), fromButton ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like", 0, null, 12, null);
                HomeStatisticsHelper.m37691B(c8145dM37702e, "failExhaustSuperlike");
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m122025R0(final boolean isFirst) {
        duringCreated(CoreModule.f18264c.f20304E1.m109147C3()).subscribe(psd0.m173597H(new y20() { // from class: l.xpp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122003f0((uxj0) obj);
            }
        }, new y20() { // from class: l.ypp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122017t0(isFirst, this, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m122026U0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 18) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.dpp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eqp.m122009l0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.opp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqp.m122021z0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wpp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122013p0(data, resultCode, this, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m122027V0(@NotNull String from) {
        from.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        CoreModule.m30933P().m143410g().mo36092zr(act, from);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        boolean z = false;
        if (!CoreModule.f18264c.f20414p0.m219062g3() ? !joa.m146386f4() : !joa.m146392i4()) {
            z = true;
        }
        this.hasPrivilege = z;
        m121997N0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zpp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122007j0(this.f205514a, (Bundle) obj);
            }
        }, new x20() { // from class: l.gpp
            @Override // p153l.x20
            public final void call() {
                eqp.m121990A0();
            }
        });
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.hpp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eqp.m122011n0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.ipp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqp.m122019x0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jpp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122014q0(this.f122126a, (NetworkInfo) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.m30933P().m143410g().mo36025On());
        final Function1 function2 = new Function1() { // from class: l.kpp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eqp.m122006i0((PaymentResultWrapper) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.lpp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqp.m122004g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.mpp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eqp.m122020y0((PaymentResultWrapper) obj);
            }
        };
        c22421cFilter.switchMap(new qcj() { // from class: l.npp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eqp.m122008k0(function3, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ppp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m121991C0(this.f153574a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20304E1.m109153I3()).subscribe(psd0.m173597H(new y20() { // from class: l.aqp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m122015r0(this.f72827a, (pf60) obj);
            }
        }, new y20() { // from class: l.bqp
            @Override // p153l.y20
            public final void call(Object obj) {
                eqp.m121996H0((Throwable) obj);
            }
        }));
        if (CoreModule.f18264c.f20414p0.m219062g3()) {
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("seeWhoLikedMe"))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.cqp
                @Override // p153l.y20
                public final void call(Object obj) {
                    eqp.m121994F0(this.f83108a, (UserPrivilege) obj);
                }
            }, new y20() { // from class: l.dqp
                @Override // p153l.y20
                public final void call(Object obj) {
                    eqp.m122012o0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.epp
                @Override // p153l.y20
                public final void call(Object obj) {
                    eqp.m121992D0(this.f95261a, (UserPrivilege) obj);
                }
            }, new y20() { // from class: l.fpp
                @Override // p153l.y20
                public final void call(Object obj) {
                    eqp.m122016s0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: O0 */
    public static final PaymentResultWrapper m121998O0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
